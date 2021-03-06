package io.github.biezhi.tgbot.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PhotoSize implements Serializable {
    private final static long serialVersionUID = 0L;

    private String file_id;
    private Integer width;
    private Integer height;
    private Integer file_size;

}
