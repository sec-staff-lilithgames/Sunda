package o9;

import com.digidust.elokence.akinator.activities.ConnectActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e0 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectActivity f78109a;

    public e0(ConnectActivity connectActivity) {
        this.f78109a = connectActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        int i10 = ConnectActivity.U;
        ConnectActivity connectActivity = this.f78109a;
        mt.b0.fromCallable(new b0(connectActivity, 1)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new c0(connectActivity, 2));
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
