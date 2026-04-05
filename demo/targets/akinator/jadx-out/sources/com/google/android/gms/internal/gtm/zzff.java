package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzff {
    public static long zza(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static zzav zzb(zzeo zzeoVar, String str) {
        Preconditions.checkNotNull(zzeoVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map<String, String> map = HttpUtils.parse(new URI("?" + str), C.UTF8_NAME);
            zzav zzavVar = new zzav();
            zzavVar.zzp(map.get("utm_content"));
            zzavVar.zzu(map.get("utm_medium"));
            zzavVar.zzv(map.get("utm_campaign"));
            zzavVar.zzw(map.get("utm_source"));
            zzavVar.zzt(map.get("utm_term"));
            zzavVar.zzs(map.get("utm_id"));
            zzavVar.zzo(map.get("anid"));
            zzavVar.zzr(map.get("gclid"));
            zzavVar.zzq(map.get("dclid"));
            zzavVar.zzn(map.get("aclid"));
            return zzavVar;
        } catch (URISyntaxException e10) {
            zzeoVar.zzR("No valid campaign data found", e10);
            return null;
        }
    }

    public static String zzc(boolean z10) {
        return true != z10 ? "0" : "1";
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry().toLowerCase(locale));
        }
        return sb2.toString();
    }

    public static MessageDigest zze(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static Map zzf(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split(C3191e4.i.f36527c)) {
            String[] strArrSplit = str2.split(C3191e4.i.f36525b, 3);
            int length = strArrSplit.length;
            if (length > 1) {
                map.put(strArrSplit[0], TextUtils.isEmpty(strArrSplit[1]) ? null : strArrSplit[1]);
                if (length == 3 && !TextUtils.isEmpty(strArrSplit[1]) && !map.containsKey(strArrSplit[1])) {
                    map.put(strArrSplit[1], TextUtils.isEmpty(strArrSplit[2]) ? null : strArrSplit[2]);
                }
            } else if (length == 1 && strArrSplit[0].length() != 0) {
                map.put(strArrSplit[0], null);
            }
        }
        return map;
    }

    public static void zzg(Map map, String str, String str2) {
        if (str2 == null || map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    public static void zzh(Map map, String str, Map map2) {
        zzg(map, str, (String) map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z10) throws PackageManager.NameNotFoundException {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (!z10) {
                    return true;
                }
                if (receiverInfo.exported) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzj(double d10, String str) {
        int i10;
        if (d10 > 0.0d && d10 < 100.0d) {
            if (TextUtils.isEmpty(str)) {
                i10 = 1;
            } else {
                i10 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char cCharAt = str.charAt(length);
                    i10 = ((i10 << 6) & 268435455) + cCharAt + (cCharAt << 14);
                    int i11 = 266338304 & i10;
                    if (i11 != 0) {
                        i10 ^= i11 >> 21;
                    }
                }
            }
            if (i10 % 10000 >= d10 * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
