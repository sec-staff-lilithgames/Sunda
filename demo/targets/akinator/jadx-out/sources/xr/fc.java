package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class fc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rc f92516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gc f92517c;

    public fc(gc gcVar, rc rcVar) {
        this.f92517c = gcVar;
        this.f92516b = rcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0007, B:25:0x007c, B:7:0x0013, B:9:0x002c, B:11:0x0034, B:16:0x0042, B:20:0x0053, B:24:0x0073, B:23:0x005e), top: B:35:0x0007 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r15 = this;
            xr.gc r0 = r15.f92517c
            xr.tc r0 = r0.f92571c
            java.lang.Object r1 = r0.f93047i
            monitor-enter(r1)
            xr.gc r0 = r15.f92517c     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.manager.d0 r2 = r0.f92570b     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.f16629a     // Catch: java.lang.Throwable -> L51
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L13
            goto L7c
        L13:
            xr.tc r0 = r0.f92571c     // Catch: java.lang.Throwable -> L51
            xr.ic r2 = r0.f93053o     // Catch: java.lang.Throwable -> L51
            xr.rc r5 = r15.f92516b     // Catch: java.lang.Throwable -> L51
            xr.ic r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L51
            r0.f93053o = r2     // Catch: java.lang.Throwable -> L51
            xr.gc r0 = r15.f92517c     // Catch: java.lang.Throwable -> L51
            xr.tc r0 = r0.f92571c     // Catch: java.lang.Throwable -> L51
            xr.ic r2 = r0.f93053o     // Catch: java.lang.Throwable -> L51
            boolean r0 = r0.g(r2)     // Catch: java.lang.Throwable -> L51
            r2 = 0
            if (r0 == 0) goto L53
            xr.gc r0 = r15.f92517c     // Catch: java.lang.Throwable -> L51
            xr.tc r0 = r0.f92571c     // Catch: java.lang.Throwable -> L51
            xr.sc r0 = r0.f93051m     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f92997d     // Catch: java.lang.Throwable -> L51
            int r5 = r5.get()     // Catch: java.lang.Throwable -> L51
            int r0 = r0.f92995b     // Catch: java.lang.Throwable -> L51
            if (r5 <= r0) goto L3f
            goto L40
        L3f:
            r3 = r2
        L40:
            if (r3 == 0) goto L53
        L42:
            xr.gc r0 = r15.f92517c     // Catch: java.lang.Throwable -> L51
            xr.tc r0 = r0.f92571c     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.manager.d0 r4 = new com.bumptech.glide.manager.d0     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = r0.f93047i     // Catch: java.lang.Throwable -> L51
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L51
            r0.f93061w = r4     // Catch: java.lang.Throwable -> L51
        L4f:
            r3 = r2
            goto L7c
        L51:
            r0 = move-exception
            goto Lc3
        L53:
            xr.gc r0 = r15.f92517c     // Catch: java.lang.Throwable -> L51
            xr.tc r0 = r0.f92571c     // Catch: java.lang.Throwable -> L51
            xr.ic r3 = r0.f93053o     // Catch: java.lang.Throwable -> L51
            boolean r5 = r3.f92647h     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L5e
            goto L73
        L5e:
            xr.ic r6 = new xr.ic     // Catch: java.lang.Throwable -> L51
            java.util.List r7 = r3.f92641b     // Catch: java.lang.Throwable -> L51
            java.util.Collection r8 = r3.f92642c     // Catch: java.lang.Throwable -> L51
            java.util.Collection r9 = r3.f92643d     // Catch: java.lang.Throwable -> L51
            xr.rc r10 = r3.f92645f     // Catch: java.lang.Throwable -> L51
            boolean r11 = r3.f92646g     // Catch: java.lang.Throwable -> L51
            boolean r12 = r3.f92640a     // Catch: java.lang.Throwable -> L51
            int r14 = r3.f92644e     // Catch: java.lang.Throwable -> L51
            r13 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L51
            r3 = r6
        L73:
            r0.f93053o = r3     // Catch: java.lang.Throwable -> L51
            xr.gc r0 = r15.f92517c     // Catch: java.lang.Throwable -> L51
            xr.tc r0 = r0.f92571c     // Catch: java.lang.Throwable -> L51
            r0.f93061w = r4     // Catch: java.lang.Throwable -> L51
            goto L4f
        L7c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L9f
            xr.rc r0 = r15.f92516b
            xr.k1 r1 = r0.f92966a
            xr.qc r2 = new xr.qc
            xr.gc r3 = r15.f92517c
            xr.tc r3 = r3.f92571c
            r2.<init>(r3, r0)
            r1.start(r2)
            xr.rc r0 = r15.f92516b
            xr.k1 r0 = r0.f92966a
            wr.m6 r1 = wr.m6.f91038f
            java.lang.String r2 = "Unneeded hedging"
            wr.m6 r1 = r1.withDescription(r2)
            r0.cancel(r1)
            return
        L9f:
            if (r4 == 0) goto Lb9
            xr.gc r0 = r15.f92517c
            xr.tc r0 = r0.f92571c
            java.util.concurrent.ScheduledExecutorService r1 = r0.f93042d
            xr.gc r2 = new xr.gc
            r2.<init>(r0, r4)
            xr.e5 r0 = r0.f93045g
            long r5 = r0.f92462b
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r0 = r1.schedule(r2, r5, r0)
            r4.c(r0)
        Lb9:
            xr.gc r0 = r15.f92517c
            xr.tc r0 = r0.f92571c
            xr.rc r1 = r15.f92516b
            r0.e(r1)
            return
        Lc3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.fc.run():void");
    }
}
