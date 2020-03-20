package ru.iteco.singerdemo.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
public class InstrumentEntity implements Serializable {

    @Id
    @Column(name = "INSTRUMENT_ID")
    private String instrumentId;

    @ManyToMany
    @JoinTable(name = "SINGER_INSTRUMENT", joinColumns = @JoinColumn(name = "INSTRUMENT_ID"),
    inverseJoinColumns = @JoinColumn(name = "SINGER_ID"))
    private Set<SingerEntity> singers = new HashSet<>();

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentId='" + getInstrumentId() + '\'' +
                '}';
    }
}
