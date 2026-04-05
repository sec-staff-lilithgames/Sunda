package io.bidmachine.analytics.internal;

import j1.o2;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3881n {

    /* renamed from: a, reason: collision with root package name */
    private final String f60118a;

    /* renamed from: b, reason: collision with root package name */
    private final a f60119b;

    /* renamed from: c, reason: collision with root package name */
    private final a f60120c;

    /* renamed from: d, reason: collision with root package name */
    private final tu.o f60121d = tu.q.lazy(new c());

    /* renamed from: e, reason: collision with root package name */
    private final tu.o f60122e = tu.q.lazy(new b());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f60123a;

        /* renamed from: b, reason: collision with root package name */
        private final List f60124b;

        /* renamed from: c, reason: collision with root package name */
        private final List f60125c;

        public a(List list, List list2, List list3) {
            this.f60123a = list;
            this.f60124b = list2;
            this.f60125c = list3;
        }

        public final a a(List list, List list2, List list3) {
            return new a(list, list2, list3);
        }

        public final List b() {
            return this.f60125c;
        }

        public final List c() {
            return this.f60124b;
        }

        public final boolean d() {
            return this.f60123a.isEmpty() && this.f60124b.isEmpty() && this.f60125c.isEmpty();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f60123a, aVar.f60123a) && kotlin.jvm.internal.e0.areEqual(this.f60124b, aVar.f60124b) && kotlin.jvm.internal.e0.areEqual(this.f60125c, aVar.f60125c);
        }

        public int hashCode() {
            return this.f60125c.hashCode() + o2.c(this.f60123a.hashCode() * 31, 31, this.f60124b);
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ a a(a aVar, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = aVar.f60123a;
            }
            if ((i10 & 2) != 0) {
                list2 = aVar.f60124b;
            }
            if ((i10 & 4) != 0) {
                list3 = aVar.f60125c;
            }
            return aVar.a(list, list2, list3);
        }

        public final List a() {
            return this.f60123a;
        }

        public /* synthetic */ a(List list, List list2, List list3, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? uu.p0.emptyList() : list, (i10 & 2) != 0 ? uu.p0.emptyList() : list2, (i10 & 4) != 0 ? uu.p0.emptyList() : list3);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.n$b */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {
        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C3881n.this.d().hashCode() + '_' + y0.joinToString$default(uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(C3881n.this.c().a().size()), Integer.valueOf(C3881n.this.c().c().size()), Integer.valueOf(C3881n.this.c().b().size()), Integer.valueOf(C3881n.this.e().a().size()), Integer.valueOf(C3881n.this.e().c().size()), Integer.valueOf(C3881n.this.e().b().size())}), "_", null, null, 0, null, null, 62, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.n$c */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.a {
        public c() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            C3881n c3881n = C3881n.this;
            jSONObject.put("ver", c3881n.a());
            jSONObject.put("iaa", new JSONArray((Collection) c3881n.c().a()));
            jSONObject.put("iah", new JSONArray((Collection) c3881n.c().c()));
            jSONObject.put("iad", new JSONArray((Collection) c3881n.c().b()));
            jSONObject.put("sua", new JSONArray((Collection) c3881n.e().a()));
            jSONObject.put("suh", new JSONArray((Collection) c3881n.e().c()));
            jSONObject.put("sud", new JSONArray((Collection) c3881n.e().b()));
            return jSONObject.toString();
        }
    }

    public C3881n(String str, a aVar, a aVar2) {
        this.f60118a = str;
        this.f60119b = aVar;
        this.f60120c = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return (String) this.f60121d.getValue();
    }

    public final String b() {
        return (String) this.f60122e.getValue();
    }

    public final a c() {
        return this.f60119b;
    }

    public final a e() {
        return this.f60120c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3881n)) {
            return false;
        }
        C3881n c3881n = (C3881n) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f60118a, c3881n.f60118a) && kotlin.jvm.internal.e0.areEqual(this.f60119b, c3881n.f60119b) && kotlin.jvm.internal.e0.areEqual(this.f60120c, c3881n.f60120c);
    }

    public final boolean f() {
        return this.f60119b.d() && this.f60120c.d();
    }

    public int hashCode() {
        return this.f60120c.hashCode() + ((this.f60119b.hashCode() + (this.f60118a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return d();
    }

    public final String a() {
        return this.f60118a;
    }
}
