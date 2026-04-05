package v6;

import tu.x0;
import v6.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f89131c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x5.b f89132e;

    public /* synthetic */ j0(m0 m0Var, x5.b bVar, int i10) {
        this.f89130b = i10;
        this.f89131c = m0Var;
        this.f89132e = bVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f89130b;
        x0 x0Var = x0.f87415a;
        x5.b bVar = this.f89132e;
        m0 m0Var = this.f89131c;
        z.f _tmpMap = (z.f) obj;
        switch (i10) {
            case 0:
                m0.a aVar = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_tmpMap, "_tmpMap");
                m0Var.a(bVar, _tmpMap);
                break;
            default:
                m0.a aVar2 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_tmpMap, "_tmpMap");
                m0Var.b(bVar, _tmpMap);
                break;
        }
        return x0Var;
    }
}
