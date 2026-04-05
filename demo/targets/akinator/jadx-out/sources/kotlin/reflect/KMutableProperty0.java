package kotlin.reflect;

import kotlin.reflect.KMutableProperty;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Setter<V> extends KMutableProperty.Setter<V>, l {
        @Override // kv.l
        /* synthetic */ Object invoke(Object obj);
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<V> getSetter();

    @Override // kotlin.reflect.KProperty0, kv.a
    /* synthetic */ Object invoke();

    void set(V v10);
}
