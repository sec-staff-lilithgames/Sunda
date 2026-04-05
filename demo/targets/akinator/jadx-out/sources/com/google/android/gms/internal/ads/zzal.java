package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzal {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        return zzb;
    }

    public static synchronized void zzb(String str) {
        if (zza.add(str)) {
            String str2 = zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            zzb = sb2.toString();
        }
    }
}
