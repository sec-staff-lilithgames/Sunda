package nh;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t6 extends k6 {

    /* renamed from: f, reason: collision with root package name */
    public final Comparator f76656f;

    public t6(Comparator<Object> comparator) {
        this.f76656f = (Comparator) mh.p1.checkNotNull(comparator);
    }

    @Override // nh.k6, nh.s4, nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterable iterable) {
        return addAll((Iterable<Object>) iterable);
    }

    @Override // nh.k6
    public final k6 d(k6 k6Var) {
        super.d(k6Var);
        return this;
    }

    public final void e(t6 t6Var) {
        super.d(t6Var);
    }

    @Override // nh.k6, nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterator it) {
        return addAll((Iterator<Object>) it);
    }

    public t6(Comparator comparator, int i10) {
        super(i10);
        this.f76656f = (Comparator) mh.p1.checkNotNull(comparator);
    }

    @Override // nh.k6, nh.s4, nh.t4
    public /* bridge */ /* synthetic */ k6 addAll(Iterable iterable) {
        return addAll((Iterable<Object>) iterable);
    }

    @Override // nh.k6, nh.t4
    public u6 build() {
        pf pfVarJ = u6.j(this.f76656f, this.f76621b, this.f76620a);
        this.f76621b = pfVarJ.size();
        this.f76622c = true;
        return pfVarJ;
    }

    @Override // nh.k6, nh.t4
    public /* bridge */ /* synthetic */ k6 addAll(Iterator it) {
        return addAll((Iterator<Object>) it);
    }

    @Override // nh.k6, nh.s4, nh.t4
    public t6 addAll(Iterable<Object> iterable) {
        super.addAll(iterable);
        return this;
    }

    @Override // nh.k6, nh.s4, nh.t4
    public t6 add(Object obj) {
        super.add(obj);
        return this;
    }

    @Override // nh.k6, nh.t4
    public t6 addAll(Iterator<Object> it) {
        super.addAll(it);
        return this;
    }

    @Override // nh.k6, nh.s4, nh.t4
    public t6 add(Object... objArr) {
        super.add(objArr);
        return this;
    }
}
