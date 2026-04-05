package p0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p5 implements Iterable, Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final s4 f80395b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80396c;

    /* renamed from: e, reason: collision with root package name */
    public final int f80397e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80398f;

    /* renamed from: g, reason: collision with root package name */
    public final e f80399g;

    /* renamed from: h, reason: collision with root package name */
    public int f80400h;

    public p5(s4 s4Var, int i10, q1 q1Var) {
        this.f80395b = s4Var;
        int i11 = s4Var.getGroups()[(i10 * 5) + 4];
        this.f80396c = i11;
        this.f80397e = q1Var.getDataStartOffset();
        int dataEndOffset = q1Var.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i12 = i10 + 1;
            dataEndOffset = (i12 < s4Var.getGroupsSize() ? s4Var.getGroups()[(i12 * 5) + 4] : s4Var.getSlotsSize()) - i11;
        }
        this.f80398f = dataEndOffset;
        e eVar = new e();
        ArrayList<Object> groups = q1Var.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = groups.get(i13);
                if (obj instanceof q1) {
                    q1 q1Var2 = (q1) obj;
                    eVar.setRange(q1Var2.getDataStartOffset(), q1Var2.getDataEndOffset());
                }
            }
        }
        this.f80399g = eVar;
        this.f80400h = eVar.nextClear(this.f80397e);
    }

    public final s4 getTable() {
        return this.f80395b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80400h < this.f80398f;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f80400h;
        Object obj = (i10 < 0 || i10 >= this.f80398f) ? null : this.f80395b.getSlots()[this.f80396c + this.f80400h];
        this.f80400h = this.f80399g.nextClear(this.f80400h + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }
}
