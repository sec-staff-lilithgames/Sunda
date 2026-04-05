package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import io.ktor.client.HttpClient;
import j1.o2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import sv.n0;
import tu.a0;
import tu.t;
import tu.x0;
import uu.o0;
import uu.p0;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e {

    /* renamed from: h, reason: collision with root package name */
    public static final c f48848h = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j f48849a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j f48850b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h f48851c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n f48852d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f48853e;

    /* renamed from: f, reason: collision with root package name */
    public final HttpClient f48854f;

    /* renamed from: g, reason: collision with root package name */
    public final v f48855g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f48856a;

        /* renamed from: b, reason: collision with root package name */
        public final List f48857b;

        /* renamed from: c, reason: collision with root package name */
        public final List f48858c;

        public a(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> impressions, List<String> errorUrls, List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i>> creativesPerWrapper) {
            kotlin.jvm.internal.e0.checkNotNullParameter(impressions, "impressions");
            kotlin.jvm.internal.e0.checkNotNullParameter(errorUrls, "errorUrls");
            kotlin.jvm.internal.e0.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            this.f48856a = impressions;
            this.f48857b = errorUrls;
            this.f48858c = creativesPerWrapper;
        }

        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> a() {
            return this.f48856a;
        }

        public final List<String> b() {
            return this.f48857b;
        }

        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i>> c() {
            return this.f48858c;
        }

        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i>> d() {
            return this.f48858c;
        }

        public final List<String> e() {
            return this.f48857b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f48856a, aVar.f48856a) && kotlin.jvm.internal.e0.areEqual(this.f48857b, aVar.f48857b) && kotlin.jvm.internal.e0.areEqual(this.f48858c, aVar.f48858c);
        }

        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> f() {
            return this.f48856a;
        }

        public int hashCode() {
            return this.f48858c.hashCode() + o2.c(this.f48856a.hashCode() * 31, 31, this.f48857b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AggregatedWrapperChainAdData(impressions=");
            sb2.append(this.f48856a);
            sb2.append(", errorUrls=");
            sb2.append(this.f48857b);
            sb2.append(", creativesPerWrapper=");
            return o2.p(sb2, this.f48858c, ')');
        }

        public final a a(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> impressions, List<String> errorUrls, List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i>> creativesPerWrapper) {
            kotlin.jvm.internal.e0.checkNotNullParameter(impressions, "impressions");
            kotlin.jvm.internal.e0.checkNotNullParameter(errorUrls, "errorUrls");
            kotlin.jvm.internal.e0.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            return new a(impressions, errorUrls, creativesPerWrapper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a a(a aVar, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = aVar.f48856a;
            }
            if ((i10 & 2) != 0) {
                list2 = aVar.f48857b;
            }
            if ((i10 & 4) != 0) {
                list3 = aVar.f48858c;
            }
            return aVar.a(list, list2, list3);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f48859a;

        /* renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a f48860b;

        /* renamed from: c, reason: collision with root package name */
        public final List f48861c;

        /* renamed from: d, reason: collision with root package name */
        public final List f48862d;

        public b(List<w> linearTrackingList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar, List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>> iconsPerWrapper, List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> companionsPerWrapper) {
            kotlin.jvm.internal.e0.checkNotNullParameter(linearTrackingList, "linearTrackingList");
            kotlin.jvm.internal.e0.checkNotNullParameter(iconsPerWrapper, "iconsPerWrapper");
            kotlin.jvm.internal.e0.checkNotNullParameter(companionsPerWrapper, "companionsPerWrapper");
            this.f48859a = linearTrackingList;
            this.f48860b = aVar;
            this.f48861c = iconsPerWrapper;
            this.f48862d = companionsPerWrapper;
        }

        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> a() {
            return this.f48862d;
        }

        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>> b() {
            return this.f48861c;
        }

        public final List<w> c() {
            return this.f48859a;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a d() {
            return this.f48860b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {
        public /* synthetic */ c(u uVar) {
            this();
        }

        public c() {
        }

        public final boolean a(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return kotlin.jvm.internal.e0.areEqual(lowerCase, MimeTypes.VIDEO_MP4) || kotlin.jvm.internal.e0.areEqual(lowerCase, MimeTypes.VIDEO_H263) || kotlin.jvm.internal.e0.areEqual(lowerCase, "video/webm");
        }

        public final List<String> a(Map<x, ? extends List<w>> map, x xVar) {
            List<w> list = map.get(xVar);
            if (list != null) {
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w) it.next()).f());
                }
                return arrayList;
            }
            return p0.emptyList();
        }

        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h> a(Map<x, ? extends List<w>> map) {
            List<w> list = map.get(x.f49412p);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (w wVar : list) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar = wVar.e() == null ? null : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h(wVar.f(), wVar.e());
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                }
                return arrayList;
            }
            return p0.emptyList();
        }

        public final List<String> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar) {
            List<b0> listB;
            if (aVar != null && (listB = aVar.b()) != null) {
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listB, 10));
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b0) it.next()).b());
                }
                return arrayList;
            }
            return p0.emptyList();
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar) {
            String strG = iVar.g();
            return !(strG == null || n0.isBlank(strG));
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar) {
            String strC = gVar.c();
            return !(strC == null || n0.isBlank(strC));
        }

        public final boolean a(s sVar) {
            String strA = sVar.a();
            return !(strA == null || n0.isBlank(strA));
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar) {
            String strA = nVar.a();
            return !(strA == null || n0.isBlank(strA));
        }

        public final <T> Set<T> a(Set<? extends T> set, T t10) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                v0.addAll(linkedHashSet, set);
            }
            if (t10 != null) {
                linkedHashSet.add(t10);
            }
            return linkedHashSet;
        }

        public final <T> List<T> a(List<? extends T> list, List<? extends T> list2) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                v0.addAll(arrayList, list);
            }
            if (list2 != null) {
                v0.addAll(arrayList, list2);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> List<T> a(List<? extends T> list, T t10) {
            List<T> listA;
            return (t10 == null || (listA = f.f48848h.a((List) list, (List) o0.listOf(t10))) == null) ? list == 0 ? p0.emptyList() : list : listA;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i a(List<w> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                x xVarD = ((w) obj).d();
                Object arrayList = linkedHashMap.get(xVarD);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(xVarD, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i(a(aVar), a(linkedHashMap, x.f49399b), a(linkedHashMap, x.f49400c), a(linkedHashMap, x.f49401e), a(linkedHashMap, x.f49402f), a(linkedHashMap, x.f49403g), a(linkedHashMap, x.f49404h), a(linkedHashMap, x.f49405i), a(linkedHashMap, x.f49406j), a(linkedHashMap, x.f49407k), a(linkedHashMap, x.f49409m), a(linkedHashMap, x.f49408l), a(linkedHashMap, x.f49411o), a(linkedHashMap, x.f49410n), a(linkedHashMap));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f48863a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f48864b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48865c;

        /* renamed from: d, reason: collision with root package name */
        public final a f48866d;

        public d(int i10, Set<String> usedVastAdTagUrls, boolean z10, a aggregatedWrapperChainData) {
            kotlin.jvm.internal.e0.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            kotlin.jvm.internal.e0.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            this.f48863a = i10;
            this.f48864b = usedVastAdTagUrls;
            this.f48865c = z10;
            this.f48866d = aggregatedWrapperChainData;
        }

        public final int a() {
            return this.f48863a;
        }

        public final Set<String> b() {
            return this.f48864b;
        }

        public final boolean c() {
            return this.f48865c;
        }

        public final a d() {
            return this.f48866d;
        }

        public final a e() {
            return this.f48866d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f48863a == dVar.f48863a && kotlin.jvm.internal.e0.areEqual(this.f48864b, dVar.f48864b) && this.f48865c == dVar.f48865c && kotlin.jvm.internal.e0.areEqual(this.f48866d, dVar.f48866d);
        }

        public final boolean f() {
            return this.f48865c;
        }

        public final Set<String> g() {
            return this.f48864b;
        }

        public final int h() {
            return this.f48863a;
        }

        public int hashCode() {
            return this.f48866d.hashCode() + com.google.android.gms.internal.play_billing.a.c((this.f48864b.hashCode() + (Integer.hashCode(this.f48863a) * 31)) * 31, 31, this.f48865c);
        }

        public String toString() {
            return "WrapperChainParams(wrapperDepth=" + this.f48863a + ", usedVastAdTagUrls=" + this.f48864b + ", followAdditionalWrappers=" + this.f48865c + ", aggregatedWrapperChainData=" + this.f48866d + ')';
        }

        public final d a(int i10, Set<String> usedVastAdTagUrls, boolean z10, a aggregatedWrapperChainData) {
            kotlin.jvm.internal.e0.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            kotlin.jvm.internal.e0.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            return new d(i10, usedVastAdTagUrls, z10, aggregatedWrapperChainData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d a(d dVar, int i10, Set set, boolean z10, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = dVar.f48863a;
            }
            if ((i11 & 2) != 0) {
                set = dVar.f48864b;
            }
            if ((i11 & 4) != 0) {
                z10 = dVar.f48865c;
            }
            if ((i11 & 8) != 0) {
                aVar = dVar.f48866d;
            }
            return dVar.a(i10, set, z10, aVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f48867i;

        /* renamed from: j, reason: collision with root package name */
        public String f48868j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f48869k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f48870l;

        /* renamed from: n, reason: collision with root package name */
        public int f48872n;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48870l = obj;
            this.f48872n |= Integer.MIN_VALUE;
            return f.this.a((String) null, (String) null, false, (zu.d<? super com.moloco.sdk.internal.w>) this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f$f, reason: collision with other inner class name */
    public static final class C0455f extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48873i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ y f48875k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f48876l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48877m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0455f(y yVar, boolean z10, String str, zu.d<? super C0455f> dVar) {
            super(2, dVar);
            this.f48875k = yVar;
            this.f48876l = z10;
            this.f48877m = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((C0455f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f.this.new C0455f(this.f48875k, this.f48876l, this.f48877m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48873i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            f fVar = f.this;
            double dB = fVar.b();
            com.moloco.sdk.common_adapter_internal.d dVarInvoke = f.this.f48855g.invoke();
            this.f48873i = 1;
            Object objA = fVar.a(this.f48875k, (d) null, dB, dVarInvoke, this.f48876l, this.f48877m, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f48878i;

        /* renamed from: j, reason: collision with root package name */
        public List f48879j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f48880k;

        /* renamed from: m, reason: collision with root package name */
        public int f48882m;

        public g(zu.d<? super g> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48880k = obj;
            this.f48882m |= Integer.MIN_VALUE;
            return f.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b) null, (List<String>) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f48883i;

        /* renamed from: j, reason: collision with root package name */
        public q f48884j;

        /* renamed from: k, reason: collision with root package name */
        public a f48885k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.common_adapter_internal.d f48886l;

        /* renamed from: m, reason: collision with root package name */
        public String f48887m;

        /* renamed from: n, reason: collision with root package name */
        public List f48888n;

        /* renamed from: o, reason: collision with root package name */
        public tu.o f48889o;

        /* renamed from: p, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g f48890p;

        /* renamed from: q, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f48891q;

        /* renamed from: r, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.m f48892r;

        /* renamed from: s, reason: collision with root package name */
        public Iterator f48893s;

        /* renamed from: t, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i f48894t;

        /* renamed from: u, reason: collision with root package name */
        public double f48895u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f48896v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f48897w;

        /* renamed from: y, reason: collision with root package name */
        public int f48899y;

        public h(zu.d<? super h> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48897w = obj;
            this.f48899y |= Integer.MIN_VALUE;
            return f.this.a((q) null, (a) null, 0.0d, (com.moloco.sdk.common_adapter_internal.d) null, false, (String) null, (zu.d<? super com.moloco.sdk.internal.w>) this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f48900b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f48901c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f48902e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ double f48903f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.common_adapter_internal.d f48904g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f48905h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48906i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b1 f48907j;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f48908b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f48909c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f48910e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ double f48911f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.common_adapter_internal.d f48912g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ boolean f48913h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ String f48914i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ b1 f48915j;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f$i$a$a, reason: collision with other inner class name */
            public static final class C0456a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48916i;

                /* renamed from: j, reason: collision with root package name */
                public int f48917j;

                /* renamed from: k, reason: collision with root package name */
                public a f48918k;

                /* renamed from: m, reason: collision with root package name */
                public FlowCollector f48920m;

                public C0456a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f48916i = obj;
                    this.f48917j |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, f fVar, d dVar, double d10, com.moloco.sdk.common_adapter_internal.d dVar2, boolean z10, String str, b1 b1Var) {
                this.f48908b = flowCollector;
                this.f48909c = fVar;
                this.f48910e = dVar;
                this.f48911f = d10;
                this.f48912g = dVar2;
                this.f48913h = z10;
                this.f48914i = str;
                this.f48915j = b1Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
            
                if (r3.emit(r1, r11) == r2) goto L46;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r23, zu.d r24) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.i.a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public i(Flow flow, f fVar, d dVar, double d10, com.moloco.sdk.common_adapter_internal.d dVar2, boolean z10, String str, b1 b1Var) {
            this.f48900b = flow;
            this.f48901c = fVar;
            this.f48902e = dVar;
            this.f48903f = d10;
            this.f48904g = dVar2;
            this.f48905h = z10;
            this.f48906i = str;
            this.f48907j = b1Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f48900b.collect(new a(flowCollector, this.f48901c, this.f48902e, this.f48903f, this.f48904g, this.f48905h, this.f48906i, this.f48907j), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return xu.d.compareValues(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) obj).c(), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) obj2).c());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f48921i;

        /* renamed from: j, reason: collision with root package name */
        public b1 f48922j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f48923k;

        /* renamed from: m, reason: collision with root package name */
        public int f48925m;

        public k(zu.d<? super k> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48923k = obj;
            this.f48925m |= Integer.MIN_VALUE;
            return f.this.a((y) null, (d) null, 0.0d, (com.moloco.sdk.common_adapter_internal.d) null, false, (String) null, (zu.d<? super com.moloco.sdk.internal.w>) this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f48926i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b f48927j;

        /* renamed from: k, reason: collision with root package name */
        public d f48928k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.common_adapter_internal.d f48929l;

        /* renamed from: m, reason: collision with root package name */
        public String f48930m;

        /* renamed from: n, reason: collision with root package name */
        public List f48931n;

        /* renamed from: o, reason: collision with root package name */
        public double f48932o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f48933p;

        /* renamed from: q, reason: collision with root package name */
        public int f48934q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f48935r;

        /* renamed from: t, reason: collision with root package name */
        public int f48937t;

        public l(zu.d<? super l> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48935r = obj;
            this.f48937t |= Integer.MIN_VALUE;
            return f.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b) null, (d) null, 0.0d, (com.moloco.sdk.common_adapter_internal.d) null, false, (String) null, (zu.d<? super com.moloco.sdk.internal.w>) this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f48938b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f48939c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f48940e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48941f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b1 f48942g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f48943b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f48944c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f f48945e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f48946f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b1 f48947g;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f$m$a$a, reason: collision with other inner class name */
            public static final class C0457a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48948i;

                /* renamed from: j, reason: collision with root package name */
                public int f48949j;

                /* renamed from: k, reason: collision with root package name */
                public a f48950k;

                /* renamed from: m, reason: collision with root package name */
                public FlowCollector f48952m;

                /* renamed from: n, reason: collision with root package name */
                public s f48953n;

                public C0457a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f48948i = obj;
                    this.f48949j |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, boolean z10, f fVar, String str, b1 b1Var) {
                this.f48943b = flowCollector;
                this.f48944c = z10;
                this.f48945e = fVar;
                this.f48946f = str;
                this.f48947g = b1Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:48:0x00f8, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L49;
             */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, zu.d r10) {
                /*
                    Method dump skipped, instructions count: 260
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.m.a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public m(Flow flow, boolean z10, f fVar, String str, b1 b1Var) {
            this.f48938b = flow;
            this.f48939c = z10;
            this.f48940e = fVar;
            this.f48941f = str;
            this.f48942g = b1Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f48938b.collect(new a(flowCollector, this.f48939c, this.f48940e, this.f48941f, this.f48942g), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f48954i;

        /* renamed from: j, reason: collision with root package name */
        public r f48955j;

        /* renamed from: k, reason: collision with root package name */
        public List f48956k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a f48957l;

        /* renamed from: m, reason: collision with root package name */
        public b1 f48958m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f48959n;

        /* renamed from: p, reason: collision with root package name */
        public int f48961p;

        public n(zu.d<? super n> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48959n = obj;
            this.f48961p |= Integer.MIN_VALUE;
            return f.this.a((r) null, (List<w>) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a) null, (List<String>) null, 0.0d, (Long) null, (com.moloco.sdk.common_adapter_internal.d) null, false, (String) null, (zu.d<? super com.moloco.sdk.internal.w>) this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f48962i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f48963j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f48964k;

        /* renamed from: m, reason: collision with root package name */
        public int f48966m;

        public o(zu.d<? super o> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48964k = obj;
            this.f48966m |= Integer.MIN_VALUE;
            return f.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class p extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48967i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f48969k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f48970i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ f f48971j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f48971j = fVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar, zu.d<? super Boolean> dVar2) {
                return ((a) create(dVar, dVar2)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                a aVar = new a(this.f48971j, dVar);
                aVar.f48970i = obj;
                return aVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) this.f48970i;
                if (dVar instanceof d.c) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    String strD = f.d(this.f48971j);
                    StringBuilder sb2 = new StringBuilder("Stream status: ");
                    d.c cVar = (d.c) dVar;
                    sb2.append(cVar.d().c());
                    sb2.append('/');
                    sb2.append(cVar.d().d());
                    sb2.append(" bytes downloaded");
                    MolocoLogger.info$default(molocoLogger, strD, sb2.toString(), null, false, 12, null);
                }
                return bv.b.boxBoolean((dVar instanceof d.a) || (dVar instanceof d.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, zu.d<? super p> dVar) {
            super(2, dVar);
            this.f48969k = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> dVar) {
            return ((p) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f.this.new p(this.f48969k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48967i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            f fVar = f.this;
            Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> flowB = fVar.f48851c.b(this.f48969k.j().l());
            a aVar = new a(fVar, null);
            this.f48967i = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(flowB, aVar, this);
            return objFirstOrNull == coroutine_suspended ? coroutine_suspended : objFirstOrNull;
        }
    }

    public static final /* synthetic */ String d(f fVar) {
        fVar.getClass();
        return "VastAdLoaderImpl";
    }

    public final double a(long j10, int i10) {
        return (j10 * 8) / (i10 * 1000);
    }

    public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j parseVast, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j mediaConfig, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h mediaCacheRepository, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n vastTracker, e0 connectivityService, HttpClient httpClient, v screenService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parseVast, "parseVast");
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaConfig, "mediaConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        kotlin.jvm.internal.e0.checkNotNullParameter(vastTracker, "vastTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectivityService, "connectivityService");
        kotlin.jvm.internal.e0.checkNotNullParameter(httpClient, SFPXhf.qzuGvlH);
        kotlin.jvm.internal.e0.checkNotNullParameter(screenService, "screenService");
        this.f48849a = parseVast;
        this.f48850b = mediaConfig;
        this.f48851c = mediaCacheRepository;
        this.f48852d = vastTracker;
        this.f48853e = connectivityService;
        this.f48854f = httpClient;
        this.f48855g = screenService;
    }

    public final double b() {
        return !this.f48853e.b() ? 10.0d : 2.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a r12, long r13, zu.d<? super com.moloco.sdk.internal.w> r15) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r1 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r20, java.lang.String r21, boolean r22, zu.d<? super com.moloco.sdk.internal.w> r23) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(java.lang.String, java.lang.String, boolean, zu.d):java.lang.Object");
    }

    public static /* synthetic */ void a(f fVar, List list, z zVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            zVar = null;
        }
        fVar.a((List<String>) list, zVar);
    }

    public final void a(List<String> list, z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a(this.f48852d, list, zVar, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r21, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.d r22, double r23, com.moloco.sdk.common_adapter_internal.d r25, boolean r26, java.lang.String r27, zu.d<? super com.moloco.sdk.internal.w> r28) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f$d, double, com.moloco.sdk.common_adapter_internal.d, boolean, java.lang.String, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object a(f fVar, y yVar, d dVar, double d10, com.moloco.sdk.common_adapter_internal.d dVar2, boolean z10, String str, zu.d dVar3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        return fVar.a(yVar, dVar, d10, dVar2, z10, str, (zu.d<? super com.moloco.sdk.internal.w>) dVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r27, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.d r28, double r29, com.moloco.sdk.common_adapter_internal.d r31, boolean r32, java.lang.String r33, zu.d<? super com.moloco.sdk.internal.w> r34) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f$d, double, com.moloco.sdk.common_adapter_internal.d, boolean, java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r18, java.util.List<java.lang.String> r19, zu.d<? super com.moloco.sdk.internal.w> r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, java.util.List, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d1, code lost:
    
        r25 = r8;
        r26 = r9;
        r27 = r10;
        r6 = r28;
        r0 = r0;
        r3 = r3;
        r20 = r20;
        r9 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0182 -> B:40:0x0188). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q r33, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a r34, double r35, com.moloco.sdk.common_adapter_internal.d r37, boolean r38, java.lang.String r39, zu.d<? super com.moloco.sdk.internal.w> r40) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f$a, double, com.moloco.sdk.common_adapter_internal.d, boolean, java.lang.String, zu.d):java.lang.Object");
    }

    public static final b a(tu.o oVar) {
        return (b) oVar.getValue();
    }

    public static final b a(f fVar, a aVar) {
        return fVar.a(aVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f a(f fVar, List it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return fVar.a((List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>) it);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c a(f fVar, com.moloco.sdk.common_adapter_internal.d dVar, List it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return fVar.a((List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>) it, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r r18, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w> r19, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r20, java.util.List<java.lang.String> r21, double r22, java.lang.Long r24, com.moloco.sdk.common_adapter_internal.d r25, boolean r26, java.lang.String r27, zu.d<? super com.moloco.sdk.internal.w> r28) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r, java.util.List, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, java.util.List, double, java.lang.Long, com.moloco.sdk.common_adapter_internal.d, boolean, java.lang.String, zu.d):java.lang.Object");
    }

    public final b a(a aVar) {
        List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i>> listD;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (aVar != null && (listD = aVar.d()) != null) {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj : list) {
                    if (!f48848h.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) obj)) {
                        arrayList8.add(obj);
                    }
                }
                Iterator it2 = arrayList8.iterator();
                while (it2.hasNext()) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) it2.next();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVarH = iVar.h();
                    if (jVarH instanceof j.b) {
                        r rVarA = ((j.b) iVar.h()).a();
                        v0.addAll(arrayList, rVarA.f());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVarG = rVarA.g();
                        if (aVarG != null) {
                            v0.addAll(arrayList2, aVarG.b());
                            v0.addAll(arrayList3, aVarG.c());
                        }
                        v0.addAll(arrayList6, rVarA.c());
                    } else if (jVarH instanceof j.a) {
                        v0.addAll(arrayList7, ((j.a) iVar.h()).a());
                    } else {
                        throw new t();
                    }
                }
                arrayList4.add(arrayList6);
                arrayList5.add(arrayList7);
            }
        }
        return new b(arrayList, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a(null, arrayList2, arrayList3), arrayList4, arrayList5);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c a(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> list, com.moloco.sdk.common_adapter_internal.d dVar) {
        List<String> listEmptyList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
            if (!f48848h.a(gVar) && !gVar.h().isEmpty()) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) y0.firstOrNull(y0.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a(Integer.valueOf(dVar.getWidthPx()), Integer.valueOf(dVar.getHeightPx()))));
        if (gVar2 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) y0.first(y0.sortedWith(gVar2.h(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.b()));
        Integer numI = gVar2.i();
        int iIntValue = numI != null ? numI.intValue() : 0;
        Integer numF = gVar2.f();
        int iIntValue2 = numF != null ? numF.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVarD = gVar2.d();
        String strA = hVarD != null ? hVarD.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVarD2 = gVar2.d();
        if (hVarD2 == null || (listEmptyList = hVarD2.b()) == null) {
            listEmptyList = p0.emptyList();
        }
        List<String> list2 = listEmptyList;
        List<w> listE = gVar2.e();
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w) it.next()).f());
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c(a0Var, iIntValue, iIntValue2, strA, list2, arrayList2);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f a(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> list) {
        List<String> listEmptyList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!f48848h.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj)) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) y0.firstOrNull(y0.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a()));
        if (nVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0VarG = nVar.g();
        Integer numI = nVar.i();
        int iIntValue = numI != null ? numI.intValue() : 0;
        Integer numD = nVar.d();
        int iIntValue2 = numD != null ? numD.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVarB = nVar.b();
        String strA = oVarB != null ? oVarB.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVarB2 = nVar.b();
        if (oVarB2 == null || (listEmptyList = oVarB2.b()) == null) {
            listEmptyList = p0.emptyList();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f(a0VarG, iIntValue, iIntValue2, strA, listEmptyList, nVar.h(), nVar.c(), nVar.e());
    }
}
