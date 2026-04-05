package u0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends uu.s implements s0.f {

    /* renamed from: c, reason: collision with root package name */
    public final d f87500c;

    public p(d dVar) {
        this.f87500c = dVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f87500c.containsKey(obj);
    }

    @Override // uu.a
    public int getSize() {
        return this.f87500c.size();
    }

    @Override // uu.s, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new q(this.f87500c.getNode$runtime());
    }
}
