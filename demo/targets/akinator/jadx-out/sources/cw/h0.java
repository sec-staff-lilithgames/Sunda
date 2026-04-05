package cw;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f51156a;

    public h0(f0 routePlanner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(routePlanner, "routePlanner");
        this.f51156a = routePlanner;
    }

    @Override // cw.j
    public u find() throws Throwable {
        e0 e0VarPlan;
        IOException iOException = null;
        while (!getRoutePlanner().isCanceled()) {
            try {
                e0VarPlan = getRoutePlanner().plan();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    tu.h.addSuppressed(iOException, e10);
                }
                if (!f0.hasNext$default(getRoutePlanner(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!e0VarPlan.isReady()) {
                d0 d0VarConnectTcp = e0VarPlan.connectTcp();
                if (d0VarConnectTcp.isSuccess()) {
                    d0VarConnectTcp = e0VarPlan.connectTlsEtc();
                }
                e0 e0VarComponent2 = d0VarConnectTcp.component2();
                Throwable thComponent3 = d0VarConnectTcp.component3();
                if (thComponent3 != null) {
                    throw thComponent3;
                }
                if (e0VarComponent2 != null) {
                    getRoutePlanner().getDeferredPlans().addFirst(e0VarComponent2);
                }
            }
            return e0VarPlan.handleSuccess();
        }
        throw new IOException("Canceled");
    }

    @Override // cw.j
    public f0 getRoutePlanner() {
        return this.f51156a;
    }
}
