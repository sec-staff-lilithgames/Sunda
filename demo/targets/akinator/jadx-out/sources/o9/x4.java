package o9;

import android.content.Intent;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.PreInscriptionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x4 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostProposeActivity f78663a;

    public x4(PostProposeActivity postProposeActivity) {
        this.f78663a = postProposeActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        boolean zIsUserConnected = ca.m.sharedInstance().isUserConnected();
        PostProposeActivity postProposeActivity = this.f78663a;
        if (zIsUserConnected) {
            PostProposeActivity.u(postProposeActivity);
            postProposeActivity.D();
            return;
        }
        Intent intent = new Intent(postProposeActivity, (Class<?>) PreInscriptionActivity.class);
        intent.putExtra("coming_from_preinscription", false);
        ca.m.sharedInstance().setMustNotDisplayButtonInscriptionWithoutAcc(true);
        postProposeActivity.startActivity(intent);
        postProposeActivity.finish();
    }

    @Override // da.g
    public void onClosedRefuse() {
        int i10 = PostProposeActivity.Z;
        this.f78663a.D();
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }
}
