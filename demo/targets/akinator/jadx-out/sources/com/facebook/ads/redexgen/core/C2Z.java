package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.2Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2Z extends AbstractC1144Da implements View.OnClickListener {
    public final DX A00;
    public final DR A01;
    public final DP A02;
    public final DN A03;
    public final C1977e0 A04;

    public C2Z(C1937dL c1937dL) {
        this(c1937dL, null);
    }

    public C2Z(C1937dL c1937dL, AttributeSet attributeSet) {
        this(c1937dL, attributeSet, 0);
    }

    public C2Z(C1937dL c1937dL, AttributeSet attributeSet, int i10) {
        super(c1937dL, attributeSet, i10);
        this.A03 = new DN() { // from class: com.facebook.ads.redexgen.X.2o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new DR() { // from class: com.facebook.ads.redexgen.X.2m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new DP() { // from class: com.facebook.ads.redexgen.X.2k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new DX() { // from class: com.facebook.ads.redexgen.X.2j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                this.A00.A04.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new C1977e0(c1937dL);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1144Da
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1144Da
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            E1 videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC2007eU.A07 || videoView.getState() == EnumC2007eU.A05 || videoView.getState() == EnumC2007eU.A06) {
                videoView.A0h(EnumC1953db.A04, 11);
            } else if (videoView.getState() == EnumC2007eU.A0A) {
                videoView.A0l(true, 7);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
