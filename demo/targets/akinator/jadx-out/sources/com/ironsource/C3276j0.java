package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3276j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3276j0 f36957a = new C3276j0();

    private C3276j0() {
    }

    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return 0;
        }
    }

    public static final MeasurementManager a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return j1.u.b(context.getSystemService(j1.u.l()));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ void b() {
    }
}
