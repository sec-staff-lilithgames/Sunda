package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagd implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagd(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    public static zzagd zzb(zzeg zzegVar) {
        int iZzB = zzegVar.zzB();
        String strZzi = zzas.zzi(zzegVar.zzK(zzegVar.zzB(), StandardCharsets.US_ASCII));
        String strZzK = zzegVar.zzK(zzegVar.zzB(), StandardCharsets.UTF_8);
        int iZzB2 = zzegVar.zzB();
        int iZzB3 = zzegVar.zzB();
        int iZzB4 = zzegVar.zzB();
        int iZzB5 = zzegVar.zzB();
        int iZzB6 = zzegVar.zzB();
        byte[] bArr = new byte[iZzB6];
        zzegVar.zzm(bArr, 0, iZzB6);
        return new zzagd(iZzB, strZzi, strZzK, iZzB2, iZzB3, iZzB4, iZzB5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagd.class == obj.getClass()) {
            zzagd zzagdVar = (zzagd) obj;
            if (this.zza == zzagdVar.zza && this.zzb.equals(zzagdVar.zzb) && this.zzc.equals(zzagdVar.zzc) && this.zzd == zzagdVar.zzd && this.zze == zzagdVar.zze && this.zzf == zzagdVar.zzf && this.zzg == zzagdVar.zzg && Arrays.equals(this.zzh, zzagdVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int iHashCode = this.zzb.hashCode() + (i10 * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        return o2.r(new StringBuilder(str2.length() + length + 32), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
