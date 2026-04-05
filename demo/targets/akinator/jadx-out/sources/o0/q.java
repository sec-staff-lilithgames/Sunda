package o0;

import com.inmobi.commons.core.configs.AdConfig;
import j1.k0;
import j1.m0;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import p0.j2;
import p0.o5;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public i1.h f77357a;

    /* renamed from: b, reason: collision with root package name */
    public final float f77358b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77359c;

    /* renamed from: d, reason: collision with root package name */
    public Float f77360d;

    /* renamed from: e, reason: collision with root package name */
    public Float f77361e;

    /* renamed from: f, reason: collision with root package name */
    public i1.h f77362f;

    /* renamed from: g, reason: collision with root package name */
    public final c0.e f77363g = c0.f.Animatable$default(0.0f, 0.0f, 2, null);

    /* renamed from: h, reason: collision with root package name */
    public final c0.e f77364h = c0.f.Animatable$default(0.0f, 0.0f, 2, null);

    /* renamed from: i, reason: collision with root package name */
    public final c0.e f77365i = c0.f.Animatable$default(0.0f, 0.0f, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public final CompletableDeferred f77366j = CompletableDeferredKt.CompletableDeferred((Job) null);

    /* renamed from: k, reason: collision with root package name */
    public final j2 f77367k;

    /* renamed from: l, reason: collision with root package name */
    public final j2 f77368l;

    public q(i1.h hVar, float f10, boolean z10, kotlin.jvm.internal.u uVar) {
        this.f77357a = hVar;
        this.f77358b = f10;
        this.f77359c = z10;
        Boolean bool = Boolean.FALSE;
        this.f77367k = o5.mutableStateOf$default(bool, null, 2, null);
        this.f77368l = o5.mutableStateOf$default(bool, null, 2, null);
    }

    public static final Object access$fadeIn(q qVar, zu.d dVar) {
        qVar.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new n(qVar, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
    }

    public static final Object access$fadeOut(q qVar, zu.d dVar) {
        qVar.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new p(qVar, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(zu.d<? super tu.x0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof o0.j
            if (r0 == 0) goto L13
            r0 = r9
            o0.j r0 = (o0.j) r0
            int r1 = r0.f77344l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77344l = r1
            goto L18
        L13:
            o0.j r0 = new o0.j
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f77342j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77344l
            tu.x0 r3 = tu.x0.f87415a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L40
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            tu.a0.throwOnFailure(r9)
            goto L91
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            o0.q r2 = r0.f77341i
            tu.a0.throwOnFailure(r9)
            goto L76
        L40:
            o0.q r2 = r0.f77341i
            tu.a0.throwOnFailure(r9)
            goto L62
        L46:
            tu.a0.throwOnFailure(r9)
            r0.f77341i = r8
            r0.f77344l = r7
            o0.n r9 = new o0.n
            r9.<init>(r8, r4)
            java.lang.Object r9 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r9, r0)
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            if (r9 != r2) goto L5d
            goto L5e
        L5d:
            r9 = r3
        L5e:
            if (r9 != r1) goto L61
            goto L90
        L61:
            r2 = r8
        L62:
            p0.j2 r9 = r2.f77367k
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r9.setValue(r7)
            kotlinx.coroutines.CompletableDeferred r9 = r2.f77366j
            r0.f77341i = r2
            r0.f77344l = r6
            java.lang.Object r9 = r9.await(r0)
            if (r9 != r1) goto L76
            goto L90
        L76:
            r0.f77341i = r4
            r0.f77344l = r5
            r2.getClass()
            o0.p r9 = new o0.p
            r9.<init>(r2, r4)
            java.lang.Object r9 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r9, r0)
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            if (r9 != r0) goto L8d
            goto L8e
        L8d:
            r9 = r3
        L8e:
            if (r9 != r1) goto L91
        L90:
            return r1
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.animate(zu.d):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m5756draw4WTKRHQ(l1.i draw, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(draw, "$this$draw");
        if (this.f77360d == null) {
            this.f77360d = Float.valueOf(r.m5758getRippleStartRadiusuvyYCjk(draw.mo5314getSizeNHjbRc()));
        }
        Float f10 = this.f77361e;
        boolean z10 = this.f77359c;
        if (f10 == null) {
            float f11 = this.f77358b;
            this.f77361e = Float.isNaN(f11) ? Float.valueOf(r.m5757getRippleEndRadiuscSwnlzA(draw, z10, draw.mo5314getSizeNHjbRc())) : Float.valueOf(draw.mo3425toPx0680j_4(f11));
        }
        if (this.f77357a == null) {
            this.f77357a = i1.h.m4174boximpl(draw.mo5313getCenterF1C5BW0());
        }
        if (this.f77362f == null) {
            this.f77362f = i1.h.m4174boximpl(i1.i.Offset(i1.o.m4252getWidthimpl(draw.mo5314getSizeNHjbRc()) / 2.0f, i1.o.m4249getHeightimpl(draw.mo5314getSizeNHjbRc()) / 2.0f));
        }
        float fFloatValue = (!((Boolean) this.f77368l.getValue()).booleanValue() || ((Boolean) this.f77367k.getValue()).booleanValue()) ? ((Number) this.f77363g.getValue()).floatValue() : 1.0f;
        Float f12 = this.f77360d;
        kotlin.jvm.internal.e0.checkNotNull(f12);
        float fFloatValue2 = f12.floatValue();
        Float f13 = this.f77361e;
        kotlin.jvm.internal.e0.checkNotNull(f13);
        float fLerp = t2.a.lerp(fFloatValue2, f13.floatValue(), ((Number) this.f77364h.getValue()).floatValue());
        i1.h hVar = this.f77357a;
        kotlin.jvm.internal.e0.checkNotNull(hVar);
        float fM4185getXimpl = i1.h.m4185getXimpl(hVar.m4195unboximpl());
        i1.h hVar2 = this.f77362f;
        kotlin.jvm.internal.e0.checkNotNull(hVar2);
        float fM4185getXimpl2 = i1.h.m4185getXimpl(hVar2.m4195unboximpl());
        c0.e eVar = this.f77365i;
        float fLerp2 = t2.a.lerp(fM4185getXimpl, fM4185getXimpl2, ((Number) eVar.getValue()).floatValue());
        i1.h hVar3 = this.f77357a;
        kotlin.jvm.internal.e0.checkNotNull(hVar3);
        float fM4186getYimpl = i1.h.m4186getYimpl(hVar3.m4195unboximpl());
        i1.h hVar4 = this.f77362f;
        kotlin.jvm.internal.e0.checkNotNull(hVar4);
        long jOffset = i1.i.Offset(fLerp2, t2.a.lerp(fM4186getYimpl, i1.h.m4186getYimpl(hVar4.m4195unboximpl()), ((Number) eVar.getValue()).floatValue()));
        long jM4857copywmQWz5c$default = m0.m4857copywmQWz5c$default(j10, m0.m4860getAlphaimpl(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!z10) {
            l1.i.m5398drawCircleVaOC9Bg$default(draw, jM4857copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, null);
            return;
        }
        float fM4252getWidthimpl = i1.o.m4252getWidthimpl(draw.mo5314getSizeNHjbRc());
        float fM4249getHeightimpl = i1.o.m4249getHeightimpl(draw.mo5314getSizeNHjbRc());
        int iM4778getIntersectrtfAjoo = k0.f68900b.m4778getIntersectrtfAjoo();
        l1.b bVar = (l1.b) draw.getDrawContext();
        long jMo5320getSizeNHjbRc = bVar.mo5320getSizeNHjbRc();
        bVar.getCanvas().save();
        ((l1.c) bVar.getTransform()).mo5323clipRectN_I0leg(0.0f, 0.0f, fM4252getWidthimpl, fM4249getHeightimpl, iM4778getIntersectrtfAjoo);
        l1.i.m5398drawCircleVaOC9Bg$default(draw, jM4857copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, null);
        bVar.getCanvas().restore();
        bVar.mo5321setSizeuvyYCjk(jMo5320getSizeNHjbRc);
    }

    public final void finish() {
        this.f77368l.setValue(Boolean.TRUE);
        this.f77366j.complete(x0.f87415a);
    }
}
