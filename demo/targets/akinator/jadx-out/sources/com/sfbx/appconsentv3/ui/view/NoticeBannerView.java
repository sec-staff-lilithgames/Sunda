package com.sfbx.appconsentv3.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.applovin.mediation.nativeAds.a;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ViewConsentableBannerBinding;
import com.sfbx.appconsentv3.ui.util.ButtonExtsKt;
import cv.BLca.YsiBvdpw;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NoticeBannerView extends ConstraintLayout {
    private final AppconsentV3ViewConsentableBannerBinding binding;
    private OnClickButtonListener listener;
    private final o theme$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnClickButtonListener {
        void onClickSaveButton();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NoticeBannerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBannerUI$lambda$1$lambda$0(NoticeBannerView this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        OnClickButtonListener onClickButtonListener = this$0.listener;
        if (onClickButtonListener != null) {
            onClickButtonListener.onClickSaveButton();
        }
    }

    public final AppconsentV3ViewConsentableBannerBinding getBinding() {
        return this.binding;
    }

    public final AppConsentTheme getTheme$appconsent_ui_v3_prodXchangeRelease() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }

    public final void setOnClickButtonListener(OnClickButtonListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public /* synthetic */ NoticeBannerView(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void updateBannerUI() {
        AppCompatButton appCompatButton = this.binding.buttonSave;
        appCompatButton.setEnabled(true);
        e0.checkNotNullExpressionValue(appCompatButton, YsiBvdpw.HEfohsbgEwxvyMw);
        ButtonExtsKt.initButton$default(appCompatButton, getTheme$appconsent_ui_v3_prodXchangeRelease().getButtonTextColor$appconsent_ui_v3_prodXchangeRelease(), 0, getTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), 0, false, 26, null);
        appCompatButton.setOnClickListener(new a(this, 15));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.theme$delegate = q.lazy(NoticeBannerView$theme$2.INSTANCE);
        AppconsentV3ViewConsentableBannerBinding appconsentV3ViewConsentableBannerBindingInflate = AppconsentV3ViewConsentableBannerBinding.inflate(LayoutInflater.from(context), this, true);
        e0.checkNotNullExpressionValue(appconsentV3ViewConsentableBannerBindingInflate, "inflate(inflater, this, true)");
        this.binding = appconsentV3ViewConsentableBannerBindingInflate;
        appconsentV3ViewConsentableBannerBindingInflate.layoutConsentActionBanner.setBackgroundColor(getTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        appconsentV3ViewConsentableBannerBindingInflate.separator.setBackgroundColor(getTheme$appconsent_ui_v3_prodXchangeRelease().getSeparatorColor$appconsent_ui_v3_prodXchangeRelease());
        appconsentV3ViewConsentableBannerBindingInflate.buttonSave.setText(getTheme$appconsent_ui_v3_prodXchangeRelease().getButtonSaveText$appconsent_ui_v3_prodXchangeRelease());
    }
}
