package v6;

import tu.x0;
import v6.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f89120c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f89121e;

    public /* synthetic */ g0(m0 m0Var, b0 b0Var, int i10) {
        this.f89119b = i10;
        this.f89120c = m0Var;
        this.f89121e = b0Var;
    }

    @Override // kv.l
    public final Object invoke(Object obj) throws Exception {
        int i10 = this.f89119b;
        x0 x0Var = x0.f87415a;
        b0 b0Var = this.f89121e;
        m0 m0Var = this.f89120c;
        x5.b _connection = (x5.b) obj;
        switch (i10) {
            case 0:
                m0.a aVar = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                m0Var.f89145c.handle(_connection, b0Var);
                break;
            default:
                m0.a aVar2 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                m0Var.f89144b.insert(_connection, b0Var);
                break;
        }
        return x0Var;
    }
}
