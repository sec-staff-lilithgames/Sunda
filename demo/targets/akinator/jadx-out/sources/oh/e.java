package oh;

import java.util.Iterator;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    public final a f79390b;

    public e(a aVar) {
        this.f79390b = (a) p1.checkNotNull(aVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f79390b.equals(((e) obj).f79390b);
        }
        return false;
    }

    public int hashCode() {
        return e.class.hashCode() ^ this.f79390b.hashCode();
    }

    public String toString() {
        return "Funnels.sequentialFunnel(" + this.f79390b + ")";
    }

    @Override // oh.a
    public void funnel(Iterable<Object> iterable, p pVar) {
        Iterator<Object> it = iterable.iterator();
        while (it.hasNext()) {
            this.f79390b.funnel(it.next(), pVar);
        }
    }
}
