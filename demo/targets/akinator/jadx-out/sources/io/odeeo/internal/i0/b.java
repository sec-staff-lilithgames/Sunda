package io.odeeo.internal.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f64307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64308b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64309c;

    /* renamed from: d, reason: collision with root package name */
    public final int f64310d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64311e;

    public b(int i10, int i11, int i12, int i13, int i14) {
        this.f64307a = i10;
        this.f64308b = i11;
        this.f64309c = i12;
        this.f64310d = i13;
        this.f64311e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.i0.b fromFormatLine(java.lang.String r9) {
        /*
            java.lang.String r0 = "Format:"
            boolean r0 = r9.startsWith(r0)
            io.odeeo.internal.q0.a.checkArgument(r0)
            r0 = 7
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            r0 = -1
            r1 = 0
            r4 = r0
            r5 = r4
            r6 = r5
            r7 = r6
            r2 = r1
        L1b:
            int r3 = r9.length
            if (r2 >= r3) goto L6d
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = io.odeeo.internal.t0.c.toLowerCase(r3)
            r3.getClass()
            int r8 = r3.hashCode()
            switch(r8) {
                case 100571: goto L55;
                case 3556653: goto L4a;
                case 109757538: goto L3f;
                case 109780401: goto L34;
                default: goto L32;
            }
        L32:
            r3 = r0
            goto L5f
        L34:
            java.lang.String r8 = "style"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3d
            goto L32
        L3d:
            r3 = 3
            goto L5f
        L3f:
            java.lang.String r8 = "start"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L48
            goto L32
        L48:
            r3 = 2
            goto L5f
        L4a:
            java.lang.String r8 = "text"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L53
            goto L32
        L53:
            r3 = 1
            goto L5f
        L55:
            java.lang.String r8 = "end"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L5e
            goto L32
        L5e:
            r3 = r1
        L5f:
            switch(r3) {
                case 0: goto L69;
                case 1: goto L67;
                case 2: goto L65;
                case 3: goto L63;
                default: goto L62;
            }
        L62:
            goto L6a
        L63:
            r6 = r2
            goto L6a
        L65:
            r4 = r2
            goto L6a
        L67:
            r7 = r2
            goto L6a
        L69:
            r5 = r2
        L6a:
            int r2 = r2 + 1
            goto L1b
        L6d:
            if (r4 == r0) goto L7a
            if (r5 == r0) goto L7a
            if (r7 == r0) goto L7a
            io.odeeo.internal.i0.b r3 = new io.odeeo.internal.i0.b
            int r8 = r9.length
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L7a:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.i0.b.fromFormatLine(java.lang.String):io.odeeo.internal.i0.b");
    }
}
