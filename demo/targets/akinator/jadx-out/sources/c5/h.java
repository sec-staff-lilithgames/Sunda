package c5;

import androidx.lifecycle.a0;
import androidx.lifecycle.g3;
import androidx.lifecycle.l3;
import androidx.lifecycle.n3;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11812a = new h();

    public final l3 createInitializerFactory$lifecycle_viewmodel_release(Collection<? extends b5.f> initializers) {
        e0.checkNotNullParameter(initializers, "initializers");
        b5.f[] fVarArr = (b5.f[]) initializers.toArray(new b5.f[0]);
        return new b5.d((b5.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public final <VM extends g3> VM createViewModelFromInitializers$lifecycle_viewmodel_release(KClass<VM> modelClass, b5.a extras, b5.f... initializers) {
        VM vm2;
        b5.f fVar;
        l initializer$lifecycle_viewmodel_release;
        e0.checkNotNullParameter(modelClass, "modelClass");
        e0.checkNotNullParameter(extras, "extras");
        e0.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            vm2 = null;
            if (i10 >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i10];
            if (e0.areEqual(fVar.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                break;
            }
            i10++;
        }
        if (fVar != null && (initializer$lifecycle_viewmodel_release = fVar.getInitializer$lifecycle_viewmodel_release()) != null) {
            vm2 = (VM) initializer$lifecycle_viewmodel_release.invoke(extras);
        }
        if (vm2 != null) {
            return vm2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a.getCanonicalName(modelClass)).toString());
    }

    public final b5.a getDefaultCreationExtras$lifecycle_viewmodel_release(n3 owner) {
        e0.checkNotNullParameter(owner, "owner");
        return owner instanceof a0 ? ((a0) owner).getDefaultViewModelCreationExtras() : b5.b.f8750c;
    }

    public final l3 getDefaultFactory$lifecycle_viewmodel_release(n3 owner) {
        e0.checkNotNullParameter(owner, "owner");
        return owner instanceof a0 ? ((a0) owner).getDefaultViewModelProviderFactory() : d.f11806a;
    }

    public final <T extends g3> String getDefaultKey$lifecycle_viewmodel_release(KClass<T> modelClass) {
        e0.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = a.getCanonicalName(modelClass);
        if (canonicalName != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <VM extends g3> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final l3 createInitializerFactory$lifecycle_viewmodel_release(b5.f... initializers) {
        e0.checkNotNullParameter(initializers, "initializers");
        return new b5.d((b5.f[]) Arrays.copyOf(initializers, initializers.length));
    }
}
