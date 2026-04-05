package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhnl extends zzhpp {
    private final zzhnk zza;

    private zzhnl(zzhnk zzhnkVar) {
        this.zza = zzhnkVar;
    }

    public static zzhnl zzb(zzhnk zzhnkVar) {
        return new zzhnl(zzhnkVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhnl) && ((zzhnl) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhnl.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return a.b.o(new StringBuilder(string.length() + 30), "Ed25519 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zza != zzhnk.zzd;
    }

    public final zzhnk zzc() {
        return this.zza;
    }
}
