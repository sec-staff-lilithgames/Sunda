package com.google.android.gms.analytics;

import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.google.android.gms.internal.gtm.zzen;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzd {
    public static String zza(int i10) {
        return zzn("&cd", i10);
    }

    public static String zzb(int i10) {
        return zzn("cd", i10);
    }

    public static String zzc(int i10) {
        return zzn("cd", i10);
    }

    public static String zzd(int i10) {
        return zzn("&cm", i10);
    }

    public static String zze(int i10) {
        return zzn("cm", i10);
    }

    public static String zzg(int i10) {
        return zzn("&il", i10);
    }

    public static String zzh(int i10) {
        return zzn("il", i10);
    }

    public static String zzi(int i10) {
        return zzn("pi", i10);
    }

    public static String zzj(int i10) {
        return zzn("&pr", i10);
    }

    public static String zzk(int i10) {
        return zzn("pr", i10);
    }

    public static String zzl(int i10) {
        return zzn("&promo", i10);
    }

    public static String zzm(int i10) {
        return zzn(NotificationCompat.CATEGORY_PROMO, i10);
    }

    private static String zzn(String str, int i10) {
        if (i10 <= 0) {
            zzen.zzb("index out of range for prefix", str);
            return "";
        }
        return str + i10;
    }

    public static String zzf(int i10) {
        return zzn(OcvDtWCQ.qAjKtjcH, i10);
    }
}
