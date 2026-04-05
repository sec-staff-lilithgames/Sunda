package bi;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements sj.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9569c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f9567a = i10;
        this.f9568b = obj;
        this.f9569c = obj2;
    }

    @Override // sj.c
    public final Object get() {
        switch (this.f9567a) {
            case 0:
                n nVar = (n) this.f9568b;
                c cVar = (c) this.f9569c;
                return cVar.getFactory().create(new d0(cVar, nVar));
            case 1:
                com.google.firebase.g gVar = (com.google.firebase.g) this.f9568b;
                return new yj.a((Context) this.f9569c, gVar.getPersistenceKey(), (yi.c) gVar.f29680d.get(yi.c.class));
            default:
                return new zi.j((Context) this.f9568b, (String) this.f9569c);
        }
    }
}
