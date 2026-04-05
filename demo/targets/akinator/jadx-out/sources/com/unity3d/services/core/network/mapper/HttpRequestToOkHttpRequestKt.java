package com.unity3d.services.core.network.mapper;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import sv.n0;
import uu.y0;
import xv.f0;
import xv.j0;
import xv.o0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final u0 generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            u0 u0VarCreate = u0.create(j0.parse("text/plain;charset=utf-8"), (byte[]) obj);
            e0.checkNotNullExpressionValue(u0VarCreate, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return u0VarCreate;
        }
        if (obj instanceof String) {
            u0 u0VarCreate2 = u0.create(j0.parse("text/plain;charset=utf-8"), (String) obj);
            e0.checkNotNullExpressionValue(u0VarCreate2, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return u0VarCreate2;
        }
        u0 u0VarCreate3 = u0.create(j0.parse("text/plain;charset=utf-8"), "");
        e0.checkNotNullExpressionValue(u0VarCreate3, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return u0VarCreate3;
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

    private static final u0 generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            u0 u0VarCreate = u0.create(j0.parse(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            e0.checkNotNullExpressionValue(u0VarCreate, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return u0VarCreate;
        }
        if (obj instanceof String) {
            u0 u0VarCreate2 = u0.create(j0.parse(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            e0.checkNotNullExpressionValue(u0VarCreate2, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return u0VarCreate2;
        }
        u0 u0VarCreate3 = u0.create(j0.parse(CommonGatewayClient.HEADER_PROTOBUF), "");
        e0.checkNotNullExpressionValue(u0VarCreate3, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return u0VarCreate3;
    }

    public static final o0 toOkHttpProtoRequest(HttpRequest httpRequest) {
        e0.checkNotNullParameter(httpRequest, "<this>");
        o0.a aVarUrl = new o0.a().url(n0.removeSuffix(n0.trim(httpRequest.getBaseURL(), '/') + '/' + n0.trim(httpRequest.getPath(), '/'), (CharSequence) "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        o0 o0VarBuild = aVarUrl.method(string, body != null ? generateOkHttpProtobufBody(body) : null).headers(generateOkHttpHeaders(httpRequest)).build();
        e0.checkNotNullExpressionValue(o0VarBuild, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return o0VarBuild;
    }

    public static final o0 toOkHttpRequest(HttpRequest httpRequest) {
        e0.checkNotNullParameter(httpRequest, "<this>");
        o0.a aVarUrl = new o0.a().url(n0.removeSuffix(n0.trim(httpRequest.getBaseURL(), '/') + '/' + n0.trim(httpRequest.getPath(), '/'), (CharSequence) "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        o0 o0VarBuild = aVarUrl.method(string, body != null ? generateOkHttpBody(body) : null).headers(generateOkHttpHeaders(httpRequest)).build();
        e0.checkNotNullExpressionValue(o0VarBuild, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return o0VarBuild;
    }
}
