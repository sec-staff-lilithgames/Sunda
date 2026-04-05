package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzie implements zziy {
    private static final zzik zza = new zzic();
    private final zzik zzb;

    public zzie() {
        zzhf zzhfVarZza = zzhf.zza();
        int i10 = zziu.zza;
        zzid zzidVar = new zzid(zzhfVarZza, zza);
        byte[] bArr = zzhp.zzb;
        this.zzb = zzidVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zziy
    public final zzix zza(Class cls) {
        int i10 = zziz.zza;
        if (!zzhk.class.isAssignableFrom(cls)) {
            int i11 = zziu.zza;
        }
        zzij zzijVarZzb = this.zzb.zzb(cls);
        if (zzijVarZzb.zzb()) {
            int i12 = zziu.zza;
            return zziq.zzc(zziz.zzm(), zzgz.zza(), zzijVarZzb.zza());
        }
        int i13 = zziu.zza;
        return zzip.zzl(cls, zzijVarZzb, zzis.zza(), zzia.zza(), zziz.zzm(), zzijVarZzb.zzc() + (-1) != 1 ? zzgz.zza() : null, zzii.zza());
    }
}
