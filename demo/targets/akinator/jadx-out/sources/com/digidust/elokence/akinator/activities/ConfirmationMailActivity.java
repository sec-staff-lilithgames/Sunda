package com.digidust.elokence.akinator.activities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.applovin.mediation.nativeAds.a;
import com.digidust.elokence.akinator.freemium.R;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ConfirmationMailActivity extends AkActivity {
    public static final /* synthetic */ int G = 0;
    public TextView C;
    public TextView D;
    public TextView E;
    public final a F = new a(this, 28);

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirmation_mail);
        TextView textView = (TextView) findViewById(R.id.confirmationMailTitle);
        this.C = textView;
        textView.setTypeface(this.f21690m);
        this.C.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_EMAIL_CONFIRMER_EMAIL_BTN_LABEL"));
        TextView textView2 = (TextView) findViewById(R.id.confirmationMailExplication);
        this.D = textView2;
        Typeface typeface = this.f21687j;
        textView2.setTypeface(typeface);
        this.D.setText(b1.sharedInstance().getTraductionFromToken("PR_EMAIL_CONFIRMATION_INFO"));
        SpannableString spannableString = new SpannableString(" " + b1.sharedInstance().getTraductionFromToken("PR_EMAIL_CONFIRMATION_SEND"));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        TextView textView3 = (TextView) findViewById(R.id.confirmationMailLik);
        this.E = textView3;
        textView3.setTypeface(typeface);
        this.E.setText(spannableString);
        this.E.setOnClickListener(this.F);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
