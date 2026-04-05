package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ca.m;
import com.digidust.elokence.akinator.activities.WebviewCGV;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import f.n;
import ji.t;
import nh.n1;
import o9.ha;
import o9.ia;
import p0.o2;
import timber.log.Timber;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class WebviewCGV extends AkActivity implements View.OnClickListener {
    public static final /* synthetic */ int R = 0;
    public ImageView C;
    public WebView D;
    public RelativeLayout E;
    public RelativeLayout F;
    public Button G;
    public TextView H;
    public TextView I;
    public TextView J;
    public ImageView K;
    public ImageView L;
    public ImageView M;
    public final ha N;
    public final ha O;
    public final ha P;
    public final ha Q;

    /* JADX WARN: Type inference failed for: r0v0, types: [o9.ha] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o9.ha] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o9.ha] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o9.ha] */
    public WebviewCGV() {
        final int i10 = 0;
        this.N = new View.OnClickListener(this) { // from class: o9.ha

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebviewCGV f78204c;

            {
                this.f78204c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                WebviewCGV webviewCGV = this.f78204c;
                switch (i11) {
                    case 0:
                        if (webviewCGV.F.getVisibility() != 0 ? ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() : ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() && ca.m.sharedInstance().isConsent3Enabled()) {
                            ca.m.sharedInstance().setHasGivenConsentForThisAccount(true);
                            Intent intent = new Intent();
                            intent.putExtra("registerUser", true);
                            webviewCGV.setResult(-1, intent);
                            webviewCGV.finish();
                            break;
                        } else {
                            da.f fVar = new da.f(webviewCGV);
                            fVar.setTypeTwoButtons(lb.b1.sharedInstance().getTraductionFromToken("AVERTISSEMENT_CREATION_COMPTE_SI_REFUS_CONDITIONS"), lb.b1.sharedInstance().getTraductionFromToken("CONTINUER"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"));
                            fVar.setConfirmeListener(new ja(webviewCGV));
                            break;
                        }
                    case 1:
                        int i12 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent1Enabled()) {
                            webviewCGV.K.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent1Enabled(true);
                            break;
                        } else {
                            webviewCGV.K.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent1Enabled(false);
                            break;
                        }
                    case 2:
                        int i13 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent2Enabled()) {
                            webviewCGV.L.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent2Enabled(true);
                            break;
                        } else {
                            webviewCGV.L.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent2Enabled(false);
                            break;
                        }
                    default:
                        int i14 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent3Enabled()) {
                            webviewCGV.M.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent3Enabled(true);
                            break;
                        } else {
                            webviewCGV.M.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent3Enabled(false);
                            break;
                        }
                }
            }
        };
        final int i11 = 1;
        this.O = new View.OnClickListener(this) { // from class: o9.ha

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebviewCGV f78204c;

            {
                this.f78204c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                WebviewCGV webviewCGV = this.f78204c;
                switch (i112) {
                    case 0:
                        if (webviewCGV.F.getVisibility() != 0 ? ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() : ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() && ca.m.sharedInstance().isConsent3Enabled()) {
                            ca.m.sharedInstance().setHasGivenConsentForThisAccount(true);
                            Intent intent = new Intent();
                            intent.putExtra("registerUser", true);
                            webviewCGV.setResult(-1, intent);
                            webviewCGV.finish();
                            break;
                        } else {
                            da.f fVar = new da.f(webviewCGV);
                            fVar.setTypeTwoButtons(lb.b1.sharedInstance().getTraductionFromToken("AVERTISSEMENT_CREATION_COMPTE_SI_REFUS_CONDITIONS"), lb.b1.sharedInstance().getTraductionFromToken("CONTINUER"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"));
                            fVar.setConfirmeListener(new ja(webviewCGV));
                            break;
                        }
                    case 1:
                        int i12 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent1Enabled()) {
                            webviewCGV.K.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent1Enabled(true);
                            break;
                        } else {
                            webviewCGV.K.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent1Enabled(false);
                            break;
                        }
                    case 2:
                        int i13 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent2Enabled()) {
                            webviewCGV.L.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent2Enabled(true);
                            break;
                        } else {
                            webviewCGV.L.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent2Enabled(false);
                            break;
                        }
                    default:
                        int i14 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent3Enabled()) {
                            webviewCGV.M.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent3Enabled(true);
                            break;
                        } else {
                            webviewCGV.M.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent3Enabled(false);
                            break;
                        }
                }
            }
        };
        final int i12 = 2;
        this.P = new View.OnClickListener(this) { // from class: o9.ha

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebviewCGV f78204c;

            {
                this.f78204c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                WebviewCGV webviewCGV = this.f78204c;
                switch (i112) {
                    case 0:
                        if (webviewCGV.F.getVisibility() != 0 ? ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() : ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() && ca.m.sharedInstance().isConsent3Enabled()) {
                            ca.m.sharedInstance().setHasGivenConsentForThisAccount(true);
                            Intent intent = new Intent();
                            intent.putExtra("registerUser", true);
                            webviewCGV.setResult(-1, intent);
                            webviewCGV.finish();
                            break;
                        } else {
                            da.f fVar = new da.f(webviewCGV);
                            fVar.setTypeTwoButtons(lb.b1.sharedInstance().getTraductionFromToken("AVERTISSEMENT_CREATION_COMPTE_SI_REFUS_CONDITIONS"), lb.b1.sharedInstance().getTraductionFromToken("CONTINUER"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"));
                            fVar.setConfirmeListener(new ja(webviewCGV));
                            break;
                        }
                    case 1:
                        int i122 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent1Enabled()) {
                            webviewCGV.K.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent1Enabled(true);
                            break;
                        } else {
                            webviewCGV.K.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent1Enabled(false);
                            break;
                        }
                    case 2:
                        int i13 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent2Enabled()) {
                            webviewCGV.L.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent2Enabled(true);
                            break;
                        } else {
                            webviewCGV.L.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent2Enabled(false);
                            break;
                        }
                    default:
                        int i14 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent3Enabled()) {
                            webviewCGV.M.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent3Enabled(true);
                            break;
                        } else {
                            webviewCGV.M.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent3Enabled(false);
                            break;
                        }
                }
            }
        };
        final int i13 = 3;
        this.Q = new View.OnClickListener(this) { // from class: o9.ha

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebviewCGV f78204c;

            {
                this.f78204c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                WebviewCGV webviewCGV = this.f78204c;
                switch (i112) {
                    case 0:
                        if (webviewCGV.F.getVisibility() != 0 ? ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() : ca.m.sharedInstance().isConsent1Enabled() && ca.m.sharedInstance().isConsent2Enabled() && ca.m.sharedInstance().isConsent3Enabled()) {
                            ca.m.sharedInstance().setHasGivenConsentForThisAccount(true);
                            Intent intent = new Intent();
                            intent.putExtra("registerUser", true);
                            webviewCGV.setResult(-1, intent);
                            webviewCGV.finish();
                            break;
                        } else {
                            da.f fVar = new da.f(webviewCGV);
                            fVar.setTypeTwoButtons(lb.b1.sharedInstance().getTraductionFromToken("AVERTISSEMENT_CREATION_COMPTE_SI_REFUS_CONDITIONS"), lb.b1.sharedInstance().getTraductionFromToken("CONTINUER"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"));
                            fVar.setConfirmeListener(new ja(webviewCGV));
                            break;
                        }
                    case 1:
                        int i122 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent1Enabled()) {
                            webviewCGV.K.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent1Enabled(true);
                            break;
                        } else {
                            webviewCGV.K.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent1Enabled(false);
                            break;
                        }
                    case 2:
                        int i132 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent2Enabled()) {
                            webviewCGV.L.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent2Enabled(true);
                            break;
                        } else {
                            webviewCGV.L.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent2Enabled(false);
                            break;
                        }
                    default:
                        int i14 = WebviewCGV.R;
                        webviewCGV.getClass();
                        if (!ca.m.sharedInstance().isConsent3Enabled()) {
                            webviewCGV.M.setImageResource(R.drawable.toggle_on);
                            ca.m.sharedInstance().setIsConsent3Enabled(true);
                            break;
                        } else {
                            webviewCGV.M.setImageResource(R.drawable.toggle_off);
                            ca.m.sharedInstance().setIsConsent3Enabled(false);
                            break;
                        }
                }
            }
        };
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m.sharedInstance().setIsConsent1Enabled(false);
        m.sharedInstance().setIsConsent2Enabled(false);
        m.sharedInstance().setIsConsent3Enabled(false);
        super.onBackPressed();
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.C) {
            m.sharedInstance().setIsConsent1Enabled(false);
            m.sharedInstance().setIsConsent2Enabled(false);
            m.sharedInstance().setIsConsent3Enabled(false);
            finish();
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.enable(this);
        setContentView(R.layout.activity_webview_cgv);
        z1.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout), new n1(16));
        boolean booleanExtra = false;
        try {
            booleanExtra = getIntent().getBooleanExtra("allowUserAction", false);
        } catch (Exception unused) {
        }
        ImageView imageView = (ImageView) findViewById(R.id.backButtonImage);
        this.C = imageView;
        imageView.setOnClickListener(this);
        this.D = (WebView) findViewById(R.id.webviewCGV);
        String stringExtra = getIntent().getStringExtra("url");
        if (getIntent().getStringExtra("lng") != null) {
            StringBuilder sbU = o2.u(stringExtra);
            sbU.append(getIntent().getStringExtra("lng"));
            stringExtra = sbU.toString();
        }
        Timber.tag("WebViewCGV").d("Showing : %s", stringExtra);
        this.D.loadUrl(stringExtra);
        this.D.setWebViewClient(new WebViewClient());
        if (booleanExtra) {
            AkApplication.f21721h.execute(new t(this, 29));
        }
    }

    public void trySmth() {
        runOnUiThread(new ia(this));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
