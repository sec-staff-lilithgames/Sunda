package com.google.android.gms.internal.ads;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgjq extends zzgkr {
    private final int zza;
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzgjq(int i10, String str, int i11, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) obj;
            if (this.zza == zzgkrVar.zza() && ((str = this.zzb) != null ? str.equals(zzgkrVar.zzb()) : zzgkrVar.zzb() == null) && this.zzc == zzgkrVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i11).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i10);
        sb2.append(", sessionToken=");
        sb2.append(str);
        return e2.n(sb2, ", uiMode=", i11, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzgkr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgkr
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkr
    public final int zzc() {
        return this.zzc;
    }
}
