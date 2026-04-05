package u2;

import a2.e4;
import a2.i6;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.b1;
import androidx.lifecycle.o3;
import b1.l0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import tv.Mu.QpyI;
import u1.t0;
import x1.k1;
import x3.n0;
import x3.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class o extends ViewGroup implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public final t1.e f87743b;

    /* renamed from: c, reason: collision with root package name */
    public View f87744c;

    /* renamed from: e, reason: collision with root package name */
    public kv.a f87745e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f87746f;

    /* renamed from: g, reason: collision with root package name */
    public e1.v f87747g;

    /* renamed from: h, reason: collision with root package name */
    public kv.l f87748h;

    /* renamed from: i, reason: collision with root package name */
    public s2.e f87749i;

    /* renamed from: j, reason: collision with root package name */
    public kv.l f87750j;

    /* renamed from: k, reason: collision with root package name */
    public b1 f87751k;

    /* renamed from: l, reason: collision with root package name */
    public v5.j f87752l;

    /* renamed from: m, reason: collision with root package name */
    public final l0 f87753m;

    /* renamed from: n, reason: collision with root package name */
    public final i f87754n;

    /* renamed from: o, reason: collision with root package name */
    public final l f87755o;

    /* renamed from: p, reason: collision with root package name */
    public kv.l f87756p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f87757q;

    /* renamed from: r, reason: collision with root package name */
    public int f87758r;

    /* renamed from: s, reason: collision with root package name */
    public int f87759s;

    /* renamed from: t, reason: collision with root package name */
    public final p0 f87760t;

    /* renamed from: u, reason: collision with root package name */
    public final z1.b0 f87761u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, p0.f0 f0Var, t1.e dispatcher) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        this.f87743b = dispatcher;
        if (f0Var != null) {
            i6.setCompositionContext(this, f0Var);
        }
        setSaveFromParentEnabled(false);
        this.f87745e = n.f87742e;
        e1.t tVar = e1.t.f53496b;
        this.f87747g = tVar;
        this.f87749i = s2.g.Density$default(1.0f, 0.0f, 2, null);
        this.f87753m = new l0(new m(this));
        this.f87754n = new i(this);
        this.f87755o = new l(this);
        this.f87757q = new int[2];
        this.f87758r = Integer.MIN_VALUE;
        this.f87759s = Integer.MIN_VALUE;
        this.f87760t = new p0(this);
        z1.b0 b0Var = new z1.b0(false, 1, null);
        e1.v vVarOnGloballyPositioned = k1.onGloballyPositioned(g1.j.drawBehind(t0.pointerInteropFilter(tVar, this), new g(this, b0Var)), new h(this, b0Var));
        b0Var.setModifier(this.f87747g.then(vVarOnGloballyPositioned));
        this.f87748h = new a(b0Var, vVarOnGloballyPositioned);
        b0Var.setDensity(this.f87749i);
        this.f87750j = new b(b0Var);
        kotlin.jvm.internal.b1 b1Var = new kotlin.jvm.internal.b1();
        b0Var.setOnAttach$ui_release(new c(this, b0Var, b1Var));
        b0Var.setOnDetach$ui_release(new d(this, b1Var));
        b0Var.setMeasurePolicy(new f(this, b0Var));
        this.f87761u = b0Var;
    }

    public static final int access$obtainMeasureSpec(o oVar, int i10, int i11, int i12) {
        oVar.getClass();
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(qv.v.coerceIn(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f87757q;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    public final s2.e getDensity() {
        return this.f87749i;
    }

    public final z1.b0 getLayoutNode() {
        return this.f87761u;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f87744c;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final b1 getLifecycleOwner() {
        return this.f87751k;
    }

    public final e1.v getModifier() {
        return this.f87747g;
    }

    @Override // android.view.ViewGroup, x3.n0
    public int getNestedScrollAxes() {
        return this.f87760t.getNestedScrollAxes();
    }

    public final kv.l getOnDensityChanged$ui_release() {
        return this.f87750j;
    }

    public final kv.l getOnModifierChanged$ui_release() {
        return this.f87748h;
    }

    public final kv.l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f87756p;
    }

    public final v5.j getSavedStateRegistryOwner() {
        return this.f87752l;
    }

    public final kv.a getUpdate() {
        return this.f87745e;
    }

    public final View getView() {
        return this.f87744c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f87761u.invalidateLayer$ui_release();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        View view = this.f87744c;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f87753m.start();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        super.onDescendantInvalidated(child, target);
        this.f87761u.invalidateLayer$ui_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.f87753m;
        l0Var.stop();
        l0Var.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f87744c;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f87744c;
        if (view != null) {
            view.measure(i10, i11);
        }
        View view2 = this.f87744c;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.f87744c;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f87758r = i10;
        this.f87759s = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public boolean onNestedFling(View target, float f10, float f11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f87743b.getCoroutineScope(), null, null, new j(z10, this, s2.f0.Velocity(p.access$toComposeVelocity(f10), p.access$toComposeVelocity(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public boolean onNestedPreFling(View target, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f87743b.getCoroutineScope(), null, null, new k(this, s2.f0.Velocity(p.access$toComposeVelocity(f10), p.access$toComposeVelocity(f11)), null), 3, null);
        return false;
    }

    @Override // x3.n0
    public void onNestedPreScroll(View target, int i10, int i11, int[] consumed, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.e0.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jM7018dispatchPreScrollOzD1aCk = this.f87743b.m7018dispatchPreScrollOzD1aCk(i1.i.Offset(p.access$toComposeOffset(i10), p.access$toComposeOffset(i11)), p.access$toNestedScrollSource(i12));
            consumed[0] = e4.composeToViewOffset(i1.h.m4185getXimpl(jM7018dispatchPreScrollOzD1aCk));
            consumed[1] = e4.composeToViewOffset(i1.h.m4186getYimpl(jM7018dispatchPreScrollOzD1aCk));
        }
    }

    @Override // x3.n0
    public void onNestedScroll(View target, int i10, int i11, int i12, int i13, int i14, int[] consumed) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.e0.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jM7016dispatchPostScrollDzOQY0M = this.f87743b.m7016dispatchPostScrollDzOQY0M(i1.i.Offset(p.access$toComposeOffset(i10), p.access$toComposeOffset(i11)), i1.i.Offset(p.access$toComposeOffset(i12), p.access$toComposeOffset(i13)), p.access$toNestedScrollSource(i14));
            consumed[0] = e4.composeToViewOffset(i1.h.m4185getXimpl(jM7016dispatchPostScrollDzOQY0M));
            consumed[1] = e4.composeToViewOffset(i1.h.m4186getYimpl(jM7016dispatchPostScrollDzOQY0M));
        }
    }

    @Override // x3.n0
    public void onNestedScrollAccepted(View child, View target, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        this.f87760t.onNestedScrollAccepted(child, target, i10, i11);
    }

    @Override // x3.n0
    public boolean onStartNestedScroll(View child, View target, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // x3.n0
    public void onStopNestedScroll(View target, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        this.f87760t.onStopNestedScroll(target, i10);
    }

    public final void remeasure() {
        int i10;
        int i11 = this.f87758r;
        if (i11 == Integer.MIN_VALUE || (i10 = this.f87759s) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        kv.l lVar = this.f87756p;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(s2.e value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        if (value != this.f87749i) {
            this.f87749i = value;
            kv.l lVar = this.f87750j;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(b1 b1Var) {
        if (b1Var != this.f87751k) {
            this.f87751k = b1Var;
            o3.set(this, b1Var);
        }
    }

    public final void setModifier(e1.v value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        if (value != this.f87747g) {
            this.f87747g = value;
            kv.l lVar = this.f87748h;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(kv.l lVar) {
        this.f87750j = lVar;
    }

    public final void setOnModifierChanged$ui_release(kv.l lVar) {
        this.f87748h = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(kv.l lVar) {
        this.f87756p = lVar;
    }

    public final void setSavedStateRegistryOwner(v5.j jVar) {
        if (jVar != this.f87752l) {
            this.f87752l = jVar;
            v5.n.set(this, jVar);
        }
    }

    public final void setView$ui_release(View view) {
        if (view != this.f87744c) {
            this.f87744c = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f87755o.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void setUpdate(kv.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, QpyI.uLwJKrHeURGdVoF);
        this.f87745e = aVar;
        this.f87746f = true;
        this.f87755o.invoke();
    }

    @Override // x3.n0
    public void onNestedScroll(View target, int i10, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        if (isNestedScrollingEnabled()) {
            this.f87743b.m7016dispatchPostScrollDzOQY0M(i1.i.Offset(p.access$toComposeOffset(i10), p.access$toComposeOffset(i11)), i1.i.Offset(p.access$toComposeOffset(i12), p.access$toComposeOffset(i13)), p.access$toNestedScrollSource(i14));
        }
    }
}
