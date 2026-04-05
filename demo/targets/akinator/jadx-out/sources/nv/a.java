package nv;

import kotlin.jvm.internal.e0;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements c {
    private Object value;

    public a(Object obj) {
        this.value = obj;
    }

    public void afterChange(KProperty property, Object obj, Object obj2) {
        e0.checkNotNullParameter(property, "property");
    }

    public boolean beforeChange(KProperty<?> property, Object obj, Object obj2) {
        e0.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // nv.c, nv.b
    public Object getValue(Object obj, KProperty<?> property) {
        e0.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // nv.c
    public void setValue(Object obj, KProperty<?> property, Object obj2) {
        e0.checkNotNullParameter(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
