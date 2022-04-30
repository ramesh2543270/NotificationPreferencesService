package com.manning.application.notification.NotificationPreferencesService.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationPreferenceResponse {

    private String statusDescription;
    private String status;
    private boolean smsPreferenceFlag;
    private boolean emailPreferenceFlag;
    private String emailAddress;
    private String phoneNumber;

}
