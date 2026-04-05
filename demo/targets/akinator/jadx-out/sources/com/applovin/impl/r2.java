package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r2 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f15177a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15178b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15179c;

    /* renamed from: d, reason: collision with root package name */
    private final b3 f15180d;

    public r2(String str, String str2, boolean z10, b3 b3Var) {
        this.f15177a = str;
        this.f15178b = str2;
        this.f15179c = z10;
        this.f15180d = b3Var;
    }

    public String a() {
        return this.f15178b;
    }

    public List b() {
        List listL = this.f15180d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f15177a) : listL;
    }

    public String c() {
        return this.f15177a;
    }

    public b3 d() {
        return this.f15180d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r2 r2Var = (r2) obj;
            String str = this.f15177a;
            if (str == null ? r2Var.f15177a != null : !str.equals(r2Var.f15177a)) {
                return false;
            }
            String str2 = this.f15178b;
            if (str2 == null ? r2Var.f15178b != null : !str2.equals(r2Var.f15178b)) {
                return false;
            }
            if (this.f15179c == r2Var.f15179c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15177a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15178b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f15179c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(r2 r2Var) {
        return this.f15178b.compareToIgnoreCase(r2Var.f15178b);
    }
}
