package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final c5.f f6599a = new c5.f();

    public static final CoroutineScope getViewModelScope(g3 g3Var) {
        c5.b bVarCreateViewModelScope;
        kotlin.jvm.internal.e0.checkNotNullParameter(g3Var, "<this>");
        synchronized (f6599a) {
            bVarCreateViewModelScope = (c5.b) g3Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bVarCreateViewModelScope == null) {
                bVarCreateViewModelScope = c5.c.createViewModelScope();
                g3Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bVarCreateViewModelScope);
            }
        }
        return bVarCreateViewModelScope;
    }
}
