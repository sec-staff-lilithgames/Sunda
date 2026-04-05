package n6;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements t0 {
    @Override // n6.t0
    public void beginAsyncSection(String methodName, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(methodName, "methodName");
        d6.a.beginAsyncSection(methodName, i10);
    }

    @Override // n6.t0
    public void beginSection(String label) {
        kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
        d6.a.beginSection(label);
    }

    @Override // n6.t0
    public void endAsyncSection(String methodName, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.e0.checkNotNullParameter(methodName, "methodName");
        d6.a.endAsyncSection(methodName, i10);
    }

    @Override // n6.t0
    public void endSection() {
        d6.a.endSection();
    }

    @Override // n6.t0
    public boolean isEnabled() {
        return d6.a.isEnabled();
    }
}
