package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r1 {

    /* renamed from: b, reason: collision with root package name */
    private final String f15174b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15175c;

    /* renamed from: a, reason: collision with root package name */
    private final String f15173a = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    private final long f15176d = System.currentTimeMillis();

    public r1(String str, Map map) {
        this.f15174b = str;
        this.f15175c = map;
    }

    public long a() {
        return this.f15176d;
    }

    public String b() {
        return this.f15173a;
    }

    public String c() {
        return this.f15174b;
    }

    public Map d() {
        return this.f15175c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (this.f15176d == r1Var.f15176d && Objects.equals(this.f15174b, r1Var.f15174b) && Objects.equals(this.f15175c, r1Var.f15175c)) {
            return Objects.equals(this.f15173a, r1Var.f15173a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15174b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f15175c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f15176d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f15173a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Event{name='");
        sb2.append(this.f15174b);
        sb2.append("', id='");
        sb2.append(this.f15173a);
        sb2.append("', creationTimestampMillis=");
        sb2.append(this.f15176d);
        sb2.append(", parameters=");
        return j1.o2.q(sb2, this.f15175c, AbstractJsonLexerKt.END_OBJ);
    }
}
