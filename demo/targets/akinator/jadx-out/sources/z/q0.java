package z;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements Map.Entry, lv.f {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f96902b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f96903c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96904e;

    public q0(Object[] keys, Object[] values, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
        this.f96902b = keys;
        this.f96903c = values;
        this.f96904e = i10;
    }

    public final int getIndex() {
        return this.f96904e;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f96902b[this.f96904e];
    }

    public final Object[] getKeys() {
        return this.f96902b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f96903c[this.f96904e];
    }

    public final Object[] getValues() {
        return this.f96903c;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Object[] objArr = this.f96903c;
        int i10 = this.f96904e;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
