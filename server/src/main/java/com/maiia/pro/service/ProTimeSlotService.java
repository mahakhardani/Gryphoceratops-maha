package com.maiia.pro.service;

import com.maiia.pro.entity.TimeSlot;
import com.maiia.pro.repository.TimeSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProTimeSlotService {
    @Autowired
    private TimeSlotRepository timeSlotRepository;

    public List<TimeSlot> findAll() {
        return timeSlotRepository.findAll();
    }

    public List<TimeSlot> findByPractitionerId(String practitionerId) {
        return timeSlotRepository.findByPractitionerId(practitionerId);
    }
}
