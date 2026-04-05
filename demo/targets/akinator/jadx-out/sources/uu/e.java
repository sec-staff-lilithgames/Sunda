package uu;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e extends d implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f88713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, int i10) {
        super(gVar);
        this.f88713e = gVar;
        g.Companion.checkPositionIndex$kotlin_stdlib(i10, gVar.size());
        this.f88709b = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f88709b > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f88709b;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f88709b - 1;
        this.f88709b = i10;
        return this.f88713e.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f88709b - 1;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
