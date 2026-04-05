package dw;

import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.e0;
import pw.x;
import sv.k0;
import uu.p0;
import xv.g0;
import xv.h0;
import xv.i0;
import xv.j0;
import xv.o0;
import xv.t;
import xv.u0;
import xv.v;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f52905a;

    public a(v cookieJar) {
        e0.checkNotNullParameter(cookieJar, "cookieJar");
        this.f52905a = cookieJar;
    }

    @Override // xv.i0
    public v0 intercept(h0 chain) throws IOException {
        boolean z10;
        w0 w0VarBody;
        e0.checkNotNullParameter(chain, "chain");
        o0 o0VarRequest = chain.request();
        o0.a aVarNewBuilder = o0VarRequest.newBuilder();
        u0 u0VarBody = o0VarRequest.body();
        if (u0VarBody != null) {
            j0 j0VarContentType = u0VarBody.contentType();
            if (j0VarContentType != null) {
                aVarNewBuilder.header("Content-Type", j0VarContentType.toString());
            }
            long jContentLength = u0VarBody.contentLength();
            if (jContentLength != -1) {
                aVarNewBuilder.header("Content-Length", String.valueOf(jContentLength));
                aVarNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                aVarNewBuilder.header("Transfer-Encoding", "chunked");
                aVarNewBuilder.removeHeader("Content-Length");
            }
        }
        int i10 = 0;
        if (o0VarRequest.header("Host") == null) {
            aVarNewBuilder.header("Host", yv.i.toHostHeader$default(o0VarRequest.url(), false, 1, null));
        }
        if (o0VarRequest.header("Connection") == null) {
            aVarNewBuilder.header("Connection", "Keep-Alive");
        }
        if (o0VarRequest.header("Accept-Encoding") == null && o0VarRequest.header(Command.HTTP_HEADER_RANGE) == null) {
            aVarNewBuilder.header("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        g0 g0VarUrl = o0VarRequest.url();
        v vVar = this.f52905a;
        List<t> listLoadForRequest = vVar.loadForRequest(g0VarUrl);
        if (!listLoadForRequest.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : listLoadForRequest) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p0.throwIndexOverflow();
                }
                t tVar = (t) obj;
                if (i10 > 0) {
                    sb2.append("; ");
                }
                sb2.append(tVar.name());
                sb2.append(G5.T);
                sb2.append(tVar.value());
                i10 = i11;
            }
            aVarNewBuilder.header("Cookie", sb2.toString());
        }
        if (o0VarRequest.header(Command.HTTP_HEADER_USER_AGENT) == null) {
            aVarNewBuilder.header(Command.HTTP_HEADER_USER_AGENT, "okhttp/5.1.0");
        }
        o0 o0VarBuild = aVarNewBuilder.build();
        v0 v0VarProceed = chain.proceed(o0VarBuild);
        i.receiveHeaders(vVar, o0VarBuild.url(), v0VarProceed.headers());
        v0.a aVarRequest = v0VarProceed.newBuilder().request(o0VarBuild);
        if (z10 && k0.equals("gzip", v0.header$default(v0VarProceed, "Content-Encoding", null, 2, null), true) && i.promisesBody(v0VarProceed) && (w0VarBody = v0VarProceed.body()) != null) {
            x xVar = new x(w0VarBody.source());
            aVarRequest.headers(v0VarProceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            aVarRequest.body(new l(v0.header$default(v0VarProceed, "Content-Type", null, 2, null), -1L, pw.h0.buffer(xVar)));
        }
        return aVarRequest.build();
    }
}
