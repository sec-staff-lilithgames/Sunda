package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzec implements Runnable {
    private final /* synthetic */ zzed zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzec(zzed zzedVar, Context context) {
        this.zza = zzedVar;
        this.zzb = context;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.zza.zza.zzd(this.zzb);
    }
}
