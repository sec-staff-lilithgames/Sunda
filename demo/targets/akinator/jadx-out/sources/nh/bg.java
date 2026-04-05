package nh;

import java.util.AbstractSet;
import java.util.BitSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class bg extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5 f76135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BitSet f76136c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76137e;

    public bg(m5 m5Var, BitSet bitSet, int i10) {
        this.f76135b = m5Var;
        this.f76136c = bitSet;
        this.f76137e = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Integer num = (Integer) this.f76135b.get(obj);
        return num != null && this.f76136c.get(num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new ag(this.f76136c, this.f76135b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76137e;
    }
}
