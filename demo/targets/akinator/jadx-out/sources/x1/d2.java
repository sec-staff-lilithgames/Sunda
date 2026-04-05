package x1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 implements Collection, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Set f91343b;

    /* JADX WARN: Multi-variable type inference failed */
    public d2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.util.Collection
    /* renamed from: add$ui_release, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        return this.f91343b.add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f91343b.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f91343b.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return this.f91343b.containsAll(elements);
    }

    public int getSize() {
        return this.f91343b.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f91343b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f91343b.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f91343b.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> slotIds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(slotIds, "slotIds");
        return this.f91343b.remove(slotIds);
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Object> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> slotIds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(slotIds, "slotIds");
        return this.f91343b.retainAll(slotIds);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.toArray(this);
    }

    public d2(Set<Object> set) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "set");
        this.f91343b = set;
    }

    public final boolean removeAll(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return uu.v0.removeAll(this.f91343b, predicate);
    }

    public final boolean retainAll(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return uu.v0.retainAll(this.f91343b, predicate);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    public /* synthetic */ d2(Set set, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new LinkedHashSet() : set);
    }
}
