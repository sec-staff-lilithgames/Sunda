package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class fe implements mh.q1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76270c;

    public /* synthetic */ fe(Object obj, int i10) {
        this.f76269b = i10;
        this.f76270c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b A[Catch: all -> 0x0094, FALL_THROUGH, TryCatch #0 {all -> 0x0094, blocks: (B:6:0x000e, B:8:0x0015, B:10:0x0019, B:12:0x001e, B:36:0x005d, B:38:0x0061, B:40:0x0065, B:42:0x006b, B:44:0x006f, B:46:0x0073, B:48:0x0079, B:50:0x0081, B:52:0x0089, B:58:0x0097), top: B:64:0x000e }] */
    @Override // mh.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f76269b
            switch(r0) {
                case 0: goto L9b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f76270c
            pf.c r0 = (pf.c) r0
            com.google.android.exoplayer2.z0 r10 = (com.google.android.exoplayer2.z0) r10
            java.lang.Object r1 = r0.f81031d
            monitor-enter(r1)
            pf.e r2 = r0.f81035h     // Catch: java.lang.Throwable -> L94
            boolean r2 = r2.f81107m0     // Catch: java.lang.Throwable -> L94
            r3 = 1
            if (r2 == 0) goto L97
            boolean r2 = r0.f81034g     // Catch: java.lang.Throwable -> L94
            if (r2 != 0) goto L97
            int r2 = r10.A     // Catch: java.lang.Throwable -> L94
            r4 = 2
            if (r2 <= r4) goto L97
            java.lang.String r2 = r10.f28802n     // Catch: java.lang.Throwable -> L94
            r5 = 0
            r6 = 32
            if (r2 != 0) goto L26
            goto L6b
        L26:
            int r7 = r2.hashCode()
            r8 = -1
            switch(r7) {
                case -2123537834: goto L4f;
                case 187078296: goto L44;
                case 187078297: goto L3b;
                case 1504578661: goto L30;
                default: goto L2e;
            }
        L2e:
            r4 = r8
            goto L59
        L30:
            java.lang.String r4 = "audio/eac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L39
            goto L2e
        L39:
            r4 = 3
            goto L59
        L3b:
            java.lang.String r7 = "audio/ac4"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L59
            goto L2e
        L44:
            java.lang.String r4 = "audio/ac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4d
            goto L2e
        L4d:
            r4 = r3
            goto L59
        L4f:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L58
            goto L2e
        L58:
            r4 = r5
        L59:
            switch(r4) {
                case 0: goto L5d;
                case 1: goto L5d;
                case 2: goto L5d;
                case 3: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L6b
        L5d:
            int r2 = com.google.android.exoplayer2.util.n1.f28506a     // Catch: java.lang.Throwable -> L94
            if (r2 < r6) goto L97
            pf.g r2 = r0.f81036i     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L97
            boolean r2 = r2.isSpatializationSupported()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L97
        L6b:
            int r2 = com.google.android.exoplayer2.util.n1.f28506a     // Catch: java.lang.Throwable -> L94
            if (r2 < r6) goto L96
            pf.g r2 = r0.f81036i     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L96
            boolean r2 = r2.isSpatializationSupported()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L96
            pf.g r2 = r0.f81036i     // Catch: java.lang.Throwable -> L94
            boolean r2 = r2.isAvailable()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L96
            pf.g r2 = r0.f81036i     // Catch: java.lang.Throwable -> L94
            boolean r2 = r2.isEnabled()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L96
            pf.g r2 = r0.f81036i     // Catch: java.lang.Throwable -> L94
            com.google.android.exoplayer2.audio.k r0 = r0.f81037j     // Catch: java.lang.Throwable -> L94
            boolean r10 = r2.canBeSpatialized(r0, r10)     // Catch: java.lang.Throwable -> L94
            if (r10 == 0) goto L96
            goto L97
        L94:
            r10 = move-exception
            goto L99
        L96:
            r3 = r5
        L97:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L94
            return r3
        L99:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L94
            throw r10
        L9b:
            java.lang.Object r0 = r9.f76270c
            nh.ge r0 = (nh.ge) r0
            nh.td r10 = (nh.td) r10
            mh.q1 r0 = r0.f76303f
            java.lang.Object r10 = r10.getElement()
            boolean r10 = r0.apply(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.fe.apply(java.lang.Object):boolean");
    }
}
