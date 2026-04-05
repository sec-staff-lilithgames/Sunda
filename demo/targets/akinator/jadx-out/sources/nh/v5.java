package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v5 extends u4 {

    /* renamed from: c, reason: collision with root package name */
    public final y5 f76707c;

    public v5(y5 y5Var) {
        this.f76707c = y5Var;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f76707c.containsEntry(entry.getKey(), entry.getValue());
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76707c.size();
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        y5 y5Var = this.f76707c;
        y5Var.getClass();
        return new s5(y5Var);
    }
}
