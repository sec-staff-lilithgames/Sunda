package com.moloco.sdk.internal.utils;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.sync.Mutex;
import zu.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public final Mutex f47222b;

    public d(Mutex mutex) {
        e0.checkNotNullParameter(mutex, "mutex");
        this.f47222b = mutex;
    }

    public final Mutex a() {
        return this.f47222b;
    }

    public final Mutex b() {
        return this.f47222b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && e0.areEqual(this.f47222b, ((d) obj).f47222b);
    }

    public int hashCode() {
        return this.f47222b.hashCode();
    }

    public String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.f47222b + ')';
    }

    public final d a(Mutex mutex) {
        e0.checkNotNullParameter(mutex, "mutex");
        return new d(mutex);
    }

    public static /* synthetic */ d a(d dVar, Mutex mutex, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutex = dVar.f47222b;
        }
        return dVar.a(mutex);
    }
}
