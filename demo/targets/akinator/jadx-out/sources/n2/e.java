package n2;

import j1.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import sv.n0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements Collection, lv.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f75556e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final List f75557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75558c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final e getCurrent() {
            List<f> current = h.getPlatformLocaleDelegate().getCurrent();
            ArrayList arrayList = new ArrayList(current.size());
            int size = current.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(current.get(i10)));
            }
            return new e(arrayList);
        }
    }

    public e(List<d> localeList) {
        e0.checkNotNullParameter(localeList, "localeList");
        this.f75557b = localeList;
        this.f75558c = localeList.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return contains((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.f75557b.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return e0.areEqual(this.f75557b, ((e) obj).f75557b);
        }
        return false;
    }

    public final d get(int i10) {
        return (d) this.f75557b.get(i10);
    }

    public final List<d> getLocaleList() {
        return this.f75557b;
    }

    public int getSize() {
        return this.f75558c;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f75557b.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f75557b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<d> iterator() {
        return this.f75557b.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super d> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return t.toArray(this);
    }

    public String toString() {
        return o2.p(new StringBuilder("LocaleList(localeList="), this.f75557b, ')');
    }

    public boolean add(d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(d element) {
        e0.checkNotNullParameter(element, "element");
        return this.f75557b.contains(element);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        e0.checkNotNullParameter(array, "array");
        return (T[]) t.toArray(this, array);
    }

    public e(String languageTags) {
        e0.checkNotNullParameter(languageTags, "languageTags");
        List listSplit$default = n0.split$default((CharSequence) languageTags, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(listSplit$default.size());
        int size = listSplit$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(n0.trim((String) listSplit$default.get(i10)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(new d((String) arrayList.get(i11)));
        }
        this(arrayList2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(d... locales) {
        this((List<d>) k0.toList(locales));
        e0.checkNotNullParameter(locales, "locales");
    }
}
