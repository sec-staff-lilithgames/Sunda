package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.v0;
import bv.n;
import e1.v;
import e2.r0;
import e2.u0;
import i1.o;
import j1.k2;
import j1.l2;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import p0.g1;
import p0.h1;
import p0.j2;
import p0.o5;
import p0.w;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class l {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f48734i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.a f48735j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, kv.a aVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48734i = i10;
            this.f48735j = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f48734i, this.f48735j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            if (this.f48734i == 0) {
                this.f48735j.invoke();
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48736i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c0.e f48737j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0.e eVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f48737j = eVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f48737j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48736i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                this.f48736i = 1;
                if (this.f48737j.stop(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f48738a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f48739b;

        public d(b1 b1Var, v0 v0Var) {
            this.f48738a = b1Var;
            this.f48739b = v0Var;
        }

        @Override // p0.g1
        public void dispose() {
            this.f48738a.getLifecycle().removeObserver(this.f48739b);
        }
    }

    public static final x0 a(long j10, long j11, v vVar, float f10, float f11, kv.a aVar, b1 b1Var, CoroutineScope coroutineScope, int i10, int i11, int i12, int i13, w wVar, int i14) {
        a(j10, j11, vVar, f10, f11, aVar, b1Var, coroutineScope, i10, i11, wVar, i12 | 1, i13);
        return x0.f87415a;
    }

    public static final x0 b(String str, u0 semantics) {
        e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setContentDescription(semantics, str);
        r0.setTestTag(semantics, str);
        return x0.f87415a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48729i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c0.e f48730j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ float f48731k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f48732l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j2 f48733m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0.e eVar, float f10, int i10, j2 j2Var, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48730j = eVar;
            this.f48731k = f10;
            this.f48732l = i10;
            this.f48733m = j2Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f48730j, this.f48731k, this.f48732l, this.f48733m, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        
            if (c0.e.animateTo$default(r6, r7, r8, null, null, r14, 12, null) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
        
            if (r4.stop(r14) == r0) goto L29;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r14.f48729i
                r2 = 3
                r3 = 1
                c0.e r4 = r14.f48730j
                r5 = 2
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 == r5) goto L22
                if (r1 != r2) goto L19
                tu.a0.throwOnFailure(r15)
            L16:
                r11 = r14
                goto L8d
            L19:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                r0 = 0
                java.lang.String r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB.loLyCayGXLF
                r15.<init>(r0)
                throw r15
            L22:
                tu.a0.throwOnFailure(r15)     // Catch: java.util.concurrent.CancellationException -> L16
                goto L16
            L26:
                tu.a0.throwOnFailure(r15)
                goto L3d
            L2a:
                tu.a0.throwOnFailure(r15)
                float r15 = r14.f48731k
                java.lang.Float r15 = bv.b.boxFloat(r15)
                r14.f48729i = r3
                java.lang.Object r15 = r4.snapTo(r15, r14)
                if (r15 != r0) goto L3d
                r11 = r14
                goto L8c
            L3d:
                p0.j2 r15 = r14.f48733m
                boolean r15 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.l.c(r15)
                if (r15 == 0) goto L83
                java.lang.Object r15 = r4.getValue()
                java.lang.Number r15 = (java.lang.Number) r15
                float r15 = r15.floatValue()
                r1 = 0
                int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r15 <= 0) goto L83
                int r15 = r14.f48732l
                int r15 = r15 * 1000
                int r15 = tu.k0.m7056constructorimpl(r15)
                long r2 = (long) r15
                r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r2 = r2 & r6
                c0.e r6 = r14.f48730j     // Catch: java.util.concurrent.CancellationException -> L16
                java.lang.Float r7 = bv.b.boxFloat(r1)     // Catch: java.util.concurrent.CancellationException -> L16
                int r15 = (int) r2     // Catch: java.util.concurrent.CancellationException -> L16
                c0.g0 r1 = c0.i0.getLinearEasing()     // Catch: java.util.concurrent.CancellationException -> L16
                r2 = 0
                r3 = 0
                c0.m2 r8 = c0.o.tween$default(r15, r3, r1, r5, r2)     // Catch: java.util.concurrent.CancellationException -> L16
                r14.f48729i = r5     // Catch: java.util.concurrent.CancellationException -> L16
                r9 = 0
                r10 = 0
                r12 = 12
                r13 = 0
                r11 = r14
                java.lang.Object r15 = c0.e.animateTo$default(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L8d
                if (r15 != r0) goto L8d
                goto L8c
            L83:
                r11 = r14
                r11.f48729i = r2
                java.lang.Object r15 = r4.stop(r14)
                if (r15 != r0) goto L8d
            L8c:
                return r0
            L8d:
                tu.x0 r15 = tu.x0.f87415a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final long r35, final long r37, e1.v r39, float r40, float r41, final kv.a r42, androidx.lifecycle.b1 r43, kotlinx.coroutines.CoroutineScope r44, final int r45, final int r46, p0.w r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.l.a(long, long, e1.v, float, float, kv.a, androidx.lifecycle.b1, kotlinx.coroutines.CoroutineScope, int, int, p0.w, int, int):void");
    }

    public static final float b(j2 j2Var) {
        return ((Number) j2Var.getValue()).floatValue();
    }

    public static final void a(j2 j2Var, boolean z10) {
        j2Var.setValue(Boolean.valueOf(z10));
    }

    public static final void a(j2 j2Var, float f10) {
        j2Var.setValue(Float.valueOf(f10));
    }

    public static final j2 a() {
        return o5.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
    }

    public static final g1 a(b1 b1Var, CoroutineScope coroutineScope, c0.e eVar, j2 j2Var, h1 DisposableEffect) {
        e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        g gVar = new g(coroutineScope, 1, eVar, j2Var);
        b1Var.getLifecycle().addObserver(gVar);
        return new d(b1Var, gVar);
    }

    public static final void a(CoroutineScope coroutineScope, c0.e eVar, j2 j2Var, b1 b1Var, i0 event) {
        e0.checkNotNullParameter(b1Var, "<unused var>");
        e0.checkNotNullParameter(event, "event");
        int i10 = m.f48740a[event.ordinal()];
        if (i10 == 1) {
            a(j2Var, false);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(eVar, null), 3, null);
        } else if (i10 == 2 && ((Number) eVar.getValue()).floatValue() > 0.0f) {
            a(j2Var, true);
        }
    }

    public static final x0 a(String str, u0 semantics) {
        e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setContentDescription(semantics, str);
        r0.setTestTag(semantics, str);
        return x0.f87415a;
    }

    public static final x0 a(long j10, float f10, c0.e eVar, long j11, l1.i Canvas) {
        e0.checkNotNullParameter(Canvas, "$this$Canvas");
        long jSize = i1.p.Size(o.m4252getWidthimpl(Canvas.mo5314getSizeNHjbRc()), o.m4249getHeightimpl(Canvas.mo5314getSizeNHjbRc()));
        float fMo3425toPx0680j_4 = Canvas.mo3425toPx0680j_4(f10);
        k2 k2Var = l2.f68912b;
        l1.i.m5396drawArcyD3GUKo$default(Canvas, j10, 360.0f, 360.0f, false, 0L, jSize, 0.0f, new l1.n(fMo3425toPx0680j_4, 0.0f, k2Var.m4803getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) eVar.getValue()).floatValue() > 0.0f) {
            l1.i.m5396drawArcyD3GUKo$default(Canvas, j11, 270.0f, qv.v.coerceAtLeast(((Number) eVar.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, i1.p.Size(o.m4252getWidthimpl(Canvas.mo5314getSizeNHjbRc()), o.m4249getHeightimpl(Canvas.mo5314getSizeNHjbRc())), 0.0f, new l1.n(Canvas.mo3425toPx0680j_4(f10), 0.0f, k2Var.m4803getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return x0.f87415a;
    }

    public static final boolean a(j2 j2Var) {
        return ((Boolean) j2Var.getValue()).booleanValue();
    }
}
