package com.manning.application.notification.NotificationPreferencesService.services;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;

import java.util.List;

public interface NotificationPreferenceService {
    NotificationPreferences retrieveCustomerById(String customerId);
}
