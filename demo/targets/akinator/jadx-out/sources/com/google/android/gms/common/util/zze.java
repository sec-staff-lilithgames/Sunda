package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zze {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zza.matcher(str);
        StringBuilder sb2 = null;
        int iEnd = 0;
        while (matcher.find()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            int iStart = matcher.start();
            int i10 = iStart;
            while (i10 >= 0 && str.charAt(i10) == '\\') {
                i10--;
            }
            if ((iStart - i10) % 2 != 0) {
                int i11 = Integer.parseInt(matcher.group().substring(2), 16);
                sb2.append((CharSequence) str, iEnd, matcher.start());
                if (i11 == 92) {
                    sb2.append("\\\\");
                } else {
                    sb2.append(Character.toChars(i11));
                }
                iEnd = matcher.end();
            }
        }
        if (sb2 == null) {
            return str;
        }
        if (iEnd < matcher.regionEnd()) {
            sb2.append((CharSequence) str, iEnd, matcher.regionEnd());
        }
        return sb2.toString();
    }
}
