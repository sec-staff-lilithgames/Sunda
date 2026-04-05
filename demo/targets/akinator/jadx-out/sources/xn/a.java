package xn;

import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f92041a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f92042b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f92043c;

    public a(int i10) {
        this(new qe.a(i10, 2), new qe.a(i10, 3));
    }

    public void experimentalSetAsyncCryptoFlagEnabled(boolean z10) {
        this.f92043c = z10;
    }

    public a(v2 v2Var, v2 v2Var2) {
        this.f92041a = v2Var;
        this.f92042b = v2Var2;
        this.f92043c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:4:0x001a, B:6:0x0020, B:10:0x002b, B:12:0x0033, B:16:0x004a, B:15:0x003c), top: B:37:0x001a }] */
    @Override // xn.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xn.b createAdapter(xn.l r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.String r0 = "createCodec:"
            xn.s r1 = r9.f92104a
            java.lang.String r1 = r1.f92111a
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78
            r3.<init>(r0)     // Catch: java.lang.Exception -> L78
            r3.append(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L78
            io.bidmachine.media3.common.util.w0.beginSection(r0)     // Catch: java.lang.Exception -> L78
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r1)     // Catch: java.lang.Exception -> L78
            boolean r1 = r8.f92043c     // Catch: java.lang.Exception -> L3a
            r3 = 35
            if (r1 == 0) goto L3c
            io.bidmachine.media3.common.b r1 = r9.f92106c     // Catch: java.lang.Exception -> L3a
            int r4 = io.bidmachine.media3.common.util.a1.f60679a     // Catch: java.lang.Exception -> L3a
            r5 = 34
            if (r4 >= r5) goto L29
            goto L3c
        L29:
            if (r4 >= r3) goto L33
            java.lang.String r1 = r1.f60665o     // Catch: java.lang.Exception -> L3a
            boolean r1 = gn.x0.isVideo(r1)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L3c
        L33:
            xn.k0 r1 = new xn.k0     // Catch: java.lang.Exception -> L3a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3a
            r4 = 4
            goto L4a
        L3a:
            r9 = move-exception
            goto L7a
        L3c:
            xn.e r1 = new xn.e     // Catch: java.lang.Exception -> L3a
            mh.v2 r4 = r8.f92042b     // Catch: java.lang.Exception -> L3a
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L3a
            android.os.HandlerThread r4 = (android.os.HandlerThread) r4     // Catch: java.lang.Exception -> L3a
            r1.<init>(r0, r4)     // Catch: java.lang.Exception -> L3a
            r4 = 0
        L4a:
            xn.b r5 = new xn.b     // Catch: java.lang.Exception -> L3a
            mh.v2 r6 = r8.f92041a     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Exception -> L3a
            android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch: java.lang.Exception -> L3a
            xn.k r7 = r9.f92109f     // Catch: java.lang.Exception -> L3a
            r5.<init>(r0, r6, r1, r7)     // Catch: java.lang.Exception -> L3a
            io.bidmachine.media3.common.util.w0.endSection()     // Catch: java.lang.Exception -> L6d
            android.view.Surface r1 = r9.f92107d     // Catch: java.lang.Exception -> L6d
            if (r1 != 0) goto L70
            xn.s r2 = r9.f92104a     // Catch: java.lang.Exception -> L6d
            boolean r2 = r2.f92120j     // Catch: java.lang.Exception -> L6d
            if (r2 == 0) goto L70
            int r2 = io.bidmachine.media3.common.util.a1.f60679a     // Catch: java.lang.Exception -> L6d
            if (r2 < r3) goto L70
            r4 = r4 | 8
            goto L70
        L6d:
            r9 = move-exception
            r2 = r5
            goto L7a
        L70:
            android.media.MediaFormat r2 = r9.f92105b     // Catch: java.lang.Exception -> L6d
            android.media.MediaCrypto r9 = r9.f92108e     // Catch: java.lang.Exception -> L6d
            xn.b.a(r5, r2, r1, r9, r4)     // Catch: java.lang.Exception -> L6d
            return r5
        L78:
            r9 = move-exception
            r0 = r2
        L7a:
            if (r2 != 0) goto L82
            if (r0 == 0) goto L85
            r0.release()
            goto L85
        L82:
            r2.release()
        L85:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.a.createAdapter(xn.l):xn.b");
    }
}
