package com.ironsource;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.na, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3360na {

    /* renamed from: c, reason: collision with root package name */
    private static C3360na f37977c;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<InterfaceC3124a9> f37978a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f37979b = new ConcurrentHashMap<>();

    public static synchronized C3360na b() {
        try {
            if (f37977c == null) {
                f37977c = new C3360na();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37977c;
    }

    public HashSet<InterfaceC3124a9> a() {
        return this.f37978a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f37979b;
    }

    public void d() {
        synchronized (this) {
            this.f37978a.clear();
        }
    }

    public void a(InterfaceC3124a9 interfaceC3124a9) {
        synchronized (this) {
            this.f37978a.add(interfaceC3124a9);
        }
    }

    public void b(InterfaceC3124a9 interfaceC3124a9) {
        synchronized (this) {
            this.f37978a.remove(interfaceC3124a9);
        }
    }

    public void a(String str, List<String> list) {
        this.f37979b.put(str, list);
    }
}
