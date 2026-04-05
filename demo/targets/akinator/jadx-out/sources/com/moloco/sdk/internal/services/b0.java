package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46766a;

    public b0(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f46766a = context;
    }

    @Override // com.moloco.sdk.internal.services.a0
    public int a() {
        Intent intentRegisterReceiver = this.f46766a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("status", 1);
        }
        return 1;
    }

    @Override // com.moloco.sdk.internal.services.a0
    public int b() {
        Intent intentRegisterReceiver = this.f46766a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("scale", -1);
        }
        return -1;
    }

    @Override // com.moloco.sdk.internal.services.a0
    public boolean c() {
        Object systemService = this.f46766a.getSystemService("power");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }
}
