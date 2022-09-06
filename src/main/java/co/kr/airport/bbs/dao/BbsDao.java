package co.kr.airport.bbs.dao;

import java.util.List;
import co.kr.airport.bbs.domain.Bbs;
import co.kr.airport.bbs.dto.param.BbsCountParam;
import co.kr.airport.bbs.dto.param.BbsListParam;
import co.kr.airport.bbs.dto.param.CreateBbsAnswerParam;
import co.kr.airport.bbs.dto.param.CreateBbsParam;
import co.kr.airport.bbs.dto.param.CreateReadCountParam;
import co.kr.airport.bbs.dto.param.UpdateBbsParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface BbsDao {

	List<Bbs> getBbsSearchPageList(BbsListParam param);
	Integer getBbsCount(BbsCountParam param);

	Bbs getBbs(Integer seq);
	Integer createBbsReadCountHistory(CreateReadCountParam param);
	Integer increaseBbsReadCount(Integer seq);

	void createBbs(CreateBbsParam param);

	Integer updateBbsStep(Integer parentSeq);
	Integer getBbsAnswerCount(Integer parentSeq);
	void createBbsAnswer(CreateBbsAnswerParam param);

	Integer updateBbs(UpdateBbsParam param);

	Integer deleteBbs(Integer seq);
}
