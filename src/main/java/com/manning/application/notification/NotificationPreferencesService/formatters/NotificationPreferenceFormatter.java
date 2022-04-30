package com.manning.application.notification.NotificationPreferencesService.formatters;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;
import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferenceResponse;
import org.springframework.stereotype.Component;

@Component
public class NotificationPreferenceFormatter {

    public NotificationPreferenceResponse formatNotificationResponse(NotificationPreferences notificationPreferences){

        NotificationPreferenceResponse notificationPreferenceResponse = new NotificationPreferenceResponse();
        if(notificationPreferences==null) {
            notificationPreferenceResponse.setStatus("FAILURE");
            notificationPreferenceResponse.setStatusDescription("Failed to get notification");
        }
        else{
            notificationPreferenceResponse.setStatus("SUCCESS");
            notificationPreferenceResponse.setStatusDescription("Notification Received Successfully");
            notificationPreferenceResponse.setEmailPreferenceFlag(notificationPreferences.isEmailpreferenceflag());
            notificationPreferenceResponse.setSmsPreferenceFlag(notificationPreferences.isSmspreferenceflag());
            notificationPreferenceResponse.setEmailAddress(notificationPreferences.getEmailaddress());
            notificationPreferenceResponse.setPhoneNumber(notificationPreferences.getPhonenumber());
        }

        return notificationPreferenceResponse;
    }
}
