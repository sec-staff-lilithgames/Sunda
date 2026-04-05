package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import hj.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lj.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class CardLayoutLandscape extends b {

    /* renamed from: g, reason: collision with root package name */
    public View f29688g;

    /* renamed from: h, reason: collision with root package name */
    public View f29689h;

    /* renamed from: i, reason: collision with root package name */
    public View f29690i;

    /* renamed from: j, reason: collision with root package name */
    public View f29691j;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        t.logd("Layout image");
        int iE = b.e(this.f29688g);
        b.f(this.f29688g, 0, 0, iE, b.d(this.f29688g));
        t.logd("Layout title");
        int iD = b.d(this.f29689h);
        b.f(this.f29689h, iE, 0, measuredWidth, iD);
        t.logd("Layout scroll");
        b.f(this.f29690i, iE, iD, measuredWidth, b.d(this.f29690i) + iD);
        t.logd("Layout action bar");
        b.f(this.f29691j, iE, measuredHeight - b.d(this.f29691j), measuredWidth, measuredHeight);
    }

    @Override // lj.b, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29688g = c(R.id.image_view);
        this.f29689h = c(R.id.message_title);
        this.f29690i = c(R.id.body_scroll);
        View viewC = c(R.id.action_bar);
        this.f29691j = viewC;
        List listAsList = Arrays.asList(this.f29689h, this.f29690i, viewC);
        int iB = b(i10);
        int iA = a(i11);
        int iRound = Math.round(((int) (0.6d * iB)) / 4) * 4;
        t.logd("Measuring image");
        mj.b.measureFullHeight(this.f29688g, iB, iA);
        if (b.e(this.f29688g) > iRound) {
            t.logd("Image exceeded maximum width, remeasuring image");
            mj.b.measureFullWidth(this.f29688g, iRound, iA);
        }
        int iD = b.d(this.f29688g);
        int iE = b.e(this.f29688g);
        int i12 = iB - iE;
        float f10 = iE;
        t.logdPair("Max col widths (l, r)", f10, i12);
        t.logd("Measuring title");
        mj.b.measureAtMost(this.f29689h, i12, iD);
        t.logd("Measuring action bar");
        mj.b.measureAtMost(this.f29691j, i12, iD);
        t.logd("Measuring scroll view");
        mj.b.measureFullHeight(this.f29690i, i12, (iD - b.d(this.f29689h)) - b.d(this.f29691j));
        Iterator it = listAsList.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(b.e((View) it.next()), iMax);
        }
        t.logdPair("Measured columns (l, r)", f10, iMax);
        int i13 = iE + iMax;
        t.logdPair("Measured dims", i13, iD);
        setMeasuredDimension(i13, iD);
    }
}
