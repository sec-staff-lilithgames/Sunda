package bj;

import android.content.Intent;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.CompteActivity;
import com.digidust.elokence.akinator.activities.ConfirmationMailActivity;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.HistoriquePodiumActivity;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.MenuActivity;
import com.digidust.elokence.akinator.activities.ModifyPasswordAfterResetActivity;
import com.digidust.elokence.akinator.activities.ModifyProfileActivity;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.digidust.elokence.akinator.activities.SeveralCharactersProposalActivity;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import o9.j8;
import o9.s;
import o9.s8;
import q9.k;
import r9.e;
import s9.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class v0 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9672c;

    public /* synthetic */ v0(Object obj, int i10) {
        this.f9671b = i10;
        this.f9672c = obj;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f9671b;
        String str = "PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD";
        Object obj2 = this.f9672c;
        switch (i10) {
            case 0:
                w0 w0Var = (w0) obj2;
                rj.y yVar = (rj.y) obj;
                FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = w0Var.f9678f;
                if (firebaseInAppMessagingDisplay != null) {
                    firebaseInAppMessagingDisplay.displayMessage(yVar.getInAppMessage(), w0Var.f9674b.generateDisplayCallback(yVar.getInAppMessage(), yVar.getTriggeringEvent()));
                    break;
                }
                break;
            case 1:
                ((TaskCompletionSource) obj2).setResult(obj);
                break;
            case 2:
                ((nj.c) obj2).updateContextualTriggers((FetchEligibleCampaignsResponse) obj);
                break;
            case 3:
                ((nj.j1) obj2).processCampaignFetch((FetchEligibleCampaignsResponse) obj);
                break;
            case 4:
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj2;
                Boolean bool = (Boolean) obj;
                if (!campaignProto$ThickContent.getPayloadCase().equals(qk.h.VANILLA_PAYLOAD)) {
                    if (campaignProto$ThickContent.getPayloadCase().equals(qk.h.EXPERIMENTAL_PAYLOAD)) {
                        nj.j0.logi("Already impressed experiment " + campaignProto$ThickContent.getExperimentalPayload().getCampaignName() + " ? : " + bool);
                        break;
                    }
                } else {
                    nj.j0.logi("Already impressed campaign " + campaignProto$ThickContent.getVanillaPayload().getCampaignName() + " ? : " + bool);
                    break;
                }
                break;
            case 5:
                s.a aVar = o9.s.f78491t;
                ((o9.r) obj2).invoke(obj);
                break;
            case 6:
                s.a aVar2 = o9.s.f78491t;
                ((o9.r) obj2).invoke(obj);
                break;
            case 7:
                s.a aVar3 = o9.s.f78491t;
                ((f.j0) obj2).invoke(obj);
                break;
            case 8:
                s.a aVar4 = o9.s.f78491t;
                ((b1.f0) obj2).invoke(obj);
                break;
            case 9:
                s.a aVar5 = o9.s.f78491t;
                ((o9.r) obj2).invoke(obj);
                break;
            case 10:
                CompteActivity compteActivity = (CompteActivity) obj2;
                Integer num = (Integer) obj;
                int i11 = CompteActivity.R;
                compteActivity.getClass();
                if (num.intValue() != 0) {
                    if (num.intValue() != 400) {
                        Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_MODIFICATION"), 0).show();
                        break;
                    } else {
                        Toast.makeText(compteActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    ca.m.sharedInstance().setPseudoUser(compteActivity.H.getText().toString().toUpperCase());
                    ta.o.sharedInstance().updatePseudo();
                    compteActivity.startActivity(new Intent(compteActivity, (Class<?>) MenuActivity.class));
                    compteActivity.finish();
                    break;
                }
            case 11:
                Integer num2 = (Integer) obj;
                CompteActivity compteActivity2 = ((o9.y) obj2).f78682a;
                if (num2.intValue() != 0) {
                    if (num2.intValue() != 400) {
                        Toast.makeText(compteActivity2, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_SUPPRESSION_COMPTE"), 0).show();
                        break;
                    } else {
                        Toast.makeText(compteActivity2, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    ca.v.sharedInstance().deleteAccount(compteActivity2.I);
                    ca.m.sharedInstance().eraseUserData();
                    ca.r.sharedInstance().setIdJoueurAccount("none");
                    ca.m.sharedInstance().setUserConnectionStatus(false);
                    ca.m.sharedInstance().setPseudoUser("");
                    ca.m.sharedInstance().setHasGivenConsentForThisAccount(false);
                    ca.m.sharedInstance().changeClassementState(0);
                    ca.m.sharedInstance().setCurrentLanguage(lb.b1.sharedInstance().getApplicationLanguage());
                    compteActivity2.startActivity(new Intent(compteActivity2, (Class<?>) MenuActivity.class));
                    compteActivity2.finish();
                    break;
                }
            case 12:
                ConfirmationMailActivity confirmationMailActivity = (ConfirmationMailActivity) obj2;
                Integer num3 = (Integer) obj;
                int i12 = ConfirmationMailActivity.G;
                if (num3.intValue() != 0) {
                    if (num3.intValue() == 400) {
                        Toast.makeText(confirmationMailActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    da.f fVar = new da.f(confirmationMailActivity);
                    fVar.setTypeOkNew(lb.b1.sharedInstance().getTraductionFromToken("COMPTE_MOT_DE_PASSE_OUBLIE_CONFIRMATION"));
                    fVar.setOkListener(new ha.a(confirmationMailActivity, 27));
                    break;
                }
                break;
            case 13:
                Integer num4 = (Integer) obj;
                ConnectActivity connectActivity = ((o9.d0) obj2).f78084a;
                if (num4.intValue() != 0) {
                    if (num4.intValue() != 400) {
                        if (num4.intValue() != -70) {
                            Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        } else {
                            Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERR_PAS_ACTIVE"), 0).show();
                            break;
                        }
                    } else {
                        Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    da.f fVar2 = new da.f(connectActivity);
                    fVar2.setTypeOk(lb.b1.sharedInstance().getTraductionFromToken("COMPTE_MOT_DE_PASSE_OUBLIE_CONFIRMATION"));
                    fVar2.setOkListener(new nh.n1(11));
                    break;
                }
            case 14:
                DefiDuJourActivity defiDuJourActivity = (DefiDuJourActivity) obj2;
                Integer num5 = (Integer) obj;
                int[] iArr = DefiDuJourActivity.P;
                defiDuJourActivity.getClass();
                if (num5.intValue() != 0 && num5.intValue() == 400) {
                    Toast.makeText(defiDuJourActivity, "Erreur technique, merci de réessayer plus tard.", 0).show();
                    break;
                }
                break;
            case 15:
                int i13 = HistoriquePodiumActivity.E;
                ((aw.f) obj2).invoke(obj);
                break;
            case 16:
                ModifyPasswordAfterResetActivity modifyPasswordAfterResetActivity = (ModifyPasswordAfterResetActivity) obj2;
                Integer num6 = (Integer) obj;
                int i14 = ModifyPasswordAfterResetActivity.M;
                modifyPasswordAfterResetActivity.getClass();
                if (num6.intValue() != 0) {
                    if (num6.intValue() != 400) {
                        if (num6.intValue() != 0) {
                            Toast.makeText(modifyPasswordAfterResetActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            break;
                        }
                    } else {
                        Toast.makeText(modifyPasswordAfterResetActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    Toast.makeText(modifyPasswordAfterResetActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CONFIRMATION_MODIFICATION"), 0).show();
                    modifyPasswordAfterResetActivity.startActivity(new Intent(modifyPasswordAfterResetActivity, (Class<?>) ConnectActivity.class));
                    modifyPasswordAfterResetActivity.finish();
                    break;
                }
                break;
            case 17:
                ModifyProfileActivity modifyProfileActivity = (ModifyProfileActivity) obj2;
                Integer num7 = (Integer) obj;
                int i15 = ModifyProfileActivity.Q;
                modifyProfileActivity.getClass();
                if (num7.intValue() != 0 && modifyProfileActivity.K) {
                    if (num7.intValue() != 400) {
                        if (num7.intValue() == -10 || num7.intValue() == -100) {
                            str = "COMPTE_EMAIL_DEJA_UTILISE";
                        } else if (num7.intValue() == -50) {
                            str = "COMPTE_ERR_AUTHENTIFICATION";
                        }
                    }
                    new da.f(modifyProfileActivity).setTypeOkNew(lb.b1.sharedInstance().getTraductionFromToken(str));
                    break;
                } else if (num7.intValue() != 0 || !modifyProfileActivity.K) {
                    if (num7.intValue() == 0 && !modifyProfileActivity.K) {
                        Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CONFIRMATION_MODIFICATION"), 0).show();
                        modifyProfileActivity.startActivity(new Intent(modifyProfileActivity, (Class<?>) CompteActivity.class));
                        modifyProfileActivity.finish();
                        break;
                    } else if (num7.intValue() != 400) {
                        if (num7.intValue() != -20 && num7.intValue() != -50) {
                            if (num7.intValue() != 0) {
                                Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERREUR_MODIFICATION"), 0).show();
                                break;
                            }
                        } else {
                            Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERR_AUTHENTIFICATION"), 0).show();
                            break;
                        }
                    } else {
                        Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    Toast.makeText(modifyProfileActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CONFIRMATION_MODIFICATION_EMAIL"), 0).show();
                    Intent intent = new Intent(modifyProfileActivity, (Class<?>) HomeActivity.class);
                    ca.m.sharedInstance().setUserConnectionStatus(false);
                    modifyProfileActivity.startActivity(intent);
                    modifyProfileActivity.finish();
                    break;
                }
                break;
            case 18:
                PopPedagogiqueActivity popPedagogiqueActivity = (PopPedagogiqueActivity) obj2;
                Integer num8 = (Integer) obj;
                int i16 = PopPedagogiqueActivity.V;
                popPedagogiqueActivity.getClass();
                if (num8.intValue() != 0 && num8.intValue() == 400) {
                    Toast.makeText(popPedagogiqueActivity, "Erreur technique, merci de réessayer plus tard.", 0).show();
                    break;
                }
                break;
            case 19:
                ((SeveralCharactersProposalActivity) obj2).G.notifyDataSetChanged();
                break;
            case 20:
                ((j8) obj2).f78274j.notifyDataSetChanged();
                break;
            case 21:
                ((s8) obj2).f78542i.notifyDataSetChanged();
                break;
            case 22:
                StoreItemsActivity storeItemsActivity = (StoreItemsActivity) obj2;
                Integer num9 = (Integer) obj;
                String[] strArr = StoreItemsActivity.U;
                storeItemsActivity.getClass();
                if (num9.intValue() != 0 && num9.intValue() == 400) {
                    Toast.makeText(storeItemsActivity, "Erreur technique, merci de réessayer plus tard.", 0).show();
                    break;
                }
                break;
            case 23:
                k.a aVar6 = q9.k.f82639l;
                ((q9.j) obj2).invoke(obj);
                break;
            case 24:
                k.a aVar7 = q9.k.f82639l;
                ((q9.j) obj2).invoke(obj);
                break;
            case 25:
                e.a aVar8 = r9.e.f84058h;
                ((r9.d) obj2).invoke(obj);
                break;
            case 26:
                e.a aVar9 = r9.e.f84058h;
                ((r9.d) obj2).invoke(obj);
                break;
            case 27:
                int i17 = ra.h.f84068k;
                ((f.j0) obj2).invoke(obj);
                break;
            case 28:
                c.a aVar10 = s9.c.f85509j;
                ((s9.b) obj2).invoke(obj);
                break;
            default:
                c.a aVar11 = s9.c.f85509j;
                ((s9.b) obj2).invoke(obj);
                break;
        }
    }
}
