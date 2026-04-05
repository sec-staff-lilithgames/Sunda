package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaeb {
    public final zzaee zza;
    public final zzaee zzb;

    public zzaeb(zzaee zzaeeVar, zzaee zzaeeVar2) {
        this.zza = zzaeeVar;
        this.zzb = zzaeeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeb.class == obj.getClass()) {
            zzaeb zzaebVar = (zzaeb) obj;
            if (this.zza.equals(zzaebVar.zza) && this.zzb.equals(zzaebVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzaee zzaeeVar = this.zza;
        zzaee zzaeeVar2 = this.zzb;
        String string = zzaeeVar.toString();
        String strConcat = zzaeeVar.equals(zzaeeVar2) ? "" : ", ".concat(zzaeeVar2.toString());
        return o2.r(new StringBuilder(o2.C(string.length() + 1, 1, strConcat)), C3191e4.i.f36529d, string, strConcat, C3191e4.i.f36531e);
    }
}
