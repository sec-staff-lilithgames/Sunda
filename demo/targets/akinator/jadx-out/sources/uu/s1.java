package uu;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s1 extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f88780b;

    /* renamed from: c, reason: collision with root package name */
    public int f88781c;

    /* renamed from: e, reason: collision with root package name */
    public int f88782e;

    public s1(List<Object> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
        this.f88780b = list;
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f88782e);
        return this.f88780b.get(this.f88781c + i10);
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88782e;
    }

    public final void move(int i10, int i11) {
        g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, this.f88780b.size());
        this.f88781c = i10;
        this.f88782e = i11 - i10;
    }
}
