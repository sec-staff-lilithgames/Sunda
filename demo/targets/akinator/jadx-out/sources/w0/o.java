package w0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends uu.s implements s0.f {

    /* renamed from: c, reason: collision with root package name */
    public final c f90311c;

    public o(c cVar) {
        this.f90311c = cVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f90311c.containsKey(obj);
    }

    @Override // uu.a
    public int getSize() {
        return this.f90311c.size();
    }

    @Override // uu.s, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new p(this.f90311c);
    }
}
