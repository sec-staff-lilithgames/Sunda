package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhxl {
    public static final List zza(Object obj, long j10) {
        zzhxa zzhxaVar = (zzhxa) zzhzj.zzn(obj, j10);
        if (zzhxaVar.zza()) {
            return zzhxaVar;
        }
        int size = zzhxaVar.size();
        zzhxa zzhxaVarZzh = zzhxaVar.zzh(size == 0 ? 10 : size + size);
        zzhzj.zzo(obj, j10, zzhxaVarZzh);
        return zzhxaVarZzh;
    }
}
