package l2;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class l0 extends u implements List, lv.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f72318j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f72319k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(List<? extends w> fonts) {
        super(null);
        kotlin.jvm.internal.e0.checkNotNullParameter(fonts, "fonts");
        this.f72318j = fonts;
        List<? extends w> list = fonts;
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
        this.f72319k = new ArrayList(list);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends w> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(w element) {
        kotlin.jvm.internal.e0.checkNotNullParameter(element, "element");
        return this.f72318j.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return this.f72318j.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return kotlin.jvm.internal.e0.areEqual(this.f72319k, ((l0) obj).f72319k);
        }
        return false;
    }

    @Override // java.util.List
    public w get(int i10) {
        return (w) this.f72318j.get(i10);
    }

    public final List<w> getFonts() {
        return this.f72319k;
    }

    public int getSize() {
        return this.f72318j.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f72319k.hashCode();
    }

    public int indexOf(w element) {
        kotlin.jvm.internal.e0.checkNotNullParameter(element, "element");
        return this.f72318j.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f72318j.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<w> iterator() {
        return this.f72318j.iterator();
    }

    public int lastIndexOf(w element) {
        kotlin.jvm.internal.e0.checkNotNullParameter(element, "element");
        return this.f72318j.lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<w> listIterator() {
        return this.f72318j.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<w> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<w> subList(int i10, int i11) {
        return this.f72318j.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.toArray(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f72319k + ')';
    }

    public void add(int i10, w wVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends w> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof w) {
            return contains((w) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof w) {
            return indexOf((w) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof w) {
            return lastIndexOf((w) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<w> listIterator(int i10) {
        return this.f72318j.listIterator(i10);
    }

    @Override // java.util.List
    public w remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public w set(int i10, w wVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super w> comparator) {
        throw new UnsupportedOperationException(QFzuMMDfrzagDN.nNpIfSuWtpfYij);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(w wVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
