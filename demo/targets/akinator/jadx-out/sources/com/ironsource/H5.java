package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface H5<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<T> implements H5<T> {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<T> f34570a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<T> f34571b;

        public a(ArrayList<T> a10, ArrayList<T> b10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(a10, "a");
            kotlin.jvm.internal.e0.checkNotNullParameter(b10, "b");
            this.f34570a = a10;
            this.f34571b = b10;
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f34570a.contains(t10) || this.f34571b.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f34571b.size() + this.f34570a.size();
        }

        @Override // com.ironsource.H5
        public List<T> value() {
            return uu.y0.plus((Collection) this.f34570a, (Iterable) this.f34571b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<T> implements H5<T> {

        /* renamed from: a, reason: collision with root package name */
        private final H5<T> f34572a;

        /* renamed from: b, reason: collision with root package name */
        private final Comparator<T> f34573b;

        public b(H5<T> collection, Comparator<T> comparator) {
            kotlin.jvm.internal.e0.checkNotNullParameter(collection, "collection");
            kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
            this.f34572a = collection;
            this.f34573b = comparator;
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f34572a.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f34572a.size();
        }

        @Override // com.ironsource.H5
        public List<T> value() {
            return uu.y0.sortedWith(this.f34572a.value(), this.f34573b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<T> implements H5<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f34574a;

        /* renamed from: b, reason: collision with root package name */
        private final List<T> f34575b;

        public c(H5<T> collection, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(collection, "collection");
            this.f34574a = i10;
            this.f34575b = collection.value();
        }

        public final List<T> a() {
            int size = this.f34575b.size();
            int i10 = this.f34574a;
            if (size <= i10) {
                return uu.p0.emptyList();
            }
            List<T> list = this.f34575b;
            return list.subList(i10, list.size());
        }

        public final List<T> b() {
            List<T> list = this.f34575b;
            return list.subList(0, qv.v.coerceAtMost(list.size(), this.f34574a));
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f34575b.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f34575b.size();
        }

        @Override // com.ironsource.H5
        public List<T> value() {
            return this.f34575b;
        }
    }

    boolean contains(T t10);

    int size();

    List<T> value();
}
