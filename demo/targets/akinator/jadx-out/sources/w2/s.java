package w2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends i {
    public static <V> s create() {
        return new s();
    }

    @Override // w2.i
    public boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // w2.i
    public boolean setException(Throwable th2) {
        return super.setException(th2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setFuture(sh.n1 r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f90350b
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = w2.i.f(r6)
            kotlin.jvm.internal.d0 r0 = w2.i.f90348h
            boolean r6 = r0.g(r5, r3, r6)
            if (r6 == 0) goto L4f
            w2.i.c(r5)
            return r2
        L20:
            w2.f r0 = new w2.f
            r0.<init>(r5, r6)
            kotlin.jvm.internal.d0 r4 = w2.i.f90348h
            boolean r3 = r4.g(r5, r3, r0)
            if (r3 == 0) goto L42
            w2.p r1 = w2.p.f90360b     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            w2.c r1 = new w2.c     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            w2.c r1 = w2.c.f90330b
        L3c:
            kotlin.jvm.internal.d0 r6 = w2.i.f90348h
            r6.g(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f90350b
        L44:
            boolean r2 = r0 instanceof w2.a
            if (r2 == 0) goto L4f
            w2.a r0 = (w2.a) r0
            boolean r0 = r0.f90328a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.s.setFuture(sh.n1):boolean");
    }
}
