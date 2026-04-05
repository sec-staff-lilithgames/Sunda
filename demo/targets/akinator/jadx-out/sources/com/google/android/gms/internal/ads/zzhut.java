package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhut implements zzhyh {
    static {
        int i10 = zzhvy.zzb;
        int i11 = zzhuv.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhyh
    public final /* synthetic */ Object zza(InputStream inputStream, zzhvy zzhvyVar) throws zzhxd {
        zzhzb zzhzbVarZzaU;
        zzhvn zzhvnVarZzF = zzhvn.zzF(inputStream, 4096);
        zzhxz zzhxzVar = (zzhxz) zzb(zzhvnVarZzF, zzhvyVar);
        zzhvnVarZzF.zzb(0);
        if (zzhxzVar == null || zzhxzVar.zzbi()) {
            return zzhxzVar;
        }
        if (zzhxzVar instanceof zzhur) {
            zzhzbVarZzaU = ((zzhur) zzhxzVar).zzaU();
        } else {
            if (zzhxzVar instanceof zzhus) {
                throw null;
            }
            zzhzbVarZzaU = new zzhzb(zzhxzVar);
        }
        throw zzhzbVarZzaU.zza();
    }
}
