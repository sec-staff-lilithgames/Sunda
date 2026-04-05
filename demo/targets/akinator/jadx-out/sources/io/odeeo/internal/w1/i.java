package io.odeeo.internal.w1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.lifecycle.b1;
import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public View f67413a;

    /* renamed from: b, reason: collision with root package name */
    public PopupWindow f67414b;

    /* renamed from: c, reason: collision with root package name */
    public kv.l f67415c = d.f67424a;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f67416d = q.lazy(e.f67425a);

    /* renamed from: e, reason: collision with root package name */
    public kv.a f67417e = f.f67426a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.w1.c f67419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.odeeo.internal.w1.c cVar) {
            super(0);
            this.f67419b = cVar;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4611invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4611invoke() {
            i.this.dismiss(AdUnit.CloseReason.UserCancel);
            this.f67419b.getFinishWithError$odeeoSdk_release().invoke(new io.odeeo.internal.b1.e(AdUnit.ERROR_STOPPED_CLOSEBTN, null, 2, null));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.a {
        public b() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4612invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4612invoke() {
            i.this.dismiss(AdUnit.CloseReason.VolumeChanged);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.sdk.c f67421a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f67422b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.w1.c f67423c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.odeeo.sdk.c cVar, i iVar, io.odeeo.internal.w1.c cVar2) {
            super(0);
            this.f67421a = cVar;
            this.f67422b = iVar;
            this.f67423c = cVar2;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4613invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4613invoke() {
            this.f67421a.setMinimRewardVolumeLevel();
            this.f67422b.dismiss(AdUnit.CloseReason.VolumeChanged);
            this.f67423c.resume$odeeoSdk_release();
            this.f67421a.resumePlayer$odeeoSdk_release();
            this.f67423c.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f67424a = new d();

        public d() {
            super(1);
        }

        public final void invoke(AdUnit.CloseReason it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AdUnit.CloseReason) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f67425a = new e();

        public e() {
            super(0);
        }

        @Override // kv.a
        public final io.odeeo.internal.j1.i invoke() {
            return OdeeoSDK.INSTANCE.getAppComponent$odeeoSdk_release().getPopUpImageController();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f67426a = new f();

        public f() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4614invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4614invoke();
            return x0.f87415a;
        }
    }

    public final io.odeeo.internal.j1.i a() {
        return (io.odeeo.internal.j1.i) this.f67416d.getValue();
    }

    public final void buildView(io.odeeo.internal.w1.c adView, io.odeeo.sdk.c audioAd) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ImageView imageView;
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(audioAd, "audioAd");
        FrameLayout frameLayout = new FrameLayout(adView.getContext());
        frameLayout.setBackground(new ColorDrawable(0));
        frameLayout.setSystemUiVisibility(adView.getData$odeeoSdk_release().getWindowFlags());
        frameLayout.setVisibility(0);
        AdUnit.PopUpType popupType = adView.getRewardedData$odeeoSdk_release().getPopupType();
        AdUnit.PopUpType popUpType = AdUnit.PopUpType.IconPopUp;
        View viewInflate = LayoutInflater.from(adView.getContext()).inflate(popupType == popUpType ? R.layout.skip_reward_btn_icon : R.layout.skip_reward_btn_banner, (ViewGroup) null, false);
        this.f67413a = viewInflate;
        e0.checkNotNull(viewInflate);
        viewInflate.setVisibility(8);
        View view = this.f67413a;
        e0.checkNotNull(view);
        o.setDebounceClickListener$default(view, 0L, new a(adView), 1, null);
        ImageView imageView2 = new ImageView(adView.getContext());
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        int iDensityPixelsToPixels = kVar.densityPixelsToPixels(adView.getDensityPixelsToPixelScale$odeeoSdk_release(), imageView2.getMinimumWidth());
        int iDensityPixelsToPixels2 = kVar.densityPixelsToPixels(adView.getDensityPixelsToPixelScale$odeeoSdk_release(), imageView2.getMinimumHeight());
        AdUnit.PopUpType popupType2 = adView.getRewardedData$odeeoSdk_release().getPopupType();
        AdUnit.PopUpType popUpType2 = AdUnit.PopUpType.BannerPopUp;
        if (popupType2 == popUpType2) {
            imageView = imageView2;
            io.odeeo.internal.j1.i iVarA = a();
            String rewardEndlevelPopup = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardEndlevelPopup();
            int i10 = R.drawable.endlevel_popup;
            WeakReference<b1> lifecycleOwner = audioAd.getViewModel$odeeoSdk_release().getLifecycleOwner();
            AdUnit.PopUpType popupType3 = adView.getRewardedData$odeeoSdk_release().getPopupType();
            e0.checkNotNull(popupType3);
            iVarA.showImage(rewardEndlevelPopup, imageView, i10, lifecycleOwner, popupType3);
            iDensityPixelsToPixels = kVar.densityPixelsToPixels(adView.getDensityPixelsToPixelScale$odeeoSdk_release(), 320);
            iDensityPixelsToPixels2 = kVar.densityPixelsToPixels(adView.getDensityPixelsToPixelScale$odeeoSdk_release(), 50);
            adView.getRewardedData$odeeoSdk_release().setXOffset(0);
            adView.getRewardedData$odeeoSdk_release().setYOffset(0);
        } else {
            imageView = imageView2;
            if (adView.getRewardedData$odeeoSdk_release().getPopupType() == popUpType) {
                io.odeeo.internal.j1.i iVarA2 = a();
                String rewardInlevelPopup = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardInlevelPopup();
                int i11 = R.drawable.icon_popup_bckg;
                WeakReference<b1> lifecycleOwner2 = audioAd.getViewModel$odeeoSdk_release().getLifecycleOwner();
                AdUnit.PopUpType popupType4 = adView.getRewardedData$odeeoSdk_release().getPopupType();
                e0.checkNotNull(popupType4);
                iVarA2.showImage(rewardInlevelPopup, imageView, i11, lifecycleOwner2, popupType4);
                iDensityPixelsToPixels = kVar.densityPixelsToPixels(adView.getDensityPixelsToPixelScale$odeeoSdk_release(), AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
                iDensityPixelsToPixels2 = kVar.densityPixelsToPixels(adView.getDensityPixelsToPixelScale$odeeoSdk_release(), AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
            }
        }
        this.f67417e = new b();
        ImageView imageView3 = imageView;
        o.setDebounceClickListener$default(imageView3, 0L, new c(audioAd, this, adView), 1, null);
        frameLayout.addView(imageView3);
        frameLayout.addView(this.f67413a, new FrameLayout.LayoutParams(-2, adView.getRewardedData$odeeoSdk_release().getPopupType() == popUpType2 ? -1 : -2, 5));
        PopupWindow popupWindow = new PopupWindow(frameLayout, iDensityPixelsToPixels, iDensityPixelsToPixels2);
        this.f67414b = popupWindow;
        View contentView = popupWindow.getContentView();
        if (contentView != null) {
            contentView.setSystemUiVisibility(adView.getData$odeeoSdk_release().getWindowFlags());
        }
        kVar.setPopUpWindowLayoutType(this.f67414b, 1002);
        PopupWindow popupWindow2 = this.f67414b;
        if (popupWindow2 == null) {
            return;
        }
        popupWindow2.setTouchable(true);
    }

    public final void dismiss(AdUnit.CloseReason closeReason) {
        e0.checkNotNullParameter(closeReason, "closeReason");
        if (e0.areEqual(isShowing(), Boolean.TRUE)) {
            this.f67415c.invoke(closeReason);
        }
        PopupWindow popupWindow = this.f67414b;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public final kv.l getDismissed$odeeoSdk_release() {
        return this.f67415c;
    }

    public final kv.a getOnClose() {
        return this.f67417e;
    }

    public final PopupWindow getPopUp$odeeoSdk_release() {
        return this.f67414b;
    }

    public final View getSkipBtn$odeeoSdk_release() {
        return this.f67413a;
    }

    public final int getXPopupOffset$odeeoSdk_release(io.odeeo.internal.w1.c adView, Context context) {
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(context, "context");
        return io.odeeo.internal.v1.l.dpToPx(adView.getRewardedData$odeeoSdk_release().isPositionSet() ? adView.getRewardedData$odeeoSdk_release().getXOffset() : adView.getData$odeeoSdk_release().getX(), context);
    }

    public final int getYPopupOffset$odeeoSdk_release(io.odeeo.internal.w1.c adView, Context context) {
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(context, "context");
        return io.odeeo.internal.v1.l.dpToPx(adView.getRewardedData$odeeoSdk_release().isPositionSet() ? adView.getRewardedData$odeeoSdk_release().getYOffset() : adView.getData$odeeoSdk_release().getY(), context);
    }

    public final Boolean isShowing() {
        PopupWindow popupWindow = this.f67414b;
        if (popupWindow == null) {
            return null;
        }
        return Boolean.valueOf(popupWindow.isShowing());
    }

    public final void setDismissed$odeeoSdk_release(kv.l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.f67415c = lVar;
    }

    public final void setOnClose(kv.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f67417e = aVar;
    }

    public final void setPopUp$odeeoSdk_release(PopupWindow popupWindow) {
        this.f67414b = popupWindow;
    }

    public final void setSkipBtn$odeeoSdk_release(View view) {
        this.f67413a = view;
    }

    public final void show(boolean z10, io.odeeo.internal.w1.c adView, View rootView, int i10) {
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(rootView, "rootView");
        View view = this.f67413a;
        if (view != null) {
            view.setVisibility(!z10 ? 0 : 8);
        }
        PopupWindow popupWindow = this.f67414b;
        if (popupWindow == null) {
            return;
        }
        Context context = rootView.getContext();
        e0.checkNotNullExpressionValue(context, "rootView.context");
        int xPopupOffset$odeeoSdk_release = getXPopupOffset$odeeoSdk_release(adView, context);
        Context context2 = rootView.getContext();
        e0.checkNotNullExpressionValue(context2, "rootView.context");
        popupWindow.showAtLocation(rootView, i10, xPopupOffset$odeeoSdk_release, getYPopupOffset$odeeoSdk_release(adView, context2));
    }
}
