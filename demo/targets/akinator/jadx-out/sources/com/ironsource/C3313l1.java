package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.BKC.JzVV;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.l1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3313l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3313l1 f37125a = new C3313l1();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$a */
    public static final class a implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final IronSource.a f37126a;

        public a(IronSource.a value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f37126a = value;
        }

        private final IronSource.a a() {
            return this.f37126a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f37126a == ((a) obj).f37126a;
        }

        public int hashCode() {
            return this.f37126a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.f37126a + ")";
        }

        public final a a(IronSource.a value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return new a(value);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f37126a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(RnJusJ.zfEDuHYtfvDRc, Integer.valueOf(C3518wf.c(this.f37126a)));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$b */
    public static final class b implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37127a;

        public b(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f37127a = value;
        }

        private final String a() {
            return this.f37127a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.e0.areEqual(this.f37127a, ((b) obj).f37127a);
        }

        public int hashCode() {
            return this.f37127a.hashCode();
        }

        public String toString() {
            return a.b.l("AdIdentifier(value=", this.f37127a, ")");
        }

        public final b a(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return new b(value);
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f37127a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f37127a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$c */
    public static final class c implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final AdSize f37128a;

        public c(AdSize size) {
            kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
            this.f37128a = size;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC3331m1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.util.Map<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
                com.unity3d.ironsourceads.AdSize r0 = r3.f37128a
                java.lang.String r0 = r0.getSizeDescription()
                int r1 = r0.hashCode()
                r2 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
                if (r1 == r2) goto L45
                r2 = 72205083(0x44dc31b, float:2.4187222E-36)
                if (r1 == r2) goto L3a
                r2 = 446888797(0x1aa2fb5d, float:6.740773E-23)
                if (r1 == r2) goto L2f
                r2 = 1951953708(0x7458732c, float:6.859571E31)
                if (r1 == r2) goto L24
                goto L4d
            L24:
                java.lang.String r1 = "BANNER"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2d
                goto L4d
            L2d:
                r0 = 1
                goto L50
            L2f:
                java.lang.String r1 = "LEADERBOARD"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L38
                goto L4d
            L38:
                r0 = 4
                goto L50
            L3a:
                java.lang.String r1 = "LARGE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L43
                goto L4d
            L43:
                r0 = 2
                goto L50
            L45:
                java.lang.String r1 = "MEDIUM_RECTANGLE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L4f
            L4d:
                r0 = 0
                goto L50
            L4f:
                r0 = 3
            L50:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "bannerAdSize"
                r4.put(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3313l1.c.a(java.util.Map):void");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$d */
    public static final class d implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37129a;

        public d(String auctionId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionId, "auctionId");
            this.f37129a = auctionId;
        }

        private final String a() {
            return this.f37129a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.e0.areEqual(this.f37129a, ((d) obj).f37129a);
        }

        public int hashCode() {
            return this.f37129a.hashCode();
        }

        public String toString() {
            return a.b.l("AuctionId(auctionId=", this.f37129a, ")");
        }

        public final d a(String auctionId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionId, "auctionId");
            return new d(auctionId);
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f37129a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.f37129a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$e */
    public static final class e implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37130a;

        public e(int i10) {
            this.f37130a = i10;
        }

        private final int a() {
            return this.f37130a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f37130a == ((e) obj).f37130a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37130a);
        }

        public String toString() {
            return p0.o2.k(this.f37130a, "DemandOnly(value=", ")");
        }

        public final e a(int i10) {
            return new e(i10);
        }

        public static /* synthetic */ e a(e eVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = eVar.f37130a;
            }
            return eVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f37130a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$f */
    public static final class f implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f37131a;

        public f(long j10) {
            this.f37131a = j10;
        }

        private final long a() {
            return this.f37131a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f37131a == ((f) obj).f37131a;
        }

        public int hashCode() {
            return Long.hashCode(this.f37131a);
        }

        public String toString() {
            return p0.o2.n(this.f37131a, "Duration(duration=", ")");
        }

        public final f a(long j10) {
            return new f(j10);
        }

        public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f37131a;
            }
            return fVar.a(j10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f37131a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$g */
    public static final class g implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37132a;

        public g(String dynamicSourceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.f37132a = dynamicSourceId;
        }

        private final String a() {
            return this.f37132a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.e0.areEqual(this.f37132a, ((g) obj).f37132a);
        }

        public int hashCode() {
            return this.f37132a.hashCode();
        }

        public String toString() {
            return a.b.l("DynamicDemandSourceId(dynamicSourceId=", this.f37132a, ")");
        }

        public final g a(String dynamicSourceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        public static /* synthetic */ g a(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f37132a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f37132a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$h */
    public static final class h implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37133a;

        public h(String sourceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sourceId, "sourceId");
            this.f37133a = sourceId;
        }

        private final String a() {
            return this.f37133a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.e0.areEqual(this.f37133a, ((h) obj).f37133a);
        }

        public int hashCode() {
            return this.f37133a.hashCode();
        }

        public String toString() {
            return a.b.l("DynamicSourceId(sourceId=", this.f37133a, ")");
        }

        public final h a(String sourceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sourceId, "sourceId");
            return new h(sourceId);
        }

        public static /* synthetic */ h a(h hVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.f37133a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f37133a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$i */
    public static final class i implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f37134a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$j */
    public static final class j implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37135a;

        public j(int i10) {
            this.f37135a = i10;
        }

        private final int a() {
            return this.f37135a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f37135a == ((j) obj).f37135a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37135a);
        }

        public String toString() {
            return p0.o2.k(this.f37135a, "ErrorCode(code=", ")");
        }

        public final j a(int i10) {
            return new j(i10);
        }

        public static /* synthetic */ j a(j jVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = jVar.f37135a;
            }
            return jVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.f37135a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$k */
    public static final class k implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37136a;

        public k(String str) {
            this.f37136a = str;
        }

        private final String a() {
            return this.f37136a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && kotlin.jvm.internal.e0.areEqual(this.f37136a, ((k) obj).f37136a);
        }

        public int hashCode() {
            String str = this.f37136a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return a.b.l("ErrorReason(reason=", this.f37136a, ")");
        }

        public final k a(String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kVar.f37136a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            String str = this.f37136a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f37136a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$l */
    public static final class l implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37137a;

        public l(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f37137a = value;
        }

        private final String a() {
            return this.f37137a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && kotlin.jvm.internal.e0.areEqual(this.f37137a, ((l) obj).f37137a);
        }

        public int hashCode() {
            return this.f37137a.hashCode();
        }

        public String toString() {
            return a.b.l("Ext1(value=", this.f37137a, ")");
        }

        public final l a(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return new l(value);
        }

        public static /* synthetic */ l a(l lVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = lVar.f37137a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f37137a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$m */
    public static final class m implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f37138a;

        public m(JSONObject jSONObject) {
            this.f37138a = jSONObject;
        }

        private final JSONObject a() {
            return this.f37138a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && kotlin.jvm.internal.e0.areEqual(this.f37138a, ((m) obj).f37138a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f37138a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.f37138a + ")";
        }

        public final m a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = mVar.f37138a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            JSONObject jSONObject = this.f37138a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$n */
    public static final class n implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37139a;

        public n(int i10) {
            this.f37139a = i10;
        }

        private final int a() {
            return this.f37139a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f37139a == ((n) obj).f37139a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37139a);
        }

        public String toString() {
            return p0.o2.k(this.f37139a, "InstanceType(instanceType=", ")");
        }

        public final n a(int i10) {
            return new n(i10);
        }

        public static /* synthetic */ n a(n nVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = nVar.f37139a;
            }
            return nVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f37139a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$o */
    public static final class o implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37140a;

        public o(int i10) {
            this.f37140a = i10;
        }

        private final int a() {
            return this.f37140a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f37140a == ((o) obj).f37140a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37140a);
        }

        public final o a(int i10) {
            return new o(i10);
        }

        public String toString() {
            return p0.o2.k(this.f37140a, JzVV.dBmIlgPiGwzDFc, ")");
        }

        public static /* synthetic */ o a(o oVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oVar.f37140a;
            }
            return oVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f37140a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$p */
    public static final class p implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37141a;

        public p(int i10) {
            this.f37141a = i10;
        }

        private final int a() {
            return this.f37141a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f37141a == ((p) obj).f37141a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37141a);
        }

        public String toString() {
            return p0.o2.k(this.f37141a, "OneFlow(value=", ")");
        }

        public final p a(int i10) {
            return new p(i10);
        }

        public static /* synthetic */ p a(p pVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pVar.f37141a;
            }
            return pVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f37141a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$q */
    public static final class q implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37142a;

        public q(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f37142a = value;
        }

        private final String a() {
            return this.f37142a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.e0.areEqual(this.f37142a, ((q) obj).f37142a);
        }

        public int hashCode() {
            return this.f37142a.hashCode();
        }

        public String toString() {
            return a.b.l("Placement(value=", this.f37142a, ")");
        }

        public final q a(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return new q(value);
        }

        public static /* synthetic */ q a(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.f37142a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.f37142a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$r */
    public static final class r implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37143a;

        public r(int i10) {
            this.f37143a = i10;
        }

        private final int a() {
            return this.f37143a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f37143a == ((r) obj).f37143a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37143a);
        }

        public String toString() {
            return p0.o2.k(this.f37143a, "Programmatic(programmatic=", ")");
        }

        public final r a(int i10) {
            return new r(i10);
        }

        public static /* synthetic */ r a(r rVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = rVar.f37143a;
            }
            return rVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f37143a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$s */
    public static final class s implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37144a;

        public s(String sourceName) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sourceName, "sourceName");
            this.f37144a = sourceName;
        }

        private final String a() {
            return this.f37144a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.e0.areEqual(this.f37144a, ((s) obj).f37144a);
        }

        public int hashCode() {
            return this.f37144a.hashCode();
        }

        public String toString() {
            return a.b.l("Provider(sourceName=", this.f37144a, ")");
        }

        public final s a(String sourceName) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sourceName, "sourceName");
            return new s(sourceName);
        }

        public static /* synthetic */ s a(s sVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sVar.f37144a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f37144a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$t */
    public static final class t implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37145a;

        public t(int i10) {
            this.f37145a = i10;
        }

        private final int a() {
            return this.f37145a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f37145a == ((t) obj).f37145a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37145a);
        }

        public String toString() {
            return p0.o2.k(this.f37145a, "RewardAmount(value=", ")");
        }

        public final t a(int i10) {
            return new t(i10);
        }

        public static /* synthetic */ t a(t tVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tVar.f37145a;
            }
            return tVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f37145a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$u */
    public static final class u implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37146a;

        public u(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f37146a = value;
        }

        private final String a() {
            return this.f37146a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && kotlin.jvm.internal.e0.areEqual(this.f37146a, ((u) obj).f37146a);
        }

        public int hashCode() {
            return this.f37146a.hashCode();
        }

        public String toString() {
            return a.b.l("RewardName(value=", this.f37146a, ")");
        }

        public final u a(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return new u(value);
        }

        public static /* synthetic */ u a(u uVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uVar.f37146a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f37146a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$v */
    public static final class v implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37147a;

        public v(String version) {
            kotlin.jvm.internal.e0.checkNotNullParameter(version, "version");
            this.f37147a = version;
        }

        private final String a() {
            return this.f37147a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && kotlin.jvm.internal.e0.areEqual(this.f37147a, ((v) obj).f37147a);
        }

        public int hashCode() {
            return this.f37147a.hashCode();
        }

        public String toString() {
            return a.b.l("SdkVersion(version=", this.f37147a, ")");
        }

        public final v a(String version) {
            kotlin.jvm.internal.e0.checkNotNullParameter(version, "version");
            return new v(version);
        }

        public static /* synthetic */ v a(v vVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = vVar.f37147a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f37147a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$w */
    public static final class w implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f37148a;

        public w(int i10) {
            this.f37148a = i10;
        }

        private final int a() {
            return this.f37148a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f37148a == ((w) obj).f37148a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37148a);
        }

        public String toString() {
            return p0.o2.k(this.f37148a, "SessionDepth(sessionDepth=", ")");
        }

        public final w a(int i10) {
            return new w(i10);
        }

        public static /* synthetic */ w a(w wVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = wVar.f37148a;
            }
            return wVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f37148a));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$x */
    public static final class x implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37149a;

        public x(String subProviderId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(subProviderId, "subProviderId");
            this.f37149a = subProviderId;
        }

        private final String a() {
            return this.f37149a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && kotlin.jvm.internal.e0.areEqual(this.f37149a, ((x) obj).f37149a);
        }

        public int hashCode() {
            return this.f37149a.hashCode();
        }

        public String toString() {
            return a.b.l("SubProviderId(subProviderId=", this.f37149a, ")");
        }

        public final x a(String subProviderId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        public static /* synthetic */ x a(x xVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = xVar.f37149a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.f37149a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.l1$y */
    public static final class y implements InterfaceC3331m1 {

        /* renamed from: a, reason: collision with root package name */
        private final String f37150a;

        public y(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f37150a = value;
        }

        private final String a() {
            return this.f37150a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && kotlin.jvm.internal.e0.areEqual(this.f37150a, ((y) obj).f37150a);
        }

        public int hashCode() {
            return this.f37150a.hashCode();
        }

        public String toString() {
            return a.b.l("TransId(value=", this.f37150a, ")");
        }

        public final y a(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return new y(value);
        }

        public static /* synthetic */ y a(y yVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = yVar.f37150a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3331m1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f37150a);
        }
    }

    private C3313l1() {
    }
}
