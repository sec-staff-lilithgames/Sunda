package hm;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements OnPaidEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final m f59015a;

    public k(m mVar) {
        this.f59015a = mVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this.f59015a.c(new gm.c(20, this, adValue));
    }
}
