package b5;

import androidx.lifecycle.g3;
import androidx.lifecycle.l3;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f8751a;

    public d(f... initializers) {
        e0.checkNotNullParameter(initializers, "initializers");
        this.f8751a = initializers;
    }

    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(Class cls) {
        return super.create(cls);
    }

    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(KClass kClass, a aVar) {
        return super.create(kClass, aVar);
    }

    @Override // androidx.lifecycle.l3
    public <VM extends g3> VM create(Class<VM> modelClass, a extras) {
        e0.checkNotNullParameter(modelClass, "modelClass");
        e0.checkNotNullParameter(extras, "extras");
        KClass<VM> kotlinClass = jv.a.getKotlinClass(modelClass);
        f[] fVarArr = this.f8751a;
        return (VM) c5.h.f11812a.createViewModelFromInitializers$lifecycle_viewmodel_release(kotlinClass, extras, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
