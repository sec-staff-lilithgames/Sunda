package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gv.c;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import org.json.JSONArray;
import tu.a0;
import tu.t;
import tu.x0;
import tu.z;
import uu.k0;
import uu.p1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClient httpClient;
    private final CoroutineDispatcher ioDispatcher;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ Object[] $parameters;
        final /* synthetic */ RequestType $type;
        int label;
        final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$parameters = objArr;
            this.this$0 = androidExecuteAdViewerRequest;
            this.$type = requestType;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$parameters, this.this$0, this.$type, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objM7131constructorimpl;
            WebResourceResponse webResourceResponseInvoke$default;
            InputStream data;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            Object orNull = k0.getOrNull(this.$parameters, 1);
            byte[] bytes = null;
            String str = orNull instanceof String ? (String) orNull : null;
            if (str == null) {
                str = "";
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            try {
                int i11 = z.f87419c;
                Uri uri = Uri.parse(str);
                e0.checkNotNullExpressionValue(uri, "parse(this)");
                objM7131constructorimpl = z.m7131constructorimpl(uri);
            } catch (Throwable th2) {
                int i12 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = null;
            }
            Uri uri2 = (Uri) objM7131constructorimpl;
            if (uri2 != null) {
                if (this.$type != RequestType.GET) {
                    uri2 = null;
                }
                if (uri2 != null && (webResourceResponseInvoke$default = GetCachedAsset.invoke$default(this.this$0.getCachedAsset, uri2, null, 2, null)) != null && (data = webResourceResponseInvoke$default.getData()) != null) {
                    e0.checkNotNullExpressionValue(data, "data");
                    bytes = c.readBytes(data);
                }
            }
            byte[] bArr = bytes;
            if (bArr != null) {
                return new HttpResponse(bArr, 0, null, null, null, null, 0L, 126, null);
            }
            HttpClient httpClient = this.this$0.httpClient;
            HttpRequest httpRequestCreateRequest = this.this$0.createRequest(this.$type, this.$parameters);
            this.label = 1;
            Object objExecute = httpClient.execute(httpRequestCreateRequest, this);
            return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidExecuteAdViewerRequest(CoroutineDispatcher ioDispatcher, HttpClient httpClient, GetCachedAsset getCachedAsset) {
        e0.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        e0.checkNotNullParameter(httpClient, "httpClient");
        e0.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClient = httpClient;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map<String, List<String>> mapEmptyMap;
        Map<String, List<String>> mapEmptyMap2;
        String str = (String) k0.getOrNull(objArr, 1);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            JSONArray jSONArray = (JSONArray) k0.getOrNull(objArr, 2);
            Integer num = (Integer) k0.getOrNull(objArr, 3);
            Integer num2 = (Integer) k0.getOrNull(objArr, 4);
            if (jSONArray == null || (mapEmptyMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                mapEmptyMap = p1.emptyMap();
            }
            return new HttpRequest(str, null, requestType, null, mapEmptyMap, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i10 != 3) {
            throw new t();
        }
        String str2 = (String) k0.getOrNull(objArr, 2);
        JSONArray jSONArray2 = (JSONArray) k0.getOrNull(objArr, 3);
        Integer num3 = (Integer) k0.getOrNull(objArr, 4);
        Integer num4 = (Integer) k0.getOrNull(objArr, 5);
        if (jSONArray2 == null || (mapEmptyMap2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            mapEmptyMap2 = p1.emptyMap();
        }
        return new HttpRequest(str, null, requestType, str2, mapEmptyMap2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, d<? super HttpResponse> dVar) {
        return BuildersKt.withContext(this.ioDispatcher, new AnonymousClass2(objArr, this, requestType, null), dVar);
    }
}
