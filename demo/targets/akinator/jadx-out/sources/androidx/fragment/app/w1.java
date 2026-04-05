package androidx.fragment.app;

import androidx.lifecycle.g3;
import androidx.lifecycle.l3;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 implements l3 {
    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(Class cls, b5.a aVar) {
        return super.create(cls, aVar);
    }

    @Override // androidx.lifecycle.l3
    public /* bridge */ /* synthetic */ g3 create(KClass kClass, b5.a aVar) {
        return super.create(kClass, aVar);
    }

    @Override // androidx.lifecycle.l3
    public <T extends g3> T create(Class<T> cls) {
        return new x1(true);
    }
}
