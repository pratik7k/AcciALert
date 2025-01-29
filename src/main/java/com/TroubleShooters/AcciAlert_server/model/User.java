package com.TroubleShooters.AcciAlert_server.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // Autogenerated, autoincremented key

    private String vehicleNumber; // Vehicle number
    private String vehicleModel; // Name of the user's vehicle model
    private String vehicleType; // Type of vehicle (e.g., car, bike)

    @ElementCollection
    @CollectionTable(name = "emergency_contacts", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "phone_number")
    private List<String> emergencyContacts; // List of emergency contact numbers

    private String name; // User's name
    private String gender; // Gender of user
    private String dateOfBirth; // Date of birth (YYYY-MM-DD format)

    private String bloodGroup; // User's blood group
    private String aadhaarNumber; // Aadhaar Card number
    private String permanentAddress; // User's permanent address

    public Long getUserId() {
        return userId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public List<String> getEmergencyContacts() {
        return emergencyContacts;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setEmergencyContacts(List<String> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
