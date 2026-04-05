package io.bidmachine;

import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import nm.d;
import org.apache.http.conn.ConnectTimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class ApiRequest<RequestDataType, ResponseType> extends nm.d {
    static int REQUEST_TIMEOUT = 10000;
    String requiredUrl;
    int timeOut;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ApiAuctionDataBinder extends ApiResponseAuctionDataBinder {
        @Override // io.bidmachine.ApiRequest.ApiResponseAuctionDataBinder, nm.d.b
        public byte[] obtainData(nm.d dVar, URLConnection uRLConnection, Request request) throws Exception {
            Openrtb.Builder builderNewBuilder = Openrtb.newBuilder();
            builderNewBuilder.setRequest(request);
            builderNewBuilder.setVer("3.0");
            builderNewBuilder.setDomainspec("adcom");
            builderNewBuilder.setDomainver(APSAnalytics.DEFAULT_SDK_VERSION);
            nm.a.d(new ao.n(22, "Auction Request", builderNewBuilder));
            return builderNewBuilder.build().toByteArray();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class ApiDataBinder<RequestDataType, ResponseDataType> extends d.b {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ApiEventDataBinder extends ApiDataBinder<SDKEvent, Void> {
        @Override // nm.d.b
        public void prepareHeaders(nm.d dVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        @Override // nm.d.b
        public Void createSuccessResult(nm.d dVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        @Override // nm.d.b
        public byte[] obtainData(nm.d dVar, URLConnection uRLConnection, SDKEvent sDKEvent) throws Exception {
            if (sDKEvent != null) {
                return sDKEvent.toByteArray();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ApiInitDataBinder extends ApiDataBinder<InitRequest, InitResponse> {
        @Override // nm.d.b
        public byte[] obtainData(nm.d dVar, URLConnection uRLConnection, InitRequest initRequest) throws Exception {
            if (initRequest != null) {
                nm.a.d(new ao.n(22, "Init Request", initRequest));
            }
            if (initRequest != null) {
                return initRequest.toByteArray();
            }
            return null;
        }

        @Override // nm.d.b
        public void prepareHeaders(nm.d dVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        @Override // nm.d.b
        public InitResponse createSuccessResult(nm.d dVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            InitResponse from = InitResponse.parseFrom(bArr);
            if (from != null) {
                nm.a.d(new ao.n(22, "Init Response", from));
            }
            return from;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ApiResponseAuctionDataBinder extends ApiDataBinder<Request, Response> {
        @Override // nm.d.b
        public void prepareHeaders(nm.d dVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        @Override // nm.d.b
        public Response createSuccessResult(nm.d dVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            Openrtb from = Openrtb.parseFrom(bArr);
            if (from == null) {
                return null;
            }
            nm.a.d(new ao.n(22, "Auction Response", from));
            return from.getResponse();
        }

        @Override // nm.d.b
        public byte[] obtainData(nm.d dVar, URLConnection uRLConnection, Request request) throws Exception {
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ApiTrackerDataBinder extends ApiDataBinder<Object, String> {
        @Override // nm.d.b
        public byte[] obtainData(nm.d dVar, URLConnection uRLConnection, Object obj) throws Exception {
            return null;
        }

        @Override // nm.d.b
        public void prepareHeaders(nm.d dVar, URLConnection uRLConnection) {
            String userAgent = UserAgentManager.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                return;
            }
            uRLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, userAgent);
        }

        @Override // nm.d.b
        public String createSuccessResult(nm.d dVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder<RequestDataType, ResponseDataType> {
        private nm.b callback;
        private nm.c cancelCallback;
        private ApiDataBinder<RequestDataType, ResponseDataType> dataBinder;
        private RequestDataType requestData;
        private String url;
        private int timeOut = ApiRequest.REQUEST_TIMEOUT;
        private nm.e method = nm.e.Post;

        /* JADX WARN: Multi-variable type inference failed */
        public ApiRequest<RequestDataType, ResponseDataType> build() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequest = new ApiRequest<>(this.method, null, this.requestData);
            apiRequest.setCallback(this.callback);
            apiRequest.setCancelCallback(this.cancelCallback);
            apiRequest.setDataBinder(this.dataBinder);
            apiRequest.requiredUrl = this.url;
            apiRequest.timeOut = this.timeOut;
            return apiRequest;
        }

        public String getUrl() {
            return this.url;
        }

        public ApiRequest<RequestDataType, ResponseDataType> request() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequestBuild = build();
            apiRequestBuild.request();
            return apiRequestBuild;
        }

        public Builder<RequestDataType, ResponseDataType> setCallback(nm.b bVar) {
            this.callback = bVar;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setCancelCallback(nm.c cVar) {
            this.cancelCallback = cVar;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setDataBinder(ApiDataBinder<RequestDataType, ResponseDataType> apiDataBinder) {
            this.dataBinder = apiDataBinder;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setLoadingTimeOut(int i10) {
            if (i10 <= 0) {
                i10 = ApiRequest.REQUEST_TIMEOUT;
            }
            this.timeOut = i10;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setMethod(nm.e eVar) {
            this.method = eVar;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setRequestData(RequestDataType requestdatatype) {
            this.requestData = requestdatatype;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> url(String str) {
            this.url = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$obtainError$0(Throwable th2, URLConnection uRLConnection) {
        return "obtainError: " + th2 + "(" + uRLConnection + ")";
    }

    @Override // nm.d
    public String getBaseUrl() {
        return this.requiredUrl;
    }

    @Override // nm.d
    public void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.timeOut);
        uRLConnection.setReadTimeout(this.timeOut);
    }

    private ApiRequest(nm.e eVar, String str, RequestDataType requestdatatype) {
        super(eVar, str, requestdatatype);
        addContentEncoder(new d.a());
    }

    @Override // nm.d
    public pr.a obtainError(URLConnection uRLConnection, int i10) {
        pr.a aVarInternal;
        if (i10 >= 200 && i10 < 300) {
            return pr.a.f81800r;
        }
        if (i10 >= 400 && i10 < 500) {
            aVarInternal = pr.a.f81789g;
        } else if (i10 >= 500 && i10 < 600) {
            aVarInternal = pr.a.f81790h;
        } else {
            aVarInternal = pr.a.internal("Unknown server error");
        }
        return new pr.a(aVarInternal, i10, p0.o2.k(i10, "Server returned ", " code"));
    }

    @Override // nm.d
    public pr.a obtainError(URLConnection uRLConnection, Throwable th2) {
        nm.a.d(new ao.n(19, th2, uRLConnection));
        if (th2 instanceof UnknownHostException) {
            return pr.a.f81787e;
        }
        if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof ConnectTimeoutException)) {
            return pr.a.throwable("Unknown api request error", th2);
        }
        return pr.a.f81788f;
    }
}
