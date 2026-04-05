package q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: m, reason: collision with root package name */
    public static a4 f82023m;

    /* renamed from: n, reason: collision with root package name */
    public static a4 f82024n;

    /* renamed from: b, reason: collision with root package name */
    public final View f82025b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f82026c;

    /* renamed from: e, reason: collision with root package name */
    public final int f82027e;

    /* renamed from: f, reason: collision with root package name */
    public final z3 f82028f;

    /* renamed from: g, reason: collision with root package name */
    public final z3 f82029g;

    /* renamed from: h, reason: collision with root package name */
    public int f82030h;

    /* renamed from: i, reason: collision with root package name */
    public int f82031i;

    /* renamed from: j, reason: collision with root package name */
    public b4 f82032j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f82033k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f82034l = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [q.z3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q.z3] */
    public a4(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f82028f = new Runnable(this) { // from class: q.z3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a4 f82321c;

            {
                this.f82321c = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        this.f82321c.c(false);
                        break;
                    default:
                        this.f82321c.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f82029g = new Runnable(this) { // from class: q.z3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a4 f82321c;

            {
                this.f82321c = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i11) {
                    case 0:
                        this.f82321c.c(false);
                        break;
                    default:
                        this.f82321c.a();
                        break;
                }
            }
        };
        this.f82025b = view;
        this.f82026c = charSequence;
        this.f82027e = x3.a2.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(a4 a4Var) {
        a4 a4Var2 = f82023m;
        if (a4Var2 != null) {
            a4Var2.f82025b.removeCallbacks(a4Var2.f82028f);
        }
        f82023m = a4Var;
        if (a4Var != null) {
            a4Var.f82025b.postDelayed(a4Var.f82028f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        a4 a4Var = f82023m;
        if (a4Var != null && a4Var.f82025b == view) {
            b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a4(view, charSequence);
            return;
        }
        a4 a4Var2 = f82024n;
        if (a4Var2 != null && a4Var2.f82025b == view) {
            a4Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void a() {
        a4 a4Var = f82024n;
        View view = this.f82025b;
        if (a4Var == this) {
            f82024n = null;
            b4 b4Var = this.f82032j;
            if (b4Var != null) {
                View view2 = (View) b4Var.f82045b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) b4Var.f82044a).getSystemService("window")).removeView(view2);
                }
                this.f82032j = null;
                this.f82034l = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f82023m == this) {
            b(null);
        }
        view.removeCallbacks(this.f82029g);
    }

    public final void c(boolean z10) throws Resources.NotFoundException {
        int height;
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        long longPressTimeout;
        long j10;
        long j11;
        View view = this.f82025b;
        if (view.isAttachedToWindow()) {
            b(null);
            a4 a4Var = f82024n;
            if (a4Var != null) {
                a4Var.a();
            }
            f82024n = this;
            this.f82033k = z10;
            b4 b4Var = new b4(view.getContext());
            View view2 = (View) b4Var.f82045b;
            Context context = (Context) b4Var.f82044a;
            this.f82032j = b4Var;
            int width = this.f82030h;
            int i14 = this.f82031i;
            boolean z12 = this.f82033k;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) b4Var.f82047d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) b4Var.f82046c).setText(this.f82026c);
            int[] iArr = (int[]) b4Var.f82050g;
            int[] iArr2 = (int[]) b4Var.f82049f;
            Rect rect = (Rect) b4Var.f82048e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i10 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z12 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i15 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i13 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = i10;
                    z11 = z12;
                    i12 = 0;
                    i13 = 1;
                } else {
                    Resources resources = context.getResources();
                    i13 = 1;
                    i11 = i10;
                    z11 = z12;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i12 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i16 = iArr2[i12] - iArr[i12];
                iArr2[i12] = i16;
                iArr2[i13] = iArr2[i13] - iArr[i13];
                layoutParams.x = (i16 + i15) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i17 = iArr2[i13];
                int i18 = ((i17 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i19 = i17 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i18 >= 0) {
                        layoutParams.y = i18;
                    } else {
                        layoutParams.y = i19;
                    }
                } else if (measuredHeight + i19 <= rect.height()) {
                    layoutParams.y = i19;
                } else {
                    layoutParams.y = i18;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f82033k) {
                j11 = 2500;
            } else {
                if ((x3.z1.getWindowSystemUiVisibility(view) & 1) == i13) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = MBInterstitialActivity.WEB_LOAD_TIME;
                }
                j11 = j10 - longPressTimeout;
            }
            z3 z3Var = this.f82029g;
            view.removeCallbacks(z3Var);
            view.postDelayed(z3Var, j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            q.b4 r4 = r3.f82032j
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f82033k
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f82025b
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f82034l = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            q.b4 r4 = r3.f82032j
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f82034l
            if (r1 != 0) goto L66
            int r1 = r3.f82030h
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f82027e
            if (r1 > r2) goto L66
            int r1 = r3.f82031i
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f82030h = r4
            r3.f82031i = r5
            r3.f82034l = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a4.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f82030h = view.getWidth() / 2;
        this.f82031i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
