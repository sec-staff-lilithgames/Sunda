package v6;

import tu.x0;
import v6.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f89138c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x5.b f89139e;

    public /* synthetic */ l(m mVar, x5.b bVar, int i10) {
        this.f89137b = i10;
        this.f89138c = mVar;
        this.f89139e = bVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f89137b;
        x0 x0Var = x0.f87415a;
        x5.b bVar = this.f89139e;
        m mVar = this.f89138c;
        z.f _tmpMap = (z.f) obj;
        switch (i10) {
            case 0:
                m.a aVar = m.f89140b;
                kotlin.jvm.internal.e0.checkNotNullParameter(_tmpMap, "_tmpMap");
                mVar.a(bVar, _tmpMap);
                break;
            default:
                m.a aVar2 = m.f89140b;
                kotlin.jvm.internal.e0.checkNotNullParameter(_tmpMap, "_tmpMap");
                mVar.b(bVar, _tmpMap);
                break;
        }
        return x0Var;
    }
}
