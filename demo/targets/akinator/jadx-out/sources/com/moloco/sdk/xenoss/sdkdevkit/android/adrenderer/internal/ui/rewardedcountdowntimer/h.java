package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.lifecycle.b1;
import androidx.lifecycle.v0;
import bv.n;
import c0.i0;
import c0.m2;
import c0.o;
import com.unity3d.services.core.request.NJc.yFkbx;
import e1.v;
import e2.r0;
import e2.u0;
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
import tu.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48702i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c0.e f48703j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f48704k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j2 f48705l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0.e eVar, int i10, j2 j2Var, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48703j = eVar;
            this.f48704k = i10;
            this.f48705l = j2Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f48703j, this.f48704k, this.f48705l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48702i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                if (h.b(this.f48705l) && ((Number) this.f48703j.getValue()).floatValue() > 0.0f) {
                    long jM7056constructorimpl = k0.m7056constructorimpl(this.f48704k * 1000) & 4294967295L;
                    c0.e eVar = this.f48703j;
                    Float fBoxFloat = bv.b.boxFloat(0.0f);
                    m2 m2VarTween$default = o.tween$default((int) jM7056constructorimpl, 0, i0.getLinearEasing(), 2, null);
                    this.f48702i = 1;
                    if (c0.e.animateTo$default(eVar, fBoxFloat, m2VarTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return x0.f87415a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f48706i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.a f48707j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, kv.a aVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48706i = i10;
            this.f48707j = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f48706i, this.f48707j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            if (this.f48706i == 0) {
                this.f48707j.invoke();
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48708i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c0.e f48709j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0.e eVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f48709j = eVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f48709j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48708i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                this.f48708i = 1;
                if (this.f48709j.stop(this) == coroutine_suspended) {
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
        public final /* synthetic */ b1 f48710a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f48711b;

        public d(b1 b1Var, v0 v0Var) {
            this.f48710a = b1Var;
            this.f48711b = v0Var;
        }

        @Override // p0.g1
        public void dispose() {
            this.f48710a.getLifecycle().removeObserver(this.f48711b);
        }
    }

    public static final x0 a(long j10, long j11, v vVar, float f10, float f11, kv.a aVar, String str, b1 b1Var, CoroutineScope coroutineScope, int i10, int i11, int i12, int i13, int i14, w wVar, int i15) {
        a(j10, j11, vVar, f10, f11, aVar, str, b1Var, coroutineScope, i10, i11, wVar, i12 | 1, i13, i14);
        return x0.f87415a;
    }

    public static final x0 b(String str, u0 semantics) {
        e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setContentDescription(semantics, str);
        r0.setTestTag(semantics, str);
        return x0.f87415a;
    }

    public static final float c(j2 j2Var) {
        return ((Number) j2Var.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final long r40, final long r42, e1.v r44, float r45, float r46, final kv.a r47, final java.lang.String r48, androidx.lifecycle.b1 r49, kotlinx.coroutines.CoroutineScope r50, final int r51, final int r52, p0.w r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.h.a(long, long, e1.v, float, float, kv.a, java.lang.String, androidx.lifecycle.b1, kotlinx.coroutines.CoroutineScope, int, int, p0.w, int, int, int):void");
    }

    public static final boolean b(j2 j2Var) {
        return ((Boolean) j2Var.getValue()).booleanValue();
    }

    public static final void a(j2 j2Var, long j10) {
        j2Var.setValue(s2.v.m6964boximpl(j10));
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
        g gVar = new g(coroutineScope, 0, eVar, j2Var);
        b1Var.getLifecycle().addObserver(gVar);
        return new d(b1Var, gVar);
    }

    public static final void a(CoroutineScope coroutineScope, c0.e eVar, j2 j2Var, b1 b1Var, androidx.lifecycle.i0 event) {
        e0.checkNotNullParameter(b1Var, yFkbx.JuCVrc);
        e0.checkNotNullParameter(event, "event");
        int i10 = i.f48712a[event.ordinal()];
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

    public static final x0 a(j2 j2Var, s2.v vVar) {
        a(j2Var, vVar.m6976unboximpl());
        return x0.f87415a;
    }

    public static final x0 a(long j10, float f10, c0.e eVar, long j11, j2 j2Var, l1.i Canvas) {
        e0.checkNotNullParameter(Canvas, "$this$Canvas");
        long jSize = i1.p.Size(s2.v.m6972getWidthimpl(a(j2Var)), s2.v.m6971getHeightimpl(a(j2Var)));
        float fMo3425toPx0680j_4 = Canvas.mo3425toPx0680j_4(f10);
        k2 k2Var = l2.f68912b;
        l1.i.m5396drawArcyD3GUKo$default(Canvas, j10, 360.0f, 360.0f, false, 0L, jSize, 0.0f, new l1.n(fMo3425toPx0680j_4, 0.0f, k2Var.m4803getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) eVar.getValue()).floatValue() > 0.0f) {
            l1.i.m5396drawArcyD3GUKo$default(Canvas, j11, 270.0f, qv.v.coerceAtLeast(((Number) eVar.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, i1.p.Size(s2.v.m6972getWidthimpl(a(j2Var)), s2.v.m6971getHeightimpl(a(j2Var))), 0.0f, new l1.n(Canvas.mo3425toPx0680j_4(f10), 0.0f, k2Var.m4803getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return x0.f87415a;
    }

    public static final long a(j2 j2Var) {
        return ((s2.v) j2Var.getValue()).m6976unboximpl();
    }
}
