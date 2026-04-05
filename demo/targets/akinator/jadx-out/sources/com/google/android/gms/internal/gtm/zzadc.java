package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzadc implements zzadj {
    private final zzadj[] zza;

    public zzadc(zzadj... zzadjVarArr) {
        this.zza = zzadjVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzadj
    public final zzadi zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzadj zzadjVar = this.zza[i10];
            if (zzadjVar.zzc(cls)) {
                return zzadjVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.gtm.zzadj
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
