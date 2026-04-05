package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzcgy;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcim;
import com.google.android.gms.internal.ads.zzegj;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzt extends zzz {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (zzs.zzJ()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to obtain CookieManager.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public zzchj zzb(zzcgy zzcgyVar, zzbdt zzbdtVar, boolean z10, zzegj zzegjVar) {
        return new zzcim(zzcgyVar, zzbdtVar, z10, zzegjVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }
}
