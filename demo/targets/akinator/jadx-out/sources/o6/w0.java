package o6;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f77979c;

    public /* synthetic */ w0(y0 y0Var, int i10) {
        this.f77978b = i10;
        this.f77979c = y0Var;
    }

    @Override // kv.a
    public final Object invoke() {
        int i10 = this.f77978b;
        tu.x0 x0Var = tu.x0.f87415a;
        y0 y0Var = this.f77979c;
        switch (i10) {
            case 0:
                String str = y0.f77983m;
                q6.f.cancelAllInAllNamespaces(y0Var.getApplicationContext());
                y0Var.getWorkDatabase().workSpecDao().resetScheduledState();
                t.schedule(y0Var.getConfiguration(), y0Var.getWorkDatabase(), y0Var.getSchedulers());
                break;
            default:
                WorkDatabase workDatabase = y0Var.getWorkDatabase();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
                workDatabase.runInTransaction(new on.z(21, workDatabase, y0Var));
                break;
        }
        return x0Var;
    }
}
