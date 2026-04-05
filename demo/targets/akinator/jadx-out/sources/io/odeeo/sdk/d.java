package io.odeeo.sdk;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.PopupWindow;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.domain.PlacementId;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d extends AdUnitBase {
    public final io.odeeo.internal.z0.f C;
    public final c D;
    public final io.odeeo.internal.w1.b E;
    public final View F;
    public final io.odeeo.internal.o1.e G;
    public final kv.a H;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f68076a = new a();

        public a() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4629invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4629invoke();
            return x0.f87415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.odeeo.internal.z0.f viewModel, c audioAdEntity, io.odeeo.internal.w1.b adView, AdActivity adActivity, View rootView, String placementId, String transactionId, io.odeeo.internal.o1.e eventTrackingManager, kv.a onPageLoaded) {
        super(viewModel, audioAdEntity, adView, adActivity, rootView, PlacementId.m4631constructorimpl(placementId), transactionId, null, eventTrackingManager, 128, null);
        e0.checkNotNullParameter(viewModel, "viewModel");
        e0.checkNotNullParameter(audioAdEntity, "audioAdEntity");
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(rootView, "rootView");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(transactionId, "transactionId");
        e0.checkNotNullParameter(eventTrackingManager, "eventTrackingManager");
        e0.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        this.C = viewModel;
        this.D = audioAdEntity;
        this.E = adView;
        this.F = rootView;
        this.G = eventTrackingManager;
        this.H = onPageLoaded;
        if (adView.getData$odeeoSdk_release().getActionType() == AdUnit.ActionButtonType.Close) {
            adView.getData$odeeoSdk_release().setActionType(AdUnit.ActionButtonType.None);
        }
    }

    public final void a(kv.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iDpToPx = io.odeeo.internal.v1.l.dpToPx(320, this.E.getContext());
        int iDpToPx2 = io.odeeo.internal.v1.l.dpToPx(50, this.E.getContext());
        io.odeeo.internal.b2.a.i(w0.i.a(iDpToPx, iDpToPx2, "prepareBanner width: 320 height: 50 popUpWindowWidth: ", " popUpWindowHeight: "), new Object[0]);
        if (!this.E.getData$odeeoSdk_release().getShouldUsePopup()) {
            io.odeeo.internal.b2.a.d("prepareBanner shouldUsePopup false", new Object[0]);
            setPopupWindow$odeeoSdk_release(null);
            return;
        }
        io.odeeo.internal.b2.a.d("prepareBanner shouldUsePopup", new Object[0]);
        setPopupWindow$odeeoSdk_release(new PopupWindow(this.E.m4605buildBannerI42uRZk(this.C.getAdInfo(), this, getAdUnitType(), c.isVolumeLowerThanMinimum$odeeoSdk_release$default(this.D, 0.0f, 1, null), c(), aVar), iDpToPx, iDpToPx2));
        PopupWindow popupWindow$odeeoSdk_release = getPopupWindow$odeeoSdk_release();
        View contentView = popupWindow$odeeoSdk_release != null ? popupWindow$odeeoSdk_release.getContentView() : null;
        if (contentView != null) {
            contentView.setSystemUiVisibility(this.E.getData$odeeoSdk_release().getWindowFlags());
        }
        io.odeeo.internal.v1.k.f67283a.setPopUpWindowLayoutType(getPopupWindow$odeeoSdk_release(), 1002);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setAlpha(0);
        PopupWindow popupWindow$odeeoSdk_release2 = getPopupWindow$odeeoSdk_release();
        if (popupWindow$odeeoSdk_release2 != null) {
            popupWindow$odeeoSdk_release2.setBackgroundDrawable(gradientDrawable);
        }
        PopupWindow popupWindow$odeeoSdk_release3 = getPopupWindow$odeeoSdk_release();
        if (popupWindow$odeeoSdk_release3 != null) {
            popupWindow$odeeoSdk_release3.setTouchable(true);
        }
        PopupWindow popupWindow$odeeoSdk_release4 = getPopupWindow$odeeoSdk_release();
        if (popupWindow$odeeoSdk_release4 == null) {
            return;
        }
        popupWindow$odeeoSdk_release4.update();
    }

    @Override // io.odeeo.sdk.AdUnitBase
    public AdUnit.PlacementType getAdUnitType() {
        return AdUnit.PlacementType.AudioBannerAd;
    }

    public final View getBannerView() {
        return this.E.m4605buildBannerI42uRZk(this.C.getAdInfo(), this, getAdUnitType(), c.isVolumeLowerThanMinimum$odeeoSdk_release$default(this.D, 0.0f, 1, null), c(), a.f68076a);
    }

    @Override // io.odeeo.sdk.AdUnitBase
    public void play() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        PopupWindow popupWindow$odeeoSdk_release;
        super.play();
        a(this.H);
        PopupWindow popupWindow$odeeoSdk_release2 = getPopupWindow$odeeoSdk_release();
        if (popupWindow$odeeoSdk_release2 == null || popupWindow$odeeoSdk_release2.isShowing() || (popupWindow$odeeoSdk_release = getPopupWindow$odeeoSdk_release()) == null) {
            return;
        }
        popupWindow$odeeoSdk_release.showAtLocation(this.F, AdUnit.Companion.positionToGravity(this.E.getData$odeeoSdk_release().getPos()), 0, 0);
    }
}
