package rv;

import java.util.Iterator;
import uu.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f85065a;

    public q(t sequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        this.f85065a = sequence;
    }

    @Override // rv.t
    public Iterator<g1> iterator() {
        return new p(this);
    }
}
