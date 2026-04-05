package com.moloco.sdk.internal;

import com.digidust.elokence.akinator.freemium.R;
import g0.f2;
import g0.i2;
import j1.m0;
import kotlin.jvm.internal.e0;
import p0.d0;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f45918a = tu.q.lazy(new a1.k(6));

    /* renamed from: b, reason: collision with root package name */
    public static final long f45919b = m0.f68918b.m4836getWhite0d7_KjU();

    /* renamed from: c, reason: collision with root package name */
    public static final long f45920c = v.a();

    /* renamed from: d, reason: collision with root package name */
    public static final long f45921d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.t f45922b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.i f45923c;

        public a(com.moloco.sdk.internal.ortb.model.t tVar, com.moloco.sdk.internal.ortb.model.i iVar) {
            this.f45922b = tVar;
            this.f45923c = iVar;
        }

        public final kv.b a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(-1299178940);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1299178940, i10, -1, "com.moloco.sdk.internal.determineSkipCloseBehaviorFromDec.<anonymous> (AggregatedOptions.kt:182)");
            }
            com.moloco.sdk.internal.ortb.model.t tVar = this.f45922b;
            float fM6817constructorimpl = s2.i.m6817constructorimpl(tVar.c());
            long jM6833DpSizeYgX7TsA = s2.j.m6833DpSizeYgX7TsA(fM6817constructorimpl, fM6817constructorimpl);
            e1.d dVarA = g.a(tVar.i(), tVar.m());
            i2 i2VarM3870PaddingValues0680j_4 = f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(tVar.k()));
            long jG = tVar.g();
            long sp2 = s2.a0.getSp(tVar.c());
            s2.a0.m6725checkArithmeticR2X_6o(sp2);
            long jPack = s2.a0.pack(s2.z.m6992getRawTypeimpl(sp2), s2.z.m6994getValueimpl(sp2) / 2);
            long jM6916timesGh9hcWk = s2.o.m6916timesGh9hcWk(jM6833DpSizeYgX7TsA, 0.4f);
            m0 m0VarA = tVar.a();
            kv.b bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i.a(dVarA, i2VarM3870PaddingValues0680j_4, jG, jM6833DpSizeYgX7TsA, jPack, g.b(jM6916timesGh9hcWk, m0VarA != null ? m0VarA.m4868unboximpl() : g.f45919b, wVar, 0), null, this.f45923c, wVar, 0, 64);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f45924b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.t f45925c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.i f45926e;

        public b(boolean z10, com.moloco.sdk.internal.ortb.model.t tVar, com.moloco.sdk.internal.ortb.model.i iVar) {
            this.f45924b = z10;
            this.f45925c = tVar;
            this.f45926e = iVar;
        }

        public final kv.b a(p0.w wVar, int i10) {
            kv.b bVarA;
            wVar.startReplaceableGroup(2061132145);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(2061132145, i10, -1, "com.moloco.sdk.internal.toCloseButton.<anonymous> (AggregatedOptions.kt:200)");
            }
            if (this.f45924b) {
                bVarA = null;
            } else {
                com.moloco.sdk.internal.ortb.model.t tVar = this.f45925c;
                float fM6817constructorimpl = s2.i.m6817constructorimpl(tVar.c());
                long jM6833DpSizeYgX7TsA = s2.j.m6833DpSizeYgX7TsA(fM6817constructorimpl, fM6817constructorimpl);
                e1.d dVarA = g.a(tVar.i(), tVar.m());
                i2 i2VarM3870PaddingValues0680j_4 = f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(tVar.k()));
                long jG = tVar.g();
                long sp2 = s2.a0.getSp(tVar.c());
                s2.a0.m6725checkArithmeticR2X_6o(sp2);
                long jPack = s2.a0.pack(s2.z.m6992getRawTypeimpl(sp2), s2.z.m6994getValueimpl(sp2) / 2);
                m1.e eVarPainterResource = d2.c.painterResource(R.drawable.moloco_close, wVar, 0);
                long jM6916timesGh9hcWk = s2.o.m6916timesGh9hcWk(jM6833DpSizeYgX7TsA, 0.45f);
                m0 m0VarA = tVar.a();
                bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.a(dVarA, i2VarM3870PaddingValues0680j_4, jG, jM6833DpSizeYgX7TsA, jPack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.a(eVarPainterResource, jM6916timesGh9hcWk, null, m0VarA != null ? m0VarA.m4868unboximpl() : g.f45919b, wVar, 0, 4), null, this.f45926e, wVar, 0, 64);
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.p f45927b;

        public c(com.moloco.sdk.internal.ortb.model.p pVar) {
            this.f45927b = pVar;
        }

        public final kv.u a(p0.w wVar, int i10) {
            long jM6833DpSizeYgX7TsA;
            wVar.startReplaceableGroup(1012987991);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1012987991, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:77)");
            }
            com.moloco.sdk.internal.ortb.model.p pVar = this.f45927b;
            if (pVar.k().c() != null) {
                float fM6817constructorimpl = s2.i.m6817constructorimpl(r2.m7061unboximpl());
                jM6833DpSizeYgX7TsA = s2.j.m6833DpSizeYgX7TsA(fM6817constructorimpl, fM6817constructorimpl);
            } else {
                jM6833DpSizeYgX7TsA = g.f45921d;
            }
            e1.d dVarA = g.a(pVar.k().g(), pVar.k().m());
            i2 i2VarM3870PaddingValues0680j_4 = f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(pVar.k().k()));
            long jM6916timesGh9hcWk = s2.o.m6916timesGh9hcWk(jM6833DpSizeYgX7TsA, 0.6f);
            long jE = pVar.k().e();
            m0 m0VarA = pVar.k().a();
            kv.u uVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(jM6833DpSizeYgX7TsA, jM6916timesGh9hcWk, null, m0VarA != null ? m0VarA.m4868unboximpl() : g.f45919b, dVarA, i2VarM3870PaddingValues0680j_4, jE, d2.c.painterResource(R.drawable.moloco_volume_off, wVar, 0), d2.c.painterResource(R.drawable.moloco_volume_on, wVar, 0), null, wVar, 0, 516);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return uVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.p f45928b;

        public d(com.moloco.sdk.internal.ortb.model.p pVar) {
            this.f45928b = pVar;
        }

        public final kv.b a(p0.w wVar, int i10) {
            kv.b bVarA;
            wVar.startReplaceableGroup(-168563086);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-168563086, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:92)");
            }
            com.moloco.sdk.internal.ortb.model.p pVar = this.f45928b;
            com.moloco.sdk.internal.ortb.model.t tVarO = pVar.o();
            if (tVarO == null) {
                bVarA = null;
            } else {
                float fM6817constructorimpl = s2.i.m6817constructorimpl(tVarO.c());
                long jM6833DpSizeYgX7TsA = s2.j.m6833DpSizeYgX7TsA(fM6817constructorimpl, fM6817constructorimpl);
                e1.d dVarA = g.a(tVarO.i(), tVarO.m());
                i2 i2VarM3870PaddingValues0680j_4 = f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(tVarO.k()));
                long jG = tVarO.g();
                long sp2 = s2.a0.getSp(tVarO.c());
                s2.a0.m6725checkArithmeticR2X_6o(sp2);
                long jPack = s2.a0.pack(s2.z.m6992getRawTypeimpl(sp2), s2.z.m6994getValueimpl(sp2) / 2);
                long jM6916timesGh9hcWk = s2.o.m6916timesGh9hcWk(jM6833DpSizeYgX7TsA, 0.4f);
                m0 m0VarA = tVarO.a();
                bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i.a(dVarA, i2VarM3870PaddingValues0680j_4, jG, jM6833DpSizeYgX7TsA, jPack, g.b(jM6916timesGh9hcWk, m0VarA != null ? m0VarA.m4868unboximpl() : g.f45919b, wVar, 0), null, pVar.e(), wVar, 0, 64);
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f45929b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.p f45930c;

        public e(boolean z10, com.moloco.sdk.internal.ortb.model.p pVar) {
            this.f45929b = z10;
            this.f45930c = pVar;
        }

        public final kv.u a(p0.w wVar, int i10) {
            kv.u uVarA;
            p0.w wVar2;
            com.moloco.sdk.internal.ortb.model.g gVarG;
            wVar.startReplaceableGroup(616016756);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(616016756, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:110)");
            }
            if (this.f45929b || (gVarG = this.f45930c.g()) == null) {
                uVarA = null;
                wVar2 = wVar;
            } else {
                e1.d dVarA = g.a(gVarG.e(), gVarG.m());
                i2 i2VarM3870PaddingValues0680j_4 = f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(gVarG.i()));
                String strK = gVarG.k();
                long jC = gVarG.c();
                m0 m0VarA = gVarG.a();
                wVar2 = wVar;
                uVarA = v.a(dVarA, i2VarM3870PaddingValues0680j_4, strK, jC, m0VarA != null ? m0VarA.m4868unboximpl() : v.a(), gVarG.g(), wVar2, 0, 0);
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar2.endReplaceableGroup();
            return uVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f45931b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.p f45932c;

        public f(boolean z10, com.moloco.sdk.internal.ortb.model.p pVar) {
            this.f45931b = z10;
            this.f45932c = pVar;
        }

        public final kv.s a(p0.w wVar, int i10) {
            kv.s sVarA;
            p0.w wVar2;
            com.moloco.sdk.internal.ortb.model.q qVarM;
            wVar.startReplaceableGroup(962638324);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(962638324, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:128)");
            }
            if (this.f45931b || (qVarM = this.f45932c.m()) == null) {
                sVarA = null;
                wVar2 = wVar;
            } else {
                wVar2 = wVar;
                sVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(g.a(qVarM.c(), qVarM.g()), f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(qVarM.e())), qVarM.a(), wVar2, 0, 0);
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar2.endReplaceableGroup();
            return sVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.g$g, reason: collision with other inner class name */
    public static final class C0365g implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.p f45933b;

        public C0365g(com.moloco.sdk.internal.ortb.model.p pVar) {
            this.f45933b = pVar;
        }

        public final kv.t a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(524680050);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(524680050, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:142)");
            }
            com.moloco.sdk.internal.ortb.model.u uVarQ = this.f45933b.q();
            wVar.startReplaceableGroup(-1135751215);
            kv.t tVarA = uVarQ == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(g.a(uVarQ.a(), uVarQ.e()), f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(uVarQ.c())), wVar, 0, 0);
            wVar.endReplaceableGroup();
            if (tVarA == null) {
                tVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(null, null, wVar, 0, 3);
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return tVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    static {
        float f10 = 30;
        f45921d = s2.j.m6833DpSizeYgX7TsA(s2.i.m6817constructorimpl(f10), s2.i.m6817constructorimpl(f10));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n b(com.moloco.sdk.internal.ortb.model.p pVar) {
        e0.checkNotNullParameter(pVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVarA = a(pVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n(b(pVar, false), lVarA, lVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.moloco.sdk.internal.ortb.model.p c() {
        int iM7056constructorimpl = k0.m7056constructorimpl(30);
        com.moloco.sdk.internal.ortb.model.l lVar = com.moloco.sdk.internal.ortb.model.l.f46142f;
        com.moloco.sdk.internal.ortb.model.v vVar = com.moloco.sdk.internal.ortb.model.v.f46213c;
        long j10 = f45920c;
        com.moloco.sdk.internal.ortb.model.t tVar = new com.moloco.sdk.internal.ortb.model.t(5, 10, iM7056constructorimpl, lVar, vVar, j10, (m0) null, 64, (kotlin.jvm.internal.u) null);
        com.moloco.sdk.internal.ortb.model.q qVar = new com.moloco.sdk.internal.ortb.model.q(0, com.moloco.sdk.internal.ortb.model.l.f46141e, com.moloco.sdk.internal.ortb.model.v.f46215f, j10, null);
        boolean z10 = false;
        com.moloco.sdk.internal.ortb.model.o oVar = new com.moloco.sdk.internal.ortb.model.o(z10, 10, com.moloco.sdk.internal.ortb.model.l.f46140c, vVar, j10, (k0) null, (m0) null, 96, (kotlin.jvm.internal.u) null);
        boolean z11 = false;
        String str = null;
        com.moloco.sdk.internal.ortb.model.g gVar = null;
        boolean z12 = true;
        com.moloco.sdk.internal.ortb.model.j jVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        return new com.moloco.sdk.internal.ortb.model.p(tVar, tVar, qVar, oVar, gVar, z12, new com.moloco.sdk.internal.ortb.model.a(z10, z11, str, 6, (kotlin.jvm.internal.u) null), (com.moloco.sdk.internal.ortb.model.u) (0 == true ? 1 : 0), jVar, (com.moloco.sdk.internal.ortb.model.i) objArr2, 384, (kotlin.jvm.internal.u) objArr);
    }

    public static final com.moloco.sdk.internal.ortb.model.p f() {
        return (com.moloco.sdk.internal.ortb.model.p) f45918a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n a(com.moloco.sdk.internal.ortb.model.p pVar) {
        e0.checkNotNullParameter(pVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVarA = a(pVar, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n(b(pVar, true), lVarA, lVarA);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n b() {
        return b(f());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n a() {
        return a(f());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 b(com.moloco.sdk.internal.ortb.model.p pVar, boolean z10) {
        com.moloco.sdk.internal.ortb.model.k kVarE;
        k0 k0VarA;
        boolean zI = pVar.k().i();
        Boolean bool = pVar.o() == null ? null : Boolean.TRUE;
        com.moloco.sdk.internal.ortb.model.t tVarO = pVar.o();
        int iM7061unboximpl = 0;
        int iE = tVarO != null ? tVarO.e() : 0;
        com.moloco.sdk.internal.ortb.model.a aVarA = pVar.a();
        boolean z11 = aVarA != null && aVarA.a() && pVar.a().e();
        com.moloco.sdk.internal.ortb.model.a aVarA2 = pVar.a();
        boolean z12 = aVarA2 != null && aVarA2.a();
        int iE2 = pVar.c().e();
        com.moloco.sdk.internal.ortb.model.j jVarI = pVar.i();
        if (jVarI != null && (kVarE = jVarI.e()) != null && (k0VarA = kVarE.a()) != null) {
            iM7061unboximpl = k0VarA.m7061unboximpl();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0(zI, bool, iE, iE2, iM7061unboximpl, z11, z12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(0L, new c(pVar), a(pVar.c(), z10, pVar.e()), new d(pVar), new e(z10, pVar), q.a(pVar.s()), new f(z10, pVar), new C0365g(pVar), (kv.p) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j) null, 769, (Object) null));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l a(com.moloco.sdk.internal.ortb.model.p pVar, boolean z10) {
        com.moloco.sdk.internal.ortb.model.k kVarE;
        k0 k0VarA;
        int iE = pVar.c().e();
        kv.w wVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i.a(0L, a(z10, pVar.c(), pVar.i(), pVar.e()), 1, null);
        com.moloco.sdk.internal.ortb.model.j jVarI = pVar.i();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l(iE, wVarA, (jVarI == null || (kVarE = jVarI.e()) == null || (k0VarA = kVarE.a()) == null) ? 0 : k0VarA.m7061unboximpl(), a(pVar.c(), z10, null, 2, null));
    }

    public static final kv.p a(boolean z10, com.moloco.sdk.internal.ortb.model.t close, com.moloco.sdk.internal.ortb.model.j jVar, com.moloco.sdk.internal.ortb.model.i iVar) {
        e0.checkNotNullParameter(close, "close");
        if (jVar == null) {
            return a(close, z10, iVar);
        }
        return new a(close, iVar);
    }

    public static final kv.p a(com.moloco.sdk.internal.ortb.model.t tVar, boolean z10, com.moloco.sdk.internal.ortb.model.i iVar) {
        return new b(z10, tVar, iVar);
    }

    public static /* synthetic */ kv.p a(com.moloco.sdk.internal.ortb.model.t tVar, boolean z10, com.moloco.sdk.internal.ortb.model.i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = null;
        }
        return a(tVar, z10, iVar);
    }

    public static final e1.d a(com.moloco.sdk.internal.ortb.model.l horizontalAlignment, com.moloco.sdk.internal.ortb.model.v verticalAlignment) {
        e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        e0.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        com.moloco.sdk.internal.ortb.model.v vVar = com.moloco.sdk.internal.ortb.model.v.f46213c;
        if (verticalAlignment == vVar && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46140c || horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46143g)) {
            return e1.d.f53469a.getTopStart();
        }
        if (verticalAlignment == vVar && horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46141e) {
            return e1.d.f53469a.getTopCenter();
        }
        if (verticalAlignment == vVar && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46142f || horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46144h)) {
            return e1.d.f53469a.getTopEnd();
        }
        com.moloco.sdk.internal.ortb.model.v vVar2 = com.moloco.sdk.internal.ortb.model.v.f46214e;
        if (verticalAlignment == vVar2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46140c || horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46143g)) {
            return e1.d.f53469a.getCenterStart();
        }
        if (verticalAlignment == vVar2 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46141e) {
            return e1.d.f53469a.getCenter();
        }
        if (verticalAlignment == vVar2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46142f || horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46144h)) {
            return e1.d.f53469a.getCenterEnd();
        }
        com.moloco.sdk.internal.ortb.model.v vVar3 = com.moloco.sdk.internal.ortb.model.v.f46215f;
        return (verticalAlignment == vVar3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46140c || horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46143g)) ? e1.d.f53469a.getBottomStart() : (verticalAlignment == vVar3 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46141e) ? e1.d.f53469a.getBottomCenter() : (verticalAlignment == vVar3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46142f || horizontalAlignment == com.moloco.sdk.internal.ortb.model.l.f46144h)) ? e1.d.f53469a.getBottomEnd() : e1.d.f53469a.getTopStart();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x b(long j10, long j11, p0.w wVar, int i10) {
        wVar.startReplaceableGroup(-868162195);
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-868162195, i10, -1, "com.moloco.sdk.internal.defaultMolocoSkipAfterCountdownButtonPart (AggregatedOptions.kt:159)");
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x xVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i.a(d2.c.painterResource(2131231841, wVar, 0), j10, null, j11, wVar, ((i10 << 3) & 112) | ((i10 << 6) & 7168), 4);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return xVarA;
    }
}
