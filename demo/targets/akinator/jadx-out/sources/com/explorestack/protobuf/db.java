package com.explorestack.protobuf;

import com.ironsource.C3191e4;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class db implements Map.Entry, Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f22061b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22062c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gb f22063e;

    public db(gb gbVar, Comparable comparable, Object obj) {
        this.f22063e = gbVar;
        this.f22061b = comparable;
        this.f22062c = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f22061b;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f22062c;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f22062c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Comparable comparable = this.f22061b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22062c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.f22063e.b();
        Object obj2 = this.f22062c;
        this.f22062c = obj;
        return obj2;
    }

    public String toString() {
        return this.f22061b + C3191e4.i.f36525b + this.f22062c;
    }

    @Override // java.lang.Comparable
    public int compareTo(db dbVar) {
        return getKey().compareTo(dbVar.getKey());
    }

    @Override // java.util.Map.Entry
    public Comparable<Object> getKey() {
        return this.f22061b;
    }
}
