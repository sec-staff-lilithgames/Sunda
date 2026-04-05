package b5;

import androidx.lifecycle.g3;
import androidx.lifecycle.j3;
import androidx.lifecycle.l3;
import androidx.lifecycle.m3;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final m3 f8754a;

    /* renamed from: b, reason: collision with root package name */
    public final l3 f8755b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8756c;

    /* renamed from: d, reason: collision with root package name */
    public final c5.f f8757d;

    public g(m3 store, l3 factory, a defaultExtras) {
        e0.checkNotNullParameter(store, "store");
        e0.checkNotNullParameter(factory, "factory");
        e0.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f8754a = store;
        this.f8755b = factory;
        this.f8756c = defaultExtras;
        this.f8757d = new c5.f();
    }

    public static /* synthetic */ g3 getViewModel$lifecycle_viewmodel_release$default(g gVar, KClass kClass, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = c5.h.f11812a.getDefaultKey$lifecycle_viewmodel_release(kClass);
        }
        return gVar.getViewModel$lifecycle_viewmodel_release(kClass, str);
    }

    public final <T extends g3> T getViewModel$lifecycle_viewmodel_release(KClass<T> modelClass, String key) {
        T t10;
        e0.checkNotNullParameter(modelClass, "modelClass");
        e0.checkNotNullParameter(key, "key");
        synchronized (this.f8757d) {
            try {
                t10 = (T) this.f8754a.get(key);
                if (modelClass.isInstance(t10)) {
                    if (this.f8755b instanceof j3.d) {
                        j3.d dVar = (j3.d) this.f8755b;
                        e0.checkNotNull(t10);
                        dVar.onRequery(t10);
                    }
                    e0.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    e eVar = new e(this.f8756c);
                    eVar.set(j3.f6624c, key);
                    t10 = (T) h.createViewModel(this.f8755b, modelClass, eVar);
                    this.f8754a.put(key, t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
