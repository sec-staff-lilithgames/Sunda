package com.google.android.gms.internal.ads;

import com.moloco.sdk.BKC.JzVV;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhxs {
    private final zzhxr zza;

    public static zzhxs zza(zzhzp zzhzpVar, Object obj, zzhzp zzhzpVar2, Object obj2) {
        return new zzhxs(zzhzpVar, "", zzhzpVar2, obj2);
    }

    public static void zzb(zzhvt zzhvtVar, zzhxr zzhxrVar, Object obj, Object obj2) throws IOException {
        zzhwd.zzf(zzhvtVar, zzhxrVar.zza, 1, obj);
        zzhwd.zzf(zzhvtVar, zzhxrVar.zzc, 2, obj2);
    }

    public static int zzc(zzhxr zzhxrVar, Object obj, Object obj2) {
        return zzhwd.zzh(zzhxrVar.zza, 1, obj) + zzhwd.zzh(zzhxrVar.zzc, 2, obj2);
    }

    public final int zzd(int i10, Object obj, Object obj2) {
        zzhxr zzhxrVar = this.zza;
        int iZzA = zzhvt.zzA(i10 << 3);
        int iZzc = zzc(zzhxrVar, obj, obj2);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.b(iZzc, iZzc, iZzA);
    }

    public final zzhxr zze() {
        return this.zza;
    }

    private zzhxs(zzhzp zzhzpVar, Object obj, zzhzp zzhzpVar2, Object obj2) {
        this.zza = new zzhxr(zzhzpVar, JzVV.kqcKGYZyUI, zzhzpVar2, obj2);
    }
}
