package cn.gekal.sample.springfoxdemo.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Postリクエスト")
public class PostRequest {

    @ApiModelProperty("テストバリュー")
    private String value;

    @Override
    public String toString() {
        return "PostRequest{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
