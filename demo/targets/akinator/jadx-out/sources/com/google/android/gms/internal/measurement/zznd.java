package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zznd implements zzny {
    private static final zznk zzb = new zznb();
    private final zznk zza;

    public zznd() {
        zzma zzmaVarZza = zzma.zza();
        int i10 = zznu.zza;
        zznc zzncVar = new zznc(zzmaVarZza, zzb);
        byte[] bArr = zzmp.zzb;
        this.zza = zzncVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzny
    public final zznx zza(Class cls) {
        int i10 = zznz.zza;
        if (!zzmf.class.isAssignableFrom(cls)) {
            int i11 = zznu.zza;
        }
        zznj zznjVarZzc = this.zza.zzc(cls);
        if (zznjVarZzc.zza()) {
            int i12 = zznu.zza;
            return zznq.zzg(zznz.zzA(), zzlu.zza(), zznjVarZzc.zzb());
        }
        int i13 = zznu.zza;
        return zznp.zzl(cls, zznjVarZzc, zzns.zza(), zzmz.zza(), zznz.zzA(), zznjVarZzc.zzc() + (-1) != 1 ? zzlu.zza() : null, zzni.zza());
    }
}
