package com.example.demo.Entities;
import antlr.collections.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Agent")
public class Agent implements Serializable {




    @Column(name = "os", length = 255, nullable = false)
    private  String os;

    //@Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
   // @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "lastKeepAlive", nullable = false)
    private Date lastKeepAlive;

   // @Temporal(TemporalType.DATE)
   //@DateTimeFormat(pattern = "dd-MM-yyyy")
   @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(name = "dateAdd", nullable = false)
    private  Date dateAdd;

    @Column(name = "ip",  nullable = false)
    private  String ip;

    @Column(name = "name", length = 30, nullable = false)
    private  String name;

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAgent;


    @Column(name = "version", length = 30, nullable = false)
    private  String version;

    @Enumerated(EnumType.ORDINAL)
    private  Status status;


}
