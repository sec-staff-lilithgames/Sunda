package com.google.android.gms.ads.internal.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzce {
    private static zzce zzb;
    String zza;

    private zzce() {
    }

    public static zzce zza() {
        if (zzb == null) {
            zzb = new zzce();
        }
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Updating user agent."
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            java.lang.String r1 = r6.zza
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3e
            android.content.Context r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r7)
            boolean r2 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r2 != 0) goto L1e
            if (r1 != 0) goto L3c
            r1 = 0
        L1e:
            java.lang.String r2 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            r3 = 0
            java.lang.String r4 = "admob_user_agent"
            android.content.SharedPreferences r3 = r7.getSharedPreferences(r4, r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r5 = "user_agent"
            android.content.SharedPreferences$Editor r2 = r3.putString(r5, r2)
            if (r1 != 0) goto L39
            r2.apply()
            goto L3c
        L39:
            com.google.android.gms.common.util.SharedPreferencesUtils.publishWorldReadableSharedPreferences(r7, r2, r4)
        L3c:
            r6.zza = r0
        L3e:
            java.lang.String r7 = "User agent is updated."
            com.google.android.gms.ads.internal.util.zze.zza(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzce.zzb(android.content.Context):void");
    }
}
