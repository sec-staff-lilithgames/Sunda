package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbv {
    public static final zzbv zza = new zzbv(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbv(int i10, int i11, float f10) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.zzb == zzbvVar.zzb && this.zzc == zzbvVar.zzc && this.zzd == zzbvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        float f10 = this.zzd;
        return Float.floatToRawIntBits(f10) + (((i10 * 31) + this.zzc) * 31);
    }
}
