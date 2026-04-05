package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import ca.m;
import ca.r;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.InscriptionActivity;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import com.digidust.elokence.akinator.paid.databinding.ActivityInscriptionBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import j1.o2;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import ma.b;
import mt.b0;
import o9.a3;
import ot.c;
import ou.j;
import st.g;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class InscriptionActivity extends AkActivity {
    public static final /* synthetic */ int J = 0;
    public boolean C;
    public FirebaseAnalytics D;
    public ActivityInscriptionBinding F;
    public boolean E = true;
    public View.OnClickListener G = new a3(this, 1);
    public View.OnClickListener H = new a3(this, 2);
    public View.OnClickListener I = new a3(this, 3);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public final View.OnClickListener getMListenerEyeButton() {
        return this.I;
    }

    public final View.OnClickListener getMListenerInscriptionButton() {
        return this.G;
    }

    public final View.OnClickListener getMListenerInscriptionButtonWithoutPseudo() {
        return this.H;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101 && i11 == -1 && intent != null && intent.getBooleanExtra("registerUser", false)) {
            t();
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(false);
    }

    public final void onClick(View view) {
        startActivity(new Intent(this, (Class<?>) ConnectActivity.class));
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityInscriptionBinding activityInscriptionBindingInflate = ActivityInscriptionBinding.inflate(getLayoutInflater());
        this.F = activityInscriptionBindingInflate;
        ActivityInscriptionBinding activityInscriptionBinding = null;
        if (activityInscriptionBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBindingInflate = null;
        }
        setContentView(activityInscriptionBindingInflate.getRoot());
        this.D = FirebaseAnalytics.getInstance(this);
        ActivityInscriptionBinding activityInscriptionBinding2 = this.F;
        if (activityInscriptionBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding2 = null;
        }
        TextView textView = activityInscriptionBinding2.textExplicationInscription;
        Typeface typeface = this.f21687j;
        textView.setTypeface(typeface);
        ActivityInscriptionBinding activityInscriptionBinding3 = this.F;
        if (activityInscriptionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding3 = null;
        }
        TextView textView2 = activityInscriptionBinding3.textExplicationInscription;
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "COMPTE_EXPLICATION_TXT", textView2);
        ActivityInscriptionBinding activityInscriptionBinding4 = this.F;
        if (activityInscriptionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding4 = null;
        }
        activityInscriptionBinding4.sendButton.setText(aVar.sharedInstance().getTraductionFromToken("COMPTE_INSCRIPTION"));
        ActivityInscriptionBinding activityInscriptionBinding5 = this.F;
        if (activityInscriptionBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding5 = null;
        }
        activityInscriptionBinding5.emailEditText.setTypeface(typeface);
        ActivityInscriptionBinding activityInscriptionBinding6 = this.F;
        if (activityInscriptionBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding6 = null;
        }
        activityInscriptionBinding6.emailEditText.setHint(aVar.sharedInstance().getTraductionFromToken("COMPTE_EMAIL"));
        ActivityInscriptionBinding activityInscriptionBinding7 = this.F;
        if (activityInscriptionBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding7 = null;
        }
        activityInscriptionBinding7.emailEditText.setFilters(b.getFilter());
        ActivityInscriptionBinding activityInscriptionBinding8 = this.F;
        if (activityInscriptionBinding8 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding8 = null;
        }
        activityInscriptionBinding8.passwordEditText.setTypeface(typeface);
        ActivityInscriptionBinding activityInscriptionBinding9 = this.F;
        if (activityInscriptionBinding9 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding9 = null;
        }
        activityInscriptionBinding9.passwordEditText.setHint(aVar.sharedInstance().getTraductionFromToken("COMPTE_MOT_DE_PASSE"));
        ActivityInscriptionBinding activityInscriptionBinding10 = this.F;
        if (activityInscriptionBinding10 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding10 = null;
        }
        activityInscriptionBinding10.passwordEditText.setFilters(b.getFilter());
        ActivityInscriptionBinding activityInscriptionBinding11 = this.F;
        if (activityInscriptionBinding11 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding11 = null;
        }
        activityInscriptionBinding11.inscriptionText.setTypeface(this.f21690m);
        ActivityInscriptionBinding activityInscriptionBinding12 = this.F;
        if (activityInscriptionBinding12 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding12 = null;
        }
        o2.A(aVar, "COMPTE_INSCRIPTION", activityInscriptionBinding12.inscriptionText);
        ActivityInscriptionBinding activityInscriptionBinding13 = this.F;
        if (activityInscriptionBinding13 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding13 = null;
        }
        activityInscriptionBinding13.explicationConnexionText.setTypeface(typeface);
        ActivityInscriptionBinding activityInscriptionBinding14 = this.F;
        if (activityInscriptionBinding14 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding14 = null;
        }
        activityInscriptionBinding14.explicationConnexionText.setText(aVar.sharedInstance().getTraductionFromToken("COMPTE_VOUS_AVEZ_UN_COMPTE"));
        SpannableString spannableString = new SpannableString(a.b.k(" ", aVar.sharedInstance().getTraductionFromToken("COMPTE_CONNECTEZ_VOUS")));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        ActivityInscriptionBinding activityInscriptionBinding15 = this.F;
        if (activityInscriptionBinding15 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding15 = null;
        }
        activityInscriptionBinding15.connexionText.setTypeface(typeface);
        ActivityInscriptionBinding activityInscriptionBinding16 = this.F;
        if (activityInscriptionBinding16 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding16 = null;
        }
        activityInscriptionBinding16.connexionText.setText(spannableString);
        ActivityInscriptionBinding activityInscriptionBinding17 = this.F;
        if (activityInscriptionBinding17 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding17 = null;
        }
        activityInscriptionBinding17.eyeButton.setOnClickListener(this.I);
        if (!getIntent().getBooleanExtra("coming_from_preinscription", false)) {
            this.C = false;
            ActivityInscriptionBinding activityInscriptionBinding18 = this.F;
            if (activityInscriptionBinding18 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityInscriptionBinding18 = null;
            }
            activityInscriptionBinding18.nameEditText.setFilters(b.getFilterAndLength());
            ActivityInscriptionBinding activityInscriptionBinding19 = this.F;
            if (activityInscriptionBinding19 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityInscriptionBinding19 = null;
            }
            activityInscriptionBinding19.nameEditText.setTypeface(typeface);
            ActivityInscriptionBinding activityInscriptionBinding20 = this.F;
            if (activityInscriptionBinding20 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityInscriptionBinding20 = null;
            }
            activityInscriptionBinding20.nameEditText.setHint(aVar.sharedInstance().getTraductionFromToken("COMPTE_NOM"));
            if (r.sharedInstance().getNomJoueur() != null) {
                ActivityInscriptionBinding activityInscriptionBinding21 = this.F;
                if (activityInscriptionBinding21 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    activityInscriptionBinding21 = null;
                }
                activityInscriptionBinding21.nameEditText.setText(r.sharedInstance().getNomJoueur());
            }
            ActivityInscriptionBinding activityInscriptionBinding22 = this.F;
            if (activityInscriptionBinding22 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                activityInscriptionBinding = activityInscriptionBinding22;
            }
            activityInscriptionBinding.sendButton.setOnClickListener(this.G);
            return;
        }
        ActivityInscriptionBinding activityInscriptionBinding23 = this.F;
        if (activityInscriptionBinding23 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding23 = null;
        }
        activityInscriptionBinding23.nameEditText.setVisibility(8);
        this.C = true;
        ActivityInscriptionBinding activityInscriptionBinding24 = this.F;
        if (activityInscriptionBinding24 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding24 = null;
        }
        activityInscriptionBinding24.sendButton.setOnClickListener(this.H);
        ActivityInscriptionBinding activityInscriptionBinding25 = this.F;
        if (activityInscriptionBinding25 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding25 = null;
        }
        activityInscriptionBinding25.connexionText.setVisibility(8);
        ActivityInscriptionBinding activityInscriptionBinding26 = this.F;
        if (activityInscriptionBinding26 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding26 = null;
        }
        activityInscriptionBinding26.explicationConnexionText.setVisibility(8);
        ActivityInscriptionBinding activityInscriptionBinding27 = this.F;
        if (activityInscriptionBinding27 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding27 = null;
        }
        activityInscriptionBinding27.buttonContinueWithoutAccount.setTypeface(this.f21686i);
        ActivityInscriptionBinding activityInscriptionBinding28 = this.F;
        if (activityInscriptionBinding28 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding28 = null;
        }
        activityInscriptionBinding28.buttonContinueWithoutAccount.setText(aVar.sharedInstance().getTraductionFromToken("COMPTE_POURSUIVRE_SANS"));
        ActivityInscriptionBinding activityInscriptionBinding29 = this.F;
        if (activityInscriptionBinding29 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding29 = null;
        }
        AkinatorAddMagicButton akinatorAddMagicButton = activityInscriptionBinding29.buttonContinueWithoutAccount;
        ActivityInscriptionBinding activityInscriptionBinding30 = this.F;
        if (activityInscriptionBinding30 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding30 = null;
        }
        akinatorAddMagicButton.setPaintFlags(activityInscriptionBinding30.buttonContinueWithoutAccount.getPaintFlags() | 8);
        ActivityInscriptionBinding activityInscriptionBinding31 = this.F;
        if (activityInscriptionBinding31 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding31 = null;
        }
        activityInscriptionBinding31.buttonContinueWithoutAccount.setOnClickListener(new a3(this, 0));
        if (!m.sharedInstance().mustNotDisplayButtonInscriptionWithoutAcc()) {
            ActivityInscriptionBinding activityInscriptionBinding32 = this.F;
            if (activityInscriptionBinding32 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                activityInscriptionBinding = activityInscriptionBinding32;
            }
            activityInscriptionBinding.buttonContinueWithoutAccount.setVisibility(0);
            return;
        }
        ActivityInscriptionBinding activityInscriptionBinding33 = this.F;
        if (activityInscriptionBinding33 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityInscriptionBinding = activityInscriptionBinding33;
        }
        activityInscriptionBinding.buttonContinueWithoutAccount.setVisibility(8);
        m.sharedInstance().setMustNotDisplayButtonInscriptionWithoutAcc(false);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    public final boolean respectRegexPassword(String password) {
        e0.checkNotNullParameter(password, "password");
        return Pattern.compile("^(?=.{8,}$)(?=.*[a-zA-Z])(?=.*[0-9]).*$").matcher(password).matches();
    }

    public final void setMListenerEyeButton(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.I = onClickListener;
    }

    public final void setMListenerInscriptionButton(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.G = onClickListener;
    }

    public final void setMListenerInscriptionButtonWithoutPseudo(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.H = onClickListener;
    }

    public final void t() {
        ActivityInscriptionBinding activityInscriptionBinding = this.F;
        ActivityInscriptionBinding activityInscriptionBinding2 = null;
        if (activityInscriptionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding = null;
        }
        activityInscriptionBinding.loadingBarConnect.setVisibility(0);
        ActivityInscriptionBinding activityInscriptionBinding3 = this.F;
        if (activityInscriptionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding3 = null;
        }
        activityInscriptionBinding3.mainLayoutInscription.setAlpha(0.5f);
        ActivityInscriptionBinding activityInscriptionBinding4 = this.F;
        if (activityInscriptionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityInscriptionBinding2 = activityInscriptionBinding4;
        }
        activityInscriptionBinding2.sendButton.setEnabled(false);
        final int i10 = 0;
        final int i11 = 1;
        b0.fromCallable(new com.vungle.ads.internal.session.a(this, 9)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new g(this) { // from class: o9.z2

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InscriptionActivity f78710c;

            {
                this.f78710c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                Integer num;
                Integer num2;
                int i12 = i10;
                String str = "PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD";
                InscriptionActivity inscriptionActivity = this.f78710c;
                switch (i12) {
                    case 0:
                        Pair pair = (Pair) obj;
                        int i13 = InscriptionActivity.J;
                        inscriptionActivity.u();
                        kotlin.jvm.internal.e0.checkNotNull(pair);
                        Integer num3 = (Integer) pair.first;
                        if (num3 == null || num3.intValue() != 0) {
                            Integer num4 = (Integer) pair.first;
                            if ((num4 == null || num4.intValue() != 400) && (((num = (Integer) pair.first) != null && num.intValue() == -10) || ((num2 = (Integer) pair.first) != null && num2.intValue() == -100))) {
                                str = "COMPTE_EMAIL_DEJA_UTILISE";
                            }
                            new da.f(inscriptionActivity).setTypeOkNew(lb.b1.f72741d.sharedInstance().getTraductionFromToken(str));
                            break;
                        } else {
                            ca.o.sharedInstance().setUserMustBeAlertConnected();
                            ca.v vVarSharedInstance = ca.v.sharedInstance();
                            FirebaseAnalytics firebaseAnalytics = inscriptionActivity.D;
                            kotlin.jvm.internal.e0.checkNotNull(firebaseAnalytics);
                            vVarSharedInstance.confirmeCreateAccount(firebaseAnalytics);
                            Integer num5 = (Integer) pair.second;
                            if (num5 == null || num5.intValue() != 0) {
                                inscriptionActivity.startActivity(new Intent(inscriptionActivity, (Class<?>) ConnectActivity.class));
                                inscriptionActivity.finish();
                                break;
                            } else if (!inscriptionActivity.getIntent().getBooleanExtra("coming_from_menu", false)) {
                                if (inscriptionActivity.getIntent().getBooleanExtra("coming_from_preinscription", false) && ca.m.sharedInstance().classementState() != 2) {
                                    inscriptionActivity.w(true);
                                    break;
                                } else if (!inscriptionActivity.getIntent().getBooleanExtra("coming_from_preinscription", false) || ca.m.sharedInstance().classementState() != 2) {
                                    inscriptionActivity.goToHome(false);
                                    break;
                                } else {
                                    inscriptionActivity.w(false);
                                    break;
                                }
                            } else {
                                inscriptionActivity.goToMenu();
                                break;
                            }
                        }
                        break;
                    default:
                        int i14 = InscriptionActivity.J;
                        Timber.Forest.e((Throwable) obj, "Error during user registration", new Object[0]);
                        inscriptionActivity.u();
                        Toast.makeText(inscriptionActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 1).show();
                        break;
                }
            }
        }, new g(this) { // from class: o9.z2

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InscriptionActivity f78710c;

            {
                this.f78710c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                Integer num;
                Integer num2;
                int i12 = i11;
                String str = "PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD";
                InscriptionActivity inscriptionActivity = this.f78710c;
                switch (i12) {
                    case 0:
                        Pair pair = (Pair) obj;
                        int i13 = InscriptionActivity.J;
                        inscriptionActivity.u();
                        kotlin.jvm.internal.e0.checkNotNull(pair);
                        Integer num3 = (Integer) pair.first;
                        if (num3 == null || num3.intValue() != 0) {
                            Integer num4 = (Integer) pair.first;
                            if ((num4 == null || num4.intValue() != 400) && (((num = (Integer) pair.first) != null && num.intValue() == -10) || ((num2 = (Integer) pair.first) != null && num2.intValue() == -100))) {
                                str = "COMPTE_EMAIL_DEJA_UTILISE";
                            }
                            new da.f(inscriptionActivity).setTypeOkNew(lb.b1.f72741d.sharedInstance().getTraductionFromToken(str));
                            break;
                        } else {
                            ca.o.sharedInstance().setUserMustBeAlertConnected();
                            ca.v vVarSharedInstance = ca.v.sharedInstance();
                            FirebaseAnalytics firebaseAnalytics = inscriptionActivity.D;
                            kotlin.jvm.internal.e0.checkNotNull(firebaseAnalytics);
                            vVarSharedInstance.confirmeCreateAccount(firebaseAnalytics);
                            Integer num5 = (Integer) pair.second;
                            if (num5 == null || num5.intValue() != 0) {
                                inscriptionActivity.startActivity(new Intent(inscriptionActivity, (Class<?>) ConnectActivity.class));
                                inscriptionActivity.finish();
                                break;
                            } else if (!inscriptionActivity.getIntent().getBooleanExtra("coming_from_menu", false)) {
                                if (inscriptionActivity.getIntent().getBooleanExtra("coming_from_preinscription", false) && ca.m.sharedInstance().classementState() != 2) {
                                    inscriptionActivity.w(true);
                                    break;
                                } else if (!inscriptionActivity.getIntent().getBooleanExtra("coming_from_preinscription", false) || ca.m.sharedInstance().classementState() != 2) {
                                    inscriptionActivity.goToHome(false);
                                    break;
                                } else {
                                    inscriptionActivity.w(false);
                                    break;
                                }
                            } else {
                                inscriptionActivity.goToMenu();
                                break;
                            }
                        }
                        break;
                    default:
                        int i14 = InscriptionActivity.J;
                        Timber.Forest.e((Throwable) obj, "Error during user registration", new Object[0]);
                        inscriptionActivity.u();
                        Toast.makeText(inscriptionActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 1).show();
                        break;
                }
            }
        });
    }

    public final void u() {
        ActivityInscriptionBinding activityInscriptionBinding = this.F;
        ActivityInscriptionBinding activityInscriptionBinding2 = null;
        if (activityInscriptionBinding == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding = null;
        }
        activityInscriptionBinding.loadingBarConnect.setVisibility(8);
        ActivityInscriptionBinding activityInscriptionBinding3 = this.F;
        if (activityInscriptionBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityInscriptionBinding3 = null;
        }
        activityInscriptionBinding3.mainLayoutInscription.setAlpha(1.0f);
        ActivityInscriptionBinding activityInscriptionBinding4 = this.F;
        if (activityInscriptionBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityInscriptionBinding2 = activityInscriptionBinding4;
        }
        activityInscriptionBinding2.sendButton.setEnabled(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r5.nameEditText.length() < 3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(boolean r5) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.InscriptionActivity.v(boolean):void");
    }

    public final void w(boolean z10) {
        Intent intent = new Intent(this, (Class<?>) GameOverSliderActivity.class);
        intent.putExtra("keyComeFromPopupClassement", z10);
        startActivity(intent);
        finish();
    }
}
