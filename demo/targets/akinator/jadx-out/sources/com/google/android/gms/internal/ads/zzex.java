package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzex implements zzao {
    public final float zza;
    public final float zzb;

    public zzex(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzgmd.zzb(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzex.class == obj.getClass()) {
            zzex zzexVar = (zzex) obj;
            if (this.zza == zzexVar.zza && this.zzb == zzexVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return Float.hashCode(this.zzb) + (iHashCode * 31);
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        float f11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }
}
