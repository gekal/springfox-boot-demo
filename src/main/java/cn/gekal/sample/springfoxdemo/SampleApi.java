package cn.gekal.sample.springfoxdemo;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SampleApi {

    private final static Logger logger = LoggerFactory.getLogger(SampleApi.class);

    @ApiOperation("Get Sample")
    @GetMapping
    public String hello() {

        logger.info("Get Sample");

        return "Get Sample";
    }

    @ApiOperation("Post Sample")
    @PostMapping
    public String postSample() {

        logger.info("Post Sample");

        return "Post Sample";
    }
}
