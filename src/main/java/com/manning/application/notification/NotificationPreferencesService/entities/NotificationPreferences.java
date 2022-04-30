package com.manning.application.notification.NotificationPreferencesService.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="NOTIFICATION_PREFERENCES")
@Getter
@Setter
public class NotificationPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String customerid;
    private boolean smspreferenceflag;
    private boolean emailpreferenceflag;
    private String emailaddress;
    private String phonenumber;

}
