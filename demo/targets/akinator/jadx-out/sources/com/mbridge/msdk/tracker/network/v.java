package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class v<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f44077a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f44078b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f44079c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44080d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(b0 b0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, b.a aVar) {
        this.f44080d = false;
        this.f44077a = t10;
        this.f44078b = aVar;
        this.f44079c = null;
    }

    public static <T> v<T> a(T t10, b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f44079c == null;
    }

    private v(b0 b0Var) {
        this.f44080d = false;
        this.f44077a = null;
        this.f44078b = null;
        this.f44079c = b0Var;
    }
}
