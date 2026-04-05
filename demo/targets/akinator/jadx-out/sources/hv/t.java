package hv;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.g1;
import io.bidmachine.AdCridThreadHandler;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdRequest;
import io.bidmachine.Executable;
import io.bidmachine.SessionManager;
import io.bidmachine.media3.exoplayer.q0;
import io.odeeo.internal.b.g;
import io.odeeo.internal.b.h0;
import io.odeeo.internal.b.i0;
import io.odeeo.internal.b.k0;
import io.odeeo.internal.b.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class t implements ee.u, rr.b, Executable, io.bidmachine.media3.common.util.w, g.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59250b;

    public /* synthetic */ t(int i10) {
        this.f59250b = i10;
    }

    @Override // ee.u
    public ee.p[] createExtractors() {
        return new ee.p[]{new ie.b()};
    }

    @Override // io.bidmachine.Executable
    public void execute(Object obj) {
        switch (this.f59250b) {
            case 9:
                ((AdProcessCallback) obj).processDestroy();
                break;
            case 10:
                ((AdProcessCallback) obj).processLoadSuccess();
                break;
            case 11:
                ((AdProcessCallback) obj).processExpired();
                break;
            case 12:
                ((AdProcessCallback) obj).processClicked();
                break;
            case 13:
                ((AdProcessCallback) obj).processVisibilityTrackerImpression();
                break;
            case 14:
                ((AdProcessCallback) obj).processShown();
                break;
            case 15:
                ((AdProcessCallback) obj).processClosed();
                break;
            case 16:
                ((AdProcessCallback) obj).processFillAd();
                break;
            case 17:
                ((AdProcessCallback) obj).processFinished();
                break;
            case 18:
                ((AdCridThreadHandler) obj).destroy();
                break;
            default:
                SessionManager.lambda$onNewSessionStarted$0((Context) obj);
                break;
        }
    }

    @Override // io.odeeo.internal.b.g.a
    /* renamed from: fromBundle */
    public io.odeeo.internal.b.g mo3834fromBundle(Bundle bundle) {
        switch (this.f59250b) {
            case 24:
                return io.odeeo.internal.b.a0.a(bundle);
            case 25:
                return h0.b(bundle);
            case 26:
                return new i0(bundle);
            case 27:
                return k0.a(bundle);
            case 28:
                return l0.b.a(bundle);
            default:
                return l0.f.a(bundle);
        }
    }

    @Override // rr.b
    public Object get() {
        switch (this.f59250b) {
            case 5:
                return AdRequest.lambda$notifyMediationWin$1();
            case 6:
                return AdRequest.lambda$processExpired$4();
            case 7:
                return AdRequest.lambda$destroy$3();
            default:
                return "Request start";
        }
    }

    @Override // io.bidmachine.media3.common.util.w
    public void invoke(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.f59250b) {
            case 22:
                int i10 = io.bidmachine.media3.exoplayer.l0.A0;
                g1Var.onPlayerError(io.bidmachine.media3.exoplayer.a0.createForUnexpected(new q0(1), IronSourceError.AUCTION_ERROR_DECRYPTION));
                break;
            default:
                g1Var.onRenderedFirstFrame();
                break;
        }
    }
}
