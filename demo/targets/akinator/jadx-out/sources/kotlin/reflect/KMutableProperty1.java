package kotlin.reflect;

import kotlin.reflect.KMutableProperty;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KMutableProperty<V> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Setter<T, V> extends KMutableProperty.Setter<V>, p {
        @Override // kv.p
        /* synthetic */ Object invoke(Object obj, Object obj2);
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<T, V> getSetter();

    @Override // kotlin.reflect.KProperty1, kv.l
    /* synthetic */ Object invoke(Object obj);

    void set(T t10, V v10);
}
