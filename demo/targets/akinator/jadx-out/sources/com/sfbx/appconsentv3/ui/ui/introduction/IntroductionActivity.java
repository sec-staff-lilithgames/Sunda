package com.sfbx.appconsentv3.ui.ui.introduction;

import af.g;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.i3;
import androidx.lifecycle.u1;
import av.e;
import bv.f;
import bv.n;
import com.bumptech.glide.c;
import com.bumptech.glide.q;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityIntroductionBinding;
import com.sfbx.appconsentv3.ui.model.BannerOrder;
import com.sfbx.appconsentv3.ui.model.QrCodeData;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.components.widget.ACUnorderedCategoryListWidget;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeActivity;
import com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.util.ButtonExtsKt;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.SfbxIABWebViewThrowable;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import i.d;
import io.sfbx.appconsent.logger.ACLogger;
import io.sfbx.appconsent.logger.ACLoggerContract;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kv.l;
import kv.p;
import sv.n0;
import tu.a0;
import tu.k;
import tu.o;
import tu.x0;
import tu.z;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IntroductionActivity extends AppConsentActivity {
    public static final Companion Companion = new Companion(null);
    public static final String FULL_SCREEN_MODE = "FULL_SCREEN_MODE";
    public static final String IS_DISPLAY_EVENT_ALREADY_SENT = "IS_DISPLAY_EVENT_ALREADY_SENT";
    public static final String IS_NEED_TO_DISPLAY_BUTTONS_VERTICALLY = "is_need_to_display_buttons_vertically";
    public static final String IS_NEED_TO_DISPLAY_QRCODE = "is_need_to_display_qrcode";
    private boolean _isDisplayEventAlreadySent;
    private final u1 acceptRefuseAllObserver;
    private AppconsentV3ActivityIntroductionBinding binding;
    private boolean isNeedToDisplayButtonsAtVertical;
    private boolean isNeedToDisplayQrCodes;
    private Job jobQrCode;
    private final o mViewModel$delegate;
    private m qrCodeDialog;
    private final d startForResult;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ Intent getStartIntent$default(Companion companion, Context context, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z12 = false;
            }
            return companion.getStartIntent(context, z10, z11, z12);
        }

        public final Intent getStartIntent(Context context, boolean z10, boolean z11, boolean z12) {
            e0.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) IntroductionActivity.class);
            intent.putExtra(IntroductionActivity.FULL_SCREEN_MODE, z10);
            intent.putExtra(IntroductionActivity.IS_NEED_TO_DISPLAY_BUTTONS_VERTICALLY, z11);
            intent.putExtra(IntroductionActivity.IS_NEED_TO_DISPLAY_QRCODE, z12);
            return intent;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$checkIfUsageExampleNeedToBeDisplayed$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Boolean>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Boolean> response) {
            if ((response instanceof Response.Success) && true == ((Boolean) ((Response.Success) response).getData()).booleanValue()) {
                IntroductionActivity.this.initBannerExampleUsage();
            } else {
                IntroductionActivity.this.hideBannerExampleUsage();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$checkIfUsageExampleNeedToBeDisplayed$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI> response) {
            if (response instanceof Response.Success) {
                AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = IntroductionActivity.this.binding;
                if (appconsentV3ActivityIntroductionBinding == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityIntroductionBinding = null;
                }
                appconsentV3ActivityIntroductionBinding.introductionActivityAcUnorderedListWidget.refreshViewAndAddCategory((ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI) ((Response.Success) response).getData());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$checkIfUsageExampleNeedToBeDisplayed$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI> response) {
            if (response instanceof Response.Success) {
                AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = IntroductionActivity.this.binding;
                if (appconsentV3ActivityIntroductionBinding == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityIntroductionBinding = null;
                }
                appconsentV3ActivityIntroductionBinding.introductionActivityAcUnorderedListWidget.refreshViewAndAddCategory((ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI) ((Response.Success) response).getData());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$checkIfUsageExampleNeedToBeDisplayed$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f0 implements l {
        public AnonymousClass4() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI> response) {
            if (response instanceof Response.Success) {
                AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = IntroductionActivity.this.binding;
                if (appconsentV3ActivityIntroductionBinding == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityIntroductionBinding = null;
                }
                appconsentV3ActivityIntroductionBinding.introductionActivityAcUnorderedListWidget.refreshViewAndAddCategory((ACUnorderedCategoryListWidget.ACUnorderedCategoryListWidgetUI.CategoryUI) ((Response.Success) response).getData());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$onStart$1", f = "IntroductionActivity.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$onStart$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37121 extends n implements p {
        int label;

        public C37121(zu.d<? super C37121> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return IntroductionActivity.this.new C37121(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                SharedFlow<Response<QrCodeData>> qrCode = IntroductionActivity.this.getMViewModel().getQrCode();
                final IntroductionActivity introductionActivity = IntroductionActivity.this;
                FlowCollector<? super Response<QrCodeData>> flowCollector = new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity.onStart.1.1

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C05221 extends f0 implements kv.a {
                        final /* synthetic */ IntroductionActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C05221(IntroductionActivity introductionActivity) {
                            super(0);
                            this.this$0 = introductionActivity;
                        }

                        @Override // kv.a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3470invoke();
                            return x0.f87415a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m3470invoke() {
                            ACLogger aCLogger = ACLogger.INSTANCE;
                            ACLoggerContract.DefaultImpls.d$default(aCLogger, "IntroductionActivity", "QR code onCanceled Called", null, 4, null);
                            if (this.this$0.qrCodeDialog != null) {
                                m mVar = this.this$0.qrCodeDialog;
                                if (mVar != null) {
                                    mVar.dismiss();
                                }
                                ACLoggerContract.DefaultImpls.d$default(aCLogger, "IntroductionActivity", "qrcode dialog dismissed", null, 4, null);
                                this.this$0.qrCodeDialog = null;
                                this.this$0.getMViewModel().qrCodeDismissed();
                            }
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, zu.d dVar) {
                        return emit((Response<QrCodeData>) obj2, (zu.d<? super x0>) dVar);
                    }

                    public final Object emit(Response<QrCodeData> response, zu.d<? super x0> dVar) {
                        if (response instanceof Response.Success) {
                            AlertDialogUtil alertDialogUtil = AlertDialogUtil.INSTANCE;
                            IntroductionActivity introductionActivity2 = introductionActivity;
                            Response.Success success = (Response.Success) response;
                            m mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease = alertDialogUtil.buildQrCode$appconsent_ui_v3_prodXchangeRelease(introductionActivity2, introductionActivity2.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease(), ((QrCodeData) success.getData()).getTitle(), ((QrCodeData) success.getData()).getDescription(), ((QrCodeData) success.getData()).getQrCode(), new C05221(introductionActivity));
                            if (mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease != null) {
                                IntroductionActivity introductionActivity3 = introductionActivity;
                                if (introductionActivity3.qrCodeDialog != null) {
                                    m mVar = introductionActivity3.qrCodeDialog;
                                    if (mVar != null) {
                                        mVar.dismiss();
                                    }
                                    introductionActivity3.qrCodeDialog = null;
                                }
                                introductionActivity3.qrCodeDialog = mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease;
                                mVarBuildQrCode$appconsent_ui_v3_prodXchangeRelease.show();
                            }
                            introductionActivity.getMViewModel().qrCodePopupDisplayed();
                        } else if (response instanceof Response.Error) {
                            IntroductionActivity introductionActivity4 = introductionActivity;
                            Toast.makeText(introductionActivity4, introductionActivity4.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_v3_qr_code_error_loading), 0).show();
                            m mVar2 = introductionActivity.qrCodeDialog;
                            if (mVar2 != null) {
                                mVar2.dismiss();
                            }
                            introductionActivity.qrCodeDialog = null;
                            introductionActivity.getMViewModel().qrCodeDismissed();
                        }
                        return x0.f87415a;
                    }
                };
                this.label = 1;
                if (qrCode.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C37121) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public IntroductionActivity() {
        super(true);
        this.mViewModel$delegate = new i3(c1.getOrCreateKotlinClass(IntroductionViewModel.class), new IntroductionActivity$special$$inlined$viewModels$2(this), new IntroductionActivity$mViewModel$2(this));
        this.acceptRefuseAllObserver = new com.sfbx.appconsentv3.ui.ui.geolocation.a(this, 1);
        d dVarRegisterForActivityResult = registerForActivityResult(new j.d(), new g(this, 15));
        e0.checkNotNullExpressionValue(dVarRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.startForResult = dVarRegisterForActivityResult;
    }

    private final void acceptAll() {
        getMViewModel().sendAcceptAllTrackingEvent();
        getMViewModel().acceptAll(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptRefuseAllObserver$lambda$0(IntroductionActivity this$0, Response response) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (response instanceof Response.Success) {
            this$0.displaySpinner(false);
            this$0.finish();
            return;
        }
        if (!(response instanceof Response.Error)) {
            if (response instanceof Response.Loading) {
                AppConsentActivity.displaySpinner$default(this$0, false, 1, null);
                return;
            }
            return;
        }
        this$0.displaySpinner(false);
        ACLogger aCLogger = ACLogger.INSTANCE;
        Response.Error error = (Response.Error) response;
        aCLogger.e("IntroductionActivity", error.getError());
        if ((error.getError().getCause() instanceof SfbxIABWebViewThrowable) || (error.getError() instanceof NoSuchElementException)) {
            ACLoggerContract.DefaultImpls.e$default(aCLogger, "IntroductionActivity", "Your WebView system component is unable to parse the IAB script", null, 4, null);
            ACLoggerContract.DefaultImpls.e$default(aCLogger, "IntroductionActivity", "The cmp will close", null, 4, null);
            this$0.finish();
        }
    }

    private final void checkIfUsageExampleNeedToBeDisplayed() {
        if (!getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().isNeedToDisplayUsageExampleOnLayer1$appconsent_ui_v3_prodXchangeRelease()) {
            hideBannerExampleUsage();
            return;
        }
        getMViewModel().getExamplesUsageMutableLiveData().observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(7, new AnonymousClass1()));
        getMViewModel().getExamplesUsageOfDataMutableLiveData().observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(8, new AnonymousClass2()));
        getMViewModel().getExamplesTechnicalCollectionsMutableLiveData().observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(9, new AnonymousClass3()));
        getMViewModel().getExamplesDedicatedUsageLiveData().observe(this, new com.sfbx.appconsentv3.ui.ui.consentable.detail.a(10, new AnonymousClass4()));
        getMViewModel().buildExamplesUsageText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIfUsageExampleNeedToBeDisplayed$lambda$3(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIfUsageExampleNeedToBeDisplayed$lambda$4(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIfUsageExampleNeedToBeDisplayed$lambda$5(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIfUsageExampleNeedToBeDisplayed$lambda$6(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void clickOnExamplesOfUsage(AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding) {
        ACUnorderedCategoryListWidget aCUnorderedCategoryListWidget = appconsentV3ActivityIntroductionBinding.introductionActivityAcUnorderedListWidget;
        aCUnorderedCategoryListWidget.setVisibility(aCUnorderedCategoryListWidget.getVisibility() == 0 ? 8 : 0);
        appconsentV3ActivityIntroductionBinding.introductionActivityImageConsentablesApplicationExample.animate().rotationBy(180.0f).setDuration(100L).start();
    }

    public static /* synthetic */ void getMViewModel$annotations() {
    }

    public static final Intent getStartIntent(Context context, boolean z10, boolean z11, boolean z12) {
        return Companion.getStartIntent(context, z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideBannerExampleUsage() {
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = null;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        AppCompatTextView appCompatTextView = appconsentV3ActivityIntroductionBinding.introductionActivityTextConsentableDetailSeeMore;
        appCompatTextView.setVisibility(8);
        appCompatTextView.setText("");
        appCompatTextView.setOnClickListener(null);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
        if (appconsentV3ActivityIntroductionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding3 = null;
        }
        ImageView imageView = appconsentV3ActivityIntroductionBinding3.introductionActivityImageConsentablesApplicationExample;
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
        if (appconsentV3ActivityIntroductionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding4;
        }
        appconsentV3ActivityIntroductionBinding2.introductionActivityAcUnorderedListWidget.setVisibility(8);
    }

    private final void initAcceptAllButton(AppCompatButton appCompatButton) {
        ButtonExtsKt.initButton$default(appCompatButton, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getAcceptAllButtonText$appconsent_ui_v3_prodXchangeRelease(), 0, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getAcceptAllButtonBackground$appconsent_ui_v3_prodXchangeRelease(), 0, false, 26, null);
        ButtonExtsKt.setButtonValues(appCompatButton, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonAcceptAllText$appconsent_ui_v3_prodXchangeRelease(), new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAcceptAllButton$lambda$42(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.acceptAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initBannerExampleUsage() {
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = null;
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease() != 0) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = this.binding;
            if (appconsentV3ActivityIntroductionBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding2 = null;
            }
            try {
                p3.a.setTint(appconsentV3ActivityIntroductionBinding2.introductionActivityImageConsentablesApplicationExample.getDrawable(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            } catch (Exception unused) {
            }
        }
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
        if (appconsentV3ActivityIntroductionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding3 = null;
        }
        AppCompatTextView appCompatTextView = appconsentV3ActivityIntroductionBinding3.introductionActivityTextConsentableDetailSeeMore;
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_introduction_example_usage_purpose_data_processing));
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease() != 0) {
            appCompatTextView.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        }
        appCompatTextView.setOnClickListener(new a(this, 5));
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
        if (appconsentV3ActivityIntroductionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding4 = null;
        }
        ImageView imageView = appconsentV3ActivityIntroductionBinding4.introductionActivityImageConsentablesApplicationExample;
        imageView.setVisibility(0);
        imageView.setContentDescription(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_introduction_example_usage_purpose_data_processing_accessibility));
        imageView.setOnClickListener(new a(this, 6));
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
        if (appconsentV3ActivityIntroductionBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding5;
        }
        appconsentV3ActivityIntroductionBinding.introductionActivityAcUnorderedListWidget.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBannerExampleUsage$lambda$12$lambda$11(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this$0.binding;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        this$0.clickOnExamplesOfUsage(appconsentV3ActivityIntroductionBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBannerExampleUsage$lambda$14$lambda$13(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this$0.binding;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        this$0.clickOnExamplesOfUsage(appconsentV3ActivityIntroductionBinding);
    }

    private final void initButtons() {
        initButtonsFromRemote();
        initContinueWithoutAcceptingButton();
    }

    private final void initButtonsFromRemote() {
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = null;
        if (this.isNeedToDisplayButtonsAtVertical) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = this.binding;
            if (appconsentV3ActivityIntroductionBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding2 = null;
            }
            appconsentV3ActivityIntroductionBinding2.intBannerLayout.setVisibility(8);
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding3;
            }
            appconsentV3ActivityIntroductionBinding.intBannerVerticalLayout.setVisibility(0);
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding4 = null;
            }
            appconsentV3ActivityIntroductionBinding4.intBannerLayout.setVisibility(0);
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding5;
            }
            appconsentV3ActivityIntroductionBinding.intBannerVerticalLayout.setVisibility(8);
        }
        int bannerActions$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease();
        if (bannerActions$appconsent_ui_v3_prodXchangeRelease == BannerOrder.POSITION_2.getId() || bannerActions$appconsent_ui_v3_prodXchangeRelease == BannerOrder.POSITION_3.getId()) {
            if (this.isNeedToDisplayButtonsAtVertical) {
                initButtonsSettingsTop();
                return;
            } else {
                initButtonsSettingsIconRight();
                return;
            }
        }
        if (bannerActions$appconsent_ui_v3_prodXchangeRelease == BannerOrder.POSITION_4.getId() || bannerActions$appconsent_ui_v3_prodXchangeRelease == BannerOrder.POSITION_5.getId()) {
            if (this.isNeedToDisplayButtonsAtVertical) {
                initButtonsSettingsBottom();
                return;
            } else {
                initButtonsSettingsIconLeft();
                return;
            }
        }
        if (this.isNeedToDisplayButtonsAtVertical) {
            initButtonsSettingBottom();
        } else {
            initButtonsSettingsRight();
        }
    }

    private final void initButtonsSettingBottom() {
        AppCompatButton appCompatButton;
        AppCompatButton appCompatButton2;
        int bannerActions$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease();
        BannerOrder bannerOrder = BannerOrder.POSITION_0;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = null;
        if (bannerActions$appconsent_ui_v3_prodXchangeRelease == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = this.binding;
            if (appconsentV3ActivityIntroductionBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding2 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding2.introductionBtnVertical2;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding3 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding3.introductionBtnVertical1;
        }
        e0.checkNotNullExpressionValue(appCompatButton, "this");
        initAcceptAllButton(appCompatButton);
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease() == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding4;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding.introductionBtnVertical1;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding5;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding.introductionBtnVertical2;
        }
        AppCompatButton initButtonsSettingBottom$lambda$40 = appCompatButton2;
        e0.checkNotNullExpressionValue(initButtonsSettingBottom$lambda$40, "initButtonsSettingBottom$lambda$40");
        ButtonExtsKt.initButton$default(initButtonsSettingBottom$lambda$40, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonText$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonBorder$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonBackground$appconsent_ui_v3_prodXchangeRelease(), 0, true, 8, null);
        ButtonExtsKt.setButtonValues(initButtonsSettingBottom$lambda$40, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonConfigureText$appconsent_ui_v3_prodXchangeRelease(), new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonsSettingBottom$lambda$40$lambda$39(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.startForResult.launch(NoticeActivity.Companion.getStartIntent(this$0, false));
    }

    private final void initButtonsSettingsBottom() {
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = null;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        AppCompatButton appCompatButton = appconsentV3ActivityIntroductionBinding.introductionBtnVerticalSettingsBottom;
        e0.checkNotNullExpressionValue(appCompatButton, "this");
        initSettingButtonFromVerticalConfiguration(appCompatButton);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
        if (appconsentV3ActivityIntroductionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding3 = null;
        }
        AppCompatButton appCompatButton2 = appconsentV3ActivityIntroductionBinding3.introductionBtnVertical1;
        e0.checkNotNullExpressionValue(appCompatButton2, "binding.introductionBtnVertical1");
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
        if (appconsentV3ActivityIntroductionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding4;
        }
        AppCompatButton appCompatButton3 = appconsentV3ActivityIntroductionBinding2.introductionBtnVertical2;
        e0.checkNotNullExpressionValue(appCompatButton3, "binding.introductionBtnVertical2");
        int bannerActions$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease();
        BannerOrder bannerOrder = BannerOrder.POSITION_4;
        initAcceptAllButton(bannerActions$appconsent_ui_v3_prodXchangeRelease == bannerOrder.getId() ? appCompatButton2 : appCompatButton3);
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease() == bannerOrder.getId()) {
            appCompatButton2 = appCompatButton3;
        }
        initRefuseAllButton(appCompatButton2);
    }

    private final void initButtonsSettingsIconLeft() {
        AppCompatButton appCompatButton;
        AppCompatButton appCompatButton2;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = null;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        AppCompatImageView appCompatImageView = appconsentV3ActivityIntroductionBinding.introductionBtnImgSettingsLeft;
        e0.checkNotNullExpressionValue(appCompatImageView, "this");
        initSettingImageFromHorizontalConfiguration(appCompatImageView);
        int bannerActions$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease();
        BannerOrder bannerOrder = BannerOrder.POSITION_4;
        if (bannerActions$appconsent_ui_v3_prodXchangeRelease == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding3 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding3.introductionBtn2;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding4 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding4.introductionBtn1;
        }
        e0.checkNotNullExpressionValue(appCompatButton, "this");
        initAcceptAllButton(appCompatButton);
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease() == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding5;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding2.introductionBtn1;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding6 = this.binding;
            if (appconsentV3ActivityIntroductionBinding6 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding6;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding2.introductionBtn2;
        }
        e0.checkNotNullExpressionValue(appCompatButton2, "this");
        initRefuseAllButton(appCompatButton2);
    }

    private final void initButtonsSettingsIconRight() {
        AppCompatButton appCompatButton;
        AppCompatButton appCompatButton2;
        int bannerActions$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease();
        BannerOrder bannerOrder = BannerOrder.POSITION_2;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = null;
        if (bannerActions$appconsent_ui_v3_prodXchangeRelease == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = this.binding;
            if (appconsentV3ActivityIntroductionBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding2 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding2.introductionBtn1;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding3 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding3.introductionBtn2;
        }
        e0.checkNotNullExpressionValue(appCompatButton, "this");
        initRefuseAllButton(appCompatButton);
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease() == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding4 = null;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding4.introductionBtn2;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding5 = null;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding5.introductionBtn1;
        }
        e0.checkNotNullExpressionValue(appCompatButton2, "this");
        initAcceptAllButton(appCompatButton2);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding6 = this.binding;
        if (appconsentV3ActivityIntroductionBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding6;
        }
        AppCompatImageView appCompatImageView = appconsentV3ActivityIntroductionBinding.introductionBtnImgSettingsRight;
        e0.checkNotNullExpressionValue(appCompatImageView, "this");
        initSettingImageFromHorizontalConfiguration(appCompatImageView);
    }

    private final void initButtonsSettingsRight() {
        AppCompatButton appCompatButton;
        AppCompatButton appCompatButton2;
        int bannerActions$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease();
        BannerOrder bannerOrder = BannerOrder.POSITION_0;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = null;
        if (bannerActions$appconsent_ui_v3_prodXchangeRelease == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = this.binding;
            if (appconsentV3ActivityIntroductionBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding2 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding2.introductionBtn1;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding3 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding3.introductionBtn2;
        }
        e0.checkNotNullExpressionValue(appCompatButton, "this");
        initAcceptAllButton(appCompatButton);
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease() == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding4;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding.introductionBtn2;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding5;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding.introductionBtn1;
        }
        AppCompatButton initButtonsSettingsRight$lambda$45 = appCompatButton2;
        e0.checkNotNullExpressionValue(initButtonsSettingsRight$lambda$45, "initButtonsSettingsRight$lambda$45");
        ButtonExtsKt.initButton$default(initButtonsSettingsRight$lambda$45, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonText$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonBorder$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonBackground$appconsent_ui_v3_prodXchangeRelease(), 0, true, 8, null);
        ButtonExtsKt.setButtonValues(initButtonsSettingsRight$lambda$45, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonConfigureText$appconsent_ui_v3_prodXchangeRelease(), new a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonsSettingsRight$lambda$45$lambda$44(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.startForResult.launch(NoticeActivity.Companion.getStartIntent(this$0, false));
    }

    private final void initButtonsSettingsTop() {
        AppCompatButton appCompatButton;
        AppCompatButton appCompatButton2;
        int bannerActions$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease();
        BannerOrder bannerOrder = BannerOrder.POSITION_2;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = null;
        if (bannerActions$appconsent_ui_v3_prodXchangeRelease == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = this.binding;
            if (appconsentV3ActivityIntroductionBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding2 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding2.introductionBtnVertical2;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding3 = null;
            }
            appCompatButton = appconsentV3ActivityIntroductionBinding3.introductionBtnVertical1;
        }
        e0.checkNotNullExpressionValue(appCompatButton, "this");
        initRefuseAllButton(appCompatButton);
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerActions$appconsent_ui_v3_prodXchangeRelease() == bannerOrder.getId()) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding4 = null;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding4.introductionBtnVertical1;
        } else {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding5 = null;
            }
            appCompatButton2 = appconsentV3ActivityIntroductionBinding5.introductionBtnVertical2;
        }
        e0.checkNotNullExpressionValue(appCompatButton2, "this");
        initAcceptAllButton(appCompatButton2);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding6 = this.binding;
        if (appconsentV3ActivityIntroductionBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding6;
        }
        AppCompatButton appCompatButton3 = appconsentV3ActivityIntroductionBinding.introductionBtnVerticalSettingsTop;
        e0.checkNotNullExpressionValue(appCompatButton3, "this");
        initSettingButtonFromVerticalConfiguration(appCompatButton3);
    }

    private final void initContinueWithoutAcceptingButton() {
        boolean continueWithoutAccepting$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContinueWithoutAccepting$appconsent_ui_v3_prodXchangeRelease();
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = null;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        ConstraintLayout initContinueWithoutAcceptingButton$lambda$19 = appconsentV3ActivityIntroductionBinding.containerContinueWhitoutAccept;
        e0.checkNotNullExpressionValue(initContinueWithoutAcceptingButton$lambda$19, "initContinueWithoutAcceptingButton$lambda$19");
        initContinueWithoutAcceptingButton$lambda$19.setVisibility(continueWithoutAccepting$appconsent_ui_v3_prodXchangeRelease ? 0 : 8);
        if (continueWithoutAccepting$appconsent_ui_v3_prodXchangeRelease) {
            if (isItalyCountry()) {
                AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
                if (appconsentV3ActivityIntroductionBinding3 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding3;
                }
                AppCompatImageButton it = appconsentV3ActivityIntroductionBinding2.buttonCloseWithoutAccepting;
                e0.checkNotNullExpressionValue(it, "it");
                it.setVisibility(0);
                it.setOnClickListener(new a(this, 2));
                return;
            }
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding4;
            }
            AppCompatTextView it2 = appconsentV3ActivityIntroductionBinding2.buttonContinueWithoutAccepting;
            e0.checkNotNullExpressionValue(it2, "it");
            it2.setVisibility(0);
            it2.setText(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonContinueWithoutAcceptingText$appconsent_ui_v3_prodXchangeRelease());
            it2.setMovementMethod(LinkMovementMethod.getInstance());
            it2.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonTextColor$appconsent_ui_v3_prodXchangeRelease());
            it2.setOnClickListener(new a(this, 3));
            ViewExtsKt.underline(it2, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContinueWithoutAcceptingButton$lambda$21$lambda$20(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.getMViewModel().sendContinueWithoutAcceptingTrackingEvent();
        this$0.refuseAllWithoutSendDenyAllEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContinueWithoutAcceptingButton$lambda$23$lambda$22(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.getMViewModel().sendContinueWithoutAcceptingTrackingEvent();
        this$0.refuseAllWithoutSendDenyAllEvent();
    }

    private final void initDetailText() {
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getIntroductionDetailsText$appconsent_ui_v3_prodXchangeRelease() != null) {
            String introductionDetailsText$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getIntroductionDetailsText$appconsent_ui_v3_prodXchangeRelease();
            e0.checkNotNull(introductionDetailsText$appconsent_ui_v3_prodXchangeRelease);
            final Spanned spannedFromHtml = v3.d.fromHtml(introductionDetailsText$appconsent_ui_v3_prodXchangeRelease, 63);
            e0.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(\n              …ODE_COMPACT\n            )");
            final SpannableString spannableString = new SpannableString(spannedFromHtml.toString());
            Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
            e0.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
            for (Object obj : spans) {
                final URLSpan uRLSpan = (URLSpan) obj;
                spannableString.setSpan(new ClickableSpan() { // from class: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$initDetailText$1$1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View v10) {
                        Object objM7131constructorimpl;
                        e0.checkNotNullParameter(v10, "v");
                        URLSpan uRLSpan2 = uRLSpan;
                        IntroductionActivity introductionActivity = this;
                        SpannableString spannableString2 = spannableString;
                        Spanned spanned = spannedFromHtml;
                        try {
                            int i10 = z.f87419c;
                            Uri uri = Uri.parse(uRLSpan2.getURL());
                            if (uri == null || !URLUtil.isValidUrl(uri.toString())) {
                                ACLoggerContract.DefaultImpls.w$default(ACLogger.INSTANCE, "IntroductionActivity", "The URL cannot be parsed and displayed", null, 4, null);
                            } else if (introductionActivity.isNeedToDisplayQrCodes) {
                                IntroductionViewModel mViewModel = introductionActivity.getMViewModel();
                                String string = introductionActivity.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_v3_qr_code);
                                e0.checkNotNullExpressionValue(string, "appConsentTheme.contextL…ng.appconsent_v3_qr_code)");
                                String string2 = spannableString2.subSequence(spanned.getSpanStart(uRLSpan2), spanned.getSpanEnd(uRLSpan2)).toString();
                                String string3 = uri.toString();
                                e0.checkNotNullExpressionValue(string3, "url.toString()");
                                IntroductionViewModel.getQrCode$default(mViewModel, string, string2, string3, false, 8, null);
                            } else {
                                PrivacyPolicyActivity.Companion companion = PrivacyPolicyActivity.Companion;
                                String string4 = uri.toString();
                                e0.checkNotNullExpressionValue(string4, "url.toString()");
                                introductionActivity.startActivity(PrivacyPolicyActivity.Companion.startIntent$default(companion, introductionActivity, string4, "", false, 8, null));
                            }
                            objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
                        } catch (Throwable th2) {
                            int i11 = z.f87419c;
                            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
                        }
                        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
                        if (thM7134exceptionOrNullimpl != null) {
                            ACLogger aCLogger = ACLogger.INSTANCE;
                            String message = thM7134exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "Error when trying to open url";
                            }
                            ACLoggerContract.DefaultImpls.e$default(aCLogger, "IntroductionActivity", message, null, 4, null);
                        }
                    }
                }, spannedFromHtml.getSpanStart(uRLSpan), spannedFromHtml.getSpanEnd(uRLSpan), 33);
            }
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = null;
            if (appconsentV3ActivityIntroductionBinding == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding = null;
            }
            appconsentV3ActivityIntroductionBinding.intOnboardingDetails.setText(spannableString);
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding3 = null;
            }
            appconsentV3ActivityIntroductionBinding3.intOnboardingDetails.setMovementMethod(LinkMovementMethod.getInstance());
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding4 = null;
            }
            appconsentV3ActivityIntroductionBinding4.intOnboardingDetails.setVisibility(0);
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding5;
            }
            appconsentV3ActivityIntroductionBinding2.intOnboardingDetails.setLinkTextColor(m3.a.getColor(this, R.color.appconsent_v3_very_dark_grey));
        }
    }

    private final void initIntroText() {
        final Spanned spannedFromHtml = v3.d.fromHtml(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getIntroductionText$appconsent_ui_v3_prodXchangeRelease(), 63);
        e0.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(\n            in…ML_MODE_COMPACT\n        )");
        final SpannableString spannableString = new SpannableString(spannedFromHtml.toString());
        Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        e0.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            final URLSpan uRLSpan = (URLSpan) obj;
            spannableString.setSpan(new ClickableSpan() { // from class: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$initIntroText$1$1
                /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
                
                    if (sv.k0.endsWith$default(r1, "others", false, 2, null) != false) goto L8;
                 */
                @Override // android.text.style.ClickableSpan
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onClick(android.view.View r19) {
                    /*
                        r18 = this;
                        r0 = r18
                        java.lang.String r1 = "v"
                        r2 = r19
                        kotlin.jvm.internal.e0.checkNotNullParameter(r2, r1)
                        android.text.style.URLSpan r1 = r1
                        java.lang.String r1 = r1.getURL()
                        java.lang.String r2 = "urlSpan.url"
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
                        java.lang.String r3 = "sfbx://"
                        r4 = 0
                        r5 = 2
                        r6 = 0
                        boolean r1 = sv.k0.startsWith$default(r1, r3, r4, r5, r6)
                        if (r1 == 0) goto L52
                        android.text.style.URLSpan r1 = r1
                        java.lang.String r1 = r1.getURL()
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
                        java.lang.String r3 = "vendors"
                        boolean r1 = sv.k0.endsWith$default(r1, r3, r4, r5, r6)
                        if (r1 != 0) goto L41
                        android.text.style.URLSpan r1 = r1
                        java.lang.String r1 = r1.getURL()
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
                        java.lang.String r2 = "others"
                        boolean r1 = sv.k0.endsWith$default(r1, r2, r4, r5, r6)
                        if (r1 == 0) goto L52
                    L41:
                        com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment$Companion r1 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment.Companion
                        r2 = 3
                        com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment r1 = com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment.Companion.newInstance$default(r1, r4, r4, r2, r6)
                        com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity r2 = r2
                        androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
                        r1.show(r2, r6)
                        return
                    L52:
                        android.text.style.URLSpan r1 = r1
                        java.lang.String r1 = r1.getURL()
                        android.net.Uri r1 = android.net.Uri.parse(r1)
                        if (r1 == 0) goto Lcf
                        java.lang.String r2 = r1.toString()
                        boolean r2 = android.webkit.URLUtil.isValidUrl(r2)
                        if (r2 == 0) goto Lcf
                        com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity r2 = r2
                        boolean r2 = com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity.access$isNeedToDisplayQrCodes$p(r2)
                        java.lang.String r3 = "url.toString()"
                        if (r2 == 0) goto Lb6
                        com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity r2 = r2
                        com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel r4 = r2.getMViewModel()
                        com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity r2 = r2
                        com.sfbx.appconsentv3.ui.AppConsentTheme r2 = r2.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease()
                        android.content.Context r2 = r2.getContextLocalized$appconsent_ui_v3_prodXchangeRelease()
                        int r5 = com.sfbx.appconsentv3.ui.R.string.appconsent_v3_qr_code
                        java.lang.String r5 = r2.getString(r5)
                        java.lang.String r2 = "appConsentTheme.contextL…ng.appconsent_v3_qr_code)"
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)
                        android.text.SpannableString r2 = r3
                        android.text.Spanned r6 = r4
                        android.text.style.URLSpan r7 = r1
                        int r6 = r6.getSpanStart(r7)
                        android.text.Spanned r7 = r4
                        android.text.style.URLSpan r8 = r1
                        int r7 = r7.getSpanEnd(r8)
                        java.lang.CharSequence r2 = r2.subSequence(r6, r7)
                        java.lang.String r6 = r2.toString()
                        java.lang.String r7 = r1.toString()
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r3)
                        r9 = 8
                        r10 = 0
                        r8 = 0
                        com.sfbx.appconsentv3.ui.ui.introduction.IntroductionViewModel.getQrCode$default(r4, r5, r6, r7, r8, r9, r10)
                        return
                    Lb6:
                        com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity r12 = r2
                        com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity$Companion r11 = com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity.Companion
                        java.lang.String r13 = r1.toString()
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r3)
                        r16 = 8
                        r17 = 0
                        java.lang.String r14 = ""
                        r15 = 0
                        android.content.Intent r1 = com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity.Companion.startIntent$default(r11, r12, r13, r14, r15, r16, r17)
                        r12.startActivity(r1)
                    Lcf:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity$initIntroText$1$1.onClick(android.view.View):void");
                }
            }, spannedFromHtml.getSpanStart(uRLSpan), spannedFromHtml.getSpanEnd(uRLSpan), 33);
        }
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = null;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        appconsentV3ActivityIntroductionBinding.textIntroduction.setMovementMethod(LinkMovementMethod.getInstance());
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
        if (appconsentV3ActivityIntroductionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding3 = null;
        }
        appconsentV3ActivityIntroductionBinding3.textIntroduction.setText(spannableString);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
        if (appconsentV3ActivityIntroductionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding4 = null;
        }
        appconsentV3ActivityIntroductionBinding4.textIntroduction.setLinkTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
        if (appconsentV3ActivityIntroductionBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding5;
        }
        appconsentV3ActivityIntroductionBinding2.textIntroduction.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease());
    }

    private final void initPictures() {
        String illustrationHeaderImageUrl$appconsent_ui_v3_prodXchangeRelease;
        String onboardingImageUrl$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getOnboardingImageUrl$appconsent_ui_v3_prodXchangeRelease();
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = null;
        if (onboardingImageUrl$appconsent_ui_v3_prodXchangeRelease != null && !n0.isBlank(onboardingImageUrl$appconsent_ui_v3_prodXchangeRelease)) {
            q qVarLoad = c.with((FragmentActivity) this).load(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getOnboardingImageUrl$appconsent_ui_v3_prodXchangeRelease());
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = this.binding;
            if (appconsentV3ActivityIntroductionBinding2 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding2 = null;
            }
            qVarLoad.into(appconsentV3ActivityIntroductionBinding2.introAppImage);
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
            if (appconsentV3ActivityIntroductionBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding3 = null;
            }
            AppCompatImageView appCompatImageView = appconsentV3ActivityIntroductionBinding3.introAppImage;
            e0.checkNotNullExpressionValue(appCompatImageView, "binding.introAppImage");
            appCompatImageView.setVisibility(0);
        }
        if (!getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getEnableIllustrations$appconsent_ui_v3_prodXchangeRelease() || (illustrationHeaderImageUrl$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getIllustrationHeaderImageUrl$appconsent_ui_v3_prodXchangeRelease()) == null) {
            return;
        }
        q qVarLoad2 = c.with((FragmentActivity) this).load(illustrationHeaderImageUrl$appconsent_ui_v3_prodXchangeRelease);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
        if (appconsentV3ActivityIntroductionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding4 = null;
        }
        qVarLoad2.into(appconsentV3ActivityIntroductionBinding4.introductionIllustration);
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
        if (appconsentV3ActivityIntroductionBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityIntroductionBinding = appconsentV3ActivityIntroductionBinding5;
        }
        AppCompatImageView appCompatImageView2 = appconsentV3ActivityIntroductionBinding.introductionIllustration;
        e0.checkNotNullExpressionValue(appCompatImageView2, "binding.introductionIllustration");
        appCompatImageView2.setVisibility(0);
    }

    private final void initRefuseAllButton(AppCompatButton appCompatButton) {
        ButtonExtsKt.initButton$default(appCompatButton, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getRefuseAllButtonText$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getRefuseAllButtonBorder$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getRefuseAllButtonBackground$appconsent_ui_v3_prodXchangeRelease(), 0, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getHighlightAcceptAllButton$appconsent_ui_v3_prodXchangeRelease(), 8, null);
        ButtonExtsKt.setButtonValues(appCompatButton, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonDenyAllText$appconsent_ui_v3_prodXchangeRelease(), new a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRefuseAllButton$lambda$41(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.refuseAllAndSendDenyAllEvent();
    }

    private final void initSettingButtonFromVerticalConfiguration(AppCompatButton appCompatButton) {
        ButtonExtsKt.initSettingButton$default(appCompatButton, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonText$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonBorder$appconsent_ui_v3_prodXchangeRelease(), 0, 4, null);
        setSettingButtonValues(appCompatButton);
        appCompatButton.setVisibility(0);
    }

    private final void initSettingImageFromHorizontalConfiguration(AppCompatImageView appCompatImageView) {
        appCompatImageView.setOnClickListener(new a(this, 0));
        ExtensionKt.initImageButtonOutlined(appCompatImageView, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonBorder$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getSetupButtonText$appconsent_ui_v3_prodXchangeRelease());
        appCompatImageView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSettingImageFromHorizontalConfiguration$lambda$34(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.onCLickSettingsListener();
    }

    private final void initTexts() {
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding2 = null;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        appconsentV3ActivityIntroductionBinding.textTitle.setText(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getIntroductionTitleText$appconsent_ui_v3_prodXchangeRelease());
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding3 = this.binding;
        if (appconsentV3ActivityIntroductionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding3 = null;
        }
        appconsentV3ActivityIntroductionBinding3.textTitle.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        initIntroText();
        initDetailText();
        if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease() != m3.a.getColor(this, R.color.appconsent_v3_dark_blue)) {
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding4 = this.binding;
            if (appconsentV3ActivityIntroductionBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBinding4 = null;
            }
            appconsentV3ActivityIntroductionBinding4.intOnboardingDetails.setTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding5 = this.binding;
            if (appconsentV3ActivityIntroductionBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityIntroductionBinding2 = appconsentV3ActivityIntroductionBinding5;
            }
            appconsentV3ActivityIntroductionBinding2.intOnboardingDetails.setLinkTextColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    private final void initUI() {
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBinding = this.binding;
        if (appconsentV3ActivityIntroductionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityIntroductionBinding = null;
        }
        appconsentV3ActivityIntroductionBinding.intLayout.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        initButtons();
        initTexts();
        initPictures();
        displaySpinner(false);
    }

    private final boolean isItalyCountry() {
        Locale locale = Locale.getDefault();
        try {
            return e0.areEqual(locale.getISO3Country(), Locale.ITALY.getISO3Country());
        } catch (Exception e10) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            if (e10.getMessage() == null) {
                locale.getLanguage();
            }
            aCLogger.getClass();
            return false;
        }
    }

    private final boolean isThemeDialog() throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTheme$appconsent_ui_v3_prodXchangeRelease(), new int[]{android.R.attr.windowCloseOnTouchOutside});
        e0.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(a…onsentTheme.theme, attrs)");
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private final void loadDataFromSavedInstanceState(Bundle bundle) {
        if (bundle != null) {
            this._isDisplayEventAlreadySent = bundle.getBoolean(IS_DISPLAY_EVENT_ALREADY_SENT, false);
        }
    }

    private final void onCLickSettingsListener() {
        getMViewModel().sendPrivacyCenterDisplayTrackingEvent();
        this.startForResult.launch(NoticeActivity.Companion.getStartIntent(this, false));
    }

    private final void refuseAllAndSendDenyAllEvent() {
        getMViewModel().sendDenyAllTrackingEvent();
        getMViewModel().refuseAll(false);
    }

    private final void refuseAllWithoutSendDenyAllEvent() {
        getMViewModel().refuseAll(true);
    }

    private final void setSettingButtonValues(AppCompatButton appCompatButton) {
        ButtonExtsKt.setButtonValues(appCompatButton, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonConfigureText$appconsent_ui_v3_prodXchangeRelease(), new a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSettingButtonValues$lambda$27(IntroductionActivity this$0, View view) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.onCLickSettingsListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$1(IntroductionActivity this$0, ActivityResult activityResult) {
        Intent data;
        Intent data2;
        e0.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.finish();
            return;
        }
        if (activityResult.getResultCode() == 0 && (data = activityResult.getData()) != null && data.hasExtra("SFBX_IAB_WEBVIEW_THROWABLE") && (data2 = activityResult.getData()) != null && data2.getBooleanExtra("SFBX_IAB_WEBVIEW_THROWABLE", false)) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            ACLoggerContract.DefaultImpls.e$default(aCLogger, "IntroductionActivity", "Your WebView system component is unable to parse the IAB script", null, 4, null);
            ACLoggerContract.DefaultImpls.e$default(aCLogger, "IntroductionActivity", "The cmp will close", null, 4, null);
            this$0.finish();
        }
    }

    public final IntroductionViewModel getMViewModel() {
        return (IntroductionViewModel) this.mViewModel$delegate.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        e0.checkNotNullParameter(outState, "outState");
        outState.putBoolean(IS_DISPLAY_EVENT_ALREADY_SENT, this._isDisplayEventAlreadySent);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.isNeedToDisplayQrCodes) {
            this.jobQrCode = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(this), null, null, new C37121(null), 3, null);
            if (getMViewModel().getQrCodeShowing()) {
                m mVar = this.qrCodeDialog;
                if (mVar == null || !(mVar == null || mVar.isShowing())) {
                    getMViewModel().displayLastQrCode();
                }
            }
        }
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        m mVar = this.qrCodeDialog;
        if (mVar != null) {
            mVar.dismiss();
        }
        this.qrCodeDialog = null;
        Job job = this.jobQrCode;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.jobQrCode = null;
        super.onStop();
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int theme$appconsent_ui_v3_prodXchangeRelease;
        super.onCreate(bundle);
        boolean z10 = false;
        boolean booleanExtra = getIntent().getBooleanExtra(FULL_SCREEN_MODE, false);
        if (booleanExtra) {
            if (getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTheme$appconsent_ui_v3_prodXchangeRelease() != 0 && !isThemeDialog()) {
                theme$appconsent_ui_v3_prodXchangeRelease = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getTheme$appconsent_ui_v3_prodXchangeRelease();
            } else {
                theme$appconsent_ui_v3_prodXchangeRelease = R.style.AppConsentV3Theme;
            }
            setTheme(theme$appconsent_ui_v3_prodXchangeRelease);
        }
        AppconsentV3ActivityIntroductionBinding appconsentV3ActivityIntroductionBindingInflate = AppconsentV3ActivityIntroductionBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(appconsentV3ActivityIntroductionBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityIntroductionBindingInflate;
        String str = QpyI.AAXiDsVhg;
        if (booleanExtra) {
            if (appconsentV3ActivityIntroductionBindingInflate == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBindingInflate = null;
            }
            ConstraintLayout root = appconsentV3ActivityIntroductionBindingInflate.getRoot();
            e0.checkNotNullExpressionValue(root, str);
            setCustomContentViewFullScreenModeFromLayer1(root);
        } else {
            if (appconsentV3ActivityIntroductionBindingInflate == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                appconsentV3ActivityIntroductionBindingInflate = null;
            }
            ConstraintLayout root2 = appconsentV3ActivityIntroductionBindingInflate.getRoot();
            e0.checkNotNullExpressionValue(root2, str);
            setCustomContentViewFromLayer1(root2);
        }
        loadDataFromSavedInstanceState(bundle);
        this.isNeedToDisplayButtonsAtVertical = getIntent().getBooleanExtra(IS_NEED_TO_DISPLAY_BUTTONS_VERTICALLY, false);
        this.isNeedToDisplayQrCodes = getIntent().getBooleanExtra(IS_NEED_TO_DISPLAY_QRCODE, false);
        if (this.isNeedToDisplayButtonsAtVertical && getResources().getConfiguration().orientation == 1) {
            z10 = true;
        }
        this.isNeedToDisplayButtonsAtVertical = z10;
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        getMViewModel().getAcceptAll().observe(this, this.acceptRefuseAllObserver);
        getMViewModel().getRefuseAll().observe(this, this.acceptRefuseAllObserver);
        initUI();
        if (!this._isDisplayEventAlreadySent) {
            getMViewModel().notifyDisplayMetric();
            getMViewModel().sendCmpDisplayTrackingEvent();
            this._isDisplayEventAlreadySent = true;
        }
        checkIfUsageExampleNeedToBeDisplayed();
    }
}
