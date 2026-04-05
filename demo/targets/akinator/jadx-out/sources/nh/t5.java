package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t5 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final ej f76654b;

    /* renamed from: c, reason: collision with root package name */
    public ej f76655c = s7.f76631f;

    public t5(y5 y5Var) {
        this.f76654b = y5Var.f76784h.values().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76655c.hasNext() || this.f76654b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f76655c.hasNext()) {
            this.f76655c = ((u4) this.f76654b.next()).iterator();
        }
        return this.f76655c.next();
    }
}
