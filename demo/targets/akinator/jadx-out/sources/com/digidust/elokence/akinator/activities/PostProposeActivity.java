package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import ba.a;
import ca.m;
import ca.o;
import ca.r;
import ca.u;
import ca.v;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DtbConstants;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import da.f;
import j1.o2;
import java.text.NumberFormat;
import jb.h;
import lb.b1;
import lb.e;
import mt.b0;
import na.b;
import nh.n1;
import o5.s0;
import o9.j0;
import o9.k0;
import o9.p3;
import o9.t4;
import o9.u4;
import o9.v4;
import o9.w4;
import o9.x4;
import o9.y4;
import ot.c;
import ou.j;
import timber.log.Timber;
import u9.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PostProposeActivity extends AkActivity implements View.OnClickListener, Animation.AnimationListener {
    public static final /* synthetic */ int Z = 0;
    public LinearLayout C;
    public TextView D;
    public ImageView E;
    public ImageView F;
    public TextView G;
    public TextView H;
    public RelativeLayout I;
    public Button J;
    public TextView K;
    public Animation L;
    public Animation M;
    public boolean P;
    public Button V;
    public a W;
    public FirebaseAnalytics X;
    public int N = 0;
    public boolean O = false;
    public final boolean Q = o.sharedInstance().winFirstTry();
    public int R = -1;
    public boolean S = false;
    public boolean T = false;
    public boolean U = true;
    public final i Y = new i(this);

    public static String A(long j10) {
        double d10 = j10 / 8.64E7d;
        long j11 = (long) d10;
        return b1.sharedInstance().getTraductionFromToken("DERNIER_AWARD_REMPORTE_PAR_JOUR").replace("[DELAY]", Long.toString(j11)).replace("[DELAY2]", Long.toString((long) ((d10 - j11) * 24.0d)));
    }

    public static String B(long j10) {
        return b1.sharedInstance().getTraductionFromToken("DERNIER_AWARD_REMPORTE_PAR_HEURE").replace("[DELAY]", Long.toString(j10 / 3600000));
    }

    public static String C(long j10) {
        double d10 = j10 / 2.592E9d;
        long j11 = (long) d10;
        return b1.sharedInstance().getTraductionFromToken("DERNIER_AWARD_REMPORTE_PAR_MOIS").replace("[DELAY]", Long.toString(j11)).replace("[DELAY2]", Long.toString((long) ((d10 - j11) * 30.0d)));
    }

    public static /* synthetic */ void t(PostProposeActivity postProposeActivity) {
        if (postProposeActivity.T) {
            postProposeActivity.T = false;
            postProposeActivity.C.setVisibility(0);
            int i10 = postProposeActivity.R;
            if (i10 >= 0 && i10 <= 5) {
                b.playGzSound(i10 + 1);
            }
            if (!m.sharedInstance().isUserConnected()) {
                r.sharedInstance().depositGenizWithoutNotif(postProposeActivity.N);
            }
            h.sharedInstance().createOrUpdateMetricCompteur("gz_gain_video", postProposeActivity.N);
            if (m.sharedInstance().isUserConnected()) {
                postProposeActivity.E(postProposeActivity.N);
            }
            super.onGenizAwarded(postProposeActivity.N);
            postProposeActivity.C.startAnimation(postProposeActivity.M);
            String strReplace = b1.sharedInstance().getTraductionFromToken("BRAVO_TU_AS_GAGNE_GENIZ").replace("[NB_GENIZ]", "" + postProposeActivity.N);
            f fVar = new f(postProposeActivity);
            fVar.setTypeOk(strReplace);
            fVar.setOkListener(new n1(15));
            h.sharedInstance().incMetricCompteur("video_views");
        }
    }

    public static void u(PostProposeActivity postProposeActivity) {
        r.sharedInstance().setNomJoueur(m.sharedInstance().getPseudoUser());
        u.sharedInstance().setSubmit(true);
        h.sharedInstance().incMetricCompteur("lsa_added");
        m.sharedInstance().changeClassementState(2);
        postProposeActivity.F();
    }

    public final void D() {
        int i10;
        boolean z10 = this.O;
        if (m.sharedInstance().classementState() == 1) {
            m.sharedInstance().incNbGamesSinceRefuseClassement();
        }
        if (m.sharedInstance().classementState() == 2 && !m.sharedInstance().isUserConnected()) {
            m.sharedInstance().incNbGamesSinceRefuseInscription();
        }
        Intent intent = new Intent(this, (Class<?>) GameOverSliderActivity.class);
        intent.putExtra("ShowAdOnHome", true);
        o.sharedInstance().setGameOverActivityState(z10 ? 11 : 1);
        int i11 = this.R;
        if (((i11 == 1 || i11 == 2) && o.sharedInstance().winFirstTry()) || (i10 = this.R) == 6 || i10 == 7) {
            intent.putExtra("slideToDisplay", "classement");
        } else if ((i10 == 3 || i10 == 4 || i10 == 5) && o.sharedInstance().winFirstTry()) {
            intent.putExtra("slideToDisplay", "lsa");
        }
        intent.putExtra("displayPoll", this.S);
        startActivity(intent);
        finish();
    }

    public final void E(int i10) {
        disposeAtDestruction(b0.fromCallable(new k0(i10, 2)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new t4(this, 1)));
    }

    public final void F() {
        if (m.sharedInstance().classementState() == 2) {
            AkApplication.f21721h.execute(new u4(this, 1));
        }
    }

    public void majIcon(boolean z10) {
        this.V.setEnabled(z10);
        this.V.setAlpha(z10 ? 1.0f : 0.5f);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation != this.L) {
            if (animation == this.M) {
                this.C.setVisibility(8);
                return;
            }
            return;
        }
        this.C.startAnimation(this.M);
        super.onGenizAwarded(this.N);
        int i10 = this.R;
        if (i10 < 0 || i10 > 5) {
            return;
        }
        b.playGzSound(i10 + 1);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10;
        int i11;
        int i12;
        if (view == this.J) {
            if (m.sharedInstance().isUserConnected()) {
                if (m.sharedInstance().classementState() != 0 && (m.sharedInstance().classementState() != 1 || m.sharedInstance().getNbGamesSinceRefuseClassement() % m.sharedInstance().getNbPartieReproposeInscriptionClassement() != 0)) {
                    w();
                    return;
                }
                int i13 = this.R;
                if (((i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5) || !o.sharedInstance().winFirstTry()) && (i12 = this.R) != 6 && i12 != 7) {
                    w();
                    return;
                } else if (!r.sharedInstance().getIdJoueurAccount().equals("none")) {
                    w();
                    return;
                } else {
                    y(b1.sharedInstance().getTraductionFromToken("VEUX_TU_FAIRE_PARTI_DU_CLASSEMENT"));
                    v.sharedInstance().proposeCreateAccount(this.X);
                    return;
                }
            }
            if (m.sharedInstance().isUserConnected()) {
                return;
            }
            if (m.sharedInstance().classementState() != 0 && (m.sharedInstance().classementState() != 1 || m.sharedInstance().getNbGamesSinceRefuseClassement() % m.sharedInstance().getNbPartieReproposeInscriptionClassement() != 0)) {
                if (this.P || m.sharedInstance().classementState() != 2 || m.sharedInstance().getNbGamesSinceRefuseInscription() % 10 != 0) {
                    w();
                    return;
                }
                String traductionFromToken = b1.sharedInstance().getTraductionFromToken("VEUX_TU_CREER_UN_COMPTE");
                f fVar = new f(this);
                fVar.setTypeDoubleButtonsCustom(b1.sharedInstance().getTraductionFromToken("OUI"), b1.sharedInstance().getTraductionFromToken("NON_MERCI"), traductionFromToken);
                fVar.setConfirmeListener(new x4(this));
                v.sharedInstance().proposeCreateAccount(this.X);
                return;
            }
            if ((this.P || (((i11 = this.R) != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5) || !o.sharedInstance().winFirstTry())) && (i10 = this.R) != 6 && i10 != 7) {
                w();
            } else if (!r.sharedInstance().getIdJoueur().equals("none")) {
                w();
            } else {
                y(b1.sharedInstance().getTraductionFromToken("VEUX_TU_FAIRE_PARTI_DU_CLASSEMENT"));
                v.sharedInstance().proposeCreateAccount(this.X);
            }
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        String strReplace;
        super.onCreate(bundle);
        if (this.f21681c) {
            return;
        }
        this.X = FirebaseAnalytics.getInstance(this);
        setContentView(R.layout.activity_post_propose);
        ((RelativeLayout) findViewById(R.id.layoutPostPropose)).setOnApplyWindowInsetsListener(new w4());
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.badgePiege);
        this.I = relativeLayout;
        relativeLayout.setVisibility(4);
        TextView textView = (TextView) findViewById(R.id.rejectedText);
        this.K = textView;
        textView.setTypeface(this.f21689l);
        this.K.setText(b1.sharedInstance().getTraductionFromToken("PIEGE_TEST_REJETE"));
        this.C = (LinearLayout) findViewById(R.id.layoutGZplus);
        this.D = (TextView) findViewById(R.id.textGzWon);
        this.E = (ImageView) findViewById(R.id.imageAward);
        this.F = (ImageView) findViewById(R.id.croixNotFirstTime);
        this.G = (TextView) findViewById(R.id.textAwardPart1);
        this.H = (TextView) findViewById(R.id.textAwardPart2);
        Button button = (Button) findViewById(R.id.okButton);
        this.J = button;
        Typeface typeface = this.f21686i;
        button.setTypeface(typeface);
        this.J.setText(b1.sharedInstance().getTraductionFromToken("OK"));
        this.V = (Button) findViewById(R.id.cadeauRV);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.akiaward_zoom_out);
        this.L = animationLoadAnimation;
        animationLoadAnimation.setAnimationListener(this);
        AnimationUtils.loadAnimation(this, R.anim.akiaward_alpha).setAnimationListener(this);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.akiaward_xp_gz);
        this.M = animationLoadAnimation2;
        animationLoadAnimation2.setAnimationListener(this);
        m.sharedInstance().setHasAlreadyBeenBlockedInCurrentGame(false);
        try {
            e.g persoPropose = u.sharedInstance().getPersoPropose();
            if (persoPropose != null) {
                lb.c currentInstance = m.sharedInstance().getCurrentInstance();
                if (getIntent().getBooleanExtra("keyComeFromDefi", false)) {
                    String traductionFromToken = b1.sharedInstance().getTraductionFromToken("FELICITATIONS_AWARD_DAILY_CHALLENGE_GAGNE");
                    if (getIntent().getBooleanExtra("keyDefiFull", false)) {
                        strReplace = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("DAILY_CHALLENGE_FULL_TITRE"));
                        this.E.setImageResource(R.drawable.badge_ddj_full);
                        this.R = 7;
                    } else {
                        strReplace = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("DAILY_CHALLENGE_TITRE"));
                        this.E.setImageResource(R.drawable.badge_ddj);
                        this.R = 6;
                    }
                    this.G.setText(strReplace);
                    this.V.setVisibility(4);
                    this.C.setVisibility(8);
                    this.H.setText((CharSequence) null);
                    this.E.startAnimation(this.L);
                    F();
                } else {
                    try {
                        if (!m.sharedInstance().isUserConnected()) {
                            this.P = aa.a.sharedInstance().isAwardAlreadyWonForCharacter(currentInstance.getLanguage(), currentInstance.getBaseLogiqueId(), persoPropose.getIdBase());
                            z(persoPropose);
                        } else if (m.sharedInstance().isUserConnected()) {
                            v(persoPropose);
                        }
                    } catch (Exception e10) {
                        Timber.tag("PostProposeActivity").e(e10);
                    }
                }
            }
            this.D.setTypeface(typeface);
            this.G.setTypeface(typeface);
            this.H.setTypeface(typeface);
            markTextviewForUpdate(this.V);
            markTextviewForUpdate(this.D);
            markTextviewForUpdate(this.G);
            markTextviewForUpdate(this.H);
            updateTextViewsSize();
            this.J.setOnClickListener(this);
            this.Y.onCreate();
        } catch (NullPointerException unused) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            goToHome(false);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.Y.onDestroy();
        super.onDestroy();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.Y.onPause();
        super.onPause();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.U) {
            this.U = false;
            if (o.sharedInstance().winFirstTry() && this.N > 0) {
                if (!m.sharedInstance().isUserConnected()) {
                    r.sharedInstance().depositGenizWithoutNotif(this.N);
                }
                h.sharedInstance().createOrUpdateMetricCompteur("gz_gain_playing", this.N);
                if (m.sharedInstance().isUserConnected()) {
                    E(this.N);
                }
            }
        }
        traiteRewarded();
        this.Y.onResume();
    }

    public void setCandAddGz(boolean z10) {
        this.T = z10;
    }

    public void traiteRewarded() {
        runOnUiThread(new u4(this, 0));
    }

    public final void v(e.g gVar) {
        AccountDatabase accountDatabase = (AccountDatabase) s0.databaseBuilder(AkApplication.getAppContext(), AccountDatabase.class, "accountdb").build();
        b0.fromCallable(new ci.f(this, 3, gVar, accountDatabase)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new p3(this, accountDatabase, gVar, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.PostProposeActivity.w():void");
    }

    public final void x(long j10) {
        if (j10 < 3600000) {
            this.H.setText(b1.sharedInstance().getTraductionFromToken("DERNIER_AWARD_REMPORTE_PAR_MINUTE").replace("[DELAY]", Long.toString(j10 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS)));
            return;
        }
        if (j10 >= 3600000 && j10 < 86400000) {
            this.H.setText(B(j10));
        } else if (j10 < 86400000 || j10 >= DtbConstants.SIS_PING_INTERVAL) {
            this.H.setText(C(j10));
        } else {
            this.H.setText(A(j10));
        }
    }

    public final void y(String str) {
        h.sharedInstance().incMetricCompteur("lsa_proposed");
        f fVar = new f(this);
        fVar.setTypeDoubleButtonsCustom(b1.sharedInstance().getTraductionFromToken("OUI"), b1.sharedInstance().getTraductionFromToken("NON_MERCI"), str);
        fVar.setConfirmeListener(new y4(this));
    }

    public final void z(e.g gVar) {
        String traductionFromToken;
        String string;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.P) {
            this.I.setVisibility(4);
            this.V.setVisibility(4);
            this.E.setImageResource(R.drawable.ak_badge_generique);
            o2.x(this.G, "AWARD_DEJA_OBTENU");
            this.C.setVisibility(8);
            this.H.setText((CharSequence) null);
            return;
        }
        long delayAward = u.sharedInstance().getStats().getDelayAward() * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        Timber.i(p0.o2.n(delayAward, "Character not played since ", " Ms"), new Object[0]);
        boolean z10 = this.Q;
        if (z10) {
            if (m.sharedInstance().isPaid()) {
                this.V.setVisibility(4);
            } else {
                this.V.setTypeface(this.f21686i);
                this.V.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.doublePointtextSize));
                o2.w(this.V, "DOUBLE_POINTS_REGARDER_VIDEO");
                this.V.setOnClickListener(new j0(this, 6));
            }
            if (gVar.getIdBase().equals(o.sharedInstance().getLastIdBasePlayed())) {
                h.sharedInstance().incMetricCompteur("badges_quest");
            }
            traductionFromToken = b1.sharedInstance().getTraductionFromToken("FELICITATIONS_AWARD_GAGNE").replace("[NB_GENIZ]", "<font color='" + String.format("#%06X", Integer.valueOf(getResources().getColor(R.color.orange_color) & 16777215)) + "'>[NB_GENIZ]</font>");
        } else {
            this.V.setVisibility(4);
            this.F.setBackgroundResource(R.drawable.croix);
            this.F.setVisibility(0);
            this.H.setText(b1.sharedInstance().getTraductionFromToken("A_TOI_DE_JOUER"));
            traductionFromToken = b1.sharedInstance().getTraductionFromToken("AWARD_A_OBTENIR");
        }
        if (z10) {
            this.H.setText((CharSequence) null);
        }
        int awardType = u.sharedInstance().getStats().getAwardType();
        this.R = awardType;
        if (awardType != 8) {
            switch (awardType) {
                case -1:
                    if (delayAward > 21600000) {
                        if (delayAward > 21600000 && delayAward <= 86400000) {
                            this.E.setImageResource(R.drawable.ak_badge_bronze);
                            this.R = 1;
                            traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("BRONZE_TITRE"));
                            if (z10) {
                                traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(200));
                                TextView textView = this.D;
                                StringBuilder sb2 = new StringBuilder("+ ");
                                NumberFormat numberFormat = NumberFormat.getInstance();
                                this.N = 200;
                                sb2.append(numberFormat.format(200));
                                textView.setText(sb2.toString());
                                this.H.setText(B(delayAward));
                                break;
                            }
                        } else if (delayAward > 86400000 && delayAward <= DTBAdRequest.WEEK) {
                            this.E.setImageResource(R.drawable.ak_badge_silver);
                            this.R = 2;
                            traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("SILVER_TITRE"));
                            if (z10) {
                                traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(400));
                                TextView textView2 = this.D;
                                StringBuilder sb3 = new StringBuilder("+ ");
                                NumberFormat numberFormat2 = NumberFormat.getInstance();
                                this.N = 400;
                                sb3.append(numberFormat2.format(400));
                                textView2.setText(sb3.toString());
                                this.H.setText(A(delayAward));
                                break;
                            }
                        } else if (delayAward > DTBAdRequest.WEEK && delayAward <= DtbConstants.SIS_PING_INTERVAL) {
                            this.E.setImageResource(R.drawable.ak_badge_gold);
                            this.R = 3;
                            traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("GOLD_TITRE"));
                            if (z10) {
                                traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(800));
                                TextView textView3 = this.D;
                                StringBuilder sb4 = new StringBuilder("+ ");
                                NumberFormat numberFormat3 = NumberFormat.getInstance();
                                this.N = 800;
                                sb4.append(numberFormat3.format(800));
                                textView3.setText(sb4.toString());
                                this.H.setText(A(delayAward));
                                o.sharedInstance().canShareAwardImage(true);
                                break;
                            }
                        } else if (delayAward > DtbConstants.SIS_PING_INTERVAL && delayAward <= 15552000000L) {
                            this.E.setImageResource(R.drawable.ak_badge_platinum);
                            this.R = 4;
                            traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("PLATINUM_TITRE"));
                            if (z10) {
                                traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(1500));
                                TextView textView4 = this.D;
                                StringBuilder sb5 = new StringBuilder("+ ");
                                NumberFormat numberFormat4 = NumberFormat.getInstance();
                                this.N = 1500;
                                sb5.append(numberFormat4.format(1500));
                                textView4.setText(sb5.toString());
                                this.H.setText(C(delayAward));
                                o.sharedInstance().canShareAwardImage(true);
                                break;
                            }
                        } else if (delayAward > 15552000000L) {
                            this.E.setImageResource(R.drawable.ak_badge_black);
                            this.R = 5;
                            traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("BLACK_TITRE"));
                            if (z10) {
                                traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(5000));
                                TextView textView5 = this.D;
                                StringBuilder sb6 = new StringBuilder("+ ");
                                NumberFormat numberFormat5 = NumberFormat.getInstance();
                                this.N = 5000;
                                sb6.append(numberFormat5.format(5000));
                                textView5.setText(sb6.toString());
                                this.H.setText(C(delayAward));
                                o.sharedInstance().canShareAwardImage(true);
                                break;
                            }
                        }
                    } else {
                        this.E.setImageResource(R.drawable.ak_badge_standard);
                        this.R = 0;
                        traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("STANDARD_TITRE"));
                        if (z10) {
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(100));
                            TextView textView6 = this.D;
                            StringBuilder sb7 = new StringBuilder("+ ");
                            NumberFormat numberFormat6 = NumberFormat.getInstance();
                            this.N = 100;
                            sb7.append(numberFormat6.format(100));
                            textView6.setText(sb7.toString());
                            if (delayAward >= 3600000) {
                                this.H.setText(B(delayAward));
                                x(delayAward);
                                break;
                            } else {
                                this.H.setText(b1.sharedInstance().getTraductionFromToken("DERNIER_AWARD_REMPORTE_PAR_MINUTE").replace("[DELAY]", Long.toString(delayAward / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS)));
                                break;
                            }
                        }
                    }
                    break;
                case 0:
                    this.I.setVisibility(4);
                    this.E.setImageResource(R.drawable.ak_badge_standard);
                    traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("STANDARD_TITRE"));
                    if (z10) {
                        if (m.sharedInstance().isUserConnected()) {
                            i11 = 100;
                            E(100);
                        } else {
                            i11 = 100;
                        }
                        traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(i11));
                        TextView textView7 = this.D;
                        StringBuilder sb8 = new StringBuilder("+ ");
                        NumberFormat numberFormat7 = NumberFormat.getInstance();
                        this.N = i11;
                        sb8.append(numberFormat7.format(i11));
                        textView7.setText(sb8.toString());
                        x(delayAward);
                        break;
                    }
                    break;
                case 1:
                    this.I.setVisibility(4);
                    this.E.setImageResource(R.drawable.ak_badge_bronze);
                    traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("BRONZE_TITRE"));
                    if (z10) {
                        if (m.sharedInstance().isUserConnected()) {
                            i12 = 200;
                            E(200);
                        } else {
                            i12 = 200;
                        }
                        traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(i12));
                        TextView textView8 = this.D;
                        StringBuilder sb9 = new StringBuilder("+ ");
                        NumberFormat numberFormat8 = NumberFormat.getInstance();
                        this.N = i12;
                        sb9.append(numberFormat8.format(i12));
                        textView8.setText(sb9.toString());
                        x(delayAward);
                        break;
                    }
                    break;
                case 2:
                    this.I.setVisibility(4);
                    this.E.setImageResource(R.drawable.ak_badge_silver);
                    traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("SILVER_TITRE"));
                    if (z10) {
                        if (m.sharedInstance().isUserConnected()) {
                            i13 = 400;
                            E(400);
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(400));
                        } else {
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(400));
                            i13 = 400;
                        }
                        TextView textView9 = this.D;
                        StringBuilder sb10 = new StringBuilder("+ ");
                        NumberFormat numberFormat9 = NumberFormat.getInstance();
                        this.N = i13;
                        sb10.append(numberFormat9.format(i13));
                        textView9.setText(sb10.toString());
                        x(delayAward);
                        break;
                    }
                    break;
                case 3:
                    this.I.setVisibility(4);
                    this.E.setImageResource(R.drawable.ak_badge_gold);
                    traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("GOLD_TITRE"));
                    if (z10) {
                        if (m.sharedInstance().isUserConnected()) {
                            i14 = 800;
                            E(800);
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(800));
                        } else {
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(800));
                            i14 = 800;
                        }
                        TextView textView10 = this.D;
                        StringBuilder sb11 = new StringBuilder("+ ");
                        NumberFormat numberFormat10 = NumberFormat.getInstance();
                        this.N = i14;
                        sb11.append(numberFormat10.format(i14));
                        textView10.setText(sb11.toString());
                        x(delayAward);
                        o.sharedInstance().canShareAwardImage(true);
                        break;
                    }
                    break;
                case 4:
                    this.I.setVisibility(4);
                    this.E.setImageResource(R.drawable.ak_badge_platinum);
                    traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("PLATINUM_TITRE"));
                    if (z10) {
                        if (m.sharedInstance().isUserConnected()) {
                            i15 = 1500;
                            E(1500);
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(1500));
                        } else {
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(1500));
                            i15 = 1500;
                        }
                        TextView textView11 = this.D;
                        StringBuilder sb12 = new StringBuilder("+ ");
                        NumberFormat numberFormat11 = NumberFormat.getInstance();
                        this.N = i15;
                        sb12.append(numberFormat11.format(i15));
                        textView11.setText(sb12.toString());
                        x(delayAward);
                        o.sharedInstance().canShareAwardImage(true);
                        break;
                    }
                    break;
                case 5:
                    this.I.setVisibility(4);
                    this.E.setImageResource(R.drawable.ak_badge_black);
                    traductionFromToken = traductionFromToken.replace("[BADGE]", b1.sharedInstance().getTraductionFromToken("BLACK_TITRE"));
                    if (z10) {
                        if (m.sharedInstance().isUserConnected()) {
                            i16 = 5000;
                            E(5000);
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(5000));
                        } else {
                            traductionFromToken = traductionFromToken.replace("[NB_GENIZ]", Integer.toString(5000));
                            i16 = 5000;
                        }
                        TextView textView12 = this.D;
                        StringBuilder sb13 = new StringBuilder("+ ");
                        NumberFormat numberFormat12 = NumberFormat.getInstance();
                        this.N = i16;
                        sb13.append(numberFormat12.format(i16));
                        textView12.setText(sb13.toString());
                        x(delayAward);
                        o.sharedInstance().canShareAwardImage(true);
                        break;
                    }
                    break;
            }
            i10 = 8;
        } else {
            this.E.setVisibility(4);
            this.I.setVisibility(0);
            if (u.sharedInstance().hasAlreadyCheat()) {
                string = b1.sharedInstance().getTraductionFromToken("PIEGE_AVERTISSEMENT_ET_BAISSE_POINTS");
            } else {
                StringBuilder sbT = a.b.t(b1.sharedInstance().getTraductionFromToken("PIEGE_EXPLICATION_2"), " ");
                sbT.append(b1.sharedInstance().getTraductionFromToken("PIEGE_AVERTISSEMENT_2"));
                string = sbT.toString();
            }
            traductionFromToken = string;
            u.sharedInstance().setHasAlreadyCheat();
            i10 = 8;
            this.C.setVisibility(8);
            this.V.setVisibility(4);
        }
        this.G.setText(Html.fromHtml(traductionFromToken));
        if (!z10) {
            this.C.setVisibility(8);
            return;
        }
        if (this.R == i10) {
            this.I.startAnimation(this.L);
        } else {
            this.E.startAnimation(this.L);
        }
        int i17 = this.R;
        if (i17 != 0 && i17 != i10) {
            F();
        } else if (i17 == i10) {
            this.O = true;
        }
        int i18 = this.R;
        if (i18 < 0 || i18 > 5) {
            return;
        }
        try {
            if (m.sharedInstance().isUserConnected()) {
                disposeAtDestruction(b0.fromCallable(new v4(gVar, this.R, 0)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new t4(this, 2)));
            } else {
                aa.a.sharedInstance().addCharacter(m.sharedInstance().getCurrentInstance().getLanguage(), m.sharedInstance().getCurrentInstance().getBaseLogiqueId(), gVar.getIdBase(), this.R + 1, gVar.getName(), gVar.getDescription());
            }
        } catch (Exception e10) {
            Timber.tag("PostProposeActivity").e(e10);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onGenizAwarded(int i10) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onXpAwarded(int i10) {
    }
}
