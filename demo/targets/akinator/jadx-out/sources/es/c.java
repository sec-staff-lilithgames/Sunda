package es;

import mh.g1;
import wr.b3;
import wr.e3;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c extends b3 {
    public abstract b3 a();

    @Override // wr.b3
    public boolean canHandleEmptyAddressListFromNameResolution() {
        return a().canHandleEmptyAddressListFromNameResolution();
    }

    @Override // wr.b3
    public void handleNameResolutionError(m6 m6Var) {
        a().handleNameResolutionError(m6Var);
    }

    @Override // wr.b3
    public void handleResolvedAddresses(e3 e3Var) {
        a().handleResolvedAddresses(e3Var);
    }

    @Override // wr.b3
    @Deprecated
    public void handleSubchannelState(b3.e eVar, wr.g0 g0Var) {
        a().handleSubchannelState(eVar, g0Var);
    }

    @Override // wr.b3
    public void requestConnection() {
        a().requestConnection();
    }

    @Override // wr.b3
    public void shutdown() {
        a().shutdown();
    }

    public String toString() {
        return g1.toStringHelper(this).add("delegate", a()).toString();
    }
}
