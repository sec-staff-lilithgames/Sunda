package kotlin.reflect;

import kotlin.reflect.KProperty;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KProperty1<T, V> extends KProperty<V>, l {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Getter<T, V> extends KProperty.Getter<V>, l {
        @Override // kv.l
        /* synthetic */ Object invoke(Object obj);
    }

    V get(T t10);

    Object getDelegate(T t10);

    @Override // kotlin.reflect.KProperty
    Getter<T, V> getGetter();

    @Override // kv.l
    /* synthetic */ Object invoke(Object obj);
}
