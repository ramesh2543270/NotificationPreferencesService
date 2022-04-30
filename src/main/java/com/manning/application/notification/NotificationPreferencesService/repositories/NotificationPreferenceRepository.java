package com.manning.application.notification.NotificationPreferencesService.repositories;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NotificationPreferenceRepository extends CrudRepository<NotificationPreferences, Long> {
    @Query(value = "select d.id, d.customerid, d.smspreferenceflag, d.emailpreferenceflag, d.phonenumber, d.emailaddress from notification_preferences d where d.customerid=:cid",nativeQuery = true)
    NotificationPreferences findCustomerById(String cid);
}
