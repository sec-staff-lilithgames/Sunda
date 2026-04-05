package v9;

import android.content.Intent;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;
import lb.b1;
import st.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OptionRareCharacterActivity f89196c;

    public /* synthetic */ b(OptionRareCharacterActivity optionRareCharacterActivity, int i10) {
        this.f89195b = i10;
        this.f89196c = optionRareCharacterActivity;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f89195b;
        OptionRareCharacterActivity optionRareCharacterActivity = this.f89196c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                int i11 = OptionRareCharacterActivity.N;
                optionRareCharacterActivity.hideLoader();
                if (num.intValue() != 0 && num.intValue() != 800) {
                    if (num.intValue() != 500) {
                        Toast.makeText(optionRareCharacterActivity, b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        optionRareCharacterActivity.goToHome(false);
                        break;
                    } else {
                        Toast.makeText(optionRareCharacterActivity, b1.sharedInstance().getTraductionFromToken("TROP_NOMBREUX_A_JOUER_RELANCE"), 1).show();
                        break;
                    }
                } else {
                    optionRareCharacterActivity.startActivity(new Intent(optionRareCharacterActivity, (Class<?>) QuestionActivity.class));
                    optionRareCharacterActivity.finish();
                    break;
                }
            case 1:
                int i12 = OptionRareCharacterActivity.N;
                optionRareCharacterActivity.hideLoader();
                Toast.makeText(optionRareCharacterActivity, ((Throwable) obj).getMessage(), 0).show();
                optionRareCharacterActivity.goToHome(false);
                break;
            default:
                Integer num2 = (Integer) obj;
                int i13 = OptionRareCharacterActivity.N;
                optionRareCharacterActivity.getClass();
                if (num2.intValue() != 0 && num2.intValue() == 400) {
                    Toast.makeText(optionRareCharacterActivity, "Erreur technique, merci de réessayer plus tard.", 0).show();
                    break;
                }
                break;
        }
    }
}
