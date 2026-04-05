package a2;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f3448b;

    /* renamed from: c, reason: collision with root package name */
    public IBinder f3449c;

    /* renamed from: e, reason: collision with root package name */
    public p0.e0 f3450e;

    /* renamed from: f, reason: collision with root package name */
    public p0.f0 f3451f;

    /* renamed from: g, reason: collision with root package name */
    public kv.a f3452g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3453h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3454i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    private final void setParentContext(p0.f0 f0Var) {
        if (this.f3451f != f0Var) {
            this.f3451f = f0Var;
            if (f0Var != null) {
                this.f3448b = null;
            }
            p0.e0 e0Var = this.f3450e;
            if (e0Var != null) {
                e0Var.dispose();
                this.f3450e = null;
                if (isAttachedToWindow()) {
                    b();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f3449c != iBinder) {
            this.f3449c = iBinder;
            this.f3448b = null;
        }
    }

    public abstract void Content(p0.w wVar, int i10);

    public final void a() {
        if (this.f3454i) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        a();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        a();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:5:0x0006, B:7:0x000c, B:9:0x0013, B:11:0x0017, B:17:0x0032, B:20:0x003d, B:22:0x0041, B:24:0x0049, B:26:0x004d, B:35:0x006c, B:37:0x0072, B:41:0x0087, B:42:0x008e), top: B:49:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p0.f0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p0.f0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p0.f0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [p0.n3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            p0.e0 r0 = r6.f3450e
            if (r0 != 0) goto La7
            r0 = 0
            r1 = 1
            r6.f3454i = r1     // Catch: java.lang.Throwable -> La3
            p0.f0 r2 = r6.f3451f     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto L8e
            p0.f0 r2 = a2.i6.findViewTreeCompositionContext(r6)     // Catch: java.lang.Throwable -> La3
            r3 = 0
            if (r2 == 0) goto L3a
            boolean r4 = r2 instanceof p0.n3     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L2f
            r4 = r2
            p0.n3 r4 = (p0.n3) r4     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.flow.StateFlow r4 = r4.getCurrentState()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> La3
            p0.o3 r4 = (p0.o3) r4     // Catch: java.lang.Throwable -> La3
            p0.o3 r5 = p0.o3.f80382c     // Catch: java.lang.Throwable -> La3
            int r4 = r4.compareTo(r5)     // Catch: java.lang.Throwable -> La3
            if (r4 <= 0) goto L2d
            goto L2f
        L2d:
            r4 = r3
            goto L30
        L2f:
            r4 = r2
        L30:
            if (r4 == 0) goto L3b
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> La3
            r5.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r6.f3448b = r5     // Catch: java.lang.Throwable -> La3
            goto L3b
        L3a:
            r2 = r3
        L3b:
            if (r2 != 0) goto L8e
            java.lang.ref.WeakReference r2 = r6.f3448b     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L69
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> La3
            p0.f0 r2 = (p0.f0) r2     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L69
            boolean r4 = r2 instanceof p0.n3     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L65
            r4 = r2
            p0.n3 r4 = (p0.n3) r4     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.flow.StateFlow r4 = r4.getCurrentState()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> La3
            p0.o3 r4 = (p0.o3) r4     // Catch: java.lang.Throwable -> La3
            p0.o3 r5 = p0.o3.f80382c     // Catch: java.lang.Throwable -> La3
            int r4 = r4.compareTo(r5)     // Catch: java.lang.Throwable -> La3
            if (r4 <= 0) goto L63
            goto L65
        L63:
            r4 = r0
            goto L66
        L65:
            r4 = r1
        L66:
            if (r4 == 0) goto L69
            goto L6a
        L69:
            r2 = r3
        L6a:
            if (r2 != 0) goto L8e
            p0.n3 r2 = a2.i6.getWindowRecomposer(r6)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L84
            kotlinx.coroutines.flow.StateFlow r4 = r2.getCurrentState()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> La3
            p0.o3 r4 = (p0.o3) r4     // Catch: java.lang.Throwable -> La3
            p0.o3 r5 = p0.o3.f80382c     // Catch: java.lang.Throwable -> La3
            int r4 = r4.compareTo(r5)     // Catch: java.lang.Throwable -> La3
            if (r4 <= 0) goto L85
        L84:
            r3 = r2
        L85:
            if (r3 == 0) goto L8e
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> La3
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La3
            r6.f3448b = r4     // Catch: java.lang.Throwable -> La3
        L8e:
            a2.a r3 = new a2.a     // Catch: java.lang.Throwable -> La3
            r3.<init>(r6)     // Catch: java.lang.Throwable -> La3
            r4 = -656146368(0xffffffffd8e40040, float:-2.0055178E15)
            z0.b r1 = z0.u.composableLambdaInstance(r4, r1, r3)     // Catch: java.lang.Throwable -> La3
            p0.e0 r1 = a2.r6.setContent(r6, r2, r1)     // Catch: java.lang.Throwable -> La3
            r6.f3450e = r1     // Catch: java.lang.Throwable -> La3
            r6.f3454i = r0
            return
        La3:
            r1 = move-exception
            r6.f3454i = r0
            throw r1
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.b.b():void");
    }

    public final void createComposition() {
        if (this.f3451f == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        b();
    }

    public final void disposeComposition() {
        p0.e0 e0Var = this.f3450e;
        if (e0Var != null) {
            e0Var.dispose();
        }
        this.f3450e = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.f3450e != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f3453h;
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        internalOnLayout$ui_release(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        b();
        internalOnMeasure$ui_release(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(p0.f0 f0Var) {
        setParentContext(f0Var);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f3453h = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((z1.s1) childAt).setShowLayoutBounds(z10);
        }
    }

    public final void setViewCompositionStrategy(f5 strategy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kv.a aVar = this.f3452g;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f3452g = ((e5) strategy).installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        a();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        a();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f3452g = ((e5) a5.f3445a.getDefault()).installFor(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        a();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        a();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
