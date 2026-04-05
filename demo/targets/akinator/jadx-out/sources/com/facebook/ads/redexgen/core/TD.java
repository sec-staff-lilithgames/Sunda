package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class TD extends R8 implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1937dL A01;
    public InterfaceC1590Uk A02;
    public AnonymousClass64 A04;
    public C08892p A05;
    public C2Z A06;
    public AbstractC2009eW A07;
    public C2010eX A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1949dX A0C = new UW(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC1600Uu A03 = EnumC1600Uu.A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{11, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, 28, 35, 47, 61, 28, 35, 46, 47, 37, 106, 35, 57, 106, 36, Utf8.REPLACEMENT_BYTE, 38, 38, 113, 106, Utf8.REPLACEMENT_BYTE, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, 15, 91, 64, 15, 73, 70, 65, 75, 15, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, 64, 15, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0E();
        A0H = TD.class.getSimpleName();
    }

    private UD A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UD(this, mediaViewVideoRendererApi);
    }

    private U2 A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new U2(this, mediaViewVideoRendererApi);
    }

    private C1570Tq A02() {
        return new C1570Tq(this);
    }

    private C2010eX A05() {
        return new C2010eX(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            AnonymousClass64 anonymousClass64 = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C1950dY) anonymousClass64.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new ViewOnTouchListenerC1589Uj(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((C1950dY) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            EnumC2007eU state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC2007eU.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC1600Uu.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C1480Qc c1480Qc, InterfaceC1590Uk interfaceC1590Uk) {
        String url;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC1590Uk;
        A09();
        C08892p c08892p = this.A05;
        if (c1480Qc != null && c1480Qc.getAdCoverImage() != null) {
            C1595Up adCoverImage = c1480Qc.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            url = adCoverImage.getUrl();
        } else {
            url = null;
        }
        c08892p.setImage(url, new C1575Tv(this));
        this.A03 = c1480Qc.A19();
        this.A06.setPlayAccessibilityLabel(c1480Qc.A1F());
        this.A06.setPauseAccessibilityLabel(c1480Qc.A1E());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC1953db enumC1953db) {
        if (this.A04 != null) {
            this.A04.A0h(enumC1953db, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == EnumC2007eU.A06) {
            return false;
        }
        return this.A03 == EnumC1600Uu.A05 || this.A03 == EnumC1600Uu.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10) {
        InterfaceC1592Um interfaceC1592UmA01;
        ((R8) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i10) {
            case 0:
                interfaceC1592UmA01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                interfaceC1592UmA01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((RH) mediaViewVideoRendererApi).A06(interfaceC1592UmA01);
        this.A01 = RB.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C08892p(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = AbstractC1640Wl.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C2Z(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i11 = 0;
        while (true) {
            int i12 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i11 < i12) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof AnonymousClass64) {
                    this.A04 = (AnonymousClass64) childAt;
                } else {
                    i11++;
                }
            }
        }
        if (this.A04 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0i(this.A05);
            AnonymousClass64 anonymousClass64 = this.A04;
            C2Z c2z = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                anonymousClass64.A0i(c2z);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                anonymousClass64.A0i(c2z);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        interfaceC1592UmA01.AIk();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean zA0s = U7.A0s(this.A01);
        this.A00.setOnTouchListener(new ViewOnTouchListenerC1588Ui(this, zA0s));
        if (!zA0s) {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0C();
    }
}
