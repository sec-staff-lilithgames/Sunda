package com.moloco.sdk.acm;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f45546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45547b;

    public e(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        this.f45546a = key;
        this.f45547b = value;
    }

    public static /* synthetic */ e copy$default(e eVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eVar.f45546a;
        }
        if ((i10 & 2) != 0) {
            str2 = eVar.f45547b;
        }
        return eVar.copy(str, str2);
    }

    public final String component1() {
        return this.f45546a;
    }

    public final String component2() {
        return this.f45547b;
    }

    public final e copy(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        return new e(key, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return e0.areEqual(this.f45546a, eVar.f45546a) && e0.areEqual(this.f45547b, eVar.f45547b);
    }

    public final String getKey() {
        return this.f45546a;
    }

    public final String getValue() {
        return this.f45547b;
    }

    public int hashCode() {
        return this.f45547b.hashCode() + (this.f45546a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventTag(key=");
        sb2.append(this.f45546a);
        sb2.append(", value=");
        return o2.q(sb2, this.f45547b, ')');
    }
}
