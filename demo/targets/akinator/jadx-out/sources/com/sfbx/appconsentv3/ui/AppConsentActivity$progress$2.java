package com.sfbx.appconsentv3.ui;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.l;
import androidx.appcompat.app.m;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ViewProgressDialogBinding;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentActivity$progress$2 extends f0 implements a {
    final /* synthetic */ AppConsentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentActivity$progress$2(AppConsentActivity appConsentActivity) {
        super(0);
        this.this$0 = appConsentActivity;
    }

    @Override // kv.a
    public final m invoke() {
        m mVarCreate = new l(this.this$0).setView(R.layout.appconsent_v3_view_progress_dialog).setCancelable(false).create();
        AppConsentActivity appConsentActivity = this.this$0;
        mVarCreate.setCanceledOnTouchOutside(false);
        int color = m3.a.getColor(mVarCreate.getContext(), R.color.appconsent_v3_blue);
        ProgressBar progressBar = (ProgressBar) mVarCreate.findViewById(R.id.progress);
        if (progressBar != null) {
            AppconsentV3ViewProgressDialogBinding appconsentV3ViewProgressDialogBinding = appConsentActivity.viewProgressDialogBinding;
            if (appconsentV3ViewProgressDialogBinding == null) {
                e0.throwUninitializedPropertyAccessException("viewProgressDialogBinding");
                appconsentV3ViewProgressDialogBinding = null;
            }
            Drawable drawableWrap = p3.a.wrap(appconsentV3ViewProgressDialogBinding.progress.getIndeterminateDrawable());
            p3.a.setTint(drawableWrap, color);
            progressBar.setIndeterminateDrawable(drawableWrap);
        }
        TextView textView = (TextView) mVarCreate.findViewById(R.id.text_progress);
        if (textView != null) {
            textView.setText(appConsentActivity.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.progress_loading));
        }
        if (textView != null) {
            textView.setTextColor(color);
        }
        return mVarCreate;
    }
}
