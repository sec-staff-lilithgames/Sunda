package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzzs implements zzzt {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdg zzb;

    public zzzs(Executor executor, zzdg zzdgVar) {
        this.zza = executor;
        this.zzb = zzdgVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
