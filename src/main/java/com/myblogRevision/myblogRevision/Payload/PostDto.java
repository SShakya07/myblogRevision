package com.myblogRevision.myblogRevision.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private long id;
    private String name ;
    private String course;
    private String location;
}
