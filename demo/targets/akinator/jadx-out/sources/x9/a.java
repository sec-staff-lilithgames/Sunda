package x9;

import android.content.Intent;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.PropositionPotionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final GameOverSliderActivity f91888a;

    public a(GameOverSliderActivity gameOverSliderActivity) {
        this.f91888a = gameOverSliderActivity;
    }

    public void displayUltimatePotion() {
        GameOverSliderActivity gameOverSliderActivity = this.f91888a;
        Intent intent = new Intent(gameOverSliderActivity, (Class<?>) PropositionPotionActivity.class);
        intent.putExtra("potion", "ultime");
        gameOverSliderActivity.startActivityForResult(intent, 1000);
    }
}
