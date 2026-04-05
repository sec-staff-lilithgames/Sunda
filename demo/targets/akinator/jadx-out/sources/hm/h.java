package hm;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements OnPaidEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final i f59011a;

    public h(i iVar) {
        this.f59011a = iVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this.f59011a.c(new gm.c(17, this, adValue));
    }
}
