package com.unity3d.ads.network.mapper;

import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import sv.n0;
import tu.t;
import uu.y0;
import xv.f0;
import xv.j0;
import xv.o0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final u0 generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            return u0.create(j0.parse("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            return u0.create(j0.parse("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new t();
    }

    private static final f0 generateOkHttpHeaders(HttpRequest httpRequest) {
        f0.a aVar = new f0.a();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            aVar.add(entry.getKey(), y0.joinToString$default(entry.getValue(), ",", null, null, 0, null, null, 62, null));
        }
        f0 f0VarBuild = aVar.build();
        e0.checkNotNullExpressionValue(f0VarBuild, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return f0VarBuild;
    }

    public static final o0 toOkHttpRequest(HttpRequest httpRequest) {
        e0.checkNotNullParameter(httpRequest, "<this>");
        o0 o0VarBuild = new o0.a().url(n0.removeSuffix(n0.trim(httpRequest.getBaseURL(), '/') + '/' + n0.trim(httpRequest.getPath(), '/'), (CharSequence) "/")).method(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody())).headers(generateOkHttpHeaders(httpRequest)).build();
        e0.checkNotNullExpressionValue(o0VarBuild, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return o0VarBuild;
    }
}
