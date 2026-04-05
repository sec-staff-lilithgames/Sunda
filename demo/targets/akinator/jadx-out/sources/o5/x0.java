package o5;

import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.a f77780c;

    public /* synthetic */ x0(int i10, kv.a aVar) {
        this.f77779b = i10;
        this.f77780c = aVar;
    }

    @Override // kv.l
    public final Object invoke(Object it) {
        int i10 = this.f77779b;
        kv.a aVar = this.f77780c;
        switch (i10) {
            case 0:
                y0.c cVar = y0.Companion;
                kotlin.jvm.internal.e0.checkNotNullParameter((x5.b) it, "it");
                break;
            default:
                kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                break;
        }
        return aVar.invoke();
    }
}
