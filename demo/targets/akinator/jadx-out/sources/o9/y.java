package o9;

import com.digidust.elokence.akinator.activities.CompteActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompteActivity f78682a;

    public y(CompteActivity compteActivity) {
        this.f78682a = compteActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        mt.b0.fromCallable(new x(0)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new bj.v0(this, 11));
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
