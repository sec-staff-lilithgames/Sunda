package com.sfbx.appconsentv3.ui.ui.privacy;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.ActivityPrivacyPolicyBinding;
import com.sfbx.appconsentv3.ui.ui.privacy.PrivacyPolicyActivity;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w0;
import qm.zMPW.GalEuEfxjome;
import sv.n0;
import uu.y0;
import zk.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PrivacyPolicyActivity extends AppConsentActivity {
    public static final Companion Companion = new Companion(null);
    private static final String PRIVACY_POLICY_LEGITIMATE = "PRIVACY_POLICY_LEGITIMATE";
    private static final String PRIVACY_POLICY_URL = "PRIVACY_POLICY";
    private static final String PRIVACY_POLICY_VENDOR_TITLE = "PRIVACY_POLICY_VENDOR_TITLE";
    private ActivityPrivacyPolicyBinding binding;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildAlertDialogOnScreen$lambda$1(w0 answered, SslErrorHandler handler, DialogInterface dialogInterface, int i10) {
            e0.checkNotNullParameter(answered, "$answered");
            e0.checkNotNullParameter(handler, "$handler");
            answered.f71863b = true;
            handler.proceed();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildAlertDialogOnScreen$lambda$2(w0 answered, SslErrorHandler handler, Context context, DialogInterface dialogInterface, int i10) {
            e0.checkNotNullParameter(answered, "$answered");
            e0.checkNotNullParameter(handler, "$handler");
            e0.checkNotNullParameter(context, "$context");
            answered.f71863b = true;
            handler.cancel();
            ((AppCompatActivity) context).finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildAlertDialogOnScreen$lambda$3(w0 answered, SslErrorHandler handler, Context context, DialogInterface dialogInterface) {
            e0.checkNotNullParameter(answered, "$answered");
            e0.checkNotNullParameter(handler, "$handler");
            e0.checkNotNullParameter(context, "$context");
            if (answered.f71863b) {
                return;
            }
            handler.cancel();
            ((AppCompatActivity) context).finish();
        }

        public static /* synthetic */ Intent startIntent$default(Companion companion, Context context, String str, String str2, boolean z10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return companion.startIntent(context, str, str2, z10);
        }

        public final void buildAlertDialogOnScreen$appconsent_ui_v3_prodXchangeRelease(final Context context, final SslErrorHandler handler) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(handler, "handler");
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            final w0 w0Var = new w0();
            builder.setTitle(R.string.appconsent_webview_ssl_error_title).setMessage(context.getString(R.string.appconsent_webview_ssl_error_message, context.getString(android.R.string.ok))).setPositiveButton(android.R.string.ok, new t0(2, w0Var, handler)).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.sfbx.appconsentv3.ui.ui.privacy.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    PrivacyPolicyActivity.Companion.buildAlertDialogOnScreen$lambda$2(w0Var, handler, context, dialogInterface, i10);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sfbx.appconsentv3.ui.ui.privacy.b
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    PrivacyPolicyActivity.Companion.buildAlertDialogOnScreen$lambda$3(w0Var, handler, context, dialogInterface);
                }
            }).show();
        }

        private Companion() {
        }

        public final Intent startIntent(Context context, String privacyPolicy, String vendorTitle, boolean z10) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(privacyPolicy, "privacyPolicy");
            e0.checkNotNullParameter(vendorTitle, "vendorTitle");
            Intent intent = new Intent(context, (Class<?>) PrivacyPolicyActivity.class);
            intent.putExtra(GalEuEfxjome.YCouZ, privacyPolicy);
            intent.putExtra(PrivacyPolicyActivity.PRIVACY_POLICY_VENDOR_TITLE, vendorTitle);
            intent.putExtra(PrivacyPolicyActivity.PRIVACY_POLICY_LEGITIMATE, z10);
            return intent;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CustomWebViewClients extends WebViewClient {
        private final Context context;
        private final ProgressBar progressBar;
        final /* synthetic */ PrivacyPolicyActivity this$0;

        public CustomWebViewClients(PrivacyPolicyActivity privacyPolicyActivity, Context context, ProgressBar progressBar) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(progressBar, "progressBar");
            this.this$0 = privacyPolicyActivity;
            this.context = context;
            this.progressBar = progressBar;
            progressBar.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            e0.checkNotNullParameter(view, "view");
            e0.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            this.progressBar.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError erorr) {
            e0.checkNotNullParameter(view, "view");
            e0.checkNotNullParameter(handler, "handler");
            e0.checkNotNullParameter(erorr, "erorr");
            PrivacyPolicyActivity.Companion.buildAlertDialogOnScreen$appconsent_ui_v3_prodXchangeRelease(this.context, handler);
        }
    }

    public PrivacyPolicyActivity() {
        super(false, 1, null);
    }

    public final boolean isFile$appconsent_ui_v3_prodXchangeRelease(String url) {
        e0.checkNotNullParameter(url, "url");
        String[] strArr = {".pdf", ".json", ".doc", ".docx", ".dot", ".dotx"};
        String str = (String) y0.last(n0.split$default((CharSequence) url, new String[]{"/"}, false, 0, 6, (Object) null));
        for (int i10 = 0; i10 < 6; i10++) {
            if (n0.contains((CharSequence) str, (CharSequence) strArr[i10], true)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sfbx.appconsentv3.ui.AppConsentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityPrivacyPolicyBinding activityPrivacyPolicyBindingInflate = ActivityPrivacyPolicyBinding.inflate(getLayoutInflater());
        e0.checkNotNullExpressionValue(activityPrivacyPolicyBindingInflate, "inflate(layoutInflater)");
        this.binding = activityPrivacyPolicyBindingInflate;
        ActivityPrivacyPolicyBinding activityPrivacyPolicyBinding = null;
        if (activityPrivacyPolicyBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityPrivacyPolicyBindingInflate = null;
        }
        ConstraintLayout root = activityPrivacyPolicyBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        setCustomContentViewFromLayer2(root);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString(PRIVACY_POLICY_URL) : null;
        if (string == null || string.length() == 0) {
            finish();
            return;
        }
        Bundle extras2 = getIntent().getExtras();
        boolean z10 = extras2 != null ? extras2.getBoolean(PRIVACY_POLICY_LEGITIMATE) : false;
        Bundle extras3 = getIntent().getExtras();
        String string2 = extras3 != null ? extras3.getString(PRIVACY_POLICY_VENDOR_TITLE) : null;
        if (string2 == null || string2.length() == 0) {
            string2 = getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(z10 ? R.string.appconsent_vendor_legitimate_interest : R.string.appconsent_vendor_privacy_policy);
        }
        e0.checkNotNullExpressionValue(string2, "intent.extras?.getString…          }\n            }");
        if (isFile$appconsent_ui_v3_prodXchangeRelease(string)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(string));
            startActivity(intent);
            finish();
            return;
        }
        ExtensionKt.setupCustomTitle(this, getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease(), getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease(), string2);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled(true);
        }
        ActivityPrivacyPolicyBinding activityPrivacyPolicyBinding2 = this.binding;
        if (activityPrivacyPolicyBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityPrivacyPolicyBinding2 = null;
        }
        WebView webView = activityPrivacyPolicyBinding2.webviewPrivacyPolicy;
        webView.getSettings().setJavaScriptEnabled(true);
        ActivityPrivacyPolicyBinding activityPrivacyPolicyBinding3 = this.binding;
        if (activityPrivacyPolicyBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityPrivacyPolicyBinding = activityPrivacyPolicyBinding3;
        }
        ProgressBar progressBar = activityPrivacyPolicyBinding.privacyPolicyProgressbar;
        e0.checkNotNullExpressionValue(progressBar, "binding.privacyPolicyProgressbar");
        webView.setWebViewClient(new CustomWebViewClients(this, this, progressBar));
        webView.loadUrl(string);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        e0.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }
}
