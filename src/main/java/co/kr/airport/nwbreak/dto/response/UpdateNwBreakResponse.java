package co.kr.airport.nwbreak.dto.response;

public class UpdateNwBreakResponse {

    private Integer updatedRecordCount;

    public UpdateNwBreakResponse(Integer updatedRecordCount) {
        this.updatedRecordCount = updatedRecordCount;
    }

    public Integer getUpdatedRecordCount() {
        return updatedRecordCount;
    }

    public void setUpdatedRecordCount(Integer updatedRecordCount) {
        this.updatedRecordCount = updatedRecordCount;
    }
}
