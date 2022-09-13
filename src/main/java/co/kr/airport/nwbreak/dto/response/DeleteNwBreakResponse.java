package co.kr.airport.nwbreak.dto.response;

public class DeleteNwBreakResponse {

    private Integer deletedRecordCount;

    public DeleteNwBreakResponse(Integer deletedRecordCount) {
        this.deletedRecordCount = deletedRecordCount;
    }

    public Integer getDeletedRecordCount() {
        return deletedRecordCount;
    }

    public void setDeletedRecordCount(Integer deletedRecordCount) {
        this.deletedRecordCount = deletedRecordCount;
    }
}
