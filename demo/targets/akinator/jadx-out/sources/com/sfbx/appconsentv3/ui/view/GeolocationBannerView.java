package com.sfbx.appconsentv3.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.applovin.mediation.nativeAds.a;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ViewBannerGeolocationViewBinding;
import com.sfbx.appconsentv3.ui.util.ButtonExtsKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GeolocationBannerView extends LinearLayoutCompat {
    private final AppconsentV3ViewBannerGeolocationViewBinding binding;
    private OnClickGeolocButtonListener listener;
    private final o theme$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnClickGeolocButtonListener {
        void onClickSave();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GeolocationBannerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBannerUI$lambda$1$lambda$0(GeolocationBannerView this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        OnClickGeolocButtonListener onClickGeolocButtonListener = this$0.listener;
        if (onClickGeolocButtonListener != null) {
            onClickGeolocButtonListener.onClickSave();
        }
    }

    public final void setOnClickButtonListener(OnClickGeolocButtonListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void updateBannerUI() {
        AppCompatButton updateBannerUI$lambda$1 = this.binding.geoSave;
        e0.checkNotNullExpressionValue(updateBannerUI$lambda$1, "updateBannerUI$lambda$1");
        ButtonExtsKt.initButton$default(updateBannerUI$lambda$1, getTheme().getButtonTextColor$appconsent_ui_v3_prodXchangeRelease(), 0, getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), 0, false, 26, null);
        updateBannerUI$lambda$1.setEnabled(true);
        updateBannerUI$lambda$1.setOnClickListener(new a(this, 14));
    }

    public /* synthetic */ GeolocationBannerView(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeolocationBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.theme$delegate = q.lazy(GeolocationBannerView$theme$2.INSTANCE);
        AppconsentV3ViewBannerGeolocationViewBinding appconsentV3ViewBannerGeolocationViewBindingInflate = AppconsentV3ViewBannerGeolocationViewBinding.inflate(LayoutInflater.from(context), this, true);
        e0.checkNotNullExpressionValue(appconsentV3ViewBannerGeolocationViewBindingInflate, "inflate(inflater, this, true)");
        this.binding = appconsentV3ViewBannerGeolocationViewBindingInflate;
        appconsentV3ViewBannerGeolocationViewBindingInflate.geoBanner.setBackgroundColor(getTheme().getGeoNoticeBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        appconsentV3ViewBannerGeolocationViewBindingInflate.geoSave.setText(getTheme().getButtonSaveText$appconsent_ui_v3_prodXchangeRelease());
    }
}
