package b5;

import androidx.lifecycle.g3;
import androidx.lifecycle.l3;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static final <VM extends g3> VM createViewModel(l3 factory, KClass<VM> modelClass, a extras) {
        e0.checkNotNullParameter(factory, "factory");
        e0.checkNotNullParameter(modelClass, "modelClass");
        e0.checkNotNullParameter(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(jv.a.getJavaClass((KClass) modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(jv.a.getJavaClass((KClass) modelClass), extras);
        }
    }
}
