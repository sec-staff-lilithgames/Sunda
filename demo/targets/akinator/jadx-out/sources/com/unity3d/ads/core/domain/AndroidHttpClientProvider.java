package com.unity3d.ads.core.domain;

import android.content.Context;
import av.b;
import av.e;
import bv.d;
import bv.f;
import bv.h;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import gv.s;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.chromium.net.CronetEngine;
import tu.z;
import uu.o1;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private final Map<Boolean, HttpClient> cacheHttpClientMap;
    private final CleanupDirectory cleanupDirectory;
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final Mutex httpClientMutex;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {177, 78}, m = "invoke", n = {"this", "$this$withLock_u24default$iv", "gatewaySpecific", "this", "$this$withLock_u24default$iv", "gatewaySpecific", "startTime", "usingRefactoredGatewayClient"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "J$0", "I$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(false, this);
        }
    }

    public AndroidHttpClientProvider(ConfigFileFromLocalStorage configFileFromLocalStorage, AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        e0.checkNotNullParameter(configFileFromLocalStorage, "configFileFromLocalStorage");
        e0.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(cleanupDirectory, "cleanupDirectory");
        e0.checkNotNullParameter(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.httpClientMutex = MutexKt.Mutex$default(false, 1, null);
        this.cacheHttpClientMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildCronetCachePath(Context context) {
        File filesDir = context.getFilesDir();
        e0.checkNotNullExpressionValue(filesDir, "context.filesDir");
        File fileResolve = s.resolve(filesDir, UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        if (!fileResolve.exists()) {
            fileResolve.mkdirs();
        }
        String absolutePath = fileResolve.getAbsolutePath();
        e0.checkNotNullExpressionValue(absolutePath, "cacheDir.absolutePath");
        return absolutePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, zu.d<? super HttpClient> dVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> it) {
                String str;
                String message;
                long maxCachedAssetSizeMb;
                e0.checkNotNullParameter(it, "it");
                str = "Errored without message.";
                if (!it.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = it.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", null, o1.mapOf(tu.e0.to("reason", str)), null, null, null, 58, null);
                    CancellableContinuation<HttpClient> cancellableContinuation = cancellableContinuationImpl;
                    int i10 = z.f87419c;
                    cancellableContinuation.resumeWith(z.m7131constructorimpl(new OkHttp3Client(iSDKDispatchers, new l0(), context, this.this$0.sessionRepository, this.this$0.cleanupDirectory, this.this$0.alternativeFlowReader)));
                    return;
                }
                if (this.this$0.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                    long j10 = 1024;
                    maxCachedAssetSizeMb = this.this$0.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration().getMaxCachedAssetSizeMb() * j10 * j10;
                } else {
                    maxCachedAssetSizeMb = ServiceProvider.HTTP_CACHE_DISK_SIZE;
                }
                try {
                    CronetEngine cronetEngine = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context).setStoragePath(this.this$0.buildCronetCachePath(context)).enableHttpCache(3, maxCachedAssetSizeMb).enableQuic(true).addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443).build();
                    CancellableContinuation<HttpClient> cancellableContinuation2 = cancellableContinuationImpl;
                    int i11 = z.f87419c;
                    e0.checkNotNullExpressionValue(cronetEngine, "cronetEngine");
                    cancellableContinuation2.resumeWith(z.m7131constructorimpl(new CronetClient(cronetEngine, iSDKDispatchers)));
                } catch (Throwable th2) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th2.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", null, o1.mapOf(tu.e0.to("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
                    CancellableContinuation<HttpClient> cancellableContinuation3 = cancellableContinuationImpl;
                    int i12 = z.f87419c;
                    cancellableContinuation3.resumeWith(z.m7131constructorimpl(new OkHttp3Client(iSDKDispatchers, new l0(), context, this.this$0.sessionRepository, this.this$0.cleanupDirectory, this.this$0.alternativeFlowReader)));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x016c: INVOKE (r8 I:kotlinx.coroutines.sync.Mutex), (r7 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:365), block:B:64:0x016c */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:42:0x00e0, B:44:0x00e4, B:49:0x00ef, B:51:0x010c, B:61:0x015f, B:24:0x0071, B:27:0x0081, B:29:0x0099, B:35:0x00a7, B:37:0x00b7, B:38:0x00c2, B:53:0x0127, B:55:0x0134, B:57:0x013a, B:59:0x0140, B:60:0x0158), top: B:66:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:42:0x00e0, B:44:0x00e4, B:49:0x00ef, B:51:0x010c, B:61:0x015f, B:24:0x0071, B:27:0x0081, B:29:0x0099, B:35:0x00a7, B:37:0x00b7, B:38:0x00c2, B:53:0x0127, B:55:0x0134, B:57:0x013a, B:59:0x0140, B:60:0x0158), top: B:66:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(boolean r19, zu.d<? super com.unity3d.services.core.network.core.HttpClient> r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(boolean, zu.d):java.lang.Object");
    }
}
