package io.ktor.http;

import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface RequestConnectionPoint {
    String getHost();

    String getLocalAddress();

    String getLocalHost();

    int getLocalPort();

    HttpMethod getMethod();

    int getPort();

    String getRemoteAddress();

    String getRemoteHost();

    int getRemotePort();

    String getScheme();

    String getServerHost();

    int getServerPort();

    String getUri();

    String getVersion();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        @f
        public static /* synthetic */ void getHost$annotations() {
        }

        @f
        public static /* synthetic */ void getPort$annotations() {
        }
    }
}
