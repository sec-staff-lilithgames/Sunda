package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzadd implements zzady {
    private static final zzadj zza = new zzadb();
    private final zzadj zzb;

    public zzadd() {
        zzabz zzabzVarZza = zzabz.zza();
        int i10 = zzadt.zza;
        zzadc zzadcVar = new zzadc(zzabzVarZza, zza);
        byte[] bArr = zzaco.zzb;
        this.zzb = zzadcVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzady
    public final zzadx zza(Class cls) {
        int i10 = zzadz.zza;
        if (!zzacf.class.isAssignableFrom(cls)) {
            int i11 = zzadt.zza;
        }
        zzadi zzadiVarZzb = this.zzb.zzb(cls);
        if (zzadiVarZzb.zzb()) {
            int i12 = zzadt.zza;
            return zzadp.zzc(zzadz.zzm(), zzabt.zza(), zzadiVarZzb.zza());
        }
        int i13 = zzadt.zza;
        return zzado.zzm(cls, zzadiVarZzb, zzads.zza(), zzacz.zza(), zzadz.zzm(), zzadiVarZzb.zzc() + (-1) != 1 ? zzabt.zza() : null, zzadh.zza());
    }
}
