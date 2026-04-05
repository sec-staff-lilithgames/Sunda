package o9;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.HistoriquePodiumActivity;
import com.digidust.elokence.akinator.activities.InscriptionActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.PartageVideoActivity;
import com.digidust.elokence.akinator.activities.PopuVipActivity;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.PreInscriptionActivity;
import com.digidust.elokence.akinator.activities.PropositionPotionActivity;
import com.digidust.elokence.akinator.activities.ReportActivity;
import com.digidust.elokence.akinator.activities.WebviewGeneralActivity;
import com.digidust.elokence.akinator.activities.rarecharacter.CongratRareCharacterActivity;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;
import com.inmobi.media.C2;
import com.inmobi.media.C2921o9;
import er.a;
import io.bidmachine.PrivacySheetData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78249c;

    public /* synthetic */ j0(Object obj, int i10) {
        this.f78248b = i10;
        this.f78249c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        int i10 = this.f78248b;
        Object obj = this.f78249c;
        switch (i10) {
            case 0:
                ((DefiDuJourActivity) obj).O.manageRewardedVideoListener();
                break;
            case 1:
                GameOverSliderActivity gameOverSliderActivity = (GameOverSliderActivity) obj;
                int i11 = GameOverSliderActivity.L;
                gameOverSliderActivity.getClass();
                ca.u.sharedInstance().setStepOfLastProp(0);
                ca.v.sharedInstance().startGameEvents(gameOverSliderActivity.F);
                gameOverSliderActivity.t();
                break;
            case 2:
                int i12 = HistoriquePodiumActivity.E;
                ((HistoriquePodiumActivity) obj).finish();
                break;
            case 3:
                n3 n3Var = (n3) obj;
                n3Var.getClass();
                na.b.playBip();
                n3Var.f78384c.goToStoreItems(true);
                break;
            case 4:
                int i13 = PartageVideoActivity.D;
                ((PartageVideoActivity) obj).finish();
                break;
            case 5:
                PopuVipActivity popuVipActivity = (PopuVipActivity) obj;
                int i14 = PopuVipActivity.C;
                popuVipActivity.startActivity(new Intent(popuVipActivity, (Class<?>) OneCharacterProposalActivity.class));
                popuVipActivity.finish();
                break;
            case 6:
                ((PostProposeActivity) obj).Y.manageRewardedVideoListener();
                break;
            case 7:
                PreInscriptionActivity preInscriptionActivity = (PreInscriptionActivity) obj;
                if (preInscriptionActivity.D.length() != 0) {
                    if (preInscriptionActivity.D.length() <= 6 && preInscriptionActivity.D.length() >= 3) {
                        ca.v.sharedInstance().proposeCreatePseudo(preInscriptionActivity.E);
                        ca.m.sharedInstance().setPseudoUser(preInscriptionActivity.D.getText().toString().toUpperCase());
                        Intent intent = new Intent(preInscriptionActivity, (Class<?>) InscriptionActivity.class);
                        intent.putExtra("coming_from_preinscription", true);
                        preInscriptionActivity.startActivity(intent);
                        preInscriptionActivity.finish();
                        break;
                    } else {
                        Toast.makeText(preInscriptionActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_CREATION_NAME"), 0).show();
                        break;
                    }
                } else {
                    Toast.makeText(preInscriptionActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_NOM_VIDE"), 0).show();
                    break;
                }
                break;
            case 8:
                int i15 = ReportActivity.I;
                ((ReportActivity) obj).t();
                break;
            case 9:
                ((t8) obj).f78123b.manageNextFragment();
                break;
            case 10:
                int i16 = WebviewGeneralActivity.D;
                ((WebviewGeneralActivity) obj).finish();
                break;
            case 11:
                t9.i iVar = (t9.i) obj;
                iVar.f86617f = -1;
                y9.h hVar = iVar.f86618g;
                kotlin.jvm.internal.e0.checkNotNull(hVar);
                hVar.setSelectedItem(iVar.f86617f);
                if (iVar.getMCallback() != null) {
                    p9.d mCallback = iVar.getMCallback();
                    kotlin.jvm.internal.e0.checkNotNull(mCallback);
                    mCallback.onAddMagicActionNext();
                    break;
                }
                break;
            case 12:
                u9.k kVar = (u9.k) obj;
                Intent intent2 = new Intent(kVar.f88170b, (Class<?>) PropositionPotionActivity.class);
                intent2.putExtra("potion", "ultimePub");
                kVar.f88170b.startActivity(intent2);
                kVar.f88170b.disableAdOneTime();
                break;
            case 13:
                CongratRareCharacterActivity congratRareCharacterActivity = (CongratRareCharacterActivity) obj;
                int i17 = CongratRareCharacterActivity.G;
                if (!congratRareCharacterActivity.D) {
                    congratRareCharacterActivity.D = true;
                    congratRareCharacterActivity.F.launch(new Intent(congratRareCharacterActivity, (Class<?>) OptionRareCharacterActivity.class));
                    break;
                }
                break;
            case 14:
                int i18 = OptionRareCharacterActivity.N;
                ((OptionRareCharacterActivity) obj).t();
                break;
            case 15:
                PrivacySheetData privacySheetData = (PrivacySheetData) obj;
                int i19 = yp.m.f94786b;
                kotlin.jvm.internal.e0.checkNotNullParameter(privacySheetData, "$privacySheetData");
                kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
                a.C0558a c0558a = er.a.f55004e;
                Context contextFindDialogContext = nm.j.findDialogContext(v10.getContext(), v10);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(contextFindDialogContext, "findDialogContext(v.context, v)");
                c0558a.show(contextFindDialogContext, privacySheetData.getPrivacySheetParams());
                break;
            case 16:
                int i20 = yq.i.f94816e;
                ((yq.i) obj).getClass();
                break;
            case 17:
                C2.a((C2) obj, v10);
                break;
            case 18:
                C2921o9.a((C2921o9) obj, v10);
                break;
            default:
                zq.g this$0 = (zq.g) obj;
                int i21 = zq.g.f98430e;
                kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
                this$0.f98432c.invoke();
                break;
        }
    }
}
