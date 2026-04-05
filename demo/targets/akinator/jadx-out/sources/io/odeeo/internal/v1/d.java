package io.odeeo.internal.v1;

import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f67273a = new d();

    public final long getDeviceTime() {
        return System.currentTimeMillis();
    }

    public final boolean isChromeBook(Context context) {
        e0.checkNotNullParameter(context, "context");
        return context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }
}
