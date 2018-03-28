package kingdom.bnlive.in.trainermonitorlive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sk Faisal on 3/27/2018.
 */

public class BlankFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Intent intent=new Intent(getActivity().getBaseContext(), RegistrationLogin.class);
//        startActivity(intent);
        getActivity().finish();
        View view=inflater.inflate(R.layout.fragment_login,container,false);
        return view;
    }
}
