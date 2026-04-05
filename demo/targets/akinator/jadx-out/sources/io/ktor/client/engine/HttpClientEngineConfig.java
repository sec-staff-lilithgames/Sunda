package io.ktor.client.engine;

import io.ktor.util.KtorDsl;
import java.net.Proxy;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@KtorDsl
/* loaded from: classes6.dex */
public class HttpClientEngineConfig {
    private boolean pipelining;
    private Proxy proxy;
    private int threadsCount = 4;

    public final boolean getPipelining() {
        return this.pipelining;
    }

    public final Proxy getProxy() {
        return this.proxy;
    }

    public final int getThreadsCount() {
        return this.threadsCount;
    }

    public final void setPipelining(boolean z10) {
        this.pipelining = z10;
    }

    public final void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public final void setThreadsCount(int i10) {
        this.threadsCount = i10;
    }

    @f
    public static /* synthetic */ void getThreadsCount$annotations() {
    }
}
