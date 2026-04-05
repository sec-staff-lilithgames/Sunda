package x3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f91610b;

        public c(kv.l lVar) {
            this.f91610b = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f91610b.invoke(view);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f91611b;

        public d(kv.l lVar) {
            this.f91611b = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f91611b.invoke(view);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f91612b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f91613c;

        public e(kv.l lVar, View view) {
            this.f91612b = lVar;
            this.f91613c = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f91612b.invoke(this.f91613c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.a f91614b;

        public f(kv.a aVar) {
            this.f91614b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f91614b.invoke();
        }
    }

    public static final void doOnAttach(View view, kv.l lVar) {
        if (view.isAttachedToWindow()) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new a(view, lVar));
        }
    }

    public static final void doOnDetach(View view, kv.l lVar) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new b(view, lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnLayout(View view, kv.l lVar) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new c(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, kv.l lVar) {
        view.addOnLayoutChangeListener(new d(lVar));
    }

    public static final t0 doOnPreDraw(View view, kv.l lVar) {
        return t0.add(view, new e(lVar, view));
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final rv.t getAllViews(View view) {
        return rv.w.sequence(new h2(view, null));
    }

    public static final rv.t getAncestors(View view) {
        return rv.y.generateSequence(view.getParent(), i2.f91595b);
    }

    public static final int getMarginBottom(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        return view.getVisibility() == 0;
    }

    public static final Runnable postDelayed(View view, long j10, kv.a aVar) {
        f fVar = new f(aVar);
        view.postDelayed(fVar, j10);
        return fVar;
    }

    public static final Runnable postOnAnimationDelayed(View view, long j10, kv.a aVar) {
        a2.d0 d0Var = new a2.d0(5, aVar);
        view.postOnAnimationDelayed(d0Var, j10);
        return d0Var;
    }

    public static final void setGone(View view, boolean z10) {
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z10) {
        view.setVisibility(z10 ? 4 : 0);
    }

    public static final void setPadding(View view, int i10) {
        view.setPadding(i10, i10, i10, i10);
    }

    public static final void setVisible(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }

    public static final void updateLayoutParams(View view, kv.l lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, kv.l lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(View view, int i10, int i11, int i12, int i13) {
        view.setPadding(i10, i11, i12, i13);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingLeft();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingRight();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPadding(i10, i11, i12, i13);
    }

    public static final void updatePaddingRelative(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingStart();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f91606b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kv.l f91607c;

        public a(View view, kv.l lVar) {
            this.f91606b = view;
            this.f91607c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f91606b.removeOnAttachStateChangeListener(this);
            this.f91607c.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f91608b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kv.l f91609c;

        public b(View view, kv.l lVar) {
            this.f91608b = view;
            this.f91609c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f91608b.removeOnAttachStateChangeListener(this);
            this.f91609c.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
