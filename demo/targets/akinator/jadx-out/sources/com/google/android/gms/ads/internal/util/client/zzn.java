package com.google.android.gms.ads.internal.util.client;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzn extends zzx {
    private final int zza;
    private final int zzb;
    private final double zzc;
    private final boolean zzd;

    public zzn(int i10, int i11, double d10, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = d10;
        this.zzd = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.zza == zzxVar.zza() && this.zzb == zzxVar.zzb() && Double.doubleToLongBits(this.zzc) == Double.doubleToLongBits(zzxVar.zzc()) && this.zzd == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d10 = this.zzc;
        return ((((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32))) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        int length2 = String.valueOf(i11).length();
        double d10 = this.zzc;
        int length3 = String.valueOf(d10).length();
        boolean z10 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z10).length() + 1);
        a.o(i10, i11, "PingStrategy{maxAttempts=", ", initialBackoffMs=", sb2);
        sb2.append(", backoffMultiplier=");
        sb2.append(d10);
        sb2.append(", bufferAfterMaxAttempts=");
        return b.q(sb2, z10, "}");
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.zzd;
    }
}
