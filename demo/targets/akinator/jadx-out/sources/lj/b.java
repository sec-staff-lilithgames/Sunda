package lj;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import ej.l;
import hj.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class b extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final float f73381b;

    /* renamed from: c, reason: collision with root package name */
    public final float f73382c;

    /* renamed from: e, reason: collision with root package name */
    public final DisplayMetrics f73383e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f73384f;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73384f = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l.f54446a, 0, 0);
        try {
            this.f73381b = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
            this.f73382c = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f73383e = context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static int d(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static int e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public static void f(View view, int i10, int i11, int i12, int i13) {
        t.logdPair("\tleft, right", i10, i12);
        t.logdPair("\ttop, bottom", i11, i13);
        view.layout(i10, i11, i12, i13);
    }

    public final int a(int i10) {
        if (getMaxHeightPct() <= 0.0f) {
            t.logd("Height: restrict by spec");
            return View.MeasureSpec.getSize(i10);
        }
        t.logd("Height: restrict by pct");
        return Math.round(((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels)) / 4) * 4;
    }

    public final int b(int i10) {
        if (getMaxWidthPct() <= 0.0f) {
            t.logd("Width: restrict by spec");
            return View.MeasureSpec.getSize(i10);
        }
        t.logd("Width: restrict by pct");
        return Math.round(((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels)) / 4) * 4;
    }

    public final View c(int i10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(a.b.e(i10, "No such child: "));
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f73383e;
    }

    public float getMaxHeightPct() {
        return this.f73382c;
    }

    public float getMaxWidthPct() {
        return this.f73381b;
    }

    public List<View> getVisibleChildren() {
        return this.f73384f;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        t.logdPair("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i10, i11, i12, i13);
        t.logdPair("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        t.logdHeader("BEGIN LAYOUT");
        t.logd("onLayout: l: " + i10 + ", t: " + i11 + ", r: " + i12 + ", b: " + i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        t.logdHeader("BEGIN MEASURE");
        t.logdPair("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        ArrayList arrayList = this.f73384f;
        arrayList.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            } else {
                t.logdNumber("Skipping GONE child", i12);
            }
        }
    }
}
