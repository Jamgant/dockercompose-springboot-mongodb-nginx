package de.jamgeo.demo.springboot;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@ToString
class User {

    @Id
    private String userId;
    private String name;
    //private Date creationDate = new Date();


}
