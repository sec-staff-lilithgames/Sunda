package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import ca.m;
import com.digidust.elokence.akinator.activities.CompteActivity;
import com.digidust.elokence.akinator.activities.MenuActivity;
import com.digidust.elokence.akinator.activities.ModifyProfileActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.core.request.NJc.yFkbx;
import j1.o2;
import lb.b1;
import ma.b;
import o9.v;
import o9.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CompteActivity extends AkActivity {
    public static final /* synthetic */ int R = 0;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public EditText H;
    public FirebaseAnalytics I;
    public Button J;
    public Button K;
    public final v L;
    public final v M;
    public final v N;
    public final v O;
    public final v P;
    public final v Q;

    /* JADX WARN: Type inference failed for: r0v0, types: [o9.v] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o9.v] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o9.v] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o9.v] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o9.v] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o9.v] */
    public CompteActivity() {
        final int i10 = 0;
        this.L = new View.OnClickListener(this) { // from class: o9.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CompteActivity f78609c;

            {
                this.f78609c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                CompteActivity compteActivity = this.f78609c;
                switch (i11) {
                    case 0:
                        int i12 = CompteActivity.R;
                        compteActivity.getClass();
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        ca.m.sharedInstance().setHasBeenForcedToDisconnect(false);
                        ca.m.sharedInstance().eraseUserData();
                        ca.r.sharedInstance().setIdJoueurAccount("none");
                        ca.m.sharedInstance().setPseudoUser("");
                        ca.m.sharedInstance().changeClassementState(0);
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 1:
                        int i13 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent.putExtra("emailChange", true);
                        compteActivity.startActivity(intent);
                        compteActivity.finish();
                        break;
                    case 2:
                        int i14 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent2 = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent2.putExtra("emailChange", false);
                        compteActivity.startActivity(intent2);
                        compteActivity.finish();
                        break;
                    case 3:
                        int i15 = CompteActivity.R;
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 4:
                        if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() != 0) {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(compteActivity, 6)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(compteActivity, 10));
                            break;
                        } else if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() >= 3) {
                            if (compteActivity.H.getText().length() == 0) {
                                Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_NOM_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken(yFkbx.jPYOOgAS), 0).show();
                            break;
                        }
                        break;
                    default:
                        int i16 = CompteActivity.R;
                        da.f fVar = new da.f(compteActivity);
                        fVar.setTypeDoubleButtonsCustom(lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"), lb.b1.sharedInstance().getTraductionFromToken("COMPTE_TEXT_SUPPRIMER_COMPTE"));
                        fVar.setConfirmeListener(new y(compteActivity));
                        break;
                }
            }
        };
        final int i11 = 1;
        this.M = new View.OnClickListener(this) { // from class: o9.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CompteActivity f78609c;

            {
                this.f78609c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                CompteActivity compteActivity = this.f78609c;
                switch (i112) {
                    case 0:
                        int i12 = CompteActivity.R;
                        compteActivity.getClass();
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        ca.m.sharedInstance().setHasBeenForcedToDisconnect(false);
                        ca.m.sharedInstance().eraseUserData();
                        ca.r.sharedInstance().setIdJoueurAccount("none");
                        ca.m.sharedInstance().setPseudoUser("");
                        ca.m.sharedInstance().changeClassementState(0);
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 1:
                        int i13 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent.putExtra("emailChange", true);
                        compteActivity.startActivity(intent);
                        compteActivity.finish();
                        break;
                    case 2:
                        int i14 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent2 = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent2.putExtra("emailChange", false);
                        compteActivity.startActivity(intent2);
                        compteActivity.finish();
                        break;
                    case 3:
                        int i15 = CompteActivity.R;
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 4:
                        if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() != 0) {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(compteActivity, 6)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(compteActivity, 10));
                            break;
                        } else if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() >= 3) {
                            if (compteActivity.H.getText().length() == 0) {
                                Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_NOM_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken(yFkbx.jPYOOgAS), 0).show();
                            break;
                        }
                        break;
                    default:
                        int i16 = CompteActivity.R;
                        da.f fVar = new da.f(compteActivity);
                        fVar.setTypeDoubleButtonsCustom(lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"), lb.b1.sharedInstance().getTraductionFromToken("COMPTE_TEXT_SUPPRIMER_COMPTE"));
                        fVar.setConfirmeListener(new y(compteActivity));
                        break;
                }
            }
        };
        final int i12 = 2;
        this.N = new View.OnClickListener(this) { // from class: o9.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CompteActivity f78609c;

            {
                this.f78609c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                CompteActivity compteActivity = this.f78609c;
                switch (i112) {
                    case 0:
                        int i122 = CompteActivity.R;
                        compteActivity.getClass();
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        ca.m.sharedInstance().setHasBeenForcedToDisconnect(false);
                        ca.m.sharedInstance().eraseUserData();
                        ca.r.sharedInstance().setIdJoueurAccount("none");
                        ca.m.sharedInstance().setPseudoUser("");
                        ca.m.sharedInstance().changeClassementState(0);
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 1:
                        int i13 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent.putExtra("emailChange", true);
                        compteActivity.startActivity(intent);
                        compteActivity.finish();
                        break;
                    case 2:
                        int i14 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent2 = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent2.putExtra("emailChange", false);
                        compteActivity.startActivity(intent2);
                        compteActivity.finish();
                        break;
                    case 3:
                        int i15 = CompteActivity.R;
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 4:
                        if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() != 0) {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(compteActivity, 6)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(compteActivity, 10));
                            break;
                        } else if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() >= 3) {
                            if (compteActivity.H.getText().length() == 0) {
                                Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_NOM_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken(yFkbx.jPYOOgAS), 0).show();
                            break;
                        }
                        break;
                    default:
                        int i16 = CompteActivity.R;
                        da.f fVar = new da.f(compteActivity);
                        fVar.setTypeDoubleButtonsCustom(lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"), lb.b1.sharedInstance().getTraductionFromToken("COMPTE_TEXT_SUPPRIMER_COMPTE"));
                        fVar.setConfirmeListener(new y(compteActivity));
                        break;
                }
            }
        };
        final int i13 = 3;
        this.O = new View.OnClickListener(this) { // from class: o9.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CompteActivity f78609c;

            {
                this.f78609c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                CompteActivity compteActivity = this.f78609c;
                switch (i112) {
                    case 0:
                        int i122 = CompteActivity.R;
                        compteActivity.getClass();
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        ca.m.sharedInstance().setHasBeenForcedToDisconnect(false);
                        ca.m.sharedInstance().eraseUserData();
                        ca.r.sharedInstance().setIdJoueurAccount("none");
                        ca.m.sharedInstance().setPseudoUser("");
                        ca.m.sharedInstance().changeClassementState(0);
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 1:
                        int i132 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent.putExtra("emailChange", true);
                        compteActivity.startActivity(intent);
                        compteActivity.finish();
                        break;
                    case 2:
                        int i14 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent2 = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent2.putExtra("emailChange", false);
                        compteActivity.startActivity(intent2);
                        compteActivity.finish();
                        break;
                    case 3:
                        int i15 = CompteActivity.R;
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 4:
                        if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() != 0) {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(compteActivity, 6)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(compteActivity, 10));
                            break;
                        } else if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() >= 3) {
                            if (compteActivity.H.getText().length() == 0) {
                                Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_NOM_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken(yFkbx.jPYOOgAS), 0).show();
                            break;
                        }
                        break;
                    default:
                        int i16 = CompteActivity.R;
                        da.f fVar = new da.f(compteActivity);
                        fVar.setTypeDoubleButtonsCustom(lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"), lb.b1.sharedInstance().getTraductionFromToken("COMPTE_TEXT_SUPPRIMER_COMPTE"));
                        fVar.setConfirmeListener(new y(compteActivity));
                        break;
                }
            }
        };
        final int i14 = 4;
        this.P = new View.OnClickListener(this) { // from class: o9.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CompteActivity f78609c;

            {
                this.f78609c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i14;
                CompteActivity compteActivity = this.f78609c;
                switch (i112) {
                    case 0:
                        int i122 = CompteActivity.R;
                        compteActivity.getClass();
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        ca.m.sharedInstance().setHasBeenForcedToDisconnect(false);
                        ca.m.sharedInstance().eraseUserData();
                        ca.r.sharedInstance().setIdJoueurAccount("none");
                        ca.m.sharedInstance().setPseudoUser("");
                        ca.m.sharedInstance().changeClassementState(0);
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 1:
                        int i132 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent.putExtra("emailChange", true);
                        compteActivity.startActivity(intent);
                        compteActivity.finish();
                        break;
                    case 2:
                        int i142 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent2 = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent2.putExtra("emailChange", false);
                        compteActivity.startActivity(intent2);
                        compteActivity.finish();
                        break;
                    case 3:
                        int i15 = CompteActivity.R;
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 4:
                        if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() != 0) {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(compteActivity, 6)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(compteActivity, 10));
                            break;
                        } else if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() >= 3) {
                            if (compteActivity.H.getText().length() == 0) {
                                Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_NOM_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken(yFkbx.jPYOOgAS), 0).show();
                            break;
                        }
                        break;
                    default:
                        int i16 = CompteActivity.R;
                        da.f fVar = new da.f(compteActivity);
                        fVar.setTypeDoubleButtonsCustom(lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"), lb.b1.sharedInstance().getTraductionFromToken("COMPTE_TEXT_SUPPRIMER_COMPTE"));
                        fVar.setConfirmeListener(new y(compteActivity));
                        break;
                }
            }
        };
        final int i15 = 5;
        this.Q = new View.OnClickListener(this) { // from class: o9.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CompteActivity f78609c;

            {
                this.f78609c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i15;
                CompteActivity compteActivity = this.f78609c;
                switch (i112) {
                    case 0:
                        int i122 = CompteActivity.R;
                        compteActivity.getClass();
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        ca.m.sharedInstance().setHasBeenForcedToDisconnect(false);
                        ca.m.sharedInstance().eraseUserData();
                        ca.r.sharedInstance().setIdJoueurAccount("none");
                        ca.m.sharedInstance().setPseudoUser("");
                        ca.m.sharedInstance().changeClassementState(0);
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 1:
                        int i132 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent.putExtra("emailChange", true);
                        compteActivity.startActivity(intent);
                        compteActivity.finish();
                        break;
                    case 2:
                        int i142 = CompteActivity.R;
                        compteActivity.getClass();
                        Intent intent2 = new Intent(compteActivity, (Class<?>) ModifyProfileActivity.class);
                        intent2.putExtra("emailChange", false);
                        compteActivity.startActivity(intent2);
                        compteActivity.finish();
                        break;
                    case 3:
                        int i152 = CompteActivity.R;
                        compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                        compteActivity.finish();
                        break;
                    case 4:
                        if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() != 0) {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(compteActivity, 6)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(compteActivity, 10));
                            break;
                        } else if (compteActivity.H.getText().length() <= 6 && compteActivity.H.getText().length() >= 3) {
                            if (compteActivity.H.getText().length() == 0) {
                                Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_NOM_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken(yFkbx.jPYOOgAS), 0).show();
                            break;
                        }
                        break;
                    default:
                        int i16 = CompteActivity.R;
                        da.f fVar = new da.f(compteActivity);
                        fVar.setTypeDoubleButtonsCustom(lb.b1.sharedInstance().getTraductionFromToken("OK"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"), lb.b1.sharedInstance().getTraductionFromToken("COMPTE_TEXT_SUPPRIMER_COMPTE"));
                        fVar.setConfirmeListener(new y(compteActivity));
                        break;
                }
            }
        };
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) MenuActivity.class));
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_compte);
        ((RelativeLayout) findViewById(R.id.mainLayout)).setOnApplyWindowInsetsListener(new w());
        this.I = FirebaseAnalytics.getInstance(this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeBackButton);
        v vVar = this.O;
        relativeLayout.setOnClickListener(vVar);
        Button button = (Button) findViewById(R.id.deconnexionButton);
        this.K = button;
        Typeface typeface = this.f21686i;
        button.setTypeface(typeface);
        o2.w(this.K, "COMPTE_DECONNEXION_BTN");
        this.K.setAllCaps(false);
        this.K.setOnClickListener(this.L);
        Button button2 = (Button) findViewById(R.id.deleteAccountButton);
        this.J = button2;
        button2.setTypeface(typeface);
        o2.w(this.J, "COMPTE_SUPPRIMER_BTN");
        this.J.setAllCaps(false);
        this.J.setOnClickListener(this.Q);
        TextView textView = (TextView) findViewById(R.id.saveText);
        this.C = textView;
        Typeface typeface2 = this.f21687j;
        textView.setTypeface(typeface2);
        o2.x(this.C, "COMPTE_ENREGISTER");
        this.C.setOnClickListener(this.P);
        TextView textView2 = (TextView) findViewById(R.id.paramCompteText);
        this.D = textView2;
        textView2.setTypeface(typeface2);
        this.D.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_PARAMETRES_TTR"));
        TextView textView3 = (TextView) findViewById(R.id.textNomLabel);
        this.E = textView3;
        textView3.setTypeface(typeface2);
        this.E.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_NOM"));
        TextView textView4 = (TextView) findViewById(R.id.textEmail);
        this.F = textView4;
        textView4.setTypeface(typeface2);
        this.F.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_EMAIL"));
        TextView textView5 = (TextView) findViewById(R.id.textPassword);
        this.G = textView5;
        textView5.setTypeface(typeface2);
        this.G.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_MOT_DE_PASSE"));
        EditText editText = (EditText) findViewById(R.id.usernameEditText);
        this.H = editText;
        editText.setFilters(b.getFilterAndLength());
        this.H.setTypeface(typeface2);
        this.H.setText(m.sharedInstance().getPseudoUser());
        ((RelativeLayout) findViewById(R.id.relativeLayoutEmail)).setOnClickListener(this.M);
        ((RelativeLayout) findViewById(R.id.relativeLayoutPassword)).setOnClickListener(this.N);
        ((ImageView) findViewById(R.id.backImage)).setOnClickListener(vVar);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        disableAdOneTime();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
