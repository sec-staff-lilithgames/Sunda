package a7;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f4089a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4090b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4091c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4092d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4093e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f4094a;

        /* renamed from: b, reason: collision with root package name */
        public final List f4095b;

        /* renamed from: c, reason: collision with root package name */
        public final List f4096c;

        /* renamed from: d, reason: collision with root package name */
        public final List f4097d;

        /* renamed from: e, reason: collision with root package name */
        public final List f4098e;

        public a() {
            this.f4094a = new ArrayList();
            this.f4095b = new ArrayList();
            this.f4096c = new ArrayList();
            this.f4097d = new ArrayList();
            this.f4098e = new ArrayList();
        }

        public final a add(g7.j jVar) {
            this.f4094a.add(jVar);
            return this;
        }

        public final b build() {
            return new b(q7.c.toImmutableList(this.f4094a), q7.c.toImmutableList(this.f4095b), q7.c.toImmutableList(this.f4096c), q7.c.toImmutableList(this.f4097d), q7.c.toImmutableList(this.f4098e), null);
        }

        public final List<c7.j> getDecoderFactories$coil_base_release() {
            return this.f4098e;
        }

        public final List<tu.v> getFetcherFactories$coil_base_release() {
            return this.f4097d;
        }

        public final List<g7.j> getInterceptors$coil_base_release() {
            return this.f4094a;
        }

        public final List<tu.v> getKeyers$coil_base_release() {
            return this.f4096c;
        }

        public final List<tu.v> getMappers$coil_base_release() {
            return this.f4095b;
        }

        public final /* synthetic */ <T> a add(i7.d dVar) {
            e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return add(dVar, Object.class);
        }

        public final <T> a add(i7.d dVar, Class<T> cls) {
            this.f4095b.add(tu.e0.to(dVar, cls));
            return this;
        }

        public final /* synthetic */ <T> a add(h7.b bVar) {
            e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return add(bVar, Object.class);
        }

        public final <T> a add(h7.b bVar, Class<T> cls) {
            this.f4096c.add(tu.e0.to(bVar, cls));
            return this;
        }

        public final /* synthetic */ <T> a add(f7.h hVar) {
            e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return add(hVar, Object.class);
        }

        public a(b bVar) {
            this.f4094a = y0.toMutableList((Collection) bVar.getInterceptors());
            this.f4095b = y0.toMutableList((Collection) bVar.getMappers());
            this.f4096c = y0.toMutableList((Collection) bVar.getKeyers());
            this.f4097d = y0.toMutableList((Collection) bVar.getFetcherFactories());
            this.f4098e = y0.toMutableList((Collection) bVar.getDecoderFactories());
        }

        public final <T> a add(f7.h hVar, Class<T> cls) {
            this.f4097d.add(tu.e0.to(hVar, cls));
            return this;
        }

        public final a add(c7.j jVar) {
            this.f4098e.add(jVar);
            return this;
        }
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, kotlin.jvm.internal.u uVar) {
        this(list, list2, list3, list4, list5);
    }

    public static /* synthetic */ tu.v newDecoder$default(b bVar, f7.o oVar, l7.o oVar2, m mVar, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return bVar.newDecoder(oVar, oVar2, mVar, i10);
    }

    public static /* synthetic */ tu.v newFetcher$default(b bVar, Object obj, l7.o oVar, m mVar, int i10, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return bVar.newFetcher(obj, oVar, mVar, i10);
    }

    public final List<c7.j> getDecoderFactories() {
        return this.f4093e;
    }

    public final List<tu.v> getFetcherFactories() {
        return this.f4092d;
    }

    public final List<g7.j> getInterceptors() {
        return this.f4089a;
    }

    public final List<tu.v> getKeyers() {
        return this.f4091c;
    }

    public final List<tu.v> getMappers() {
        return this.f4090b;
    }

    public final String key(Object obj, l7.o oVar) {
        List list = this.f4091c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            tu.v vVar = (tu.v) list.get(i10);
            h7.b bVar = (h7.b) vVar.component1();
            if (((Class) vVar.component2()).isAssignableFrom(obj.getClass())) {
                e0.checkNotNull(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strKey = bVar.key(obj, oVar);
                if (strKey != null) {
                    return strKey;
                }
            }
        }
        return null;
    }

    public final Object map(Object obj, l7.o oVar) {
        List list = this.f4090b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            tu.v vVar = (tu.v) list.get(i10);
            i7.d dVar = (i7.d) vVar.component1();
            if (((Class) vVar.component2()).isAssignableFrom(obj.getClass())) {
                e0.checkNotNull(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object map = dVar.map(obj, oVar);
                if (map != null) {
                    obj = map;
                }
            }
        }
        return obj;
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final tu.v newDecoder(f7.o oVar, l7.o oVar2, m mVar) {
        return newDecoder$default(this, oVar, oVar2, mVar, 0, 8, null);
    }

    public final tu.v newFetcher(Object obj, l7.o oVar, m mVar) {
        return newFetcher$default(this, obj, oVar, mVar, 0, 8, null);
    }

    public b(List list, List list2, List list3, List list4, List list5) {
        this.f4089a = list;
        this.f4090b = list2;
        this.f4091c = list3;
        this.f4092d = list4;
        this.f4093e = list5;
    }

    public final tu.v newDecoder(f7.o oVar, l7.o oVar2, m mVar, int i10) {
        List list = this.f4093e;
        int size = list.size();
        while (i10 < size) {
            c7.k kVarCreate = ((c7.j) list.get(i10)).create(oVar, oVar2, mVar);
            if (kVarCreate != null) {
                return tu.e0.to(kVarCreate, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final tu.v newFetcher(Object obj, l7.o oVar, m mVar, int i10) {
        List list = this.f4092d;
        int size = list.size();
        while (i10 < size) {
            tu.v vVar = (tu.v) list.get(i10);
            f7.h hVar = (f7.h) vVar.component1();
            if (((Class) vVar.component2()).isAssignableFrom(obj.getClass())) {
                e0.checkNotNull(hVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                f7.i iVarCreate = hVar.create(obj, oVar, mVar);
                if (iVarCreate != null) {
                    return tu.e0.to(iVarCreate, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    public b() {
        this(p0.emptyList(), p0.emptyList(), p0.emptyList(), p0.emptyList(), p0.emptyList());
    }
}
