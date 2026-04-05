package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzey implements zzcy {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfa zzb;

    public zzey(zzfa zzfaVar, Runnable runnable) {
        this.zza = runnable;
        this.zzb = zzfaVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcy
    public final void zza(Throwable th2) {
        this.zzb.zzb.post(this.zza);
    }
}
