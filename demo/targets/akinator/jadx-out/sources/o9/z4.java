package o9;

import com.digidust.elokence.akinator.activities.PostProposeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z4 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostProposeActivity f78713a;

    public z4(PostProposeActivity postProposeActivity) {
        this.f78713a = postProposeActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        ca.u.sharedInstance().showPubTemp(false);
        PostProposeActivity postProposeActivity = this.f78713a;
        postProposeActivity.S = true;
        postProposeActivity.D();
    }

    @Override // da.g
    public void onClosedRefuse() {
        PostProposeActivity postProposeActivity = this.f78713a;
        postProposeActivity.S = false;
        postProposeActivity.D();
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }
}
