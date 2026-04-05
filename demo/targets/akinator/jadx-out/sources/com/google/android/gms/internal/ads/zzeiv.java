package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeiv implements zzdjl {
    final /* synthetic */ zzcca zza;
    final /* synthetic */ zzffu zzb;
    final /* synthetic */ zzeix zzc;

    public zzeiv(zzeix zzeixVar, zzcca zzccaVar, zzffu zzffuVar) {
        this.zza = zzccaVar;
        this.zzb = zzffuVar;
        Objects.requireNonNull(zzeixVar);
        this.zzc = zzeixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final void zza(boolean z10, Context context, zzczb zzczbVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final zzffu zzb() {
        return this.zzb;
    }
}
