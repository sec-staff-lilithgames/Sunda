package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.ModifyPasswordAfterResetActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.C3191e4;
import j1.o2;
import java.util.regex.Pattern;
import lb.b1;
import ma.b;
import o9.h3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ModifyPasswordAfterResetActivity extends AkActivity {
    public static final /* synthetic */ int M = 0;
    public TextView C;
    public TextView D;
    public TextView E;
    public EditText F;
    public ImageView G;
    public boolean H = true;
    public String I;
    public final h3 J;
    public final h3 K;
    public final h3 L;

    /* JADX WARN: Type inference failed for: r0v1, types: [o9.h3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o9.h3] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o9.h3] */
    public ModifyPasswordAfterResetActivity() {
        final int i10 = 0;
        this.J = new View.OnClickListener(this) { // from class: o9.h3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ModifyPasswordAfterResetActivity f78189c;

            {
                this.f78189c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ModifyPasswordAfterResetActivity modifyPasswordAfterResetActivity = this.f78189c;
                switch (i11) {
                    case 0:
                        if (!modifyPasswordAfterResetActivity.respectRegexPassword(modifyPasswordAfterResetActivity.F.getText().toString())) {
                            Toast.makeText(modifyPasswordAfterResetActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_PASSWORD"), 0).show();
                            break;
                        } else {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(modifyPasswordAfterResetActivity, 10)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(modifyPasswordAfterResetActivity, 16));
                            break;
                        }
                    case 1:
                        if (!modifyPasswordAfterResetActivity.H) {
                            modifyPasswordAfterResetActivity.G.setBackgroundResource(R.drawable.btn_hidden_eye);
                            modifyPasswordAfterResetActivity.F.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            modifyPasswordAfterResetActivity.H = true;
                            EditText editText = modifyPasswordAfterResetActivity.F;
                            editText.setSelection(editText.getText().length());
                            break;
                        } else {
                            modifyPasswordAfterResetActivity.G.setBackgroundResource(R.drawable.btn_visible_eye);
                            modifyPasswordAfterResetActivity.F.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            modifyPasswordAfterResetActivity.H = false;
                            EditText editText2 = modifyPasswordAfterResetActivity.F;
                            editText2.setSelection(editText2.getText().length());
                            break;
                        }
                    default:
                        int i12 = ModifyPasswordAfterResetActivity.M;
                        modifyPasswordAfterResetActivity.startActivity(new Intent(modifyPasswordAfterResetActivity, (Class<?>) ConnectActivity.class));
                        modifyPasswordAfterResetActivity.finish();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.K = new View.OnClickListener(this) { // from class: o9.h3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ModifyPasswordAfterResetActivity f78189c;

            {
                this.f78189c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                ModifyPasswordAfterResetActivity modifyPasswordAfterResetActivity = this.f78189c;
                switch (i112) {
                    case 0:
                        if (!modifyPasswordAfterResetActivity.respectRegexPassword(modifyPasswordAfterResetActivity.F.getText().toString())) {
                            Toast.makeText(modifyPasswordAfterResetActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_PASSWORD"), 0).show();
                            break;
                        } else {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(modifyPasswordAfterResetActivity, 10)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(modifyPasswordAfterResetActivity, 16));
                            break;
                        }
                    case 1:
                        if (!modifyPasswordAfterResetActivity.H) {
                            modifyPasswordAfterResetActivity.G.setBackgroundResource(R.drawable.btn_hidden_eye);
                            modifyPasswordAfterResetActivity.F.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            modifyPasswordAfterResetActivity.H = true;
                            EditText editText = modifyPasswordAfterResetActivity.F;
                            editText.setSelection(editText.getText().length());
                            break;
                        } else {
                            modifyPasswordAfterResetActivity.G.setBackgroundResource(R.drawable.btn_visible_eye);
                            modifyPasswordAfterResetActivity.F.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            modifyPasswordAfterResetActivity.H = false;
                            EditText editText2 = modifyPasswordAfterResetActivity.F;
                            editText2.setSelection(editText2.getText().length());
                            break;
                        }
                    default:
                        int i12 = ModifyPasswordAfterResetActivity.M;
                        modifyPasswordAfterResetActivity.startActivity(new Intent(modifyPasswordAfterResetActivity, (Class<?>) ConnectActivity.class));
                        modifyPasswordAfterResetActivity.finish();
                        break;
                }
            }
        };
        final int i12 = 2;
        this.L = new View.OnClickListener(this) { // from class: o9.h3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ModifyPasswordAfterResetActivity f78189c;

            {
                this.f78189c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                ModifyPasswordAfterResetActivity modifyPasswordAfterResetActivity = this.f78189c;
                switch (i112) {
                    case 0:
                        if (!modifyPasswordAfterResetActivity.respectRegexPassword(modifyPasswordAfterResetActivity.F.getText().toString())) {
                            Toast.makeText(modifyPasswordAfterResetActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_PASSWORD"), 0).show();
                            break;
                        } else {
                            mt.b0.fromCallable(new com.vungle.ads.internal.session.a(modifyPasswordAfterResetActivity, 10)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(modifyPasswordAfterResetActivity, 16));
                            break;
                        }
                    case 1:
                        if (!modifyPasswordAfterResetActivity.H) {
                            modifyPasswordAfterResetActivity.G.setBackgroundResource(R.drawable.btn_hidden_eye);
                            modifyPasswordAfterResetActivity.F.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            modifyPasswordAfterResetActivity.H = true;
                            EditText editText = modifyPasswordAfterResetActivity.F;
                            editText.setSelection(editText.getText().length());
                            break;
                        } else {
                            modifyPasswordAfterResetActivity.G.setBackgroundResource(R.drawable.btn_visible_eye);
                            modifyPasswordAfterResetActivity.F.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            modifyPasswordAfterResetActivity.H = false;
                            EditText editText2 = modifyPasswordAfterResetActivity.F;
                            editText2.setSelection(editText2.getText().length());
                            break;
                        }
                    default:
                        int i122 = ModifyPasswordAfterResetActivity.M;
                        modifyPasswordAfterResetActivity.startActivity(new Intent(modifyPasswordAfterResetActivity, (Class<?>) ConnectActivity.class));
                        modifyPasswordAfterResetActivity.finish();
                        break;
                }
            }
        };
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, (Class<?>) ConnectActivity.class));
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reset_password);
        Uri data = getIntent().getData();
        String stringExtra = getIntent().getStringExtra("url");
        if (data == null || data.toString().isEmpty()) {
            this.I = stringExtra.split(C3191e4.i.f36525b)[1];
        } else {
            this.I = data.toString().split(C3191e4.i.f36525b)[1];
        }
        ((ImageView) findViewById(R.id.backImage)).setOnClickListener(this.L);
        TextView textView = (TextView) findViewById(R.id.saveText);
        this.C = textView;
        Typeface typeface = this.f21687j;
        textView.setTypeface(typeface);
        o2.x(this.C, "COMPTE_ENREGISTER");
        this.C.setOnClickListener(this.J);
        TextView textView2 = (TextView) findViewById(R.id.modifyText);
        this.D = textView2;
        textView2.setTypeface(typeface);
        this.D.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_REINITIALISATION_MOT_DE_PASSE_TTR"));
        TextView textView3 = (TextView) findViewById(R.id.textPassword);
        this.E = textView3;
        textView3.setTypeface(typeface);
        this.E.setText(b1.sharedInstance().getTraductionFromToken("COMPTE_NOUVEAU_MOT_DE_PASSE"));
        EditText editText = (EditText) findViewById(R.id.newPasswordEditText);
        this.F = editText;
        editText.setTypeface(typeface);
        this.F.setFilters(b.getFilter());
        ImageView imageView = (ImageView) findViewById(R.id.eyeButton);
        this.G = imageView;
        imageView.setOnClickListener(this.K);
        this.G.setVisibility(0);
    }

    public boolean respectRegexPassword(String str) {
        return Pattern.compile("^(?=.{8,}$)(?=.*[a-zA-Z])(?=.*[0-9]).*$").matcher(str).matches();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
