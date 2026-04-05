package bu;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f10941a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10942b;

    public s0(int i10, int i11) {
        switch (i11) {
            case 2:
                this.f10941a = new Object[i10];
                break;
            default:
                this.f10941a = new Object[i10];
                break;
        }
    }

    public void a(wr.f0 f0Var) {
        mh.p1.checkNotNull(f0Var, "newState");
        if (((wr.f0) this.f10942b) == f0Var || ((wr.f0) this.f10942b) == wr.f0.f90916g) {
            return;
        }
        this.f10942b = f0Var;
        if (((ArrayList) this.f10941a).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f10941a;
        this.f10941a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xr.b2 b2Var = (xr.b2) it.next();
            b2Var.f92268b.execute(b2Var.f92267a);
        }
    }
}
