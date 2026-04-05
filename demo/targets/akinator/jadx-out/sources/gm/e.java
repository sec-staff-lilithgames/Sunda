package gm;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements OnPaidEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final f f57712a;

    public e(f fVar) {
        this.f57712a = fVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this.f57712a.c(new c(1, this, adValue));
    }
}
