package gm;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements OnPaidEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final n f57722a;

    public l(n nVar) {
        this.f57722a = nVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this.f57722a.c(new c(7, this, adValue));
    }
}
