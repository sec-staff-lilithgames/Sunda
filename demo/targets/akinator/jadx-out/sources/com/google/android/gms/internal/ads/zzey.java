package com.google.android.gms.internal.ads;

import b0.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzey implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzey(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzey)) {
            return false;
        }
        zzey zzeyVar = (zzey) obj;
        return this.zza == zzeyVar.zza && this.zzb == zzeyVar.zzb && this.zzc == zzeyVar.zzc;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return Long.hashCode(this.zzc) + ((Long.hashCode(this.zzb) + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        e2.A(sb2, "Mp4Timestamp: creation time=", j10, ", modification time=");
        sb2.append(j11);
        return e2.i(j12, ", timescale=", sb2);
    }
}
