package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u extends t {

    /* renamed from: b, reason: collision with root package name */
    public final mk.u f30031b;

    public u(mk.u uVar, v vVar) {
        super(vVar);
        this.f30031b = uVar;
    }

    @Override // com.google.gson.internal.bind.t
    public final Object a() {
        return this.f30031b.construct();
    }

    @Override // com.google.gson.internal.bind.t
    public final void c(Object obj, JsonReader jsonReader, s sVar) throws IllegalAccessException, IOException, IllegalArgumentException {
        Field field = sVar.f30020b;
        Object obj2 = sVar.f30025g.read(jsonReader);
        if (obj2 == null && sVar.f30026h) {
            return;
        }
        if (sVar.f30022d) {
            ReflectiveTypeAdapterFactory.a(field, obj);
        } else if (sVar.f30027i) {
            throw new com.google.gson.r(a.b.k("Cannot set value of 'static final' ", ok.c.getAccessibleObjectDescription(field, false)));
        }
        field.set(obj, obj2);
    }

    @Override // com.google.gson.internal.bind.t
    public final Object b(Object obj) {
        return obj;
    }
}
