package com.converge.service;

import com.converge.dto.TripRequest;
import com.converge.dto.TripResponse;
import org.springframework.stereotype.Service;

/**
 * Service responsible for planning and optimizing meetup logistics for a group trip.
 * This class contains the core business logic for determining an optimal meetup
 * location given a shared destination and multiple participant origins.
 *
 * This service will integrate with external mapping APIs and apply optimization
 * algorithms to compute a fair and efficient convergence point.
 */
@Service
public class TripService {

    /**
     * Computes an optimal meetup plan based on the provided trip request.
     *
     * This method serves as the primary entry point for trip optimization logic.
     * It will:
     *
     * - Resolve addresses into geographic coordinates
     * - Evaluate candidate meetup points
     * - Calculate travel times for each participant
     * - Compute fairness and efficiency metrics
     * - Select the optimal convergence point
     *
     * Currently, returns a stub response to validate API wiring and end-to-end flow.
     *
     * @param request the incoming trip request containing destination and participant origins
     * @return TripResponse containing meetup location and optimization metrics
     */
    public TripResponse planTrip(TripRequest request) {

        // Temporary placeholder implementation.
        // This confirms that controller → service → response flow works correctly.
        // Real optimization logic and Mapbox integration will be added later.

        return new TripResponse(
                "Sample Meetup Point",
                120,
                0.85
        );
    }
}