package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgmy implements zzgmv {
    private static final zzgmv zzb = zzgmx.zza;
    private final zzgnc zza = new zzgnc();
    private volatile zzgmv zzc;
    private Object zzd;

    public zzgmy(zzgmv zzgmvVar) {
        this.zzc = zzgmvVar;
    }

    public final String toString() {
        Object objO = this.zzc;
        if (objO == zzb) {
            String strValueOf = String.valueOf(this.zzd);
            objO = a.b.o(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objO);
        return a.b.o(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Object zza() {
        zzgmv zzgmvVar = this.zzc;
        zzgmv zzgmvVar2 = zzb;
        if (zzgmvVar != zzgmvVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzgmvVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzgmvVar2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
