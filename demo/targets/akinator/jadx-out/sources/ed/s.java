package ed;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f54126b;

    public s(v vVar) {
        this.f54126b = vVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f54126b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f54126b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new r(this.f54126b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f54126b.size();
    }
}
