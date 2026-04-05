package pw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final k f81937b;

    /* renamed from: c, reason: collision with root package name */
    public final g f81938c;

    /* renamed from: e, reason: collision with root package name */
    public w0 f81939e;

    /* renamed from: f, reason: collision with root package name */
    public int f81940f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81941g;

    /* renamed from: h, reason: collision with root package name */
    public long f81942h;

    public o0(k upstream) {
        kotlin.jvm.internal.e0.checkNotNullParameter(upstream, "upstream");
        this.f81937b = upstream;
        g buffer = upstream.getBuffer();
        this.f81938c = buffer;
        w0 w0Var = buffer.f81896b;
        this.f81939e = w0Var;
        this.f81940f = w0Var != null ? w0Var.f81995b : -1;
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f81941g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f81995b) goto L15;
     */
    @Override // pw.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(pw.g r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L70
            boolean r3 = r8.f81941g
            if (r3 != 0) goto L68
            pw.w0 r3 = r8.f81939e
            pw.g r4 = r8.f81938c
            if (r3 == 0) goto L2b
            pw.w0 r5 = r4.f81896b
            if (r3 != r5) goto L23
            int r3 = r8.f81940f
            kotlin.jvm.internal.e0.checkNotNull(r5)
            int r5 = r5.f81995b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f81942h
            r2 = 1
            long r0 = r0 + r2
            pw.k r2 = r8.f81937b
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            pw.w0 r0 = r8.f81939e
            if (r0 != 0) goto L4f
            pw.w0 r0 = r4.f81896b
            if (r0 == 0) goto L4f
            r8.f81939e = r0
            kotlin.jvm.internal.e0.checkNotNull(r0)
            int r0 = r0.f81995b
            r8.f81940f = r0
        L4f:
            long r0 = r4.size()
            long r2 = r8.f81942h
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            pw.g r2 = r8.f81938c
            long r4 = r8.f81942h
            r3 = r9
            r2.copyTo(r3, r4, r6)
            long r9 = r8.f81942h
            long r9 = r9 + r6
            r8.f81942h = r9
            return r6
        L68:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L70:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p0.o2.m(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.o0.read(pw.g, long):long");
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.f81937b.timeout();
    }
}
