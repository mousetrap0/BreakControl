package co.kr.airport.nwbreak.controller;

import java.util.Date;
import co.kr.airport.bbs.dto.request.BbsListRequest;
import co.kr.airport.bbs.dto.request.CreateBbsRequest;
import co.kr.airport.bbs.dto.request.UpdateBbsRequest;
import co.kr.airport.bbs.dto.response.BbsListResponse;
import co.kr.airport.bbs.dto.response.BbsResponse;
import co.kr.airport.bbs.dto.response.CreateBbsResponse;
import co.kr.airport.bbs.dto.response.DeleteBbsResponse;
import co.kr.airport.bbs.dto.response.UpdateBbsResponse;
import co.kr.airport.nwbreak.service.BreakService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/nwbreak")
public class BreakController{

	private final BreakService service;

	public BreakController(BreakService service) {
		this.service = service;
	}

	/* [GET /bbs?choice={choice}&search={search}&page={page}] 게시글 목록 API */
	@GetMapping
	public ResponseEntity<BbsListResponse> getBbsList(@ModelAttribute BbsListRequest req){
		System.out.println("BbsController getBbsList() " + new Date());

		return ResponseEntity.ok(service.getBbsList(req));
	}

	/* [GET /bbs/{seq}?readerId={id}] 게시글 상세 API */
	@GetMapping("/{seq}")
	public ResponseEntity<BbsResponse> getBbs(@PathVariable  Integer seq, @RequestParam String readerId) {
		System.out.println("BbsController getBbs() " + new Date());

		return ResponseEntity.ok(service.getBbs(seq, readerId));
	}

	/* [POST] /bbs 게시글 작성 */
	@PostMapping
	public ResponseEntity<CreateBbsResponse> createBbs(@RequestBody CreateBbsRequest req) {
		System.out.println("BbsController createBbs " + new Date());

		return ResponseEntity.ok(service.createBbs(req));
	}

	/* [POST] /bbs/{parentSeq}/answer 게시글 답글 작성  */
	@PostMapping("/{parentSeq}/answer")
	public ResponseEntity<CreateBbsResponse> createBbsAnswer(@PathVariable Integer parentSeq, @RequestBody CreateBbsRequest req) {
		System.out.println("BbsController createBbsAnswer " + new Date());

		return ResponseEntity.ok(service.createBbsAnswer(parentSeq, req));
	}

	/* [PATCH] /bbs/{seq} 게시글 수정  */
	// TODO - 수정하는 사람 ID 확인
	@PatchMapping("/{seq}")
	public ResponseEntity<UpdateBbsResponse> updateBbs(@PathVariable Integer seq, @RequestBody UpdateBbsRequest req) {
		System.out.println("BbsController updateBbs " + new Date());

		return ResponseEntity.ok(service.updateBbs(seq, req));
	}

	/* [DELETE] /bbs/{seq} 게시글 삭제  */
	@DeleteMapping("/{seq}")
	public ResponseEntity<DeleteBbsResponse> deleteBbs(@PathVariable Integer seq) {
		System.out.println("BbsController deleteBbs " + new Date());

		return ResponseEntity.ok(service.deleteBbs(seq));
	}
}








