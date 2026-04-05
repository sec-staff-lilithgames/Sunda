package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public k f5529b;

    public n(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public k getConstraintSet() {
        if (this.f5529b == null) {
            this.f5529b = new k();
        }
        this.f5529b.clone(this);
        return this.f5529b;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends ConstraintLayout.a {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* renamed from: r0, reason: collision with root package name */
        public final float f5530r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f5531s0;

        /* renamed from: t0, reason: collision with root package name */
        public final float f5532t0;

        /* renamed from: u0, reason: collision with root package name */
        public final float f5533u0;

        /* renamed from: v0, reason: collision with root package name */
        public final float f5534v0;

        /* renamed from: w0, reason: collision with root package name */
        public final float f5535w0;

        /* renamed from: x0, reason: collision with root package name */
        public final float f5536x0;

        /* renamed from: y0, reason: collision with root package name */
        public final float f5537y0;

        /* renamed from: z0, reason: collision with root package name */
        public final float f5538z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f5530r0 = 1.0f;
            this.f5531s0 = false;
            this.f5532t0 = 0.0f;
            this.f5533u0 = 0.0f;
            this.f5534v0 = 0.0f;
            this.f5535w0 = 0.0f;
            this.f5536x0 = 1.0f;
            this.f5537y0 = 1.0f;
            this.f5538z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(a aVar) {
            super(aVar);
            this.f5530r0 = 1.0f;
            this.f5531s0 = false;
            this.f5532t0 = 0.0f;
            this.f5533u0 = 0.0f;
            this.f5534v0 = 0.0f;
            this.f5535w0 = 0.0f;
            this.f5536x0 = 1.0f;
            this.f5537y0 = 1.0f;
            this.f5538z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5530r0 = 1.0f;
            this.f5531s0 = false;
            this.f5532t0 = 0.0f;
            this.f5533u0 = 0.0f;
            this.f5534v0 = 0.0f;
            this.f5535w0 = 0.0f;
            this.f5536x0 = 1.0f;
            this.f5537y0 = 1.0f;
            this.f5538z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5546e);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f5530r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5530r0);
                } else if (index == 28) {
                    this.f5532t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5532t0);
                    this.f5531s0 = true;
                } else if (index == 23) {
                    this.f5534v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5534v0);
                } else if (index == 24) {
                    this.f5535w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5535w0);
                } else if (index == 22) {
                    this.f5533u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5533u0);
                } else if (index == 20) {
                    this.f5536x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5536x0);
                } else if (index == 21) {
                    this.f5537y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5537y0);
                } else if (index == 16) {
                    this.f5538z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5538z0);
                } else if (index == 17) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
