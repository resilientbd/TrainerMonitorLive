package kingdom.bnlive.in.trainermonitorlive;

/**
 * Created by Sk Faisal on 3/25/2018.
 */

public class BatchStatusModel {
    private String id;
 private String batch_code;
    private String  day;
    private String  end;
    private String start;
    private String status;
    private String trainer_name;
    private String university_name;
    private String date;
    public BatchStatusModel() {
    }

    public BatchStatusModel(String batch_code, String day, String end, String start, String status, String trainer_name, String university_name, String date) {
        this.batch_code = batch_code;
        this.day = day;
        this.end = end;
        this.start = start;
        this.status = status;
        this.trainer_name = trainer_name;
        this.university_name = university_name;
        this.date = date;
    }

    public String getBatch_code() {
        return batch_code;
    }

    public void setBatch_code(String batch_code) {
        this.batch_code = batch_code;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BatchStatusModel{" +
                "id='" + id + '\'' +
                ", batch_code='" + batch_code + '\'' +
                ", day='" + day + '\'' +
                ", end='" + end + '\'' +
                ", start='" + start + '\'' +
                ", status='" + status + '\'' +
                ", trainer_name='" + trainer_name + '\'' +
                ", university_name='" + university_name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
