package g1;

import a2.t3;
import a2.w3;
import e1.v;
import j1.n0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m1.e f56689e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f56690f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e1.d f56691g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x1.r f56692h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f56693i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ n0 f56694j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1.e eVar, boolean z10, e1.d dVar, x1.r rVar, float f10, n0 n0Var) {
            super(1);
            this.f56689e = eVar;
            this.f56690f = z10;
            this.f56691g = dVar;
            this.f56692h = rVar;
            this.f56693i = f10;
            this.f56694j = n0Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "paint").set("painter", this.f56689e);
            com.google.android.gms.internal.play_billing.a.d(this.f56690f, w3Var.getProperties(), "sizeToIntrinsics", w3Var).set("alignment", this.f56691g);
            w3Var.getProperties().set("contentScale", this.f56692h);
            w3Var.getProperties().set("alpha", Float.valueOf(this.f56693i));
            w3Var.getProperties().set("colorFilter", this.f56694j);
        }
    }

    public static final v paint(v vVar, m1.e painter, boolean z10, e1.d alignment, x1.r contentScale, float f10, n0 n0Var) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(painter, "painter");
        e0.checkNotNullParameter(alignment, "alignment");
        e0.checkNotNullParameter(contentScale, "contentScale");
        return vVar.then(new p(painter, z10, alignment, contentScale, f10, n0Var, t3.isDebugInspectorInfoEnabled() ? new a(painter, z10, alignment, contentScale, f10, n0Var) : t3.getNoInspectorInfo()));
    }

    public static /* synthetic */ v paint$default(v vVar, m1.e eVar, boolean z10, e1.d dVar, x1.r rVar, float f10, n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            dVar = e1.d.f53469a.getCenter();
        }
        e1.d dVar2 = dVar;
        if ((i10 & 8) != 0) {
            rVar = x1.r.f91409a.getInside();
        }
        x1.r rVar2 = rVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            n0Var = null;
        }
        return paint(vVar, eVar, z11, dVar2, rVar2, f11, n0Var);
    }
}
