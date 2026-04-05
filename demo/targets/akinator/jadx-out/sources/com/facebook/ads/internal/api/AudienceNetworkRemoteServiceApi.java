package com.facebook.ads.internal.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface AudienceNetworkRemoteServiceApi {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface PackageVerifier {
        String verifyPackage(Context context, Message message, String str);
    }

    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(MessageHandler messageHandler);

    void setPackageVerifier(PackageVerifier packageVerifier);
}
