package com.converge.controller;

import com.converge.dto.TripRequest;
import com.converge.dto.TripResponse;
import com.converge.service.TripService;
import org.springframework.web.bind.annotation.*; //providing the REST API functionality from Spring Boot

/**
 * REST controller responsible for handling trip planning requests.
 *
 * This class exposes HTTP endpoints that allow clients to submit trip planning
 * requests and receive optimized meetup recommendations.
 *
 * It serves as the interface between external clients and the internal service layer,
 * handling request routing, input deserialization, and response serialization.
 */
@RestController //to mark this class as a REST controller and that it handles HTTP requests
@RequestMapping("/trips")
public class TripController {

    /**
     * Service layer dependency responsible for computing trip optimization results.
     * Injected by Spring via constructor injection to promote immutability,
     * testability, and loose coupling between layers.
     */
    private final TripService tripService;

    /**
     * Constructor-based dependency injection.
     * Spring automatically provides the TripService bean when initializing this controller.
     * @param tripService the service responsible for trip planning logic
     */
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    /**
     * Endpoint for planning an optimized meetup trip.
     * Accepts a TripRequest containing a shared destination and participant origins
     * and returns a TripResponse with the computed meetup location and associated metrics.
     *
     * HTTP Endpoint:
     * POST /trips/plan
     *
     * @param request the incoming trip planning request
     * @return TripResponse containing meetup recommendation and optimization metrics
     */
    @PostMapping("/plan")
    public TripResponse planTrip(@RequestBody TripRequest request) {
        return tripService.planTrip(request);
    }
}