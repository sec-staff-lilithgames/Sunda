package nj;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r implements yh.b {

    /* renamed from: a, reason: collision with root package name */
    public mt.n f77002a;

    @Override // yh.b
    public void onMessageTriggered(int i10, Bundle bundle) {
        if (i10 == 2) {
            this.f77002a.onNext(bundle.getString("events"));
        }
    }
}
