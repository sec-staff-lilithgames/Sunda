package c5;

import androidx.lifecycle.g3;
import androidx.lifecycle.l3;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f11806a = new d();

    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(Class cls) {
        return super.create(cls);
    }

    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(Class cls, b5.a aVar) {
        return super.create(cls, aVar);
    }

    @Override // androidx.lifecycle.l3
    public <T extends g3> T create(KClass<T> modelClass, b5.a extras) {
        e0.checkNotNullParameter(modelClass, "modelClass");
        e0.checkNotNullParameter(extras, "extras");
        return (T) e.f11807a.createViewModel(jv.a.getJavaClass((KClass) modelClass));
    }
}
