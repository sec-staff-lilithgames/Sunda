package kotlin.reflect;

import kotlin.reflect.KProperty;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KProperty2<D, E, V> extends KProperty<V>, p {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Getter<D, E, V> extends KProperty.Getter<V>, p {
        @Override // kv.p
        /* synthetic */ Object invoke(Object obj, Object obj2);
    }

    V get(D d10, E e10);

    Object getDelegate(D d10, E e10);

    @Override // kotlin.reflect.KProperty
    Getter<D, E, V> getGetter();

    @Override // kv.p
    /* synthetic */ Object invoke(Object obj, Object obj2);
}
