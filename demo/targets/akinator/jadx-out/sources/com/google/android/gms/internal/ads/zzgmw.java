package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgmw implements Serializable, zzgmv {
    final zzgmv zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgnc zzd = new zzgnc();

    public zzgmw(zzgmv zzgmvVar) {
        this.zza = zzgmvVar;
    }

    public final String toString() {
        Object objO;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objO = a.b.o(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objO = this.zza;
        }
        String string = objO.toString();
        return a.b.o(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
