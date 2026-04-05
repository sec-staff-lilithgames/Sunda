package uu;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s extends a implements Set {

    /* renamed from: b, reason: collision with root package name */
    public static final r f88779b = new r(null);

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f88779b.setEquals$kotlin_stdlib(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f88779b.unorderedHashCode$kotlin_stdlib(this);
    }

    @Override // uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
