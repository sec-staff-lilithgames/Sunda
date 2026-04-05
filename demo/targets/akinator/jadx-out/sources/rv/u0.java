package rv;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f85099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f85100b;

    public u0(t tVar, Comparator comparator) {
        this.f85099a = tVar;
        this.f85100b = comparator;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        List mutableList = f0.toMutableList(this.f85099a);
        uu.u0.sortWith(mutableList, this.f85100b);
        return mutableList.iterator();
    }
}
