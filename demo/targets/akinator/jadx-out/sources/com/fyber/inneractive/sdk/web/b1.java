package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f26838b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final b1 f26839c = new b1();

    /* renamed from: a, reason: collision with root package name */
    public final z0 f26840a = new z0();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.web.c1 a(java.net.HttpURLConnection r11, java.nio.ByteBuffer r12) throws java.io.IOException {
        /*
            r11.connect()
            r0 = 0
            r1 = r0
        L5:
            r2 = 20
            r3 = 0
            if (r1 >= r2) goto Ld8
            int r9 = r11.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            if (r9 < r2) goto L39
            r2 = 400(0x190, float:5.6E-43)
            if (r9 < r2) goto L17
            goto L39
        L17:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r11.getHeaderField(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L25
            goto Ld8
        L25:
            r11.disconnect()
            java.net.URL r11 = new java.net.URL
            r11.<init>(r2)
            java.net.URLConnection r11 = r11.openConnection()
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            r11.connect()
            int r1 = r1 + 1
            goto L5
        L39:
            java.io.InputStream r1 = r11.getInputStream()     // Catch: java.lang.Throwable -> L51
            byte[] r12 = r12.array()     // Catch: java.lang.Throwable -> L52
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
        L46:
            int r4 = r1.read(r12)     // Catch: java.lang.Throwable -> L53
            r5 = -1
            if (r4 == r5) goto L53
            r2.write(r12, r0, r4)     // Catch: java.lang.Throwable -> L53
            goto L46
        L51:
            r1 = r3
        L52:
            r2 = r3
        L53:
            com.fyber.inneractive.sdk.util.v.b(r1)
            r11.disconnect()
            java.lang.String r12 = r11.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r4 = ""
            if (r1 != 0) goto L83
            java.lang.String r1 = ";"
            java.lang.String[] r12 = r12.split(r1)
            int r1 = r12.length
            if (r1 <= 0) goto L75
            r1 = r12[r0]
            java.lang.String r1 = r1.trim()
            goto L76
        L75:
            r1 = r4
        L76:
            int r5 = r12.length
            r6 = 1
            if (r5 <= r6) goto L80
            r12 = r12[r6]
            java.lang.String r4 = r12.trim()
        L80:
            r7 = r1
            r8 = r4
            goto L85
        L83:
            r7 = r4
            r8 = r7
        L85:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r12 = r11.getHeaderFields()
            if (r12 == 0) goto Lbc
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L98:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbc
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r12.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L98
            int r10 = r5.size()
            if (r10 <= 0) goto L98
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r6.put(r4, r5)
            goto L98
        Lbc:
            java.lang.String r10 = r11.getResponseMessage()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto Lc7
            goto Ld8
        Lc7:
            com.fyber.inneractive.sdk.web.c1 r4 = new com.fyber.inneractive.sdk.web.c1
            if (r2 != 0) goto Lcf
            byte[] r11 = com.fyber.inneractive.sdk.web.b1.f26838b
        Lcd:
            r5 = r11
            goto Ld4
        Lcf:
            byte[] r11 = r2.toByteArray()
            goto Lcd
        Ld4:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.b1.a(java.net.HttpURLConnection, java.nio.ByteBuffer):com.fyber.inneractive.sdk.web.c1");
    }

    public static void a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
