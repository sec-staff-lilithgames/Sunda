package com.unity3d.services.core.network.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.model.OperationType;
import e3.g;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, Object obj2) {
        int i16;
        File file2;
        String str4;
        HttpRequest httpRequest2;
        OperationType operationType2;
        String str5;
        RequestType requestType2;
        Object obj3;
        Map map3;
        Map map4;
        BodyType bodyType2;
        String str6;
        Integer num2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        String str7 = (i15 & 1) != 0 ? httpRequest.baseURL : str;
        String str8 = (i15 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType3 = (i15 & 4) != 0 ? httpRequest.method : requestType;
        Object obj4 = (i15 & 8) != 0 ? httpRequest.body : obj;
        Map map5 = (i15 & 16) != 0 ? httpRequest.headers : map;
        Map map6 = (i15 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType3 = (i15 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str9 = (i15 & 128) != 0 ? httpRequest.scheme : str3;
        Integer num3 = (i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? httpRequest.port : num;
        int i21 = (i15 & 512) != 0 ? httpRequest.connectTimeout : i10;
        int i22 = (i15 & 1024) != 0 ? httpRequest.readTimeout : i11;
        int i23 = (i15 & 2048) != 0 ? httpRequest.writeTimeout : i12;
        int i24 = (i15 & 4096) != 0 ? httpRequest.callTimeout : i13;
        boolean z12 = (i15 & Segment.SIZE) != 0 ? httpRequest.isProtobuf : z10;
        String str10 = str7;
        OperationType operationType3 = (i15 & 16384) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i15 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i15 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            file2 = file3;
            i16 = httpRequest.priority;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i17 = i21;
            i18 = i22;
            i19 = i23;
            i20 = i24;
            z11 = z12;
            str4 = str10;
            httpRequest2 = httpRequest;
        } else {
            i16 = i14;
            file2 = file3;
            str4 = str10;
            httpRequest2 = httpRequest;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i17 = i21;
            i18 = i22;
            i19 = i23;
            i20 = i24;
            z11 = z12;
        }
        return httpRequest2.copy(str4, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i17, i18, i19, i20, z11, operationType2, file2, i16);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14) {
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
        e0.checkNotNullParameter(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, file, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return e0.areEqual(this.baseURL, httpRequest.baseURL) && e0.areEqual(this.path, httpRequest.path) && this.method == httpRequest.method && e0.areEqual(this.body, httpRequest.body) && e0.areEqual(this.headers, httpRequest.headers) && e0.areEqual(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && e0.areEqual(this.scheme, httpRequest.scheme) && e0.areEqual(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && e0.areEqual(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.method.hashCode() + o2.e(this.baseURL.hashCode() * 31, 31, this.path)) * 31;
        Object obj = this.body;
        int iE = o2.e((this.bodyType.hashCode() + o2.f(this.parameters, o2.f(this.headers, (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31)) * 31, 31, this.scheme);
        Integer num = this.port;
        int iD = g.d(this.callTimeout, g.d(this.writeTimeout, g.d(this.readTimeout, g.d(this.connectTimeout, (iE + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
        boolean z10 = this.isProtobuf;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iHashCode2 = (this.operationType.hashCode() + ((iD + i10) * 31)) * 31;
        File file = this.downloadDestination;
        return Integer.hashCode(this.priority) + ((iHashCode2 + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest(baseURL=");
        sb2.append(this.baseURL);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", method=");
        sb2.append(this.method);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", bodyType=");
        sb2.append(this.bodyType);
        sb2.append(", scheme=");
        sb2.append(this.scheme);
        sb2.append(", port=");
        sb2.append(this.port);
        sb2.append(", connectTimeout=");
        sb2.append(this.connectTimeout);
        sb2.append(", readTimeout=");
        sb2.append(this.readTimeout);
        sb2.append(", writeTimeout=");
        sb2.append(this.writeTimeout);
        sb2.append(", callTimeout=");
        sb2.append(this.callTimeout);
        sb2.append(", isProtobuf=");
        sb2.append(this.isProtobuf);
        sb2.append(", operationType=");
        sb2.append(this.operationType);
        sb2.append(", downloadDestination=");
        sb2.append(this.downloadDestination);
        sb2.append(", priority=");
        return g.m(sb2, this.priority, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, 0, 0, 0, false, null, null, 0, 130048, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, 0, 0, false, null, null, 0, 129024, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, 0, false, null, null, 0, 126976, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, false, null, null, 0, 122880, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, null, null, 0, 114688, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, null, 0, 98304, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
        e0.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, file, 0, C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
        e0.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14) {
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(bodyType, "bodyType");
        e0.checkNotNullParameter(scheme, "scheme");
        e0.checkNotNullParameter(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
        this.isProtobuf = z10;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i14;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, u uVar) {
        this(str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? RequestType.GET : requestType, (i15 & 8) != 0 ? null : obj, (i15 & 16) != 0 ? p1.emptyMap() : map, (i15 & 32) != 0 ? p1.emptyMap() : map2, (i15 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i15 & 128) != 0 ? DEFAULT_SCHEME : str3, (i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num, (i15 & 512) != 0 ? 30000 : i10, (i15 & 1024) != 0 ? 30000 : i11, (i15 & 2048) != 0 ? 30000 : i12, (i15 & 4096) == 0 ? i13 : 30000, (i15 & Segment.SIZE) != 0 ? false : z10, (i15 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i15 & 32768) != 0 ? null : file, (i15 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0 : i14);
    }
}
