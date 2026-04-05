package com.google.android.gms.internal.ads;

import b0.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public class zzagx implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzagx(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagx zzagxVar = (zzagx) obj;
            if (this.zza == zzagxVar.zza && this.zzb == zzagxVar.zzb && this.zzc == zzagxVar.zzc && this.zzd == zzagxVar.zzd && this.zze == zzagxVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int iHashCode2 = Long.hashCode(this.zzc) + ((Long.hashCode(this.zzb) + (iHashCode * 31)) * 31);
        return Long.hashCode(this.zze) + ((Long.hashCode(this.zzd) + (iHashCode2 * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        int length3 = String.valueOf(j12).length();
        long j13 = this.zzd;
        int length4 = String.valueOf(j13).length();
        long j14 = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        e2.A(sb2, "Motion photo metadata: photoStartPosition=", j10, ", photoSize=");
        sb2.append(j11);
        e2.A(sb2, ", photoPresentationTimestampUs=", j12, ", videoStartPosition=");
        sb2.append(j13);
        return e2.i(j14, ", videoSize=", sb2);
    }
}
