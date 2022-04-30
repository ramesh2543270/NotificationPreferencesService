package com.manning.application.notification.NotificationPreferencesService.controllers;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;
import com.manning.application.notification.NotificationPreferencesService.formatters.NotificationPreferenceFormatter;
import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferenceResponse;
import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferencesRequest;
import com.manning.application.notification.NotificationPreferencesService.services.NotificationPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification/preferences")
public class NotificationPreferenceController {

    @Autowired
    private NotificationPreferenceService notificationPreferenceService;
    @Autowired
    private NotificationPreferenceFormatter notificationPreferenceFormatter;

    /*
    public  void setNotificationPreferenceService(NotificationPreferenceService notificationPreferenceService){
        this.notificationPreferenceService = notificationPreferenceService;
    }


    public  void setNotificationPreferenceFormatter(NotificationPreferenceFormatter notificationPreferenceFormatter){
        this.notificationPreferenceFormatter = notificationPreferenceFormatter;
    }*/



    @PostMapping
    public NotificationPreferenceResponse getCustomerNotificationPreference(@RequestBody NotificationPreferencesRequest npr){
        NotificationPreferences notificationPreferences = notificationPreferenceService.retrieveCustomerById(npr.getCustomerId());
        NotificationPreferenceResponse notificationPreferenceResponse = notificationPreferenceFormatter.formatNotificationResponse(notificationPreferences);
        return  notificationPreferenceResponse;
    }

}
