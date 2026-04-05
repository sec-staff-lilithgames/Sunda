package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6216b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6217c;

    /* renamed from: e, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f6218e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6219f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public final void a(View view) {
        if (this.f6217c.contains(view)) {
            this.f6216b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        e3 e3VarOnApplyWindowInsets;
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        e3 windowInsetsCompat = e3.toWindowInsetsCompat(insets);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f6218e;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.e0.checkNotNull(onApplyWindowInsetsListener);
            e3VarOnApplyWindowInsets = e3.toWindowInsetsCompat(q0.f6437a.onApplyWindowInsets(onApplyWindowInsetsListener, this, insets));
        } else {
            e3VarOnApplyWindowInsets = x3.z1.onApplyWindowInsets(this, windowInsetsCompat);
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(e3VarOnApplyWindowInsets, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!e3VarOnApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                x3.z1.dispatchApplyWindowInsets(getChildAt(i10), e3VarOnApplyWindowInsets);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        if (this.f6219f) {
            Iterator it = this.f6216b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        if (this.f6219f) {
            ArrayList arrayList = this.f6216b;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f6217c.remove(view);
        if (this.f6216b.remove(view)) {
            this.f6219f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        FragmentActivity fragmentActivity;
        Fragment fragment;
        FragmentManager supportFragmentManager;
        View view = this;
        while (true) {
            fragmentActivity = null;
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            if (!fragment.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragment.getChildFragmentManager();
        }
        return (F) supportFragmentManager.findFragmentById(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f6219f = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f6218e = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f6217c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f6216b = new ArrayList();
        this.f6217c = new ArrayList();
        this.f6219f = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f6216b = new ArrayList();
        this.f6217c = new ArrayList();
        this.f6219f = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = w4.a.f90377b;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + AbstractJsonLexerKt.STRING);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, FragmentManager fm2) {
        View view;
        super(context, attrs);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(attrs, "attrs");
        kotlin.jvm.internal.e0.checkNotNullParameter(fm2, "fm");
        this.f6216b = new ArrayList();
        this.f6217c = new ArrayList();
        this.f6219f = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = w4.a.f90377b;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentFindFragmentById = fm2.findFragmentById(id2);
        if (classAttribute != null && fragmentFindFragmentById == null) {
            if (id2 == -1) {
                throw new IllegalStateException(a.b.l("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment fragmentInstantiate = fm2.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(fragmentInstantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentInstantiate.onInflate(context, attrs, (Bundle) null);
            h2 reorderingAllowed = fm2.beginTransaction().setReorderingAllowed(true);
            reorderingAllowed.getClass();
            fragmentInstantiate.mContainer = this;
            reorderingAllowed.add(getId(), fragmentInstantiate, string).commitNowAllowingStateLoss();
        }
        Iterator it = fm2.f6222c.d().iterator();
        while (it.hasNext()) {
            e2 e2Var = (e2) it.next();
            Fragment fragment = e2Var.f6304c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                e2Var.a();
            }
        }
    }
}
