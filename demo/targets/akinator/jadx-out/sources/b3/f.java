package b3;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public g f8731b;

    /* renamed from: c, reason: collision with root package name */
    public int f8732c;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8732c < this.f8731b.size();
    }

    @Override // java.util.Iterator
    public d next() {
        d dVar = (d) this.f8731b.f8723h.get(this.f8732c);
        this.f8732c++;
        return dVar;
    }
}
