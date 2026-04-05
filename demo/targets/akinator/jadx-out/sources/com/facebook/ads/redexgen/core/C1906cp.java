package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1906cp extends FrameLayout {
    public static final int A08 = (int) (AbstractC1640Wl.A02 * 16.0f);
    public C09765y A00;
    public EG A01;
    public C09083i A02;
    public D1 A03;
    public C08892p A04;
    public C2R A05;
    public final C1937dL A06;
    public final C1580Ua A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(US us, String str, Map<String, String> map) {
        A02();
        this.A02 = new C09083i(this.A06, us, this.A00, str, null, map);
        if (U7.A1v(this.A06)) {
            this.A01 = new EG(this.A06, us, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C1906cp(C1937dL c1937dL, C1580Ua c1580Ua) {
        super(c1937dL);
        this.A07 = c1580Ua;
        this.A06 = c1937dL;
        setUpView(c1937dL);
    }

    public final void A01() {
        A0l(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC1560Tf abstractC1560Tf) {
        getEventBus().A05(abstractC1560Tf);
    }

    public final void A05(EnumC1953db enumC1953db) {
        A0h(enumC1953db, 13);
    }

    public final boolean A06() {
        return A0s();
    }

    public E1 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1937dL c1937dL) {
        A0b();
        this.A04 = new C08892p(c1937dL);
        A0i(this.A04);
        this.A03 = new D1(c1937dL, this.A07);
        A0i(new C3D(c1937dL));
        A0i(this.A03);
        this.A05 = new C2R(c1937dL, true, this.A07);
        A0i(this.A05);
        A0i(new D4(this.A05, EnumC1968dr.A02, true, true));
        if (!A0n()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.5y] */
    private void setUpVideo(final C1937dL c1937dL) {
        this.A00 = new E1(c1937dL) { // from class: com.facebook.ads.redexgen.X.5y
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                int newWidthSpec = View.MeasureSpec.getMode(i10);
                if (newWidthSpec == 1073741824) {
                    i11 = i10;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i11);
                    if (newWidthSpec2 == 1073741824) {
                        i10 = i11;
                    }
                }
                super.onMeasure(i10, i11);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        XP.A0I(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC1905co(this));
    }

    private void setUpView(C1937dL c1937dL) {
        setUpVideo(c1937dL);
        setUpPlugins(c1937dL);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f10) {
        setVolume(f10);
        this.A03.A09();
    }
}
