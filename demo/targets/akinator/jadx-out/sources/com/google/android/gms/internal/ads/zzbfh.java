package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class zzbfh {
    private final Map zza = new HashMap();
    private final zzbfj zzb;

    public zzbfh(zzbfj zzbfjVar) {
        this.zzb = zzbfjVar;
    }

    public final void zza(String str, zzbfg zzbfgVar) {
        this.zza.put(str, zzbfgVar);
    }

    public final void zzb(String str, String str2, long j10) {
        Map map = this.zza;
        zzbfg zzbfgVar = (zzbfg) map.get(str2);
        String[] strArr = {str};
        if (zzbfgVar != null) {
            this.zzb.zzb(zzbfgVar, j10, strArr);
        }
        map.put(str, new zzbfg(j10, null, null));
    }

    public final zzbfj zzc() {
        return this.zzb;
    }
}
