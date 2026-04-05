package com.digidust.elokence.akinator.services;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import ca.m;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.unity3d.ads.BuildConfig;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        PendingIntent activity;
        Map<String, String> data = remoteMessage.getData();
        String str = data.get(PglCryptUtils.KEY_MESSAGE);
        String str2 = data.get("title");
        String str3 = data.get("link");
        String str4 = data.get("token_download");
        if (str2 == null || str == null) {
            return;
        }
        Context appContext = AkApplication.getAppContext();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(appContext.getResources(), R.mipmap.ic_launcher);
        int i10 = (str3 == null || str3.length() <= 0) ? 0 : 1;
        if (i10 == 0) {
            Intent intent = new Intent(appContext, (Class<?>) SplashscreenActivity.class);
            intent.setFlags(603979776);
            activity = PendingIntent.getActivity(appContext, 0, intent, 67108864);
        } else {
            activity = i10 == 1 ? PendingIntent.getActivity(appContext, 0, new Intent("android.intent.action.VIEW", Uri.parse(str3)), 67108864) : null;
        }
        NotificationManager notificationManager = (NotificationManager) appContext.getSystemService("notification");
        NotificationCompat.d contentIntent = Build.VERSION.SDK_INT >= 26 ? new NotificationCompat.d(appContext, BuildConfig.FLAVOR).setSmallIcon(R.drawable.ak_tete_akinator).setLargeIcon(bitmapDecodeResource).setContentTitle(str2).setContentText(str).setTicker(str).setWhen(jCurrentTimeMillis).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(activity) : new NotificationCompat.d(appContext).setSmallIcon(R.drawable.ak_tete_akinator).setLargeIcon(bitmapDecodeResource).setContentTitle(str2).setContentText(str).setTicker(str).setWhen(jCurrentTimeMillis).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(activity);
        if (contentIntent != null) {
            if (i10 == 1) {
                if (str4 == null) {
                    str4 = "";
                }
                contentIntent.addAction(R.drawable.icon_download, str4, activity);
            }
            Notification notificationBuild = contentIntent.build();
            notificationBuild.flags |= 16;
            if (notificationManager != null) {
                notificationManager.notify(i10, notificationBuild);
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        m.sharedInstance().setFcmToken(str);
    }
}
