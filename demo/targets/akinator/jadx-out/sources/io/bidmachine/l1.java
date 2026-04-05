package io.bidmachine;

import android.content.Context;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.InitResponse;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l1 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f60590a;

    public l1(n1 n1Var) {
        this.f60590a = n1Var;
    }

    @Override // io.bidmachine.w2
    public void onLoadFromRemoteFailed(u2 u2Var) {
        List<AdNetwork> adNetworksList;
        Context context = this.f60590a.f61933p;
        if (context == null || (adNetworksList = u2Var.getResponse().getAdNetworksList()) == null) {
            return;
        }
        Iterator<AdNetwork> it = adNetworksList.iterator();
        while (it.hasNext()) {
            NetworkRegistry.registerInitNetwork(context, it.next());
        }
    }

    @Override // io.bidmachine.w2
    public void onLoadFromRemoteSuccess(u2 u2Var) {
        InitResponse response = u2Var.getResponse();
        String sessionId = SessionManager.get().getSessionId();
        String sessionId2 = u2Var.getSessionId();
        n1 n1Var = this.f60590a;
        n1Var.b(sessionId, response, sessionId2);
        if (n1Var.f61933p == null) {
            return;
        }
        ExtraParamsManager.get().setExtras(n1Var.f61933p, response.getExtras());
        Context context = n1Var.f61933p;
        List<AdNetwork> adNetworksList = response.getAdNetworksList();
        if (adNetworksList == null) {
            return;
        }
        Iterator<AdNetwork> it = adNetworksList.iterator();
        while (it.hasNext()) {
            NetworkRegistry.registerInitNetwork(context, it.next());
        }
    }

    @Override // io.bidmachine.w2
    public void onLoadFromStoreSuccess(u2 u2Var) {
        this.f60590a.b(SessionManager.get().getSessionId(), u2Var.getResponse(), u2Var.getSessionId());
    }
}
