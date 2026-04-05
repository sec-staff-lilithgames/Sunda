package rv;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f85094a;

    public t0(t tVar) {
        this.f85094a = tVar;
    }

    @Override // rv.t
    public Iterator<Comparable<Object>> iterator() {
        List mutableList = f0.toMutableList(this.f85094a);
        uu.u0.sort(mutableList);
        return mutableList.iterator();
    }
}
