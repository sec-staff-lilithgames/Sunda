package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Arrays;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class ClockFaceView extends j implements g {

    /* renamed from: f, reason: collision with root package name */
    public final ClockHandView f29526f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f29527g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f29528h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f29529i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f29530j;

    /* renamed from: k, reason: collision with root package name */
    public final c f29531k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f29532l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f29533m;

    /* renamed from: n, reason: collision with root package name */
    public final int f29534n;

    /* renamed from: o, reason: collision with root package name */
    public final int f29535o;

    /* renamed from: p, reason: collision with root package name */
    public final int f29536p;

    /* renamed from: q, reason: collision with root package name */
    public final int f29537q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f29538r;

    /* renamed from: s, reason: collision with root package name */
    public float f29539s;

    /* renamed from: t, reason: collision with root package name */
    public final ColorStateList f29540t;

    public ClockFaceView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.timepicker.j
    public final void c() {
        super.c();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f29530j;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i10)).setVisibility(0);
            i10++;
        }
    }

    public final void d() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF currentSelectorBox = this.f29526f.getCurrentSelectorBox();
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f29530j;
            int size = sparseArray.size();
            rect = this.f29527g;
            rectF = this.f29528h;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(currentSelectorBox);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f29529i);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(currentSelectorBox, rectF) ? null : new RadialGradient(currentSelectorBox.centerX() - rectF.left, currentSelectorBox.centerY() - rectF.top, 0.5f * currentSelectorBox.width(), this.f29532l, this.f29533m, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y3.c.wrap(accessibilityNodeInfo).setCollectionInfo(y3.j.obtain(1, this.f29538r.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f29537q / Math.max(Math.max(this.f29535o / displayMetrics.heightPixels, this.f29536p / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.g
    public void onRotate(float f10, boolean z10) {
        if (Math.abs(this.f29539s - f10) > 0.001f) {
            this.f29539s = f10;
            d();
        }
    }

    public void setHandRotation(float f10) {
        this.f29526f.setHandRotation(f10);
        d();
    }

    @Override // com.google.android.material.timepicker.j
    public void setRadius(int i10) {
        if (i10 != getRadius()) {
            super.setRadius(i10);
            this.f29526f.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, int i10) throws Resources.NotFoundException {
        this.f29538r = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.f29530j;
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f29538r.length, size); i11++) {
            TextView textView = (TextView) sparseArray.get(i11);
            if (i11 >= this.f29538r.length) {
                removeView(textView);
                sparseArray.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f29538r[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                z1.setAccessibilityDelegate(textView, this.f29531k);
                textView.setTextColor(this.f29540t);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f29538r[i11]));
                }
            }
        }
        ClockHandView clockHandView = this.f29526f;
        if (clockHandView.f29546g && !z10) {
            clockHandView.f29557r = 1;
        }
        clockHandView.f29546g = z10;
        clockHandView.invalidate();
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f29527g = new Rect();
        this.f29528h = new RectF();
        this.f29529i = new Rect();
        this.f29530j = new SparseArray();
        this.f29533m = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.f88461i, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 1);
        this.f29540t = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f29526f = clockHandView;
        this.f29534n = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.f29532l = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = l.a.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f29531k = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.f29535o = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f29536p = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f29537q = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
