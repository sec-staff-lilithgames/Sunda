package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeb extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzco zzd;
    final /* synthetic */ zzfb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzfb zzfbVar, String str, String str2, boolean z10, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zze = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        ((zzcr) Preconditions.checkNotNull(this.zze.zzQ())).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zzb() {
        this.zzd.zzb(null);
    }
}
