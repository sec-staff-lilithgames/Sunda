package a2;

import a2.j5;
import a2.t;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import i2.hQ.aTNDubNmpwAqdU;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class t extends ViewGroup implements z1.s1, q5, u1.a1, androidx.lifecycle.r {

    /* renamed from: r0, reason: collision with root package name */
    public static final a f3798r0 = new a(null);

    /* renamed from: s0, reason: collision with root package name */
    public static Class f3799s0;

    /* renamed from: t0, reason: collision with root package name */
    public static Method f3800t0;
    public boolean A;
    public y1 B;
    public j3 C;
    public s2.c D;
    public boolean E;
    public final z1.d1 F;
    public final x1 G;
    public long H;
    public final int[] I;
    public final float[] J;
    public final float[] K;
    public long L;
    public boolean M;
    public long N;
    public boolean O;
    public final p0.j2 P;
    public kv.l Q;
    public final p R;
    public final q S;
    public final r T;
    public final m2.u0 U;
    public final m2.l0 V;
    public final i1 W;

    /* renamed from: a0, reason: collision with root package name */
    public final p0.j2 f3801a0;

    /* renamed from: b, reason: collision with root package name */
    public long f3802b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3803b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3804c;

    /* renamed from: c0, reason: collision with root package name */
    public final p0.j2 f3805c0;

    /* renamed from: d0, reason: collision with root package name */
    public final p1.d f3806d0;

    /* renamed from: e, reason: collision with root package name */
    public final z1.n0 f3807e;

    /* renamed from: e0, reason: collision with root package name */
    public final q1.d f3808e0;

    /* renamed from: f, reason: collision with root package name */
    public s2.e f3809f;

    /* renamed from: f0, reason: collision with root package name */
    public final l1 f3810f0;

    /* renamed from: g, reason: collision with root package name */
    public final h1.o f3811g;

    /* renamed from: g0, reason: collision with root package name */
    public MotionEvent f3812g0;

    /* renamed from: h, reason: collision with root package name */
    public final t5 f3813h;

    /* renamed from: h0, reason: collision with root package name */
    public long f3814h0;

    /* renamed from: i, reason: collision with root package name */
    public final s1.g f3815i;

    /* renamed from: i0, reason: collision with root package name */
    public final r5 f3816i0;

    /* renamed from: j, reason: collision with root package name */
    public final j1.f0 f3817j;

    /* renamed from: j0, reason: collision with root package name */
    public final r0.c f3818j0;

    /* renamed from: k, reason: collision with root package name */
    public final z1.b0 f3819k;

    /* renamed from: k0, reason: collision with root package name */
    public final a0 f3820k0;

    /* renamed from: l, reason: collision with root package name */
    public final t f3821l;

    /* renamed from: l0, reason: collision with root package name */
    public final s f3822l0;

    /* renamed from: m, reason: collision with root package name */
    public final e2.e0 f3823m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f3824m0;

    /* renamed from: n, reason: collision with root package name */
    public final i0 f3825n;

    /* renamed from: n0, reason: collision with root package name */
    public final z f3826n0;

    /* renamed from: o, reason: collision with root package name */
    public final f1.i f3827o;

    /* renamed from: o0, reason: collision with root package name */
    public final a2 f3828o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3829p;

    /* renamed from: p0, reason: collision with root package name */
    public u1.t f3830p0;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3831q;

    /* renamed from: q0, reason: collision with root package name */
    public final y f3832q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3833r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.h f3834s;

    /* renamed from: t, reason: collision with root package name */
    public final u1.g0 f3835t;

    /* renamed from: u, reason: collision with root package name */
    public kv.l f3836u;

    /* renamed from: v, reason: collision with root package name */
    public final f1.a f3837v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3838w;

    /* renamed from: x, reason: collision with root package name */
    public final m f3839x;

    /* renamed from: y, reason: collision with root package name */
    public final l f3840y;

    /* renamed from: z, reason: collision with root package name */
    public final z1.y1 f3841z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final boolean access$getIsShowingLayoutBounds(a aVar) {
            aVar.getClass();
            try {
                if (t.f3799s0 == null) {
                    t.f3799s0 = Class.forName("android.os.SystemProperties");
                    Class cls = t.f3799s0;
                    t.f3800t0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = t.f3800t0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.b1 f3842a;

        /* renamed from: b, reason: collision with root package name */
        public final v5.j f3843b;

        public b(androidx.lifecycle.b1 lifecycleOwner, v5.j savedStateRegistryOwner) {
            kotlin.jvm.internal.e0.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            kotlin.jvm.internal.e0.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.f3842a = lifecycleOwner;
            this.f3843b = savedStateRegistryOwner;
        }

        public final androidx.lifecycle.b1 getLifecycleOwner() {
            return this.f3842a;
        }

        public final v5.j getSavedStateRegistryOwner() {
            return this.f3843b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20, types: [a2.r] */
    public t(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        i1.g gVar = i1.h.f59344b;
        this.f3802b = gVar.m4172getUnspecifiedF1C5BW0();
        int i10 = 1;
        this.f3804c = true;
        this.f3807e = new z1.n0(null, i10, 0 == true ? 1 : 0);
        this.f3809f = s2.a.Density(context);
        e2.u uVar = new e2.u(e2.u.f53627e.generateSemanticsId(), false, false, c0.f3466e);
        h1.o oVar = new h1.o(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f3811g = oVar;
        this.f3813h = new t5();
        s1.g gVar2 = new s1.g(new x(this), null);
        this.f3815i = gVar2;
        b0 b0Var = b0.f3455e;
        e1.t tVar = e1.t.f53496b;
        e1.v vVarOnRotaryScrollEvent = w1.c.onRotaryScrollEvent(tVar, b0Var);
        this.f3817j = new j1.f0();
        z1.b0 b0Var2 = new z1.b0(false, i10, 0 == true ? 1 : 0);
        b0Var2.setMeasurePolicy(x1.x1.f91449b);
        b0Var2.setModifier(tVar.then(uVar).then(vVarOnRotaryScrollEvent).then(oVar.getModifier()).then(gVar2));
        b0Var2.setDensity(getDensity());
        this.f3819k = b0Var2;
        this.f3821l = this;
        this.f3823m = new e2.e0(getRoot());
        i0 i0Var = new i0(this);
        this.f3825n = i0Var;
        this.f3827o = new f1.i();
        this.f3829p = new ArrayList();
        this.f3834s = new u1.h();
        this.f3835t = new u1.g0(getRoot());
        this.f3836u = w.f3868e;
        int i11 = Build.VERSION.SDK_INT;
        this.f3837v = i11 >= 26 ? new f1.a(this, getAutofillTree()) : null;
        this.f3839x = new m(context);
        this.f3840y = new l(context);
        this.f3841z = new z1.y1(new e0(this));
        this.F = new z1.d1(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.G = new x1(viewConfiguration);
        this.H = s2.q.f85352b.m6920getZeronOccac();
        this.I = new int[]{0, 0};
        this.J = j1.e1.m4732constructorimpl$default(null, 1, null);
        this.K = j1.e1.m4732constructorimpl$default(null, 1, null);
        this.L = -1L;
        this.N = gVar.m4171getInfiniteF1C5BW0();
        this.O = true;
        this.P = p0.o5.mutableStateOf$default(null, null, 2, null);
        this.R = new p(this, 0);
        this.S = new q(this, 0);
        this.T = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: a2.r
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                t.a aVar = t.f3798r0;
                t this$0 = this.f3784b;
                kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
                this$0.f3808e0.m5974setInputModeiuPiT84(z10 ? q1.b.f82390b.m5964getTouchaOaMEAU() : q1.b.f82390b.m5963getKeyboardaOaMEAU());
                this$0.f3811g.fetchUpdatedFocusProperties();
            }
        };
        m2.u0 u0Var = new m2.u0(this);
        this.U = u0Var;
        this.V = (m2.l0) v0.getTextInputServiceFactory().invoke(u0Var);
        this.W = new i1(context);
        this.f3801a0 = p0.z4.mutableStateOf(l2.i0.createFontFamilyResolver(context), p0.z4.referentialEqualityPolicy());
        Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.f3803b0 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        Configuration configuration2 = context.getResources().getConfiguration();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        this.f3805c0 = p0.o5.mutableStateOf$default(v0.getLocaleLayoutDirection(configuration2), null, 2, null);
        this.f3806d0 = new p1.d(this);
        this.f3808e0 = new q1.d(isInTouchMode() ? q1.b.f82390b.m5964getTouchaOaMEAU() : q1.b.f82390b.m5963getKeyboardaOaMEAU(), new u(this), null);
        this.f3810f0 = new l1(this);
        this.f3816i0 = new r5();
        this.f3818j0 = new r0.c(new kv.a[16], 0);
        this.f3820k0 = new a0(this);
        this.f3822l0 = new s(this, 0);
        this.f3826n0 = new z(this);
        this.f3828o0 = i11 >= 29 ? new c2() : new b2();
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            t0.f3844a.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        x3.z1.setAccessibilityDelegate(this, i0Var);
        kv.l onViewCreatedCallback = p5.f3773a.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(this);
        if (i11 >= 29) {
            r0.f3785a.disallowForceDark(this);
        }
        this.f3832q0 = new y(this);
    }

    public static void a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof t) {
                ((t) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }

    public static tu.v b(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return tu.e0.to(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return tu.e0.to(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return tu.e0.to(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public static View c(int i10, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.e0.areEqual(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
                    View viewC = c(i10, childAt);
                    if (viewC != null) {
                        return viewC;
                    }
                }
            }
        }
        return null;
    }

    public static void e(z1.b0 b0Var) {
        b0Var.invalidateLayers$ui_release();
        r0.c cVar = b0Var.get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                e((z1.b0) content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public static boolean g(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (Float.isInfinite(x10) || Float.isNaN(x10)) {
            return true;
        }
        float y10 = motionEvent.getY();
        if (Float.isInfinite(y10) || Float.isNaN(y10)) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return Float.isInfinite(rawY) || Float.isNaN(rawY);
    }

    @tu.f
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setFontFamilyResolver(l2.y yVar) {
        this.f3801a0.setValue(yVar);
    }

    private void setLayoutDirection(s2.x xVar) {
        this.f3805c0.setValue(xVar);
    }

    private final void setViewTreeOwners(b bVar) {
        this.P.setValue(bVar);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> values) {
        f1.a aVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
        if (Build.VERSION.SDK_INT < 26 || (aVar = this.f3837v) == null) {
            return;
        }
        f1.c.performAutofill(aVar, values);
    }

    public final Object boundsUpdatesEventLoop(zu.d<? super tu.x0> dVar) {
        Object objBoundsUpdatesEventLoop = this.f3825n.boundsUpdatesEventLoop(dVar);
        return objBoundsUpdatesEventLoop == av.e.getCOROUTINE_SUSPENDED() ? objBoundsUpdatesEventLoop : tu.x0.f87415a;
    }

    @Override // z1.s1
    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    public long mo54calculateLocalPositionMKHz9U(long j10) {
        j();
        return j1.e1.m4738mapMKHz9U(this.K, j10);
    }

    @Override // z1.s1
    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    public long mo55calculatePositionInWindowMKHz9U(long j10) {
        j();
        return j1.e1.m4738mapMKHz9U(this.J, j10);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f3825n.m37canScroll0AR0LA0$ui_release(false, i10, this.f3802b);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f3825n.m37canScroll0AR0LA0$ui_release(true, i10, this.f3802b);
    }

    @Override // z1.s1
    public z1.p1 createLayer(kv.l drawBlock, kv.a invalidateParentLayer) {
        j3 l5Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBlock, "drawBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        z1.p1 p1Var = (z1.p1) this.f3816i0.pop();
        if (p1Var != null) {
            p1Var.reuseLayer(drawBlock, invalidateParentLayer);
            return p1Var;
        }
        if (isHardwareAccelerated() && this.O) {
            try {
                return new l4(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.O = false;
            }
        }
        if (this.C == null) {
            j5.a aVar = j5.f3668o;
            if (!aVar.getHasRetrievedMethod()) {
                aVar.updateDisplayList(new View(getContext()));
            }
            if (aVar.getShouldUseDispatchDraw()) {
                Context context = getContext();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
                l5Var = new j3(context);
            } else {
                Context context2 = getContext();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(context2, "context");
                l5Var = new l5(context2);
            }
            this.C = l5Var;
            addView(l5Var);
        }
        j3 j3Var = this.C;
        kotlin.jvm.internal.e0.checkNotNull(j3Var);
        return new j5(this, j3Var, drawBlock, invalidateParentLayer);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t.d(android.view.MotionEvent):int");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            e(getRoot());
        }
        z1.s1.measureAndLayout$default(this, false, 1, null);
        this.f3833r = true;
        j1.f0 f0Var = this.f3817j;
        Canvas internalCanvas = f0Var.getAndroidCanvas().getInternalCanvas();
        f0Var.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(f0Var.getAndroidCanvas());
        f0Var.getAndroidCanvas().setInternalCanvas(internalCanvas);
        ArrayList arrayList = this.f3829p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((z1.p1) arrayList.get(i10)).updateDisplayList();
            }
        }
        if (j5.f3668o.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f3833r = false;
        ArrayList arrayList2 = this.f3831q;
        if (arrayList2 != null) {
            kotlin.jvm.internal.e0.checkNotNull(arrayList2);
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (event.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(event);
        }
        if (!event.isFromSource(4194304)) {
            return (g(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : u1.b1.m7267getDispatchedToAPointerInputModifierimpl(d(event));
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -event.getAxisValue(26);
        w1.d dVar = new w1.d(x3.a2.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f10, x3.a2.getScaledHorizontalScrollFactor(viewConfiguration, getContext()) * f10, event.getEventTime());
        h1.s activeFocusModifier$ui_release = this.f3811g.getActiveFocusModifier$ui_release();
        if (activeFocusModifier$ui_release != null) {
            return activeFocusModifier$ui_release.propagateRotaryEvent(dVar);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r6.getButtonState() != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (i(r6) == false) goto L38;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            boolean r0 = r5.f3824m0
            a2.s r1 = r5.f3822l0
            if (r0 == 0) goto L11
            r5.removeCallbacks(r1)
            r1.run()
        L11:
            boolean r0 = g(r6)
            r2 = 0
            if (r0 != 0) goto L78
            boolean r0 = r5.isAttachedToWindow()
            if (r0 != 0) goto L1f
            goto L78
        L1f:
            r0 = 4098(0x1002, float:5.743E-42)
            boolean r0 = r6.isFromSource(r0)
            r3 = 1
            if (r0 == 0) goto L35
            int r0 = r6.getToolType(r2)
            if (r0 != r3) goto L35
            a2.i0 r0 = r5.f3825n
            boolean r6 = r0.dispatchHoverEvent(r6)
            return r6
        L35:
            int r0 = r6.getActionMasked()
            r4 = 7
            if (r0 == r4) goto L68
            r4 = 10
            if (r0 == r4) goto L41
            goto L6f
        L41:
            boolean r0 = r5.h(r6)
            if (r0 == 0) goto L6f
            int r0 = r6.getToolType(r2)
            r4 = 3
            if (r0 == r4) goto L61
            android.view.MotionEvent r0 = r5.f3812g0
            if (r0 == 0) goto L55
            r0.recycle()
        L55:
            android.view.MotionEvent r6 = android.view.MotionEvent.obtainNoHistory(r6)
            r5.f3812g0 = r6
            r5.f3824m0 = r3
            r5.post(r1)
            return r2
        L61:
            int r0 = r6.getButtonState()
            if (r0 == 0) goto L6f
            goto L78
        L68:
            boolean r0 = r5.i(r6)
            if (r0 != 0) goto L6f
            goto L78
        L6f:
            int r6 = r5.d(r6)
            boolean r6 = u1.b1.m7267getDispatchedToAPointerInputModifierimpl(r6)
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        return isFocused() ? mo53sendKeyEventZmokQxo(s1.c.m6697constructorimpl(event)) : super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.f3824m0) {
            s sVar = this.f3822l0;
            removeCallbacks(sVar);
            MotionEvent motionEvent2 = this.f3812g0;
            kotlin.jvm.internal.e0.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f3824m0 = false;
            } else {
                sVar.run();
            }
        }
        if (g(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !i(motionEvent))) {
            return false;
        }
        int iD = d(motionEvent);
        if (u1.b1.m7266getAnyMovementConsumedimpl(iD)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return u1.b1.m7267getDispatchedToAPointerInputModifierimpl(iD);
    }

    public final void drawAndroidView(u2.o view, Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    public final void f(z1.b0 b0Var) {
        int i10 = 0;
        z1.d1.requestRemeasure$default(this.F, b0Var, false, 2, null);
        r0.c cVar = b0Var.get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            do {
                f((z1.b0) content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return c(i10, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // z1.s1
    public void forceMeasureTheSubtree(z1.b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        this.F.forceMeasureTheSubtree(layoutNode);
    }

    public final y1 getAndroidViewsHandler$ui_release() {
        if (this.B == null) {
            Context context = getContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
            y1 y1Var = new y1(context);
            this.B = y1Var;
            addView(y1Var);
        }
        y1 y1Var2 = this.B;
        kotlin.jvm.internal.e0.checkNotNull(y1Var2);
        return y1Var2;
    }

    @Override // z1.s1
    public f1.d getAutofill() {
        return this.f3837v;
    }

    @Override // z1.s1
    public f1.i getAutofillTree() {
        return this.f3827o;
    }

    public final kv.l getConfigurationChangeObserver() {
        return this.f3836u;
    }

    @Override // z1.s1, a2.q5, z1.b2
    public s2.e getDensity() {
        return this.f3809f;
    }

    @Override // z1.s1
    /* renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    public h1.f mo56getFocusDirectionP8AzH3I(KeyEvent keyEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keyEvent, "keyEvent");
        long jM6713getKeyZmokQxo = s1.f.m6713getKeyZmokQxo(keyEvent);
        s1.a aVar = s1.b.f85154b;
        if (s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6634getTabEK5gGoQ())) {
            return h1.f.m4133boximpl(s1.f.m6719isShiftPressedZmokQxo(keyEvent) ? h1.f.f58545b.m4127getPreviousdhqQ8s() : h1.f.f58545b.m4125getNextdhqQ8s());
        }
        if (s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6475getDirectionRightEK5gGoQ())) {
            return h1.f.m4133boximpl(h1.f.f58545b.m4128getRightdhqQ8s());
        }
        if (s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6474getDirectionLeftEK5gGoQ())) {
            return h1.f.m4133boximpl(h1.f.f58545b.m4124getLeftdhqQ8s());
        }
        if (s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6476getDirectionUpEK5gGoQ())) {
            return h1.f.m4133boximpl(h1.f.f58545b.m4129getUpdhqQ8s());
        }
        if (s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6471getDirectionDownEK5gGoQ())) {
            return h1.f.m4133boximpl(h1.f.f58545b.m4122getDowndhqQ8s());
        }
        if (s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6470getDirectionCenterEK5gGoQ()) ? true : s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6484getEnterEK5gGoQ()) ? true : s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6576getNumPadEnterEK5gGoQ())) {
            return h1.f.m4133boximpl(h1.f.f58545b.m4123getIndhqQ8s());
        }
        if (s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6413getBackEK5gGoQ()) ? true : s1.b.m6692equalsimpl0(jM6713getKeyZmokQxo, aVar.m6487getEscapeEK5gGoQ())) {
            return h1.f.m4133boximpl(h1.f.f58545b.m4126getOutdhqQ8s());
        }
        return null;
    }

    @Override // z1.s1
    public h1.m getFocusManager() {
        return this.f3811g;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        tu.x0 x0Var;
        i1.j jVarFocusRect;
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        h1.s activeFocusModifier$ui_release = this.f3811g.getActiveFocusModifier$ui_release();
        if (activeFocusModifier$ui_release == null || (jVarFocusRect = h1.z0.focusRect(activeFocusModifier$ui_release)) == null) {
            x0Var = null;
        } else {
            rect.left = mv.d.roundToInt(jVarFocusRect.getLeft());
            rect.top = mv.d.roundToInt(jVarFocusRect.getTop());
            rect.right = mv.d.roundToInt(jVarFocusRect.getRight());
            rect.bottom = mv.d.roundToInt(jVarFocusRect.getBottom());
            x0Var = tu.x0.f87415a;
        }
        if (x0Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // z1.s1
    public l2.y getFontFamilyResolver() {
        return (l2.y) this.f3801a0.getValue();
    }

    @Override // z1.s1
    public l2.v getFontLoader() {
        return this.W;
    }

    @Override // z1.s1
    public p1.a getHapticFeedBack() {
        return this.f3806d0;
    }

    @Override // a2.q5
    public boolean getHasPendingMeasureOrLayout() {
        return this.F.getHasPendingMeasureOrLayout();
    }

    @Override // z1.s1
    public q1.c getInputModeManager() {
        return this.f3808e0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.L;
    }

    @Override // android.view.View, android.view.ViewParent, z1.s1
    public s2.x getLayoutDirection() {
        return (s2.x) this.f3805c0.getValue();
    }

    @Override // z1.s1
    public long getMeasureIteration() {
        return this.F.getMeasureIteration();
    }

    @Override // z1.s1
    public u1.z getPointerIconService() {
        return this.f3832q0;
    }

    @Override // z1.s1
    public z1.b0 getRoot() {
        return this.f3819k;
    }

    @Override // z1.s1
    public z1.b2 getRootForTest() {
        return this.f3821l;
    }

    @Override // a2.q5, z1.b2
    public e2.e0 getSemanticsOwner() {
        return this.f3823m;
    }

    @Override // z1.s1
    public z1.n0 getSharedDrawScope() {
        return this.f3807e;
    }

    @Override // z1.s1
    public boolean getShowLayoutBounds() {
        return this.A;
    }

    @Override // z1.s1
    public z1.y1 getSnapshotObserver() {
        return this.f3841z;
    }

    @Override // z1.s1, a2.q5, z1.b2
    public m2.l0 getTextInputService() {
        return this.V;
    }

    @Override // z1.s1
    public u4 getTextToolbar() {
        return this.f3810f0;
    }

    @Override // a2.q5
    public View getView() {
        return this;
    }

    @Override // z1.s1
    public g5 getViewConfiguration() {
        return this.G;
    }

    public final b getViewTreeOwners() {
        return (b) this.P.getValue();
    }

    @Override // z1.s1
    public s5 getWindowInfo() {
        return this.f3813h;
    }

    public final boolean h(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean i(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f3812g0) != null && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // a2.q5
    public void invalidateDescendants() {
        e(getRoot());
    }

    @Override // a2.q5
    public boolean isLifecycleInResumedState() {
        androidx.lifecycle.b1 lifecycleOwner;
        androidx.lifecycle.k0 lifecycle;
        b viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == androidx.lifecycle.j0.f6618g;
    }

    public final void j() {
        if (this.M) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.L) {
            this.L = jCurrentAnimationTimeMillis;
            a2 a2Var = this.f3828o0;
            float[] fArr = this.J;
            a2Var.mo2calculateMatrixToWindowEL8BTi8(this, fArr);
            y3.m63invertToJiSxe2E(fArr, this.K);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.I;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.N = i1.i.Offset(f10 - iArr[0], f11 - iArr[1]);
        }
    }

    public final void k(z1.b0 b0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.E && b0Var != null) {
            while (b0Var != null && b0Var.getMeasuredByParent$ui_release() == z1.d0.f97290b) {
                b0Var = b0Var.getParent$ui_release();
            }
            if (b0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final Object keyboardVisibilityEventLoop(zu.d<? super tu.x0> dVar) {
        Object objTextInputCommandEventLoop = this.U.textInputCommandEventLoop(dVar);
        return objTextInputCommandEventLoop == av.e.getCOROUTINE_SUSPENDED() ? objTextInputCommandEventLoop : tu.x0.f87415a;
    }

    public final int l(MotionEvent motionEvent) {
        u1.f0 f0VarPrevious;
        u1.h hVar = this.f3834s;
        u1.e0 e0VarConvertToPointerInputEvent$ui_release = hVar.convertToPointerInputEvent$ui_release(motionEvent, this);
        u1.g0 g0Var = this.f3835t;
        if (e0VarConvertToPointerInputEvent$ui_release == null) {
            g0Var.processCancel();
            return u1.h0.ProcessResult(false, false);
        }
        List<u1.f0> pointers = e0VarConvertToPointerInputEvent$ui_release.getPointers();
        ListIterator<u1.f0> listIterator = pointers.listIterator(pointers.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                f0VarPrevious = null;
                break;
            }
            f0VarPrevious = listIterator.previous();
            if (f0VarPrevious.getDown()) {
                break;
            }
        }
        u1.f0 f0Var = f0VarPrevious;
        if (f0Var != null) {
            this.f3802b = f0Var.m7311getPositionF1C5BW0();
        }
        int iM7317processBIzXfog = g0Var.m7317processBIzXfog(e0VarConvertToPointerInputEvent$ui_release, this, h(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !u1.b1.m7267getDispatchedToAPointerInputModifierimpl(iM7317processBIzXfog)) {
            hVar.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iM7317processBIzXfog;
    }

    @Override // u1.a1
    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    public long mo57localToScreenMKHz9U(long j10) {
        j();
        long jM4738mapMKHz9U = j1.e1.m4738mapMKHz9U(this.J, j10);
        return i1.i.Offset(i1.h.m4185getXimpl(this.N) + i1.h.m4185getXimpl(jM4738mapMKHz9U), i1.h.m4186getYimpl(this.N) + i1.h.m4186getYimpl(jM4738mapMKHz9U));
    }

    public final void m(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jMo57localToScreenMKHz9U = mo57localToScreenMKHz9U(i1.i.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = i1.h.m4185getXimpl(jMo57localToScreenMKHz9U);
            pointerCoords.y = i1.h.m4186getYimpl(jMo57localToScreenMKHz9U);
            i13++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(event, "event");
        u1.e0 e0VarConvertToPointerInputEvent$ui_release = this.f3834s.convertToPointerInputEvent$ui_release(event, this);
        kotlin.jvm.internal.e0.checkNotNull(e0VarConvertToPointerInputEvent$ui_release);
        this.f3835t.m7317processBIzXfog(e0VarConvertToPointerInputEvent$ui_release, this, true);
        event.recycle();
    }

    @Override // z1.s1
    public void measureAndLayout(boolean z10) {
        z zVar;
        z1.d1 d1Var = this.F;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z10) {
            try {
                zVar = this.f3826n0;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            zVar = null;
        }
        if (d1Var.measureAndLayout(zVar)) {
            requestLayout();
        }
        z1.d1.dispatchOnPositionedCallbacks$default(d1Var, false, 1, null);
        Trace.endSection();
    }

    @Override // z1.s1
    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public void mo58measureAndLayout0kLqBqw(z1.b0 layoutNode, long j10) {
        z1.d1 d1Var = this.F;
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            d1Var.m8030measureAndLayout0kLqBqw(layoutNode, j10);
            z1.d1.dispatchOnPositionedCallbacks$default(d1Var, false, 1, null);
        } finally {
            Trace.endSection();
        }
    }

    public final void n() {
        int[] iArr = this.I;
        getLocationOnScreen(iArr);
        boolean z10 = false;
        if (s2.q.m6930getXimpl(this.H) != iArr[0] || s2.q.m6931getYimpl(this.H) != iArr[1]) {
            this.H = s2.r.IntOffset(iArr[0], iArr[1]);
            z10 = true;
        }
        this.F.dispatchOnPositionedCallbacks(z10);
    }

    public final void notifyLayerIsDirty$ui_release(z1.p1 layer, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layer, "layer");
        ArrayList arrayList = this.f3829p;
        if (!z10) {
            if (!this.f3833r && !arrayList.remove(layer)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            if (!this.f3833r) {
                arrayList.add(layer);
                return;
            }
            ArrayList arrayList2 = this.f3831q;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.f3831q = arrayList2;
            }
            arrayList2.add(layer);
        }
    }

    @Override // z1.s1
    public void onAttach(z1.b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.b1 lifecycleOwner;
        androidx.lifecycle.k0 lifecycle;
        f1.a aVar;
        super.onAttachedToWindow();
        f(getRoot());
        e(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (Build.VERSION.SDK_INT >= 26 && (aVar = this.f3837v) != null) {
            f1.g.f55286a.register(aVar);
        }
        androidx.lifecycle.b1 b1Var = androidx.lifecycle.o3.get(this);
        v5.j jVar = v5.n.get(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (b1Var != null && jVar != null && (b1Var != viewTreeOwners.getLifecycleOwner() || jVar != viewTreeOwners.getLifecycleOwner()))) {
            if (b1Var == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (jVar == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            b1Var.getLifecycle().addObserver(this);
            b bVar = new b(b1Var, jVar);
            setViewTreeOwners(bVar);
            kv.l lVar = this.Q;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            this.Q = null;
        }
        b viewTreeOwners2 = getViewTreeOwners();
        kotlin.jvm.internal.e0.checkNotNull(viewTreeOwners2);
        viewTreeOwners2.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.R);
        getViewTreeObserver().addOnScrollChangedListener(this.S);
        getViewTreeObserver().addOnTouchModeChangeListener(this.T);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.U.isEditorFocused();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
        this.f3809f = s2.a.Density(context);
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? newConfig.fontWeightAdjustment : 0) != this.f3803b0) {
            this.f3803b0 = i10 >= 31 ? newConfig.fontWeightAdjustment : 0;
            Context context2 = getContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(l2.i0.createFontFamilyResolver(context2));
        }
        this.f3836u.invoke(newConfig);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(androidx.lifecycle.b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(outAttrs, "outAttrs");
        return this.U.createInputConnection(outAttrs);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onDestroy(androidx.lifecycle.b1 b1Var) {
        super.onDestroy(b1Var);
    }

    @Override // z1.s1
    public void onDetach(z1.b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        this.F.onNodeDetached(node);
        requestClearInvalidObservations();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f1.a aVar;
        androidx.lifecycle.b1 lifecycleOwner;
        androidx.lifecycle.k0 lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (Build.VERSION.SDK_INT >= 26 && (aVar = this.f3837v) != null) {
            f1.g.f55286a.unregister(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        getViewTreeObserver().removeOnScrollChangedListener(this.S);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.T);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
    }

    @Override // z1.s1
    public void onEndApplyChanges() {
        if (this.f3838w) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.f3838w = false;
        }
        y1 y1Var = this.B;
        if (y1Var != null) {
            a(y1Var);
        }
        while (true) {
            r0.c cVar = this.f3818j0;
            if (!cVar.isNotEmpty()) {
                return;
            }
            int size = cVar.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                kv.a aVar = (kv.a) cVar.getContent()[i10];
                cVar.set(i10, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            cVar.removeRange(0, size);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        h1.o oVar = this.f3811g;
        if (z10) {
            oVar.takeFocus();
        } else {
            oVar.releaseFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.D = null;
        n();
        if (this.B != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // z1.s1
    public void onLayoutChange(z1.b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        this.f3825n.onLayoutChange$ui_release(layoutNode);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        z1.d1 d1Var = this.F;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                f(getRoot());
            }
            tu.v vVarB = b(i10);
            int iIntValue = ((Number) vVarB.component1()).intValue();
            int iIntValue2 = ((Number) vVarB.component2()).intValue();
            tu.v vVarB2 = b(i11);
            long jConstraints = s2.d.Constraints(iIntValue, iIntValue2, ((Number) vVarB2.component1()).intValue(), ((Number) vVarB2.component2()).intValue());
            s2.c cVar = this.D;
            if (cVar == null) {
                this.D = s2.c.m6744boximpl(jConstraints);
                this.E = false;
            } else if (!s2.c.m6749equalsimpl0(cVar.m6761unboximpl(), jConstraints)) {
                this.E = true;
            }
            d1Var.m8031updateRootConstraintsBRTryo0(jConstraints);
            d1Var.measureAndLayout(this.f3826n0);
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this.B != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onPause(androidx.lifecycle.b1 b1Var) {
        super.onPause(b1Var);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        f1.a aVar;
        if (Build.VERSION.SDK_INT < 26 || viewStructure == null || (aVar = this.f3837v) == null) {
            return;
        }
        f1.c.populateViewStructure(aVar, viewStructure);
    }

    @Override // z1.s1
    public void onRequestMeasure(z1.b0 layoutNode, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.F.requestRemeasure(layoutNode, z10)) {
            k(layoutNode);
        }
    }

    @Override // z1.s1
    public void onRequestRelayout(z1.b0 layoutNode, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.F.requestRelayout(layoutNode, z10)) {
            k(null);
        }
    }

    @Override // androidx.lifecycle.r
    public void onResume(androidx.lifecycle.b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(a.access$getIsShowingLayoutBounds(f3798r0));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (this.f3804c) {
            s2.x xVarAccess$layoutDirectionFromInt = v0.access$layoutDirectionFromInt(i10);
            setLayoutDirection(xVarAccess$layoutDirectionFromInt);
            this.f3811g.setLayoutDirection(xVarAccess$layoutDirectionFromInt);
        }
    }

    @Override // z1.s1
    public void onSemanticsChange() {
        this.f3825n.onSemanticsChange$ui_release();
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onStart(androidx.lifecycle.b1 b1Var) {
        super.onStart(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onStop(androidx.lifecycle.b1 b1Var) {
        super.onStop(b1Var);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean zAccess$getIsShowingLayoutBounds;
        this.f3813h.setWindowFocused(z10);
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zAccess$getIsShowingLayoutBounds = a.access$getIsShowingLayoutBounds(f3798r0))) {
            return;
        }
        setShowLayoutBounds(zAccess$getIsShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui_release(z1.p1 layer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layer, "layer");
        if (this.C != null) {
            j5.f3668o.getShouldUseDispatchDraw();
        }
        this.f3816i0.push(layer);
        return true;
    }

    @Override // z1.s1
    public void registerOnEndApplyChangesListener(kv.a listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        r0.c cVar = this.f3818j0;
        if (cVar.contains(listener)) {
            return;
        }
        cVar.add(listener);
    }

    @Override // z1.s1
    public void registerOnLayoutCompletedListener(z1.r1 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.F.registerOnLayoutCompletedListener(listener);
        k(null);
    }

    public final void removeAndroidView(u2.o view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        getAndroidViewsHandler$ui_release().removeView(view);
        HashMap<z1.b0, u2.o> layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        kotlin.jvm.internal.h1.asMutableMap(layoutNodeToHolder).remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
        x3.z1.setImportantForAccessibility(view, 0);
    }

    public final void requestClearInvalidObservations() {
        this.f3838w = true;
    }

    @Override // u1.a1
    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    public long mo59screenToLocalMKHz9U(long j10) {
        j();
        return j1.e1.m4738mapMKHz9U(this.K, i1.i.Offset(i1.h.m4185getXimpl(j10) - i1.h.m4185getXimpl(this.N), i1.h.m4186getYimpl(j10) - i1.h.m4186getYimpl(this.N)));
    }

    @Override // a2.q5, z1.b2
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo53sendKeyEventZmokQxo(KeyEvent keyEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keyEvent, "keyEvent");
        return this.f3815i.m6720processKeyInputZmokQxo(keyEvent);
    }

    public final void setConfigurationChangeObserver(kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
        this.f3836u = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.L = j10;
    }

    public final void setOnViewTreeOwnersAvailable(kv.l callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.Q = callback;
    }

    @Override // z1.s1
    public void setShowLayoutBounds(boolean z10) {
        this.A = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void addAndroidView(u2.o oVar, z1.b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(oVar, aTNDubNmpwAqdU.xZeFHxQWEvslB);
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(oVar, layoutNode);
        getAndroidViewsHandler$ui_release().addView(oVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, oVar);
        x3.z1.setImportantForAccessibility(oVar, 1);
        x3.z1.setAccessibilityDelegate(oVar, new v(layoutNode, this, this));
    }

    @Override // z1.s1
    public l getAccessibilityManager() {
        return this.f3840y;
    }

    @Override // z1.s1
    public m getClipboardManager() {
        return this.f3839x;
    }
}
