package co.kr.airport.line.dao;

import java.util.List;
import co.kr.airport.line.domain.Line;
import co.kr.airport.line.dto.param.LineCountParam;
import co.kr.airport.line.dto.param.LineListParam;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface LineDao {

	List<Line> getLineSearchPageList(LineListParam param);
	Integer getLineCount(LineCountParam param);

	Line getLine(Integer seq);
	
}
