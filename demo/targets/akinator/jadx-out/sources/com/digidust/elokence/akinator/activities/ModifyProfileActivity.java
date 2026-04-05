package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.CompteActivity;
import com.digidust.elokence.akinator.activities.ModifyProfileActivity;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import java.util.regex.Pattern;
import ma.b;
import o9.j3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ModifyProfileActivity extends AkActivity {
    public static final /* synthetic */ int Q = 0;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public EditText G;
    public EditText H;
    public ImageView I;
    public ImageView J;
    public boolean K;
    public boolean L = true;
    public final j3 M;
    public final j3 N;
    public final j3 O;
    public final j3 P;

    /* JADX WARN: Type inference failed for: r0v1, types: [o9.j3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o9.j3] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o9.j3] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o9.j3] */
    public ModifyProfileActivity() {
        final int i10 = 0;
        this.M = new View.OnClickListener(this) { // from class: o9.j3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ModifyProfileActivity f78259c;

            {
                this.f78259c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ModifyProfileActivity modifyProfileActivity = this.f78259c;
                switch (i11) {
                    case 0:
                        if (!modifyProfileActivity.K || (modifyProfileActivity.G.length() != 0 && modifyProfileActivity.H.length() != 0)) {
                            if (!modifyProfileActivity.K && (modifyProfileActivity.G.length() == 0 || modifyProfileActivity.H.length() == 0)) {
                                if (modifyProfileActivity.G.length() != 0) {
                                    if (modifyProfileActivity.H.length() != 0) {
                                        if (modifyProfileActivity.respectRegexPassword(modifyProfileActivity.H.getText().toString())) {
                                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_PASSWORD"), 0).show();
                                            break;
                                        }
                                    } else {
                                        Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                        break;
                                    }
                                } else {
                                    Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                    break;
                                }
                            } else {
                                mt.b0.fromCallable(new com.vungle.ads.internal.session.a(modifyProfileActivity, 11)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(modifyProfileActivity, 17));
                                break;
                            }
                        } else if (modifyProfileActivity.G.length() != 0) {
                            if (modifyProfileActivity.H.length() == 0) {
                                Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
                            break;
                        }
                        break;
                    case 1:
                        modifyProfileActivity.t(modifyProfileActivity.L, true);
                        break;
                    case 2:
                        modifyProfileActivity.t(modifyProfileActivity.L, false);
                        break;
                    default:
                        int i12 = ModifyProfileActivity.Q;
                        modifyProfileActivity.startActivity(new Intent(modifyProfileActivity, (Class<?>) CompteActivity.class));
                        modifyProfileActivity.finish();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.N = new View.OnClickListener(this) { // from class: o9.j3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ModifyProfileActivity f78259c;

            {
                this.f78259c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                ModifyProfileActivity modifyProfileActivity = this.f78259c;
                switch (i112) {
                    case 0:
                        if (!modifyProfileActivity.K || (modifyProfileActivity.G.length() != 0 && modifyProfileActivity.H.length() != 0)) {
                            if (!modifyProfileActivity.K && (modifyProfileActivity.G.length() == 0 || modifyProfileActivity.H.length() == 0)) {
                                if (modifyProfileActivity.G.length() != 0) {
                                    if (modifyProfileActivity.H.length() != 0) {
                                        if (modifyProfileActivity.respectRegexPassword(modifyProfileActivity.H.getText().toString())) {
                                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_PASSWORD"), 0).show();
                                            break;
                                        }
                                    } else {
                                        Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                        break;
                                    }
                                } else {
                                    Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                    break;
                                }
                            } else {
                                mt.b0.fromCallable(new com.vungle.ads.internal.session.a(modifyProfileActivity, 11)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(modifyProfileActivity, 17));
                                break;
                            }
                        } else if (modifyProfileActivity.G.length() != 0) {
                            if (modifyProfileActivity.H.length() == 0) {
                                Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
                            break;
                        }
                        break;
                    case 1:
                        modifyProfileActivity.t(modifyProfileActivity.L, true);
                        break;
                    case 2:
                        modifyProfileActivity.t(modifyProfileActivity.L, false);
                        break;
                    default:
                        int i12 = ModifyProfileActivity.Q;
                        modifyProfileActivity.startActivity(new Intent(modifyProfileActivity, (Class<?>) CompteActivity.class));
                        modifyProfileActivity.finish();
                        break;
                }
            }
        };
        final int i12 = 2;
        this.O = new View.OnClickListener(this) { // from class: o9.j3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ModifyProfileActivity f78259c;

            {
                this.f78259c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                ModifyProfileActivity modifyProfileActivity = this.f78259c;
                switch (i112) {
                    case 0:
                        if (!modifyProfileActivity.K || (modifyProfileActivity.G.length() != 0 && modifyProfileActivity.H.length() != 0)) {
                            if (!modifyProfileActivity.K && (modifyProfileActivity.G.length() == 0 || modifyProfileActivity.H.length() == 0)) {
                                if (modifyProfileActivity.G.length() != 0) {
                                    if (modifyProfileActivity.H.length() != 0) {
                                        if (modifyProfileActivity.respectRegexPassword(modifyProfileActivity.H.getText().toString())) {
                                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_PASSWORD"), 0).show();
                                            break;
                                        }
                                    } else {
                                        Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                        break;
                                    }
                                } else {
                                    Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                    break;
                                }
                            } else {
                                mt.b0.fromCallable(new com.vungle.ads.internal.session.a(modifyProfileActivity, 11)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(modifyProfileActivity, 17));
                                break;
                            }
                        } else if (modifyProfileActivity.G.length() != 0) {
                            if (modifyProfileActivity.H.length() == 0) {
                                Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
                            break;
                        }
                        break;
                    case 1:
                        modifyProfileActivity.t(modifyProfileActivity.L, true);
                        break;
                    case 2:
                        modifyProfileActivity.t(modifyProfileActivity.L, false);
                        break;
                    default:
                        int i122 = ModifyProfileActivity.Q;
                        modifyProfileActivity.startActivity(new Intent(modifyProfileActivity, (Class<?>) CompteActivity.class));
                        modifyProfileActivity.finish();
                        break;
                }
            }
        };
        final int i13 = 3;
        this.P = new View.OnClickListener(this) { // from class: o9.j3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ModifyProfileActivity f78259c;

            {
                this.f78259c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                ModifyProfileActivity modifyProfileActivity = this.f78259c;
                switch (i112) {
                    case 0:
                        if (!modifyProfileActivity.K || (modifyProfileActivity.G.length() != 0 && modifyProfileActivity.H.length() != 0)) {
                            if (!modifyProfileActivity.K && (modifyProfileActivity.G.length() == 0 || modifyProfileActivity.H.length() == 0)) {
                                if (modifyProfileActivity.G.length() != 0) {
                                    if (modifyProfileActivity.H.length() != 0) {
                                        if (modifyProfileActivity.respectRegexPassword(modifyProfileActivity.H.getText().toString())) {
                                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_PASSWORD"), 0).show();
                                            break;
                                        }
                                    } else {
                                        Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                        break;
                                    }
                                } else {
                                    Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                    break;
                                }
                            } else {
                                mt.b0.fromCallable(new com.vungle.ads.internal.session.a(modifyProfileActivity, 11)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(modifyProfileActivity, 17));
                                break;
                            }
                        } else if (modifyProfileActivity.G.length() != 0) {
                            if (modifyProfileActivity.H.length() == 0) {
                                Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_MOTDEPASSE_VIDE"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
                            break;
                        }
                        break;
                    case 1:
                        modifyProfileActivity.t(modifyProfileActivity.L, true);
                        break;
                    case 2:
                        modifyProfileActivity.t(modifyProfileActivity.L, false);
                        break;
                    default:
                        int i122 = ModifyProfileActivity.Q;
                        modifyProfileActivity.startActivity(new Intent(modifyProfileActivity, (Class<?>) CompteActivity.class));
                        modifyProfileActivity.finish();
                        break;
                }
            }
        };
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, (Class<?>) CompteActivity.class));
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_modify_profile);
        this.K = getIntent().getExtras().getBoolean("emailChange", false);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeBackButton);
        j3 j3Var = this.P;
        relativeLayout.setOnClickListener(j3Var);
        ((ImageView) findViewById(R.id.backImage)).setOnClickListener(j3Var);
        TextView textView = (TextView) findViewById(R.id.saveText);
        this.C = textView;
        Typeface typeface = this.f21687j;
        textView.setTypeface(typeface);
        o2.x(this.C, "COMPTE_ENREGISTER");
        this.C.setOnClickListener(this.M);
        TextView textView2 = (TextView) findViewById(R.id.modifyText);
        this.D = textView2;
        textView2.setTypeface(typeface);
        TextView textView3 = (TextView) findViewById(R.id.textFirstLabel);
        this.E = textView3;
        textView3.setTypeface(typeface);
        TextView textView4 = (TextView) findViewById(R.id.textSecondLabel);
        this.F = textView4;
        textView4.setTypeface(typeface);
        EditText editText = (EditText) findViewById(R.id.firstEditText);
        this.G = editText;
        editText.setTypeface(typeface);
        this.G.setFilters(b.getFilter());
        EditText editText2 = (EditText) findViewById(R.id.secondEditText);
        this.H = editText2;
        editText2.setTypeface(typeface);
        this.H.setFilters(b.getFilter());
        final int i10 = 0;
        this.G.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: o9.i3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyProfileActivity f78219b;

            {
                this.f78219b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i11, KeyEvent keyEvent) {
                int i12 = i10;
                ModifyProfileActivity modifyProfileActivity = this.f78219b;
                switch (i12) {
                    case 0:
                        if (i11 != 6) {
                            int i13 = ModifyProfileActivity.Q;
                            modifyProfileActivity.getClass();
                            break;
                        } else {
                            modifyProfileActivity.G.clearFocus();
                            ((InputMethodManager) modifyProfileActivity.getSystemService("input_method")).hideSoftInputFromWindow(modifyProfileActivity.G.getWindowToken(), 0);
                            break;
                        }
                    default:
                        if (i11 != 6) {
                            int i14 = ModifyProfileActivity.Q;
                            modifyProfileActivity.getClass();
                            break;
                        } else {
                            modifyProfileActivity.H.clearFocus();
                            ((InputMethodManager) modifyProfileActivity.getSystemService("input_method")).hideSoftInputFromWindow(modifyProfileActivity.H.getWindowToken(), 0);
                            break;
                        }
                }
                return false;
            }
        });
        final int i11 = 1;
        this.H.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: o9.i3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyProfileActivity f78219b;

            {
                this.f78219b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i112, KeyEvent keyEvent) {
                int i12 = i11;
                ModifyProfileActivity modifyProfileActivity = this.f78219b;
                switch (i12) {
                    case 0:
                        if (i112 != 6) {
                            int i13 = ModifyProfileActivity.Q;
                            modifyProfileActivity.getClass();
                            break;
                        } else {
                            modifyProfileActivity.G.clearFocus();
                            ((InputMethodManager) modifyProfileActivity.getSystemService("input_method")).hideSoftInputFromWindow(modifyProfileActivity.G.getWindowToken(), 0);
                            break;
                        }
                    default:
                        if (i112 != 6) {
                            int i14 = ModifyProfileActivity.Q;
                            modifyProfileActivity.getClass();
                            break;
                        } else {
                            modifyProfileActivity.H.clearFocus();
                            ((InputMethodManager) modifyProfileActivity.getSystemService("input_method")).hideSoftInputFromWindow(modifyProfileActivity.H.getWindowToken(), 0);
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.firstEyeButton);
        this.I = imageView;
        imageView.setOnClickListener(this.N);
        ImageView imageView2 = (ImageView) findViewById(R.id.secondEyeButton);
        this.J = imageView2;
        imageView2.setOnClickListener(this.O);
        if (this.K) {
            o2.x(this.D, "COMPTE_MODIFIER_EMAIL_TTR");
            o2.x(this.E, "COMPTE_MODIFIER_EMAIL_TEXT");
            o2.x(this.F, "COMPTE_MOT_DE_PASSE");
            this.I.setVisibility(4);
            this.J.setVisibility(0);
            this.H.setInputType(129);
            return;
        }
        o2.x(this.D, "COMPTE_MODIFIER_MOT_DE_PASSE");
        o2.x(this.E, "COMPTE_MOT_DE_PASSE");
        o2.x(this.F, "COMPTE_NOUVEAU_MOT_DE_PASSE");
        this.I.setVisibility(0);
        this.J.setVisibility(0);
        this.G.setInputType(129);
        this.H.setInputType(129);
    }

    public boolean respectRegexPassword(String str) {
        return Pattern.compile("(?=^.{6,}$)((?!.*\\s)(?=.*[A-Z])(?=.*[a-z]))((?=(.*\\d){1,})(?=(.*\\W){1,}))^.*$").matcher(str).matches();
    }

    public final void t(boolean z10, boolean z11) {
        Typeface typeface = this.f21687j;
        if (z11) {
            if (z10) {
                this.I.setBackgroundResource(R.drawable.btn_visible_eye);
                this.G.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                this.L = false;
                EditText editText = this.G;
                editText.setSelection(editText.getText().length());
                this.G.setTypeface(typeface);
                return;
            }
            this.I.setBackgroundResource(R.drawable.btn_hidden_eye);
            this.G.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.L = true;
            EditText editText2 = this.G;
            editText2.setSelection(editText2.getText().length());
            this.G.setTypeface(typeface);
            return;
        }
        if (z10) {
            this.J.setBackgroundResource(R.drawable.btn_visible_eye);
            this.H.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            this.L = false;
            EditText editText3 = this.H;
            editText3.setSelection(editText3.getText().length());
            this.H.setTypeface(typeface);
            return;
        }
        this.J.setBackgroundResource(R.drawable.btn_hidden_eye);
        this.H.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.L = true;
        EditText editText4 = this.H;
        editText4.setSelection(editText4.getText().length());
        this.H.setTypeface(typeface);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
