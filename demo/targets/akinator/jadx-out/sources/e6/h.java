package e6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f53804a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f53805b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f53806c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f53807d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53808e;

    /* renamed from: f, reason: collision with root package name */
    public final int f53809f;

    /* renamed from: g, reason: collision with root package name */
    public final int f53810g;

    /* renamed from: h, reason: collision with root package name */
    public final int f53811h;

    /* renamed from: i, reason: collision with root package name */
    public final int f53812i;

    /* renamed from: j, reason: collision with root package name */
    public final int f53813j;

    /* renamed from: k, reason: collision with root package name */
    public final int f53814k;

    /* renamed from: l, reason: collision with root package name */
    public final int f53815l;

    /* renamed from: m, reason: collision with root package name */
    public final int f53816m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f53817n;

    public h(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f53804a = view;
        this.f53805b = rect;
        this.f53806c = z10;
        this.f53807d = rect2;
        this.f53808e = z11;
        this.f53809f = i10;
        this.f53810g = i11;
        this.f53811h = i12;
        this.f53812i = i13;
        this.f53813j = i14;
        this.f53814k = i15;
        this.f53815l = i16;
        this.f53816m = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // e6.g0
    public void onTransitionCancel(c0 c0Var) {
        this.f53817n = true;
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.g0
    public void onTransitionPause(c0 c0Var) {
        View view = this.f53804a;
        view.setTag(R.id.transition_clip, view.getClipBounds());
        view.setClipBounds(this.f53808e ? null : this.f53807d);
    }

    @Override // e6.g0
    public void onTransitionResume(c0 c0Var) {
        View view = this.f53804a;
        Rect rect = (Rect) view.getTag(R.id.transition_clip);
        view.setTag(R.id.transition_clip, null);
        view.setClipBounds(rect);
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) {
        if (this.f53817n) {
            return;
        }
        Rect rect = null;
        if (z10) {
            if (!this.f53806c) {
                rect = this.f53805b;
            }
        } else if (!this.f53808e) {
            rect = this.f53807d;
        }
        View view = this.f53804a;
        view.setClipBounds(rect);
        if (z10) {
            b1.a(view, this.f53809f, this.f53810g, this.f53811h, this.f53812i);
        } else {
            b1.a(view, this.f53813j, this.f53814k, this.f53815l, this.f53816m);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator, boolean z10) {
        int i10 = this.f53811h;
        int i11 = this.f53809f;
        int i12 = this.f53815l;
        int i13 = this.f53813j;
        int iMax = Math.max(i10 - i11, i12 - i13);
        int i14 = this.f53812i;
        int i15 = this.f53810g;
        int i16 = this.f53816m;
        int i17 = this.f53814k;
        int iMax2 = Math.max(i14 - i15, i16 - i17);
        if (z10) {
            i11 = i13;
        }
        if (z10) {
            i15 = i17;
        }
        View view = this.f53804a;
        b1.a(view, i11, i15, iMax + i11, iMax2 + i15);
        view.setClipBounds(z10 ? this.f53807d : this.f53805b);
    }

    @Override // e6.g0
    public void onTransitionEnd(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionStart(c0 c0Var) {
    }
}
