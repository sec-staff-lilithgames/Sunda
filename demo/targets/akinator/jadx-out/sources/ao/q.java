package ao;

import ao.r;
import bf.o;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class q implements v2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7778c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7779e;

    public /* synthetic */ q(int i10, Object obj, Object obj2) {
        this.f7777b = i10;
        this.f7778c = obj;
        this.f7779e = obj2;
    }

    @Override // mh.v2
    public final Object get() {
        switch (this.f7777b) {
            case 0:
                r.a aVar = (r.a) this.f7778c;
                ln.h hVar = (ln.h) this.f7779e;
                aVar.getClass();
                return new g1(hVar, aVar.f7795a);
            default:
                o.a aVar2 = (o.a) this.f7778c;
                qf.o oVar = (qf.o) this.f7779e;
                aVar2.getClass();
                return new bf.u0(oVar, aVar2.f9369a);
        }
    }
}
