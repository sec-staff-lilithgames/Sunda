package j0;

import a2.t3;
import a2.w3;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import d0.k0;
import d0.s2;
import e1.t;
import e1.v;
import f0.q;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f68746e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q f68747f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s2 f68748g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f68749h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e2.m f68750i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.a f68751j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, q qVar, s2 s2Var, boolean z11, e2.m mVar, kv.a aVar) {
            super(1);
            this.f68746e = z10;
            this.f68747f = qVar;
            this.f68748g = s2Var;
            this.f68749h = z11;
            this.f68750i = mVar;
            this.f68751j = aVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f68746e, a.b.b(w3Var, "$this$null", "selectable"), "selected", w3Var).set(KGUkpTlXZlJLy.EXCQJ, this.f68747f);
            w3Var.getProperties().set("indication", this.f68748g);
            com.google.android.gms.internal.play_billing.a.d(this.f68749h, w3Var.getProperties(), "enabled", w3Var).set("role", this.f68750i);
            w3Var.getProperties().set("onClick", this.f68751j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f68752e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f68753f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f68754g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f68755h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, boolean z11, e2.m mVar, kv.a aVar) {
            super(1);
            this.f68752e = z10;
            this.f68753f = z11;
            this.f68754g = mVar;
            this.f68755h = aVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f68753f, com.google.android.gms.internal.play_billing.a.d(this.f68752e, a.b.b(w3Var, "$this$null", "selectable"), "selected", w3Var), "enabled", w3Var).set("role", this.f68754g);
            w3Var.getProperties().set("onClick", this.f68755h);
        }
    }

    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final v m4637selectableO2vRcR0(v selectable, boolean z10, q interactionSource, s2 s2Var, boolean z11, e2.m mVar, kv.a onClick) {
        e0.checkNotNullParameter(selectable, "$this$selectable");
        e0.checkNotNullParameter(interactionSource, "interactionSource");
        e0.checkNotNullParameter(onClick, "onClick");
        return t3.inspectableWrapper(selectable, t3.isDebugInspectorInfoEnabled() ? new a(z10, interactionSource, s2Var, z11, mVar, onClick) : t3.getNoInspectorInfo(), e2.v.semantics$default(k0.m3706clickableO2vRcR0$default(t.f53496b, interactionSource, s2Var, z11, null, mVar, onClick, 8, null), false, new j0.b(z10), 1, null));
    }

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ v m4638selectableO2vRcR0$default(v vVar, boolean z10, q qVar, s2 s2Var, boolean z11, e2.m mVar, kv.a aVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            mVar = null;
        }
        return m4637selectableO2vRcR0(vVar, z10, qVar, s2Var, z12, mVar, aVar);
    }

    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final v m4639selectableXHw0xAI(v selectable, boolean z10, boolean z11, e2.m mVar, kv.a onClick) {
        e0.checkNotNullParameter(selectable, "$this$selectable");
        e0.checkNotNullParameter(onClick, "onClick");
        return e1.o.composed(selectable, t3.isDebugInspectorInfoEnabled() ? new b(z10, z11, mVar, onClick) : t3.getNoInspectorInfo(), new j0.a(z10, z11, mVar, onClick));
    }

    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ v m4640selectableXHw0xAI$default(v vVar, boolean z10, boolean z11, e2.m mVar, kv.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        return m4639selectableXHw0xAI(vVar, z10, z11, mVar, aVar);
    }
}
