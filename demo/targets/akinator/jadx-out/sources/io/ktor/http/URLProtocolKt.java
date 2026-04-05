package io.ktor.http;

import com.unity3d.services.core.network.model.HttpRequest;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLProtocolKt {
    public static final boolean isSecure(URLProtocol uRLProtocol) {
        e0.checkNotNullParameter(uRLProtocol, "<this>");
        return e0.areEqual(uRLProtocol.getName(), HttpRequest.DEFAULT_SCHEME) || e0.areEqual(uRLProtocol.getName(), "wss");
    }

    public static final boolean isWebsocket(URLProtocol uRLProtocol) {
        e0.checkNotNullParameter(uRLProtocol, "<this>");
        return e0.areEqual(uRLProtocol.getName(), "ws") || e0.areEqual(uRLProtocol.getName(), "wss");
    }
}
