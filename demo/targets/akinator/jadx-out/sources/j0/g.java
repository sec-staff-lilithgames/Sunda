package j0;

import a2.t3;
import a2.w3;
import com.unity3d.services.core.request.NJc.yFkbx;
import d0.s2;
import e1.t;
import e1.v;
import f0.q;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f68764e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q f68765f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s2 f68766g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f68767h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e2.m f68768i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.l f68769j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, q qVar, s2 s2Var, boolean z11, e2.m mVar, kv.l lVar) {
            super(1);
            this.f68764e = z10;
            this.f68765f = qVar;
            this.f68766g = s2Var;
            this.f68767h = z11;
            this.f68768i = mVar;
            this.f68769j = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f68764e, a.b.b(w3Var, "$this$null", "toggleable"), "value", w3Var).set("interactionSource", this.f68765f);
            w3Var.getProperties().set("indication", this.f68766g);
            com.google.android.gms.internal.play_billing.a.d(this.f68767h, w3Var.getProperties(), "enabled", w3Var).set("role", this.f68768i);
            w3Var.getProperties().set("onValueChange", this.f68769j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f68770e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f68771f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f68772g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.l f68773h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, boolean z11, e2.m mVar, kv.l lVar) {
            super(1);
            this.f68770e = z10;
            this.f68771f = z11;
            this.f68772g = mVar;
            this.f68773h = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f68771f, com.google.android.gms.internal.play_billing.a.d(this.f68770e, a.b.b(w3Var, "$this$null", "toggleable"), "value", w3Var), "enabled", w3Var).set("role", this.f68772g);
            w3Var.getProperties().set("onValueChange", this.f68773h);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class c extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f2.a f68774e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f68775f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f68776g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ q f68777h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s2 f68778i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.a f68779j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f2.a aVar, boolean z10, e2.m mVar, q qVar, s2 s2Var, kv.a aVar2) {
            super(1);
            this.f68774e = aVar;
            this.f68775f = z10;
            this.f68776g = mVar;
            this.f68777h = qVar;
            this.f68778i = s2Var;
            this.f68779j = aVar2;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "triStateToggleable").set("state", this.f68774e);
            com.google.android.gms.internal.play_billing.a.d(this.f68775f, w3Var.getProperties(), "enabled", w3Var).set("role", this.f68776g);
            w3Var.getProperties().set("interactionSource", this.f68777h);
            w3Var.getProperties().set("indication", this.f68778i);
            w3Var.getProperties().set("onClick", this.f68779j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class d extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f2.a f68780e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f68781f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f68782g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f68783h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f2.a aVar, boolean z10, e2.m mVar, kv.a aVar2) {
            super(1);
            this.f68780e = aVar;
            this.f68781f = z10;
            this.f68782g = mVar;
            this.f68783h = aVar2;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "triStateToggleable").set("state", this.f68780e);
            com.google.android.gms.internal.play_billing.a.d(this.f68781f, w3Var.getProperties(), "enabled", w3Var).set("role", this.f68782g);
            w3Var.getProperties().set("onClick", this.f68783h);
        }
    }

    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final v m4644toggleableO2vRcR0(v toggleable, boolean z10, q interactionSource, s2 s2Var, boolean z11, e2.m mVar, kv.l onValueChange) {
        boolean z12;
        q qVar;
        s2 s2Var2;
        boolean z13;
        e2.m mVar2;
        kv.l lVar;
        kv.l noInspectorInfo;
        e0.checkNotNullParameter(toggleable, "$this$toggleable");
        e0.checkNotNullParameter(interactionSource, "interactionSource");
        e0.checkNotNullParameter(onValueChange, "onValueChange");
        if (t3.isDebugInspectorInfoEnabled()) {
            z12 = z10;
            qVar = interactionSource;
            s2Var2 = s2Var;
            z13 = z11;
            mVar2 = mVar;
            lVar = onValueChange;
            noInspectorInfo = new a(z12, qVar, s2Var2, z13, mVar2, lVar);
        } else {
            z12 = z10;
            qVar = interactionSource;
            s2Var2 = s2Var;
            z13 = z11;
            mVar2 = mVar;
            lVar = onValueChange;
            noInspectorInfo = t3.getNoInspectorInfo();
        }
        kv.l lVar2 = lVar;
        s2 s2Var3 = s2Var2;
        return t3.inspectableWrapper(toggleable, noInspectorInfo, e1.o.composed$default(t.f53496b, null, new o(f2.b.ToggleableState(z12), z13, mVar2, qVar, s2Var3, new f(z12, lVar2)), 1, null));
    }

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ v m4645toggleableO2vRcR0$default(v vVar, boolean z10, q qVar, s2 s2Var, boolean z11, e2.m mVar, kv.l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            mVar = null;
        }
        return m4644toggleableO2vRcR0(vVar, z10, qVar, s2Var, z12, mVar, lVar);
    }

    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final v m4646toggleableXHw0xAI(v toggleable, boolean z10, boolean z11, e2.m mVar, kv.l onValueChange) {
        e0.checkNotNullParameter(toggleable, "$this$toggleable");
        e0.checkNotNullParameter(onValueChange, "onValueChange");
        return e1.o.composed(toggleable, t3.isDebugInspectorInfoEnabled() ? new b(z10, z11, mVar, onValueChange) : t3.getNoInspectorInfo(), new e(z10, z11, mVar, onValueChange));
    }

    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ v m4647toggleableXHw0xAI$default(v vVar, boolean z10, boolean z11, e2.m mVar, kv.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        return m4646toggleableXHw0xAI(vVar, z10, z11, mVar, lVar);
    }

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ v m4649triStateToggleableO2vRcR0$default(v vVar, f2.a aVar, q qVar, s2 s2Var, boolean z10, e2.m mVar, kv.a aVar2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            mVar = null;
        }
        return m4648triStateToggleableO2vRcR0(vVar, aVar, qVar, s2Var, z11, mVar, aVar2);
    }

    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final v m4650triStateToggleableXHw0xAI(v triStateToggleable, f2.a state, boolean z10, e2.m mVar, kv.a onClick) {
        e0.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        e0.checkNotNullParameter(state, "state");
        e0.checkNotNullParameter(onClick, "onClick");
        return e1.o.composed(triStateToggleable, t3.isDebugInspectorInfoEnabled() ? new d(state, z10, mVar, onClick) : t3.getNoInspectorInfo(), new p(state, z10, mVar, onClick));
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ v m4651triStateToggleableXHw0xAI$default(v vVar, f2.a aVar, boolean z10, e2.m mVar, kv.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        return m4650triStateToggleableXHw0xAI(vVar, aVar, z10, mVar, aVar2);
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final v m4648triStateToggleableO2vRcR0(v triStateToggleable, f2.a state, q qVar, s2 s2Var, boolean z10, e2.m mVar, kv.a onClick) {
        f2.a aVar;
        q qVar2;
        s2 s2Var2;
        boolean z11;
        e2.m mVar2;
        kv.a aVar2;
        kv.l noInspectorInfo;
        e0.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        e0.checkNotNullParameter(state, "state");
        e0.checkNotNullParameter(qVar, yFkbx.EnwymfeYZv);
        e0.checkNotNullParameter(onClick, "onClick");
        if (t3.isDebugInspectorInfoEnabled()) {
            aVar = state;
            qVar2 = qVar;
            s2Var2 = s2Var;
            z11 = z10;
            mVar2 = mVar;
            aVar2 = onClick;
            noInspectorInfo = new c(aVar, z11, mVar2, qVar2, s2Var2, aVar2);
        } else {
            aVar = state;
            qVar2 = qVar;
            s2Var2 = s2Var;
            z11 = z10;
            mVar2 = mVar;
            aVar2 = onClick;
            noInspectorInfo = t3.getNoInspectorInfo();
        }
        kv.a aVar3 = aVar2;
        s2 s2Var3 = s2Var2;
        q qVar3 = qVar2;
        e2.m mVar3 = mVar2;
        return t3.inspectableWrapper(triStateToggleable, noInspectorInfo, e1.o.composed$default(t.f53496b, null, new o(aVar, z11, mVar3, qVar3, s2Var3, aVar3), 1, null));
    }
}
