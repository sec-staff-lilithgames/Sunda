package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzblm implements zzblx {
    static final /* synthetic */ zzblm zza = new zzblm();

    private /* synthetic */ zzblm() {
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcik zzcikVar = (zzcik) obj;
        zzblx zzblxVar = zzblw.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjd)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(zzcikVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
        sb2.append("/canOpenApp;");
        sb2.append(str);
        sb2.append(";");
        sb2.append(boolValueOf);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        ((zzbot) zzcikVar).zze("openableApp", map2);
    }
}
