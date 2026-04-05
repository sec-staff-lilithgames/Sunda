package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgol extends zzgnx {
    final /* synthetic */ zzgon zza;
    private final Object zzb;
    private int zzc;

    public zzgol(zzgon zzgonVar, int i10) {
        Objects.requireNonNull(zzgonVar);
        this.zza = zzgonVar;
        this.zzb = zzgonVar.zzo(i10);
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzgon zzgonVar = this.zza;
            if (i10 < zzgonVar.size() && Objects.equals(this.zzb, zzgonVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgnx, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnx, java.util.Map.Entry
    public final Object getValue() {
        zzgon zzgonVar = this.zza;
        Map mapZzc = zzgonVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzgonVar.zzp(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgnx, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgon zzgonVar = this.zza;
        Map mapZzc = zzgonVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            zzgonVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgonVar.zzp(i10);
        zzgonVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
