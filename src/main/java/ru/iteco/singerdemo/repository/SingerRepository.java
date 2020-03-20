package ru.iteco.singerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iteco.singerdemo.entity.SingerEntity;

public interface SingerRepository extends JpaRepository<SingerEntity, Long> {
}
