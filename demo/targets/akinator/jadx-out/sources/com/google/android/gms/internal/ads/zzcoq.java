package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import b0.e2;
import com.ironsource.G5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcoq implements zzcnu {
    private final CookieManager zza;

    public zzcoq(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbf), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbf);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZze = zzgms.zza(zzglr.zzc(';')).zze(cookie);
            for (int i10 = 0; i10 < listZze.size(); i10++) {
                Iterator it = zzgms.zza(zzglr.zzc(G5.T)).zzd((String) listZze.get(i10)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(e2.n(new StringBuilder(String.valueOf(0).length() + 70), "position (0) must be less than the number of elements that remained (", 0, ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaR))));
            }
        }
    }
}
