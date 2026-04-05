package com.fyber.inneractive.sdk.cache.session;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23144a;

    public c(e eVar) {
        this.f23144a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            android.app.Application r0 = com.fyber.inneractive.sdk.util.o.f26796a
            java.lang.String r1 = "session_details.json"
            r2 = 0
            java.io.FileInputStream r3 = r0.openFileInput(r1)     // Catch: java.lang.Throwable -> L22
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L23
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> L23
            int r6 = r3.read(r5)     // Catch: java.lang.Throwable -> L23
            if (r6 != r4) goto L1d
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = "UTF-8"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L23
            goto L1e
        L1d:
            r4 = r2
        L1e:
            com.fyber.inneractive.sdk.util.v.a(r3)
            goto L30
        L22:
            r3 = r2
        L23:
            java.lang.String r4 = "readFileFromContext failed reading %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L61
            com.fyber.inneractive.sdk.util.IAlog.a(r4, r5)     // Catch: java.lang.Throwable -> L61
            com.fyber.inneractive.sdk.util.v.a(r3)
            r4 = r2
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L5b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            r2 = r3
            goto L45
        L3d:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Failed parsing SessionCache"
            com.fyber.inneractive.sdk.util.IAlog.f(r4, r3)
        L45:
            if (r2 == 0) goto L52
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.r.f26804b
            com.fyber.inneractive.sdk.cache.session.b r1 = new com.fyber.inneractive.sdk.cache.session.b
            r1.<init>(r7, r2)
            r0.post(r1)
            goto L60
        L52:
            r0.deleteFile(r1)
            com.fyber.inneractive.sdk.cache.session.e r0 = r7.f23144a
            r0.getClass()
            goto L60
        L5b:
            com.fyber.inneractive.sdk.cache.session.e r0 = r7.f23144a
            r0.getClass()
        L60:
            return
        L61:
            r0 = move-exception
            com.fyber.inneractive.sdk.util.v.a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.cache.session.c.run():void");
    }
}
