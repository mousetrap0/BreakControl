package co.kr.airport.nwbreak.dao;

import java.util.List;
import co.kr.airport.bbs.domain.Bbs;
import co.kr.airport.bbs.dto.param.BbsCountParam;
import co.kr.airport.bbs.dto.param.BbsListParam;
import co.kr.airport.bbs.dto.param.CreateBbsAnswerParam;
import co.kr.airport.bbs.dto.param.CreateBbsParam;
import co.kr.airport.bbs.dto.param.CreateReadCountParam;
import co.kr.airport.bbs.dto.param.UpdateBbsParam;
import co.kr.airport.nwbreak.domain.NwBreak;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface NwBreakDao {

	List<NwBreak> getBbsSearchPageList(BbsListParam param);
	Integer getBbsCount(BbsCountParam param);

	NwBreak getBreak(Integer seq);
	Integer createBbsReadCountHistory(CreateReadCountParam param);
	Integer increaseBbsReadCount(Integer seq);

	void createBbs(CreateBbsParam param);

	Integer updateNwBreakStep(Integer parentSeq);
	Integer getBbsAnswerCount(Integer parentSeq);
	void createBbsAnswer(CreateBbsAnswerParam param);

	Integer updateBbs(UpdateBbsParam param);

	Integer deleteBbs(Integer seq);
}
