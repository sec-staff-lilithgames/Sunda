package com.digidust.elokence.akinator.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import o9.s4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PostInscriptionActivity extends AkActivity {
    public static final /* synthetic */ int F = 0;
    public TextView C;
    public Button D;
    public final s4 E = new s4(this, 1);

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_post_inscription);
        this.C = (TextView) findViewById(R.id.explicationPostInscriptionText);
        this.D = (Button) findViewById(R.id.connectButton);
        this.C.setTypeface(this.f21687j);
        this.D.setTypeface(this.f21686i);
        if (getIntent().getIntExtra("resConnect", -3) == 0) {
            o2.w(this.D, "OK");
            this.D.setOnClickListener(new s4(this, 0));
        } else {
            o2.x(this.C, "COMPTE_SUCCES_INSCRIPTION");
            o2.w(this.D, "COMPTE_CONNEXION");
            this.D.setOnClickListener(this.E);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
