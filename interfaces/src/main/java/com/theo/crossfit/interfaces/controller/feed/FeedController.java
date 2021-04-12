package com.theo.crossfit.interfaces.controller.feed;

import com.google.common.collect.Lists;
import com.theo.crossfit.interfaces.application.FeedApplication;
import com.theo.crossfit.interfaces.controller.feed.dto.FeedDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/feeds")
public class FeedController {
    private final FeedApplication feedApplication;

    FeedController(FeedApplication feedApplication){
        this.feedApplication = feedApplication;
    }

    /**
     * 계정정보로 feed 조회 해야한다.
     * */
    @GetMapping("/")
    public List<FeedDto> getFeeds() {


        return Lists.newArrayList();
    }
}
