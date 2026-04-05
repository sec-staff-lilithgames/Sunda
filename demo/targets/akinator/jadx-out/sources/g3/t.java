package g3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t extends androidx.constraintlayout.widget.c implements u {

    /* renamed from: k, reason: collision with root package name */
    public boolean f57268k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f57269l;

    /* renamed from: m, reason: collision with root package name */
    public float f57270m;

    /* renamed from: n, reason: collision with root package name */
    public View[] f57271n;

    public t(Context context) {
        super(context);
        this.f57268k = false;
        this.f57269l = false;
    }

    @Override // g3.u, g3.a
    public float getProgress() {
        return this.f57270m;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.r.f5555n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f57268k = typedArrayObtainStyledAttributes.getBoolean(index, this.f57268k);
                } else if (index == 0) {
                    this.f57269l = typedArrayObtainStyledAttributes.getBoolean(index, this.f57269l);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // g3.u
    public boolean isDecorator() {
        return false;
    }

    @Override // g3.u
    public boolean isUseOnHide() {
        return this.f57269l;
    }

    @Override // g3.u
    public boolean isUsedOnShow() {
        return this.f57268k;
    }

    @Override // g3.u, g3.a
    public void setProgress(float f10) {
        this.f57270m = f10;
        int i10 = 0;
        if (this.f5381c <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i10 < childCount) {
                View childAt = viewGroup.getChildAt(i10);
                if (!(childAt instanceof t)) {
                    setProgress(childAt, f10);
                }
                i10++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f5386i;
        if (viewArr == null || viewArr.length != this.f5381c) {
            this.f5386i = new View[this.f5381c];
        }
        for (int i11 = 0; i11 < this.f5381c; i11++) {
            this.f5386i[i11] = constraintLayout.getViewById(this.f5380b[i11]);
        }
        this.f57271n = this.f5386i;
        while (i10 < this.f5381c) {
            setProgress(this.f57271n[i10], f10);
            i10++;
        }
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57268k = false;
        this.f57269l = false;
        h(attributeSet);
    }

    public t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f57268k = false;
        this.f57269l = false;
        h(attributeSet);
    }

    public void setProgress(View view, float f10) {
    }

    @Override // g3.u
    public void onFinishedMotionScene(i0 i0Var) {
    }

    @Override // g3.u
    public void onPostDraw(Canvas canvas) {
    }

    @Override // g3.u
    public void onPreDraw(Canvas canvas) {
    }

    @Override // g3.u
    public void onPreSetup(i0 i0Var, HashMap<View, s> map) {
    }

    @Override // g3.u, g3.g0
    public void onTransitionCompleted(i0 i0Var, int i10) {
    }

    @Override // g3.u, g3.g0
    public void onTransitionStarted(i0 i0Var, int i10, int i11) {
    }

    @Override // g3.u, g3.g0
    public void onTransitionChange(i0 i0Var, int i10, int i11, float f10) {
    }

    @Override // g3.u, g3.g0
    public void onTransitionTrigger(i0 i0Var, int i10, boolean z10, float f10) {
    }
}
