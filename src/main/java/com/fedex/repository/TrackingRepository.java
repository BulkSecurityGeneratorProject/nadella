package com.fedex.repository;

import com.fedex.domain.Tracking;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Tracking entity.
 */
@SuppressWarnings("unused")
public interface TrackingRepository extends JpaRepository<Tracking,Long> {

}
