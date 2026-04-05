package io.odeeo.internal.w1;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.w1.c;
import io.odeeo.sdk.AdPosition;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.data.AdInfo;
import io.odeeo.sdk.l;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import tu.q;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends io.odeeo.internal.w1.c {
    public static final a C = new a(null);
    public final tu.o A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public final n f67388x;

    /* renamed from: y, reason: collision with root package name */
    public final io.odeeo.internal.w1.a f67389y;

    /* renamed from: z, reason: collision with root package name */
    public final io.odeeo.internal.w1.a f67390z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67391a;

        static {
            int[] iArr = new int[AdUnit.ActionButtonType.values().length];
            iArr[AdUnit.ActionButtonType.Mute.ordinal()] = 1;
            iArr[AdUnit.ActionButtonType.Close.ordinal()] = 2;
            iArr[AdUnit.ActionButtonType.None.ordinal()] = 3;
            f67391a = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements kv.a {
        public c() {
            super(0);
        }

        @Override // kv.a
        public final Integer invoke() {
            return Integer.valueOf(Math.max(70, Math.min(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, e.this.getData$odeeoSdk_release().getSize())));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Activity context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    public final void a(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16777216);
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        gradientDrawable.setCornerRadius(kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i10));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 24), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 24), 8388693);
        int iDensityPixelsToPixels = kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 2);
        layoutParams.setMargins(0, 0, iDensityPixelsToPixels, iDensityPixelsToPixels);
        getLineBarVisualizer$odeeoSdk_release().setLines(3);
        a(gradientDrawable);
        getWebView$odeeoSdk_release().addView(getLineBarVisualizer$odeeoSdk_release(), layoutParams);
    }

    /* renamed from: buildIconView-I42uRZk, reason: not valid java name */
    public final FrameLayout m4610buildIconViewI42uRZk(AdInfo ad2, l.b webViewListener, AdUnit.PlacementType iconAdType, boolean z10, String placementId, kv.a onPageLoaded) {
        e0.checkNotNullParameter(ad2, "ad");
        e0.checkNotNullParameter(webViewListener, "webViewListener");
        e0.checkNotNullParameter(iconAdType, "iconAdType");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        if (!(getData$odeeoSdk_release().getPos() instanceof AdPosition.IconPosition)) {
            throw new IllegalArgumentException("IconView can be used only for IconPosition");
        }
        boolean z11 = getSize() > 80;
        int size = getSize();
        int i10 = size - 10;
        int i11 = size - 12;
        setSystemUiVisibility(getData$odeeoSdk_release().getWindowFlags());
        c.a aVar = io.odeeo.internal.w1.c.f67352p;
        setVisibility(aVar.getAdViewVisibility(iconAdType, z10) ? 0 : 8);
        getWebView$odeeoSdk_release().showAd$odeeoSdk_release(ad2, i11, i11, iconAdType, 3, onPageLoaded);
        getWebView$odeeoSdk_release().setListener(webViewListener);
        int i12 = z11 ? 13 : 5;
        getWebView$odeeoSdk_release().setWebViewCornerRadius(i12);
        getWebView$odeeoSdk_release().getAudioOnlyVisualizer$odeeoSdk_release().setLines(3);
        f.setAudioOnlySize(getWebView$odeeoSdk_release(), z11 ? this.f67389y : this.f67390z);
        getWebView$odeeoSdk_release().setLayoutDirection(0);
        setLayoutDirection(0);
        int iDpToPx = io.odeeo.internal.v1.l.dpToPx(i12, getContext());
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), aVar.getAD_MARK_LAYOUT_SIZE$odeeoSdk_release()), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), aVar.getAD_MARK_LAYOUT_SIZE$odeeoSdk_release()), 8388691);
        layoutParams.setMargins(0, 0, 0, iDpToPx);
        a((FrameLayout) getWebView$odeeoSdk_release(), layoutParams, true);
        this.f67388x.setRoundedCorners(z11 ? 15 : 8);
        this.f67388x.setColor(getData$odeeoSdk_release().getColor());
        this.f67388x.setCenterline(true);
        this.f67388x.setWidthInDp(2);
        this.f67388x.setProgress(0.0f);
        if (getWebView$odeeoSdk_release().getAdInfo().getVisualiserEnabled$odeeoSdk_release()) {
            a(z11 ? 12 : 4);
        }
        FrameLayout.LayoutParams layoutParamsA = a(getData$odeeoSdk_release().getActionType(), i10);
        addView(getWebView$odeeoSdk_release(), layoutParamsA);
        addView(this.f67388x, layoutParamsA);
        setBackground(new ColorDrawable(0));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setShape(1);
        AdUnit.ActionButtonType actionType = getData$odeeoSdk_release().getActionType();
        AdUnit.ActionButtonPosition actionButtonPosition = getData$odeeoSdk_release().getActionButtonPosition();
        if (actionType != AdUnit.ActionButtonType.None && actionButtonPosition != null) {
            int gravity$odeeoSdk_release = actionButtonPosition.getGravity$odeeoSdk_release();
            int i13 = b.f67391a[actionType.ordinal()];
            if (i13 == 1 || i13 == 2) {
                a(gradientDrawable, gravity$odeeoSdk_release, placementId);
            }
        }
        return this;
    }

    public final int getLastTick$odeeoSdk_release() {
        return this.B;
    }

    public final n getProgressSquareView$odeeoSdk_release() {
        return this.f67388x;
    }

    public final int getSize() {
        return ((Number) this.A.getValue()).intValue();
    }

    public final void setLastTick$odeeoSdk_release(int i10) {
        this.B = i10;
    }

    @Override // io.odeeo.internal.w1.c
    public void timerTick(int i10, long j10) {
        if (this.B != i10) {
            this.f67388x.setProgressAnimated(i10, j10);
            this.B = i10;
        }
        getWebView$odeeoSdk_release().timerTick();
        super.timerTick(i10, j10);
    }

    public /* synthetic */ e(Activity activity, AttributeSet attributeSet, int i10, u uVar) {
        this(activity, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.f67388x = new n(context);
        this.f67389y = new io.odeeo.internal.w1.a(36, 6, 6);
        this.f67390z = new io.odeeo.internal.w1.a(24, 4, 4);
        this.A = q.lazy(new c());
        this.B = -1;
    }

    public final FrameLayout.LayoutParams a(AdUnit.ActionButtonType actionButtonType, int i10) {
        int i11 = b.f67391a[actionButtonType.ordinal()];
        if (i11 == 1) {
            io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
            int iDensityPixelsToPixels = kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i10);
            int iDensityPixelsToPixels2 = kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i10);
            AdUnit.ActionButtonPosition actionButtonPosition = getData$odeeoSdk_release().getActionButtonPosition();
            return new FrameLayout.LayoutParams(iDensityPixelsToPixels, iDensityPixelsToPixels2, actionButtonPosition == null ? 8388691 : actionButtonPosition.getReverseGravity$odeeoSdk_release());
        }
        if (i11 != 2) {
            if (i11 == 3) {
                io.odeeo.internal.v1.k kVar2 = io.odeeo.internal.v1.k.f67283a;
                return new FrameLayout.LayoutParams(kVar2.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), getSize()), kVar2.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), getSize()));
            }
            throw new t();
        }
        io.odeeo.internal.v1.k kVar3 = io.odeeo.internal.v1.k.f67283a;
        int iDensityPixelsToPixels3 = kVar3.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i10);
        int iDensityPixelsToPixels4 = kVar3.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), i10);
        AdUnit.ActionButtonPosition actionButtonPosition2 = getData$odeeoSdk_release().getActionButtonPosition();
        return new FrameLayout.LayoutParams(iDensityPixelsToPixels3, iDensityPixelsToPixels4, actionButtonPosition2 == null ? 8388693 : actionButtonPosition2.getReverseGravity$odeeoSdk_release());
    }

    public final void a(GradientDrawable gradientDrawable, int i10, String str) {
        LinearLayout linearLayout = new LinearLayout(getWebView$odeeoSdk_release().getContext());
        linearLayout.setLayoutTransition(new LayoutTransition());
        linearLayout.setOrientation(0);
        m4606addActionButtonR6A4vtM$odeeoSdk_release(linearLayout, getData$odeeoSdk_release().getActionType(), getData$odeeoSdk_release().getActionButtonDelayMillis(), gradientDrawable, str);
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        float densityPixelsToPixelScale$odeeoSdk_release = getDensityPixelsToPixelScale$odeeoSdk_release();
        c.a aVar = io.odeeo.internal.w1.c.f67352p;
        addView(linearLayout, new FrameLayout.LayoutParams(kVar.densityPixelsToPixels(densityPixelsToPixelScale$odeeoSdk_release, aVar.getACTION_BUTTON_SIZE$odeeoSdk_release()), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), aVar.getACTION_BUTTON_SIZE$odeeoSdk_release()), i10));
    }
}
