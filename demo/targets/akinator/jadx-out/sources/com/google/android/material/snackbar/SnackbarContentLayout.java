package com.google.android.material.snackbar;

import ah.f;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import sg.o;
import vf.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SnackbarContentLayout extends LinearLayout implements f {

    /* renamed from: b, reason: collision with root package name */
    public TextView f29390b;

    /* renamed from: c, reason: collision with root package name */
    public Button f29391c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f29392e;

    /* renamed from: f, reason: collision with root package name */
    public int f29393f;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29390b.getPaddingTop() == i11 && this.f29390b.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f29390b;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    @Override // ah.f
    public void animateContentIn(int i10, int i11) {
        this.f29390b.setAlpha(0.0f);
        long j10 = i11;
        ViewPropertyAnimator duration = this.f29390b.animate().alpha(1.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = this.f29392e;
        long j11 = i10;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (this.f29391c.getVisibility() == 0) {
            this.f29391c.setAlpha(0.0f);
            this.f29391c.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }

    @Override // ah.f
    public void animateContentOut(int i10, int i11) {
        this.f29390b.setAlpha(1.0f);
        long j10 = i11;
        ViewPropertyAnimator duration = this.f29390b.animate().alpha(0.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = this.f29392e;
        long j11 = i10;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (this.f29391c.getVisibility() == 0) {
            this.f29391c.setAlpha(1.0f);
            this.f29391c.animate().alpha(0.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }

    public Button getActionView() {
        return this.f29391c;
    }

    public TextView getMessageView() {
        return this.f29390b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f29390b = (TextView) findViewById(R.id.snackbar_text);
        this.f29391c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f29390b.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f29393f <= 0 || this.f29391c.getMeasuredWidth() <= this.f29393f) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f29393f = i10;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29392e = o.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, a.f89241b);
    }
}
