package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f26482a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f26483b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26484c = false;

    public t0(z0 z0Var) {
        this.f26482a = z0Var;
        this.f26483b = (z0) z0Var.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
    }

    public static void a(z0 z0Var, z0 z0Var2) {
        p2 p2Var = p2.f26452c;
        p2Var.getClass();
        p2Var.a(z0Var.getClass()).a(z0Var, z0Var2);
    }

    public final z0 b() {
        if (this.f26484c) {
            return this.f26483b;
        }
        this.f26483b.makeImmutable();
        this.f26484c = true;
        return this.f26483b;
    }

    public final void c() {
        if (this.f26484c) {
            z0 z0Var = (z0) this.f26483b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
            a(z0Var, this.f26483b);
            this.f26483b = z0Var;
            this.f26484c = false;
        }
    }

    public final Object clone() {
        t0 t0VarNewBuilderForType = this.f26482a.newBuilderForType();
        z0 z0VarB = b();
        t0VarNewBuilderForType.c();
        a(t0VarNewBuilderForType.f26483b, z0VarB);
        return t0VarNewBuilderForType;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final d2 getDefaultInstanceForType() {
        return this.f26482a;
    }

    public static void a(Iterable iterable, List list) {
        Charset charset = l1.f26429a;
        iterable.getClass();
        if (iterable instanceof q1) {
            List listB = ((q1) iterable).b();
            q1 q1Var = (q1) list;
            int size = list.size();
            for (Object obj : listB) {
                if (obj == null) {
                    String str = "Element at index " + (q1Var.size() - size) + " is null.";
                    for (int size2 = q1Var.size() - 1; size2 >= size; size2--) {
                        q1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof s) {
                    q1Var.a((s) obj);
                } else {
                    q1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof n2) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public final z0 a() {
        z0 z0VarB = b();
        if (z0VarB.isInitialized()) {
            return z0VarB;
        }
        throw new m3();
    }

    public final t0 a(w wVar, h0 h0Var) throws IOException {
        c();
        try {
            p2 p2Var = p2.f26452c;
            z0 z0Var = this.f26483b;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(z0Var.getClass());
            z0 z0Var2 = this.f26483b;
            x xVar = wVar.f26513d;
            if (xVar == null) {
                xVar = new x(wVar);
            }
            t2VarA.a(z0Var2, xVar, h0Var);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }
}
