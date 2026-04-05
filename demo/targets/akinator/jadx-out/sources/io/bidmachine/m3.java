package io.bidmachine;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m3 implements InternalNetworkInitializationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f60611a;

    public m3(n3 n3Var) {
        this.f60611a = new WeakReference(n3Var);
    }

    @Override // io.bidmachine.InternalNetworkInitializationCallback
    public void onFail(NetworkAdapter networkAdapter, String str) {
        n3 n3Var = (n3) this.f60611a.get();
        if (n3Var != null) {
            n3Var.a(str);
        }
    }

    @Override // io.bidmachine.InternalNetworkInitializationCallback
    public void onSuccess(NetworkAdapter networkAdapter) {
        n3 n3Var = (n3) this.f60611a.get();
        if (n3Var != null) {
            BidMachineTrackingObject bidMachineTrackingObject = n3Var.f61960h;
            String str = n3Var.f61959g;
            nm.a.d(str, new u0(networkAdapter, 5));
            if (networkAdapter instanceof HeaderBiddingAdapter) {
                bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, (AdsType) null, new gr.a().setNetworkName(str), (pr.a) null);
            } else {
                bidMachineTrackingObject.clearEvent(TrackEventType.HeaderBiddingNetworkInitialize);
            }
            n3.f61954k.remove(n3Var);
        }
    }
}
