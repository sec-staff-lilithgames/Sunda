package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcah {
    public static String zza(String str, Context context, boolean z10, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strZzj;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaI)).booleanValue() && !z10) || !com.google.android.gms.ads.internal.zzt.zzD().zza(context) || TextUtils.isEmpty(str) || (strZzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaB);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaA)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZzj);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzj(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzj, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZzj);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaz)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", strZzj).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzj(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzj, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", strZzj).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzt.zzD().zza(context)) {
            return uri.toString();
        }
        String strZzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context);
        if (strZzj == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaB);
        String string = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaA)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZzj);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaz)).booleanValue()) {
                String string2 = zzc(zzd(string, context), "fbs_aeid", strZzj).toString();
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
                return string2;
            }
        }
        return string;
    }

    public static Uri zzc(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i10));
        com.google.android.gms.internal.play_billing.a.B(sb2, str2, C3191e4.i.f36525b, str3, C3191e4.i.f36527c);
        sb2.append(str.substring(i10));
        return Uri.parse(sb2.toString());
    }

    private static String zzd(String str, Context context) {
        String strZzh = com.google.android.gms.ads.internal.zzt.zzD().zzh(context);
        String strZzi = com.google.android.gms.ads.internal.zzt.zzD().zzi(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzh)) {
            str = zzc(str, "gmp_app_id", strZzh).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzi)) ? str : zzc(str, "fbs_aiid", strZzi).toString();
    }
}
