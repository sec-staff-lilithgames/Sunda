package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhhf extends zzhhi {
    private final int zza;
    private final int zzb;
    private final zzhhe zzc;
    private final zzhhd zzd;

    public /* synthetic */ zzhhf(int i10, int i11, zzhhe zzhheVar, zzhhd zzhhdVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhheVar;
        this.zzd = zzhhdVar;
    }

    public static zzhhc zzb() {
        return new zzhhc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhf)) {
            return false;
        }
        zzhhf zzhhfVar = (zzhhf) obj;
        return zzhhfVar.zza == this.zza && zzhhfVar.zze() == zze() && zzhhfVar.zzc == this.zzc && zzhhfVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhhf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhhd zzhhdVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhhdVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzb;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i11).length() + 10);
        com.google.android.gms.internal.play_billing.a.B(sb2, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i10, i11, ", ", "-byte tags, and ", sb2);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zzc != zzhhe.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhhe zzhheVar = this.zzc;
        if (zzhheVar == zzhhe.zzd) {
            return this.zzb;
        }
        if (zzhheVar == zzhhe.zza || zzhheVar == zzhhe.zzb || zzhheVar == zzhhe.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhhe zzf() {
        return this.zzc;
    }

    public final zzhhd zzg() {
        return this.zzd;
    }
}
