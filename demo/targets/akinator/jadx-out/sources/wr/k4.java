package wr;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public final h4 f91008a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91009b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91010c;

    /* renamed from: d, reason: collision with root package name */
    public final g4 f91011d;

    /* renamed from: e, reason: collision with root package name */
    public final g4 f91012e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f91013f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f91014g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f91015h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f91016i;

    public k4(h4 h4Var, String str, g4 g4Var, g4 g4Var2, Object obj, boolean z10, boolean z11, boolean z12) {
        new AtomicReferenceArray(2);
        this.f91008a = (h4) mh.p1.checkNotNull(h4Var, "type");
        this.f91009b = (String) mh.p1.checkNotNull(str, "fullMethodName");
        this.f91010c = extractFullServiceName(str);
        this.f91011d = (g4) mh.p1.checkNotNull(g4Var, "requestMarshaller");
        this.f91012e = (g4) mh.p1.checkNotNull(g4Var2, "responseMarshaller");
        this.f91013f = obj;
        this.f91014g = z10;
        this.f91015h = z11;
        this.f91016i = z12;
    }

    @Deprecated
    public static <RequestT, ResponseT> k4 create(h4 h4Var, String str, g4 g4Var, g4 g4Var2) {
        return new k4(h4Var, str, g4Var, g4Var2, null, false, false, false);
    }

    public static String extractBareMethodName(String str) {
        int iLastIndexOf = ((String) mh.p1.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static String extractFullServiceName(String str) {
        int iLastIndexOf = ((String) mh.p1.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static String generateFullMethodName(String str, String str2) {
        return ((String) mh.p1.checkNotNull(str, "fullServiceName")) + "/" + ((String) mh.p1.checkNotNull(str2, "methodName"));
    }

    public static <ReqT, RespT> f4 newBuilder() {
        return newBuilder(null, null);
    }

    public String getBareMethodName() {
        return extractBareMethodName(this.f91009b);
    }

    public String getFullMethodName() {
        return this.f91009b;
    }

    public g4 getRequestMarshaller() {
        return this.f91011d;
    }

    public g4 getResponseMarshaller() {
        return this.f91012e;
    }

    public Object getSchemaDescriptor() {
        return this.f91013f;
    }

    public String getServiceName() {
        return this.f91010c;
    }

    public h4 getType() {
        return this.f91008a;
    }

    public boolean isIdempotent() {
        return this.f91014g;
    }

    public boolean isSafe() {
        return this.f91015h;
    }

    public boolean isSampledToLocalTracing() {
        return this.f91016i;
    }

    public Object parseRequest(InputStream inputStream) {
        return this.f91011d.parse(inputStream);
    }

    public Object parseResponse(InputStream inputStream) {
        return this.f91012e.parse(inputStream);
    }

    public InputStream streamRequest(Object obj) {
        return this.f91011d.stream(obj);
    }

    public InputStream streamResponse(Object obj) {
        return this.f91012e.stream(obj);
    }

    public f4 toBuilder() {
        return toBuilder(this.f91011d, this.f91012e);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("fullMethodName", this.f91009b).add("type", this.f91008a).add("idempotent", this.f91014g).add("safe", this.f91015h).add("sampledToLocalTracing", this.f91016i).add("requestMarshaller", this.f91011d).add("responseMarshaller", this.f91012e).add("schemaDescriptor", this.f91013f).omitNullValues().toString();
    }

    public static <ReqT, RespT> f4 newBuilder(g4 g4Var, g4 g4Var2) {
        return new f4().setRequestMarshaller(g4Var).setResponseMarshaller(g4Var2);
    }

    public <NewReqT, NewRespT> f4 toBuilder(g4 g4Var, g4 g4Var2) {
        return newBuilder().setRequestMarshaller(g4Var).setResponseMarshaller(g4Var2).setType(this.f91008a).setFullMethodName(this.f91009b).setIdempotent(this.f91014g).setSafe(this.f91015h).setSampledToLocalTracing(this.f91016i).setSchemaDescriptor(this.f91013f);
    }
}
