package b0;

import a2.t3;
import a2.w3;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public interface c0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t1 f8336e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ v1 f8337f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f8338g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t1 t1Var, v1 v1Var, String str) {
            super(1);
            this.f8336e = t1Var;
            this.f8337f = v1Var;
            this.f8338g = str;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "animateEnterExit").set("enter", this.f8336e);
            w3Var.getProperties().set("exit", this.f8337f);
            w3Var.getProperties().set("label", this.f8338g);
        }
    }

    static /* synthetic */ e1.v animateEnterExit$default(c0 c0Var, e1.v vVar, t1 t1Var, v1 v1Var, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if ((i10 & 1) != 0) {
            t1Var = u0.fadeIn$default(null, 0.0f, 3, null).plus(u0.expandIn$default(null, null, false, null, 15, null));
        }
        if ((i10 & 2) != 0) {
            v1Var = u0.fadeOut$default(null, 0.0f, 3, null).plus(u0.shrinkOut$default(null, null, false, null, 15, null));
        }
        if ((i10 & 4) != 0) {
            str = "animateEnterExit";
        }
        return c0Var.animateEnterExit(vVar, t1Var, v1Var, str);
    }

    c0.z1 getTransition();

    default e1.v animateEnterExit(e1.v vVar, t1 enter, v1 v1Var, String label) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(enter, "enter");
        kotlin.jvm.internal.e0.checkNotNullParameter(v1Var, SFPXhf.SzHLYK);
        kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(enter, v1Var, label) : t3.getNoInspectorInfo(), new d0(this, enter, v1Var, label));
    }
}
