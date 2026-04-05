package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.MenuActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuActivity f78113c;

    public /* synthetic */ e3(MenuActivity menuActivity, int i10) {
        this.f78112b = i10;
        this.f78113c = menuActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f78112b;
        MenuActivity menuActivity = this.f78113c;
        switch (i10) {
            case 0:
                int i11 = MenuActivity.D;
                Toast.makeText(menuActivity.getApplicationContext(), lb.b1.f72741d.sharedInstance().getTraductionFromToken("RESTAURATION_ACHATS_EFFECTUEE"), 1).show();
                break;
            default:
                int i12 = MenuActivity.D;
                Toast.makeText(menuActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("RESTAURATION_ACHATS_EN_COURS"), 1).show();
                break;
        }
    }
}
