package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhxq implements zzhys {
    private static final zzhxx zzb = new zzhxo();
    private final zzhxx zza;

    public zzhxq() {
        zzhwh zzhwhVarZza = zzhwh.zza();
        int i10 = zzhuv.zza;
        zzhxp zzhxpVar = new zzhxp(zzhwhVarZza, zzb);
        byte[] bArr = zzhxb.zzb;
        this.zza = zzhxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    public final zzhyr zza(Class cls) {
        int i10 = zzhyt.zza;
        if (!zzhwo.class.isAssignableFrom(cls)) {
            int i11 = zzhuv.zza;
        }
        zzhxw zzhxwVarZzc = this.zza.zzc(cls);
        if (zzhxwVarZzc.zza()) {
            int i12 = zzhuv.zza;
            return zzhyd.zzh(zzhyt.zzF(), zzhwb.zza(), zzhxwVarZzc.zzb());
        }
        int i13 = zzhuv.zza;
        return zzhyc.zzm(cls, zzhxwVarZzc, zzhyg.zza(), zzhxm.zza(), zzhyt.zzF(), zzhxwVarZzc.zzc() + (-1) != 1 ? zzhwb.zza() : null, zzhxv.zza());
    }
}
