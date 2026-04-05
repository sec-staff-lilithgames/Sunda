package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.jvm.internal.e0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InitializeStateError extends MetricTask<Params, x0> {
    private final ISDKDispatchers dispatchers;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Params implements BaseParams {
        private final Configuration config;
        private final ErrorState errorState;
        private final Exception exception;

        public Params(ErrorState errorState, Exception exception, Configuration config) {
            e0.checkNotNullParameter(errorState, "errorState");
            e0.checkNotNullParameter(exception, "exception");
            e0.checkNotNullParameter(config, "config");
            this.errorState = errorState;
            this.exception = exception;
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, ErrorState errorState, Exception exc, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = params.errorState;
            }
            if ((i10 & 2) != 0) {
                exc = params.exception;
            }
            if ((i10 & 4) != 0) {
                configuration = params.config;
            }
            return params.copy(errorState, exc, configuration);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Exception component2() {
            return this.exception;
        }

        public final Configuration component3() {
            return this.config;
        }

        public final Params copy(ErrorState errorState, Exception exception, Configuration config) {
            e0.checkNotNullParameter(errorState, "errorState");
            e0.checkNotNullParameter(exception, "exception");
            e0.checkNotNullParameter(config, "config");
            return new Params(errorState, exception, config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.errorState == params.errorState && e0.areEqual(this.exception, params.exception) && e0.areEqual(this.config, params.config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.config.hashCode() + ((this.exception.hashCode() + (this.errorState.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Params(errorState=" + this.errorState + ", exception=" + this.exception + ", config=" + this.config + ')';
        }
    }

    public InitializeStateError(ISDKDispatchers dispatchers) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo3512doWorkgIAlus(BaseParams baseParams, d dVar) {
        return m3524doWorkgIAlus((Params) baseParams, (d<? super z>) dVar);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("error");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: doWork-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m3524doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateError.Params r6, zu.d<? super tu.z> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateError$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateError$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateError$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateError$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateError$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            tu.a0.throwOnFailure(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateError$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateError$doWork$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            tu.z r7 = (tu.z) r7
            java.lang.Object r6 = r7.m7139unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateError.m3524doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateError$Params, zu.d):java.lang.Object");
    }
}
