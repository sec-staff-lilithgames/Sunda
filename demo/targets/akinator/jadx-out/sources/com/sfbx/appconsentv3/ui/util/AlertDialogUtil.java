package com.sfbx.appconsentv3.ui.util;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.l;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AlertDialogUtil {
    public static final AlertDialogUtil INSTANCE = new AlertDialogUtil();

    private AlertDialogUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildAlertDialog$lambda$4$lambda$3$lambda$2(m dialog, View view) {
        e0.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static /* synthetic */ m buildQrCode$appconsent_ui_v3_prodXchangeRelease$default(AlertDialogUtil alertDialogUtil, Context context, AppConsentTheme appConsentTheme, String str, String str2, Bitmap bitmap, kv.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return alertDialogUtil.buildQrCode$appconsent_ui_v3_prodXchangeRelease(context, appConsentTheme, str, str2, bitmap, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildQrCode$lambda$16$lambda$15$lambda$14(m dialog, View view) {
        e0.checkNotNullParameter(dialog, "$dialog");
        dialog.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildQrCode$lambda$16$lambda$5(m dialog, Context context, DialogInterface dialogInterface) {
        e0.checkNotNullParameter(dialog, "$dialog");
        e0.checkNotNullParameter(context, "$context");
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.9d);
            window.setAttributes(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildQrCode$lambda$16$lambda$6(kv.a onCancelListener, DialogInterface dialogInterface) {
        e0.checkNotNullParameter(onCancelListener, "$onCancelListener");
        onCancelListener.invoke();
    }

    public final m buildAlertDialog$appconsent_ui_v3_prodXchangeRelease(Context context, AppConsentTheme appConsentTheme, String title) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(appConsentTheme, "appConsentTheme");
        e0.checkNotNullParameter(title, "title");
        try {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.appconsent_v3_view_basic_dialog, (ViewGroup) null);
            m mVarCreate = new l(context).setView(viewInflate).create();
            e0.checkNotNullExpressionValue(mVarCreate, "this");
            mVarCreate.setCancelable(true);
            View viewFindViewById = viewInflate.findViewById(R.id.basic_dialog_container);
            if (viewFindViewById != null) {
                e0.checkNotNullExpressionValue(viewFindViewById, "findViewById<View>(R.id.basic_dialog_container)");
                viewFindViewById.setBackgroundColor(appConsentTheme.getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R.id.basic_dialog_message);
            if (appCompatTextView != null) {
                e0.checkNotNullExpressionValue(appCompatTextView, "findViewById<AppCompatTe….id.basic_dialog_message)");
                appCompatTextView.setText(title);
                appCompatTextView.setTextColor(appConsentTheme.getTextColor$appconsent_ui_v3_prodXchangeRelease());
            }
            AppCompatButton appCompatButton = (AppCompatButton) viewInflate.findViewById(R.id.basic_dialog_close_button);
            if (appCompatButton != null) {
                e0.checkNotNullExpressionValue(appCompatButton, "findViewById<AppCompatBu…asic_dialog_close_button)");
                appCompatButton.setText(appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_details_dialog_close_button));
                ButtonExtsKt.initSettingButton$default(appCompatButton, appConsentTheme.getButtonTextColor$appconsent_ui_v3_prodXchangeRelease(), appConsentTheme.getButtonBorderColor$appconsent_ui_v3_prodXchangeRelease(), 0, 4, null);
                appCompatButton.setOnClickListener(new a(mVarCreate, 0));
            }
            return mVarCreate;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final m buildQrCode$appconsent_ui_v3_prodXchangeRelease(final Context context, AppConsentTheme appConsentTheme, String str, String str2, Bitmap qrCode, final kv.a onCancelListener) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(appConsentTheme, "appConsentTheme");
        e0.checkNotNullParameter(qrCode, "qrCode");
        e0.checkNotNullParameter(onCancelListener, "onCancelListener");
        try {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.appconsent_v3_view_alert_qrcode, (ViewGroup) null);
            final m mVarCreate = new l(context).setView(viewInflate).create();
            e0.checkNotNullExpressionValue(mVarCreate, "this");
            mVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sfbx.appconsentv3.ui.util.b
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    AlertDialogUtil.buildQrCode$lambda$16$lambda$5(mVarCreate, context, dialogInterface);
                }
            });
            mVarCreate.setCanceledOnTouchOutside(true);
            mVarCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sfbx.appconsentv3.ui.util.c
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AlertDialogUtil.buildQrCode$lambda$16$lambda$6(onCancelListener, dialogInterface);
                }
            });
            View viewFindViewById = viewInflate.findViewById(R.id.alert_qrcode_container);
            if (viewFindViewById != null) {
                e0.checkNotNullExpressionValue(viewFindViewById, "findViewById<View>(R.id.alert_qrcode_container)");
                viewFindViewById.setBackgroundColor(appConsentTheme.getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R.id.alert_qrcode_title);
            if (appCompatTextView != null) {
                e0.checkNotNullExpressionValue(appCompatTextView, "findViewById<AppCompatTe…(R.id.alert_qrcode_title)");
                if (str != null) {
                    appCompatTextView.setText(str);
                }
                appCompatTextView.setTextColor(appConsentTheme.getTextColor$appconsent_ui_v3_prodXchangeRelease());
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewInflate.findViewById(R.id.alert_qrcode_description);
            if (appCompatTextView2 != null) {
                e0.checkNotNullExpressionValue(appCompatTextView2, "findViewById<AppCompatTe…alert_qrcode_description)");
                if (str2 != null) {
                    appCompatTextView2.setText(str2);
                }
                appCompatTextView2.setTextColor(appConsentTheme.getTextColor$appconsent_ui_v3_prodXchangeRelease());
            }
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewInflate.findViewById(R.id.alert_qrcode_help);
            if (appCompatTextView3 != null) {
                e0.checkNotNullExpressionValue(appCompatTextView3, "findViewById<AppCompatTe…>(R.id.alert_qrcode_help)");
                appCompatTextView3.setText(appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_v3_qr_code_open_camera_and_point_at_code));
                appCompatTextView3.setTextColor(appConsentTheme.getTextColor$appconsent_ui_v3_prodXchangeRelease());
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.alert_qrcode_image);
            if (appCompatImageView != null) {
                e0.checkNotNullExpressionValue(appCompatImageView, "findViewById<AppCompatIm…(R.id.alert_qrcode_image)");
                appCompatImageView.setImageBitmap(qrCode);
                appCompatImageView.setContentDescription(appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_v3_qr_code_to_visit_url_website));
            }
            AppCompatButton appCompatButton = (AppCompatButton) viewInflate.findViewById(R.id.alert_qrcode_close_button);
            if (appCompatButton != null) {
                e0.checkNotNullExpressionValue(appCompatButton, "findViewById<AppCompatBu…lert_qrcode_close_button)");
                appCompatButton.setText(appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_details_dialog_close_button));
                ButtonExtsKt.initSettingButton$default(appCompatButton, appConsentTheme.getButtonTextColor$appconsent_ui_v3_prodXchangeRelease(), appConsentTheme.getButtonBorderColor$appconsent_ui_v3_prodXchangeRelease(), 0, 4, null);
                appCompatButton.setOnClickListener(new a(mVarCreate, 1));
            }
            return mVarCreate;
        } catch (Throwable unused) {
            return null;
        }
    }
}
