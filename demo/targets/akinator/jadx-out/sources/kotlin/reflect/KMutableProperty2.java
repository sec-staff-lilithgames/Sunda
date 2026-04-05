package kotlin.reflect;

import kotlin.reflect.KMutableProperty;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KMutableProperty2<D, E, V> extends KProperty2<D, E, V>, KMutableProperty<V> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Setter<D, E, V> extends KMutableProperty.Setter<V>, q {
        @Override // kv.q
        /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3);
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<D, E, V> getSetter();

    @Override // kotlin.reflect.KProperty2, kv.p
    /* synthetic */ Object invoke(Object obj, Object obj2);

    void set(D d10, E e10, V v10);
}
