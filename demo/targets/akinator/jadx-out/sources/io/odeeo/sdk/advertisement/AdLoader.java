package io.odeeo.sdk.advertisement;

import android.util.Base64;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.gson.Gson;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.j1.k;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.data.AdInfo;
import io.odeeo.sdk.advertisement.data.BidRequestData;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kv.p;
import sv.k0;
import tu.x0;
import xv.f0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdLoader {
    public static final d Companion = new d(null);
    public static final int ERROR_IO_EXCEPTION = 8005;
    public static final int ERROR_NETWORK_NOT_AVAILABLE = 8054;
    public static final int ERROR_NO_INVENTORY = 8004;
    public static final int ERROR_UNKNOWN = 8003;
    public static final int ERROR_UNKNOWN_HOST = 8001;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.j1.f f68001a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.r1.b f68002b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f68003c;

    /* renamed from: d, reason: collision with root package name */
    public b f68004d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f68005e;
    public io.odeeo.internal.x1.a<k> retryManagerProvider;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends Exception {

        @lk.a
        @lk.c("error_code")
        private final int code;

        @lk.a
        @lk.c("error")
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, String message) {
            super(message);
            e0.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }

        public static /* synthetic */ a copy$default(a aVar, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.code;
            }
            if ((i11 & 2) != 0) {
                str = aVar.getMessage();
            }
            return aVar.copy(i10, str);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return getMessage();
        }

        public final a copy(int i10, String message) {
            e0.checkNotNullParameter(message, "message");
            return new a(i10, message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.code == aVar.code && e0.areEqual(getMessage(), aVar.getMessage());
        }

        public final int getCode() {
            return this.code;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + (Integer.hashCode(this.code) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "AdLoadError(code=" + this.code + ", message=" + getMessage() + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void onAdLoaded(AdLoader adLoader, AdInfo adInfo);

        void onAdLoadingError(AdLoader adLoader, int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final f0 f68006a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.l1.d f68007b;

        public c(f0 headers, io.odeeo.internal.l1.d vast) {
            e0.checkNotNullParameter(headers, "headers");
            e0.checkNotNullParameter(vast, "vast");
            this.f68006a = headers;
            this.f68007b = vast;
        }

        public static /* synthetic */ c copy$default(c cVar, f0 f0Var, io.odeeo.internal.l1.d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f0Var = cVar.f68006a;
            }
            if ((i10 & 2) != 0) {
                dVar = cVar.f68007b;
            }
            return cVar.copy(f0Var, dVar);
        }

        public final f0 component1() {
            return this.f68006a;
        }

        public final io.odeeo.internal.l1.d component2() {
            return this.f68007b;
        }

        public final c copy(f0 headers, io.odeeo.internal.l1.d vast) {
            e0.checkNotNullParameter(headers, "headers");
            e0.checkNotNullParameter(vast, "vast");
            return new c(headers, vast);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return e0.areEqual(this.f68006a, cVar.f68006a) && e0.areEqual(this.f68007b, cVar.f68007b);
        }

        public final f0 getHeaders() {
            return this.f68006a;
        }

        public final io.odeeo.internal.l1.d getVast() {
            return this.f68007b;
        }

        public int hashCode() {
            return this.f68007b.hashCode() + (this.f68006a.hashCode() * 31);
        }

        public String toString() {
            return "BidResponse(headers=" + this.f68006a + ", vast=" + this.f68007b + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.advertisement.AdLoader", f = "AdLoader.kt", i = {0, 1}, l = {145, 152}, m = "handle200Code-nn1eQK8", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class e extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f68008a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68009b;

        /* renamed from: d, reason: collision with root package name */
        public int f68011d;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f68009b = obj;
            this.f68011d |= Integer.MIN_VALUE;
            return AdLoader.this.a(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends kotlin.jvm.internal.f0 implements kv.a {
        public f() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4626invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4626invoke() {
            AdLoader adLoader = AdLoader.this;
            adLoader.cancelRetry$odeeoSdk_release(adLoader.f68003c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends kotlin.jvm.internal.f0 implements kv.a {
        public g() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4627invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4627invoke() {
            AdLoader adLoader = AdLoader.this;
            adLoader.cancelRetry$odeeoSdk_release(adLoader.f68003c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.advertisement.AdLoader$load$1", f = "AdLoader.kt", i = {0, 1, 2}, l = {61, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
    public static final class h extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f68014a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68015b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BidRequestData f68017d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f68018e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AdUnit.PlacementType f68019f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k f68020g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AdLoader f68021a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f68022b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AdLoader adLoader, CoroutineScope coroutineScope) {
                super(0);
                this.f68021a = adLoader;
                this.f68022b = coroutineScope;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m4628invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4628invoke() {
                this.f68021a.cancelRetry$odeeoSdk_release(this.f68022b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BidRequestData bidRequestData, String str, AdUnit.PlacementType placementType, k kVar, zu.d<? super h> dVar) {
            super(2, dVar);
            this.f68017d = bidRequestData;
            this.f68018e = str;
            this.f68019f = placementType;
            this.f68020g = kVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            h hVar = AdLoader.this.new h(this.f68017d, this.f68018e, this.f68019f, this.f68020g, dVar);
            hVar.f68015b = obj;
            return hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
        
            if (r14 == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x012d, code lost:
        
            if (r14.retryFetch$odeeoSdk_release(null, "AdLoader", r5, r13) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
        
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(r14) == false) goto L60;
         */
        /* JADX WARN: Path cross not found for [B:28:0x00a2, B:8:0x0019], limit reached: 59 */
        /* JADX WARN: Path cross not found for [B:42:0x00e2, B:34:0x00c2], limit reached: 59 */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0099 -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a0 -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ce -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d8 -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e2 -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0103 -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012d -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0130 -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.advertisement.AdLoader.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AdLoader(io.odeeo.internal.j1.f networkManager, io.odeeo.internal.r1.b makeBidRequestUseCase, CoroutineScope adLoaderScope) {
        e0.checkNotNullParameter(networkManager, "networkManager");
        e0.checkNotNullParameter(makeBidRequestUseCase, "makeBidRequestUseCase");
        e0.checkNotNullParameter(adLoaderScope, "adLoaderScope");
        this.f68001a = networkManager;
        this.f68002b = makeBidRequestUseCase;
        this.f68003c = adLoaderScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleError$odeeoSdk_release$default(AdLoader adLoader, w0 w0Var, io.odeeo.internal.y1.f fVar, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            fVar = io.odeeo.internal.j1.f.converter$default(adLoader.f68001a, a.class, null, 2, null);
        }
        adLoader.handleError$odeeoSdk_release(w0Var, fVar);
    }

    /* renamed from: load-gfFLLNU$default, reason: not valid java name */
    public static /* synthetic */ Job m4624loadgfFLLNU$default(AdLoader adLoader, BidRequestData bidRequestData, AdUnit.PlacementType placementType, String str, k kVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            k kVar2 = adLoader.getRetryManagerProvider().get();
            e0.checkNotNullExpressionValue(kVar2, "fun load(\n        adRequ…hile (isActive)\n        }");
            kVar = kVar2;
        }
        return adLoader.m4625loadgfFLLNU(bidRequestData, placementType, str, kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r10.retryFetch$odeeoSdk_release(null, "AdLoader", r8, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        if (r10.retryFetch$odeeoSdk_release(null, "AdLoader", r8, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xv.f0 r8, io.odeeo.internal.l1.d r9, io.odeeo.internal.j1.k r10, java.lang.String r11, zu.d<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.advertisement.AdLoader.a(xv.f0, io.odeeo.internal.l1.d, io.odeeo.internal.j1.k, java.lang.String, zu.d):java.lang.Object");
    }

    public final void cancelRetry$odeeoSdk_release(CoroutineScope scope) {
        e0.checkNotNullParameter(scope, "scope");
        io.odeeo.internal.b2.a.i("cancel retrying", new Object[0]);
        CoroutineScopeKt.cancel$default(scope, null, 1, null);
    }

    public final void forceCancelledStatus() {
        this.f68005e = true;
    }

    public final b getListener() {
        return this.f68004d;
    }

    public final io.odeeo.internal.x1.a<k> getRetryManagerProvider() {
        io.odeeo.internal.x1.a<k> aVar = this.retryManagerProvider;
        if (aVar != null) {
            return aVar;
        }
        e0.throwUninitializedPropertyAccessException("retryManagerProvider");
        return null;
    }

    public final void handleError$odeeoSdk_release(w0 w0Var, io.odeeo.internal.y1.f<w0, a> converter) throws IOException {
        String message;
        e0.checkNotNullParameter(converter, "converter");
        a aVarConvert = null;
        if (w0Var != null) {
            try {
                aVarConvert = converter.convert(w0Var);
            } catch (IOException e10) {
                io.odeeo.internal.b2.a.w(e10, e10.getMessage(), new Object[0]);
            }
        }
        if (aVarConvert == null || (message = aVarConvert.getMessage()) == null) {
            message = "General error";
        }
        io.odeeo.internal.b2.a.w(message, new Object[0]);
    }

    public final boolean isCancelled$odeeoSdk_release() {
        return this.f68005e;
    }

    /* renamed from: load-gfFLLNU, reason: not valid java name */
    public final Job m4625loadgfFLLNU(BidRequestData adRequest, AdUnit.PlacementType adPlacementType, String placementId, k retryManager) {
        e0.checkNotNullParameter(adRequest, "adRequest");
        e0.checkNotNullParameter(adPlacementType, "adPlacementType");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(retryManager, "retryManager");
        return BuildersKt__Builders_commonKt.launch$default(this.f68003c, null, null, new h(adRequest, placementId, adPlacementType, retryManager, null), 3, null);
    }

    public final io.odeeo.internal.a.c<io.odeeo.internal.e1.c, Exception> parsePlacementConfig(f0 headers) {
        String strReplace$default;
        e0.checkNotNullParameter(headers, "headers");
        try {
            String str = headers.get("X-ODEEO-PLACEMENT-CONFIG");
            String str2 = headers.get("X-ODEEO-TRANSACTION-ID");
            byte[] decodedBytes = Base64.decode((str == null || (strReplace$default = k0.replace$default(str, '-', '+', false, 4, (Object) null)) == null) ? null : k0.replace$default(strReplace$default, '_', '/', false, 4, (Object) null), 0);
            e0.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
            Object objFromJson = new Gson().fromJson(new String(decodedBytes, sv.g.f86134b), (Class<Object>) io.odeeo.internal.e1.c.class);
            io.odeeo.internal.e1.c cVar = (io.odeeo.internal.e1.c) objFromJson;
            cVar.setPlacementAdFrequencyMillis(cVar.getPlacementAdFrequency() * 1000);
            if (str2 == null) {
                str2 = "";
            }
            cVar.setTransactionId(str2);
            return new io.odeeo.internal.a.b((io.odeeo.internal.e1.c) objFromJson);
        } catch (Exception e10) {
            return new io.odeeo.internal.a.a(e10);
        }
    }

    public final void setCancelled$odeeoSdk_release(boolean z10) {
        this.f68005e = z10;
    }

    public final void setListener(b bVar) {
        this.f68004d = bVar;
    }

    public final void setRetryManagerProvider(io.odeeo.internal.x1.a<k> aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.retryManagerProvider = aVar;
    }

    public final void a(int i10) {
        b bVar = this.f68004d;
        if (bVar != null && !this.f68005e) {
            e0.checkNotNull(bVar);
            bVar.onAdLoadingError(null, i10);
        }
        this.f68005e = false;
    }
}
