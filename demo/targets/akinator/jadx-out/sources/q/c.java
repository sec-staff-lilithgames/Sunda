package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final b f82051b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f82052c;

    /* renamed from: e, reason: collision with root package name */
    public ActionMenuView f82053e;

    /* renamed from: f, reason: collision with root package name */
    public ActionMenuPresenter f82054f;

    /* renamed from: g, reason: collision with root package name */
    public int f82055g;

    /* renamed from: h, reason: collision with root package name */
    public x3.m2 f82056h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82057i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f82058j;

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f82051b = new b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f82052c = context;
        } else {
            this.f82052c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int d(View view, boolean z10, int i10, int i11, int i12) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public void animateToVisibility(int i10) {
        setupAnimatorToVisibility(i10, 200L).start();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    public int getAnimatedVisibility() {
        return this.f82056h != null ? this.f82051b.f82036b : getVisibility();
    }

    public int getContentHeight() {
        return this.f82055g;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowPending();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowReserved();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, k.a.f69977a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f82058j = false;
        }
        if (!this.f82058j) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f82058j = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f82058j = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f82057i = false;
        }
        if (!this.f82057i) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f82057i = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f82057i = false;
        return true;
    }

    public void postShowOverflowMenu() {
        post(new a(this));
    }

    public void setContentHeight(int i10) {
        this.f82055g = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            x3.m2 m2Var = this.f82056h;
            if (m2Var != null) {
                m2Var.cancel();
            }
            super.setVisibility(i10);
        }
    }

    public x3.m2 setupAnimatorToVisibility(int i10, long j10) {
        x3.m2 m2Var = this.f82056h;
        if (m2Var != null) {
            m2Var.cancel();
        }
        b bVar = this.f82051b;
        if (i10 != 0) {
            x3.m2 m2VarAlpha = x3.z1.animate(this).alpha(0.0f);
            m2VarAlpha.setDuration(j10);
            m2VarAlpha.setListener(bVar.withFinalVisibility(m2VarAlpha, i10));
            return m2VarAlpha;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        x3.m2 m2VarAlpha2 = x3.z1.animate(this).alpha(1.0f);
        m2VarAlpha2.setDuration(j10);
        m2VarAlpha2.setListener(bVar.withFinalVisibility(m2VarAlpha2, i10));
        return m2VarAlpha2;
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.showOverflowMenu();
        }
        return false;
    }
}
