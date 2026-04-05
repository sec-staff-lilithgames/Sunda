package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f15026c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static final Map f15027d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final p3 f15028e;

    /* renamed from: f, reason: collision with root package name */
    public static final p3 f15029f;

    /* renamed from: g, reason: collision with root package name */
    public static final p3 f15030g;

    /* renamed from: a, reason: collision with root package name */
    private String f15031a;

    /* renamed from: b, reason: collision with root package name */
    private Set f15032b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* renamed from: a, reason: collision with root package name */
        private final String f15036a;

        a(String str) {
            this.f15036a = str;
        }

        public String b() {
            return this.f15036a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f15028e = a("ars", aVar, a.INSTALL);
        f15029f = a("ar", aVar);
        f15030g = a("ttdasi_ms", aVar);
    }

    private p3(String str, Set set) {
        this.f15031a = str;
        this.f15032b = set;
    }

    public boolean a(Object obj) {
        return obj instanceof p3;
    }

    public Set b() {
        return this.f15032b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        if (!p3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = p3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = p3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = strA == null ? 43 : strA.hashCode();
        Set setB = b();
        return ((iHashCode + 59) * 59) + (setB != null ? setB.hashCode() : 43);
    }

    public String toString() {
        return this.f15031a;
    }

    public String a() {
        return this.f15031a;
    }

    private static p3 a(String str, a... aVarArr) {
        Set set = f15026c;
        if (!set.contains(str)) {
            p3 p3Var = new p3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f15027d.put(str, p3Var);
            return p3Var;
        }
        throw new IllegalArgumentException(a.b.k("Key has already been used: ", str));
    }

    public boolean a(a aVar) {
        return this.f15032b.contains(aVar);
    }

    public static p3 a(String str) {
        return (p3) f15027d.get(str);
    }
}
