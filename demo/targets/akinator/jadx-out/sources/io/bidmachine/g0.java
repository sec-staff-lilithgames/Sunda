package io.bidmachine;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 implements OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f60361b;

    public g0(h0 h0Var) {
        this.f60361b = h0Var;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo.getScope() == 2) {
            this.f60361b.f60371b = appSetIdInfo.getId();
        }
    }
}
