package com.nuvoroute.vehicle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "vehicle")
@NoArgsConstructor(force = true)
public class Vehicle {

    @Id
    @GeneratedValue(generator = "UUID")
    UUID id;

    @Column(name = "brand", nullable = false, columnDefinition = "TEXT")
    String brand;

    @Column(name = "model", nullable = false, columnDefinition = "TEXT")
    String model;

    @Column(name = "year", columnDefinition = "INTEGER")
    Integer year;

    @Column(name = "vin", nullable = false, columnDefinition = "TEXT")
    String vin;

    @Column(name = "license_plate", nullable = false, columnDefinition = "TEXT")
    String licensePlate;

    @Column(name = "distance_covered", columnDefinition = "INTEGER")
    Integer distanceCovered;
}
