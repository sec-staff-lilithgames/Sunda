package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhar extends zzgxb {
    private final zzhaq zza;

    private zzhar(zzhaq zzhaqVar) {
        this.zza = zzhaqVar;
    }

    public static zzhar zzb(zzhaq zzhaqVar) {
        return new zzhar(zzhaqVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhar) && ((zzhar) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhar.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return a.b.o(new StringBuilder(string.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zza != zzhaq.zzc;
    }

    public final zzhaq zzc() {
        return this.zza;
    }
}
