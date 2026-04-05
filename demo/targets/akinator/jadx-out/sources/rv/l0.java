package rv;

import java.util.Iterator;
import p0.g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f85039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f85040b;

    public l0(t tVar, Object[] objArr) {
        this.f85039a = tVar;
        this.f85040b = objArr;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return f0.filterNot(this.f85039a, new g2(this.f85040b, 10)).iterator();
    }
}
