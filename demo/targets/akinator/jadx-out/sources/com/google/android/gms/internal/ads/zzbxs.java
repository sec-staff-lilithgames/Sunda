package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbxs extends zzbxu {
    private final String zza;
    private final int zzb;

    public zzbxs(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbxs)) {
            return false;
        }
        zzbxs zzbxsVar = (zzbxs) obj;
        if (Objects.equal(this.zza, zzbxsVar.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbxsVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final int zzc() {
        return this.zzb;
    }
}
