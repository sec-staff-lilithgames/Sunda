package e0;

import androidx.core.app.NotificationCompat;
import p0.o5;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f53240a = new g3();

    /* renamed from: b, reason: collision with root package name */
    public static final y1.f f53241b = y1.c.modifierLocalOf(f3.f53055e);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m2 f53242e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d0.u3 f53243f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f53244g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f53245h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d2 f53246i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f0.q f53247j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m2 m2Var, t3 t3Var, d0.u3 u3Var, boolean z10, boolean z11, d2 d2Var, f0.q qVar) {
            super(1);
            this.f53242e = m2Var;
            this.f53243f = u3Var;
            this.f53244g = z10;
            this.f53245h = z11;
            this.f53246i = d2Var;
            this.f53247j = qVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "scrollable").set("orientation", this.f53242e);
            w3Var.getProperties().set("state", null);
            w3Var.getProperties().set("overscrollEffect", this.f53243f);
            com.google.android.gms.internal.play_billing.a.d(this.f53245h, com.google.android.gms.internal.play_billing.a.d(this.f53244g, w3Var.getProperties(), "enabled", w3Var), "reverseDirection", w3Var).set("flingBehavior", this.f53246i);
            w3Var.getProperties().set("interactionSource", this.f53247j);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$awaitScrollEvent(u1.c r5, zu.d r6) {
        /*
            boolean r0 = r6 instanceof e0.h3
            if (r0 == 0) goto L13
            r0 = r6
            e0.h3 r0 = (e0.h3) r0
            int r1 = r0.f53091k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53091k = r1
            goto L18
        L13:
            e0.h3 r0 = new e0.h3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53090j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53091k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            u1.c r5 = r0.f53089i
            tu.a0.throwOnFailure(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
        L36:
            r0.f53089i = r5
            r0.f53091k = r3
            r6 = 0
            java.lang.Object r6 = u1.c.awaitPointerEvent$default(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L42
            return r1
        L42:
            u1.m r6 = (u1.m) r6
            int r2 = r6.m7345getType7fucELk()
            u1.q r4 = u1.r.f87659b
            int r4 = r4.m7354getScroll7fucELk()
            boolean r2 = u1.r.m7358equalsimpl0(r2, r4)
            if (r2 == 0) goto L36
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.p3.access$awaitScrollEvent(u1.c, zu.d):java.lang.Object");
    }

    public static final e1.v access$pointerScrollable(e1.v vVar, f0.q qVar, m2 m2Var, boolean z10, t3 t3Var, d2 d2Var, d0.u3 u3Var, boolean z11, p0.w wVar, int i10) {
        boolean z12;
        wVar.startReplaceableGroup(-2012025036);
        wVar.startReplaceableGroup(-1730187034);
        d2 d2VarFlingBehavior = d2Var == null ? e3.f53035a.flingBehavior(wVar, 6) : d2Var;
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar2 = p0.v.f80515a;
        if (objRememberedValue == vVar2.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(new t1.e(), null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue;
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(new z3(m2Var, z10, j2Var, t3Var, d2VarFlingBehavior, u3Var), wVar, 0);
        Boolean boolValueOf = Boolean.valueOf(z11);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(boolValueOf);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChanged || objRememberedValue2 == vVar2.getEmpty()) {
            z12 = z11;
            objRememberedValue2 = new s3(z12, v5VarRememberUpdatedState);
            wVar.updateRememberedValue(objRememberedValue2);
        } else {
            z12 = z11;
        }
        wVar.endReplaceableGroup();
        t1.a aVar = (t1.a) objRememberedValue2;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = wVar.rememberedValue();
        if (objRememberedValue3 == vVar2.getEmpty()) {
            objRememberedValue3 = new v2(v5VarRememberUpdatedState);
            wVar.updateRememberedValue(objRememberedValue3);
        }
        wVar.endReplaceableGroup();
        t2 t2VarPlatformScrollConfig = b.platformScrollConfig(wVar, 0);
        e1.v vVarNestedScroll = t1.f.nestedScroll(u1.i1.pointerInput(m1.draggable(vVar, new k3((v2) objRememberedValue3), l3.f53162e, m2Var, (64 & 8) != 0 ? true : z12, (64 & 16) != 0 ? null : qVar, new m3(v5VarRememberUpdatedState), (64 & 64) != 0 ? new s1(3, null) : null, (64 & 128) != 0 ? new t1(3, null) : new o3(v5VarRememberUpdatedState, j2Var, null), (64 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : false), v5VarRememberUpdatedState, t2VarPlatformScrollConfig, new j3(t2VarPlatformScrollConfig, v5VarRememberUpdatedState, null)), aVar, (t1.e) j2Var.getValue());
        wVar.endReplaceableGroup();
        return vVarNestedScroll;
    }

    public static final y1.f getModifierLocalScrollableContainer() {
        return f53241b;
    }

    public static final e1.v scrollable(e1.v vVar, t3 state, m2 orientation, boolean z10, boolean z11, d2 d2Var, f0.q qVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        return scrollable(vVar, state, orientation, null, z10, z11, d2Var, qVar);
    }

    public static /* synthetic */ e1.v scrollable$default(e1.v vVar, t3 t3Var, m2 m2Var, boolean z10, boolean z11, d2 d2Var, f0.q qVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return scrollable(vVar, t3Var, m2Var, z12, z11, (i10 & 16) != 0 ? null : d2Var, (i10 & 32) != 0 ? null : qVar);
    }

    public static final e1.v scrollable(e1.v vVar, t3 state, m2 orientation, d0.u3 u3Var, boolean z10, boolean z11, d2 d2Var, f0.q qVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        return e1.o.composed(vVar, a2.t3.isDebugInspectorInfoEnabled() ? new a(orientation, state, u3Var, z10, z11, d2Var, qVar) : a2.t3.getNoInspectorInfo(), new q3(orientation, z11, qVar, d2Var, u3Var, z10));
    }

    public static /* synthetic */ e1.v scrollable$default(e1.v vVar, t3 t3Var, m2 m2Var, d0.u3 u3Var, boolean z10, boolean z11, d2 d2Var, f0.q qVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return scrollable(vVar, t3Var, m2Var, u3Var, z12, z11, (i10 & 32) != 0 ? null : d2Var, (i10 & 64) != 0 ? null : qVar);
    }
}
