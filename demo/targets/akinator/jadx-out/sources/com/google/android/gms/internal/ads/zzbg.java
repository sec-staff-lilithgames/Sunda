package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbg {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzv[] zzd;
    private int zze;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbg(String str, zzv... zzvVarArr) {
        int length = zzvVarArr.length;
        int i10 = 1;
        zzgmd.zza(length > 0);
        this.zzb = str;
        this.zzd = zzvVarArr;
        this.zza = length;
        int iZzg = zzas.zzg(zzvVarArr[0].zzo);
        this.zzc = iZzg == -1 ? zzas.zzg(zzvVarArr[0].zzn) : iZzg;
        String strZzc = zzc(zzvVarArr[0].zzd);
        int i11 = zzvVarArr[0].zzf | 16384;
        while (true) {
            zzv[] zzvVarArr2 = this.zzd;
            if (i10 >= zzvVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzvVarArr2[i10].zzd))) {
                zzv[] zzvVarArr3 = this.zzd;
                zzd("languages", zzvVarArr3[0].zzd, zzvVarArr3[i10].zzd, i10);
                return;
            } else {
                zzv[] zzvVarArr4 = this.zzd;
                if (i11 != (zzvVarArr4[i10].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzvVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i10].zzf), i10);
                    return;
                }
                i10++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i10) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i10).length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "Different ", str, " combined in one TrackGroup: '", str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i10);
        sb2.append(")");
        zzdt.zzf("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.zzb.equals(zzbgVar.zzb) && Arrays.equals(this.zzd, zzbgVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzb.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int iHashCode2 = Arrays.hashCode(this.zzd) + (iHashCode * 31);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzd);
        String str = this.zzb;
        return a.b.o(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }

    public final zzv zza(int i10) {
        return this.zzd[i10];
    }

    public final int zzb(zzv zzvVar) {
        int i10 = 0;
        while (true) {
            zzv[] zzvVarArr = this.zzd;
            if (i10 >= zzvVarArr.length) {
                return -1;
            }
            if (zzvVar == zzvVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }
}
