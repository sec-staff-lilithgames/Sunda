package ir;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class x {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f68373b;

        public a(kv.l lVar) {
            this.f68373b = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            e0.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f68373b.invoke(view);
        }
    }

    public static void a(int i10, View selfView, WindowInsets windowInsets) {
        e0.checkNotNullParameter(selfView, "selfView");
        e0.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(i10);
        e0.checkNotNullExpressionValue(insets, "windowInsets.getInsets(typeInsets)");
        selfView.setPadding(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final void addPadding(View view, int i10, int i11, int i12, int i13) {
        e0.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft() + i10, view.getPaddingTop() + i11, view.getPaddingRight() + i12, view.getPaddingBottom() + i13);
    }

    public static final void addSingleViewSafely(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        e0.checkNotNullParameter(viewGroup, "<this>");
        e0.checkNotNullParameter(view, "view");
        try {
            viewGroup.removeAllViews();
        } catch (Throwable unused) {
        }
        addViewSafely(viewGroup, view, layoutParams);
    }

    public static /* synthetic */ void addSingleViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            layoutParams = null;
        }
        addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static final void addViewSafely(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        e0.checkNotNullParameter(viewGroup, "<this>");
        e0.checkNotNullParameter(view, "view");
        try {
            removeFromParent(view);
            if (layoutParams != null) {
                viewGroup.addView(view, layoutParams);
            } else {
                viewGroup.addView(view);
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void addViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            layoutParams = null;
        }
        addViewSafely(viewGroup, view, layoutParams);
    }

    public static final Object awaitLayout(View view, zu.d<? super View> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            w wVar = new w(view, cancellableContinuationImpl);
            cancellableContinuationImpl.invokeOnCancellation(new v(view, wVar));
            view.addOnLayoutChangeListener(wVar);
        } else {
            cancellableContinuationImpl.resumeWith(tu.z.m7131constructorimpl(view));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final boolean belongTo(View view, ViewGroup parent) {
        e0.checkNotNullParameter(view, "<this>");
        e0.checkNotNullParameter(parent, "parent");
        Object parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            return e0.areEqual(parent2, parent) || belongTo((View) parent2, parent);
        }
        return false;
    }

    public static final void doOnLayout(View view, kv.l action) {
        e0.checkNotNullParameter(view, "<this>");
        e0.checkNotNullParameter(action, "action");
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(action));
        } else {
            action.invoke(view);
        }
    }

    public static final Activity findActivity(View view) {
        e0.checkNotNullParameter(view, "<this>");
        View viewFindContentOrRootView = findContentOrRootView(view);
        Context context = viewFindContentOrRootView != null ? viewFindContentOrRootView.getContext() : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static final View findContentOrRootView(View view) {
        e0.checkNotNullParameter(view, "<this>");
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view2;
            }
        }
        return view2;
    }

    public static final <T extends View> T findViewByClassName(ViewGroup viewGroup, Class<T> viewClass) {
        T t10;
        e0.checkNotNullParameter(viewGroup, "<this>");
        e0.checkNotNullParameter(viewClass, "viewClass");
        try {
            if (e0.areEqual(viewGroup.getClass(), viewClass)) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof ViewGroup) && (t10 = (T) findViewByClassName((ViewGroup) childAt, viewClass)) != null) {
                    return t10;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Window findWindow(View view) {
        e0.checkNotNullParameter(view, "<this>");
        Activity activityFindActivity = findActivity(view);
        if (activityFindActivity != null) {
            return activityFindActivity.getWindow();
        }
        return null;
    }

    public static final Rect getLocationInWindow(View view) {
        e0.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static final void hideViewSafely(View view) {
        if (view == null) {
            return;
        }
        n.onUiThread(new y(view));
    }

    public static final boolean isViewTransparent(View view) {
        e0.checkNotNullParameter(view, "<this>");
        return view.getAlpha() == 0.0f;
    }

    public static final boolean isViewVisible(View view) {
        e0.checkNotNullParameter(view, "<this>");
        return t.isViewVisible(view.getVisibility());
    }

    public static final x0 removeFromParent(View view) {
        e0.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return x0.f87415a;
    }

    public static final void setBackgroundColorSafely(View view, Integer num) {
        if (view == null || num == null) {
            return;
        }
        try {
            view.setBackgroundColor(num.intValue());
        } catch (Throwable unused) {
        }
    }

    public static final void setInsetsChanger(View view, final int i10) {
        e0.checkNotNullParameter(view, "<this>");
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ir.u
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                x.a(i10, view2, windowInsets);
                return windowInsets;
            }
        });
    }

    public static /* synthetic */ void setInsetsChanger$default(View view, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
        }
        setInsetsChanger(view, i10);
    }

    public static final void showViewSafely(View view) {
        if (view == null) {
            return;
        }
        n.onUiThread(new z(view));
    }
}
