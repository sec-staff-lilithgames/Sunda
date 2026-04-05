package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigFileFromLocalStorage extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Params implements BaseParams {
        private final Configuration defaultConfiguration;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }

        public Params(Configuration defaultConfiguration) {
            e0.checkNotNullParameter(defaultConfiguration, "defaultConfiguration");
            this.defaultConfiguration = defaultConfiguration;
        }

        public /* synthetic */ Params(Configuration configuration, int i10, u uVar) {
            this((i10 & 1) != 0 ? new Configuration() : configuration);
        }
    }

    public ConfigFileFromLocalStorage(ISDKDispatchers dispatchers) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo3512doWorkgIAlus(BaseParams baseParams, d dVar) {
        return m3515doWorkgIAlus((Params) baseParams, (d<? super z>) dVar);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_config");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: doWork-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m3515doWorkgIAlus(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params r6, zu.d<? super tu.z> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1 r0 = (com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1 r0 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1
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
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.getIo()
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2 r2 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.m3515doWorkgIAlus(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$Params, zu.d):java.lang.Object");
    }
}
