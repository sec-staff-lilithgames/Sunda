package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.g7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3230g7 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.g7$a */
    public static final class a implements nv.c {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<T> f36779a;

        public a(T t10) {
            this.f36779a = new WeakReference<>(t10);
        }

        public final WeakReference<T> a() {
            return this.f36779a;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
        @Override // nv.c, nv.b
        public T getValue(Object thisRef, KProperty<?> property) {
            kotlin.jvm.internal.e0.checkNotNullParameter(thisRef, "thisRef");
            kotlin.jvm.internal.e0.checkNotNullParameter(property, "property");
            return this.f36779a.get();
        }

        @Override // nv.c
        public void setValue(Object thisRef, KProperty<?> property, T t10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(thisRef, "thisRef");
            kotlin.jvm.internal.e0.checkNotNullParameter(property, "property");
            this.f36779a = new WeakReference<>(t10);
        }

        public final void a(WeakReference<T> weakReference) {
            kotlin.jvm.internal.e0.checkNotNullParameter(weakReference, "<set-?>");
            this.f36779a = weakReference;
        }
    }

    public static /* synthetic */ nv.c a(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final <T> nv.c a(T t10) {
        return new a(t10);
    }
}
