package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhxp implements zzhxx {
    private final zzhxx[] zza;

    public zzhxp(zzhxx... zzhxxVarArr) {
        this.zza = zzhxxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhxx
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhxx
    public final zzhxw zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzhxx zzhxxVar = this.zza[i10];
            if (zzhxxVar.zzb(cls)) {
                return zzhxxVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
