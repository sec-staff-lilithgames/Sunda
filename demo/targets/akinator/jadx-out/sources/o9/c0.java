package o9;

import android.content.Intent;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConnectActivity f78059c;

    public /* synthetic */ c0(ConnectActivity connectActivity, int i10) {
        this.f78058b = i10;
        this.f78059c = connectActivity;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f78058b;
        int i11 = 1;
        ConnectActivity connectActivity = this.f78059c;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                int i12 = ConnectActivity.U;
                if (num.intValue() != 0) {
                    if (num.intValue() != 400) {
                        if (num.intValue() != -90) {
                            if (num.intValue() != -80) {
                                if (num.intValue() != -30) {
                                    if (num.intValue() != -70) {
                                        if (num.intValue() != 0) {
                                            connectActivity.t();
                                            connectActivity.M.setEnabled(true);
                                            ca.m.sharedInstance().setUserConnectionStatus(false);
                                            Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                                            break;
                                        }
                                    } else {
                                        connectActivity.t();
                                        connectActivity.M.setEnabled(true);
                                        ca.m.sharedInstance().setUserConnectionStatus(false);
                                        Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERR_PAS_ACTIVE"), 0).show();
                                        da.f fVar = new da.f(connectActivity);
                                        fVar.setTypeDoubleButtonsCustom(lb.b1.sharedInstance().getTraductionFromToken("ENVOYER"), lb.b1.sharedInstance().getTraductionFromToken("ANNULER"), lb.b1.sharedInstance().getTraductionFromToken("COMPTE_NOUVEAU_MAIL_ACTIVATION_TEXT").replace("[MAIL]", connectActivity.H.getText().toString()));
                                        fVar.setConfirmeListener(new e0(connectActivity));
                                        break;
                                    }
                                } else {
                                    connectActivity.t();
                                    connectActivity.M.setEnabled(true);
                                    ca.m.sharedInstance().setUserConnectionStatus(false);
                                    Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_ERR_AUTHENTIFICATION"), 0).show();
                                    break;
                                }
                            } else {
                                connectActivity.t();
                                connectActivity.M.setEnabled(true);
                                ca.m.sharedInstance().setUserConnectionStatus(false);
                                Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_LOGIN_BLOCAGE"), 0).show();
                                break;
                            }
                        } else {
                            ca.m.sharedInstance().setUserConnectionStatus(false);
                            ca.m.sharedInstance().setIsDeviceConnectedWithSpecialAccount(true);
                            connectActivity.startActivity(new Intent(connectActivity, (Class<?>) HomeActivity.class));
                            connectActivity.finish();
                            break;
                        }
                    } else {
                        connectActivity.t();
                        connectActivity.M.setEnabled(true);
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    if (ca.m.sharedInstance().isFirstConnexion()) {
                        ca.m.sharedInstance().setIsFirstConnexion(false);
                        ca.v.sharedInstance().firstConnexion(connectActivity.K);
                    }
                    mt.b0.fromCallable(new x(2)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new c0(connectActivity, i11));
                    break;
                }
                break;
            case 1:
                int i13 = ConnectActivity.U;
                if (num.intValue() != 0) {
                    if (num.intValue() == 400) {
                        connectActivity.t();
                        connectActivity.M.setEnabled(true);
                        ca.m.sharedInstance().setUserConnectionStatus(false);
                        Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        break;
                    }
                } else {
                    ca.m.sharedInstance().setUserConnectionStatus(true);
                    ca.m.sharedInstance().setUserMail(connectActivity.H.getText().toString());
                    if (!connectActivity.P) {
                        if (!connectActivity.O) {
                            connectActivity.t();
                            connectActivity.M.setEnabled(true);
                            connectActivity.goToHome(false);
                            break;
                        } else {
                            connectActivity.t();
                            connectActivity.M.setEnabled(true);
                            connectActivity.startActivity(new Intent(connectActivity, (Class<?>) OneCharacterProposalActivity.class));
                            connectActivity.finish();
                            break;
                        }
                    } else {
                        connectActivity.t();
                        connectActivity.M.setEnabled(true);
                        ca.m.sharedInstance().setIsComingFromPopupClassement(false);
                        Intent intent = new Intent(connectActivity, (Class<?>) GameOverSliderActivity.class);
                        intent.putExtra("keyComeFromPopupClassement", true);
                        connectActivity.startActivity(intent);
                        break;
                    }
                }
                break;
            default:
                int i14 = ConnectActivity.U;
                connectActivity.getClass();
                if (num.intValue() == 0) {
                    connectActivity.G.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
