package io.odeeo.sdk;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.domain.PlacementId;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f extends AdUnitBase {
    public final io.odeeo.internal.z0.f C;
    public final io.odeeo.sdk.c D;
    public final io.odeeo.internal.w1.e E;
    public final View F;
    public final io.odeeo.internal.o1.e G;
    public final kv.a H;
    public final tu.o I;
    public final tu.o J;
    public final tu.o K;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.a {
        public a() {
            super(0);
        }

        @Override // kv.a
        public final Integer invoke() {
            return Integer.valueOf(AdUnit.Companion.positionToGravity(f.this.E.getData$odeeoSdk_release().getPos()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.a {
        public b() {
            super(0);
        }

        @Override // kv.a
        public final Integer invoke() {
            return Integer.valueOf(io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(f.this.E.getDensityPixelsToPixelScale$odeeoSdk_release(), f.this.E.getData$odeeoSdk_release().getX()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements kv.a {
        public c() {
            super(0);
        }

        @Override // kv.a
        public final Integer invoke() {
            return Integer.valueOf(io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(f.this.E.getDensityPixelsToPixelScale$odeeoSdk_release(), f.this.E.getData$odeeoSdk_release().getY()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(io.odeeo.internal.z0.f viewModel, io.odeeo.sdk.c audioAd, io.odeeo.internal.w1.e adView, AdActivity adActivity, View rootView, String placementId, String transactionId, io.odeeo.internal.o1.e eventTrackingManager, kv.a onPageLoaded) {
        super(viewModel, audioAd, adView, adActivity, rootView, PlacementId.m4631constructorimpl(placementId), transactionId, null, eventTrackingManager, 128, null);
        e0.checkNotNullParameter(viewModel, "viewModel");
        e0.checkNotNullParameter(audioAd, "audioAd");
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(rootView, "rootView");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(transactionId, "transactionId");
        e0.checkNotNullParameter(eventTrackingManager, "eventTrackingManager");
        e0.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        this.C = viewModel;
        this.D = audioAd;
        this.E = adView;
        this.F = rootView;
        this.G = eventTrackingManager;
        this.H = onPageLoaded;
        this.I = tu.q.lazy(new a());
        this.J = tu.q.lazy(new b());
        this.K = tu.q.lazy(new c());
    }

    public final void a(AdUnit.PlacementType placementType) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        io.odeeo.internal.b2.a.i(e0.stringPlus("prepareIcon iconAdType: ", placementType), new Object[0]);
        FrameLayout frameLayoutM4610buildIconViewI42uRZk = this.E.m4610buildIconViewI42uRZk(this.C.getAdInfo(), this, placementType, io.odeeo.sdk.c.isVolumeLowerThanMinimum$odeeoSdk_release$default(this.D, 0.0f, 1, null), c(), this.H);
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        PopupWindow popupWindow = new PopupWindow(frameLayoutM4610buildIconViewI42uRZk, kVar.densityPixelsToPixels(this.E.getDensityPixelsToPixelScale$odeeoSdk_release(), this.E.getSize()), kVar.densityPixelsToPixels(this.E.getDensityPixelsToPixelScale$odeeoSdk_release(), this.E.getSize()));
        popupWindow.getContentView().setSystemUiVisibility(this.E.getData$odeeoSdk_release().getWindowFlags());
        popupWindow.setTouchable(true);
        setPopupWindow$odeeoSdk_release(popupWindow);
        kVar.setPopUpWindowLayoutType(getPopupWindow$odeeoSdk_release(), 1002);
    }

    @Override // io.odeeo.sdk.AdUnitBase
    public int b() {
        return this.E.getSize();
    }

    @Override // io.odeeo.sdk.AdUnitBase
    public AdUnit.PlacementType getAdUnitType() {
        return AdUnit.PlacementType.AudioIconAd;
    }

    public final kv.a getOnPageLoaded() {
        return this.H;
    }

    public final int h() {
        return ((Number) this.I.getValue()).intValue();
    }

    public final int i() {
        return ((Number) this.J.getValue()).intValue();
    }

    public final int j() {
        return ((Number) this.K.getValue()).intValue();
    }

    @Override // io.odeeo.sdk.AdUnitBase
    public void play() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.play();
        a(this instanceof g ? AdUnit.PlacementType.RewardedAudioIconAd : AdUnit.PlacementType.AudioIconAd);
        PopupWindow popupWindow$odeeoSdk_release = getPopupWindow$odeeoSdk_release();
        if (popupWindow$odeeoSdk_release == null || popupWindow$odeeoSdk_release.isShowing()) {
            return;
        }
        io.odeeo.internal.w1.o.checkForUnsafeZones(i(), j(), b(), io.odeeo.internal.w1.o.getSafeAreaInsets$default(this.F, null, 1, null), this.F.getWidth(), this.F.getHeight());
        PopupWindow popupWindow$odeeoSdk_release2 = getPopupWindow$odeeoSdk_release();
        if (popupWindow$odeeoSdk_release2 == null) {
            return;
        }
        popupWindow$odeeoSdk_release2.showAtLocation(this.F, h(), i(), j());
    }
}
