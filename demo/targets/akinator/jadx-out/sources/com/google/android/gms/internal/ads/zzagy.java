package com.google.android.gms.internal.ads;

import b0.e2;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagy {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzagy(long j10, long j11, int i10) {
        zzgmd.zza(j10 < j11);
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagy.class == obj.getClass()) {
            zzagy zzagyVar = (zzagy) obj;
            if (this.zza == zzagyVar.zza && this.zzb == zzagyVar.zzb && this.zzc == zzagyVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        long j10 = this.zza;
        long j11 = this.zzb;
        int i10 = this.zzc;
        String str = zzep.zza;
        Locale locale = Locale.US;
        StringBuilder sbR = e2.r(j10, "Segment: startTimeMs=", ", endTimeMs=");
        sbR.append(j11);
        sbR.append(", speedDivisor=");
        sbR.append(i10);
        return sbR.toString();
    }
}
