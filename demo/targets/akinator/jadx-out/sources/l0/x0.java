package l0;

import bp.oM.DwaEpyvxz;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import g2.x1;
import m0.t1;
import p0.j4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class x0 implements j4 {

    /* renamed from: b, reason: collision with root package name */
    public final o1 f72197b;

    /* renamed from: c, reason: collision with root package name */
    public t1 f72198c;

    /* renamed from: e, reason: collision with root package name */
    public z0 f72199e;

    /* renamed from: f, reason: collision with root package name */
    public final q0 f72200f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.v f72201g;

    /* renamed from: h, reason: collision with root package name */
    public e1.v f72202h;

    /* renamed from: i, reason: collision with root package name */
    public e1.v f72203i;

    public x0(o1 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        this.f72197b = state;
        this.f72200f = new q0(this);
        e1.t tVar = e1.t.f53496b;
        this.f72201g = x1.k1.onGloballyPositioned(g1.j.drawBehind(j1.u0.m4995graphicsLayerpANQ8Wg$default(tVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null), new o0(this)), new l0(this));
        this.f72202h = e2.v.semantics$default(tVar, false, new n0(state.getTextDelegate().getText(), this), 1, null);
        this.f72203i = tVar;
    }

    /* renamed from: access$outOfBoundary-0a9Yr6o, reason: not valid java name */
    public static final boolean m5288access$outOfBoundary0a9Yr6o(x0 x0Var, long j10, long j11) {
        x1 layoutResult = x0Var.f72197b.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int iM4043getOffsetForPositionk4lQ0M = layoutResult.m4043getOffsetForPositionk4lQ0M(j10);
        int iM4043getOffsetForPositionk4lQ0M2 = layoutResult.m4043getOffsetForPositionk4lQ0M(j11);
        int i10 = length - 1;
        return (iM4043getOffsetForPositionk4lQ0M >= i10 && iM4043getOffsetForPositionk4lQ0M2 >= i10) || (iM4043getOffsetForPositionk4lQ0M < 0 && iM4043getOffsetForPositionk4lQ0M2 < 0);
    }

    public final z0 getLongPressDragObserver() {
        z0 z0Var = this.f72199e;
        if (z0Var != null) {
            return z0Var;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("longPressDragObserver");
        return null;
    }

    public final x1.x0 getMeasurePolicy() {
        return this.f72200f;
    }

    public final e1.v getModifiers() {
        return this.f72201g.then(this.f72202h).then(this.f72203i);
    }

    public final e1.v getSemanticsModifier$foundation_release() {
        return this.f72202h;
    }

    public final o1 getState() {
        return this.f72197b;
    }

    @Override // p0.j4
    public void onAbandoned() {
        t1 t1Var;
        m0.r selectable = this.f72197b.getSelectable();
        if (selectable == null || (t1Var = this.f72198c) == null) {
            return;
        }
        t1Var.unsubscribe(selectable);
    }

    @Override // p0.j4
    public void onForgotten() {
        t1 t1Var;
        m0.r selectable = this.f72197b.getSelectable();
        if (selectable == null || (t1Var = this.f72198c) == null) {
            return;
        }
        t1Var.unsubscribe(selectable);
    }

    @Override // p0.j4
    public void onRemembered() {
        t1 t1Var = this.f72198c;
        if (t1Var != null) {
            o1 o1Var = this.f72197b;
            o1Var.setSelectable(t1Var.subscribe(new m0.p(o1Var.getSelectableId(), new r0(this), new s0(this))));
        }
    }

    public final void setLongPressDragObserver(z0 z0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<set-?>");
        this.f72199e = z0Var;
    }

    public final void update(t1 t1Var) {
        this.f72198c = t1Var;
        e1.v vVarPointerHoverIcon$default = e1.t.f53496b;
        if (t1Var != null) {
            if (p1.isInTouchMode()) {
                setLongPressDragObserver(new t0(this, t1Var));
                vVarPointerHoverIcon$default = u1.i1.pointerInput(vVarPointerHoverIcon$default, getLongPressDragObserver(), new u0(this, null));
            } else {
                w0 w0Var = new w0(this, t1Var);
                vVarPointerHoverIcon$default = u1.v.pointerHoverIcon$default(u1.i1.pointerInput(vVarPointerHoverIcon$default, w0Var, new v0(w0Var, null)), m1.getTextPointerIcon(), false, 2, null);
            }
        }
        this.f72203i = vVarPointerHoverIcon$default;
    }

    public final void setTextDelegate(y0 y0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, DwaEpyvxz.DMEtylvECOJwC);
        o1 o1Var = this.f72197b;
        if (o1Var.getTextDelegate() == y0Var) {
            return;
        }
        o1Var.setTextDelegate(y0Var);
        this.f72202h = e2.v.semantics$default(e1.t.f53496b, false, new n0(o1Var.getTextDelegate().getText(), this), 1, null);
    }
}
