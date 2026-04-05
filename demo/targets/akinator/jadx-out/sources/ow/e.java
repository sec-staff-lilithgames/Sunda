package ow;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import ow.d;
import xv.k;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f79913c;

    public e(d dVar, o0 o0Var) {
        this.f79912b = dVar;
        this.f79913c = o0Var;
    }

    @Override // xv.k
    public void onFailure(xv.j call, IOException e10) throws IOException {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(e10, "e");
        d.failWebSocket$default(this.f79912b, e10, null, false, 6, null);
    }

    @Override // xv.k
    public void onResponse(xv.j call, v0 response) throws Throwable {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(response, "response");
        cw.i iVarExchange = response.exchange();
        try {
            this.f79912b.checkUpgradeSuccess$okhttp(response, iVarExchange);
            e0.checkNotNull(iVarExchange);
            d.AbstractC0758d abstractC0758dNewWebSocketStreams = iVarExchange.newWebSocketStreams();
            f fVar = f.f79914g.parse(response.headers());
            this.f79912b.f79881e = fVar;
            if (!d.access$isValid(this.f79912b, fVar)) {
                d dVar = this.f79912b;
                synchronized (dVar) {
                    dVar.f79893q.clear();
                    dVar.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            this.f79912b.initReaderAndWriter(yv.i.f96668b + " WebSocket " + this.f79913c.url().redact(), abstractC0758dNewWebSocketStreams);
            this.f79912b.loopReader(response);
        } catch (IOException e10) {
            d.failWebSocket$default(this.f79912b, e10, response, false, 4, null);
            yv.h.closeQuietly(response);
            if (iVarExchange != null) {
                iVarExchange.webSocketUpgradeFailed();
            }
        }
    }
}
