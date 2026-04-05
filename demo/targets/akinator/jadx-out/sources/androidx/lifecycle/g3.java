package androidx.lifecycle;

import java.io.Closeable;
import java.util.Arrays;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g3 {
    private final c5.g impl;

    public g3() {
        this.impl = new c5.g();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(closeable, "closeable");
        c5.g gVar = this.impl;
        if (gVar != null) {
            gVar.addCloseable(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        c5.g gVar = this.impl;
        if (gVar != null) {
            gVar.clear();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        c5.g gVar = this.impl;
        if (gVar != null) {
            return (T) gVar.getCloseable(key);
        }
        return null;
    }

    public void addCloseable(AutoCloseable closeable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(closeable, "closeable");
        c5.g gVar = this.impl;
        if (gVar != null) {
            gVar.addCloseable(closeable);
        }
    }

    public g3(CoroutineScope viewModelScope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.impl = new c5.g(viewModelScope);
    }

    @tu.f
    public /* synthetic */ void addCloseable(Closeable closeable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(closeable, "closeable");
        c5.g gVar = this.impl;
        if (gVar != null) {
            gVar.addCloseable(closeable);
        }
    }

    public g3(AutoCloseable... closeables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(closeables, "closeables");
        this.impl = new c5.g((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public g3(CoroutineScope viewModelScope, AutoCloseable... closeables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModelScope, "viewModelScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(closeables, "closeables");
        this.impl = new c5.g(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @tu.f
    public /* synthetic */ g3(Closeable... closeables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(closeables, "closeables");
        this.impl = new c5.g((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public void onCleared() {
    }
}
