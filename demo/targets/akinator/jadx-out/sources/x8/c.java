package x8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements n8.y {

    /* renamed from: b, reason: collision with root package name */
    public static final n8.u f91807b = n8.u.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c, reason: collision with root package name */
    public static final n8.u f91808c = n8.u.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a, reason: collision with root package name */
    public final q8.b f91809a;

    public c(q8.b bVar) {
        this.f91809a = bVar;
    }

    @Override // n8.y
    public n8.c getEncodeStrategy(n8.v vVar) {
        return n8.c.f75834c;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #3 {all -> 0x0067, blocks: (B:10:0x0035, B:23:0x0063, B:39:0x0081, B:41:0x0087, B:45:0x00cc, B:46:0x00cf, B:36:0x007c), top: B:54:0x0035 }] */
    @Override // n8.y, n8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean encode(p8.v0 r10, java.io.File r11, n8.v r12) {
        /*
            r9 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            java.lang.Object r10 = r10.get()
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            n8.u r2 = x8.c.f91808c
            java.lang.Object r3 = r12.get(r2)
            android.graphics.Bitmap$CompressFormat r3 = (android.graphics.Bitmap.CompressFormat) r3
            if (r3 == 0) goto L15
            goto L20
        L15:
            boolean r3 = r10.hasAlpha()
            if (r3 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            int r4 = r10.getWidth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r10.getHeight()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "encode: [%dx%d] %s"
            k9.i.beginSectionFormat(r6, r4, r5, r3)
            long r4 = j9.l.getLogTime()     // Catch: java.lang.Throwable -> L67
            n8.u r6 = x8.c.f91807b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r12.get(r6)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L67
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L67
            r7 = 0
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            q8.b r11 = r9.f91809a
            if (r11 == 0) goto L5c
            com.bumptech.glide.load.data.c r7 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L59
            r7.<init>(r8, r11)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L59
            goto L5d
        L55:
            r10 = move-exception
            r7 = r8
            goto Lca
        L59:
            r11 = move-exception
            r7 = r8
            goto L6e
        L5c:
            r7 = r8
        L5d:
            r10.compress(r3, r6, r7)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r7.close()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r7.close()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            goto L69
        L67:
            r10 = move-exception
            goto Ld0
        L69:
            r11 = 1
            goto L80
        L6b:
            r10 = move-exception
            goto Lca
        L6d:
            r11 = move-exception
        L6e:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L7a
            java.lang.String r6 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r6, r11)     // Catch: java.lang.Throwable -> L6b
        L7a:
            if (r7 == 0) goto L7f
            r7.close()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L7f
        L7f:
            r11 = 0
        L80:
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto Lc6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r6.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = " of size "
            r6.append(r1)     // Catch: java.lang.Throwable -> L67
            int r1 = j9.s.getBitmapByteSize(r10)     // Catch: java.lang.Throwable -> L67
            r6.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = " in "
            r6.append(r1)     // Catch: java.lang.Throwable -> L67
            double r3 = j9.l.getElapsedMillis(r4)     // Catch: java.lang.Throwable -> L67
            r6.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = ", options format: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L67
            r6.append(r12)     // Catch: java.lang.Throwable -> L67
            java.lang.String r12 = ", hasAlpha: "
            r6.append(r12)     // Catch: java.lang.Throwable -> L67
            boolean r10 = r10.hasAlpha()     // Catch: java.lang.Throwable -> L67
            r6.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = r6.toString()     // Catch: java.lang.Throwable -> L67
            android.util.Log.v(r0, r10)     // Catch: java.lang.Throwable -> L67
        Lc6:
            k9.i.endSection()
            return r11
        Lca:
            if (r7 == 0) goto Lcf
            r7.close()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> Lcf
        Lcf:
            throw r10     // Catch: java.lang.Throwable -> L67
        Ld0:
            k9.i.endSection()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.c.encode(p8.v0, java.io.File, n8.v):boolean");
    }

    @Deprecated
    public c() {
        this.f91809a = null;
    }
}
