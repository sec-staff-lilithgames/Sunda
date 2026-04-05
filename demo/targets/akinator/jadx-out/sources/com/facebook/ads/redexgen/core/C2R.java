package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.2R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2R extends AbstractC1144Da {
    public final Paint A00;
    public final C1937dL A01;
    public final C1580Ua A02;
    public final DX A03;
    public final DR A04;
    public final DP A05;
    public final C1977e0 A06;

    public C2R(C1937dL c1937dL, boolean z10, C1580Ua c1580Ua) {
        super(c1937dL);
        this.A04 = new DR() { // from class: com.facebook.ads.redexgen.X.2X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new DP() { // from class: com.facebook.ads.redexgen.X.2W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new DX() { // from class: com.facebook.ads.redexgen.X.2S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = c1580Ua;
        this.A01 = c1937dL;
        this.A06 = new C1977e0(c1937dL, z10);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams btnLayout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z10) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        XP.A0K(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        XP.A0E(1004, this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1144Da
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new ViewOnClickListenerC1974dx(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1144Da
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i10 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i10 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f10 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f10, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
