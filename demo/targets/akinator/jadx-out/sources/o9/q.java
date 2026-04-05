package o9;

import android.R;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.HistoriquePodiumActivity;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.digidust.elokence.akinator.paid.databinding.LayoutHistoriqueBinding;
import lb.b1;
import o9.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f78454c;

    public /* synthetic */ q(s sVar, int i10) {
        this.f78453b = i10;
        this.f78454c = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ta.f fVar;
        String strReplace$default;
        int i10 = this.f78453b;
        int i11 = 5;
        int i12 = 0;
        AkActivity akActivity = null;
        AkActivity akActivity2 = null;
        AkActivity akActivity3 = null;
        int i13 = 1;
        s sVar = this.f78454c;
        switch (i10) {
            case 0:
                s.a aVar = s.f78491t;
                jb.h.f69257d.sharedInstance().incMetricCompteur("classement_veille");
                sVar.d(0);
                ca.m.sharedInstance().updateUserChoice(0);
                break;
            case 1:
                s.a aVar2 = s.f78491t;
                sVar.d(1);
                ca.m.sharedInstance().updateUserChoice(1);
                break;
            case 2:
                AkActivity akActivity4 = sVar.f78500l;
                if (akActivity4 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("activityMaster");
                } else {
                    akActivity = akActivity4;
                }
                akActivity.disableAdOneTime();
                Intent intent = new Intent(sVar.getActivity(), (Class<?>) PopPedagogiqueActivity.class);
                intent.putExtra("PostPedagogiqueActivityModeClassement", true);
                sVar.startActivity(intent);
                break;
            case 3:
                ta.c cVar = sVar.f78497i;
                if (cVar != null) {
                    kotlin.jvm.internal.e0.checkNotNull(cVar);
                    if (!cVar.getTopPlayers().isEmpty()) {
                        Object tag = view != null ? view.getTag() : null;
                        if (kotlin.jvm.internal.e0.areEqual(tag, "top1")) {
                            ta.c cVar2 = sVar.f78497i;
                            kotlin.jvm.internal.e0.checkNotNull(cVar2);
                            fVar = cVar2.getTopPlayers().get(0);
                        } else if (kotlin.jvm.internal.e0.areEqual(tag, "top2")) {
                            ta.c cVar3 = sVar.f78497i;
                            kotlin.jvm.internal.e0.checkNotNull(cVar3);
                            fVar = cVar3.getTopPlayers().get(1);
                        } else if (kotlin.jvm.internal.e0.areEqual(tag, "top3")) {
                            ta.c cVar4 = sVar.f78497i;
                            kotlin.jvm.internal.e0.checkNotNull(cVar4);
                            fVar = cVar4.getTopPlayers().get(2);
                        } else {
                            fVar = null;
                        }
                        if (fVar != null) {
                            sVar.removeCreatedView();
                            ViewGroup viewGroup = (ViewGroup) sVar.requireActivity().getWindow().getDecorView().findViewById(R.id.content);
                            sVar.f78499k = viewGroup;
                            if (viewGroup != null) {
                                LayoutHistoriqueBinding layoutHistoriqueBindingInflate = LayoutHistoriqueBinding.inflate(LayoutInflater.from(sVar.getActivity()), sVar.f78499k, false);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(layoutHistoriqueBindingInflate, "inflate(...)");
                                sVar.f78498j = layoutHistoriqueBindingInflate.getRoot();
                                layoutHistoriqueBindingInflate.closePopUp.setOnClickListener(new q(sVar, 4));
                                layoutHistoriqueBindingInflate.titreHisto.setTypeface(sVar.f78496h);
                                String traductionFromToken = lb.b1.f72741d.sharedInstance().getTraductionFromToken("DETAIL_AWARD_PAR_JOUEUR");
                                ta.c cVar5 = sVar.f78497i;
                                if (cVar5 != null) {
                                    kotlin.jvm.internal.e0.checkNotNull(cVar5);
                                    if (!cVar5.getTopPlayers().isEmpty()) {
                                        Object tag2 = view != null ? view.getTag() : null;
                                        if (kotlin.jvm.internal.e0.areEqual(tag2, "top1")) {
                                            ta.c cVar6 = sVar.f78497i;
                                            kotlin.jvm.internal.e0.checkNotNull(cVar6);
                                            strReplace$default = sv.k0.replace$default(traductionFromToken, "[nom_joueur]", cVar6.getTopPlayers().get(0).getNom(), false, 4, (Object) null);
                                        } else if (kotlin.jvm.internal.e0.areEqual(tag2, "top2")) {
                                            ta.c cVar7 = sVar.f78497i;
                                            kotlin.jvm.internal.e0.checkNotNull(cVar7);
                                            strReplace$default = sv.k0.replace$default(traductionFromToken, "[nom_joueur]", cVar7.getTopPlayers().get(1).getNom(), false, 4, (Object) null);
                                        } else if (kotlin.jvm.internal.e0.areEqual(tag2, "top3")) {
                                            ta.c cVar8 = sVar.f78497i;
                                            kotlin.jvm.internal.e0.checkNotNull(cVar8);
                                            strReplace$default = sv.k0.replace$default(traductionFromToken, "[nom_joueur]", cVar8.getTopPlayers().get(2).getNom(), false, 4, (Object) null);
                                        } else {
                                            strReplace$default = "";
                                        }
                                        traductionFromToken = strReplace$default;
                                    }
                                }
                                layoutHistoriqueBindingInflate.titreHisto.setText(traductionFromToken);
                                FragmentActivity fragmentActivityRequireActivity = sVar.requireActivity();
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                layoutHistoriqueBindingInflate.listViewHistorique.setAdapter((ListAdapter) new y9.k(fragmentActivityRequireActivity, fVar.getBadges().get(5), fVar.getBadges().get(4), fVar.getBadges().get(3), fVar.getBadges().get(2), fVar.getBadges().get(1)));
                                sVar.requireActivity().runOnUiThread(new p(sVar, 1));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                s.a aVar3 = s.f78491t;
                sVar.removeCreatedView();
                break;
            case 5:
                AkActivity akActivity5 = sVar.f78500l;
                if (akActivity5 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("activityMaster");
                } else {
                    akActivity3 = akActivity5;
                }
                akActivity3.disableAdOneTime();
                sVar.startActivity(new Intent(sVar.getActivity(), (Class<?>) HistoriquePodiumActivity.class));
                break;
            default:
                AkActivity akActivity6 = sVar.f78500l;
                if (akActivity6 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("activityMaster");
                } else {
                    akActivity2 = akActivity6;
                }
                akActivity2.disableAdOneTime();
                if (!ca.m.sharedInstance().mustDisplayDidacVote()) {
                    mt.n0 n0VarCreate = mt.n0.create(new ha.a(sVar, 26));
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
                    sVar.f78501m = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(ou.j.newThread()).subscribe(new bj.v0(new r(sVar, i12), i11), new bj.v0(new r(sVar, i13), 6));
                    break;
                } else {
                    FragmentActivity fragmentActivityRequireActivity2 = sVar.requireActivity();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                    da.f fVar2 = new da.f(fragmentActivityRequireActivity2);
                    b1.a aVar4 = lb.b1.f72741d;
                    fVar2.setTypeYesNo(aVar4.sharedInstance().getTraductionFromToken("AIDE_MOI_VALIDER_AWARD") + "\n\n" + aVar4.sharedInstance().getTraductionFromToken("REGLE_PERSONNAGE") + " " + aVar4.sharedInstance().getTraductionFromToken("REGLE_VOTE_2"));
                    fVar2.setConfirmeListener(new u(sVar));
                    break;
                }
        }
    }
}
