package com.unity3d.ads.core.data.datasource;

import av.e;
import bv.b;
import bv.d;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C3191e4;
import com.ironsource.Me;
import com.ironsource.Y5;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gv.o;
import gv.s;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClient httpClient;
    private final CoroutineDispatcher ioDispatcher;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", f = "AndroidRemoteCacheDataSource.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {57, TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER}, m = "getFile", n = {"this", "cachePath", Y5.c.f35774b, "url", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Y5.c.f35774b, "url", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Me.f34938n, "extension", C3191e4.h.f36473b}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRemoteCacheDataSource.this.getFile(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$saveToCache$2", f = "AndroidRemoteCacheDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$saveToCache$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ Object $body;
        final /* synthetic */ File $dest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, File file, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$body = obj;
            this.$dest = file;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass2(this.$body, this.$dest, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IOException {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            Object obj2 = this.$body;
            if (obj2 instanceof File) {
                s.copyTo$default((File) obj2, this.$dest, true, 0, 4, null);
                return b.boxBoolean(((File) this.$body).delete());
            }
            boolean z10 = obj2 instanceof byte[];
            x0 x0Var = x0.f87415a;
            if (z10) {
                this.$dest.createNewFile();
                o.writeBytes(this.$dest, (byte[]) this.$body);
                return x0Var;
            }
            if (obj2 instanceof String) {
                this.$dest.createNewFile();
                o.writeText$default(this.$dest, (String) this.$body, null, 2, null);
                return x0Var;
            }
            StringBuilder sb2 = new StringBuilder("Unknown body type ");
            Object obj3 = this.$body;
            sb2.append(obj3 != null ? obj3.getClass().getSimpleName() : null);
            throw new IllegalStateException(sb2.toString().toString());
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidRemoteCacheDataSource(CoroutineDispatcher ioDispatcher, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClient httpClient) {
        e0.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        e0.checkNotNullParameter(createFile, "createFile");
        e0.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        e0.checkNotNullParameter(httpClient, "httpClient");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClient = httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadFile(String str, Integer num, zu.d<? super HttpResponse> dVar) {
        return this.httpClient.execute(new HttpRequest(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65534, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveToCache(File file, Object obj, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new AnonymousClass2(obj, file, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getFile(java.io.File r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, zu.d<? super com.unity3d.ads.core.data.model.CacheResult> r17) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, zu.d):java.lang.Object");
    }
}
