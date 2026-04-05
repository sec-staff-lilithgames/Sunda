package io.bidmachine.media3.common.util;

import android.app.Notification;
import android.app.Service;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class z0 {
    public static void startForeground(Service service, int i10, Notification notification, int i11, String str) {
        try {
            service.startForeground(i10, notification, i11);
        } catch (RuntimeException e10) {
            b0.e("Util", "The service must be declared with a foregroundServiceType that includes " + str);
            throw e10;
        }
    }
}
