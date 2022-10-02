package co.kr.airport.nwbreak.controller;

import java.util.Date;

import co.kr.airport.nwbreak.dto.request.CreateNwBreakRequest;
import co.kr.airport.nwbreak.dto.request.NwBreakListRequest;
import co.kr.airport.nwbreak.dto.request.UpdateNwBreakRequest;
import co.kr.airport.nwbreak.dto.response.ChartResponse;
import co.kr.airport.nwbreak.dto.response.CreateNwBreakResponse;
import co.kr.airport.nwbreak.dto.response.DeleteNwBreakResponse;
import co.kr.airport.nwbreak.dto.response.NwBreakListResponse;
import co.kr.airport.nwbreak.dto.response.NwBreakResponse;
import co.kr.airport.nwbreak.dto.response.UpdateNwBreakResponse;
import co.kr.airport.nwbreak.service.NwBreakService;

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

	private final NwBreakService service;

	public BreakController(NwBreakService service) {
		this.service = service;
	}

	/* [GET /nwbreak?choice={choice}&search={search}&page={page}] 게시글 목록 API */
	@GetMapping
	public ResponseEntity<NwBreakListResponse> getNwBreakList(@ModelAttribute NwBreakListRequest req){
		System.out.println("BreakController getNwBreakList() " + new Date());

		return ResponseEntity.ok(service.getNwBreakList(req));
	}

	/* [GET /NwBreak/{seq}?readerId={id}] 게시글 상세 API */
	@GetMapping("/{breakId}")
	public ResponseEntity<NwBreakResponse> getNwBreak(@PathVariable  Integer breakId, @RequestParam String readerId) {
		System.out.println("BreakController getNwBreak() " + new Date());

		return ResponseEntity.ok(service.getNwBreak(breakId, readerId));
	}

	/* [POST] /NwBreak 게시글 작성 */
	@PostMapping
	public ResponseEntity<CreateNwBreakResponse> createNwBreak(@RequestBody CreateNwBreakRequest req) {
		System.out.println("BreakController createNwBreak " + new Date());

		return ResponseEntity.ok(service.createNwBreak(req));
	}

	/* [POST] /NwBreak/{parentSeq}/answer 게시글 답글 작성  */
	@PostMapping("/{parentBreakId}/answer")
	public ResponseEntity<CreateNwBreakResponse> createNwBreakAnswer(@PathVariable Integer parentBreakId, @RequestBody CreateNwBreakRequest req) {
		System.out.println("BreakController createNwBreakAnswer " + new Date());

		return ResponseEntity.ok(service.createNwBreakAnswer(parentBreakId, req));
	}

	/* [PATCH] /NwBreak/{seq} 게시글 수정  */
	// TODO - 수정하는 사람 ID 확인
	@PatchMapping("/{breakId}")
	public ResponseEntity<UpdateNwBreakResponse> updateNwBreak(@PathVariable Integer breakId, @RequestBody UpdateNwBreakRequest req) {
		System.out.println("BreakController updateNwBreak " + new Date());

		return ResponseEntity.ok(service.updateNwBreak(breakId, req));
	}

	/* [DELETE] /NwBreak/{seq} 게시글 삭제  */
	@DeleteMapping("/{breakId}")
	public ResponseEntity<DeleteNwBreakResponse> deleteNwBreak(@PathVariable Integer breakId) {
		System.out.println("BreakController deleteNwBreak " + new Date());

		return ResponseEntity.ok(service.deleteNwBreak(breakId));
	}
	
	/* [GET] /nwBreak/chart?type={type} 게시글 답글 작성  
	 * type : year, quarter, month */
	@GetMapping("/chart")
	public ResponseEntity<ChartResponse> chart(@RequestParam String type) {
		System.out.println("BreakController chart " + new Date());

		return ResponseEntity.ok(service.chart(type));
	}
}








