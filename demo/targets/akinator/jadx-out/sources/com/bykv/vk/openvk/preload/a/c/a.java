package com.bykv.vk.openvk.preload.a.c;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private Class<? super T> f16932a;

    /* renamed from: b, reason: collision with root package name */
    private Type f16933b;

    /* renamed from: c, reason: collision with root package name */
    private int f16934c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f16933b = typeA;
        this.f16932a = (Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.f16934c = this.f16933b.hashCode();
    }

    public final Class<? super T> a() {
        return this.f16932a;
    }

    public final Type b() {
        return this.f16933b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && com.bykv.vk.openvk.preload.a.b.a.a(this.f16933b, ((a) obj).f16933b);
    }

    public final int hashCode() {
        return this.f16934c;
    }

    public final String toString() {
        return com.bykv.vk.openvk.preload.a.b.a.c(this.f16933b);
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    private a(Type type) {
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a((Type) com.bykv.vk.openvk.preload.falconx.a.a.a(type));
        this.f16933b = typeA;
        this.f16932a = (Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.f16934c = this.f16933b.hashCode();
    }
}
