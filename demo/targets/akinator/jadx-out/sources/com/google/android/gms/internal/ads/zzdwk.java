package com.google.android.gms.internal.ads;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdwk extends zzdwo {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzdwk(long j10, int i10, byte[] bArr) {
        this.zza = j10;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdwo) {
            zzdwo zzdwoVar = (zzdwo) obj;
            if (this.zza == zzdwoVar.zza() && this.zzb == zzdwoVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i10).length() + 1);
        e2.A(sb2, "OnDeviceStorageKey{id=", j10, ", eventType=");
        return a.b.f(i10, "}", sb2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final int zzb() {
        return this.zzb;
    }
}
