package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.digidust.elokence.akinator.freemium.R;
import hj.t;
import lj.b;
import mj.d;
import mj.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ModalLayoutPortrait extends b {

    /* renamed from: g, reason: collision with root package name */
    public final d f29707g;

    /* renamed from: h, reason: collision with root package name */
    public int f29708h;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29707g = new d();
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i16 = 0; i16 < size; i16++) {
            View view = getVisibleChildren().get(i16);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i17 = measuredHeight + paddingTop;
            if ((layoutParams.gravity & 1) == 1) {
                int i18 = (i12 - i10) / 2;
                int i19 = measuredWidth / 2;
                i15 = i18 - i19;
                i14 = i18 + i19;
            } else {
                i14 = paddingLeft + measuredWidth;
                i15 = paddingLeft;
            }
            t.logd("Layout child " + i16);
            t.logdPair("\t(top, bottom)", (float) paddingTop, (float) i17);
            t.logdPair("\t(left, right)", (float) i15, (float) i14);
            view.layout(i15, paddingTop, i14, i17);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i16 < size - 1) {
                measuredHeight2 += this.f29708h;
            }
            paddingTop = measuredHeight2;
        }
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29708h = (int) Math.floor(TypedValue.applyDimension(1, 24, this.f73383e));
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i10);
        int iA = a(i11);
        int size = ((getVisibleChildren().size() - 1) * this.f29708h) + paddingTop;
        d dVar = this.f29707g;
        dVar.reset(iB, iA);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            dVar.add(childAt, childAt.getId() == R.id.body_scroll || childAt.getId() == R.id.image_view);
        }
        t.logd("Screen dimens: " + getDisplayMetrics());
        t.logdPair("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f10 = (float) iB;
        t.logdPair("Base dimens", f10, iA);
        for (e eVar : dVar.getViews()) {
            t.logd("Pre-measure child");
            eVar.preMeasure(iB, iA);
        }
        int totalHeight = dVar.getTotalHeight() + size;
        t.logdNumber("Total reserved height", size);
        t.logdNumber("Total desired height", totalHeight);
        boolean z10 = totalHeight > iA;
        t.logd("Total height constrained: " + z10);
        if (z10) {
            dVar.allocateSpace((iA - size) - dVar.getTotalFixedHeight());
        }
        int i13 = iB - paddingLeft;
        for (e eVar2 : dVar.getViews()) {
            t.logd("Measuring child");
            mj.b.measureAtMost(eVar2.getView(), i13, eVar2.getMaxHeight());
            size += b.d(eVar2.getView());
        }
        t.logdPair("Measured dims", f10, size);
        setMeasuredDimension(iB, size);
    }
}
