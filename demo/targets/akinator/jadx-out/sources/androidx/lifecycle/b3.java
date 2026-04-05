package androidx.lifecycle;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import g.c;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6526c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6528f;

    public /* synthetic */ b3(Object obj, int i10, Object obj2, Object obj3) {
        this.f6525b = i10;
        this.f6526c = obj;
        this.f6527e = obj2;
        this.f6528f = obj3;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f6525b) {
            case 0:
                kv.l lVar = (kv.l) this.f6526c;
                kotlin.jvm.internal.b1 b1Var = (kotlin.jvm.internal.b1) this.f6527e;
                r1 r1Var = (r1) this.f6528f;
                l1 l1Var = (l1) lVar.invoke(obj);
                Object obj2 = b1Var.f71816b;
                if (obj2 != l1Var) {
                    if (obj2 != null) {
                        kotlin.jvm.internal.e0.checkNotNull(obj2);
                        r1Var.removeSource((l1) obj2);
                    }
                    b1Var.f71816b = l1Var;
                    if (l1Var != null) {
                        kotlin.jvm.internal.e0.checkNotNull(l1Var);
                        r1Var.addSource(l1Var, new d3(new n(r1Var, 1)));
                    }
                }
                return tu.x0.f87415a;
            case 1:
                f.d0 d0Var = (f.d0) this.f6526c;
                b1 b1Var2 = (b1) this.f6527e;
                g.b bVar = (g.b) this.f6528f;
                d0Var.addCallback(b1Var2, bVar);
                return new c.a(bVar);
            case 2:
                return TasksKt.asTask$lambda$0((CancellationTokenSource) this.f6526c, (Deferred) this.f6527e, (TaskCompletionSource) this.f6528f, (Throwable) obj);
            default:
                String str = (String) this.f6526c;
                String str2 = (String) this.f6527e;
                Object[] objArr = (Object[]) this.f6528f;
                y5.c db2 = (y5.c) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
                return Integer.valueOf(db2.delete(str, str2, objArr));
        }
    }
}
