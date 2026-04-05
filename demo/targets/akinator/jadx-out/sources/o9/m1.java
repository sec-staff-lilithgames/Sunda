package o9;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.elokence.elokenceutils.AutoResizeTextView;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Timer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m1 extends c1 {
    public int A;
    public int B;

    /* renamed from: c, reason: collision with root package name */
    public ta.i f78334c;

    /* renamed from: e, reason: collision with root package name */
    public ta.i f78335e;

    /* renamed from: f, reason: collision with root package name */
    public ta.i f78336f;

    /* renamed from: k, reason: collision with root package name */
    public View f78341k;

    /* renamed from: l, reason: collision with root package name */
    public View f78342l;

    /* renamed from: m, reason: collision with root package name */
    public View f78343m;

    /* renamed from: n, reason: collision with root package name */
    public View f78344n;

    /* renamed from: o, reason: collision with root package name */
    public View f78345o;

    /* renamed from: p, reason: collision with root package name */
    public View f78346p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f78347q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f78348r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f78349s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f78350t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f78351u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f78352v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f78353w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f78354x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f78355y;

    /* renamed from: z, reason: collision with root package name */
    public int f78356z;

    /* renamed from: g, reason: collision with root package name */
    public Timer f78337g = null;

    /* renamed from: h, reason: collision with root package name */
    public h1 f78338h = null;

    /* renamed from: i, reason: collision with root package name */
    public Timer f78339i = null;

    /* renamed from: j, reason: collision with root package name */
    public l1 f78340j = null;
    public long C = 0;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;

    public static m1 newInstance() {
        return new m1();
    }

    public final void a() {
        Timer timer = this.f78339i;
        if (timer != null) {
            timer.cancel();
            this.f78339i = null;
        }
        l1 l1Var = this.f78340j;
        if (l1Var != null) {
            l1Var.cancel();
            this.f78340j = null;
        }
    }

    public final void b() {
        Timer timer = this.f78337g;
        if (timer != null) {
            timer.cancel();
            this.f78337g = null;
        }
        h1 h1Var = this.f78338h;
        if (h1Var != null) {
            h1Var.cancel();
            this.f78338h = null;
        }
    }

    public final void c(ta.i iVar) {
        if (iVar == null) {
            return;
        }
        int delay = iVar.getDelay();
        int awardId = iVar.getAwardId();
        TextView textView = awardId != 3 ? awardId != 4 ? awardId != 5 ? null : this.f78347q : this.f78350t : this.f78353w;
        if (!this.F || textView == null) {
            return;
        }
        if (delay < 60) {
            textView.setText(kb.f.getSecPlayedFrom(delay));
            return;
        }
        if (delay >= 60 && delay < 3600) {
            textView.setText(kb.f.getMinPlayedFrom(delay));
        } else if (delay >= 3600) {
            textView.setText(kb.f.getHoursPlayedFrom(delay));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ta.i r11) throws android.content.res.Resources.NotFoundException {
        /*
            r10 = this;
            int r0 = r11.getAwardId()
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L18
            r1 = 5
            if (r0 == r1) goto L11
            r0 = 0
            r5 = r0
            r7 = r5
            goto L22
        L11:
            android.view.View r0 = r10.f78341k
            android.view.View r1 = r10.f78344n
        L15:
            r7 = r0
            r5 = r1
            goto L22
        L18:
            android.view.View r0 = r10.f78342l
            android.view.View r1 = r10.f78345o
            goto L15
        L1d:
            android.view.View r0 = r10.f78343m
            android.view.View r1 = r10.f78346p
            goto L15
        L22:
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            if (r0 == 0) goto L8a
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            r1 = 2130837507(0x7f020003, float:1.727997E38)
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r10.getActivity()
            r3 = 2130837506(0x7f020002, float:1.7279968E38)
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r2, r3)
            androidx.fragment.app.FragmentActivity r2 = r10.getActivity()
            android.animation.Animator r4 = android.animation.AnimatorInflater.loadAnimator(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r10.getActivity()
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r1, r3)
            boolean r1 = r10.E
            if (r1 != 0) goto L6b
            r10.e(r11)
            r0.setTarget(r5)
            r9.setTarget(r7)
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            android.animation.AnimatorSet$Builder r0 = r11.play(r0)
            r0.with(r9)
            r11.start()
            return
        L6b:
            o9.j1 r2 = new o9.j1
            r3 = r10
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.addListener(r2)
            r0.setTarget(r7)
            r9.setTarget(r5)
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            android.animation.AnimatorSet$Builder r0 = r11.play(r0)
            r0.with(r9)
            r11.start()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.m1.d(ta.i):void");
    }

    public final void e(ta.i iVar) {
        TextView textView;
        TextView textView2;
        int awardId = iVar.getAwardId();
        if (awardId == 3) {
            textView = this.f78354x;
            textView2 = this.f78355y;
        } else if (awardId == 4) {
            textView = this.f78351u;
            textView2 = this.f78352v;
        } else if (awardId != 5) {
            textView = null;
            textView2 = null;
        } else {
            textView = this.f78348r;
            textView2 = this.f78349s;
        }
        if (textView != null && textView2 != null) {
            if (iVar.getPosition() > 0) {
                textView.setText(Html.fromHtml(iVar.getPseudo() + "<small>(" + iVar.getPosition() + ")</small>", 0));
            } else {
                textView.setText(Html.fromHtml(iVar.getPseudo(), 0));
            }
            textView2.setText(Html.fromHtml("<small>" + lb.b1.sharedInstance().getTraductionFromToken("GAGNE_AVEC") + "</small><br><br>" + iVar.getNom() + "<br><i><small>" + iVar.getDesc() + "</small></i>", 0));
            ((AutoResizeTextView) textView2).resizeText();
        }
        c(iVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f78334c = (ta.i) getArguments().getParcelable("BLACK_PLAYER");
            this.f78335e = (ta.i) getArguments().getParcelable("PLATINUM_PLAYER");
            this.f78336f = (ta.i) getArguments().getParcelable("GOLD_PLAYER");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_hall_of_fames, viewGroup, false);
        this.f78341k = viewInflate.findViewById(R.id.blackLayout);
        this.f78342l = viewInflate.findViewById(R.id.platinumLayout);
        this.f78343m = viewInflate.findViewById(R.id.goldLayout);
        this.f78344n = viewInflate.findViewById(R.id.blackLayoutBack);
        this.f78345o = viewInflate.findViewById(R.id.platinumLayoutBack);
        this.f78346p = viewInflate.findViewById(R.id.goldLayoutBack);
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(getActivity().getAssets(), "fonts/roman_sd.ttf");
        this.f78348r = (TextView) viewInflate.findViewById(R.id.blackPseudo);
        this.f78349s = (TextView) viewInflate.findViewById(R.id.blackPerso);
        this.f78347q = (TextView) viewInflate.findViewById(R.id.blackDelay);
        this.f78351u = (TextView) viewInflate.findViewById(R.id.platinumPseudo);
        this.f78352v = (TextView) viewInflate.findViewById(R.id.platinumPerso);
        this.f78350t = (TextView) viewInflate.findViewById(R.id.platinumDelay);
        this.f78354x = (TextView) viewInflate.findViewById(R.id.goldPseudo);
        this.f78355y = (TextView) viewInflate.findViewById(R.id.goldPerso);
        this.f78353w = (TextView) viewInflate.findViewById(R.id.goldDelay);
        this.f78348r.setTypeface(typefaceCreateFromAsset);
        this.f78349s.setTypeface(typefaceCreateFromAsset);
        this.f78347q.setTypeface(typefaceCreateFromAsset);
        this.f78351u.setTypeface(typefaceCreateFromAsset);
        this.f78352v.setTypeface(typefaceCreateFromAsset);
        this.f78350t.setTypeface(typefaceCreateFromAsset);
        this.f78354x.setTypeface(typefaceCreateFromAsset);
        this.f78355y.setTypeface(typefaceCreateFromAsset);
        this.f78353w.setTypeface(typefaceCreateFromAsset);
        if (this.f78334c != null && this.f78335e != null && this.f78336f != null) {
            b();
            a();
            this.f78334c = null;
            this.f78335e = null;
            this.f78336f = null;
        }
        this.f78341k.setAlpha(0.0f);
        this.f78342l.setAlpha(0.0f);
        this.f78343m.setAlpha(0.0f);
        this.E = false;
        this.D = true;
        this.f78337g = new Timer();
        h1 h1Var = new h1(this);
        this.f78338h = h1Var;
        this.f78337g.scheduleAtFixedRate(h1Var, 0L, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        b();
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.F = false;
        this.C = System.currentTimeMillis();
        ta.i iVar = this.f78334c;
        if (iVar != null) {
            this.f78356z = iVar.getDelay();
        }
        ta.i iVar2 = this.f78335e;
        if (iVar2 != null) {
            this.A = iVar2.getDelay();
        }
        ta.i iVar3 = this.f78336f;
        if (iVar3 != null) {
            this.B = iVar3.getDelay();
        }
        a();
        b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int i10;
        int i11;
        int i12;
        super.onResume();
        this.F = true;
        if (this.C != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.C;
            ta.i iVar = this.f78334c;
            if (iVar != null && (i12 = this.f78356z) != 0) {
                iVar.setDelay(i12 + ((int) (jCurrentTimeMillis / 1000.0f)));
            }
            ta.i iVar2 = this.f78335e;
            if (iVar2 != null && (i11 = this.A) != 0) {
                iVar2.setDelay(i11 + ((int) (jCurrentTimeMillis / 1000.0f)));
            }
            ta.i iVar3 = this.f78336f;
            if (iVar3 != null && (i10 = this.B) != 0) {
                iVar3.setDelay(i10 + ((int) (jCurrentTimeMillis / 1000.0f)));
            }
            a();
            this.f78339i = new Timer();
            l1 l1Var = new l1(this);
            this.f78340j = l1Var;
            this.f78339i.scheduleAtFixedRate(l1Var, 0L, 1000L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("BLACK_PLAYER", this.f78334c);
        bundle.putSerializable("PLATINUM_PLAYER", this.f78335e);
        bundle.putSerializable("GOLD_PLAYER", this.f78336f);
    }

    public void refreshHallOfFame(ta.i iVar, ta.i iVar2, ta.i iVar3) throws Resources.NotFoundException {
        ta.i iVar4 = this.f78334c;
        if (iVar4 == null || ((!iVar4.getPseudo().equals(iVar.getPseudo()) || !this.f78334c.getNom().equals(iVar.getNom())) && iVar.getDelay() < this.f78334c.getDelay())) {
            this.f78334c = iVar;
            d(iVar);
        }
        ta.i iVar5 = this.f78335e;
        if (iVar5 == null || ((!iVar5.getPseudo().equals(iVar2.getPseudo()) || !this.f78335e.getNom().equals(iVar2.getNom())) && iVar2.getDelay() < this.f78335e.getDelay())) {
            this.f78335e = iVar2;
            d(iVar2);
        }
        ta.i iVar6 = this.f78336f;
        if (iVar6 == null || (!(iVar6.getPseudo().equals(iVar3.getPseudo()) && this.f78336f.getNom().equals(iVar3.getNom())) && iVar3.getDelay() < this.f78336f.getDelay())) {
            this.f78336f = iVar3;
            d(iVar3);
        }
    }

    @Override // o9.c1
    public final boolean removeCreatedView() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            jb.h.sharedInstance().incMetricCompteur("lsa_displayed");
            if (isResumed()) {
                this.f78337g = new Timer();
                h1 h1Var = new h1(this);
                this.f78338h = h1Var;
                this.f78337g.scheduleAtFixedRate(h1Var, 0L, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            }
        }
    }

    public static m1 newInstance(ta.i iVar, ta.i iVar2, ta.i iVar3) {
        m1 m1Var = new m1();
        Bundle bundle = new Bundle();
        bundle.putSerializable("BLACK_PLAYER", iVar);
        bundle.putSerializable("PLATINUM_PLAYER", iVar2);
        bundle.putSerializable("GOLD_PLAYER", iVar3);
        m1Var.setArguments(bundle);
        return m1Var;
    }
}
