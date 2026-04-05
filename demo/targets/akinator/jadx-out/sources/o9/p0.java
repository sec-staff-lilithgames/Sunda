package o9;

import android.content.Intent;
import android.view.View;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f78427c;

    public /* synthetic */ p0(v0 v0Var, int i10) {
        this.f78426b = i10;
        this.f78427c = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f78426b) {
            case 0:
                v0 v0Var = this.f78427c;
                v0Var.getClass();
                jb.h.sharedInstance().incMetricCompteur("dc_rules");
                new da.f(v0Var.getActivity()).setTypeRegleDdj();
                break;
            case 1:
                this.f78427c.removeCreatedView();
                break;
            default:
                v0 v0Var2 = this.f78427c;
                v0Var2.f78619m.disableAdOneTime();
                jb.h.sharedInstance().incMetricCompteur("btn_last_enigme_played");
                Intent intent = new Intent(v0Var2.f78619m, (Class<?>) DefiDuJourActivity.class);
                intent.putExtra("keyMode", 1);
                v0Var2.startActivity(intent);
                break;
        }
    }
}
