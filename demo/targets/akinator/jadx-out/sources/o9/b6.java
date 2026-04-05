package o9;

import android.content.Intent;
import android.view.View;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.activities.WebviewGeneralActivity;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b6 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78050b;

    public b6(QuestionActivity questionActivity) {
        this.f78050b = questionActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        QuestionActivity questionActivity = this.f78050b;
        questionActivity.disableAdOneTime();
        e.g gVar = questionActivity.R;
        e.g gVar2 = null;
        if (gVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("proposedCharacter");
            gVar = null;
        }
        String name = gVar.getName();
        e.g gVar3 = questionActivity.R;
        if (gVar3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("proposedCharacter");
        } else {
            gVar2 = gVar3;
        }
        String strM = a.b.m("https://www.akinator.com/ippolicy.php?name=", name, "&id=", gVar2.getIdBase());
        Intent intent = new Intent(questionActivity, (Class<?>) WebviewGeneralActivity.class);
        intent.putExtra("url", strM);
        questionActivity.startActivity(intent);
    }
}
