package io.ktor.http;

import com.unity3d.services.core.network.model.HttpRequest;
import e3.g;
import io.ktor.util.CharsetKt;
import io.ktor.util.TextKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import qv.v;
import uu.o1;
import uu.p0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLProtocol {
    public static final Companion Companion = new Companion(null);
    private static final URLProtocol HTTP;
    private static final URLProtocol HTTPS;
    private static final URLProtocol SOCKS;
    private static final URLProtocol WS;
    private static final URLProtocol WSS;
    private static final Map<String, URLProtocol> byName;
    private final int defaultPort;
    private final String name;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final URLProtocol createOrDefault(String name) {
            e0.checkNotNullParameter(name, "name");
            String lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(name);
            URLProtocol uRLProtocol = URLProtocol.Companion.getByName().get(lowerCasePreservingASCIIRules);
            return uRLProtocol == null ? new URLProtocol(lowerCasePreservingASCIIRules, 0) : uRLProtocol;
        }

        public final Map<String, URLProtocol> getByName() {
            return URLProtocol.byName;
        }

        public final URLProtocol getHTTP() {
            return URLProtocol.HTTP;
        }

        public final URLProtocol getHTTPS() {
            return URLProtocol.HTTPS;
        }

        public final URLProtocol getSOCKS() {
            return URLProtocol.SOCKS;
        }

        public final URLProtocol getWS() {
            return URLProtocol.WS;
        }

        public final URLProtocol getWSS() {
            return URLProtocol.WSS;
        }

        private Companion() {
        }
    }

    static {
        URLProtocol uRLProtocol = new URLProtocol("http", 80);
        HTTP = uRLProtocol;
        URLProtocol uRLProtocol2 = new URLProtocol(HttpRequest.DEFAULT_SCHEME, 443);
        HTTPS = uRLProtocol2;
        URLProtocol uRLProtocol3 = new URLProtocol("ws", 80);
        WS = uRLProtocol3;
        URLProtocol uRLProtocol4 = new URLProtocol("wss", 443);
        WSS = uRLProtocol4;
        URLProtocol uRLProtocol5 = new URLProtocol("socks", 1080);
        SOCKS = uRLProtocol5;
        List listListOf = p0.listOf((Object[]) new URLProtocol[]{uRLProtocol, uRLProtocol2, uRLProtocol3, uRLProtocol4, uRLProtocol5});
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            linkedHashMap.put(((URLProtocol) obj).name, obj);
        }
        byName = linkedHashMap;
    }

    public URLProtocol(String name, int i10) {
        e0.checkNotNullParameter(name, "name");
        this.name = name;
        this.defaultPort = i10;
        for (int i11 = 0; i11 < name.length(); i11++) {
            if (!CharsetKt.isLowerCase(name.charAt(i11))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public static /* synthetic */ URLProtocol copy$default(URLProtocol uRLProtocol, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uRLProtocol.name;
        }
        if ((i11 & 2) != 0) {
            i10 = uRLProtocol.defaultPort;
        }
        return uRLProtocol.copy(str, i10);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.defaultPort;
    }

    public final URLProtocol copy(String name, int i10) {
        e0.checkNotNullParameter(name, "name");
        return new URLProtocol(name, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLProtocol)) {
            return false;
        }
        URLProtocol uRLProtocol = (URLProtocol) obj;
        return e0.areEqual(this.name, uRLProtocol.name) && this.defaultPort == uRLProtocol.defaultPort;
    }

    public final int getDefaultPort() {
        return this.defaultPort;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.defaultPort) + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.name);
        sb2.append(", defaultPort=");
        return g.m(sb2, this.defaultPort, ')');
    }
}
