package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzet implements zzao {
    public final int zza;

    public zzet(int i10) {
        this.zza = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzet) && this.zza == ((zzet) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i10 = this.zza;
        return o2.l(i10, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i10).length() + 19));
    }
}
