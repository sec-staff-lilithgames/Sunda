package com.vungle.ads.internal.network;

import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.converters.EmptyResponseConverter;
import com.vungle.ads.internal.network.converters.JsonConverter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import tu.t;
import uu.y0;
import xv.f0;
import xv.g0;
import xv.i;
import xv.j0;
import xv.o0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleApiImpl implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private final EmptyResponseConverter emptyResponseConverter;
    private final i okHttpClient;
    public static final Companion Companion = new Companion(null);
    private static final Json json = JsonKt.Json$default(null, VungleApiImpl$Companion$json$1.INSTANCE, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            iArr[HttpMethod.GET.ordinal()] = 1;
            iArr[HttpMethod.POST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VungleApiImpl(i okHttpClient) {
        e0.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new EmptyResponseConverter();
    }

    private final o0.a defaultBuilder(String str, String str2, String str3, Map<String, String> map) {
        o0.a aVarAddHeader = new o0.a().url(str2).addHeader(Command.HTTP_HEADER_USER_AGENT, str).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", G5.L);
        if (map != null) {
            aVarAddHeader.headers(f0.f93621c.of(map));
        }
        if (str3 != null) {
            aVarAddHeader.addHeader("X-Vungle-Placement-Ref-Id", str3);
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            aVarAddHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            aVarAddHeader.addHeader("X-Vungle-App-Id", appId);
        }
        return aVarAddHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0.a defaultBuilder$default(VungleApiImpl vungleApiImpl, String str, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            map = null;
        }
        return vungleApiImpl.defaultBuilder(str, str2, str3, map);
    }

    private final o0.a defaultProtoBufBuilder(String str, g0 g0Var) {
        o0.a aVarAddHeader = new o0.a().url(g0Var).addHeader(Command.HTTP_HEADER_USER_AGENT, str).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            aVarAddHeader.addHeader("X-Vungle-App-Id", appId);
        }
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            aVarAddHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        return aVarAddHeader;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<ConfigPayload> config(String ua2, String path, CommonRequestBody body) {
        e0.checkNotNullParameter(ua2, "ua");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), c1.typeOf(CommonRequestBody.class));
            e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            try {
                return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua2, path, null, null, 12, null).post(u0.Companion.create(json2.encodeToString(kSerializerSerializer, body), (j0) null)).build()), new JsonConverter(c1.typeOf(ConfigPayload.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final i getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> pingTPAT(String ua2, String url, HttpMethod requestType, Map<String, String> map, u0 u0Var) {
        o0 o0VarBuild;
        e0.checkNotNullParameter(ua2, "ua");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(requestType, "requestType");
        o0.a aVarDefaultBuilder$default = defaultBuilder$default(this, ua2, url, null, map, 4, null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1) {
            o0VarBuild = aVarDefaultBuilder$default.get().build();
        } else {
            if (i10 != 2) {
                throw new t();
            }
            if (u0Var == null) {
                u0Var = u0.a.create$default(u0.Companion, new byte[0], (j0) null, 0, 0, 6, (Object) null);
            }
            o0VarBuild = aVarDefaultBuilder$default.post(u0Var).build();
        }
        return new OkHttpCall(this.okHttpClient.newCall(o0VarBuild), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> ri(String ua2, String path, CommonRequestBody body) {
        e0.checkNotNullParameter(ua2, "ua");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), c1.typeOf(CommonRequestBody.class));
            e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            try {
                return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua2, path, null, null, 12, null).post(u0.Companion.create(json2.encodeToString(kSerializerSerializer, body), (j0) null)).build()), this.emptyResponseConverter);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendAdMarkup(String path, u0 requestBody) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, "debug", g0.f93628j.get(path).newBuilder().build().toString(), null, null, 12, null).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendErrors(String ua2, String path, u0 requestBody) {
        e0.checkNotNullParameter(ua2, "ua");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua2, g0.f93628j.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendMetrics(String ua2, String path, u0 requestBody) {
        e0.checkNotNullParameter(ua2, "ua");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua2, g0.f93628j.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<AdPayload> ads(String ua2, String path, CommonRequestBody body) {
        String strEncodeToString;
        CommonRequestBody.RequestParam request;
        List<String> placements;
        e0.checkNotNullParameter(ua2, "ua");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), c1.typeOf(CommonRequestBody.class));
            e0.checkNotNull(kSerializerSerializer, SUvoXnn.gNRE);
            strEncodeToString = json2.encodeToString(kSerializerSerializer, body);
            request = body.getRequest();
        } catch (Exception unused) {
        }
        try {
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder$default(this, ua2, path, (request == null || (placements = request.getPlacements()) == null) ? null : (String) y0.firstOrNull((List) placements), null, 8, null).post(u0.Companion.create(strEncodeToString, (j0) null)).build()), new JsonConverter(c1.typeOf(AdPayload.class)));
        } catch (Exception unused2) {
            return null;
        }
    }
}
