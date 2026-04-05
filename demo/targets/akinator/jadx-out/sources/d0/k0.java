package d0;

import kotlinx.coroutines.CoroutineScopeKt;
import p0.o4;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f51433e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f51434f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f51435g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f51436h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s2 f51437i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f0.q f51438j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, String str, e2.m mVar, kv.a aVar, s2 s2Var, f0.q qVar) {
            super(1);
            this.f51433e = z10;
            this.f51434f = str;
            this.f51435g = mVar;
            this.f51436h = aVar;
            this.f51437i = s2Var;
            this.f51438j = qVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f51433e, a.b.b(w3Var, "$this$null", "clickable"), "enabled", w3Var).set("onClickLabel", this.f51434f);
            w3Var.getProperties().set("role", this.f51435g);
            w3Var.getProperties().set("onClick", this.f51436h);
            w3Var.getProperties().set("indication", this.f51437i);
            w3Var.getProperties().set("interactionSource", this.f51438j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f51439e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f51440f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f51441g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f51442h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, String str, e2.m mVar, kv.a aVar) {
            super(1);
            this.f51439e = z10;
            this.f51440f = str;
            this.f51441g = mVar;
            this.f51442h = aVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f51439e, a.b.b(w3Var, "$this$null", "clickable"), "enabled", w3Var).set("onClickLabel", this.f51440f);
            w3Var.getProperties().set("role", this.f51441g);
            w3Var.getProperties().set("onClick", this.f51442h);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f51443e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f51444f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f51445g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f51446h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kv.a f51447i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.a f51448j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f51449k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s2 f51450l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f0.q f51451m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, e2.m mVar, kv.a aVar, kv.a aVar2, kv.a aVar3, String str2, s2 s2Var, f0.q qVar) {
            super(1);
            this.f51443e = z10;
            this.f51444f = str;
            this.f51445g = mVar;
            this.f51446h = aVar;
            this.f51447i = aVar2;
            this.f51448j = aVar3;
            this.f51449k = str2;
            this.f51450l = s2Var;
            this.f51451m = qVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f51443e, a.b.b(w3Var, "$this$null", "combinedClickable"), "enabled", w3Var).set("onClickLabel", this.f51444f);
            w3Var.getProperties().set("role", this.f51445g);
            w3Var.getProperties().set("onClick", this.f51446h);
            w3Var.getProperties().set("onDoubleClick", this.f51447i);
            w3Var.getProperties().set("onLongClick", this.f51448j);
            w3Var.getProperties().set("onLongClickLabel", this.f51449k);
            w3Var.getProperties().set("indication", this.f51450l);
            w3Var.getProperties().set("interactionSource", this.f51451m);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f51452e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f51453f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e2.m f51454g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f51455h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kv.a f51456i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.a f51457j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f51458k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, String str, e2.m mVar, kv.a aVar, kv.a aVar2, kv.a aVar3, String str2) {
            super(1);
            this.f51452e = z10;
            this.f51453f = str;
            this.f51454g = mVar;
            this.f51455h = aVar;
            this.f51456i = aVar2;
            this.f51457j = aVar3;
            this.f51458k = str2;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f51452e, a.b.b(w3Var, "$this$null", "combinedClickable"), "enabled", w3Var).set("onClickLabel", this.f51453f);
            w3Var.getProperties().set("role", this.f51454g);
            w3Var.getProperties().set("onClick", this.f51455h);
            w3Var.getProperties().set("onDoubleClick", this.f51456i);
            w3Var.getProperties().set("onLongClick", this.f51457j);
            w3Var.getProperties().set("onLongClickLabel", this.f51458k);
        }
    }

    public static final void PressedInteractionSourceDisposableEffect(f0.q interactionSource, p0.j2 pressedInteraction, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(pressedInteraction, "pressedInteraction");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(1761107222);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(interactionSource) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(pressedInteraction) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            wVarStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = wVarStartRestartGroup.changed(pressedInteraction) | wVarStartRestartGroup.changed(interactionSource);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new b0(pressedInteraction, interactionSource);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            p0.k1.DisposableEffect(interactionSource, (kv.l) objRememberedValue, wVarStartRestartGroup, i11 & 14);
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new c0(interactionSource, pressedInteraction, i10));
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final e1.v m3705clickableO2vRcR0(e1.v clickable, f0.q interactionSource, s2 s2Var, boolean z10, String str, e2.m mVar, kv.a onClick) {
        f0.q qVar;
        s2 s2Var2;
        boolean z11;
        String str2;
        e2.m mVar2;
        kv.a aVar;
        kv.l noInspectorInfo;
        kotlin.jvm.internal.e0.checkNotNullParameter(clickable, "$this$clickable");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        if (a2.t3.isDebugInspectorInfoEnabled()) {
            qVar = interactionSource;
            s2Var2 = s2Var;
            z11 = z10;
            str2 = str;
            mVar2 = mVar;
            aVar = onClick;
            noInspectorInfo = new a(z11, str2, mVar2, aVar, s2Var2, qVar);
        } else {
            qVar = interactionSource;
            s2Var2 = s2Var;
            z11 = z10;
            str2 = str;
            mVar2 = mVar;
            aVar = onClick;
            noInspectorInfo = a2.t3.getNoInspectorInfo();
        }
        f0.q qVar2 = qVar;
        s2 s2Var3 = s2Var2;
        kv.a aVar2 = aVar;
        e2.m mVar3 = mVar2;
        return e1.o.composed(clickable, noInspectorInfo, new j0(z11, str2, mVar3, aVar2, s2Var3, qVar2));
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3706clickableO2vRcR0$default(e1.v vVar, f0.q qVar, s2 s2Var, boolean z10, String str, e2.m mVar, kv.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return m3705clickableO2vRcR0(vVar, qVar, s2Var, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : mVar, aVar);
    }

    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final e1.v m3707clickableXHw0xAI(e1.v clickable, boolean z10, String str, e2.m mVar, kv.a onClick) {
        kotlin.jvm.internal.e0.checkNotNullParameter(clickable, "$this$clickable");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        return e1.o.composed(clickable, a2.t3.isDebugInspectorInfoEnabled() ? new b(z10, str, mVar, onClick) : a2.t3.getNoInspectorInfo(), new d0(z10, str, mVar, onClick));
    }

    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3708clickableXHw0xAI$default(e1.v vVar, boolean z10, String str, e2.m mVar, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        return m3707clickableXHw0xAI(vVar, z10, str, mVar, aVar);
    }

    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final e1.v m3709combinedClickableXVZzFYc(e1.v combinedClickable, f0.q interactionSource, s2 s2Var, boolean z10, String str, e2.m mVar, String str2, kv.a aVar, kv.a aVar2, kv.a onClick) {
        kotlin.jvm.internal.e0.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        return e1.o.composed(combinedClickable, a2.t3.isDebugInspectorInfoEnabled() ? new c(z10, str, mVar, onClick, aVar2, aVar, str2, s2Var, interactionSource) : a2.t3.getNoInspectorInfo(), new u0(z10, str, mVar, onClick, aVar, aVar2, str2, s2Var, interactionSource));
    }

    /* renamed from: combinedClickable-XVZzFYc$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3710combinedClickableXVZzFYc$default(e1.v vVar, f0.q qVar, s2 s2Var, boolean z10, String str, e2.m mVar, String str2, kv.a aVar, kv.a aVar2, kv.a aVar3, int i10, Object obj) {
        kv.a aVar4;
        e1.v vVar2;
        f0.q qVar2;
        s2 s2Var2;
        kv.a aVar5;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        String str3 = (i10 & 8) != 0 ? null : str;
        e2.m mVar2 = (i10 & 16) != 0 ? null : mVar;
        String str4 = (i10 & 32) != 0 ? null : str2;
        kv.a aVar6 = (i10 & 64) != 0 ? null : aVar;
        if ((i10 & 128) != 0) {
            aVar4 = null;
            vVar2 = vVar;
            s2Var2 = s2Var;
            aVar5 = aVar3;
            qVar2 = qVar;
        } else {
            aVar4 = aVar2;
            vVar2 = vVar;
            qVar2 = qVar;
            s2Var2 = s2Var;
            aVar5 = aVar3;
        }
        return m3709combinedClickableXVZzFYc(vVar2, qVar2, s2Var2, z11, str3, mVar2, str4, aVar6, aVar4, aVar5);
    }

    /* renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final e1.v m3711combinedClickablecJG_KMw(e1.v combinedClickable, boolean z10, String str, e2.m mVar, String str2, kv.a aVar, kv.a aVar2, kv.a onClick) {
        kotlin.jvm.internal.e0.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        return e1.o.composed(combinedClickable, a2.t3.isDebugInspectorInfoEnabled() ? new d(z10, str, mVar, onClick, aVar2, aVar, str2) : a2.t3.getNoInspectorInfo(), new l0(z10, str, mVar, aVar, aVar2, onClick, str2));
    }

    /* renamed from: combinedClickable-cJG_KMw$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3712combinedClickablecJG_KMw$default(e1.v vVar, boolean z10, String str, e2.m mVar, String str2, kv.a aVar, kv.a aVar2, kv.a aVar3, int i10, Object obj) {
        kv.a aVar4;
        kv.a aVar5;
        String str3;
        kv.a aVar6;
        String str4;
        e2.m mVar2;
        e1.v vVar2;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        if ((i10 & 32) != 0) {
            aVar4 = null;
            str3 = str2;
            aVar5 = aVar3;
            str4 = str;
            aVar6 = aVar;
            vVar2 = vVar;
            mVar2 = mVar;
        } else {
            aVar4 = aVar2;
            aVar5 = aVar3;
            str3 = str2;
            aVar6 = aVar;
            str4 = str;
            mVar2 = mVar;
            vVar2 = vVar;
        }
        return m3711combinedClickablecJG_KMw(vVar2, z10, str4, mVar2, str3, aVar6, aVar4, aVar5);
    }

    /* renamed from: genericClickableWithoutGesture-BI-LeDI, reason: not valid java name */
    public static final e1.v m3713genericClickableWithoutGestureBILeDI(e1.v genericClickableWithoutGesture, e1.v gestureModifiers, f0.q interactionSource, s2 s2Var, boolean z10, String str, e2.m mVar, String str2, kv.a aVar, kv.a onClick) {
        kotlin.jvm.internal.e0.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        kotlin.jvm.internal.e0.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        return n1.focusableInNonTouchMode(i2.hoverable(v2.indication(s1.i.onKeyEvent(e2.v.semantics(genericClickableWithoutGesture, true, new x0(mVar, str, aVar, str2, z10, onClick)), new y0(z10, onClick)), interactionSource, s2Var), interactionSource, z10), z10, interactionSource).then(gestureModifiers);
    }

    /* renamed from: genericClickableWithoutGesture-BI-LeDI$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3714genericClickableWithoutGestureBILeDI$default(e1.v vVar, e1.v vVar2, f0.q qVar, s2 s2Var, boolean z10, String str, e2.m mVar, String str2, kv.a aVar, kv.a aVar2, int i10, Object obj) {
        kv.a aVar3;
        e1.v vVar3;
        e1.v vVar4;
        f0.q qVar2;
        s2 s2Var2;
        kv.a aVar4;
        boolean z11 = (i10 & 8) != 0 ? true : z10;
        String str3 = (i10 & 16) != 0 ? null : str;
        e2.m mVar2 = (i10 & 32) != 0 ? null : mVar;
        String str4 = (i10 & 64) != 0 ? null : str2;
        if ((i10 & 128) != 0) {
            aVar3 = null;
            vVar4 = vVar2;
            qVar2 = qVar;
            s2Var2 = s2Var;
            aVar4 = aVar2;
            vVar3 = vVar;
        } else {
            aVar3 = aVar;
            vVar3 = vVar;
            vVar4 = vVar2;
            qVar2 = qVar;
            s2Var2 = s2Var;
            aVar4 = aVar2;
        }
        return m3713genericClickableWithoutGestureBILeDI(vVar3, vVar4, qVar2, s2Var2, z11, str3, mVar2, str4, aVar3, aVar4);
    }

    /* renamed from: handlePressInteraction-EPk0efs, reason: not valid java name */
    public static final Object m3715handlePressInteractionEPk0efs(e0.p2 p2Var, long j10, f0.q qVar, p0.j2 j2Var, v5 v5Var, zu.d<? super tu.x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a1(p2Var, j10, qVar, j2Var, v5Var, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : tu.x0.f87415a;
    }
}
