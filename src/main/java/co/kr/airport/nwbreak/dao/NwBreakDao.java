package co.kr.airport.nwbreak.dao;

import java.util.List;

import co.kr.airport.nwbreak.domain.Chart;
import co.kr.airport.nwbreak.domain.NwBreak;
import co.kr.airport.nwbreak.dto.param.ChartParam;
import co.kr.airport.nwbreak.dto.param.CreateNwBreakAnswerParam;
import co.kr.airport.nwbreak.dto.param.CreateNwBreakParam;
import co.kr.airport.nwbreak.dto.param.CreateReadCountParam;
import co.kr.airport.nwbreak.dto.param.NwBreakCountParam;
import co.kr.airport.nwbreak.dto.param.NwBreakListParam;
import co.kr.airport.nwbreak.dto.param.UpdateNwBreakParam;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface NwBreakDao {

	List<NwBreak> getNwBreakSearchPageList(NwBreakListParam param);
	Integer getNwBreakCount(NwBreakCountParam param);

	NwBreak getNwBreak(Integer breakID);
	Integer createNwBreakReadCountHistory(CreateReadCountParam param);
	Integer increaseNwBreakReadCount(Integer breakId);

	void createNwBreak(CreateNwBreakParam param);

	Integer updateNwBreakStep(Integer parentBreakId);
	Integer getNwBreakAnswerCount(Integer parentBreakId);
	void createNwBreakAnswer(CreateNwBreakAnswerParam param);

	Integer updateNwBreak(UpdateNwBreakParam param);

	Integer deleteNwBreak(Integer breakId);
	
	List<Chart> getChart(ChartParam param);
}
