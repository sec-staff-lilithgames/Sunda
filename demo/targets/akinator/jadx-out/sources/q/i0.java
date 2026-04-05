package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i0 extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f82115b;

    public i0(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        j0 j0Var = this.f82115b;
        i0 i0Var = j0Var.f82125e;
        Drawable drawable = j0Var.f82126f;
        if (drawable != null && drawable.isStateful() && drawable.setState(i0Var.getDrawableState())) {
            i0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f82115b.f82126f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f82115b.e(canvas);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        j0 j0Var = new j0(this);
        this.f82115b = j0Var;
        j0Var.b(attributeSet, i10);
    }
}
