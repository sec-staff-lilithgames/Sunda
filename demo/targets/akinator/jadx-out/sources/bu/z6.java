package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z6 implements mt.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f11306b;

    public z6(AtomicReference atomicReference) {
        this.f11306b = atomicReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subscribe(mt.i0 r8) {
        /*
            r7 = this;
            bu.x6 r0 = new bu.x6
            r0.<init>(r8)
            r8.onSubscribe(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r8 = r7.f11306b
            java.lang.Object r1 = r8.get()
            bu.y6 r1 = (bu.y6) r1
            if (r1 == 0) goto L1b
            boolean r2 = r1.isDisposed()
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r3 = r1
            goto L27
        L1b:
            bu.y6 r2 = new bu.y6
            r2.<init>(r8)
        L20:
            boolean r3 = r8.compareAndSet(r1, r2)
            if (r3 == 0) goto L58
            r3 = r2
        L27:
            java.util.concurrent.atomic.AtomicReference r4 = r3.f11252c
        L29:
            java.lang.Object r8 = r4.get()
            r5 = r8
            bu.x6[] r5 = (bu.x6[]) r5
            bu.x6[] r8 = bu.y6.f11250h
            if (r5 != r8) goto L35
            goto L8
        L35:
            int r8 = r5.length
            int r1 = r8 + 1
            bu.x6[] r6 = new bu.x6[r1]
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r6, r1, r8)
            r6[r8] = r0
        L40:
            boolean r8 = r4.compareAndSet(r5, r6)
            if (r8 == 0) goto L51
            r8 = 0
            boolean r8 = r0.compareAndSet(r8, r3)
            if (r8 != 0) goto L50
            r3.a(r0)
        L50:
            return
        L51:
            java.lang.Object r8 = r4.get()
            if (r8 == r5) goto L40
            goto L29
        L58:
            java.lang.Object r3 = r8.get()
            if (r3 == r1) goto L20
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.z6.subscribe(mt.i0):void");
    }
}
