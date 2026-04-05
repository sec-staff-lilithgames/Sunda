package o9;

import android.content.Intent;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GameOverSliderActivity f78086c;

    public /* synthetic */ d1(GameOverSliderActivity gameOverSliderActivity, int i10) {
        this.f78085b = i10;
        this.f78086c = gameOverSliderActivity;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f78085b;
        GameOverSliderActivity gameOverSliderActivity = this.f78086c;
        switch (i10) {
            case 0:
                lb.y0 y0Var = (lb.y0) obj;
                int i11 = GameOverSliderActivity.L;
                Timber.tag("GOTONEWGAME").d("startSession result: %s", Integer.valueOf(y0Var.f73051a));
                ca.o.sharedInstance().setCurrentSession(y0Var.f73052b);
                try {
                    da.k kVar = gameOverSliderActivity.E;
                    if (kVar != null && kVar.isShowing()) {
                        gameOverSliderActivity.E.dismiss();
                    }
                } catch (IllegalArgumentException unused) {
                    gameOverSliderActivity.E = null;
                }
                int i12 = y0Var.f73051a;
                if (i12 != 0 && i12 != 800) {
                    if (i12 != 500) {
                        if (i12 != -1 && i12 != 610 && i12 != 600) {
                            Toast.makeText(gameOverSliderActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                            gameOverSliderActivity.goToHome(false);
                            break;
                        } else {
                            da.q.show(gameOverSliderActivity, 1, new ha.a(gameOverSliderActivity, 29));
                            break;
                        }
                    } else {
                        Toast.makeText(gameOverSliderActivity, lb.b1.sharedInstance().getTraductionFromToken("TROP_NOMBREUX_A_JOUER_RELANCE"), 1).show();
                        break;
                    }
                } else {
                    Intent intent = new Intent(gameOverSliderActivity, (Class<?>) QuestionActivity.class);
                    intent.setFlags(67108864);
                    gameOverSliderActivity.startActivity(intent);
                    gameOverSliderActivity.finish();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                int i13 = GameOverSliderActivity.L;
                gameOverSliderActivity.getClass();
                if (num.intValue() != 0 && num.intValue() == 400) {
                    Toast.makeText(gameOverSliderActivity, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                    break;
                }
                break;
        }
    }
}
