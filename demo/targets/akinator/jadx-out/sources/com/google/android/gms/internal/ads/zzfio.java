package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfio implements zzfim {
    private final String zza;

    public zzfio(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfim
    public final boolean equals(Object obj) {
        if (obj instanceof zzfio) {
            return this.zza.equals(((zzfio) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfim
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
