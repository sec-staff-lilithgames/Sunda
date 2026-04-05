package kotlinx.coroutines.debug.internal;

import gv.c;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.jvm.internal.e0;
import sun.misc.Signal;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AgentPremain {
    public static final AgentPremain INSTANCE = new AgentPremain();
    private static final boolean enableCreationStackTraces;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DebugProbesTransformer implements ClassFileTransformer {
        public static final DebugProbesTransformer INSTANCE = new DebugProbesTransformer();

        private DebugProbesTransformer() {
        }

        public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
            if (classLoader == null || !e0.areEqual(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
            return c.readBytes(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objM7131constructorimpl = z.m7131constructorimpl(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Boolean bool = (Boolean) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        enableCreationStackTraces = bool != null ? bool.booleanValue() : DebugProbesImpl.INSTANCE.getEnableCreationStackTraces$kotlinx_coroutines_core();
    }

    private AgentPremain() {
    }

    private final void installSignalHandler() {
        try {
            Signal.handle(new Signal("TRAP"), new a());
        } catch (Throwable unused) {
        }
    }

    private static final void installSignalHandler$lambda$1(Signal signal) {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        if (debugProbesImpl.isInstalled$kotlinx_coroutines_debug()) {
            debugProbesImpl.dumpCoroutines(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    public static final void premain(String str, Instrumentation instrumentation) {
        AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation.addTransformer(DebugProbesTransformer.INSTANCE);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        debugProbesImpl.setEnableCreationStackTraces$kotlinx_coroutines_core(enableCreationStackTraces);
        debugProbesImpl.install$kotlinx_coroutines_core();
        INSTANCE.installSignalHandler();
    }
}
