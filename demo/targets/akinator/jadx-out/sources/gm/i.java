package gm;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements OnPaidEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final j f57718a;

    public i(j jVar) {
        this.f57718a = jVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this.f57718a.c(new c(4, this, adValue));
    }
}
