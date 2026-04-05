package nh;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends v implements NavigableSet {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f76645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, Object obj, NavigableSet navigableSet, q qVar) {
        super(wVar, obj, navigableSet, qVar);
        this.f76645i = wVar;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return f().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return new p(this, f().descendingIterator());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        return h(f().descendingSet());
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return f().floor(obj);
    }

    @Override // nh.v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableSet f() {
        return (NavigableSet) ((SortedSet) this.f76572c);
    }

    public final t h(NavigableSet navigableSet) {
        q qVar = this.f76573e;
        if (qVar == null) {
            qVar = this;
        }
        return new t(this.f76645i, this.f76571b, navigableSet, qVar);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        return h(f().headSet(obj, z10));
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return f().higher(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return f().lower(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return z7.b(iterator());
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return z7.b(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return h(f().subSet(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        return h(f().tailSet(obj, z10));
    }
}
