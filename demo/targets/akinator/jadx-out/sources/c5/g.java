package c5;

import b0.e2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f11808a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f11809b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f11810c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f11811d;

    public g() {
        this.f11808a = new f();
        this.f11809b = new LinkedHashMap();
        this.f11810c = new LinkedHashSet();
    }

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                e2.x(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final /* synthetic */ void access$closeWithRuntimeException(g gVar, AutoCloseable autoCloseable) {
        gVar.getClass();
        a(autoCloseable);
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(closeable, "closeable");
        if (this.f11811d) {
            a(closeable);
            return;
        }
        synchronized (this.f11808a) {
            autoCloseable = (AutoCloseable) this.f11809b.put(key, closeable);
        }
        a(autoCloseable);
    }

    public final void clear() {
        if (this.f11811d) {
            return;
        }
        this.f11811d = true;
        synchronized (this.f11808a) {
            try {
                Iterator it = this.f11809b.values().iterator();
                while (it.hasNext()) {
                    access$closeWithRuntimeException(this, (AutoCloseable) it.next());
                }
                Iterator it2 = this.f11810c.iterator();
                while (it2.hasNext()) {
                    access$closeWithRuntimeException(this, (AutoCloseable) it2.next());
                }
                this.f11810c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t10;
        e0.checkNotNullParameter(key, "key");
        synchronized (this.f11808a) {
            t10 = (T) this.f11809b.get(key);
        }
        return t10;
    }

    public g(CoroutineScope viewModelScope) {
        e0.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.f11808a = new f();
        this.f11809b = new LinkedHashMap();
        this.f11810c = new LinkedHashSet();
        addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c.asCloseable(viewModelScope));
    }

    public final void addCloseable(AutoCloseable closeable) {
        e0.checkNotNullParameter(closeable, "closeable");
        if (this.f11811d) {
            a(closeable);
            return;
        }
        synchronized (this.f11808a) {
            this.f11810c.add(closeable);
        }
    }

    public g(AutoCloseable... closeables) {
        e0.checkNotNullParameter(closeables, "closeables");
        this.f11808a = new f();
        this.f11809b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f11810c = linkedHashSet;
        v0.addAll(linkedHashSet, closeables);
    }

    public g(CoroutineScope viewModelScope, AutoCloseable... closeables) {
        e0.checkNotNullParameter(viewModelScope, "viewModelScope");
        e0.checkNotNullParameter(closeables, "closeables");
        this.f11808a = new f();
        this.f11809b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f11810c = linkedHashSet;
        addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c.asCloseable(viewModelScope));
        v0.addAll(linkedHashSet, closeables);
    }
}
