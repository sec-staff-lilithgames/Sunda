package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g0 extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f82109b;

    public g0(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f82109b.f82065c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public g0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        e0 e0Var = new e0(this);
        this.f82109b = e0Var;
        e0Var.b(attributeSet, i10);
    }
}
