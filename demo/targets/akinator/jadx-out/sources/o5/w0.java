package o5;

import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f77762c;

    public /* synthetic */ w0(y0 y0Var, int i10) {
        this.f77761b = i10;
        this.f77762c = y0Var;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f77761b;
        tu.x0 x0Var = tu.x0.f87415a;
        y0 y0Var = this.f77762c;
        switch (i10) {
            case 0:
                y5.c it = (y5.c) obj;
                y0.c cVar = y0.Companion;
                kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                y0Var.getOpenHelper().getWritableDatabase().endTransaction();
                if (!y0Var.inTransaction()) {
                    y0Var.getInvalidationTracker().refreshVersionsAsync();
                }
                return x0Var;
            case 1:
                l config = (l) obj;
                y0.c cVar2 = y0.Companion;
                kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
                return y0Var.createOpenHelper(config);
            default:
                y5.c it2 = (y5.c) obj;
                y0.c cVar3 = y0.Companion;
                kotlin.jvm.internal.e0.checkNotNullParameter(it2, "it");
                y0Var.d();
                return x0Var;
        }
    }
}
