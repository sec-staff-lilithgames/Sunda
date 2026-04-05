package com.google.android.gms.internal.ads;

import b0.e2;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaee {
    public static final zzaee zza = new zzaee(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaee(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaee.class == obj.getClass()) {
            zzaee zzaeeVar = (zzaee) obj;
            if (this.zzb == zzaeeVar.zzb && this.zzc == zzaeeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j10 = this.zzb;
        int length = String.valueOf(j10).length();
        long j11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        e2.A(sb2, "[timeUs=", j10, ", position=");
        return a.b.g(j11, C3191e4.i.f36531e, sb2);
    }
}
