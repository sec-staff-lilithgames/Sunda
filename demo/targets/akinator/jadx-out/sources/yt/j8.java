package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j8 implements tw.b {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f95737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95738c;

    public j8(AtomicReference atomicReference, int i10) {
        this.f95737b = atomicReference;
        this.f95738c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // tw.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subscribe(tw.c r8) {
        /*
            r7 = this;
            yt.k8 r0 = new yt.k8
            r0.<init>(r8)
            r8.onSubscribe(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r8 = r7.f95737b
            java.lang.Object r8 = r8.get()
            yt.l8 r8 = (yt.l8) r8
            if (r8 == 0) goto L1b
            boolean r1 = r8.isDisposed()
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r3 = r8
            goto L2d
        L1b:
            yt.l8 r1 = new yt.l8
            java.util.concurrent.atomic.AtomicReference r2 = r7.f95737b
            int r3 = r7.f95738c
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference r2 = r7.f95737b
        L26:
            boolean r3 = r2.compareAndSet(r8, r1)
            if (r3 == 0) goto L67
            r3 = r1
        L2d:
            java.util.concurrent.atomic.AtomicReference r4 = r3.f95875e
        L2f:
            java.lang.Object r8 = r4.get()
            r5 = r8
            yt.k8[] r5 = (yt.k8[]) r5
            yt.k8[] r8 = yt.l8.f95872l
            if (r5 != r8) goto L3b
            goto L8
        L3b:
            int r8 = r5.length
            int r1 = r8 + 1
            yt.k8[] r6 = new yt.k8[r1]
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r6, r1, r8)
            r6[r8] = r0
        L46:
            boolean r8 = r4.compareAndSet(r5, r6)
            if (r8 == 0) goto L60
            long r1 = r0.get()
            r4 = -9223372036854775808
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 != 0) goto L5a
            r3.c(r0)
            goto L5c
        L5a:
            r0.f95812c = r3
        L5c:
            r3.b()
            return
        L60:
            java.lang.Object r8 = r4.get()
            if (r8 == r5) goto L46
            goto L2f
        L67:
            java.lang.Object r3 = r2.get()
            if (r3 == r8) goto L26
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.j8.subscribe(tw.c):void");
    }
}
