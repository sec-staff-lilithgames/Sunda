package mk;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f74776b;

    public o(r rVar) {
        this.f74776b = rVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f74776b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f74776b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new n(this.f74776b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        r rVar = this.f74776b;
        q qVarA = null;
        if (obj != null) {
            try {
                qVarA = rVar.a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (qVarA != null) {
            rVar.c(qVarA, true);
        }
        return qVarA != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f74776b.f74794f;
    }
}
