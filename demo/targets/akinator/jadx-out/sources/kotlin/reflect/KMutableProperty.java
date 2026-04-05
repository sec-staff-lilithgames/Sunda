package kotlin.reflect;

import kotlin.reflect.KProperty;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KMutableProperty<V> extends KProperty<V> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Setter<V> extends KProperty.Accessor<V>, KFunction<x0> {
    }

    Setter<V> getSetter();
}
