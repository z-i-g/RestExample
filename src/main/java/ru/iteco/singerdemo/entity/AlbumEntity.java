package ru.iteco.singerdemo.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@RequiredArgsConstructor
public class AlbumEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "RELEASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Version
    @Column(name = "VERSION")
    private int version;

    @ManyToOne
    @JoinColumn(name = "SINGER_ID")
    private SingerEntity singer;

}
