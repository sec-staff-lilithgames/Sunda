package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h2;
import androidx.lifecycle.n3;
import ca.m;
import ca.o;
import ca.r;
import ca.t;
import ca.u;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DtbConstants;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.k;
import j.c;
import j1.o2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import jb.h;
import lb.b1;
import lb.e;
import mt.b0;
import nh.n1;
import o9.a1;
import o9.d1;
import o9.e1;
import o9.j0;
import o9.r3;
import o9.x;
import ou.j;
import p9.b;
import p9.d;
import s9.g;
import t9.f;
import x9.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class GameOverSliderActivity extends AkActivity implements r3, d, b {
    public static final /* synthetic */ int L = 0;
    public a1 D;
    public FirebaseAnalytics F;
    public e.g H;
    public int I;
    public int C = -1;
    public k E = null;
    public final i.d G = registerForActivityResult(new c(), new n1(13));
    public final u9.e J = new u9.e(this);
    public final a K = new a(this);

    @Override // o9.r3
    public void OnDisplayUltimatePotion() {
        disableAdOneTime();
        this.K.displayUltimatePotion();
    }

    public boolean isFound() {
        return this.I == 1;
    }

    public boolean isInfo() {
        return this.I == 21;
    }

    public boolean isLost() {
        return this.I == 11;
    }

    @Override // p9.d
    public void onAddMagicActionNext() {
        n3 n3VarFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.containerAddMagic);
        if (n3VarFindFragmentById instanceof p9.a) {
            ((p9.a) n3VarFindFragmentById).manageNextFragment();
        }
    }

    @Override // p9.b
    public void onAddMagicFinished() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.containerAddMagic);
        if (fragmentFindFragmentById != null) {
            if (fragmentFindFragmentById instanceof f) {
                u.sharedInstance().setQuestionAlreadyProposed(true);
            } else if (fragmentFindFragmentById instanceof q9.k) {
                u.sharedInstance().setCorrectNameAlreadyProposed(true);
            } else if (fragmentFindFragmentById instanceof g) {
                u.sharedInstance().setPhotoAlreadyProposed(true);
            } else if (fragmentFindFragmentById instanceof r9.e) {
                u.sharedInstance().setAlreadyAnsweredComplementaryQuestions(true);
            }
        }
        this.D.enableAutoSlide();
        enableHomeButton();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.layoutSliderFragment);
        boolean z10 = (fragmentFindFragmentById == null || !fragmentFindFragmentById.isAdded() || ((a1) fragmentFindFragmentById).fragmentHasClosedAView()) ? false : true;
        Fragment fragmentFindFragmentById2 = getSupportFragmentManager().findFragmentById(R.id.containerAddMagic);
        if (fragmentFindFragmentById2 == null || !fragmentFindFragmentById2.isAdded()) {
            if (z10) {
                goToHome(false);
                return;
            }
            return;
        }
        enableHomeButton();
        Fragment fragmentFindFragmentById3 = getSupportFragmentManager().findFragmentById(R.id.containerAddMagic);
        if (fragmentFindFragmentById3 != null) {
            h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
            h2VarBeginTransaction.setCustomAnimations(0, R.animator.add_magic_down);
            h2VarBeginTransaction.remove(fragmentFindFragmentById3);
            h2VarBeginTransaction.commit();
        }
        this.D.enableAutoSlide();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_game_over_slider);
        ((RelativeLayout) findViewById(R.id.mainLayout)).setOnApplyWindowInsetsListener(new e1());
        o.sharedInstance().setNbGamesInOneSession(o.sharedInstance().getNbGamesInOneSession() + 1);
        o.sharedInstance().setDateLastGame(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.FRANCE).format(Calendar.getInstance().getTime()));
        this.F = FirebaseAnalytics.getInstance(this);
        ImageView imageView = (ImageView) findViewById(R.id.imageBackground);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageSubjectIconTop);
        try {
            imageView.setImageDrawable(new BitmapDrawable(getResources(), t.sharedInstance().getSubjectBackgroundEndgame(m.sharedInstance().getCurrentInstance().getSubjectId())));
            imageView2.setImageDrawable(new BitmapDrawable(getResources(), t.sharedInstance().getSubjectIcon(m.sharedInstance().getCurrentInstance().getSubjectId())));
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
        }
        this.I = o.sharedInstance().getGameOverActivityState();
        if (o.sharedInstance().getStatusNetworkInvitation() && o.sharedInstance().getNbGamesInOneSession() == 5 && o.sharedInstance().getNbTimeAppIsOpen() == 1) {
            startActivity(new Intent(this, (Class<?>) NetworkInvitationActivity.class));
        }
        e.g persoPropose = u.sharedInstance().getPersoPropose();
        this.H = persoPropose;
        if (persoPropose == null) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            goToHome(false);
            return;
        }
        if (getIntent().getBooleanExtra("keyComeFromPopupClassement", false)) {
            if (aa.f.sharedInstance().isDefiPersoExist(this.H.getIdBase())) {
                this.C = 6;
            }
            r.sharedInstance().setNomJoueur(m.sharedInstance().getPseudoUser());
            u.sharedInstance().setSubmit(true);
            h.sharedInstance().incMetricCompteur("lsa_added");
            m.sharedInstance().changeClassementState(2);
            if (m.sharedInstance().classementState() == 2) {
                AkApplication.f21721h.execute(new ji.t(this, 25));
            }
        }
        o.sharedInstance().setLastIdBasePlayed(this.H.getIdBase());
        if (getIntent().getBooleanExtra("hasToDisplayQuestionValide", false)) {
            new da.f(this).setTypeOk(b1.sharedInstance().getTraductionFromToken("MERCI_VOTRE_QUESTION_A_ETE_AJOUTEE_ET_JE_COMMENCERAIS_A_LA_POSER_DES_SA_VALIDATION"));
        }
        if (getIntent().getBooleanExtra("hasToDisplayPhotoAdded", false)) {
            new da.f(this).setTypeOk(b1.sharedInstance().getTraductionFromToken("VOTRE_PHOTO_SERA_VISIBLE_APRES_VALIDATION"));
        }
        if (getIntent().getBooleanExtra("displayPoll", false)) {
            r.sharedInstance().depositGeniz(25000);
            StringBuilder sbT = a.b.t(o2.l(jb.c.sharedInstance().getCampaign(ca.a.getAbtestUrlSondageKey()), "?akp=android"), "&akuid=");
            sbT.append(jb.c.sharedInstance().getDeviceId());
            StringBuilder sbT2 = a.b.t(sbT.toString(), "&akc=");
            sbT2.append(getResources().getConfiguration().locale.getCountry());
            StringBuilder sbT3 = a.b.t(sbT2.toString(), "&akns=");
            sbT3.append(h.sharedInstance().getMetricCompteur("nb_sessions"));
            StringBuilder sbT4 = a.b.t(sbT3.toString(), "&akng=");
            sbT4.append(m.sharedInstance().isUserConnected() ? h.sharedInstance().getMetricCompteur("total_games_account") : h.sharedInstance().getMetricCompteur("total_games"));
            StringBuilder sbT5 = a.b.t(sbT4.toString(), "&akpa=");
            sbT5.append(o.sharedInstance().isUnlocked() ? "paid" : "free");
            String string = sbT5.toString();
            Intent intent = new Intent(this, (Class<?>) WebviewGeneralActivity.class);
            intent.putExtra("url", string);
            startActivity(intent);
        }
        ArrayList arrayList = new ArrayList();
        String str = "morefun";
        if (isFound() || isLost()) {
            if (m.sharedInstance().isAkiAwardsEnabledForCurrentInstance()) {
                arrayList.add("lsa");
            }
            if (m.sharedInstance().isHallOfFameEnabledForCurrentInstance()) {
                arrayList.add("classement");
            }
            if (m.sharedInstance().isDailyChallengeEnabledForCurrentInstance()) {
                arrayList.add("dc");
            }
            if (isFound() || getIntent().getBooleanExtra("keyComeFromSeveral", false)) {
                arrayList.add("character");
            }
            if (m.sharedInstance().isCustomizeAkinatorEnabledForCurrentInstance() && m.sharedInstance().getDisponibiliteAccessoires()) {
                arrayList.add("morefun");
            }
            if (m.sharedInstance().isAkiAwardsEnabledForCurrentInstance()) {
                arrayList.add("podium");
            }
        } else if (isInfo() || this.H.getElementMinibaseId() != -1) {
            arrayList.add("myworld");
        }
        String campaign = jb.c.sharedInstance().getCampaign("SlidePrimary");
        if (campaign == null) {
            campaign = (String) arrayList.get(0);
        }
        if (m.sharedInstance().getSliderDefault() != null) {
            campaign = m.sharedInstance().getSliderDefault();
        }
        if (isFound()) {
            String stringExtra = getIntent().getStringExtra("slideToDisplay");
            if (stringExtra != null && !stringExtra.isEmpty()) {
                campaign = stringExtra;
            }
            String str2 = h.sharedInstance().getMetricCompteur("total_games") != 2 ? campaign : "dc";
            int genizBalance = r.sharedInstance().getGenizBalance();
            if (!r.sharedInstance().canDisplayScreenShopAfterGameOver() || genizBalance < 1000) {
                str = str2;
            } else {
                r.sharedInstance().doNotDisplayScreenShopAnymore();
            }
        } else {
            str = campaign;
        }
        this.D = a1.newInstance(arrayList, str, isFound());
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        h2VarBeginTransaction.add(R.id.layoutSliderFragment, this.D);
        h2VarBeginTransaction.commit();
        Button button = (Button) findViewById(R.id.rejouerButton);
        button.setText(b1.sharedInstance().getTraductionFromToken("REJOUER"));
        button.setOnClickListener(new j0(this, 1));
        ImageView imageView3 = (ImageView) findViewById(R.id.image_filtre_enfant);
        if (m.sharedInstance().isChildFilterEnabledForCurrentInstance()) {
            imageView3.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(6, this, imageView3));
            if (m.sharedInstance().isChildProtectEnabled()) {
                imageView3.setImageResource(R.drawable.contenu_sensible_on);
            } else {
                imageView3.setImageResource(R.drawable.contenu_sensible_off);
            }
        } else {
            imageView3.setVisibility(8);
        }
        markTextviewForUpdate(button);
        updateTextViewsSize();
        if (o.sharedInstance().isFirstGameOverCreation()) {
            o.sharedInstance().setFirstGameOverCreation(false);
            if (m.sharedInstance().isChildProtectEnabled()) {
                h.sharedInstance().incMetricCompteur("child_filter_used");
            }
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            long startDateOpening = h.sharedInstance().getStartDateOpening();
            if (timeInMillis < DtbConstants.SIS_PING_INTERVAL + startDateOpening) {
                h.sharedInstance().incMetricCompteur("games_30d");
                if (timeInMillis < 1296000000 + startDateOpening) {
                    h.sharedInstance().incMetricCompteur("games_15d");
                    if (timeInMillis < DTBAdRequest.WEEK + startDateOpening) {
                        h.sharedInstance().incMetricCompteur("games_7d");
                        if (timeInMillis < DtbConstants.DEFAULT_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS + startDateOpening) {
                            h.sharedInstance().incMetricCompteur("games_48h");
                            if (timeInMillis < startDateOpening + 86400000) {
                                h.sharedInstance().incMetricCompteur("games_24h");
                            }
                        }
                    }
                }
            }
        }
        this.J.processOnCreate();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.J.processOnDestroy();
    }

    @Override // o9.r3
    public void onDisplayAddMagic(int i10) {
        Fragment fragmentNewInstance;
        disableHomeButton();
        this.D.disableAutoSlide();
        if (i10 == 0) {
            fragmentNewInstance = f.newInstance();
        } else if (i10 == 1) {
            fragmentNewInstance = q9.k.f82639l.newInstance();
        } else if (i10 == 2) {
            try {
                fragmentNewInstance = g.newInstance(u.sharedInstance().getStats().getFlagPhoto());
            } catch (NullPointerException unused) {
            }
        } else {
            fragmentNewInstance = i10 == 3 ? r9.e.newInstance() : null;
        }
        if (fragmentNewInstance == null) {
            return;
        }
        h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
        h2VarBeginTransaction.setCustomAnimations(R.animator.add_magic_up, 0);
        h2VarBeginTransaction.add(R.id.containerAddMagic, fragmentNewInstance);
        h2VarBeginTransaction.commit();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 33 || m.sharedInstance().isNotifAsked()) {
            return;
        }
        m.sharedInstance().setNotifAsked();
        if (m3.a.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        this.G.launch("android.permission.POST_NOTIFICATIONS");
    }

    public final void t() {
        this.E = k.show(this);
        disposeAtDestruction(b0.fromCallable(new x(4)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new d1(this, 0)));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
