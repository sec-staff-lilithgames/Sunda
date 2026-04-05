package o9;

import android.view.WindowManager;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.AkActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AkActivity f78014c;

    public /* synthetic */ a(AkActivity akActivity, int i10) {
        this.f78013b = i10;
        this.f78014c = akActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f78013b;
        AkActivity akActivity = this.f78014c;
        switch (i10) {
            case 0:
                boolean z10 = AkActivity.f21679y;
                try {
                    da.k kVar = akActivity.f21701x;
                    if (kVar != null) {
                        kotlin.jvm.internal.e0.checkNotNull(kVar);
                        if (kVar.isShowing()) {
                            da.k kVar2 = akActivity.f21701x;
                            kotlin.jvm.internal.e0.checkNotNull(kVar2);
                            kVar2.dismiss();
                            break;
                        }
                    }
                } catch (WindowManager.BadTokenException unused) {
                    akActivity.f21701x = null;
                    return;
                } catch (IllegalArgumentException unused2) {
                    akActivity.f21701x = null;
                    return;
                }
                break;
            case 1:
                boolean z11 = AkActivity.f21679y;
                try {
                    akActivity.f21701x = da.k.show(akActivity);
                    break;
                } catch (Exception unused3) {
                    return;
                }
            case 2:
                boolean z12 = AkActivity.f21679y;
                Toast.makeText(akActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("ERREUR_CONNEXION_GOOGLE_PLAY"), 1).show();
                break;
            case 3:
                boolean z13 = AkActivity.f21679y;
                Toast.makeText(akActivity.getApplicationContext(), lb.b1.f72741d.sharedInstance().getTraductionFromToken("RESTAURATION_ACHATS_EFFECTUEE"), 1).show();
                break;
            default:
                boolean z14 = AkActivity.f21679y;
                Toast.makeText(akActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_RESTAURATION_ACHATS"), 1).show();
                break;
        }
    }
}
