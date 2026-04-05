package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbqq implements zzcce {
    final /* synthetic */ zzbpv zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcca zzc;
    final /* synthetic */ zzbqt zzd;

    public zzbqq(zzbqt zzbqtVar, zzbpv zzbpvVar, Object obj, zzcca zzccaVar) {
        this.zza = zzbpvVar;
        this.zzb = obj;
        this.zzc = zzccaVar;
        Objects.requireNonNull(zzbqtVar);
        this.zzd = zzbqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcca zzccaVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbqc) obj, obj2, zzccaVar);
    }
}
