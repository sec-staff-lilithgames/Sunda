package bk;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements bi.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9710c;

    public /* synthetic */ g(String str, Object obj, int i10) {
        this.f9708a = i10;
        this.f9709b = str;
        this.f9710c = obj;
    }

    @Override // bi.i
    public final Object create(bi.d dVar) {
        switch (this.f9708a) {
            case 0:
                return new a(this.f9709b, ((h) this.f9710c).extract((Context) dVar.get(Context.class)));
            default:
                String str = this.f9709b;
                bi.c cVar = (bi.c) this.f9710c;
                try {
                    jk.b.pushTrace(str);
                    return cVar.getFactory().create(dVar);
                } finally {
                    jk.b.popTrace();
                }
        }
    }
}
