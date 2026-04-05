package o9;

import android.content.Intent;
import android.view.View;
import com.digidust.elokence.akinator.activities.MenuActivity;
import com.digidust.elokence.akinator.activities.SelectLanguageActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class w6 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78650c;

    public /* synthetic */ w6(SelectLanguageActivity selectLanguageActivity, int i10) {
        this.f78649b = i10;
        this.f78650c = selectLanguageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78649b;
        SelectLanguageActivity selectLanguageActivity = this.f78650c;
        switch (i10) {
            case 0:
                int i11 = SelectLanguageActivity.I;
                selectLanguageActivity.goToMenu();
                break;
            default:
                int i12 = SelectLanguageActivity.I;
                selectLanguageActivity.startActivity(new Intent(selectLanguageActivity, (Class<?>) MenuActivity.class));
                break;
        }
    }
}
