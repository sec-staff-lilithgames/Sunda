package qg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class s extends LinearLayoutCompat {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f83226b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f83227c;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f83228e;

    /* renamed from: f, reason: collision with root package name */
    public int f83229f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f83230g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f83231h;

    public s(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f83226b;
        if (drawable != null) {
            if (this.f83231h) {
                this.f83231h = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f83230g;
                Rect rect = this.f83227c;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f83229f;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f83228e;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f83226b;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f83226b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f83226b.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f83226b;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f83229f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f83226b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f83231h = z10 | this.f83231h;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f83231h = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f83226b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f83226b);
            }
            this.f83226b = drawable;
            this.f83231h = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f83229f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f83229f != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f83229f = i10;
            if (i10 == 119 && this.f83226b != null) {
                this.f83226b.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f83226b;
    }

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f83227c = new Rect();
        this.f83228e = new Rect();
        this.f83229f = Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        this.f83230g = true;
        this.f83231h = false;
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context, attributeSet, uf.a.f88468p, i10, 0, new int[0]);
        this.f83229f = typedArrayObtainStyledAttributes.getInt(1, this.f83229f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f83230g = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
