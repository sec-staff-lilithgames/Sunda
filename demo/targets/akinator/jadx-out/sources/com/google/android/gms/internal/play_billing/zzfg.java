package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfg extends zzes {
    final /* synthetic */ zzfh zza;
    private final Callable zzb;

    public zzfg(zzfh zzfhVar, Callable callable) {
        this.zza = zzfhVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final void zzc(Throwable th2) {
        this.zza.zzo(th2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final void zzd(Object obj) {
        this.zza.zzn(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final boolean zzf() {
        return this.zza.isDone();
    }
}
