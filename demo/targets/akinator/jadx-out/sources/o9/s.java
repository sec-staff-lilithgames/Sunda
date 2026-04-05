package o9;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.FragmentClassementBinding;
import java.util.Arrays;
import java.util.Timer;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s extends c1 {

    /* renamed from: t, reason: collision with root package name */
    public static final a f78491t = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public Timer f78492c;

    /* renamed from: e, reason: collision with root package name */
    public t f78493e;

    /* renamed from: f, reason: collision with root package name */
    public int f78494f;

    /* renamed from: g, reason: collision with root package name */
    public long f78495g;

    /* renamed from: i, reason: collision with root package name */
    public ta.c f78497i;

    /* renamed from: j, reason: collision with root package name */
    public ConstraintLayout f78498j;

    /* renamed from: k, reason: collision with root package name */
    public ViewGroup f78499k;

    /* renamed from: l, reason: collision with root package name */
    public AkActivity f78500l;

    /* renamed from: m, reason: collision with root package name */
    public pt.c f78501m;

    /* renamed from: n, reason: collision with root package name */
    public pt.c f78502n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f78503o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f78504p;

    /* renamed from: q, reason: collision with root package name */
    public AnimatorSet f78505q;

    /* renamed from: r, reason: collision with root package name */
    public FragmentClassementBinding f78506r;

    /* renamed from: h, reason: collision with root package name */
    public final Typeface f78496h = AkApplication.f21719f.getTypeFace();

    /* renamed from: s, reason: collision with root package name */
    public final q f78507s = new q(this, 3);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final s newInstance() {
            return new s();
        }
    }

    public static final FragmentClassementBinding access$getBinding(s sVar) {
        FragmentClassementBinding fragmentClassementBinding = sVar.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
        return fragmentClassementBinding;
    }

    public final void a(LinearLayout linearLayout, ta.f fVar, boolean z10) {
        if (fVar != null) {
            TextView textView = (TextView) linearLayout.findViewById(R.id.classementRang);
            textView.setText(String.valueOf(fVar.getRang()));
            Typeface typeface = this.f78496h;
            textView.setTypeface(typeface);
            textView.setTextColor(-16777216);
            View viewFindViewById = linearLayout.findViewById(R.id.classementRangImage);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById;
            if (z10) {
                ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.imageActif);
                if (fVar.getActif() == 1) {
                    imageView2.setImageResource(R.drawable.rond_actif);
                } else {
                    imageView2.setImageResource(R.drawable.rond_inactif);
                }
            } else {
                int rang = fVar.getRang();
                if (rang == 1) {
                    imageView.setBackgroundResource(R.drawable.mini_gold_medal);
                } else if (rang == 2) {
                    imageView.setBackgroundResource(R.drawable.mini_silver_medal);
                } else if (rang == 3) {
                    imageView.setBackgroundResource(R.drawable.mini_bronze_medal);
                    textView.setTextColor(-1);
                }
            }
            TextView textView2 = (TextView) linearLayout.findViewById(R.id.classementNom);
            textView2.setText(fVar.getNom());
            textView2.setTypeface(typeface);
            TextView textView3 = (TextView) linearLayout.findViewById(R.id.classementScore);
            textView3.setText(String.valueOf(fVar.getScore()));
            textView3.setTypeface(typeface);
            TextView textView4 = (TextView) linearLayout.findViewById(R.id.classementBadgeBlack);
            TextView textView5 = (TextView) linearLayout.findViewById(R.id.classementBadgePlatinum);
            TextView textView6 = (TextView) linearLayout.findViewById(R.id.classementBadgeGold);
            TextView textView7 = (TextView) linearLayout.findViewById(R.id.classementBadgeSilver);
            TextView textView8 = (TextView) linearLayout.findViewById(R.id.classementBadgeBronze);
            TextView textView9 = (TextView) linearLayout.findViewById(R.id.classementBadgeDdj);
            if (!ca.m.sharedInstance().isDailyChallengeEnabledForCurrentInstance()) {
                textView9.setVisibility(8);
            }
            TextView textView10 = (TextView) linearLayout.findViewById(R.id.classementMedaille);
            if (fVar.getNbMaxTrophee() > 0) {
                textView10.setText(String.valueOf(fVar.getNbMaxTrophee()));
                int maxTrophee = fVar.getMaxTrophee();
                if (maxTrophee == 0) {
                    textView10.setBackgroundResource(R.drawable.mini_star_bronze);
                    textView10.setTextColor(-1);
                } else if (maxTrophee == 1) {
                    textView10.setBackgroundResource(R.drawable.mini_star_silver);
                } else if (maxTrophee != 2) {
                    textView10.setVisibility(4);
                } else {
                    textView10.setBackgroundResource(R.drawable.mini_star_gold);
                }
            } else {
                textView10.setVisibility(4);
            }
            textView4.setText(String.valueOf(fVar.getNbBadges(5)));
            textView5.setText(String.valueOf(fVar.getNbBadges(4)));
            textView6.setText(String.valueOf(fVar.getNbBadges(3)));
            textView7.setText(String.valueOf(fVar.getNbBadges(2)));
            textView8.setText(String.valueOf(fVar.getNbBadges(1)));
            textView9.setText(String.valueOf(fVar.getNbDDJ()));
            if (fVar.getNbDDJ() == 5) {
                textView9.setBackgroundResource(R.drawable.mini_badge_ddj_full);
            } else {
                textView9.setBackgroundResource(R.drawable.mini_badge_ddj);
            }
            textView4.setTypeface(typeface);
            textView5.setTypeface(typeface);
            textView6.setTypeface(typeface);
            textView7.setTypeface(typeface);
            textView8.setTypeface(typeface);
            textView9.setTypeface(typeface);
            textView10.setTypeface(typeface);
        }
    }

    public final void b() {
        if (this.f78497i != null) {
            killThreadRefreshDelays();
            this.f78492c = new Timer();
            this.f78493e = new t(this);
            Timer timer = this.f78492c;
            kotlin.jvm.internal.e0.checkNotNull(timer);
            timer.scheduleAtFixedRate(this.f78493e, 0L, 1000L);
        }
    }

    public final void c(boolean z10, boolean z11) {
        FragmentClassementBinding fragmentClassementBinding = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
        fragmentClassementBinding.buttonVote.setAlpha(z10 ? 1.0f : 0.5f);
        FragmentClassementBinding fragmentClassementBinding2 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding2);
        fragmentClassementBinding2.buttonVote.setEnabled(z10);
        if (!z10) {
            AnimatorSet animatorSet = this.f78505q;
            if (animatorSet != null) {
                kotlin.jvm.internal.e0.checkNotNull(animatorSet);
                animatorSet.cancel();
                this.f78505q = null;
                AnimatorSet animatorSet2 = new AnimatorSet();
                FragmentClassementBinding fragmentClassementBinding3 = this.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding3);
                AnimatorSet.Builder builderPlay = animatorSet2.play(ObjectAnimator.ofFloat(fragmentClassementBinding3.buttonVote, (Property<Button, Float>) View.SCALE_X, 1.0f));
                FragmentClassementBinding fragmentClassementBinding4 = this.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding4);
                builderPlay.with(ObjectAnimator.ofFloat(fragmentClassementBinding4.buttonVote, (Property<Button, Float>) View.SCALE_Y, 1.0f));
                animatorSet2.start();
                return;
            }
            return;
        }
        if (z11) {
            FragmentClassementBinding fragmentClassementBinding5 = this.f78506r;
            kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding5);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fragmentClassementBinding5.buttonVote, (Property<Button, Float>) View.SCALE_X, 1.0f, 1.5f, 1.0f);
            objectAnimatorOfFloat.setRepeatCount(-1);
            FragmentClassementBinding fragmentClassementBinding6 = this.f78506r;
            kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding6);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(fragmentClassementBinding6.buttonVote, (Property<Button, Float>) View.SCALE_Y, 1.0f, 1.5f, 1.0f);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f78505q = animatorSet3;
            kotlin.jvm.internal.e0.checkNotNull(animatorSet3);
            animatorSet3.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            AnimatorSet animatorSet4 = this.f78505q;
            kotlin.jvm.internal.e0.checkNotNull(animatorSet4);
            animatorSet4.setDuration(2000L);
            AnimatorSet animatorSet5 = this.f78505q;
            kotlin.jvm.internal.e0.checkNotNull(animatorSet5);
            animatorSet5.start();
        }
    }

    public final void d(int i10) {
        if (this.f78503o) {
            if (i10 >= 0) {
                e(i10);
            }
            if (i10 == -1) {
                c(false, false);
            }
            if (getActivity() != null) {
                FragmentClassementBinding fragmentClassementBinding = this.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
                fragmentClassementBinding.loadingBarClassement.setVisibility(0);
                FragmentClassementBinding fragmentClassementBinding2 = this.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding2);
                fragmentClassementBinding2.zoneClassement.setVisibility(4);
                FragmentClassementBinding fragmentClassementBinding3 = this.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding3);
                fragmentClassementBinding3.zoneTemps.setVisibility(4);
                FragmentClassementBinding fragmentClassementBinding4 = this.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding4);
                fragmentClassementBinding4.messageErrorHistorique.setVisibility(4);
                this.f78503o = false;
                pt.c cVar = this.f78502n;
                if (cVar != null) {
                    cVar.dispose();
                }
                mu.a.setErrorHandler(new bj.v0(new f.j0(12), 7));
                mt.n0 n0VarCreate = mt.n0.create(new com.google.android.exoplayer2.m0(i10, this, 3));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
                this.f78502n = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(ou.j.newThread()).subscribe(new bj.v0(new b1.f0(this, i10), 8), new bj.v0(new r(this, 2), 9));
            }
        }
    }

    public final void e(int i10) {
        boolean z10 = i10 == 1;
        FragmentClassementBinding fragmentClassementBinding = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
        fragmentClassementBinding.buttonClassementVeille.setEnabled(z10);
        FragmentClassementBinding fragmentClassementBinding2 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding2);
        TextView textView = fragmentClassementBinding2.buttonClassementVeille;
        int i11 = R.color.white_color;
        textView.setBackgroundResource(z10 ? R.color.transparent : R.color.white_color);
        FragmentClassementBinding fragmentClassementBinding3 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding3);
        TextView textView2 = fragmentClassementBinding3.buttonClassementVeille;
        Resources resources = getResources();
        textView2.setTextColor(z10 ? resources.getColor(R.color.white, null) : resources.getColor(R.color.black, null));
        FragmentClassementBinding fragmentClassementBinding4 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding4);
        fragmentClassementBinding4.buttonClassementToday.setEnabled(!z10);
        FragmentClassementBinding fragmentClassementBinding5 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding5);
        TextView textView3 = fragmentClassementBinding5.buttonClassementToday;
        if (!z10) {
            i11 = R.color.transparent;
        }
        textView3.setBackgroundResource(i11);
        FragmentClassementBinding fragmentClassementBinding6 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding6);
        fragmentClassementBinding6.buttonClassementToday.setTextColor(z10 ? getResources().getColor(R.color.black, null) : getResources().getColor(R.color.white, null));
    }

    public final ta.c getMClassementDisplayed$akinatorGL_gplayFreemiumRelease() {
        return this.f78497i;
    }

    public final void killThreadRefreshDelays() {
        Timer timer = this.f78492c;
        if (timer != null) {
            kotlin.jvm.internal.e0.checkNotNull(timer);
            timer.cancel();
            this.f78492c = null;
        }
        t tVar = this.f78493e;
        if (tVar != null) {
            kotlin.jvm.internal.e0.checkNotNull(tVar);
            tVar.cancel();
            this.f78493e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inflater, "inflater");
        FragmentClassementBinding fragmentClassementBindingInflate = FragmentClassementBinding.inflate(inflater, viewGroup, false);
        this.f78506r = fragmentClassementBindingInflate;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBindingInflate);
        RelativeLayout root = fragmentClassementBindingInflate.getRoot();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(root, "getRoot(...)");
        FragmentActivity activity = getActivity();
        kotlin.jvm.internal.e0.checkNotNull(activity, "null cannot be cast to non-null type com.digidust.elokence.akinator.activities.AkActivity");
        this.f78500l = (AkActivity) activity;
        FragmentClassementBinding fragmentClassementBinding = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
        fragmentClassementBinding.buttonClassementHistoriquePodiums.setOnClickListener(new q(this, 5));
        if (ca.m.sharedInstance().isVoteForClassementEnabledForCurrentInstance()) {
            FragmentClassementBinding fragmentClassementBinding2 = this.f78506r;
            kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding2);
            fragmentClassementBinding2.buttonVote.setOnClickListener(new q(this, 6));
        } else {
            FragmentClassementBinding fragmentClassementBinding3 = this.f78506r;
            kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding3);
            fragmentClassementBinding3.buttonVote.setVisibility(8);
        }
        c(false, false);
        FragmentClassementBinding fragmentClassementBinding4 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding4);
        TextView textView = fragmentClassementBinding4.buttonClassementVeille;
        b1.a aVar = lb.b1.f72741d;
        j1.o2.A(aVar, "CLASSEMENT_PRECEDENT", textView);
        FragmentClassementBinding fragmentClassementBinding5 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding5);
        TextView textView2 = fragmentClassementBinding5.buttonClassementVeille;
        Typeface typeface = this.f78496h;
        textView2.setTypeface(typeface);
        FragmentClassementBinding fragmentClassementBinding6 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding6);
        j1.o2.A(aVar, "CLASSEMENT_ACTUEL", fragmentClassementBinding6.buttonClassementToday);
        FragmentClassementBinding fragmentClassementBinding7 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding7);
        fragmentClassementBinding7.buttonClassementToday.setTypeface(typeface);
        FragmentClassementBinding fragmentClassementBinding8 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding8);
        fragmentClassementBinding8.buttonClassementVeille.setOnClickListener(new q(this, 0));
        FragmentClassementBinding fragmentClassementBinding9 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding9);
        fragmentClassementBinding9.buttonClassementToday.setOnClickListener(new q(this, 1));
        FragmentClassementBinding fragmentClassementBinding10 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding10);
        fragmentClassementBinding10.whatIsAkiAward.setOnClickListener(new q(this, 2));
        FragmentClassementBinding fragmentClassementBinding11 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding11);
        j1.o2.A(aVar, "FIN_DANS", fragmentClassementBinding11.textFinDans);
        FragmentClassementBinding fragmentClassementBinding12 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding12);
        fragmentClassementBinding12.textFinDans.setTypeface(typeface);
        FragmentClassementBinding fragmentClassementBinding13 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding13);
        fragmentClassementBinding13.textTemps.setTypeface(typeface);
        FragmentClassementBinding fragmentClassementBinding14 = this.f78506r;
        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding14);
        fragmentClassementBinding14.textNbParticipant.setTypeface(typeface);
        this.f78503o = true;
        d(-1);
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AnimatorSet animatorSet = this.f78505q;
        if (animatorSet != null) {
            kotlin.jvm.internal.e0.checkNotNull(animatorSet);
            animatorSet.cancel();
            this.f78505q = null;
        }
        pt.c cVar = this.f78501m;
        if (cVar != null) {
            cVar.dispose();
        }
        pt.c cVar2 = this.f78502n;
        if (cVar2 != null) {
            cVar2.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        killThreadRefreshDelays();
        ta.c cVar = this.f78497i;
        if (cVar != null) {
            kotlin.jvm.internal.e0.checkNotNull(cVar);
            this.f78494f = cVar.getTempsRestant();
            this.f78495g = System.currentTimeMillis();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f78497i == null || this.f78495g == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f78495g;
        if (jCurrentTimeMillis >= 5000 || this.f78504p) {
            this.f78504p = false;
            d(-1);
            return;
        }
        int i10 = this.f78494f;
        if (i10 != -1) {
            int i11 = i10 - ((int) (jCurrentTimeMillis / 1000.0f));
            ta.c cVar = this.f78497i;
            kotlin.jvm.internal.e0.checkNotNull(cVar);
            cVar.setTempsRestant(i11);
        }
        b();
    }

    @Override // o9.c1
    public final boolean removeCreatedView() {
        if (this.f78499k == null || this.f78498j == null) {
            return false;
        }
        requireActivity().runOnUiThread(new p(this, 0));
        return true;
    }

    public final void setMClassementDisplayed$akinatorGL_gplayFreemiumRelease(ta.c cVar) {
        this.f78497i = cVar;
    }

    @Override // androidx.fragment.app.Fragment
    @tu.f
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            jb.h hVarSharedInstance = jb.h.f69257d.sharedInstance();
            String str = String.format("%s_displayed", Arrays.copyOf(new Object[]{"classement"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "format(...)");
            hVarSharedInstance.incMetricCompteur(str);
            if (isResumed()) {
                d(-1);
            }
        }
    }
}
