package kotlin.reflect;

import kotlin.reflect.KProperty;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KProperty0<V> extends KProperty<V>, a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Getter<V> extends KProperty.Getter<V>, a {
        @Override // kv.a
        /* synthetic */ Object invoke();
    }

    V get();

    Object getDelegate();

    @Override // kotlin.reflect.KProperty
    Getter<V> getGetter();

    @Override // kv.a
    /* synthetic */ Object invoke();
}
