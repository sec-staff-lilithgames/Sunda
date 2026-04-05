package t1;

import a2.t3;
import a2.w3;
import com.amazon.device.ads.DTBMetricReport;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t1.a f86258e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e f86259f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t1.a aVar, e eVar) {
            super(1);
            this.f86258e = aVar;
            this.f86259f = eVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "nestedScroll").set(DTBMetricReport.CONNECTION, this.f86258e);
            w3Var.getProperties().set("dispatcher", this.f86259f);
        }
    }

    public static final v nestedScroll(v vVar, t1.a connection, e eVar) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(connection, "connection");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(connection, eVar) : t3.getNoInspectorInfo(), new g(eVar, connection));
    }

    public static /* synthetic */ v nestedScroll$default(v vVar, t1.a aVar, e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return nestedScroll(vVar, aVar, eVar);
    }
}
