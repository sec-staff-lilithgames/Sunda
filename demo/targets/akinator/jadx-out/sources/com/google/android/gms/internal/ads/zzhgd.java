package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhgd {
    private final Class zza;
    private final zzhsz zzb;

    public /* synthetic */ zzhgd(Class cls, zzhsz zzhszVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhszVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgd)) {
            return false;
        }
        zzhgd zzhgdVar = (zzhgd) obj;
        return zzhgdVar.zza.equals(this.zza) && zzhgdVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzhsz zzhszVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzhszVar);
        return a.b.o(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
