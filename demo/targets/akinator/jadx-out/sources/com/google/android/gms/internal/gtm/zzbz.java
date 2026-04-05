package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbz implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzca zzb;

    public zzbz(zzca zzcaVar, ComponentName componentName) {
        this.zza = componentName;
        this.zzb = zzcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcb.zzb(this.zzb.zza, this.zza);
    }
}
