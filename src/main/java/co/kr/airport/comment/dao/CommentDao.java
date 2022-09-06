package co.kr.airport.comment.dao;

import java.util.List;
import co.kr.airport.comment.domain.Comment;
import co.kr.airport.comment.dto.param.CommentListParam;
import co.kr.airport.comment.dto.param.CreateCommentParam;
import co.kr.airport.comment.dto.param.UpdateCommentParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CommentDao {

    List<Comment> getCommentPageList(CommentListParam param);
    Integer getCommentCount(Integer seq);

    void createComment(CreateCommentParam param);
    Integer deleteComment(Integer seq);

    Comment getCommentBySeq(Integer seq);
    Integer updateComment(UpdateCommentParam param);
}
