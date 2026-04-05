package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagv extends zzagq {
    public final String zza;
    public final zzgpe zzb;

    public zzagv(String str, String str2, List list) {
        super(str);
        zzgmd.zza(!list.isEmpty());
        this.zza = str2;
        zzgpe zzgpeVarZzq = zzgpe.zzq(list);
        this.zzb = zzgpeVarZzq;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagv.class == obj.getClass()) {
            zzagv zzagvVar = (zzagv) obj;
            if (Objects.equals(this.zzf, zzagvVar.zzf) && Objects.equals(this.zza, zzagvVar.zza) && this.zzb.equals(zzagvVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        com.google.android.gms.internal.play_billing.a.B(sb2, str, ": description=", str2, ": values=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0181 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0203, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0203, blocks: (B:69:0x0123, B:82:0x0178, B:84:0x0181, B:86:0x018d, B:102:0x01dc), top: B:113:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    @Override // com.google.android.gms.internal.ads.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzam r7) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagv.zza(com.google.android.gms.internal.ads.zzam):void");
    }
}
