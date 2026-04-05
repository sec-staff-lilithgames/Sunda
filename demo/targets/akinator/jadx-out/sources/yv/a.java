package yv;

import cw.u;
import java.nio.charset.Charset;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.e0;
import tu.v;
import xv.f0;
import xv.g0;
import xv.j0;
import xv.l0;
import xv.o;
import xv.o0;
import xv.r;
import xv.s;
import xv.t;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {
    public static final f0.a addHeaderLenient(f0.a builder, String line) {
        e0.checkNotNullParameter(builder, "builder");
        e0.checkNotNullParameter(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(s connectionSpec, SSLSocket sslSocket, boolean z10) {
        e0.checkNotNullParameter(connectionSpec, "connectionSpec");
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z10);
    }

    public static final r buildConnectionPool(cw.g connectionListener, bw.g taskRunner) {
        e0.checkNotNullParameter(connectionListener, "connectionListener");
        e0.checkNotNullParameter(taskRunner, "taskRunner");
        return new r(0, 0L, null, taskRunner, connectionListener, 0, 0, 0, 0, 0, false, false, null, 8167, null);
    }

    public static final v0 cacheGet(xv.e cache, o0 request) {
        e0.checkNotNullParameter(cache, "cache");
        e0.checkNotNullParameter(request, "request");
        return cache.get$okhttp(request);
    }

    public static final Charset charsetOrUtf8(j0 j0Var) {
        Charset charsetCharset$default;
        return (j0Var == null || (charsetCharset$default = j0.charset$default(j0Var, null, 1, null)) == null) ? sv.g.f86134b : charsetCharset$default;
    }

    public static final v chooseCharset(j0 j0Var) {
        Charset charset = sv.g.f86134b;
        if (j0Var != null) {
            Charset charsetCharset$default = j0.charset$default(j0Var, null, 1, null);
            if (charsetCharset$default == null) {
                j0Var = j0.f93670e.parse(j0Var + "; charset=utf-8");
            } else {
                charset = charsetCharset$default;
            }
        }
        return tu.e0.to(charset, j0Var);
    }

    public static final String cookieToString(t cookie, boolean z10) {
        e0.checkNotNullParameter(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    public static final String[] effectiveCipherSuites(s sVar, String[] socketEnabledCipherSuites) {
        e0.checkNotNullParameter(sVar, "<this>");
        e0.checkNotNullParameter(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return sVar.getCipherSuitesAsString$okhttp() != null ? h.intersect(sVar.getCipherSuitesAsString$okhttp(), socketEnabledCipherSuites, o.f93769b.getORDER_BY_NAME$okhttp()) : socketEnabledCipherSuites;
    }

    public static final u getConnection(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        cw.i iVarExchange = v0Var.exchange();
        e0.checkNotNull(iVarExchange);
        return iVarExchange.getConnection$okhttp();
    }

    public static final t parseCookie(long j10, g0 url, String setCookie) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(setCookie, "setCookie");
        return t.f93833k.parse$okhttp(j10, url, setCookie);
    }

    public static final l0.a taskRunnerInternal(l0.a aVar, bw.g taskRunner) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(taskRunner, "taskRunner");
        return aVar.taskRunner$okhttp(taskRunner);
    }

    public static final f0.a addHeaderLenient(f0.a builder, String name, String value) {
        e0.checkNotNullParameter(builder, "builder");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
