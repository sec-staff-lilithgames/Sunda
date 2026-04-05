package w6;

import androidx.work.impl.WorkDatabase;
import o6.y0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f90396b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f90397c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f90398e;

    public /* synthetic */ c(String str, y0 y0Var) {
        this.f90397c = str;
        this.f90398e = y0Var;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f90396b) {
            case 0:
                y0 y0Var = this.f90398e;
                WorkDatabase workDatabase = y0Var.getWorkDatabase();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
                workDatabase.runInTransaction(new b(workDatabase, this.f90397c, y0Var, 1));
                o6.t.schedule(y0Var.getConfiguration(), y0Var.getWorkDatabase(), y0Var.getSchedulers());
                break;
            default:
                String str = this.f90397c;
                y0 y0Var2 = this.f90398e;
                d.forNameInline(str, y0Var2);
                o6.t.schedule(y0Var2.getConfiguration(), y0Var2.getWorkDatabase(), y0Var2.getSchedulers());
                break;
        }
        return x0.f87415a;
    }

    public /* synthetic */ c(y0 y0Var, String str) {
        this.f90398e = y0Var;
        this.f90397c = str;
    }
}
