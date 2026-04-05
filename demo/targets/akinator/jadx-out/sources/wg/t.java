package wg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import qg.b0;
import qg.l0;
import qg.t0;
import qg.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SearchView f90608a;

    /* renamed from: b, reason: collision with root package name */
    public final View f90609b;

    /* renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f90610c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f90611d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f90612e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f90613f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f90614g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f90615h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f90616i;

    /* renamed from: j, reason: collision with root package name */
    public final EditText f90617j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageButton f90618k;

    /* renamed from: l, reason: collision with root package name */
    public final View f90619l;

    /* renamed from: m, reason: collision with root package name */
    public final TouchObserverFrameLayout f90620m;

    /* renamed from: n, reason: collision with root package name */
    public final sg.l f90621n;

    /* renamed from: o, reason: collision with root package name */
    public AnimatorSet f90622o;

    /* renamed from: p, reason: collision with root package name */
    public SearchBar f90623p;

    public t(SearchView searchView) {
        this.f90608a = searchView;
        this.f90609b = searchView.f29328b;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f29329c;
        this.f90610c = clippableRoundedCornerLayout;
        this.f90611d = searchView.f29332g;
        this.f90612e = searchView.f29333h;
        this.f90613f = searchView.f29334i;
        this.f90614g = searchView.f29335j;
        this.f90616i = searchView.f29336k;
        this.f90617j = searchView.f29338m;
        this.f90618k = searchView.f29339n;
        this.f90619l = searchView.f29340o;
        this.f90620m = searchView.f29341p;
        this.f90615h = searchView.f29337l;
        this.f90621n = new sg.l(clippableRoundedCornerLayout);
    }

    public static void a(t tVar, float f10) {
        ActionMenuView actionMenuView;
        tVar.f90618k.setAlpha(f10);
        tVar.f90619l.setAlpha(f10);
        tVar.f90620m.setAlpha(f10);
        if (!tVar.f90608a.isMenuItemsAnimated() || (actionMenuView = l0.getActionMenuView(tVar.f90613f)) == null) {
            return;
        }
        actionMenuView.setAlpha(f10);
    }

    public static AnimatorSet h(View view, int i10, int i11, boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i10, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(x.translationXListener(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i11, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(x.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(b0.of(z10, vf.a.f89241b));
        return animatorSet;
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = l0.getNavigationIconButton(this.f90613f);
        if (navigationIconButton == null) {
            return;
        }
        Drawable drawableUnwrap = p3.a.unwrap(navigationIconButton.getDrawable());
        if (!this.f90608a.isAnimatedNavigationIcon()) {
            if (drawableUnwrap instanceof m.b) {
                ((m.b) drawableUnwrap).setProgress(1.0f);
            }
            if (drawableUnwrap instanceof qg.p) {
                ((qg.p) drawableUnwrap).setProgress(1.0f);
                return;
            }
            return;
        }
        if (drawableUnwrap instanceof m.b) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new com.google.android.exoplayer2.ui.g((m.b) drawableUnwrap, 9));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableUnwrap instanceof qg.p) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new com.google.android.exoplayer2.ui.g((qg.p) drawableUnwrap, 10));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
        SearchBar searchBar = this.f90623p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new com.google.android.exoplayer2.ui.g(navigationIconButton, 12));
        animatorSet.playTogether(valueAnimatorOfFloat3);
    }

    public final AnimatorSet c(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f90613f;
        ImageButton navigationIconButton = l0.getNavigationIconButton(materialToolbar);
        if (navigationIconButton != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(j(l0.getNavigationIconButton(this.f90623p), navigationIconButton), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(x.translationXListener(navigationIconButton));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(x.translationYListener(navigationIconButton));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuView = l0.getActionMenuView(materialToolbar);
        if (actionMenuView != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(j(l0.getActionMenuView(this.f90623p), actionMenuView), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(x.translationXListener(actionMenuView));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(x.translationYListener(actionMenuView));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(b0.of(z10, vf.a.f89241b));
        return animatorSet;
    }

    public void cancelBackProgress() {
        this.f90621n.cancelBackProgress(this.f90623p);
        AnimatorSet animatorSet = this.f90622o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f90622o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet d(boolean r30) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.t.d(boolean):android.animation.AnimatorSet");
    }

    public final int e(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iK = k(this.f90623p);
        return t0.isLayoutRtl(this.f90623p) ? iK - marginEnd : ((this.f90623p.getWidth() + iK) + marginEnd) - this.f90608a.getWidth();
    }

    public final int f() {
        FrameLayout frameLayout = this.f90612e;
        int height = (frameLayout.getHeight() / 2) + frameLayout.getTop();
        SearchBar searchBar = this.f90623p;
        int top = searchBar.getTop();
        for (ViewParent parent = searchBar.getParent(); (parent instanceof View) && parent != this.f90608a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return ((this.f90623p.getHeight() / 2) + top) - height;
    }

    public void finishBackProgress() {
        this.f90621n.finishBackProgress(l().getTotalDuration(), this.f90623p);
        if (this.f90622o != null) {
            c(false).start();
            this.f90622o.resume();
        }
        this.f90622o = null;
    }

    public final AnimatorSet g(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f90610c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(x.translationYListener(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(b0.of(z10, vf.a.f89241b));
        animatorSet.setDuration(z10 ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet i(View view, boolean z10) {
        TextView placeholderTextView = this.f90623p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z10) {
            placeholderTextView = this.f90623p.getTextView();
        }
        return h(view, k(placeholderTextView) - (this.f90615h.getLeft() + view.getLeft()), f(), z10);
    }

    public final int j(View view, View view2) {
        if (view != null) {
            return k(view) - k(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.f90623p.getPaddingStart();
        int iK = k(this.f90623p);
        return t0.isLayoutRtl(this.f90623p) ? (((this.f90623p.getWidth() + iK) + marginStart) - paddingStart) - this.f90608a.getRight() : (iK - marginStart) + paddingStart;
    }

    public final int k(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f90608a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final AnimatorSet l() {
        SearchBar searchBar = this.f90623p;
        SearchView searchView = this.f90608a;
        if (searchBar != null) {
            if (searchView.b()) {
                searchView.clearFocusAndHideKeyboard();
            }
            AnimatorSet animatorSetD = d(false);
            animatorSetD.addListener(new p(this));
            animatorSetD.start();
            return animatorSetD;
        }
        if (searchView.b()) {
            searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet animatorSetG = g(false);
        animatorSetG.addListener(new r(this));
        animatorSetG.start();
        return animatorSetG;
    }

    public f.c onHandleBackInvoked() {
        return this.f90621n.onHandleBackInvoked();
    }

    public void updateBackProgress(f.c cVar) {
        if (cVar.getProgress() <= 0.0f) {
            return;
        }
        SearchBar searchBar = this.f90623p;
        this.f90621n.updateBackProgress(cVar, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f90622o;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (cVar.getProgress() * this.f90622o.getDuration()));
            return;
        }
        SearchView searchView = this.f90608a;
        if (searchView.b()) {
            searchView.clearFocusAndHideKeyboard();
        }
        if (searchView.isAnimatedNavigationIcon()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(b0.of(false, vf.a.f89241b));
            this.f90622o = animatorSet2;
            animatorSet2.start();
            this.f90622o.pause();
        }
    }
}
