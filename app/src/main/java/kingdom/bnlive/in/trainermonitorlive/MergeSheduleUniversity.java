package kingdom.bnlive.in.trainermonitorlive;

/**
 * Created by Sk Faisal on 3/26/2018.
 */

public class MergeSheduleUniversity {
    private String batchCode;
    private String status;
    private String trainer_name;
    private String trainer_contact;
    UniversityDetailsModel university;

    public MergeSheduleUniversity() {
    }

    public MergeSheduleUniversity(String batchCode, String status, UniversityDetailsModel university) {
        this.batchCode = batchCode;
        this.status = status;
        this.university = university;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UniversityDetailsModel getUniversity() {
        return university;
    }

    public void setUniversity(UniversityDetailsModel university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "MergeSheduleUniversity{" +
                "batchCode='" + batchCode + '\'' +
                ", status='" + status + '\'' +
                ", university=" + university +
                '}';
    }
}
