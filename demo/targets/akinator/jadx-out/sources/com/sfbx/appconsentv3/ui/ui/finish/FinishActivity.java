package com.sfbx.appconsentv3.ui.ui.finish;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.applovin.mediation.nativeAds.a;
import com.bumptech.glide.c;
import com.bumptech.glide.q;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityFinishBinding;
import com.sfbx.appconsentv3.ui.util.ButtonExtsKt;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;
import v3.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FinishActivity extends AppConsentActivity {
    public static final Companion Companion = new Companion(null);
    private AppconsentV3ActivityFinishBinding binding;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getStartIntent(Context context) {
            e0.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) FinishActivity.class);
        }

        private Companion() {
        }
    }

    public FinishActivity() {
        super(true);
    }

    public static final Intent getStartIntent(Context context) {
        return Companion.getStartIntent(context);
    }

    private final void initPicture() throws Resources.NotFoundException {
        int iDpToPx;
        ConstraintLayout.a aVar = new ConstraintLayout.a(-1, -1);
        try {
            iDpToPx = getResources().getDimensionPixelSize(R.dimen.appconsent_v3_margin_large);
        } catch (Exception unused) {
            iDpToPx = ExtensionKt.dpToPx(24.0f, this);
        }
        aVar.setMargins(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding = this.binding;
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding2 = null;
        if (appconsentV3ActivityFinishBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding = null;
        }
        appconsentV3ActivityFinishBinding.successContainer.setLayoutParams(aVar);
        String illustrationSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getIllustrationSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease();
        if (illustrationSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease != null) {
            q qVarLoad = c.with((FragmentActivity) this).load(illustrationSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease);
            AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding3 = this.binding;
            if (appconsentV3ActivityFinishBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityFinishBinding3 = null;
            }
            qVarLoad.into(appconsentV3ActivityFinishBinding3.succesIllustration);
            AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding4 = this.binding;
            if (appconsentV3ActivityFinishBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityFinishBinding2 = appconsentV3ActivityFinishBinding4;
            }
            AppCompatImageView appCompatImageView = appconsentV3ActivityFinishBinding2.succesIllustration;
            e0.checkNotNullExpressionValue(appCompatImageView, "binding.succesIllustration");
            appCompatImageView.setVisibility(0);
        }
    }

    private final void initUI() throws Resources.NotFoundException {
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getEnableIllustrations$appconsent_ui_v3_prodXchangeRelease()) {
            initPicture();
        }
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding = this.binding;
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding2 = null;
        if (appconsentV3ActivityFinishBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding = null;
        }
        appconsentV3ActivityFinishBinding.successContainer.getBackground().setColorFilter(new PorterDuffColorFilter(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), PorterDuff.Mode.SRC));
        String noticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease();
        if (noticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease != null && !n0.isBlank(noticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease)) {
            try {
                q qVar = (q) c.with((FragmentActivity) this).load(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease()).error(R.drawable.appconsent_v3_ic_finish_success);
                AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding3 = this.binding;
                if (appconsentV3ActivityFinishBinding3 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityFinishBinding3 = null;
                }
                qVar.into(appconsentV3ActivityFinishBinding3.imageSuccess);
                AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding4 = this.binding;
                if (appconsentV3ActivityFinishBinding4 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityFinishBinding4 = null;
                }
                appconsentV3ActivityFinishBinding4.imageSuccess.setVisibility(0);
            } catch (Throwable unused) {
                AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding5 = this.binding;
                if (appconsentV3ActivityFinishBinding5 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityFinishBinding5 = null;
                }
                appconsentV3ActivityFinishBinding5.imageSuccess.setVisibility(4);
            }
        } else if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeSuccessImage$appconsent_ui_v3_prodXchangeRelease() != null) {
            AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding6 = this.binding;
            if (appconsentV3ActivityFinishBinding6 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityFinishBinding6 = null;
            }
            appconsentV3ActivityFinishBinding6.imageSuccess.setImageDrawable(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getNoticeSuccessImage$appconsent_ui_v3_prodXchangeRelease());
            AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding7 = this.binding;
            if (appconsentV3ActivityFinishBinding7 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityFinishBinding7 = null;
            }
            appconsentV3ActivityFinishBinding7.imageSuccess.setVisibility(0);
        } else {
            try {
                AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding8 = this.binding;
                if (appconsentV3ActivityFinishBinding8 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityFinishBinding8 = null;
                }
                appconsentV3ActivityFinishBinding8.imageSuccess.setImageResource(R.drawable.appconsent_v3_ic_finish_success);
                AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding9 = this.binding;
                if (appconsentV3ActivityFinishBinding9 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityFinishBinding9 = null;
                }
                appconsentV3ActivityFinishBinding9.imageSuccess.setVisibility(0);
            } catch (Throwable unused2) {
                AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding10 = this.binding;
                if (appconsentV3ActivityFinishBinding10 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityFinishBinding10 = null;
                }
                appconsentV3ActivityFinishBinding10.imageSuccess.setVisibility(4);
            }
        }
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding11 = this.binding;
        if (appconsentV3ActivityFinishBinding11 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding11 = null;
        }
        AppCompatButton initUI$lambda$2 = appconsentV3ActivityFinishBinding11.buttonClose;
        initUI$lambda$2.setText(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonClose$appconsent_ui_v3_prodXchangeRelease());
        initUI$lambda$2.setOnClickListener(new a(this, 20));
        e0.checkNotNullExpressionValue(initUI$lambda$2, "initUI$lambda$2");
        ButtonExtsKt.initButton$default(initUI$lambda$2, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonTextColor$appconsent_ui_v3_prodXchangeRelease(), 0, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), 0, false, 26, null);
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding12 = this.binding;
        if (appconsentV3ActivityFinishBinding12 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding12 = null;
        }
        appconsentV3ActivityFinishBinding12.textCongrats.setText(d.fromHtml(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getFinishTitleText$appconsent_ui_v3_prodXchangeRelease(), 63));
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding13 = this.binding;
        if (appconsentV3ActivityFinishBinding13 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding13 = null;
        }
        appconsentV3ActivityFinishBinding13.textDescription.setText(d.fromHtml(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getFinishDescriptionText$appconsent_ui_v3_prodXchangeRelease(), 63));
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding14 = this.binding;
        if (appconsentV3ActivityFinishBinding14 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding14 = null;
        }
        appconsentV3ActivityFinishBinding14.textSubtitle.setText(d.fromHtml(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getFinishSubtitleText$appconsent_ui_v3_prodXchangeRelease(), 63));
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding15 = this.binding;
        if (appconsentV3ActivityFinishBinding15 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding15 = null;
        }
        appconsentV3ActivityFinishBinding15.textCongrats.setMovementMethod(LinkMovementMethod.getInstance());
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding16 = this.binding;
        if (appconsentV3ActivityFinishBinding16 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding16 = null;
        }
        appconsentV3ActivityFinishBinding16.textDescription.setMovementMethod(LinkMovementMethod.getInstance());
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding17 = this.binding;
        if (appconsentV3ActivityFinishBinding17 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding17 = null;
        }
        appconsentV3ActivityFinishBinding17.textSubtitle.setMovementMethod(LinkMovementMethod.getInstance());
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding18 = this.binding;
        if (appconsentV3ActivityFinishBinding18 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding18 = null;
        }
        appconsentV3ActivityFinishBinding18.textCongrats.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding19 = this.binding;
        if (appconsentV3ActivityFinishBinding19 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBinding19 = null;
        }
        appconsentV3ActivityFinishBinding19.textDescription.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding20 = this.binding;
        if (appconsentV3ActivityFinishBinding20 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityFinishBinding2 = appconsentV3ActivityFinishBinding20;
        }
        appconsentV3ActivityFinishBinding2.textSubtitle.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUI$lambda$2$lambda$1(FinishActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBindingInflate = AppconsentV3ActivityFinishBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityFinishBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityFinishBindingInflate;
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding = null;
        if (appconsentV3ActivityFinishBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityFinishBindingInflate = null;
        }
        ConstraintLayout root = appconsentV3ActivityFinishBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromFinishActivity(root);
        AppconsentV3ActivityFinishBinding appconsentV3ActivityFinishBinding2 = this.binding;
        if (appconsentV3ActivityFinishBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityFinishBinding = appconsentV3ActivityFinishBinding2;
        }
        appconsentV3ActivityFinishBinding.intLayout.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        if (getSupportActionBar() != null) {
            androidx.appcompat.app.a supportActionBar = getSupportActionBar();
            e0.checkNotNull(supportActionBar);
            supportActionBar.hide();
        }
        initUI();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
