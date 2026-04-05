package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzael {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzael(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzael.class == obj.getClass()) {
            zzael zzaelVar = (zzael) obj;
            if (this.zza == zzaelVar.zza && this.zzc == zzaelVar.zzc && this.zzd == zzaelVar.zzd && Arrays.equals(this.zzb, zzaelVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i10 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
