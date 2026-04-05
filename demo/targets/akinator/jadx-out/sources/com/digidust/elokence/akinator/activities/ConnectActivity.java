package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import ca.m;
import ca.v;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import j1.o2;
import lb.b1;
import ma.b;
import o9.a0;
import o9.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ConnectActivity extends AkActivity {
    public static final /* synthetic */ int U = 0;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public EditText H;
    public EditText I;
    public RelativeLayout J;
    public FirebaseAnalytics K;
    public ImageView L;
    public Button M;
    public ProgressBar N = null;
    public boolean O = false;
    public boolean P = false;
    public boolean Q = true;
    public final z R;
    public final z S;
    public final z T;

    /* JADX WARN: Type inference failed for: r0v3, types: [o9.z] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o9.z] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o9.z] */
    public ConnectActivity() {
        final int i10 = 0;
        this.R = new View.OnClickListener(this) { // from class: o9.z

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConnectActivity f78705c;

            {
                this.f78705c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ConnectActivity connectActivity = this.f78705c;
                int i12 = 0;
                switch (i11) {
                    case 0:
                        if (!connectActivity.Q) {
                            connectActivity.L.setBackgroundResource(R.drawable.btn_hidden_eye);
                            connectActivity.I.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            connectActivity.Q = true;
                            EditText editText = connectActivity.I;
                            editText.setSelection(editText.getText().length());
                            break;
                        } else {
                            connectActivity.L.setBackgroundResource(R.drawable.btn_visible_eye);
                            connectActivity.I.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            connectActivity.Q = false;
                            EditText editText2 = connectActivity.I;
                            editText2.setSelection(editText2.getText().length());
                            break;
                        }
                    case 1:
                        int i13 = ConnectActivity.U;
                        da.f fVar = new da.f(connectActivity);
                        fVar.setTypeTwoButtonsOneEditText(lb.b1.sharedInstance().getTraductionFromToken("COMPTE_REINITIALISATION_MOTDEPASSE_EMAIL"), lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"));
                        fVar.setConfirmeListener(new d0(connectActivity));
                        break;
                    default:
                        connectActivity.N.setVisibility(0);
                        connectActivity.J.setAlpha(0.5f);
                        connectActivity.M.setEnabled(false);
                        if (connectActivity.H.length() != 0) {
                            if (connectActivity.I.length() != 0) {
                                mt.b0.fromCallable(new b0(connectActivity, i12)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new c0(connectActivity, i12));
                                break;
                            } else {
                                Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                connectActivity.t();
                                connectActivity.M.setEnabled(true);
                                break;
                            }
                        } else {
                            Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
                            connectActivity.t();
                            connectActivity.M.setEnabled(true);
                            break;
                        }
                }
            }
        };
        final int i11 = 1;
        this.S = new View.OnClickListener(this) { // from class: o9.z

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConnectActivity f78705c;

            {
                this.f78705c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                ConnectActivity connectActivity = this.f78705c;
                int i12 = 0;
                switch (i112) {
                    case 0:
                        if (!connectActivity.Q) {
                            connectActivity.L.setBackgroundResource(R.drawable.btn_hidden_eye);
                            connectActivity.I.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            connectActivity.Q = true;
                            EditText editText = connectActivity.I;
                            editText.setSelection(editText.getText().length());
                            break;
                        } else {
                            connectActivity.L.setBackgroundResource(R.drawable.btn_visible_eye);
                            connectActivity.I.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            connectActivity.Q = false;
                            EditText editText2 = connectActivity.I;
                            editText2.setSelection(editText2.getText().length());
                            break;
                        }
                    case 1:
                        int i13 = ConnectActivity.U;
                        da.f fVar = new da.f(connectActivity);
                        fVar.setTypeTwoButtonsOneEditText(lb.b1.sharedInstance().getTraductionFromToken("COMPTE_REINITIALISATION_MOTDEPASSE_EMAIL"), lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"));
                        fVar.setConfirmeListener(new d0(connectActivity));
                        break;
                    default:
                        connectActivity.N.setVisibility(0);
                        connectActivity.J.setAlpha(0.5f);
                        connectActivity.M.setEnabled(false);
                        if (connectActivity.H.length() != 0) {
                            if (connectActivity.I.length() != 0) {
                                mt.b0.fromCallable(new b0(connectActivity, i12)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new c0(connectActivity, i12));
                                break;
                            } else {
                                Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                connectActivity.t();
                                connectActivity.M.setEnabled(true);
                                break;
                            }
                        } else {
                            Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
                            connectActivity.t();
                            connectActivity.M.setEnabled(true);
                            break;
                        }
                }
            }
        };
        final int i12 = 2;
        this.T = new View.OnClickListener(this) { // from class: o9.z

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConnectActivity f78705c;

            {
                this.f78705c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                ConnectActivity connectActivity = this.f78705c;
                int i122 = 0;
                switch (i112) {
                    case 0:
                        if (!connectActivity.Q) {
                            connectActivity.L.setBackgroundResource(R.drawable.btn_hidden_eye);
                            connectActivity.I.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            connectActivity.Q = true;
                            EditText editText = connectActivity.I;
                            editText.setSelection(editText.getText().length());
                            break;
                        } else {
                            connectActivity.L.setBackgroundResource(R.drawable.btn_visible_eye);
                            connectActivity.I.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            connectActivity.Q = false;
                            EditText editText2 = connectActivity.I;
                            editText2.setSelection(editText2.getText().length());
                            break;
                        }
                    case 1:
                        int i13 = ConnectActivity.U;
                        da.f fVar = new da.f(connectActivity);
                        fVar.setTypeTwoButtonsOneEditText(lb.b1.sharedInstance().getTraductionFromToken("COMPTE_REINITIALISATION_MOTDEPASSE_EMAIL"), lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"));
                        fVar.setConfirmeListener(new d0(connectActivity));
                        break;
                    default:
                        connectActivity.N.setVisibility(0);
                        connectActivity.J.setAlpha(0.5f);
                        connectActivity.M.setEnabled(false);
                        if (connectActivity.H.length() != 0) {
                            if (connectActivity.I.length() != 0) {
                                mt.b0.fromCallable(new b0(connectActivity, i122)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new c0(connectActivity, i122));
                                break;
                            } else {
                                Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                connectActivity.t();
                                connectActivity.M.setEnabled(true);
                                break;
                            }
                        } else {
                            Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
                            connectActivity.t();
                            connectActivity.M.setEnabled(true);
                            break;
                        }
                }
            }
        };
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(false);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, (Class<?>) InscriptionActivity.class);
        intent.putExtra("coming_from_preinscription", false);
        startActivity(intent);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_connect);
        this.K = FirebaseAnalytics.getInstance(this);
        try {
            if (getIntent().getData().equals("ak://akinator/activation")) {
                v.sharedInstance().activateAccount(this.K);
            }
        } catch (Exception unused) {
        }
        this.J = (RelativeLayout) findViewById(R.id.mainLayoutConnect);
        TextView textView = (TextView) findViewById(R.id.textPopupComptePasActive);
        this.G = textView;
        Typeface typeface = this.f21687j;
        textView.setTypeface(typeface);
        this.G.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_NOUVEAU_MAIL_ACTIVATION_CONFIRM"));
        this.N = (ProgressBar) findViewById(R.id.loadingBarConnect);
        TextView textView2 = (TextView) findViewById(R.id.passwordForgetText);
        this.F = textView2;
        o2.x(textView2, "COMPTE_MOT_DE_PASSE_OUBLIE");
        this.F.setTypeface(typeface);
        this.F.setOnClickListener(this.S);
        TextView textView3 = (TextView) findViewById(R.id.connexionText);
        this.C = textView3;
        textView3.setTypeface(this.f21690m);
        this.C.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_SE_CONNECTER_TITRE"));
        EditText editText = (EditText) findViewById(R.id.emailEditText);
        this.H = editText;
        editText.setHint(b1.sharedInstance().getTraductionFromToken("COMPTE_EMAIL"));
        this.H.setTypeface(typeface);
        this.H.setFilters(b.getFilter());
        EditText editText2 = (EditText) findViewById(R.id.passwordEditText);
        this.I = editText2;
        editText2.setTypeface(typeface);
        this.I.setHint(b1.sharedInstance().getTraductionFromToken("COMPTE_MOT_DE_PASSE"));
        this.I.setFilters(b.getFilter());
        if (getIntent().getBooleanExtra("keyComeFromDefi", false)) {
            this.O = true;
        }
        if (m.sharedInstance().isComingFromPopupClassement()) {
            this.P = true;
        }
        this.I.setOnEditorActionListener(new a0(this, 0));
        ImageView imageView = (ImageView) findViewById(R.id.eyeButton);
        this.L = imageView;
        imageView.setOnClickListener(this.R);
        if (m.sharedInstance().hasBeenForcedToDisconnect()) {
            this.I.setText("fdfdffdfd");
            this.H.setText(m.sharedInstance().getMailUser());
            this.L.setVisibility(4);
        }
        Button button = (Button) findViewById(R.id.connectButton);
        this.M = button;
        o2.w(button, "COMPTE_CONNEXION");
        this.M.setOnClickListener(this.T);
        TextView textView4 = (TextView) findViewById(R.id.explicationConnexionText);
        this.D = textView4;
        textView4.setTypeface(typeface);
        this.D.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_PAS_DE_COMPTE"));
        SpannableString spannableString = new SpannableString(" " + b1.sharedInstance().getTraductionFromToken("COMPTE_INSCRIVEZ_VOUS"));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        TextView textView5 = (TextView) findViewById(R.id.connectText);
        this.E = textView5;
        textView5.setTypeface(typeface);
        this.E.setText(spannableString);
    }

    public final void t() {
        this.N.setVisibility(8);
        this.J.setAlpha(1.0f);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
