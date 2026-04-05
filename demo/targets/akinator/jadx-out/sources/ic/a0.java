package ic;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a0 extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final transient AtomicReference f59447b = new AtomicReference();

    @Override // ic.c0, ic.f0
    public /* bridge */ /* synthetic */ e0 acquireAndLinkPooled() {
        return super.acquireAndLinkPooled();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r0 = r0 + 1;
     */
    @Override // ic.c0, ic.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ic.e0 acquirePooled() {
        /*
            r5 = this;
            r0 = 0
        L1:
            r1 = 3
            if (r0 >= r1) goto L2c
            java.util.concurrent.atomic.AtomicReference r1 = r5.f59447b
            java.lang.Object r2 = r1.get()
            ic.z r2 = (ic.z) r2
            if (r2 != 0) goto L13
            ic.e0 r0 = r5.createPooled()
            return r0
        L13:
            ic.z r3 = r2.f59533b
        L15:
            boolean r4 = r1.compareAndSet(r2, r3)
            if (r4 == 0) goto L23
            r0 = 0
            r2.f59533b = r0
            java.lang.Object r0 = r2.f59532a
            ic.e0 r0 = (ic.e0) r0
            return r0
        L23:
            java.lang.Object r4 = r1.get()
            if (r4 == r2) goto L15
            int r0 = r0 + 1
            goto L1
        L2c:
            ic.e0 r0 = r5.createPooled()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.a0.acquirePooled():ic.e0");
    }

    @Override // ic.c0, ic.f0
    public boolean clear() {
        this.f59447b.set(null);
        return true;
    }

    @Override // ic.c0, ic.f0
    public int pooledCount() {
        int i10 = 0;
        for (z zVar = (z) this.f59447b.get(); zVar != null; zVar = zVar.f59533b) {
            i10++;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r5 = r5 + 1;
     */
    @Override // ic.c0, ic.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void releasePooled(ic.e0 r5) {
        /*
            r4 = this;
            ic.z r0 = new ic.z
            r0.<init>(r5)
            r5 = 0
        L6:
            r1 = 3
            if (r5 >= r1) goto L23
            java.util.concurrent.atomic.AtomicReference r1 = r4.f59447b
            java.lang.Object r2 = r1.get()
            ic.z r2 = (ic.z) r2
            r0.f59533b = r2
        L13:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L1a
            goto L23
        L1a:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L13
            int r5 = r5 + 1
            goto L6
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.a0.releasePooled(ic.e0):void");
    }
}
