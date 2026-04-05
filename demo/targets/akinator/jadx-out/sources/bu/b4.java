package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b4 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f10117b;

    public b4(Object[] objArr) {
        this.f10117b = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0.isDisposed() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r3.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    @Override // mt.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subscribeActual(mt.i0 r6) {
        /*
            r5 = this;
            bu.a4 r0 = new bu.a4
            java.lang.Object[] r1 = r5.f10117b
            r0.<init>(r6, r1)
            r6.onSubscribe(r0)
            boolean r6 = r0.f10071f
            if (r6 == 0) goto Lf
            goto L41
        Lf:
            java.lang.Object[] r6 = r0.f10069c
            int r1 = r6.length
            r2 = 0
        L13:
            mt.i0 r3 = r0.f10068b
            if (r2 >= r1) goto L38
            boolean r4 = r0.isDisposed()
            if (r4 != 0) goto L38
            r4 = r6[r2]
            if (r4 != 0) goto L32
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "The element at index "
            java.lang.String r1 = " is null"
            java.lang.String r0 = p0.o2.k(r2, r0, r1)
            r6.<init>(r0)
            r3.onError(r6)
            return
        L32:
            r3.onNext(r4)
            int r2 = r2 + 1
            goto L13
        L38:
            boolean r6 = r0.isDisposed()
            if (r6 != 0) goto L41
            r3.onComplete()
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.b4.subscribeActual(mt.i0):void");
    }
}
