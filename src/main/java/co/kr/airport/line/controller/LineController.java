package co.kr.airport.line.controller;

import java.util.Date;
import co.kr.airport.line.dto.request.LineListRequest;
import co.kr.airport.line.dto.response.LineListResponse;
import co.kr.airport.line.dto.response.LineResponse;
import co.kr.airport.line.service.LineService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/line")
public class LineController {

	private final LineService service;

	public LineController(LineService service) {
		this.service = service;
	}

	/* [GET /line?choice={choice}&search={search}&page={page}] 게시글 목록 API */
	@GetMapping
	public ResponseEntity<LineListResponse> getLineList(@ModelAttribute LineListRequest req){
		System.out.println("LineController getLineList() " + new Date());

		return ResponseEntity.ok(service.getLineList(req));
	}

	/* [GET /bbs/{seq}?readerId={id}] 게시글 상세 API */
	@GetMapping("/{lineId}")
	public ResponseEntity<LineResponse> getLine(@PathVariable  Integer seq, @RequestParam String readerId) {
		System.out.println("LineController getLine() " + new Date());

		return ResponseEntity.ok(service.getLine(seq, readerId));
	}


}








