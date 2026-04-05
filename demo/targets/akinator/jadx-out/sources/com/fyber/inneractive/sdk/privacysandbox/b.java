package com.fyber.inneractive.sdk.privacysandbox;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.MotionEvent;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import j5.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26334a;

    public b(Context context) {
        this.f26334a = context.getApplicationContext();
    }

    public final void a(String str, MotionEvent motionEvent) {
        Context context = this.f26334a;
        h hVarFrom = h.from(context.getApplicationContext());
        if (hVarFrom == null) {
            IAlog.f("MeasurementManager required", new Object[0]);
        } else {
            hVarFrom.registerSourceAsync(Uri.parse(str), motionEvent).addListener(new a(str), context.getMainExecutor());
        }
    }

    public static b a(Context context) {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        int extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        IAlog.c("Ad services version: %d", Integer.valueOf(extensionVersion));
        if (extensionVersion < 4 || !o.a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION") || (classLoader = context.getClass().getClassLoader()) == null) {
            return null;
        }
        try {
            if (classLoader.loadClass("androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures") != null) {
                return new b(context);
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
