package v2;

import a2.o5;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.o3;
import androidx.lifecycle.p3;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.freemium.R;
import java.util.UUID;
import p0.j2;
import p0.o4;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends a2.b implements o5 {

    /* renamed from: j, reason: collision with root package name */
    public kv.a f88859j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f88860k;

    /* renamed from: l, reason: collision with root package name */
    public String f88861l;

    /* renamed from: m, reason: collision with root package name */
    public final View f88862m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f88863n;

    /* renamed from: o, reason: collision with root package name */
    public final WindowManager f88864o;

    /* renamed from: p, reason: collision with root package name */
    public final WindowManager.LayoutParams f88865p;

    /* renamed from: q, reason: collision with root package name */
    public e0 f88866q;

    /* renamed from: r, reason: collision with root package name */
    public s2.x f88867r;

    /* renamed from: s, reason: collision with root package name */
    public final j2 f88868s;

    /* renamed from: t, reason: collision with root package name */
    public final j2 f88869t;

    /* renamed from: u, reason: collision with root package name */
    public s2.s f88870u;

    /* renamed from: v, reason: collision with root package name */
    public final v5 f88871v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f88872w;

    /* renamed from: x, reason: collision with root package name */
    public final j2 f88873x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f88874y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f88875z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a0(kv.a aVar, f0 f0Var, String str, View view, s2.e eVar, e0 e0Var, UUID uuid, b0 b0Var, int i10, kotlin.jvm.internal.u uVar) {
        b0 c0Var;
        if ((i10 & 128) != 0) {
            c0Var = Build.VERSION.SDK_INT >= 29 ? new c0() : new d0();
        } else {
            c0Var = b0Var;
        }
        this(aVar, f0Var, str, view, eVar, e0Var, uuid, c0Var);
    }

    private final kv.p getContent() {
        return (kv.p) this.f88873x.getValue();
    }

    private final int getDisplayHeight() {
        return mv.d.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return mv.d.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x1.d0 getParentLayoutCoordinates() {
        return (x1.d0) this.f88869t.getValue();
    }

    private final void setClippingEnabled(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.f88865p;
        layoutParams.flags = z10 ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        this.f88863n.updateViewLayout(this.f88864o, this, layoutParams);
    }

    private final void setContent(kv.p pVar) {
        this.f88873x.setValue(pVar);
    }

    private final void setIsFocusable(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.f88865p;
        layoutParams.flags = !z10 ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.f88863n.updateViewLayout(this.f88864o, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(x1.d0 d0Var) {
        this.f88869t.setValue(d0Var);
    }

    private final void setSecurePolicy(g0 g0Var) {
        boolean zShouldApplySecureFlag = i0.shouldApplySecureFlag(g0Var, t.isFlagSecureEnabled(this.f88862m));
        WindowManager.LayoutParams layoutParams = this.f88865p;
        layoutParams.flags = zShouldApplySecureFlag ? layoutParams.flags | Segment.SIZE : layoutParams.flags & (-8193);
        this.f88863n.updateViewLayout(this.f88864o, this, layoutParams);
    }

    @Override // a2.b
    public void Content(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-857613600);
        getContent().invoke(wVarStartRestartGroup, 0);
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new x(this, i10));
    }

    public final void dismiss() {
        o3.set(this, null);
        this.f88864o.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4 && this.f88860k.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                kv.a aVar = this.f88859j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f88871v.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f88865p;
    }

    public final s2.x getParentLayoutDirection() {
        return this.f88867r;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final s2.v m7427getPopupContentSizebOM6tXw() {
        return (s2.v) this.f88868s.getValue();
    }

    public final e0 getPositionProvider() {
        return this.f88866q;
    }

    @Override // a2.b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f88874y;
    }

    public final String getTestTag() {
        return this.f88861l;
    }

    @Override // a2.o5
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // a2.b
    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f88865p;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f88863n.updateViewLayout(this.f88864o, this, layoutParams);
    }

    @Override // a2.b
    public void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.f88860k.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(i10, i11);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f88860k.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            kv.a aVar = this.f88859j;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        kv.a aVar2 = this.f88859j;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.f88875z;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.f88862m.getLocationOnScreen(iArr);
        if (i10 == iArr[0] && i11 == iArr[1]) {
            return;
        }
        updateParentBounds$ui_release();
    }

    public final void setParentLayoutDirection(s2.x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<set-?>");
        this.f88867r = xVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7428setPopupContentSizefhxjrPA(s2.v vVar) {
        this.f88868s.setValue(vVar);
    }

    public final void setPositionProvider(e0 e0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<set-?>");
        this.f88866q = e0Var;
    }

    public final void setTestTag(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f88861l = str;
    }

    public final void show() {
        this.f88864o.addView(this, this.f88865p);
    }

    public final void updateParameters(kv.a aVar, f0 properties, String testTag, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(properties, "properties");
        kotlin.jvm.internal.e0.checkNotNullParameter(testTag, "testTag");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f88859j = aVar;
        this.f88860k = properties;
        this.f88861l = testTag;
        setIsFocusable(properties.getFocusable());
        setSecurePolicy(properties.getSecurePolicy());
        setClippingEnabled(properties.getClippingEnabled());
        int i10 = y.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new tu.t();
        }
        super.setLayoutDirection(i11);
    }

    public final void updateParentBounds$ui_release() {
        x1.d0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jMo7827getSizeYbymL2g = parentLayoutCoordinates.mo7827getSizeYbymL2g();
        long jPositionInWindow = x1.e0.positionInWindow(parentLayoutCoordinates);
        s2.s sVarM6961IntRectVbeCjmY = s2.t.m6961IntRectVbeCjmY(s2.r.IntOffset(mv.d.roundToInt(i1.h.m4185getXimpl(jPositionInWindow)), mv.d.roundToInt(i1.h.m4186getYimpl(jPositionInWindow))), jMo7827getSizeYbymL2g);
        if (kotlin.jvm.internal.e0.areEqual(sVarM6961IntRectVbeCjmY, this.f88870u)) {
            return;
        }
        this.f88870u = sVarM6961IntRectVbeCjmY;
        updatePosition();
    }

    public final void updateParentLayoutCoordinates(x1.d0 parentLayoutCoordinates) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        s2.v vVarM7427getPopupContentSizebOM6tXw;
        s2.s sVar = this.f88870u;
        if (sVar == null || (vVarM7427getPopupContentSizebOM6tXw = m7427getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long jM6976unboximpl = vVarM7427getPopupContentSizebOM6tXw.m6976unboximpl();
        View view = this.f88862m;
        b0 b0Var = this.f88863n;
        Rect rect = this.f88872w;
        b0Var.getWindowVisibleDisplayFrame(view, rect);
        s2.s sVarAccess$toIntBounds = t.access$toIntBounds(rect);
        long jIntSize = s2.w.IntSize(sVarAccess$toIntBounds.getWidth(), sVarAccess$toIntBounds.getHeight());
        long jMo5543calculatePositionllwVHH4 = this.f88866q.mo5543calculatePositionllwVHH4(sVar, jIntSize, this.f88867r, jM6976unboximpl);
        int iM6930getXimpl = s2.q.m6930getXimpl(jMo5543calculatePositionllwVHH4);
        WindowManager.LayoutParams layoutParams = this.f88865p;
        layoutParams.x = iM6930getXimpl;
        layoutParams.y = s2.q.m6931getYimpl(jMo5543calculatePositionllwVHH4);
        if (this.f88860k.getExcludeFromSystemGesture()) {
            b0Var.setGestureExclusionRects(this, s2.v.m6972getWidthimpl(jIntSize), s2.v.m6971getHeightimpl(jIntSize));
        }
        b0Var.updateViewLayout(this.f88864o, this, layoutParams);
    }

    public final void setContent(p0.f0 parent, kv.p content) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f88874y = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(kv.a aVar, f0 properties, String testTag, View composeView, s2.e density, e0 initialPositionProvider, UUID popupId, b0 popupLayoutHelper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(properties, "properties");
        kotlin.jvm.internal.e0.checkNotNullParameter(testTag, "testTag");
        kotlin.jvm.internal.e0.checkNotNullParameter(composeView, "composeView");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialPositionProvider, "initialPositionProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(popupId, "popupId");
        kotlin.jvm.internal.e0.checkNotNullParameter(popupLayoutHelper, "popupLayoutHelper");
        Context context = composeView.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.f88859j = aVar;
        this.f88860k = properties;
        this.f88861l = testTag;
        this.f88862m = composeView;
        this.f88863n = popupLayoutHelper;
        Object systemService = composeView.getContext().getSystemService("window");
        if (systemService != null) {
            this.f88864o = (WindowManager) systemService;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.gravity = 8388659;
            layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
            layoutParams.type = 1002;
            layoutParams.token = composeView.getApplicationWindowToken();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.setTitle(composeView.getContext().getResources().getString(R.string.default_popup_window_title));
            this.f88865p = layoutParams;
            this.f88866q = initialPositionProvider;
            this.f88867r = s2.x.f85363b;
            this.f88868s = p0.o5.mutableStateOf$default(null, null, 2, null);
            this.f88869t = p0.o5.mutableStateOf$default(null, null, 2, null);
            this.f88871v = z4.derivedStateOf(new z(this));
            float fM6817constructorimpl = s2.i.m6817constructorimpl(30);
            this.f88872w = new Rect();
            setId(android.R.id.content);
            o3.set(this, o3.get(composeView));
            p3.set(this, p3.get(composeView));
            v5.n.set(this, v5.n.get(composeView));
            setTag(R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
            setClipChildren(false);
            setElevation(density.mo3425toPx0680j_4(fM6817constructorimpl));
            setOutlineProvider(new w());
            this.f88873x = p0.o5.mutableStateOf$default(v.f88935a.m7433getLambda1$ui_release(), null, 2, null);
            this.f88875z = new int[2];
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // a2.o5
    public a2.b getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
