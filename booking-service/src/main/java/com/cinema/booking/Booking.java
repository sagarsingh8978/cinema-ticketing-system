package com.cinema.booking;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "showtime_id", nullable = false)
    private Long showtimeId;

    @Column(name = "seats_booked", nullable = false)
    private String seatsBooked; // e.g., "A1,A2"

    @Column(nullable = false)
    private String status; // PENDING, CONFIRMED, CANCELLED

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;
}