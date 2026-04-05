package u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends u {
    @Override // java.util.Iterator
    public Object next() {
        y0.a.m8013assert(hasNextKey());
        int i10 = this.f87512e;
        this.f87512e = i10 + 2;
        return this.f87510b[i10 + 1];
    }
}
