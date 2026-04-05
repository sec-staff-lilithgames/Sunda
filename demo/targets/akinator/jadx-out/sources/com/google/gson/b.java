package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Field f29914a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f29914a = field;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f29914a.getAnnotation(cls);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.f29914a.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.f29914a.getType();
    }

    public Type getDeclaredType() {
        return this.f29914a.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.f29914a.getDeclaringClass();
    }

    public String getName() {
        return this.f29914a.getName();
    }

    public boolean hasModifier(int i10) {
        return (i10 & this.f29914a.getModifiers()) != 0;
    }

    public String toString() {
        return this.f29914a.toString();
    }
}
