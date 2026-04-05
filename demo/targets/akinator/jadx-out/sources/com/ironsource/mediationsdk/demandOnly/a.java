package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C3352n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0236a implements a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C3352n2> f37366a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0236a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C3352n2 a(String instanceName) {
            Object next;
            e0.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.f37366a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (e0.areEqual(((C3352n2) next).c(), instanceName)) {
                    break;
                }
            }
            return (C3352n2) next;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public String b() {
            return this.f37366a.isEmpty() ? "" : a.b.k("1", ((C3352n2) y0.first((List) this.f37366a)).c());
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C3352n2 get(int i10) {
            if (i10 < 0 || i10 >= this.f37366a.size()) {
                return null;
            }
            return this.f37366a.get(i10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f37366a.isEmpty();
        }

        public C0236a(List<C3352n2> waterfall) {
            e0.checkNotNullParameter(waterfall, "waterfall");
            this.f37366a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public List<C3352n2> a() {
            return this.f37366a;
        }

        public /* synthetic */ C0236a(List list, int i10, u uVar) {
            this((i10 & 1) != 0 ? new ArrayList() : list);
        }
    }

    C3352n2 a(String str);

    List<C3352n2> a();

    String b();

    C3352n2 get(int i10);

    boolean isEmpty();
}
