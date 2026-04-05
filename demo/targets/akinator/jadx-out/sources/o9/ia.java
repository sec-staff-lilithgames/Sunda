package o9;

import android.graphics.Typeface;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.WebviewCGV;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ia implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebviewCGV f78230b;

    public ia(WebviewCGV webviewCGV) {
        this.f78230b = webviewCGV;
    }

    @Override // java.lang.Runnable
    public void run() {
        WebviewCGV webviewCGV = this.f78230b;
        Typeface typeface = webviewCGV.f21687j;
        try {
            da.f fVar = new da.f(webviewCGV);
            fVar.getWindow().setLayout(600, 300);
            fVar.setTypeIUnderstand(lb.b1.sharedInstance().getTraductionFromToken("CONDITIONS_CREATION_COMPTE"));
            webviewCGV.E = (RelativeLayout) webviewCGV.findViewById(R.id.consentPoliticsLayout);
            webviewCGV.F = (RelativeLayout) webviewCGV.findViewById(R.id.consent3);
            if (webviewCGV.getIntent().getStringExtra("url").equals("https://cgu.akinator.com/app/privacy/")) {
                webviewCGV.E.setVisibility(0);
                ((TextView) webviewCGV.findViewById(R.id.titleConsent)).setText(lb.b1.sharedInstance().getTraductionFromToken("CONSENTEMENT"));
                Button button = (Button) webviewCGV.findViewById(R.id.validateButton);
                webviewCGV.G = button;
                button.setText(lb.b1.sharedInstance().getTraductionFromToken("VALIDER"));
                webviewCGV.G.setTypeface(typeface);
                webviewCGV.G.setOnClickListener(webviewCGV.N);
                TextView textView = (TextView) webviewCGV.findViewById(R.id.textConsent1);
                webviewCGV.H = textView;
                textView.setText(lb.b1.sharedInstance().getTraductionFromToken("PREMIER_CONSENTEMENT_CREATION_COMPTE"));
                webviewCGV.H.setTypeface(typeface);
                ImageView imageView = (ImageView) webviewCGV.findViewById(R.id.toggle1);
                webviewCGV.K = imageView;
                imageView.setOnClickListener(webviewCGV.O);
                ImageView imageView2 = (ImageView) webviewCGV.findViewById(R.id.toggle2);
                webviewCGV.L = imageView2;
                imageView2.setOnClickListener(webviewCGV.P);
                ImageView imageView3 = (ImageView) webviewCGV.findViewById(R.id.toggle3);
                webviewCGV.M = imageView3;
                imageView3.setOnClickListener(webviewCGV.Q);
                TextView textView2 = (TextView) webviewCGV.findViewById(R.id.textConsent2);
                webviewCGV.I = textView2;
                textView2.setText(lb.b1.sharedInstance().getTraductionFromToken("SECOND_CONSENTEMENT_CREATION_COMPTE"));
                webviewCGV.I.setTypeface(typeface);
                if (!Locale.getDefault().getCountry().equals("KR")) {
                    lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
                    Objects.requireNonNull(currentInstance);
                    if (currentInstance.getBaseLogiqueId() != 10) {
                        return;
                    }
                }
                webviewCGV.F.setVisibility(0);
                TextView textView3 = (TextView) webviewCGV.findViewById(R.id.textConsent3);
                webviewCGV.J = textView3;
                textView3.setText(lb.b1.sharedInstance().getTraductionFromToken("TROISIEME_CONSENTEMENT_CREATION_COMPTE"));
                webviewCGV.J.setTypeface(typeface);
            }
        } catch (Exception unused) {
        }
    }
}
