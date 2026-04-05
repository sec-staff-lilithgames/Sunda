package io.odeeo.internal.u0;

import com.ironsource.C3191e4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f3<E> extends q1<E> {

    /* renamed from: c, reason: collision with root package name */
    public final transient E f66792c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f66793d;

    public f3(E e10) {
        this.f66792c = (E) io.odeeo.internal.t0.u.checkNotNull(e10);
    }

    @Override // io.odeeo.internal.u0.d1
    public int a(Object[] objArr, int i10) {
        objArr[i10] = this.f66792c;
        return i10 + 1;
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f66792c.equals(obj);
    }

    @Override // io.odeeo.internal.u0.q1
    public h1<E> d() {
        return h1.of((Object) this.f66792c);
    }

    @Override // io.odeeo.internal.u0.q1
    public boolean e() {
        return this.f66793d != 0;
    }

    @Override // io.odeeo.internal.u0.q1, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f66793d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f66792c.hashCode();
        this.f66793d = iHashCode;
        return iHashCode;
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return C3191e4.i.f36529d + this.f66792c.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<E> iterator() {
        return w1.singletonIterator(this.f66792c);
    }

    public f3(E e10, int i10) {
        this.f66792c = e10;
        this.f66793d = i10;
    }
}
