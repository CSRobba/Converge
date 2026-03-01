package com.converge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * Represents the response returned to the client after computing an optimal meetup point.
 *
 * This DTO is returned by the /api/converge endpoint and contains the selected meetup
 * location along with metrics that help quantify the efficiency and fairness of the result.
 *
 * These metrics allow clients to understand not just where to meet, but how optimal
 * the solution is from both efficiency and fairness perspectives.
 */

@Data
@AllArgsConstructor // Generates constructor: new TripResponse(location, time, score);
public class TripResponse {
    /**
     * Variables represent the following:
     * The selected meetup location determined by the optimization algorithm.
     * The total combined travel time (in minutes) across all participants.
     * A computed fairness score representing how evenly travel burden is distributed.
     * Lower variance in individual travel times results in a better fairness score.
     * This is a core metric that differentiates Converge from naive midpoint solutions.
     */
    private String meetupLocation;
    private int totalTravelTimeMinutes;
    private double fairnessScore;
}