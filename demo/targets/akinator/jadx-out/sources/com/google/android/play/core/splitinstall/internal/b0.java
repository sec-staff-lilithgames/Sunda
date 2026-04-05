package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29597a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f29598b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f29599c;

    public b0(Object obj, Field field, Class cls) {
        this.f29597a = obj;
        this.f29598b = field;
        this.f29599c = cls;
    }

    public final Object zzc() {
        Object obj = this.f29597a;
        Field field = this.f29598b;
        Class cls = this.f29599c;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e10) {
            String name = field.getName();
            String name2 = obj.getClass().getName();
            String name3 = cls.getName();
            StringBuilder sbB = b3.h.b("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            sbB.append(name3);
            throw new d0(sbB.toString(), e10);
        }
    }

    public final void zze(Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object obj2 = this.f29597a;
        Field field = this.f29598b;
        try {
            field.set(obj2, obj);
        } catch (Exception e10) {
            String name = field.getName();
            String name2 = obj2.getClass().getName();
            String name3 = this.f29599c.getName();
            StringBuilder sbB = b3.h.b("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            sbB.append(name3);
            throw new d0(sbB.toString(), e10);
        }
    }
}
