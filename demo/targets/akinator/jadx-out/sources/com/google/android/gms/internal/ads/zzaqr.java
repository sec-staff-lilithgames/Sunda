package com.google.android.gms.internal.ads;

import com.ironsource.Y1;
import com.mbridge.msdk.foundation.download.Command;
import io.ktor.client.utils.CacheControl;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaqr {
    public static zzapd zza(zzapq zzapqVar) throws NumberFormatException {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long jZzb;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzapqVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb2 = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals(CacheControl.NO_CACHE) || strTrim.equals(CacheControl.NO_STORE)) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals(CacheControl.MUST_REVALIDATE) || strTrim.equals(CacheControl.PROXY_REVALIDATE)) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb3 = str3 != null ? zzb(str3) : j10;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j13 = jCurrentTimeMillis;
            jZzb = zzb(str4);
        } else {
            j13 = jCurrentTimeMillis;
            jZzb = j10;
        }
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i10 != 0) {
            long j16 = (j12 * 1000) + j13;
            j15 = z10 ? j16 : (j11 * 1000) + j16;
            j14 = j16;
        } else {
            j14 = (jZzb2 <= j10 || jZzb3 < jZzb2) ? j10 : (jZzb3 - jZzb2) + j13;
            j15 = j14;
        }
        zzapd zzapdVar = new zzapd();
        zzapdVar.zza = zzapqVar.zzb;
        zzapdVar.zzb = str5;
        zzapdVar.zzf = j14;
        zzapdVar.zze = j15;
        zzapdVar.zzc = jZzb2;
        zzapdVar.zzd = jZzb;
        zzapdVar.zzg = map;
        zzapdVar.zzh = zzapqVar.zzd;
        return zzapdVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || Y1.f35726f.equals(str)) {
                zzaqg.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqg.zzd(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
