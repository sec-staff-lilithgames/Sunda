package rv;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f85053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f85054b;

    public o0(t tVar, t tVar2) {
        this.f85053a = tVar;
        this.f85054b = tVar2;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        List list = f0.toList(this.f85053a);
        boolean zIsEmpty = list.isEmpty();
        t tVar = this.f85054b;
        return zIsEmpty ? tVar.iterator() : f0.filterNot(tVar, new n0(list, 0)).iterator();
    }
}
