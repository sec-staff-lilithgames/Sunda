package io.odeeo.internal.w1;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.odeeo.internal.w1.c;
import io.odeeo.sdk.AdPosition;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.R;
import io.odeeo.sdk.advertisement.data.AdInfo;
import io.odeeo.sdk.l;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends c {
    public static final a A = new a(null);

    /* renamed from: x, reason: collision with root package name */
    public h f67348x;

    /* renamed from: y, reason: collision with root package name */
    public final io.odeeo.internal.w1.a f67349y;

    /* renamed from: z, reason: collision with root package name */
    public int f67350z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.w1.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0683b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67351a;

        static {
            int[] iArr = new int[AdPosition.BannerPosition.values().length];
            iArr[AdPosition.BannerPosition.TopCenter.ordinal()] = 1;
            iArr[AdPosition.BannerPosition.BottomCenter.ordinal()] = 2;
            f67351a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Activity context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    /* renamed from: buildBanner-I42uRZk, reason: not valid java name */
    public final FrameLayout m4605buildBannerI42uRZk(AdInfo ad2, l.b bVar, AdUnit.PlacementType bannerAdType, boolean z10, String placementId, kv.a onPageLoaded) {
        e0.checkNotNullParameter(ad2, "ad");
        e0.checkNotNullParameter(bannerAdType, "bannerAdType");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        if (!(getData$odeeoSdk_release().getPos() instanceof AdPosition.BannerPosition)) {
            throw new IllegalArgumentException("BannerView can be used only for BannerPosition");
        }
        setBackground(new ColorDrawable(0));
        setSystemUiVisibility(getData$odeeoSdk_release().getWindowFlags());
        c.a aVar = c.f67352p;
        setVisibility(aVar.getAdViewVisibility(bannerAdType, z10) ? 0 : 8);
        if (ad2.getMimeType() == null) {
            getFinishWithError$odeeoSdk_release().invoke(new io.odeeo.internal.b1.e(AdUnit.ERROR_UNSUPPORTED_MIME_TYPE, null, 2, null));
            return null;
        }
        io.odeeo.sdk.l.showAd$odeeoSdk_release$default(getWebView$odeeoSdk_release(), ad2, 320, 50, bannerAdType, 0, onPageLoaded, 16, null);
        getWebView$odeeoSdk_release().setListener(bVar);
        getWebView$odeeoSdk_release().getAudioOnlyVisualizer$odeeoSdk_release().setLines(7);
        f.setAudioOnlySize(getWebView$odeeoSdk_release(), this.f67349y);
        getWebView$odeeoSdk_release().getAudioOnlyVisualizer$odeeoSdk_release().setSpeed(1.3f);
        getWebView$odeeoSdk_release().setLayoutDirection(0);
        setLayoutDirection(0);
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), aVar.getAD_MARK_LAYOUT_SIZE$odeeoSdk_release()), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), aVar.getAD_MARK_LAYOUT_SIZE$odeeoSdk_release()), 8388693);
        layoutParams.setMargins(0, 0, 0, kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 2));
        a(getWebView$odeeoSdk_release(), layoutParams, false);
        addView(getWebView$odeeoSdk_release(), new FrameLayout.LayoutParams(-1, -1, 17));
        float fDensityPixelsToPixels = kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setAlpha(aVar.getLINEBAR_CORNER_TRANSPARENCY$odeeoSdk_release());
        gradientDrawable.setCornerRadii(new float[]{fDensityPixelsToPixels, fDensityPixelsToPixels, 0.0f, 0.0f, 0.0f, 0.0f, fDensityPixelsToPixels, fDensityPixelsToPixels});
        LinearLayout linearLayout = new LinearLayout(getWebView$odeeoSdk_release().getContext());
        linearLayout.setLayoutTransition(new LayoutTransition());
        linearLayout.setOrientation(0);
        linearLayout.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), aVar.getACTION_BUTTON_SIZE$odeeoSdk_release()), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), aVar.getACTION_BUTTON_SIZE$odeeoSdk_release()));
        a(gradientDrawable2);
        if (ad2.getVisualiserEnabled$odeeoSdk_release()) {
            linearLayout.addView(getLineBarVisualizer$odeeoSdk_release(), layoutParams2);
        }
        m4606addActionButtonR6A4vtM$odeeoSdk_release(linearLayout, getData$odeeoSdk_release().getActionType(), getData$odeeoSdk_release().getActionButtonDelayMillis(), gradientDrawable3, placementId);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams3.setMargins(0, kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 2), 0, 0);
        addView(linearLayout, layoutParams3);
        int iDpToPx = io.odeeo.internal.v1.l.dpToPx(320, getContext());
        int iDpToPx2 = io.odeeo.internal.v1.l.dpToPx(50, getContext());
        this.f67348x = getProgressBar$odeeoSdk_release();
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 320), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 2), 48);
        int i10 = C0683b.f67351a[((AdPosition.BannerPosition) getData$odeeoSdk_release().getPos()).ordinal()];
        if (i10 == 1) {
            layoutParams4 = new FrameLayout.LayoutParams(kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 320), kVar.densityPixelsToPixels(getDensityPixelsToPixelScale$odeeoSdk_release(), 2), 80);
        } else if (i10 != 2) {
            throw new t();
        }
        addView(this.f67348x, layoutParams4);
        setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx2, 49));
        return this;
    }

    public final int getLastTick$odeeoSdk_release() {
        return this.f67350z;
    }

    public final h getMProgressBar$odeeoSdk_release() {
        return this.f67348x;
    }

    public final h getProgressBar$odeeoSdk_release() {
        h hVar = new h(getContext(), null, 0, null, 14, null);
        hVar.setProgressDrawable(m3.a.getDrawable(hVar.getContext(), R.drawable.linear_progress_bar_drawable));
        Drawable progressDrawable = hVar.getProgressDrawable();
        LayerDrawable layerDrawable = progressDrawable instanceof LayerDrawable ? (LayerDrawable) progressDrawable : null;
        if (layerDrawable != null) {
            Drawable drawable = layerDrawable.getDrawable(0);
            Drawable drawable2 = layerDrawable.getDrawable(1);
            drawable.setAlpha(c.f67352p.getLINEBAR_CORNER_TRANSPARENCY$odeeoSdk_release());
            drawable2.setColorFilter(getData$odeeoSdk_release().getColor(), PorterDuff.Mode.SRC_IN);
        } else {
            Drawable progressDrawable2 = hVar.getProgressDrawable();
            if (progressDrawable2 != null) {
                progressDrawable2.setColorFilter(getData$odeeoSdk_release().getColor(), PorterDuff.Mode.SRC_IN);
            }
        }
        hVar.setMax(10000);
        return hVar;
    }

    public final void setLastTick$odeeoSdk_release(int i10) {
        this.f67350z = i10;
    }

    public final void setMProgressBar$odeeoSdk_release(h hVar) {
        this.f67348x = hVar;
    }

    @Override // io.odeeo.internal.w1.c
    public void timerTick(int i10, long j10) {
        if (this.f67350z != i10) {
            h hVar = this.f67348x;
            if (hVar != null) {
                hVar.setSmoothProgress(i10 * 100, j10);
            }
            this.f67350z = i10;
        }
        getWebView$odeeoSdk_release().timerTick();
        super.timerTick(i10, j10);
    }

    public /* synthetic */ b(Activity activity, AttributeSet attributeSet, int i10, u uVar) {
        this(activity, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.f67349y = new io.odeeo.internal.w1.a(24, 6, 6);
        this.f67350z = -1;
    }
}
