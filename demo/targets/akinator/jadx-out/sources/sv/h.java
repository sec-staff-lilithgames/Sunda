package sv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f86141b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f86142c;

    /* renamed from: e, reason: collision with root package name */
    public int f86143e;

    /* renamed from: f, reason: collision with root package name */
    public qv.m f86144f;

    /* renamed from: g, reason: collision with root package name */
    public int f86145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f86146h;

    public h(i iVar) {
        this.f86146h = iVar;
        int iCoerceIn = qv.v.coerceIn(iVar.f86148b, 0, iVar.f86147a.length());
        this.f86142c = iCoerceIn;
        this.f86143e = iCoerceIn;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f86143e
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f86141b = r1
            r0 = 0
            r7.f86144f = r0
            return
        Lb:
            sv.i r0 = r7.f86146h
            int r2 = sv.i.access$getLimit$p(r0)
            r3 = -1
            r4 = 1
            if (r2 <= 0) goto L20
            int r2 = r7.f86145g
            int r2 = r2 + r4
            r7.f86145g = r2
            int r5 = sv.i.access$getLimit$p(r0)
            if (r2 >= r5) goto L2c
        L20:
            int r2 = r7.f86143e
            java.lang.CharSequence r5 = sv.i.access$getInput$p(r0)
            int r5 = r5.length()
            if (r2 <= r5) goto L40
        L2c:
            qv.m r1 = new qv.m
            int r2 = r7.f86142c
            java.lang.CharSequence r0 = sv.i.access$getInput$p(r0)
            int r0 = sv.n0.getLastIndex(r0)
            r1.<init>(r2, r0)
            r7.f86144f = r1
            r7.f86143e = r3
            goto L8f
        L40:
            kv.p r2 = sv.i.access$getGetNextMatch$p(r0)
            java.lang.CharSequence r5 = sv.i.access$getInput$p(r0)
            int r6 = r7.f86143e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r2.invoke(r5, r6)
            tu.v r2 = (tu.v) r2
            if (r2 != 0) goto L6a
            qv.m r1 = new qv.m
            int r2 = r7.f86142c
            java.lang.CharSequence r0 = sv.i.access$getInput$p(r0)
            int r0 = sv.n0.getLastIndex(r0)
            r1.<init>(r2, r0)
            r7.f86144f = r1
            r7.f86143e = r3
            goto L8f
        L6a:
            java.lang.Object r0 = r2.component1()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r2.component2()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r7.f86142c
            qv.m r3 = qv.v.until(r3, r0)
            r7.f86144f = r3
            int r0 = r0 + r2
            r7.f86142c = r0
            if (r2 != 0) goto L8c
            r1 = r4
        L8c:
            int r0 = r0 + r1
            r7.f86143e = r0
        L8f:
            r7.f86141b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.h.a():void");
    }

    public final int getCounter() {
        return this.f86145g;
    }

    public final int getCurrentStartIndex() {
        return this.f86142c;
    }

    public final qv.m getNextItem() {
        return this.f86144f;
    }

    public final int getNextSearchIndex() {
        return this.f86143e;
    }

    public final int getNextState() {
        return this.f86141b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f86141b == -1) {
            a();
        }
        return this.f86141b == 1;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCounter(int i10) {
        this.f86145g = i10;
    }

    public final void setCurrentStartIndex(int i10) {
        this.f86142c = i10;
    }

    public final void setNextItem(qv.m mVar) {
        this.f86144f = mVar;
    }

    public final void setNextSearchIndex(int i10) {
        this.f86143e = i10;
    }

    public final void setNextState(int i10) {
        this.f86141b = i10;
    }

    @Override // java.util.Iterator
    public qv.m next() {
        if (this.f86141b == -1) {
            a();
        }
        if (this.f86141b == 0) {
            throw new NoSuchElementException();
        }
        qv.m mVar = this.f86144f;
        kotlin.jvm.internal.e0.checkNotNull(mVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f86144f = null;
        this.f86141b = -1;
        return mVar;
    }
}
