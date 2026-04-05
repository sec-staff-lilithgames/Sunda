package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import hj.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lj.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ModalLayoutLandscape extends b {

    /* renamed from: g, reason: collision with root package name */
    public View f29699g;

    /* renamed from: h, reason: collision with root package name */
    public View f29700h;

    /* renamed from: i, reason: collision with root package name */
    public View f29701i;

    /* renamed from: j, reason: collision with root package name */
    public View f29702j;

    /* renamed from: k, reason: collision with root package name */
    public int f29703k;

    /* renamed from: l, reason: collision with root package name */
    public int f29704l;

    /* renamed from: m, reason: collision with root package name */
    public int f29705m;

    /* renamed from: n, reason: collision with root package name */
    public int f29706n;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i16 = this.f29705m;
        int i17 = this.f29706n;
        if (i16 < i17) {
            i15 = (i17 - i16) / 2;
            i14 = 0;
        } else {
            i14 = (i16 - i17) / 2;
            i15 = 0;
        }
        t.logd("Layout image");
        int i18 = i15 + paddingTop;
        int iE = b.e(this.f29699g) + paddingLeft;
        b.f(this.f29699g, paddingLeft, i18, iE, b.d(this.f29699g) + i18);
        int i19 = iE + this.f29703k;
        t.logd("Layout getTitle");
        int i20 = paddingTop + i14;
        int iD = b.d(this.f29700h) + i20;
        b.f(this.f29700h, i19, i20, measuredWidth, iD);
        t.logd("Layout getBody");
        int i21 = iD + (this.f29700h.getVisibility() == 8 ? 0 : this.f29704l);
        int iD2 = b.d(this.f29701i) + i21;
        b.f(this.f29701i, i19, i21, measuredWidth, iD2);
        t.logd("Layout button");
        int i22 = iD2 + (this.f29701i.getVisibility() != 8 ? this.f29704l : 0);
        View view = this.f29702j;
        b.f(view, i19, i22, b.e(view) + i19, b.d(view) + i22);
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29699g = c(R.id.image_view);
        this.f29700h = c(R.id.message_title);
        this.f29701i = c(R.id.body_scroll);
        this.f29702j = c(R.id.button);
        int visibility = this.f29699g.getVisibility();
        DisplayMetrics displayMetrics = this.f73383e;
        int iMax = 0;
        this.f29703k = visibility == 8 ? 0 : (int) Math.floor(TypedValue.applyDimension(1, 24, displayMetrics));
        this.f29704l = (int) Math.floor(TypedValue.applyDimension(1, 24, displayMetrics));
        List listAsList = Arrays.asList(this.f29700h, this.f29701i, this.f29702j);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i10);
        int iA = a(i11) - paddingTop;
        int i12 = iB - paddingRight;
        t.logd("Measuring image");
        mj.b.measureAtMost(this.f29699g, (int) (i12 * 0.4f), iA);
        int iE = b.e(this.f29699g);
        int i13 = i12 - (this.f29703k + iE);
        float f10 = iE;
        t.logdPair("Max col widths (l, r)", f10, i13);
        Iterator it = listAsList.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i14++;
            }
        }
        int iMax2 = Math.max(0, (i14 - 1) * this.f29704l);
        int i15 = iA - iMax2;
        t.logd("Measuring getTitle");
        mj.b.measureAtMost(this.f29700h, i13, i15);
        t.logd("Measuring button");
        mj.b.measureAtMost(this.f29702j, i13, i15);
        t.logd("Measuring scroll view");
        mj.b.measureAtMost(this.f29701i, i13, (i15 - b.d(this.f29700h)) - b.d(this.f29702j));
        this.f29705m = b.d(this.f29699g);
        this.f29706n = iMax2;
        Iterator it2 = listAsList.iterator();
        while (it2.hasNext()) {
            this.f29706n = b.d((View) it2.next()) + this.f29706n;
        }
        int iMax3 = Math.max(this.f29705m + paddingTop, this.f29706n + paddingTop);
        Iterator it3 = listAsList.iterator();
        while (it3.hasNext()) {
            iMax = Math.max(b.e((View) it3.next()), iMax);
        }
        t.logdPair("Measured columns (l, r)", f10, iMax);
        int i16 = iE + iMax + this.f29703k + paddingRight;
        t.logdPair("Measured dims", i16, iMax3);
        setMeasuredDimension(i16, iMax3);
    }
}
