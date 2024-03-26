package com.ssafy.funding.dto;

import com.ssafy.funding.domain.FundingStatus;
import com.ssafy.funding.domain.Movie;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class DetailMovie {

    @NotNull
    @Schema(description = "영화 아이디")
    private int movieId;

    @NotNull
    @Schema(description = "영화 제목")
    private String title;

    @NotNull
    @Schema(description = "영화 포스터")
    private String poster;

    @NotNull
    @Schema(description = "현재 상태")
    private String status;

    @Schema(description = "펀딩 개최 횟수")
    private int count;

    public static DetailMovie of(Movie movie) {
        DetailMovie detailMovie = new DetailMovie();
        detailMovie.movieId = movie.getId();
        detailMovie.title = movie.getTitle();
        detailMovie.poster = movie.getPoster();
        detailMovie.status = FundingStatus.valueOf(movie.getStatus().getKr()).getKr(); // 확인 필요

        return detailMovie;
    }

    //    public static DetailMovie of(MovieDocument movieDocument) {
    //        DetailMovie detailMovie = new DetailMovie();
    //        detailMovie.movieId = movieDocument.getId();
    //        detailMovie.title = movieDocument.getTitle();
    //        detailMovie.poster = movieDocument.getPoster();
    //        detailMovie.status = detailMovie.getStatus();
    //
    //        return detailMovie;
    //    }
}