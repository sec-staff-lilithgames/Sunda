package da;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatButton;
import com.digidust.elokence.akinator.factories.AkApplication;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a extends AppCompatButton {

    /* renamed from: f, reason: collision with root package name */
    public Context f51950f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51951g;

    public a(Context context) {
        super(context);
        this.f51951g = true;
        a(context);
    }

    public void a(Context context) {
        this.f51950f = context;
        setElevation(0.0f);
        setStateListAnimator(null);
        setAllCaps(false);
        setTextColor(Color.parseColor("#4C2901"));
        setTypeface(AkApplication.getTypeFace());
        setGravity(17);
    }

    public void enableAnimation(boolean z10) {
        this.f51951g = false;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f51951g && motionEvent.getAction() == 0) {
            na.b.playBip();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        this.f51951g = z10;
        super.setEnabled(z10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 == 8) {
            clearAnimation();
        }
        super.setVisibility(i10);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51951g = true;
        a(context);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f51951g = true;
        a(context);
    }
}
