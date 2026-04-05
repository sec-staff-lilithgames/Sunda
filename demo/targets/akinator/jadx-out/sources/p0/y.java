package p0;

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80603c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f80604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f80605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f80606g;

    public /* synthetic */ y(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f80602b = i10;
        this.f80603c = obj;
        this.f80604e = obj2;
        this.f80605f = obj3;
        this.f80606g = obj4;
    }

    @Override // kv.a
    public final Object invoke() {
        int i10 = this.f80602b;
        Object obj = this.f80606g;
        Object obj2 = this.f80605f;
        Object obj3 = this.f80604e;
        Object obj4 = this.f80603c;
        switch (i10) {
            case 0:
                z zVar = (z) obj4;
                q0.a aVar = (q0.a) obj3;
                r4 r4Var = (r4) obj2;
                i2 i2Var = (i2) obj;
                q0.b bVar = zVar.O;
                q0.a changeList = bVar.getChangeList();
                try {
                    bVar.setChangeList(aVar);
                    r4 r4Var2 = zVar.I;
                    int[] iArr = zVar.f80630o;
                    z.j0 j0Var = zVar.f80638w;
                    zVar.f80630o = null;
                    zVar.f80638w = null;
                    try {
                        zVar.I = r4Var;
                        q0.b bVar2 = zVar.O;
                        boolean implicitRootStart = bVar2.getImplicitRootStart();
                        try {
                            bVar2.setImplicitRootStart(false);
                            zVar.n(i2Var.getContent$runtime(), i2Var.getLocals$runtime(), i2Var.getParameter$runtime(), true);
                            bVar.setChangeList(changeList);
                            return tu.x0.f87415a;
                        } finally {
                            bVar2.setImplicitRootStart(implicitRootStart);
                        }
                    } finally {
                        zVar.I = r4Var2;
                        zVar.f80630o = iArr;
                        zVar.f80638w = j0Var;
                    }
                } catch (Throwable th2) {
                    bVar.setChangeList(changeList);
                    throw th2;
                }
            default:
                w6.g0 g0Var = (w6.g0) obj4;
                n6.o oVar = (n6.o) obj2;
                Context context = (Context) obj;
                int i11 = w6.g0.f90409d;
                g0Var.getClass();
                String string = ((UUID) obj3).toString();
                v6.b0 workSpec = g0Var.f90412c.getWorkSpec(string);
                if (workSpec == null || workSpec.f89054b.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                g0Var.f90411b.startForeground(string, oVar);
                context.startService(u6.d.createNotifyIntent(context, v6.n0.generationalId(workSpec), oVar));
                return null;
        }
    }
}
