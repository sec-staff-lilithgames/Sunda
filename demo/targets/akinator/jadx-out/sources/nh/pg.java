package nh;

import com.ironsource.C3191e4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class pg extends l6 {

    /* renamed from: e, reason: collision with root package name */
    public final transient Object f76569e;

    public pg(Object obj) {
        this.f76569e = mh.p1.checkNotNull(obj);
    }

    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        objArr[i10] = this.f76569e;
        return i10 + 1;
    }

    @Override // nh.l6, nh.u4
    public b5 asList() {
        return b5.of(this.f76569e);
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76569e.equals(obj);
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f76569e.hashCode();
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return C3191e4.i.f36529d + this.f76569e.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return z7.singletonIterator(this.f76569e);
    }
}
