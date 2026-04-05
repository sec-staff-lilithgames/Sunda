package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<a0> f43341a = new LinkedHashSet();

    public synchronized void a(a0 a0Var) {
        this.f43341a.remove(a0Var);
    }

    public synchronized void b(a0 a0Var) {
        this.f43341a.add(a0Var);
    }

    public synchronized boolean c(a0 a0Var) {
        return this.f43341a.contains(a0Var);
    }
}
