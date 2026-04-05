package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbla implements zzblx {
    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgy zzcgyVar = (zzcgy) obj;
        try {
            String str = (String) map.get("enabled");
            zzblx zzblxVar = zzblw.zza;
            if (!zzglm.zze("true", str) && !zzglm.zze("false", str)) {
                return;
            }
            zzfwu.zza(zzcgyVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
