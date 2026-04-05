package com.mbridge.msdk.foundation.same.image;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream a(android.graphics.Bitmap r4) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r1.close()     // Catch: java.lang.Exception -> L1a
            goto L22
        L1a:
            r0 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L22
            r0.printStackTrace()
        L22:
            r0 = r4
            goto L45
        L24:
            r4 = move-exception
            goto L47
        L26:
            r4 = move-exception
            goto L2c
        L28:
            r4 = move-exception
            goto L46
        L2a:
            r4 = move-exception
            r1 = r0
        L2c:
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L37
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r4 = move-exception
            r0 = r1
            goto L46
        L37:
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.lang.Exception -> L3d
            goto L45
        L3d:
            r4 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L45
            r4.printStackTrace()
        L45:
            return r0
        L46:
            r1 = r0
        L47:
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.lang.Exception -> L4d
            goto L55
        L4d:
            r0 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L55
            r0.printStackTrace()
        L55:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.image.a.a(android.graphics.Bitmap):java.io.InputStream");
    }
}
