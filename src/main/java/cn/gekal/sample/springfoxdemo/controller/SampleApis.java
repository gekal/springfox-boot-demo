package cn.gekal.sample.springfoxdemo.controller;

import cn.gekal.sample.springfoxdemo.controller.request.PostRequest;
import cn.gekal.sample.springfoxdemo.controller.response.GetResponse;
import cn.gekal.sample.springfoxdemo.controller.response.PostResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "サンプルAPI")
@RestController("/")
public class SampleApis {

    /**
     * ロガー
     */
    private final static Logger logger = LoggerFactory.getLogger(SampleApis.class);

    @ApiOperation(value = "Get Sample", notes = "Get sample's notes.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Getレスポンス", response = GetResponse.class),
            @ApiResponse(code = 500, message = "システムエラー")
    })
    @GetMapping
    public GetResponse hello() {

        logger.info("Get Sample");

        GetResponse getResponse = new GetResponse();
        getResponse.setMessage("Get Sample");

        logger.info("get response = {}", getResponse);

        return getResponse;
    }

    @ApiOperation(value = "Post Sample", notes = "Post sample's notes.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Postレスポンス", response = PostResponse.class),
            @ApiResponse(code = 500, message = "システムエラー")
    })
    @PostMapping
    public PostResponse postSample(@RequestBody PostRequest postRequest) {

        logger.info("Post Sample.[request = {}]", postRequest);

        PostResponse postResponse = new PostResponse();
        postResponse.setMessage("Post Sample");

        logger.info("post response = {}", postRequest);

        return postResponse;
    }
}
