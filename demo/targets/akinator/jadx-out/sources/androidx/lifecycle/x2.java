package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.j3;
import java.lang.reflect.Constructor;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 extends j3.d implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f6739a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.a f6740b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f6741c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f6742d;

    /* renamed from: e, reason: collision with root package name */
    public final v5.h f6743e;

    public x2() {
        this.f6740b = new j3.a();
    }

    @Override // androidx.lifecycle.l3
    public <T extends g3> T create(KClass<T> modelClass, b5.a extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        return (T) create(jv.a.getJavaClass((KClass) modelClass), extras);
    }

    @Override // androidx.lifecycle.j3.d
    public void onRequery(g3 viewModel) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModel, "viewModel");
        k0 k0Var = this.f6742d;
        if (k0Var != null) {
            v5.h hVar = this.f6743e;
            kotlin.jvm.internal.e0.checkNotNull(hVar);
            kotlin.jvm.internal.e0.checkNotNull(k0Var);
            d0.attachHandleIfNeeded(viewModel, hVar, k0Var);
        }
    }

    @Override // androidx.lifecycle.l3
    public <T extends g3> T create(Class<T> modelClass, b5.a extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        String str = (String) extras.get(j3.f6624c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.get(t2.f6710a) == null || extras.get(t2.f6711b) == null) {
            if (this.f6742d != null) {
                return (T) create(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.get(j3.a.f6628f);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || application == null) ? y2.findMatchingConstructor(modelClass, y2.f6748b) : y2.findMatchingConstructor(modelClass, y2.f6747a);
        return constructorFindMatchingConstructor == null ? (T) this.f6740b.create(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) y2.newInstance(modelClass, constructorFindMatchingConstructor, t2.createSavedStateHandle(extras)) : (T) y2.newInstance(modelClass, constructorFindMatchingConstructor, application, t2.createSavedStateHandle(extras));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x2(Application application, v5.j owner) {
        this(application, owner, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
    }

    public x2(Application application, v5.j owner, Bundle bundle) {
        j3.a aVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        this.f6743e = owner.getSavedStateRegistry();
        this.f6742d = owner.getLifecycle();
        this.f6741c = bundle;
        this.f6739a = application;
        if (application != null) {
            aVar = j3.a.f6626d.getInstance(application);
        } else {
            aVar = new j3.a();
        }
        this.f6740b = aVar;
    }

    public final <T extends g3> T create(String key, Class<T> modelClass) throws NoSuchMethodException, SecurityException {
        T t10;
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        k0 k0Var = this.f6742d;
        if (k0Var != null) {
            boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
            Application application = this.f6739a;
            Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || application == null) ? y2.findMatchingConstructor(modelClass, y2.f6748b) : y2.findMatchingConstructor(modelClass, y2.f6747a);
            if (constructorFindMatchingConstructor == null) {
                if (application != null) {
                    return (T) this.f6740b.create(modelClass);
                }
                return (T) j3.c.f6630a.getInstance().create(modelClass);
            }
            v5.h hVar = this.f6743e;
            kotlin.jvm.internal.e0.checkNotNull(hVar);
            o2 o2VarCreate = d0.create(hVar, k0Var, key, this.f6741c);
            if (zIsAssignableFrom && application != null) {
                kotlin.jvm.internal.e0.checkNotNull(application);
                t10 = (T) y2.newInstance(modelClass, constructorFindMatchingConstructor, application, o2VarCreate.getHandle());
            } else {
                t10 = (T) y2.newInstance(modelClass, constructorFindMatchingConstructor, o2VarCreate.getHandle());
            }
            t10.addCloseable("androidx.lifecycle.savedstate.vm.tag", o2VarCreate);
            return t10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.l3
    public <T extends g3> T create(Class<T> modelClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
