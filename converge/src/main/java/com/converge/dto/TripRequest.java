package com.converge.dto;

import lombok.Data;
import java.util.List;

/**
 * Represents the incoming request payload for the Converge optimization endpoint.
 *
 * This DTO is automatically populated by Spring Boot when a client sends a POST
 * request to /api/converge. It encapsulates the shared destination and the list
 * of participants with their respective origin locations.
 *
 * This class exists to cleanly separate external API input from internal domain logic,
 * improving maintainability, validation, and extensibility.
 */

@Data
public class TripRequest {
    /**
     * The shared destination that all participants intend to reach.
     * This will later be resolved into geographic coordinates via the geocoding service.
     */
    private String destination;
    /**
     * The list of participants involved in the convergence.
     * Each participant provides a unique identifier and their starting location.
     * This allows the optimization service to compute a fair meetup point.
     */
    private List<Participant> participants;

    /**
     * Each participant will have a unique identifier for better tracking and
     * mapping optimization. The origin is the participant's starting location
     * and will be converted into coordinates and used in route and fairness calculations.
     */
    @Data
    public static class Participant {
        private String id;
        private String origin;
    }
}
