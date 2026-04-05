package io.odeeo.internal.n0;

import android.os.Bundle;
import io.odeeo.internal.a0.k0;
import io.odeeo.internal.b.g;
import io.odeeo.internal.q0.t;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.j1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements io.odeeo.internal.b.g {

    /* renamed from: b, reason: collision with root package name */
    public static final i f64996b = new i(j1.of());

    /* renamed from: c, reason: collision with root package name */
    public static final g.a<i> f64997c = new xl.g(13);

    /* renamed from: a, reason: collision with root package name */
    public final j1<k0, c> f64998a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap<k0, c> f64999a;

        public b addOverride(c cVar) {
            this.f64999a.put(cVar.f65001a, cVar);
            return this;
        }

        public i build() {
            return new i(this.f64999a);
        }

        public b clearOverride(k0 k0Var) {
            this.f64999a.remove(k0Var);
            return this;
        }

        public b clearOverridesOfType(int i10) {
            Iterator<c> it = this.f64999a.values().iterator();
            while (it.hasNext()) {
                if (it.next().getTrackType() == i10) {
                    it.remove();
                }
            }
            return this;
        }

        public b setOverrideForType(c cVar) {
            clearOverridesOfType(cVar.getTrackType());
            this.f64999a.put(cVar.f65001a, cVar);
            return this;
        }

        public b() {
            this.f64999a = new HashMap<>();
        }

        public b(Map<k0, c> map) {
            this.f64999a = new HashMap<>(map);
        }
    }

    public static /* synthetic */ i a(Bundle bundle) {
        List listFromBundleNullableList = io.odeeo.internal.q0.c.fromBundleNullableList(c.f65000c, bundle.getParcelableArrayList(a(0)), h1.of());
        j1.b bVar = new j1.b();
        for (int i10 = 0; i10 < listFromBundleNullableList.size(); i10++) {
            c cVar = (c) listFromBundleNullableList.get(i10);
            bVar.put(cVar.f65001a, cVar);
        }
        return new i(bVar.build());
    }

    public h1<c> asList() {
        return h1.copyOf((Collection) this.f64998a.values());
    }

    public b buildUpon() {
        return new b(this.f64998a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f64998a.equals(((i) obj).f64998a);
    }

    public c getOverride(k0 k0Var) {
        return this.f64998a.get(k0Var);
    }

    public int hashCode() {
        return this.f64998a.hashCode();
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(a(0), io.odeeo.internal.q0.c.toBundleArrayList(this.f64998a.values()));
        return bundle;
    }

    public i(Map<k0, c> map) {
        this.f64998a = j1.copyOf((Map) map);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements io.odeeo.internal.b.g {

        /* renamed from: c, reason: collision with root package name */
        public static final g.a<c> f65000c = new xl.g(14);

        /* renamed from: a, reason: collision with root package name */
        public final k0 f65001a;

        /* renamed from: b, reason: collision with root package name */
        public final h1<Integer> f65002b;

        public c(k0 k0Var) {
            this.f65001a = k0Var;
            h1.a aVar = new h1.a();
            for (int i10 = 0; i10 < k0Var.f62395a; i10++) {
                aVar.add((h1.a) Integer.valueOf(i10));
            }
            this.f65002b = aVar.build();
        }

        public static /* synthetic */ c a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(0));
            io.odeeo.internal.q0.a.checkNotNull(bundle2);
            k0 k0Var = (k0) k0.f62394d.mo3834fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(a(1));
            return intArray == null ? new c(k0Var) : new c(k0Var, io.odeeo.internal.w0.d.asList(intArray));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f65001a.equals(cVar.f65001a) && this.f65002b.equals(cVar.f65002b)) {
                    return true;
                }
            }
            return false;
        }

        public int getTrackType() {
            return t.getTrackType(this.f65001a.getFormat(0).f62971l);
        }

        public int hashCode() {
            return (this.f65002b.hashCode() * 31) + this.f65001a.hashCode();
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(a(0), this.f65001a.toBundle());
            bundle.putIntArray(a(1), io.odeeo.internal.w0.d.toArray(this.f65002b));
            return bundle;
        }

        public c(k0 k0Var, List<Integer> list) {
            if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= k0Var.f62395a)) {
                throw new IndexOutOfBoundsException();
            }
            this.f65001a = k0Var;
            this.f65002b = h1.copyOf((Collection) list);
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
