package c5;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import tu.u;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final b asCloseable(CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        return new b(coroutineScope);
    }

    public static final b createViewModelScope() {
        m immediate = n.f98854b;
        try {
            immediate = Dispatchers.getMain().getImmediate();
        } catch (IllegalStateException | u unused) {
        }
        return new b(immediate.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }
}
