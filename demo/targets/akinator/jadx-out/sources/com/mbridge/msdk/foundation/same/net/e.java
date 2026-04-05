package com.mbridge.msdk.foundation.same.net;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.exception.a f40801a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f40802b;

    /* renamed from: c, reason: collision with root package name */
    public T f40803c;

    private e(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f40803c = t10;
        this.f40802b = aVar;
    }

    public static <T> e<T> a(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t10, aVar);
    }
}
