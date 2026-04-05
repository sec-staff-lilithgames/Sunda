package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzkd;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12758b;

    public /* synthetic */ q(r rVar) {
        this.f12758b = rVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClientTesting", "Billing Override Service connected.");
        this.f12758b.I = zzau.zzc(iBinder);
        this.f12758b.H = 2;
        r rVar = this.f12758b;
        zzkd zzkdVarZzd = zzcg.zzd(26);
        Objects.requireNonNull(zzkdVarZzd, "ApiSuccess should not be null");
        rVar.f12699g.zzc(zzkdVarZzd);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
        this.f12758b.I = null;
        this.f12758b.H = 0;
    }
}
