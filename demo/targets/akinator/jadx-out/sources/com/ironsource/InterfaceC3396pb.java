package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3396pb<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.pb$a */
    public static final class a<T> implements InterfaceC3396pb<T> {

        /* renamed from: a, reason: collision with root package name */
        private final IronSourceError f38168a;

        public a(IronSourceError error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            this.f38168a = error;
        }

        public final IronSourceError a() {
            return this.f38168a;
        }

        public final IronSourceError b() {
            return this.f38168a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.e0.areEqual(this.f38168a, ((a) obj).f38168a);
        }

        public int hashCode() {
            return this.f38168a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f38168a + ")";
        }

        public final a<T> a(IronSourceError error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ironSourceError = aVar.f38168a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.pb$b */
    public static final class b<T> implements InterfaceC3396pb<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f38169a;

        public b(T t10) {
            this.f38169a = t10;
        }

        public final T a() {
            return this.f38169a;
        }

        public final T b() {
            return this.f38169a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.e0.areEqual(this.f38169a, ((b) obj).f38169a);
        }

        public int hashCode() {
            T t10 = this.f38169a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return j1.o2.k(this.f38169a, "Success(value=", ")");
        }

        public final b<T> a(T t10) {
            return new b<>(t10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f38169a;
            }
            return bVar.a(obj);
        }
    }
}
