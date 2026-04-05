package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n6 extends l6 {

    /* renamed from: e, reason: collision with root package name */
    public final transient o6 f76494e;

    public n6(o6 o6Var) {
        this.f76494e = o6Var;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f76494e.containsEntry(entry.getKey(), entry.getValue());
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76494e.size();
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        o6 o6Var = this.f76494e;
        o6Var.getClass();
        return new s5(o6Var);
    }
}
