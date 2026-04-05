package com.moloco.sdk.internal.scheduling;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f46748a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineScope f46749b = CoroutineScopeKt.CoroutineScope(c.a().getIo());

    /* renamed from: c, reason: collision with root package name */
    public static final CoroutineScope f46750c = CoroutineScopeKt.CoroutineScope(c.a().getDefault());

    public final CoroutineScope a() {
        return f46750c;
    }

    public final CoroutineScope b() {
        return f46749b;
    }
}
