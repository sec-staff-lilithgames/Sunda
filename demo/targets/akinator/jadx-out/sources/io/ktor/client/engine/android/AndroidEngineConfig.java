package io.ktor.client.engine.android;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AndroidEngineConfig extends HttpClientEngineConfig {
    private int connectTimeout = DefaultOggSeeker.MATCH_BYTE_RANGE;
    private int socketTimeout = DefaultOggSeeker.MATCH_BYTE_RANGE;
    private l sslManager = AndroidEngineConfig$sslManager$1.INSTANCE;
    private l requestConfig = AndroidEngineConfig$requestConfig$1.INSTANCE;

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final l getRequestConfig() {
        return this.requestConfig;
    }

    public final int getSocketTimeout() {
        return this.socketTimeout;
    }

    public final l getSslManager() {
        return this.sslManager;
    }

    public final void setConnectTimeout(int i10) {
        this.connectTimeout = i10;
    }

    public final void setRequestConfig(l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.requestConfig = lVar;
    }

    public final void setSocketTimeout(int i10) {
        this.socketTimeout = i10;
    }

    public final void setSslManager(l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.sslManager = lVar;
    }
}
