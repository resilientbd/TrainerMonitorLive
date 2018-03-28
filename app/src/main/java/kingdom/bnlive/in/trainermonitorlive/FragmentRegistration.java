package kingdom.bnlive.in.trainermonitorlive;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sk Faisal on 3/25/2018.
 */

public class FragmentRegistration extends Fragment {
    View view;
    FirebaseAuth mAuth;
    String TAG="fragmentregistration";
    Context context;
    FirebaseFirestore db;
    EditText emailText;
    EditText passwordText;
    TextView repasswordText;
    TextView name;
    RadioButton userBtn;
    RadioButton adminBtn;
    String collectionName="user_manage";
    Button registrationButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_registration,container,false);
        mAuth=FirebaseAuth.getInstance();
        context=getActivity().getBaseContext();
        db=FirebaseFirestore.getInstance();
        emailText=view.findViewById(R.id.r_email);
        passwordText=view.findViewById(R.id.r_password);
        repasswordText=view.findViewById(R.id.r_repassword);
        userBtn=view.findViewById(R.id.rtrainer);
        adminBtn=view.findViewById(R.id.radmin);
        name=view.findViewById(R.id.editText);

        registrationButton=view.findViewById(R.id.r_registerbtn);
        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nametext=name.getText().toString();
                String email=emailText.getText().toString();
                String password=passwordText.getText().toString();
                String role="";
                if(userBtn.isSelected()==true)
                    role="trainer";
                else role="admin";
                registration(nametext,email,password,role);
            }
        });

        return view;
    }

    public void registration(final String name,final String email, String password, final String role)
    {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                        insertUser(name,collectionName,email,role);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(context, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }
    public void insertUser(String name,String collection,String email,String role)
    {
        Map<String,String> map=new HashMap<>();
        map.put("name",name);
        map.put("email",email);
        map.put("role",role);
      db.collection(collection)
              .add(map)
              .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                  @Override
                  public void onSuccess(DocumentReference documentReference) {
                      Log.d(TAG,"data inserted successfully!");
                      clearAll();
                  }
              })
              .addOnFailureListener(new OnFailureListener() {
                  @Override
                  public void onFailure(@NonNull Exception e) {
                      Log.d(TAG,"data insertion failed! Error: "+e);
                  }
              });
    }
    public void clearAll()
    {
        emailText.setText("");
        passwordText.setText("");
        repasswordText.setText("");
        userBtn.setChecked(true);
    }
}
