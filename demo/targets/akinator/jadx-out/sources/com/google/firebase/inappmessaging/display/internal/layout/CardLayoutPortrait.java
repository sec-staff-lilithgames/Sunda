package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import hj.t;
import lj.b;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class CardLayoutPortrait extends b {

    /* renamed from: g, reason: collision with root package name */
    public View f29692g;

    /* renamed from: h, reason: collision with root package name */
    public View f29693h;

    /* renamed from: i, reason: collision with root package name */
    public View f29694i;

    /* renamed from: j, reason: collision with root package name */
    public View f29695j;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int size = getVisibleChildren().size();
        int measuredHeight = 0;
        for (int i14 = 0; i14 < size; i14++) {
            View view = getVisibleChildren().get(i14);
            int measuredHeight2 = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredHeight2 + measuredHeight;
            t.logd("Layout child " + i14);
            t.logdPair("\t(top, bottom)", (float) measuredHeight, (float) i15);
            t.logdPair("\t(left, right)", (float) 0, (float) measuredWidth);
            view.layout(0, measuredHeight, measuredWidth, i15);
            t.logdPair(o2.k(i14, "Child ", " wants to be "), view.getMeasuredWidth(), view.getMeasuredHeight());
            measuredHeight += view.getMeasuredHeight();
        }
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29692g = c(R.id.image_view);
        this.f29693h = c(R.id.message_title);
        this.f29694i = c(R.id.body_scroll);
        this.f29695j = c(R.id.action_bar);
        int iB = b(i10);
        int iA = a(i11);
        int iRound = Math.round(((int) (0.8d * iA)) / 4) * 4;
        t.logd("Measuring image");
        mj.b.measureFullWidth(this.f29692g, iB, iA);
        if (b.d(this.f29692g) > iRound) {
            t.logd("Image exceeded maximum height, remeasuring image");
            mj.b.measureFullHeight(this.f29692g, iB, iRound);
        }
        int iE = b.e(this.f29692g);
        t.logd("Measuring title");
        mj.b.measureFullWidth(this.f29693h, iE, iA);
        t.logd("Measuring action bar");
        mj.b.measureFullWidth(this.f29695j, iE, iA);
        t.logd("Measuring scroll view");
        mj.b.measureFullWidth(this.f29694i, iE, ((iA - b.d(this.f29692g)) - b.d(this.f29693h)) - b.d(this.f29695j));
        int size = getVisibleChildren().size();
        int iD = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iD += b.d(getVisibleChildren().get(i12));
        }
        setMeasuredDimension(iE, iD);
    }
}
