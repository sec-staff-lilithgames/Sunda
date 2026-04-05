package io.bidmachine;

import android.content.Context;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.ContextualData;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.Session;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class u0 implements Executable, rr.b, o3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f62025c;

    public /* synthetic */ u0(Object obj, int i10) {
        this.f62024b = i10;
        this.f62025c = obj;
    }

    @Override // io.bidmachine.Executable
    public void execute(Object obj) {
        switch (this.f62024b) {
            case 0:
                a1 a1Var = (a1) this.f62025c;
                n nVar = (n) obj;
                nm.j.ifNotNull(a1Var.f59835a, new hv.t(18));
                if (nVar.f61916w) {
                    a1Var.f59835a = new AdCridThreadHandler(((k0) nVar.getAuctionResult()).getCreativeId());
                    break;
                }
                break;
            case 2:
                ((RequestTokenPayload.Builder) this.f62025c).setDeviceData((Device.Builder) obj);
                break;
            case 6:
                ((SessionManager) this.f62025c).saveCurrentSessionDuration((Context) obj);
                break;
            case 7:
                ((Session.Builder) this.f62025c).setContext((Session.Context.Builder) obj);
                break;
            default:
                ((Session.Context.Builder) this.f62025c).addData((ContextualData.Builder) obj);
                break;
        }
    }

    @Override // rr.b
    public Object get() {
        switch (this.f62024b) {
            case 1:
                return "Dispatching event to server - " + ((TrackEventType) this.f62025c);
            case 2:
            default:
                NetworkAdapter networkAdapter = (NetworkAdapter) this.f62025c;
                return a.b.m("Initialization completed: ", networkAdapter.obtainNetworkSdkVersion(), ", ", networkAdapter.getAdapterVersion());
            case 3:
                return a.b.k("Load network from json config completed successfully: ", ((NetworkConfig) this.f62025c).getNetworkKey());
        }
    }

    @Override // io.bidmachine.o3
    public void onExecuted() {
        ((CountDownLatch) this.f62025c).countDown();
    }
}
