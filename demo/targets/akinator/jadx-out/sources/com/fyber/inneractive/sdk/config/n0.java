package com.fyber.inneractive.sdk.config;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n0 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r5, com.fyber.inneractive.sdk.config.w r6) {
        /*
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r5 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch: java.lang.Throwable -> L31
            boolean r2 = r5.isLimitAdTrackingEnabled()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "limit ad tracking: %s"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L27
            com.fyber.inneractive.sdk.util.IAlog.e(r3, r4)     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L29
            java.lang.String r0 = r5.getId()     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "advertising id: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L27
            com.fyber.inneractive.sdk.util.IAlog.e(r5, r3)     // Catch: java.lang.Throwable -> L27
            goto L4a
        L27:
            r5 = move-exception
            goto L33
        L29:
            java.lang.String r5 = "user has opt out of Ads Personalization. not accessing Advertising ID."
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            com.fyber.inneractive.sdk.util.IAlog.e(r5, r3)     // Catch: java.lang.Throwable -> L27
            goto L4a
        L31:
            r5 = move-exception
            r2 = r1
        L33:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Handled Exception:"
            com.fyber.inneractive.sdk.util.IAlog.e(r4, r3)
            java.lang.String r5 = com.fyber.inneractive.sdk.util.v.b(r5)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.e(r5, r3)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r3 = "Advertising ID is not available. Please add Google Play Services library to improve your ad targeting."
            com.fyber.inneractive.sdk.util.IAlog.c(r3, r5)
        L4a:
            monitor-enter(r6)
            com.fyber.inneractive.sdk.config.v r5 = r6.f23418b     // Catch: java.lang.Throwable -> L55
            r5.f23414a = r0     // Catch: java.lang.Throwable -> L55
            r5.f23415b = r2     // Catch: java.lang.Throwable -> L55
            r5.f23416c = r1     // Catch: java.lang.Throwable -> L55
            monitor-exit(r6)
            return
        L55:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.n0.a(android.content.Context, com.fyber.inneractive.sdk.config.w):void");
    }
}
