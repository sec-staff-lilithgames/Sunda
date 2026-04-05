package p0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 implements Iterable, Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final s4 f80651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80652c;

    /* renamed from: e, reason: collision with root package name */
    public final int f80653e;

    /* renamed from: f, reason: collision with root package name */
    public int f80654f;

    public z0(s4 s4Var, int i10) {
        this.f80651b = s4Var;
        int i11 = s4Var.getGroups()[(i10 * 5) + 4];
        this.f80652c = i11;
        int i12 = i10 + 1;
        this.f80653e = i12 < s4Var.getGroupsSize() ? s4Var.getGroups()[(i12 * 5) + 4] : s4Var.getSlotsSize();
        this.f80654f = i11;
    }

    public final int getEnd() {
        return this.f80653e;
    }

    public final int getIndex() {
        return this.f80654f;
    }

    public final int getStart() {
        return this.f80652c;
    }

    public final s4 getTable() {
        return this.f80651b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80654f < this.f80653e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object next() {
        /*
            r3 = this;
            int r0 = r3.f80654f
            if (r0 < 0) goto L16
            p0.s4 r1 = r3.f80651b
            java.lang.Object[] r2 = r1.getSlots()
            int r2 = r2.length
            if (r0 >= r2) goto L16
            java.lang.Object[] r0 = r1.getSlots()
            int r1 = r3.f80654f
            r0 = r0[r1]
            goto L17
        L16:
            r0 = 0
        L17:
            int r1 = r3.f80654f
            int r1 = r1 + 1
            r3.f80654f = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z0.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i10) {
        this.f80654f = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }
}
