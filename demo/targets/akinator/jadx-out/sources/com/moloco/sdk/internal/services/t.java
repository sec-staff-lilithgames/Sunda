package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47172a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.o f47173b;

    public t(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47172a = context;
        this.f47173b = tu.q.lazy(new a1.e(this, 10));
    }

    public static final boolean a(t tVar) {
        return tVar.f47172a.getResources().getBoolean(R.bool.isTablet);
    }

    @Override // com.moloco.sdk.internal.services.i0
    public h0 b() {
        String str;
        String str2;
        String str3;
        String networkOperatorName;
        String str4 = Build.MANUFACTURER;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = Build.MODEL;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = Build.HARDWARE;
        if (str6 == null) {
            str3 = str6;
            str = str5;
            str2 = "";
        } else {
            str = str5;
            str2 = str6;
            str3 = str2;
        }
        boolean zE = e();
        String str7 = str3;
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(RELEASE, "RELEASE");
        String str8 = str7;
        int i10 = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(language, "getLanguage(...)");
        TelephonyManager telephonyManager = (TelephonyManager) m3.a.getSystemService(this.f47172a, TelephonyManager.class);
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (str8 == null) {
            str8 = "";
        }
        String str9 = Build.BRAND;
        if (str9 == null) {
            str9 = "";
        }
        return new h0(str4, str, str2, zE, "android", RELEASE, i10, language, networkOperatorName, f10, jCurrentTimeMillis, str8, str9);
    }

    @Override // com.moloco.sdk.internal.services.i0
    public String c() {
        String language = Locale.getDefault().getLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @Override // com.moloco.sdk.internal.services.i0
    public String d() {
        Object systemService = this.f47172a.getSystemService("input_method");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            return currentInputMethodSubtype.getLocale();
        }
        return null;
    }

    public final boolean e() {
        return ((Boolean) this.f47173b.getValue()).booleanValue();
    }

    @Override // com.moloco.sdk.internal.services.i0
    @tu.f
    public h0 invoke() {
        return b();
    }

    @Override // com.moloco.sdk.internal.services.i0
    public Boolean a() {
        try {
            Object systemService = this.f47172a.getSystemService("sensor");
            kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            return Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (Exception unused) {
            return null;
        }
    }
}
