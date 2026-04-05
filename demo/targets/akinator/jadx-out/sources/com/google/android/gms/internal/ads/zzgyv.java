package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgyv extends zzgxb {
    private final zzgyu zza;

    private zzgyv(zzgyu zzgyuVar) {
        this.zza = zzgyuVar;
    }

    public static zzgyv zzb(zzgyu zzgyuVar) {
        return new zzgyv(zzgyuVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgyv) && ((zzgyv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgyv.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return a.b.o(new StringBuilder(string.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zza != zzgyu.zzc;
    }

    public final zzgyu zzc() {
        return this.zza;
    }
}
