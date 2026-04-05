package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbfe extends zzbff {
    private static final String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final String zza(String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        if (TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        if (TextUtils.isEmpty(strZzb2)) {
            return strZzb;
        }
        return a.b.o(new StringBuilder(String.valueOf(strZzb).length() + 1 + String.valueOf(strZzb2).length()), strZzb, ",", strZzb2);
    }
}
