package uu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h1 implements Iterable, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f88741b;

    public h1(kv.a iteratorFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f88741b = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<g1> iterator() {
        return new i1((Iterator) this.f88741b.invoke());
    }
}
