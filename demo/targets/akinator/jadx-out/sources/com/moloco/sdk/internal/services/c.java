package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.moloco.sdk.internal.services.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46963a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f46964b;

    public c(Context context, i0 deviceInfoService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        this.f46963a = context;
        this.f46964b = deviceInfoService;
    }

    @Override // com.moloco.sdk.internal.services.b
    public boolean a() {
        Object systemService = this.f46963a.getSystemService("connectivity");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return a((ConnectivityManager) systemService);
    }

    @Override // com.moloco.sdk.internal.services.b
    public Integer b() {
        Object systemService = this.f46963a.getSystemService("phone");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String strSubstring = networkOperator.substring(3);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }

    @Override // com.moloco.sdk.internal.services.b
    public a c() {
        Object systemService = this.f46963a.getSystemService("connectivity");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetwork() == null) {
            return a.b.f46754a;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities == null ? a.b.f46754a : networkCapabilities.hasTransport(1) ? a.c.f46755a : networkCapabilities.hasTransport(0) ? new a.C0386a(this.f46964b.invoke().u()) : a.b.f46754a;
    }

    @Override // com.moloco.sdk.internal.services.b
    @tu.f
    public a invoke() {
        return c();
    }

    @Override // com.moloco.sdk.internal.services.b
    public Integer d() {
        Object systemService = this.f46963a.getSystemService("phone");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String strSubstring = networkOperator.substring(0, 3);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, duhsDlGWdBkekB.OtkmFjNYxL);
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus() == 3;
    }
}
