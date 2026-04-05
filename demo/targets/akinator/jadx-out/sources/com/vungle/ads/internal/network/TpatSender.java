package com.vungle.ads.internal.network;

import be.nVUQ.UupKET;
import com.applovin.impl.aa;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import j1.o2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import sv.x;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TpatSender {
    public static final Companion Companion = new Companion(null);
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final String TAG = "TpatSender";
    private final Executor jobExecutor;
    private final SignalManager signalManager;
    private final FilePreferences tpatFilePreferences;
    private final Object tpatLock;
    private final VungleApiClient vungleApiClient;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public TpatSender(VungleApiClient vungleApiClient, Executor ioExecutor, Executor jobExecutor, PathProvider pathProvider, SignalManager signalManager) {
        e0.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        e0.checkNotNullParameter(ioExecutor, "ioExecutor");
        e0.checkNotNullParameter(jobExecutor, "jobExecutor");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = signalManager;
        this.tpatFilePreferences = FilePreferences.Companion.get(ioExecutor, pathProvider, FilePreferences.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, FailedTpat> getStoredTpats() {
        Object objM7131constructorimpl;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                int i10 = z.f87419c;
                Json.Default r12 = Json.Default;
                SerializersModule serializersModule = r12.getSerializersModule();
                KTypeProjection.Companion companion = KTypeProjection.Companion;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, c1.mutableCollectionType(c1.typeOf(Map.class, companion.invariant(c1.typeOf(String.class)), companion.invariant(c1.typeOf(FailedTpat.class)))));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objM7131constructorimpl = z.m7131constructorimpl((Map) r12.decodeFromString(kSerializerSerializer, string));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            if (thM7134exceptionOrNullimpl != null) {
                Logger.Companion.e(TAG, "Failed to decode stored tpats: " + thM7134exceptionOrNullimpl);
            }
            if (z.m7134exceptionOrNullimpl(objM7131constructorimpl) != null) {
                objM7131constructorimpl = new LinkedHashMap();
            }
            Map<String, FailedTpat> map = (Map) objM7131constructorimpl;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final boolean isPriorityTpat(String str) {
        return e0.areEqual(str, Constants.CHECKPOINT_0) || e0.areEqual(str, Constants.CLICK_URL) || e0.areEqual(str, "impression") || e0.areEqual(str, Constants.LOAD_AD);
    }

    private final void logTpatError(TpatRequest tpatRequest, String str, ErrorInfo errorInfo, Sdk.SDKError.Reason reason) {
        StringBuilder sb2 = new StringBuilder("tpat key: ");
        sb2.append(tpatRequest.getTpatKey());
        sb2.append(", error: ");
        sb2.append(errorInfo.getDescription());
        sb2.append(", errorIsTerminal: ");
        sb2.append(errorInfo.getErrorIsTerminal());
        String strO = o2.o(sb2, " url: ", str);
        Logger.Companion.e(TAG, strO);
        new TpatError(reason, strO).setLogEntry$vungle_ads_release(tpatRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final ErrorInfo performPriorityRetry(TpatRequest tpatRequest, String str) {
        String str2;
        ErrorInfo errorInfoPingTPAT;
        Boolean priorityRetry = tpatRequest.getPriorityRetry();
        int i10 = 0;
        boolean z10 = ConfigManager.INSTANCE.retryPriorityTPATs() && (priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(tpatRequest.getTpatKey()));
        while (true) {
            str2 = str;
            errorInfoPingTPAT = this.vungleApiClient.pingTPAT(str2, tpatRequest.getHeaders(), tpatRequest.getBody(), tpatRequest.getMethod(), tpatRequest.getLogEntry());
            if (!z10 || errorInfoPingTPAT == null || !errorInfoPingTPAT.isRetryCode() || (i10 = i10 + 1) >= tpatRequest.getPriorityRetryCount()) {
                break;
            }
            str = str2;
        }
        if (errorInfoPingTPAT != null) {
            logTpatError(tpatRequest, str2, errorInfoPingTPAT, i10 >= tpatRequest.getPriorityRetryCount() ? Sdk.SDKError.Reason.TPAT_RETRY_FAILED : Sdk.SDKError.Reason.TPAT_ERROR);
        }
        return errorInfoPingTPAT;
    }

    public static /* synthetic */ void sendTpat$default(TpatSender tpatSender, TpatRequest tpatRequest, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        tpatSender.sendTpat(tpatRequest, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m3620sendTpat$lambda1(TpatSender this$0, TpatRequest request, String urlWithSessionId, boolean z10) {
        FailedTpat failedTpat;
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(request, "$request");
        e0.checkNotNullParameter(urlWithSessionId, "$urlWithSessionId");
        ErrorInfo errorInfoPerformPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (errorInfoPerformPriorityRetry == null || !errorInfoPerformPriorityRetry.getErrorIsTerminal()) {
                if (errorInfoPerformPriorityRetry != null || z10) {
                    synchronized (this$0.tpatLock) {
                        try {
                            Map<String, FailedTpat> storedTpats = this$0.getStoredTpats();
                            FailedTpat failedTpat2 = storedTpats.get(request.getUrl());
                            int retryAttempt = failedTpat2 != null ? failedTpat2.getRetryAttempt() : 0;
                            if (errorInfoPerformPriorityRetry == null && retryAttempt > 0) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                            } else if (errorInfoPerformPriorityRetry != null && retryAttempt >= request.getRegularRetryCount()) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                                this$0.logTpatError(request, urlWithSessionId, errorInfoPerformPriorityRetry, Sdk.SDKError.Reason.TPAT_RETRY_FAILED);
                            } else if (errorInfoPerformPriorityRetry != null) {
                                FailedTpat failedTpat3 = storedTpats.get(request.getUrl());
                                if (failedTpat3 == null || (failedTpat = FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                                    failedTpat = new FailedTpat(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                                }
                                storedTpats.put(request.getUrl(), failedTpat);
                                this$0.saveStoredTpats(storedTpats);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final Executor getJobExecutor() {
        return this.jobExecutor;
    }

    public final SignalManager getSignalManager() {
        return this.signalManager;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final String injectSessionIdToUrl(String url) {
        e0.checkNotNullParameter(url, "url");
        SignalManager signalManager = this.signalManager;
        String uuid = signalManager != null ? signalManager.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        String strQuote = Pattern.quote(Constants.SESSION_ID);
        e0.checkNotNullExpressionValue(strQuote, "quote(Constants.SESSION_ID)");
        return new x(strQuote).replace(url, uuid);
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, FailedTpat> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            FailedTpat value = entry.getValue();
            sendTpat(new TpatRequest.Builder(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final void sendTpat(TpatRequest request, boolean z10) {
        e0.checkNotNullParameter(request, "request");
        this.jobExecutor.execute(new aa(this, request, injectSessionIdToUrl(request.getUrl()), z10));
    }

    private final void saveStoredTpats(Map<String, FailedTpat> map) {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            FilePreferences filePreferences = this.tpatFilePreferences;
            Json.Default r22 = Json.Default;
            SerializersModule serializersModule = r22.getSerializersModule();
            KTypeProjection.Companion companion = KTypeProjection.Companion;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, c1.mutableCollectionType(c1.typeOf(Map.class, companion.invariant(c1.typeOf(String.class)), companion.invariant(c1.typeOf(FailedTpat.class)))));
            e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(FAILED_TPATS, r22.encodeToString(kSerializerSerializer, map)).apply();
            objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7134exceptionOrNullimpl(objM7131constructorimpl) != null) {
            Logger.Companion.e(TAG, UupKET.ADShEWVrYfS + map);
        }
    }

    public /* synthetic */ TpatSender(VungleApiClient vungleApiClient, Executor executor, Executor executor2, PathProvider pathProvider, SignalManager signalManager, int i10, u uVar) {
        this(vungleApiClient, executor, executor2, pathProvider, (i10 & 16) != 0 ? null : signalManager);
    }
}
