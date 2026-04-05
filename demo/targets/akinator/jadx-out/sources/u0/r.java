package u0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends uu.a implements s0.b {

    /* renamed from: b, reason: collision with root package name */
    public final d f87501b;

    public r(d dVar) {
        this.f87501b = dVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f87501b.containsValue(obj);
    }

    @Override // uu.a
    public int getSize() {
        return this.f87501b.size();
    }

    @Override // uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new s(this.f87501b.getNode$runtime());
    }
}
