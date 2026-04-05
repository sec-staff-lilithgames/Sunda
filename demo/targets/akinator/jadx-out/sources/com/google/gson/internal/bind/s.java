package com.google.gson.internal.bind;

import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f30019a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f30020b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30021c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Method f30023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.k0 f30024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.k0 f30025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f30026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f30027i;

    public s(String str, Field field, boolean z10, Method method, com.google.gson.k0 k0Var, com.google.gson.k0 k0Var2, boolean z11, boolean z12) {
        this.f30022d = z10;
        this.f30023e = method;
        this.f30024f = k0Var;
        this.f30025g = k0Var2;
        this.f30026h = z11;
        this.f30027i = z12;
        this.f30019a = str;
        this.f30020b = field;
        this.f30021c = field.getName();
    }

    public final void a(JsonWriter jsonWriter, Object obj) {
        Object objInvoke;
        boolean z10 = this.f30022d;
        Field field = this.f30020b;
        Method method = this.f30023e;
        if (z10) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.a(field, obj);
            } else {
                ReflectiveTypeAdapterFactory.a(method, obj);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new com.google.gson.r(a.b.l("Accessor ", ok.c.getAccessibleObjectDescription(method, false), " threw exception"), e10.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        jsonWriter.name(this.f30019a);
        this.f30024f.write(jsonWriter, objInvoke);
    }
}
