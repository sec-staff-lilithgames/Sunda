package ha;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d extends AppCompatTextView implements e {

    /* renamed from: b, reason: collision with root package name */
    public final g f58716b;

    public d(Context context) {
        super(context);
        g gVar = new g(this, getPaint(), null);
        this.f58716b = gVar;
        gVar.b(getCurrentTextColor());
    }

    @Override // ha.e
    public float getGradientX() {
        return this.f58716b.f58719c;
    }

    @Override // ha.e
    public int getPrimaryColor() {
        return this.f58716b.f58722f;
    }

    @Override // ha.e
    public int getReflectionColor() {
        return this.f58716b.f58723g;
    }

    @Override // ha.e
    public boolean isSetUp() {
        return this.f58716b.f58725i;
    }

    @Override // ha.e
    public boolean isShimmering() {
        return this.f58716b.f58724h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        g gVar = this.f58716b;
        if (gVar != null) {
            Paint paint = gVar.f58718b;
            if (gVar.f58724h) {
                if (paint.getShader() == null) {
                    paint.setShader(gVar.f58720d);
                }
                gVar.f58721e.setTranslate(gVar.f58719c * 2.0f, 0.0f);
                gVar.f58720d.setLocalMatrix(gVar.f58721e);
            } else {
                paint.setShader(null);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        g gVar = this.f58716b;
        if (gVar != null) {
            gVar.a();
            if (gVar.f58725i) {
                return;
            }
            gVar.f58725i = true;
            f fVar = gVar.f58726j;
            if (fVar != null) {
                ((a) fVar).onSetupAnimation(gVar.f58717a);
            }
        }
    }

    @Override // ha.e
    public void setAnimationSetupCallback(f fVar) {
        this.f58716b.f58726j = fVar;
    }

    @Override // ha.e
    public void setGradientX(float f10) {
        g gVar = this.f58716b;
        gVar.f58719c = f10;
        gVar.f58717a.invalidate();
    }

    @Override // ha.e
    public void setPrimaryColor(int i10) {
        this.f58716b.b(i10);
    }

    @Override // ha.e
    public void setReflectionColor(int i10) {
        g gVar = this.f58716b;
        gVar.f58723g = i10;
        if (gVar.f58725i) {
            gVar.a();
        }
    }

    @Override // ha.e
    public void setShimmering(boolean z10) {
        this.f58716b.f58724h = z10;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        g gVar = this.f58716b;
        if (gVar != null) {
            gVar.b(getCurrentTextColor());
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g gVar = new g(this, getPaint(), attributeSet);
        this.f58716b = gVar;
        gVar.b(getCurrentTextColor());
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        g gVar = this.f58716b;
        if (gVar != null) {
            gVar.b(getCurrentTextColor());
        }
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g gVar = new g(this, getPaint(), attributeSet);
        this.f58716b = gVar;
        gVar.b(getCurrentTextColor());
    }
}
