package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p5 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final ej f76551b;

    public p5(r5 r5Var) {
        this.f76551b = r5Var.f76596c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76551b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return ((Map.Entry) this.f76551b.next()).getValue();
    }
}
