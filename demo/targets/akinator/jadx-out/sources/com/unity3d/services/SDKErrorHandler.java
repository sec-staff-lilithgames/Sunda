package com.unity3d.services;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kv.p;
import tu.a0;
import tu.e0;
import tu.x0;
import uu.p1;
import zu.d;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SDKErrorHandler implements CoroutineExceptionHandler {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final CoroutineDispatcher ioDispatcher;
    private final CoroutineExceptionHandler.Key key;
    private final CoroutineScope scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.SDKErrorHandler$sendDiagnostic$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ String $name;
        final /* synthetic */ String $reason;
        final /* synthetic */ String $scopeName;
        final /* synthetic */ String $stackTrace;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return SDKErrorHandler.this.new AnonymousClass1(this.$name, this.$reason, this.$stackTrace, this.$scopeName, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            SendDiagnosticEvent.DefaultImpls.invoke$default(SDKErrorHandler.this.sendDiagnosticEvent, this.$name, null, p1.mapOf(e0.to("reason", this.$reason), e0.to("reason_debug", this.$stackTrace), e0.to("coroutine_name", this.$scopeName)), null, null, null, 58, null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public SDKErrorHandler(CoroutineDispatcher ioDispatcher, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sdkMetricsSender) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        kotlin.jvm.internal.e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = ioDispatcher;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        this.scope = CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(ioDispatcher), new CoroutineName("SDKErrorHandler"));
        this.key = CoroutineExceptionHandler.Key;
    }

    private final String retrieveCoroutineName(m mVar) {
        String name;
        CoroutineName coroutineName = (CoroutineName) mVar.get(CoroutineName.Key);
        return (coroutineName == null || (name = coroutineName.getName()) == null) ? "unknown" : name;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(str, str2, str4, str3, null), 3, null);
    }

    private final void sendMetric(Metric metric2) {
        this.sdkMetricsSender.sendMetric(metric2);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public <R> R fold(R r10, p pVar) {
        return (R) CoroutineExceptionHandler.DefaultImpls.fold(this, r10, pVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public <E extends k> E get(l lVar) {
        return (E) CoroutineExceptionHandler.DefaultImpls.get(this, lVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(m context, Throwable exception) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(exception, "exception");
        String strRetrieveCoroutineName = retrieveCoroutineName(context);
        String str = exception instanceof NullPointerException ? "native_exception_npe" : exception instanceof OutOfMemoryError ? "native_exception_oom" : exception instanceof IllegalStateException ? "native_exception_ise" : exception instanceof SecurityException ? "native_exception_se" : exception instanceof RuntimeException ? "native_exception_re" : "native_exception";
        boolean zInvoke = this.alternativeFlowReader.invoke();
        String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(exception);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
        if (zInvoke) {
            sendDiagnostic(str, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(exception, 15));
        } else {
            sendMetric(new Metric(str, strRetrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public m minusKey(l lVar) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, lVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public m plus(m mVar) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, mVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k
    public CoroutineExceptionHandler.Key getKey() {
        return this.key;
    }
}
