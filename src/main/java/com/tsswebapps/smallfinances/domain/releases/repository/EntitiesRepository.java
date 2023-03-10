package com.tsswebapps.smallfinances.domain.releases.repository;

import com.tsswebapps.smallfinances.domain.releases.entities.Release;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntitiesRepository extends JpaRepository<Release, UUID> {
}
