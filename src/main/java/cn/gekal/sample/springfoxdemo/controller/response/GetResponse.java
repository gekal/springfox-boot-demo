package cn.gekal.sample.springfoxdemo.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Getリクエスト")
public class GetResponse {

    @ApiModelProperty("メッセージ")
    private String message;

    @Override
    public String toString() {
        return "PostResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
