package nh;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e2 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f76202b;

    public e2(f2 f2Var) {
        this.f76202b = f2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f76202b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        f2 f2Var = this.f76202b;
        Map mapF = f2Var.f();
        return mapF != null ? mapF.values().iterator() : new z1(f2Var, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76202b.size();
    }
}
