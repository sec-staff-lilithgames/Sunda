package com.digidust.elokence.akinator.activities;

import aa.f;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import ca.m;
import ca.o;
import ca.t;
import ca.u;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.k;
import hr.kNq.ikJMrW;
import java.util.ArrayList;
import jb.h;
import lb.b1;
import lb.e;
import mt.b0;
import mt.n0;
import nm.i;
import o5.s0;
import o9.a4;
import o9.b4;
import o9.c4;
import o9.e4;
import o9.h0;
import o9.u3;
import o9.v3;
import o9.w3;
import o9.x;
import o9.x3;
import o9.y3;
import o9.z3;
import ou.j;
import pt.c;
import u9.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class OneCharacterProposalActivity extends AkActivity {
    public static final /* synthetic */ int S = 0;
    public ImageView C;
    public FirebaseAnalytics D;
    public e.g E;
    public c H;
    public ProgressBar I;
    public final u3 P;
    public final u3 Q;
    public boolean F = false;
    public final g G = new g(this);
    public final e.c J = new e.c();
    public final e.g K = new e.g();
    public k L = null;
    public boolean M = false;
    public final ArrayList N = new ArrayList();
    public final b4 O = new b4(this);
    public final c4 R = new c4(this);

    /* JADX WARN: Type inference failed for: r0v3, types: [o9.u3] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o9.u3] */
    public OneCharacterProposalActivity() {
        final int i10 = 0;
        this.P = new View.OnClickListener(this) { // from class: o9.u3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ OneCharacterProposalActivity f78587c;

            {
                this.f78587c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                OneCharacterProposalActivity oneCharacterProposalActivity = this.f78587c;
                switch (i11) {
                    case 0:
                        int i12 = OneCharacterProposalActivity.S;
                        oneCharacterProposalActivity.getClass();
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            w9.e.getInstance().stop();
                        }
                        na.b.playBip();
                        ca.u.sharedInstance().showPubTemp(true);
                        if (!ca.u.sharedInstance().getNoMoreQuestionsStatus()) {
                            oneCharacterProposalActivity.t();
                            break;
                        } else {
                            oneCharacterProposalActivity.x();
                            break;
                        }
                    default:
                        int i13 = OneCharacterProposalActivity.S;
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            w9.e.getInstance().stop();
                        }
                        na.b.playBip();
                        try {
                            oneCharacterProposalActivity.L = da.k.show(oneCharacterProposalActivity);
                        } catch (Exception unused) {
                            oneCharacterProposalActivity.L = null;
                        }
                        oneCharacterProposalActivity.u();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.Q = new View.OnClickListener(this) { // from class: o9.u3

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ OneCharacterProposalActivity f78587c;

            {
                this.f78587c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                OneCharacterProposalActivity oneCharacterProposalActivity = this.f78587c;
                switch (i112) {
                    case 0:
                        int i12 = OneCharacterProposalActivity.S;
                        oneCharacterProposalActivity.getClass();
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            w9.e.getInstance().stop();
                        }
                        na.b.playBip();
                        ca.u.sharedInstance().showPubTemp(true);
                        if (!ca.u.sharedInstance().getNoMoreQuestionsStatus()) {
                            oneCharacterProposalActivity.t();
                            break;
                        } else {
                            oneCharacterProposalActivity.x();
                            break;
                        }
                    default:
                        int i13 = OneCharacterProposalActivity.S;
                        if (ca.m.sharedInstance().isTTSEnabled()) {
                            w9.e.getInstance().stop();
                        }
                        na.b.playBip();
                        try {
                            oneCharacterProposalActivity.L = da.k.show(oneCharacterProposalActivity);
                        } catch (Exception unused) {
                            oneCharacterProposalActivity.L = null;
                        }
                        oneCharacterProposalActivity.u();
                        break;
                }
            }
        };
    }

    public void checkIfUserIsStillLogged() {
        b0.fromCallable(new x(8)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new v3(this, 5));
    }

    public void goToCharacterFound() {
        String idBase = this.E.getIdBase();
        if (!f.sharedInstance().isDefiPersoExist(idBase)) {
            if (!m.sharedInstance().getCurrentInstance().isDisableAkiAwards()) {
                startActivity(new Intent(this, (Class<?>) PostProposeActivity.class));
                finish();
                return;
            }
            Intent intent = new Intent(this, (Class<?>) GameOverSliderActivity.class);
            intent.putExtra("ShowAdOnHome", true);
            o.sharedInstance().setGameOverActivityState(1);
            startActivity(intent);
            finish();
            return;
        }
        if (m.sharedInstance().isUserConnected()) {
            disposeAtDestruction(b0.fromCallable(new ci.f(this, 2, (AccountDatabase) s0.databaseBuilder(AkApplication.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build(), idBase)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new h0(1, this, idBase)));
            return;
        }
        if (f.sharedInstance().isPersoAlreadyFound(idBase)) {
            startActivity(new Intent(this, (Class<?>) PostProposeActivity.class));
            finish();
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.layoutOneCharacterFound);
        relativeLayout.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new e4(this, idBase));
        relativeLayout.startAnimation(alphaAnimation);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == 0) {
            goToHome(true);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(true);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (m.sharedInstance().isTTSEnabled()) {
            w9.e.getInstance().stop();
        }
        super.onDestroy();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    public final void t() {
        if (!o.sharedInstance().winFirstTry() || !m.sharedInstance().isPlayerTrappable()) {
            w();
            return;
        }
        try {
            this.L = k.show(this);
        } catch (Exception unused) {
            this.L = null;
        }
        disposeAtDestruction(b0.fromCallable(new w3(this, 1)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new v3(this, 6)));
    }

    public final void u() {
        disposeAtDestruction(b0.fromCallable(new x(6)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new v3(this, 3)));
        this.F = true;
    }

    public final void v(boolean z10) {
        try {
            this.L = k.show(this);
        } catch (Exception unused) {
            this.L = null;
        }
        disposeAtDestruction(b0.fromCallable(new x3(this, z10)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new y3(this, z10, 0)));
    }

    public final void w() {
        try {
            this.L = k.show(this);
        } catch (Exception unused) {
            this.L = null;
        }
        disposeAtDestruction(b0.fromCallable(new x(7)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new v3(this, 4)));
    }

    public final void x() {
        try {
            this.L = k.show(this);
        } catch (Exception unused) {
            this.L = null;
        }
        disposeAtDestruction(b0.fromCallable(new w3(this, 0)).subscribeOn(j.io()).observeOn(ot.c.mainThread()).subscribe(new v3(this, 2)));
    }

    public final void y() {
        e.g persoPropose = u.sharedInstance().getPersoPropose();
        this.E = persoPropose;
        if (persoPropose == null) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            goToHome(false);
            return;
        }
        TextView textView = (TextView) findViewById(R.id.bulleProposalText1);
        this.C = (ImageView) findViewById(R.id.proposalImage);
        TextView textView2 = (TextView) findViewById(R.id.bulleProposalText2);
        TextView textView3 = (TextView) findViewById(R.id.bulleProposalText3);
        this.I = (ProgressBar) findViewById(R.id.loadingBarAward);
        Button button = (Button) findViewById(R.id.yesProposalButton);
        Button button2 = (Button) findViewById(R.id.noProposalButton);
        Button button3 = (Button) findViewById(R.id.replayButton);
        TextView textView4 = (TextView) findViewById(R.id.copyrightLabel);
        View viewFindViewById = findViewById(R.id.bulleProposal);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.proposalButtons);
        Typeface typeface = this.f21686i;
        textView.setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        markTextviewForUpdate(button);
        markTextviewForUpdate(button2);
        markTextviewForUpdate(button3);
        markTextviewForUpdate(textView);
        markTextviewForUpdate(textView2);
        markTextviewForUpdate(textView3);
        markTextviewForUpdate(textView4);
        updateTextViewsSize();
        button.setText(b1.sharedInstance().getTraductionFromToken("OUI"));
        button2.setText(b1.sharedInstance().getTraductionFromToken("NON"));
        button3.setText(b1.sharedInstance().getTraductionFromToken("REJOUER"));
        textView.setText(b1.sharedInstance().getTraductionFromToken("JE_PENSE_A"));
        textView2.setText(this.E.getName());
        textView3.setText(this.E.getDescription());
        System.gc();
        if (this.E.isValidateConstraint()) {
            q(R.id.akinatorImage, t.sharedInstance().getAkiBitmap("akinator_confiant"));
            q(R.id.akinatorChapeau, t.sharedInstance().getHatBitmap(m.sharedInstance().getHat(), "akinator_confiant"));
            q(R.id.akinatorTenue, t.sharedInstance().getClothBitmap(m.sharedInstance().getCloth(), "akinator_confiant"));
            c cVar = this.H;
            if (cVar == null || cVar.isDisposed()) {
                this.I.setVisibility(0);
                c cVarSubscribe = n0.create(new z3(this, 4)).observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new v3(this, 0), new v3(this, 1));
                this.H = cVarSubscribe;
                disposeAtDestruction(cVarSubscribe);
            }
            button.setOnClickListener(this.O);
            button2.setOnClickListener(this.P);
            textView4.setOnClickListener(this.R);
            if (m.sharedInstance().isTTSEnabled()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b1.sharedInstance().getTraductionFromToken("JE_PENSE_A"));
                sb2.append(" ");
                sb2.append(this.E.getName());
                if (this.E.getDescription() != null && !this.E.getDescription().trim().isEmpty()) {
                    sb2.append(". ");
                    sb2.append(this.E.getDescription());
                }
                new Handler(Looper.getMainLooper()).postDelayed(new i(sb2.toString(), 1), 1000L);
            }
        } else {
            if (m.sharedInstance().isTTSEnabled()) {
                w9.e.getInstance().speak(b1.sharedInstance().getTraductionFromToken("FILTRE_ENFANT"));
            }
            h.sharedInstance().createOrUpdateMetricValeur("last_game", "C");
            this.C.setImageResource(R.drawable.child_mode);
            button.setVisibility(8);
            button2.setVisibility(8);
            textView4.setVisibility(4);
            button3.setVisibility(0);
            textView.setVisibility(4);
            viewFindViewById.setVisibility(0);
            linearLayout.setVisibility(0);
            textView2.setMaxLines(2);
            textView2.setText(b1.sharedInstance().getTraductionFromToken("FILTRE_ENFANT"));
            textView3.setText("");
            button3.setOnClickListener(this.Q);
            h.sharedInstance().incMetricCompteur("child_filter_used");
        }
        this.G.processOnCreate(this.C);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D = FirebaseAnalytics.getInstance(this);
        if (m.sharedInstance().isTTSEnabled()) {
            w9.e.getInstance().initialize(this);
        }
        if (!this.f21681c) {
            boolean zIsUserConnected = m.sharedInstance().isUserConnected();
            String str = ikJMrW.rFAM;
            if (zIsUserConnected) {
                if (o.sharedInstance().canIncTotalGameIncForThisGame()) {
                    h.sharedInstance().incMetricCompteur("total_games_account");
                    h.sharedInstance().incMetricCompteur(str);
                    o.sharedInstance().unlockTotalGameForThisGame(false);
                }
            } else if (o.sharedInstance().canIncTotalGameIncForThisGame()) {
                h.sharedInstance().incMetricCompteur(str);
                o.sharedInstance().unlockTotalGameForThisGame(false);
            }
            setContentView(R.layout.activity_one_character_proposal);
            ((RelativeLayout) findViewById(R.id.mainLayout)).setOnApplyWindowInsetsListener(new a4());
            try {
                ((ImageView) findViewById(R.id.imageBackground)).setImageDrawable(new BitmapDrawable(getResources(), t.sharedInstance().getSubjectBackground(m.sharedInstance().getCurrentInstance().getSubjectId())));
            } catch (Exception unused) {
            } catch (OutOfMemoryError unused2) {
                Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
            }
            y();
            if (m.sharedInstance().isUserConnected()) {
                checkIfUserIsStillLogged();
            }
        }
    }
}
