package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzep extends zzeq {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzfb zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzfb zzfbVar, Long l9, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzfbVar, true);
        this.zza = l9;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z10;
        this.zzf = z11;
        Objects.requireNonNull(zzfbVar);
        this.zzg = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        Long l9 = this.zza;
        ((zzcr) Preconditions.checkNotNull(this.zzg.zzQ())).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l9 == null ? this.zzh : l9.longValue());
    }
}
