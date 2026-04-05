package com.digidust.elokence.akinator.activities;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import f.n;
import nh.n1;
import o9.j0;
import timber.log.Timber;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class WebviewGeneralActivity extends AkActivity {
    public static final /* synthetic */ int D = 0;
    public WebView C;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.enable(this);
        setContentView(R.layout.activity_webview_general);
        z1.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout), new n1(17));
        ((ImageView) findViewById(R.id.backButtonImage)).setOnClickListener(new j0(this, 10));
        WebView webView = (WebView) findViewById(R.id.webviewCGV);
        this.C = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        String stringExtra = getIntent().getStringExtra("url");
        Timber.tag("WebViewCGV").d("Showing : %s", stringExtra);
        this.C.loadUrl(stringExtra);
        this.C.setWebViewClient(new WebViewClient());
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
