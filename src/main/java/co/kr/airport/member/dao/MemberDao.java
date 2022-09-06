package co.kr.airport.member.dao;

import co.kr.airport.member.domain.Member;
import co.kr.airport.member.dto.param.CreateMemberParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberDao {

	Member findById(String id);

	Integer isExistUserId(String id);

	Integer createMember(CreateMemberParam param);
}
