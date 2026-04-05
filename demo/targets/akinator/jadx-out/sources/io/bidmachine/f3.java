package io.bidmachine;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f3 implements NetworkInitializationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetworkAdapter f60352a;

    public f3(NetworkAdapter networkAdapter) {
        this.f60352a = networkAdapter;
    }

    @Override // io.bidmachine.NetworkInitializationCallback
    public void onFail(String str) {
        NetworkAdapter networkAdapter = this.f60352a;
        networkAdapter.isInitialized.set(false);
        networkAdapter.isInitializing.set(false);
        Iterator it = networkAdapter.initializeCallbackSet.iterator();
        while (it.hasNext()) {
            ((InternalNetworkInitializationCallback) it.next()).onFail(networkAdapter, str);
        }
        networkAdapter.initializeCallbackSet.clear();
    }

    @Override // io.bidmachine.NetworkInitializationCallback
    public void onSuccess() {
        NetworkAdapter networkAdapter = this.f60352a;
        networkAdapter.isInitialized.set(true);
        networkAdapter.isInitializing.set(false);
        Iterator it = networkAdapter.initializeCallbackSet.iterator();
        while (it.hasNext()) {
            ((InternalNetworkInitializationCallback) it.next()).onSuccess(networkAdapter);
        }
        networkAdapter.initializeCallbackSet.clear();
    }
}
