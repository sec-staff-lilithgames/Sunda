package androidx.lifecycle;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 implements l3 {
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
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        return new w2();
    }
}
