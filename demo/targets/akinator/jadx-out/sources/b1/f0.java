package b1;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.FragmentClassementBinding;
import com.unity3d.services.core.request.NJc.yFkbx;
import j1.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nh.n1;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8609b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8610c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8611e;

    public /* synthetic */ f0(int i10, Collection collection) {
        this.f8610c = i10;
        this.f8611e = collection;
    }

    public /* synthetic */ f0(o9.s sVar, int i10) {
        this.f8611e = sVar;
        this.f8610c = i10;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f8609b;
        int i11 = this.f8610c;
        Object obj2 = this.f8611e;
        switch (i10) {
            case 0:
                List list = (List) obj;
                Parcelable.Creator<SnapshotStateList<Object>> creator = SnapshotStateList.CREATOR;
                return Boolean.valueOf(list.addAll(i11, (Collection) obj2));
            default:
                o9.s sVar = (o9.s) obj2;
                ArrayList arrayList = (ArrayList) obj;
                FragmentClassementBinding fragmentClassementBinding = sVar.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
                fragmentClassementBinding.loadingBarClassement.setVisibility(8);
                ta.c cVar = (ta.c) arrayList.get(1);
                if (i11 == -1) {
                    String lastClassementIdUpdateScore = ca.m.sharedInstance().getLastClassementIdUpdateScore();
                    if (lastClassementIdUpdateScore == null) {
                        int userChoice = ca.m.sharedInstance().getUserChoice();
                        if (userChoice == -1) {
                            userChoice = 0;
                        }
                        if (cVar != null) {
                            ca.m.sharedInstance().updateClassementCourantId(cVar.getId());
                        }
                        z10 = userChoice == 1;
                        sVar.f78497i = (ta.c) arrayList.get(userChoice);
                        sVar.e(userChoice);
                    } else {
                        if (cVar != null && ca.m.sharedInstance().getLastClassementCourantId() == null) {
                            ca.m.sharedInstance().updateClassementCourantId(cVar.getId());
                            ca.m.sharedInstance().updateUserChoice(-1);
                        } else if (cVar != null && !kotlin.jvm.internal.e0.areEqual(ca.m.sharedInstance().getLastClassementCourantId(), cVar.getId())) {
                            ca.m.sharedInstance().updateClassementCourantId(cVar.getId());
                            ca.m.sharedInstance().updateUserChoice(-1);
                        }
                        int userChoice2 = ca.m.sharedInstance().getUserChoice();
                        if (userChoice2 == -1) {
                            userChoice2 = (cVar == null || !kotlin.jvm.internal.e0.areEqual(lastClassementIdUpdateScore, cVar.getId())) ? 0 : 1;
                        }
                        z10 = userChoice2 == 1;
                        sVar.f78497i = (ta.c) arrayList.get(userChoice2);
                        sVar.e(userChoice2);
                    }
                } else {
                    z10 = i11 == 1;
                    sVar.f78497i = (ta.c) arrayList.get(i11);
                }
                sVar.c(cVar != null ? cVar.getCanVote() : false, cVar != null ? cVar.getCanSignalVote() : false);
                ViewGroup viewGroup = null;
                ta.d fakes = cVar != null ? cVar.getFakes() : null;
                if (fakes != null) {
                    o9.b1 b1Var = sVar.f78060b;
                    if (b1Var != null) {
                        ((o9.w0) b1Var).onDeactivateAutoScroll();
                    }
                    if (sVar.getActivity() != null) {
                        FragmentActivity fragmentActivityRequireActivity = sVar.requireActivity();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, yFkbx.uJgOKBGBswrU);
                        da.f fVar = new da.f(fragmentActivityRequireActivity);
                        fVar.setTypePointsPerdus(fakes);
                        fVar.setOkListener(new n1(10));
                    }
                }
                if (sVar.f78497i != null) {
                    FragmentClassementBinding fragmentClassementBinding2 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding2);
                    fragmentClassementBinding2.zoneTopPlayers.removeAllViews();
                    FragmentClassementBinding fragmentClassementBinding3 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding3);
                    fragmentClassementBinding3.zoneMe.removeAllViews();
                    FragmentClassementBinding fragmentClassementBinding4 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding4);
                    TextView textView = fragmentClassementBinding4.textNbParticipant;
                    ta.c cVar2 = sVar.f78497i;
                    kotlin.jvm.internal.e0.checkNotNull(cVar2);
                    textView.setText(cVar2.getNbParticipants() + " " + lb.b1.f72741d.sharedInstance().getTraductionFromToken("PARTICIPANTS"));
                    FragmentClassementBinding fragmentClassementBinding5 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding5);
                    TextView textView2 = fragmentClassementBinding5.textTemps;
                    ta.c cVar3 = sVar.f78497i;
                    kotlin.jvm.internal.e0.checkNotNull(cVar3);
                    textView2.setText(String.valueOf(cVar3.getTempsRestant()));
                    sVar.b();
                    ta.c cVar4 = sVar.f78497i;
                    kotlin.jvm.internal.e0.checkNotNull(cVar4);
                    boolean zIsEmpty = cVar4.getTopPlayers().isEmpty();
                    int i12 = 2;
                    int i13 = R.layout.layout_one_classement;
                    String str = LJjmO.mtIKxiEcy;
                    if (!zIsEmpty) {
                        FragmentClassementBinding fragmentClassementBinding6 = sVar.f78506r;
                        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding6);
                        fragmentClassementBinding6.zoneTopPlayers.setVisibility(0);
                        ta.c cVar5 = sVar.f78497i;
                        kotlin.jvm.internal.e0.checkNotNull(cVar5);
                        int size = cVar5.getTopPlayers().size();
                        int i14 = 0;
                        while (i14 < size) {
                            ta.c cVar6 = sVar.f78497i;
                            kotlin.jvm.internal.e0.checkNotNull(cVar6);
                            ta.f fVar2 = cVar6.getTopPlayers().get(i14);
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(fVar2, str);
                            ta.f fVar3 = fVar2;
                            View viewInflate = LayoutInflater.from(sVar.getActivity()).inflate(i13, viewGroup);
                            kotlin.jvm.internal.e0.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            if (fVar3.getRang() == 1 || fVar3.getRang() == 2 || fVar3.getRang() == 3) {
                                linearLayout.setTag("top" + fVar3.getRang());
                                linearLayout.setOnClickListener(sVar.f78507s);
                            }
                            sVar.a(linearLayout, fVar3, z10);
                            FragmentClassementBinding fragmentClassementBinding7 = sVar.f78506r;
                            kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding7);
                            fragmentClassementBinding7.zoneTopPlayers.addView(linearLayout);
                            i14++;
                            viewGroup = null;
                            i13 = R.layout.layout_one_classement;
                        }
                    }
                    ta.c cVar7 = sVar.f78497i;
                    kotlin.jvm.internal.e0.checkNotNull(cVar7);
                    if (cVar7.getClassementPlayers().isEmpty()) {
                        FragmentClassementBinding fragmentClassementBinding8 = sVar.f78506r;
                        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding8);
                        fragmentClassementBinding8.zoneMe.setVisibility(8);
                    } else {
                        FragmentClassementBinding fragmentClassementBinding9 = sVar.f78506r;
                        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding9);
                        fragmentClassementBinding9.zoneMe.setVisibility(0);
                        FragmentClassementBinding fragmentClassementBinding10 = sVar.f78506r;
                        kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding10);
                        fragmentClassementBinding10.espace.setVisibility(0);
                        ta.c cVar8 = sVar.f78497i;
                        kotlin.jvm.internal.e0.checkNotNull(cVar8);
                        if (!cVar8.getTopPlayers().isEmpty()) {
                            ta.c cVar9 = sVar.f78497i;
                            kotlin.jvm.internal.e0.checkNotNull(cVar9);
                            int size2 = cVar9.getTopPlayers().size();
                            ta.c cVar10 = sVar.f78497i;
                            kotlin.jvm.internal.e0.checkNotNull(cVar10);
                            Iterator<ta.f> it = cVar10.getClassementPlayers().iterator();
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
                            while (true) {
                                if (it.hasNext()) {
                                    ta.f next = it.next();
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                                    ta.f fVar4 = next;
                                    ta.c cVar11 = sVar.f78497i;
                                    kotlin.jvm.internal.e0.checkNotNull(cVar11);
                                    if (!cVar11.getTopPlayers().isEmpty() && (fVar4.getRang() == size2 + 1 || fVar4.getRang() == size2 + 2)) {
                                        if (kotlin.jvm.internal.e0.areEqual(fVar4.getNom(), ca.r.sharedInstance().getNomJoueur())) {
                                            FragmentClassementBinding fragmentClassementBinding11 = sVar.f78506r;
                                            kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding11);
                                            fragmentClassementBinding11.espace.setVisibility(8);
                                            FragmentClassementBinding fragmentClassementBinding12 = sVar.f78506r;
                                            kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding12);
                                            fragmentClassementBinding12.scrollViewTopPlayers.post(new o9.p(sVar, i12));
                                        }
                                    }
                                }
                            }
                        }
                        ta.c cVar12 = sVar.f78497i;
                        kotlin.jvm.internal.e0.checkNotNull(cVar12);
                        int size3 = cVar12.getClassementPlayers().size();
                        if (size3 >= 1) {
                            for (int i15 = 0; i15 < size3; i15++) {
                                ta.c cVar13 = sVar.f78497i;
                                kotlin.jvm.internal.e0.checkNotNull(cVar13);
                                ta.f fVar5 = cVar13.getClassementPlayers().get(i15);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(fVar5, str);
                                View viewInflate2 = LayoutInflater.from(sVar.getActivity()).inflate(R.layout.layout_one_classement, (ViewGroup) null);
                                kotlin.jvm.internal.e0.checkNotNull(viewInflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate2;
                                sVar.a(linearLayout2, fVar5, z10);
                                FragmentClassementBinding fragmentClassementBinding13 = sVar.f78506r;
                                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding13);
                                fragmentClassementBinding13.zoneMe.addView(linearLayout2);
                            }
                        }
                    }
                    FragmentClassementBinding fragmentClassementBinding14 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding14);
                    fragmentClassementBinding14.zoneClassement.setVisibility(0);
                    FragmentClassementBinding fragmentClassementBinding15 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding15);
                    fragmentClassementBinding15.zoneTemps.setVisibility(0);
                } else {
                    FragmentClassementBinding fragmentClassementBinding16 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding16);
                    fragmentClassementBinding16.messageErrorHistorique.setVisibility(0);
                    FragmentClassementBinding fragmentClassementBinding17 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding17);
                    fragmentClassementBinding17.messageErrorHistorique.setTypeface(AkApplication.f21719f.getTypeFace());
                    FragmentClassementBinding fragmentClassementBinding18 = sVar.f78506r;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding18);
                    o2.A(lb.b1.f72741d, "CLASSEMENT_NON_DISPONIBLE", fragmentClassementBinding18.messageErrorHistorique);
                }
                Timber.Forest.tag("ClassementFragment").d("On passe mCanCallRefresh = true (sur succès)", new Object[0]);
                sVar.f78503o = true;
                return tu.x0.f87415a;
        }
    }
}
