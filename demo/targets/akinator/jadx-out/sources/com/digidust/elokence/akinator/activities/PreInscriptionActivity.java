package com.digidust.elokence.akinator.activities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import ca.r;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import j1.o2;
import lb.b1;
import ma.b;
import o9.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PreInscriptionActivity extends AkActivity {
    public Button C;
    public EditText D;
    public FirebaseAnalytics E;
    public TextView F;
    public TextView G;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(true);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pre_inscription);
        this.E = FirebaseAnalytics.getInstance(this);
        Button button = (Button) findViewById(R.id.continueButton);
        this.C = button;
        button.setTypeface(this.f21686i);
        o2.w(this.C, "CONTINUER");
        this.C.setOnClickListener(new j0(this, 7));
        TextView textView = (TextView) findViewById(R.id.textRenseignementPseudo);
        this.G = textView;
        Typeface typeface = this.f21687j;
        textView.setTypeface(typeface);
        this.G.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_RENSEIGNE_TON_PSEUDO"));
        EditText editText = (EditText) findViewById(R.id.nameEditText);
        this.D = editText;
        editText.setFilters(b.getFilterAndLength());
        this.D.setTypeface(typeface);
        this.D.setHint(b1.sharedInstance().getTraductionFromToken("COMPTE_NOM"));
        if (r.sharedInstance().getNomJoueur() != null) {
            this.D.setText(r.sharedInstance().getNomJoueur());
        }
        TextView textView2 = (TextView) findViewById(R.id.inscriptionText);
        this.F = textView2;
        textView2.setTypeface(this.f21690m);
        o2.x(this.F, "COMPTE_INSCRIPTION");
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
