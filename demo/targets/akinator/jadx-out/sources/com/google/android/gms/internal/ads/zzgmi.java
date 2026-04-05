package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgmi extends zzgmb {
    private final Object zza;

    public zzgmi(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmi) {
            return this.zza.equals(((zzgmi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        return a.b.o(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgmb
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgmb
    public final zzgmb zzb(zzglu zzgluVar) {
        Object objApply = zzgluVar.apply(this.zza);
        zzgmd.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgmi(objApply);
    }
}
