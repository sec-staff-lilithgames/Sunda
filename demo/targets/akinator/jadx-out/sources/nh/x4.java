package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x4 extends s4 {
    public x4() {
        super(4);
    }

    @Override // nh.s4, nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterable iterable) {
        return addAll((Iterable<Object>) iterable);
    }

    @Override // nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterator it) {
        return addAll((Iterator<Object>) it);
    }

    @Override // nh.t4
    public b5 build() {
        this.f76622c = true;
        return b5.f(this.f76621b, this.f76620a);
    }

    @Override // nh.s4, nh.t4
    public x4 addAll(Iterable<Object> iterable) {
        super.addAll(iterable);
        return this;
    }

    @Override // nh.s4, nh.t4
    public x4 add(Object obj) {
        super.add(obj);
        return this;
    }

    @Override // nh.t4
    public x4 addAll(Iterator<Object> it) {
        super.addAll(it);
        return this;
    }

    @Override // nh.s4, nh.t4
    public x4 add(Object... objArr) {
        super.add(objArr);
        return this;
    }
}
