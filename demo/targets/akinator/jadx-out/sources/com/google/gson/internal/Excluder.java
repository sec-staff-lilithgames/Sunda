package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.k0;
import com.google.gson.l0;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mk.c;
import pk.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Excluder implements l0, Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final Excluder f29922i = new Excluder();

    /* renamed from: b, reason: collision with root package name */
    public double f29923b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    public int f29924c = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29925e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29926f;

    /* renamed from: g, reason: collision with root package name */
    public List f29927g;

    /* renamed from: h, reason: collision with root package name */
    public List f29928h;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f29927g = list;
        this.f29928h = list;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.l0
    public <T> k0 create(Gson gson, a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean zExcludeClass = excludeClass(rawType, true);
        boolean zExcludeClass2 = excludeClass(rawType, false);
        if (zExcludeClass || zExcludeClass2) {
            return new c(this, zExcludeClass2, zExcludeClass, gson, aVar);
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderClone = clone();
        excluderClone.f29925e = false;
        return excluderClone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r7.f29923b < r2.value()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean excludeClass(java.lang.Class<?> r8, boolean r9) {
        /*
            r7 = this;
            double r0 = r7.f29923b
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L33
            java.lang.Class<lk.d> r0 = lk.d.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)
            lk.d r0 = (lk.d) r0
            java.lang.Class<lk.e> r2 = lk.e.class
            java.lang.annotation.Annotation r2 = r8.getAnnotation(r2)
            lk.e r2 = (lk.e) r2
            if (r0 == 0) goto L25
            double r3 = r0.value()
            double r5 = r7.f29923b
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L32
        L25:
            if (r2 == 0) goto L33
            double r2 = r2.value()
            double r4 = r7.f29923b
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L32
            goto L33
        L32:
            return r1
        L33:
            boolean r0 = r7.f29925e
            if (r0 != 0) goto L44
            boolean r0 = r8.isMemberClass()
            if (r0 == 0) goto L44
            boolean r0 = ok.c.isStatic(r8)
            if (r0 != 0) goto L44
            goto L54
        L44:
            if (r9 != 0) goto L55
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 != 0) goto L55
            boolean r8 = ok.c.isAnonymousOrNonStaticLocal(r8)
            if (r8 == 0) goto L55
        L54:
            return r1
        L55:
            if (r9 == 0) goto L5a
            java.util.List r8 = r7.f29927g
            goto L5c
        L5a:
            java.util.List r8 = r7.f29928h
        L5c:
            java.util.Iterator r8 = r8.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L68
            r8 = 0
            return r8
        L68:
            java.lang.ClassCastException r8 = a.b.c(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.excludeClass(java.lang.Class, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r7.f29923b < r2.value()) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean excludeField(java.lang.reflect.Field r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.f29924c
            int r1 = r8.getModifiers()
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto Lb
            goto L6c
        Lb:
            double r2 = r7.f29923b
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3d
            java.lang.Class<lk.d> r0 = lk.d.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)
            lk.d r0 = (lk.d) r0
            java.lang.Class<lk.e> r2 = lk.e.class
            java.lang.annotation.Annotation r2 = r8.getAnnotation(r2)
            lk.e r2 = (lk.e) r2
            if (r0 == 0) goto L2f
            double r3 = r0.value()
            double r5 = r7.f29923b
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L3c
        L2f:
            if (r2 == 0) goto L3d
            double r2 = r2.value()
            double r4 = r7.f29923b
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3c
            goto L3d
        L3c:
            return r1
        L3d:
            boolean r0 = r8.isSynthetic()
            if (r0 == 0) goto L44
            goto L6c
        L44:
            boolean r0 = r7.f29926f
            if (r0 == 0) goto L62
            java.lang.Class<lk.a> r0 = lk.a.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)
            lk.a r0 = (lk.a) r0
            if (r0 == 0) goto L6c
            if (r9 == 0) goto L5b
            boolean r0 = r0.serialize()
            if (r0 != 0) goto L62
            goto L6c
        L5b:
            boolean r0 = r0.deserialize()
            if (r0 != 0) goto L62
            goto L6c
        L62:
            java.lang.Class r0 = r8.getType()
            boolean r0 = r7.excludeClass(r0, r9)
            if (r0 == 0) goto L6d
        L6c:
            return r1
        L6d:
            if (r9 == 0) goto L72
            java.util.List r9 = r7.f29927g
            goto L74
        L72:
            java.util.List r9 = r7.f29928h
        L74:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L8f
            com.google.gson.b r0 = new com.google.gson.b
            r0.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L8a
            goto L8f
        L8a:
            java.lang.ClassCastException r8 = a.b.c(r8)
            throw r8
        L8f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.excludeField(java.lang.reflect.Field, boolean):boolean");
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderClone = clone();
        excluderClone.f29926f = true;
        return excluderClone;
    }

    public Excluder withExclusionStrategy(com.google.gson.a aVar, boolean z10, boolean z11) {
        Excluder excluderClone = clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.f29927g);
            excluderClone.f29927g = arrayList;
            arrayList.add(aVar);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.f29928h);
            excluderClone.f29928h = arrayList2;
            arrayList2.add(aVar);
        }
        return excluderClone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderClone = clone();
        excluderClone.f29924c = 0;
        for (int i10 : iArr) {
            excluderClone.f29924c = i10 | excluderClone.f29924c;
        }
        return excluderClone;
    }

    public Excluder withVersion(double d10) {
        Excluder excluderClone = clone();
        excluderClone.f29923b = d10;
        return excluderClone;
    }
}
