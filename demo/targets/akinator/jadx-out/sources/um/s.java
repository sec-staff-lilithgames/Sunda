package um;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f88641a;

    /* renamed from: b, reason: collision with root package name */
    public View f88642b;

    /* renamed from: c, reason: collision with root package name */
    public p f88643c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f88644d = false;

    /* renamed from: e, reason: collision with root package name */
    public final q f88645e = new q(this);

    /* renamed from: f, reason: collision with root package name */
    public final r f88646f = new r(this);

    public s(View.OnClickListener onClickListener) {
        this.f88641a = onClickListener;
    }

    public void attach(Context context, ViewGroup viewGroup, p pVar) {
        RelativeLayout.LayoutParams layoutParams;
        p pVar2;
        p pVarCopyWith = c(context, pVar).copyWith(pVar);
        if (!pVarCopyWith.isVisible().booleanValue()) {
            detach();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(new ViewGroup.MarginLayoutParams(pVarCopyWith.getWidth(context).intValue(), pVarCopyWith.getHeight(context).intValue()));
            pVarCopyWith.applyAlignment(layoutParams2);
            layoutParams = layoutParams2;
        } else {
            if (!(viewGroup instanceof RelativeLayout)) {
                throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(new ViewGroup.MarginLayoutParams(pVarCopyWith.getWidth(context).intValue(), pVarCopyWith.getHeight(context).intValue()));
            pVarCopyWith.applyRelativeAlignment(layoutParams3);
            layoutParams = layoutParams3;
        }
        pVarCopyWith.applyMargin(context, layoutParams);
        if (this.f88642b == null || (pVar2 = this.f88643c) == null || !TextUtils.equals(pVar2.getStyle(), pVarCopyWith.getStyle())) {
            h0.removeFromParent(this.f88642b);
            View viewB = b(context, pVarCopyWith);
            this.f88642b = viewB;
            viewGroup.addView(viewB, layoutParams);
        } else {
            this.f88642b.setLayoutParams(layoutParams);
            this.f88642b.setVisibility(0);
        }
        this.f88642b.setAlpha(pVarCopyWith.getOpacity().floatValue());
        pVarCopyWith.applyPadding(context, this.f88642b);
        this.f88642b.setOnClickListener(this.f88641a);
        this.f88643c = pVarCopyWith;
        KeyEvent.Callback callback = this.f88642b;
        if (callback instanceof o) {
            ((o) callback).setStyle(pVarCopyWith);
        }
        a(this.f88642b, pVarCopyWith);
    }

    public abstract View b(Context context, p pVar);

    public void bringToFront() {
        View view = this.f88642b;
        if (view != null) {
            view.bringToFront();
        }
    }

    public abstract p c(Context context, p pVar);

    public void cancelHide() {
        this.f88644d = false;
        View view = this.f88642b;
        if (view == null || this.f88643c == null) {
            return;
        }
        view.animate().cancel();
        this.f88642b.removeCallbacks(this.f88645e);
        this.f88642b.setClickable(true);
        this.f88642b.setAlpha(this.f88643c.getOpacity().floatValue());
    }

    public void detach() {
        if (this.f88642b != null) {
            cancelHide();
            h0.removeFromParent(this.f88642b);
            this.f88642b = null;
            this.f88643c = null;
        }
    }

    public View getCachedView() {
        return this.f88642b;
    }

    public void invalidate() {
        View view;
        if (!isAttached() || (view = this.f88642b) == null || this.f88643c == null) {
            return;
        }
        view.getContext();
        a(this.f88642b, this.f88643c);
    }

    public boolean isAttached() {
        return this.f88642b != null;
    }

    public void setVisibility(int i10) {
        View view = this.f88642b;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void toggleHide() {
        p pVar;
        Float hideAfter;
        if (this.f88644d || this.f88642b == null || (pVar = this.f88643c) == null || (hideAfter = pVar.getHideAfter()) == null || hideAfter.floatValue() == 0.0f) {
            return;
        }
        this.f88644d = true;
        this.f88642b.postDelayed(this.f88645e, (long) (hideAfter.floatValue() * 1000.0f));
    }

    public void toggleShow() {
        if (this.f88642b == null || this.f88643c == null) {
            return;
        }
        cancelHide();
        toggleHide();
    }

    public void a(View view, p pVar) {
    }
}
