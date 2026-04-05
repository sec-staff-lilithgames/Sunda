package io.ktor.util.debug;

import java.lang.management.ManagementFactory;
import kotlin.jvm.internal.f0;
import kv.a;
import sv.n0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IntellijIdeaDebugDetector {
    public static final IntellijIdeaDebugDetector INSTANCE = new IntellijIdeaDebugDetector();
    private static final o isDebuggerConnected$delegate = q.lazy(AnonymousClass2.INSTANCE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.debug.IntellijIdeaDebugDetector$isDebuggerConnected$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kv.a
        public final Boolean invoke() {
            boolean zContains$default = false;
            try {
                zContains$default = n0.contains$default((CharSequence) ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), (CharSequence) "jdwp", false, 2, (Object) null);
            } catch (Throwable unused) {
            }
            return Boolean.valueOf(zContains$default);
        }
    }

    private IntellijIdeaDebugDetector() {
    }

    public final boolean isDebuggerConnected() {
        return ((Boolean) isDebuggerConnected$delegate.getValue()).booleanValue();
    }
}
