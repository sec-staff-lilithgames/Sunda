package du;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q1 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f52823b;

    public q1(Iterable iterable) {
        this.f52823b = iterable;
    }

    @Override // java.lang.Iterable
    public Iterator<mt.l> iterator() {
        return new r1(this.f52823b.iterator());
    }
}
