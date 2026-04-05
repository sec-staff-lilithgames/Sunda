package nh;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v1 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final b5 f76704b;

    public v1(b5 b5Var) {
        this.f76704b = b5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return y1.a(this.f76704b, (List) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<List<Object>> iterator() {
        return new w1(this.f76704b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return qh.f.factorial(this.f76704b.size());
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "permutations(" + this.f76704b + ")";
    }
}
