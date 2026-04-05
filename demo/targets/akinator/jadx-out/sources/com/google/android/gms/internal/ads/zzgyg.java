package com.google.android.gms.internal.ads;

import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgyg extends zzgxb {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgyf zzd;

    public /* synthetic */ zzgyg(int i10, int i11, int i12, zzgyf zzgyfVar, byte[] bArr) {
        this.zza = i10;
        this.zzd = zzgyfVar;
    }

    public static zzgye zzb() {
        return new zzgye(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgyg)) {
            return false;
        }
        zzgyg zzgygVar = (zzgyg) obj;
        return zzgygVar.zza == this.zza && zzgygVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgyg.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(o2.c(length + 30 + length2 + 10 + length3, 15, String.valueOf(i10).length(), 10));
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zzd != zzgyf.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgyf zzd() {
        return this.zzd;
    }
}
