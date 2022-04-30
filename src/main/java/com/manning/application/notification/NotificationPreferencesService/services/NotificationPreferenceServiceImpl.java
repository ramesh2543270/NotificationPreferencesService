package com.manning.application.notification.NotificationPreferencesService.services;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;
import com.manning.application.notification.NotificationPreferencesService.repositories.NotificationPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationPreferenceServiceImpl implements NotificationPreferenceService{
    @Autowired
    NotificationPreferenceRepository notificationPreferenceRepository;

    @Override
    public NotificationPreferences retrieveCustomerById(String customerId) {
        return notificationPreferenceRepository.findCustomerById(customerId);
    }
}
