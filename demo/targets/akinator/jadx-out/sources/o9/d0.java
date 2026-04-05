package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.ConnectActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d0 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectActivity f78084a;

    public d0(ConnectActivity connectActivity) {
        this.f78084a = connectActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
        boolean zIsEmpty = str.isEmpty();
        ConnectActivity connectActivity = this.f78084a;
        if (zIsEmpty) {
            Toast.makeText(connectActivity, lb.b1.sharedInstance().getTraductionFromToken("COMPTE_CREATION_EMAIL_VIDE"), 0).show();
        } else {
            connectActivity.disposeAtDestruction(mt.b0.fromCallable(new com.vungle.ads.internal.session.a(str, 7)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(this, 13)));
        }
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
