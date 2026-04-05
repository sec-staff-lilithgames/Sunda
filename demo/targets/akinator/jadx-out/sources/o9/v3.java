package o9;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.ContinueProcessActivity;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OneCharacterProposalActivity f78625c;

    public /* synthetic */ v3(OneCharacterProposalActivity oneCharacterProposalActivity, int i10) {
        this.f78624b = i10;
        this.f78625c = oneCharacterProposalActivity;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f78624b;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        OneCharacterProposalActivity oneCharacterProposalActivity = this.f78625c;
        switch (i10) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                oneCharacterProposalActivity.I.setVisibility(8);
                ImageView imageView = oneCharacterProposalActivity.C;
                if (imageView != null) {
                    if (bitmap == null) {
                        imageView.setBackgroundColor(-16777216);
                        break;
                    } else {
                        try {
                            imageView.getWidth();
                            float height = oneCharacterProposalActivity.C.getHeight();
                            float width = bitmap.getWidth();
                            float height2 = bitmap.getHeight();
                            float f10 = height / height2;
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * f10), (int) (height2 * f10), true);
                            oneCharacterProposalActivity.C.setImageBitmap(bitmapCreateScaledBitmap);
                            oneCharacterProposalActivity.C.setVisibility(0);
                            ca.u.sharedInstance().setImagePerso(bitmapCreateScaledBitmap);
                            ObjectAnimator.ofFloat(oneCharacterProposalActivity.C, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(1000L).start();
                            break;
                        } catch (IllegalArgumentException | OutOfMemoryError unused) {
                            oneCharacterProposalActivity.C.setBackgroundColor(-16777216);
                            return;
                        }
                    }
                }
                break;
            case 1:
                oneCharacterProposalActivity.I.setVisibility(8);
                oneCharacterProposalActivity.C.setBackgroundColor(-16777216);
                break;
            case 2:
                Integer num = (Integer) obj;
                int i14 = OneCharacterProposalActivity.S;
                try {
                    da.k kVar = oneCharacterProposalActivity.L;
                    if (kVar != null && kVar.isShowing()) {
                        oneCharacterProposalActivity.L.dismiss();
                    }
                } catch (Exception unused2) {
                    oneCharacterProposalActivity.L = null;
                }
                if (num.intValue() != 0) {
                    if (num.intValue() != -1 && num.intValue() != 610 && num.intValue() != 600) {
                        Toast.makeText(oneCharacterProposalActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        oneCharacterProposalActivity.goToHome(false);
                        break;
                    } else {
                        da.q.show(oneCharacterProposalActivity, 1, new z3(oneCharacterProposalActivity, i13));
                        break;
                    }
                } else {
                    Intent intent = new Intent(oneCharacterProposalActivity, (Class<?>) SoundlikeActivity.class);
                    intent.putExtra("several", oneCharacterProposalActivity.N);
                    oneCharacterProposalActivity.startActivity(intent);
                    oneCharacterProposalActivity.finish();
                    break;
                }
                break;
            case 3:
                lb.y0 y0Var = (lb.y0) obj;
                int i15 = OneCharacterProposalActivity.S;
                ca.o.sharedInstance().setCurrentSession(y0Var.f73052b);
                try {
                    da.k kVar2 = oneCharacterProposalActivity.L;
                    if (kVar2 != null && kVar2.isShowing()) {
                        oneCharacterProposalActivity.L.dismiss();
                    }
                } catch (Exception unused3) {
                    oneCharacterProposalActivity.L = null;
                }
                int i16 = y0Var.f73051a;
                if (i16 != 0 && i16 != 800) {
                    if (i16 != 500) {
                        if (i16 != -1 && i16 != 610 && i16 != 600) {
                            Toast.makeText(oneCharacterProposalActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            oneCharacterProposalActivity.goToHome(false);
                            break;
                        } else {
                            da.q.show(oneCharacterProposalActivity, 1, new z3(oneCharacterProposalActivity, i11));
                            break;
                        }
                    } else {
                        Toast.makeText(oneCharacterProposalActivity, lb.b1.sharedInstance().getTraductionFromToken("TROP_NOMBREUX_A_JOUER_RELANCE"), 1).show();
                        break;
                    }
                } else if (!ca.m.sharedInstance().isPaid() && ((!ca.m.sharedInstance().isFreemium() || !ca.o.sharedInstance().isUnlocked()) && !oneCharacterProposalActivity.F)) {
                    oneCharacterProposalActivity.F = true;
                    break;
                } else {
                    oneCharacterProposalActivity.startActivity(new Intent(oneCharacterProposalActivity, (Class<?>) QuestionActivity.class));
                    oneCharacterProposalActivity.finish();
                    break;
                }
                break;
            case 4:
                Integer num2 = (Integer) obj;
                int i17 = OneCharacterProposalActivity.S;
                try {
                    da.k kVar3 = oneCharacterProposalActivity.L;
                    if (kVar3 != null && kVar3.isShowing()) {
                        oneCharacterProposalActivity.L.dismiss();
                    }
                } catch (Exception unused4) {
                    oneCharacterProposalActivity.L = null;
                }
                if (num2.intValue() != 0) {
                    if (num2.intValue() != -1 && num2.intValue() != 610 && num2.intValue() != 600) {
                        Toast.makeText(oneCharacterProposalActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        oneCharacterProposalActivity.goToHome(false);
                        break;
                    } else {
                        da.q.show(oneCharacterProposalActivity, 1, new z3(oneCharacterProposalActivity, 3));
                        break;
                    }
                } else {
                    ca.o.sharedInstance().setWinFirstTry(false);
                    jb.h.sharedInstance().createOrUpdateMetricValeur("last_game", "E");
                    ca.o.sharedInstance().setAkinatorStatus(1);
                    na.b.playBip();
                    if (ca.o.sharedInstance().getCurrentSession().getCurrentSessionProgression().getStep() >= 79) {
                        oneCharacterProposalActivity.x();
                        break;
                    } else {
                        oneCharacterProposalActivity.startActivity(new Intent(oneCharacterProposalActivity, (Class<?>) ContinueProcessActivity.class));
                        oneCharacterProposalActivity.finish();
                        break;
                    }
                }
                break;
            case 5:
                int i18 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.getClass();
                if (((Integer) obj).intValue() == -60) {
                    ca.m.sharedInstance().setUserConnectionStatus(false);
                    ca.m.sharedInstance().setHasBeenForcedToDisconnect(true);
                    Intent intent2 = new Intent(oneCharacterProposalActivity, (Class<?>) ConnectActivity.class);
                    intent2.putExtra("comingFromGame", true);
                    oneCharacterProposalActivity.startActivity(intent2);
                    break;
                }
                break;
            default:
                Integer num3 = (Integer) obj;
                int i19 = OneCharacterProposalActivity.S;
                try {
                    da.k kVar4 = oneCharacterProposalActivity.L;
                    if (kVar4 != null && kVar4.isShowing()) {
                        oneCharacterProposalActivity.L.dismiss();
                    }
                } catch (Exception unused5) {
                    oneCharacterProposalActivity.L = null;
                }
                if (num3.intValue() != 0) {
                    if (num3.intValue() != -1 && num3.intValue() != 610 && num3.intValue() != 600) {
                        oneCharacterProposalActivity.w();
                        break;
                    } else {
                        da.q.show(oneCharacterProposalActivity, 1, new z3(oneCharacterProposalActivity, i12));
                        break;
                    }
                } else {
                    ca.u.sharedInstance().setPersoPropose(oneCharacterProposalActivity.K);
                    oneCharacterProposalActivity.y();
                    new da.r(oneCharacterProposalActivity).setPopupApproved();
                    break;
                }
                break;
        }
    }
}
