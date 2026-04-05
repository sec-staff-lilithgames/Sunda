package ce;

import ef.p;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m implements e {

    /* renamed from: a, reason: collision with root package name */
    public final l f12250a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12251b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f12252c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f12253d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final h[] f12254e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f12255f;

    /* renamed from: g, reason: collision with root package name */
    public int f12256g;

    /* renamed from: h, reason: collision with root package name */
    public int f12257h;

    /* renamed from: i, reason: collision with root package name */
    public h f12258i;

    /* renamed from: j, reason: collision with root package name */
    public ef.l f12259j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12260k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12261l;

    public m(h[] hVarArr, j[] jVarArr) {
        this.f12254e = hVarArr;
        this.f12256g = hVarArr.length;
        for (int i10 = 0; i10 < this.f12256g; i10++) {
            this.f12254e[i10] = new p();
        }
        this.f12255f = jVarArr;
        this.f12257h = jVarArr.length;
        for (int i11 = 0; i11 < this.f12257h; i11++) {
            this.f12255f[i11] = new ef.h((ef.i) this);
        }
        l lVar = new l((ef.i) this);
        this.f12250a = lVar;
        lVar.start();
    }

    public abstract ef.l a(h hVar, j jVar, boolean z10);

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12251b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.f12261l     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r7.f12252c     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L17
            int r1 = r7.f12257h     // Catch: java.lang.Throwable -> L20
            if (r1 <= 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r7.f12251b     // Catch: java.lang.Throwable -> L20
            r1.wait()     // Catch: java.lang.Throwable -> L20
            goto L3
        L20:
            r1 = move-exception
            goto Lb1
        L23:
            boolean r1 = r7.f12261l     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r3
        L29:
            java.util.ArrayDeque r1 = r7.f12252c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L20
            ce.h r1 = (ce.h) r1     // Catch: java.lang.Throwable -> L20
            ce.j[] r4 = r7.f12255f     // Catch: java.lang.Throwable -> L20
            int r5 = r7.f12257h     // Catch: java.lang.Throwable -> L20
            int r5 = r5 - r2
            r7.f12257h = r5     // Catch: java.lang.Throwable -> L20
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L20
            boolean r5 = r7.f12260k     // Catch: java.lang.Throwable -> L20
            r7.f12260k = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            boolean r0 = r1.isEndOfStream()
            if (r0 == 0) goto L4a
            r0 = 4
            r4.addFlag(r0)
            goto L84
        L4a:
            boolean r0 = r1.isDecodeOnly()
            if (r0 == 0) goto L55
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.addFlag(r0)
        L55:
            boolean r0 = r1.isFirstSample()
            if (r0 == 0) goto L60
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r4.addFlag(r0)
        L60:
            ef.l r0 = r7.a(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L65 java.lang.RuntimeException -> L6f
            goto L78
        L65:
            r0 = move-exception
            ef.l r5 = new ef.l
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L6d:
            r0 = r5
            goto L78
        L6f:
            r0 = move-exception
            ef.l r5 = new ef.l
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L6d
        L78:
            if (r0 == 0) goto L84
            java.lang.Object r5 = r7.f12251b
            monitor-enter(r5)
            r7.f12259j = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            return r3
        L81:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            java.lang.Object r3 = r7.f12251b
            monitor-enter(r3)
            boolean r0 = r7.f12260k     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L91
            r4.release()     // Catch: java.lang.Throwable -> L8f
            goto La0
        L8f:
            r0 = move-exception
            goto Laf
        L91:
            boolean r0 = r4.isDecodeOnly()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L9b
            r4.release()     // Catch: java.lang.Throwable -> L8f
            goto La0
        L9b:
            java.util.ArrayDeque r0 = r7.f12253d     // Catch: java.lang.Throwable -> L8f
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L8f
        La0:
            r1.clear()     // Catch: java.lang.Throwable -> L8f
            ce.h[] r0 = r7.f12254e     // Catch: java.lang.Throwable -> L8f
            int r4 = r7.f12256g     // Catch: java.lang.Throwable -> L8f
            int r5 = r4 + 1
            r7.f12256g = r5     // Catch: java.lang.Throwable -> L8f
            r0[r4] = r1     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8f
            return r2
        Laf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8f
            throw r0
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.m.b():boolean");
    }

    @Override // ce.e
    public final void flush() {
        synchronized (this.f12251b) {
            try {
                this.f12260k = true;
                h hVar = this.f12258i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f12254e;
                    int i10 = this.f12256g;
                    this.f12256g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f12258i = null;
                }
                while (!this.f12252c.isEmpty()) {
                    h hVar2 = (h) this.f12252c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f12254e;
                    int i11 = this.f12256g;
                    this.f12256g = i11 + 1;
                    hVarArr2[i11] = hVar2;
                }
                while (!this.f12253d.isEmpty()) {
                    ((j) this.f12253d.removeFirst()).release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ce.e
    public abstract /* synthetic */ String getName();

    @Override // ce.e
    public void release() throws InterruptedException {
        synchronized (this.f12251b) {
            this.f12261l = true;
            this.f12251b.notify();
        }
        try {
            this.f12250a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ce.e
    public final h dequeueInputBuffer() throws g {
        h hVar;
        synchronized (this.f12251b) {
            try {
                ef.l lVar = this.f12259j;
                if (lVar != null) {
                    throw lVar;
                }
                com.google.android.exoplayer2.util.a.checkState(this.f12258i == null);
                int i10 = this.f12256g;
                if (i10 == 0) {
                    hVar = null;
                } else {
                    h[] hVarArr = this.f12254e;
                    int i11 = i10 - 1;
                    this.f12256g = i11;
                    hVar = hVarArr[i11];
                }
                this.f12258i = hVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // ce.e
    public final j dequeueOutputBuffer() throws g {
        synchronized (this.f12251b) {
            try {
                ef.l lVar = this.f12259j;
                if (lVar != null) {
                    throw lVar;
                }
                if (this.f12253d.isEmpty()) {
                    return null;
                }
                return (j) this.f12253d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ce.e
    public final void queueInputBuffer(h hVar) throws g {
        synchronized (this.f12251b) {
            try {
                ef.l lVar = this.f12259j;
                if (lVar != null) {
                    throw lVar;
                }
                com.google.android.exoplayer2.util.a.checkArgument(hVar == this.f12258i);
                this.f12252c.addLast(hVar);
                if (!this.f12252c.isEmpty() && this.f12257h > 0) {
                    this.f12251b.notify();
                }
                this.f12258i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
