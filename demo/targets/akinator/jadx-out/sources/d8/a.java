package d8;

import pw.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f51922a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f51923b;

    public a(String[] strArr, l0 l0Var) {
        this.f51922a = strArr;
        this.f51923b = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x0069, TryCatch #0 {IOException -> 0x0069, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d8.a of(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L69
            pw.l[] r0 = new pw.l[r0]     // Catch: java.io.IOException -> L69
            pw.g r1 = new pw.g     // Catch: java.io.IOException -> L69
            r1.<init>()     // Catch: java.io.IOException -> L69
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L69
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L69
            java.lang.String[] r5 = d8.c.f51935g     // Catch: java.io.IOException -> L69
            r6 = 34
            r1.writeByte(r6)     // Catch: java.io.IOException -> L69
            int r7 = r4.length()     // Catch: java.io.IOException -> L69
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L69
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L69
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.writeUtf8(r4, r9, r8)     // Catch: java.io.IOException -> L69
        L3d:
            r1.writeUtf8(r10)     // Catch: java.io.IOException -> L69
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.writeUtf8(r4, r9, r7)     // Catch: java.io.IOException -> L69
        L4a:
            r1.writeByte(r6)     // Catch: java.io.IOException -> L69
            r1.readByte()     // Catch: java.io.IOException -> L69
            pw.l r4 = r1.readByteString()     // Catch: java.io.IOException -> L69
            r0[r3] = r4     // Catch: java.io.IOException -> L69
            int r3 = r3 + 1
            goto La
        L59:
            d8.a r1 = new d8.a     // Catch: java.io.IOException -> L69
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L69
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L69
            pw.l0 r0 = pw.l0.of(r0)     // Catch: java.io.IOException -> L69
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L69
            return r1
        L69:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.of(java.lang.String[]):d8.a");
    }
}
