package uu;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final g f88715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88716c;

    /* renamed from: e, reason: collision with root package name */
    public final int f88717e;

    public f(g list, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
        this.f88715b = list;
        this.f88716c = i10;
        g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, list.size());
        this.f88717e = i11 - i10;
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f88717e);
        return this.f88715b.get(this.f88716c + i10);
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88717e;
    }

    @Override // uu.g, java.util.List, s0.d
    public List<Object> subList(int i10, int i11) {
        g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, this.f88717e);
        int i12 = this.f88716c;
        return new f(this.f88715b, i10 + i12, i12 + i11);
    }
}
