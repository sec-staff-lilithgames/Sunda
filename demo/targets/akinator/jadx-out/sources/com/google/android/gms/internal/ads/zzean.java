package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzean implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzean(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzean zza(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzean(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        zzfks zzfksVar = (zzfks) this.zza.zzb();
        final CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza((Context) this.zzb.zzb());
        zzfkm zzfkmVar = zzfkm.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfksVar);
        return zzfkd.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbf));
            }
        }, zzfkmVar, zzfksVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzeaf.zza).zzi();
    }
}
