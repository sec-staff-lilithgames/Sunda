package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgv {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static long zzb(String str, String str2) throws NumberFormatException {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        long j10 = -1;
        String str3 = OIPXcgrVyyxoLF.AXwgWxYOs;
        if (!zIsEmpty) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 28);
                sb2.append("Unexpected Content-Length [");
                sb2.append(str);
                sb2.append(str3);
                zzdt.zze("HttpUtil", sb2.toString());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            String strGroup = matcher.group(2);
            if (strGroup == null) {
                throw null;
            }
            long j11 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            if (strGroup2 == null) {
                throw null;
            }
            long j12 = (j11 - Long.parseLong(strGroup2)) + 1;
            if (j10 < 0) {
                return j12;
            }
            if (j10 == j12) {
                return j10;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + 1);
            sb3.append("Inconsistent headers [");
            sb3.append(str);
            sb3.append("] [");
            sb3.append(str2);
            sb3.append(str3);
            zzdt.zzc("HttpUtil", sb3.toString());
            return Math.max(j10, j12);
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb4.append("Unexpected Content-Range [");
            sb4.append(str2);
            sb4.append(str3);
            zzdt.zze("HttpUtil", sb4.toString());
            return j10;
        }
    }
}
