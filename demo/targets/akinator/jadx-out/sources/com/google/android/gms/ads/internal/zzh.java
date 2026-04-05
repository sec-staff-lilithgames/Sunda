package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfsq;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzh implements zzfsq {
    final /* synthetic */ zzk zza;

    public zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsq
    public final void zza(int i10, long j10) {
        this.zza.zzo().zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfsq
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzo().zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
