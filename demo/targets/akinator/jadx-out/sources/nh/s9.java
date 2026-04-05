package nh;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s9 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fa f76638b;

    public s9(fa faVar) {
        this.f76638b = faVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f76638b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f76638b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f76638b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new r9(this.f76638b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76638b.size();
    }
}
