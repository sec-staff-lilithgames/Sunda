package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.C3191e4;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b3 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f26351a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f26353c;

    public b3(e3 e3Var, Map.Entry entry) {
        Comparable comparable = (Comparable) entry.getKey();
        Object value = entry.getValue();
        this.f26353c = e3Var;
        this.f26351a = comparable;
        this.f26352b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f26351a.compareTo(((b3) obj).f26351a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f26351a;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f26352b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26351a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26352b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f26351a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f26352b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f26353c.a();
        Object obj2 = this.f26352b;
        this.f26352b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f26351a + C3191e4.i.f36525b + this.f26352b;
    }

    public b3(e3 e3Var, Comparable comparable, Object obj) {
        this.f26353c = e3Var;
        this.f26351a = comparable;
        this.f26352b = obj;
    }
}
