package dto;

public class UserAddOutputData implements OutputData {
    private String createdId;

    public UserAddOutputData(String createdId) {
        this.createdId = createdId;
    }

    public String getCreatedId() {
        return this.createdId;
    }
}
