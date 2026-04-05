package androidx.lifecycle;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements c6.b {
    @Override // c6.b
    public List<Class<? extends c6.b>> dependencies() {
        return uu.p0.emptyList();
    }

    @Override // c6.b
    public b1 create(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        c6.a aVar = c6.a.getInstance(context);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(aVar, "getInstance(...)");
        if (!aVar.isEagerlyInitialized(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        u0.init(context);
        a2 a2Var = b2.f6515k;
        a2Var.init$lifecycle_process_release(context);
        return a2Var.get();
    }
}
