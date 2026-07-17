package com.cinema.payment;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "booking_id", nullable = false)
    private Long bookingId;

    @Column(nullable = false)
    private Double amount;

    @Column(name = "payment_method", nullable = false)
    private String paymentMethod; // e.g., "CREDIT_CARD", "UPI"

    @Column(nullable = false)
    private String status; // SUCCESS, FAILED, REFUNDED

    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;
}