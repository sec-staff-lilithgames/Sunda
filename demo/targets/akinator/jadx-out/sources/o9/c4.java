package o9;

import android.content.Intent;
import android.view.View;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.WebviewGeneralActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OneCharacterProposalActivity f78067b;

    public c4(OneCharacterProposalActivity oneCharacterProposalActivity) {
        this.f78067b = oneCharacterProposalActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OneCharacterProposalActivity oneCharacterProposalActivity = this.f78067b;
        oneCharacterProposalActivity.disableAdOneTime();
        String str = "https://www.akinator.com/ippolicy.php?name=" + oneCharacterProposalActivity.E.getName() + "&id=" + oneCharacterProposalActivity.E.getIdBase();
        Intent intent = new Intent(oneCharacterProposalActivity, (Class<?>) WebviewGeneralActivity.class);
        intent.putExtra("url", str);
        oneCharacterProposalActivity.startActivity(intent);
    }
}
