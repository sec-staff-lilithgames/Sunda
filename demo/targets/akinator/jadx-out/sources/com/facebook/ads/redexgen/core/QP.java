package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public class QP extends ViewGroup.MarginLayoutParams {
    public AbstractC1484Qg A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public QP(int i10, int i11) {
        super(i10, i11);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public QP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public QP(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public QP(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public QP(QP qp2) {
        super((ViewGroup.LayoutParams) qp2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0O();
    }

    public final boolean A01() {
        return this.A00.A0j();
    }

    public final boolean A02() {
        return this.A00.A0g();
    }

    public final boolean A03() {
        return this.A00.A0f();
    }
}
