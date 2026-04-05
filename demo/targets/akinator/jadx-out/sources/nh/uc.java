package nh;

import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class uc {
    public abstract Map a();

    public nc arrayListValues() {
        return arrayListValues(2);
    }

    public <V0 extends Enum<V0>> vc enumSetValues(Class<V0> cls) {
        mh.p1.checkNotNull(cls, "valueClass");
        return new tc(this, cls);
    }

    public vc hashSetValues() {
        return hashSetValues(2);
    }

    public vc linkedHashSetValues() {
        return linkedHashSetValues(2);
    }

    public nc linkedListValues() {
        return new pc(this);
    }

    public wc treeSetValues() {
        return treeSetValues(we.natural());
    }

    public nc arrayListValues(int i10) {
        jh.i.o(i10, "expectedValuesPerKey");
        return new oc(this, i10);
    }

    public vc hashSetValues(int i10) {
        jh.i.o(i10, "expectedValuesPerKey");
        return new qc(this, i10);
    }

    public vc linkedHashSetValues(int i10) {
        jh.i.o(i10, "expectedValuesPerKey");
        return new rc(this, i10);
    }

    public <V0> wc treeSetValues(Comparator<V0> comparator) {
        mh.p1.checkNotNull(comparator, "comparator");
        return new sc(this, comparator);
    }
}
