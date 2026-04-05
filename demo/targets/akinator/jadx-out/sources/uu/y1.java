package uu;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y1 extends g {

    /* renamed from: b, reason: collision with root package name */
    public final List f88801b;

    public y1(List<Object> delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f88801b = delegate;
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        return this.f88801b.get(w0.access$reverseElementIndex(this, i10));
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88801b.size();
    }

    @Override // uu.g, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // uu.g, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // uu.g, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return new x1(this, i10);
    }
}
