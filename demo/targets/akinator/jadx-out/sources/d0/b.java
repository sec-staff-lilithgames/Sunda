package d0;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import java.util.List;
import p0.o5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements u3 {

    /* renamed from: a, reason: collision with root package name */
    public final r3 f51296a;

    /* renamed from: b, reason: collision with root package name */
    public final EdgeEffect f51297b;

    /* renamed from: c, reason: collision with root package name */
    public final EdgeEffect f51298c;

    /* renamed from: d, reason: collision with root package name */
    public final EdgeEffect f51299d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f51300e;

    /* renamed from: f, reason: collision with root package name */
    public final List f51301f;

    /* renamed from: g, reason: collision with root package name */
    public final EdgeEffect f51302g;

    /* renamed from: h, reason: collision with root package name */
    public final EdgeEffect f51303h;

    /* renamed from: i, reason: collision with root package name */
    public final EdgeEffect f51304i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f51305j;

    /* renamed from: k, reason: collision with root package name */
    public final p0.j2 f51306k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51307l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f51308m;

    /* renamed from: n, reason: collision with root package name */
    public long f51309n;

    /* renamed from: o, reason: collision with root package name */
    public final p0.j2 f51310o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51311p;

    /* renamed from: q, reason: collision with root package name */
    public final e1.v f51312q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {
        public a() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("overscroll");
            w3Var.setValue(b.this);
        }
    }

    public b(Context context, r3 overscrollConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.f51296a = overscrollConfig;
        l1 l1Var = l1.f51484a;
        EdgeEffect edgeEffectCreate = l1Var.create(context, null);
        this.f51297b = edgeEffectCreate;
        EdgeEffect edgeEffectCreate2 = l1Var.create(context, null);
        this.f51298c = edgeEffectCreate2;
        EdgeEffect edgeEffectCreate3 = l1Var.create(context, null);
        this.f51299d = edgeEffectCreate3;
        EdgeEffect edgeEffectCreate4 = l1Var.create(context, null);
        this.f51300e = edgeEffectCreate4;
        List listListOf = uu.p0.listOf((Object[]) new EdgeEffect[]{edgeEffectCreate3, edgeEffectCreate, edgeEffectCreate4, edgeEffectCreate2});
        this.f51301f = listListOf;
        this.f51302g = l1Var.create(context, null);
        this.f51303h = l1Var.create(context, null);
        this.f51304i = l1Var.create(context, null);
        this.f51305j = l1Var.create(context, null);
        int size = listListOf.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((EdgeEffect) listListOf.get(i10)).setColor(j1.o0.m4894toArgb8_81llA(this.f51296a.m3729getGlowColor0d7_KjU()));
        }
        this.f51306k = z4.mutableStateOf(tu.x0.f87415a, z4.neverEqualPolicy());
        this.f51307l = true;
        this.f51309n = i1.o.f59366b.m4239getZeroNHjbRc();
        this.f51310o = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f51312q = x1.n1.onSizeChanged(e1.t.f53496b.then(h.f51383b), new d0.a(this)).then(new k1(this, a2.t3.isDebugInspectorInfoEnabled() ? new a() : a2.t3.getNoInspectorInfo()));
    }

    public final void a() {
        List list = this.f51301f;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            e();
        }
    }

    public final boolean b(l1.i iVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-i1.o.m4252getWidthimpl(this.f51309n), (-i1.o.m4249getHeightimpl(this.f51309n)) + iVar.mo3425toPx0680j_4(this.f51296a.getDrawPadding().mo3841calculateBottomPaddingD9Ej5fM()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean c(l1.i iVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-i1.o.m4249getHeightimpl(this.f51309n), iVar.mo3425toPx0680j_4(this.f51296a.getDrawPadding().mo3842calculateLeftPaddingu2uoSUM(iVar.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // d0.u3
    /* renamed from: consumePostFling-sF-c-tU, reason: not valid java name */
    public Object mo3681consumePostFlingsFctU(long j10, zu.d<? super tu.x0> dVar) {
        this.f51308m = false;
        float fM6799getXimpl = s2.e0.m6799getXimpl(j10);
        l1 l1Var = l1.f51484a;
        if (fM6799getXimpl > 0.0f) {
            l1Var.onAbsorbCompat(this.f51299d, mv.d.roundToInt(s2.e0.m6799getXimpl(j10)));
        } else if (s2.e0.m6799getXimpl(j10) < 0.0f) {
            l1Var.onAbsorbCompat(this.f51300e, -mv.d.roundToInt(s2.e0.m6799getXimpl(j10)));
        }
        if (s2.e0.m6800getYimpl(j10) > 0.0f) {
            l1Var.onAbsorbCompat(this.f51297b, mv.d.roundToInt(s2.e0.m6800getYimpl(j10)));
        } else if (s2.e0.m6800getYimpl(j10) < 0.0f) {
            l1Var.onAbsorbCompat(this.f51298c, -mv.d.roundToInt(s2.e0.m6800getYimpl(j10)));
        }
        if (!s2.e0.m6798equalsimpl0(j10, s2.e0.f85330b.m6777getZero9UxMQ8M())) {
            e();
        }
        a();
        return tu.x0.f87415a;
    }

    @Override // d0.u3
    /* renamed from: consumePostScroll-l7mfB5k, reason: not valid java name */
    public void mo3682consumePostScrolll7mfB5k(long j10, long j11, i1.h hVar, int i10) {
        boolean z10;
        boolean zIsFinished;
        boolean z11 = true;
        if (t1.o.m7026equalsimpl0(i10, t1.o.f86279b.m7020getDragWNlRxjI())) {
            long jM4195unboximpl = hVar != null ? hVar.m4195unboximpl() : i1.p.m4258getCenteruvyYCjk(this.f51309n);
            if (i1.h.m4185getXimpl(j11) > 0.0f) {
                g(j11, jM4195unboximpl);
            } else if (i1.h.m4185getXimpl(j11) < 0.0f) {
                h(j11, jM4195unboximpl);
            }
            if (i1.h.m4186getYimpl(j11) > 0.0f) {
                i(j11, jM4195unboximpl);
            } else if (i1.h.m4186getYimpl(j11) < 0.0f) {
                f(j11, jM4195unboximpl);
            }
            z10 = !i1.h.m4182equalsimpl0(j11, i1.h.f59344b.m4173getZeroF1C5BW0());
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect = this.f51299d;
        if (edgeEffect.isFinished() || i1.h.m4185getXimpl(j10) >= 0.0f) {
            zIsFinished = false;
        } else {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f51300e;
        if (!edgeEffect2.isFinished() && i1.h.m4185getXimpl(j10) > 0.0f) {
            edgeEffect2.onRelease();
            zIsFinished = zIsFinished || edgeEffect2.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f51297b;
        if (!edgeEffect3.isFinished() && i1.h.m4186getYimpl(j10) < 0.0f) {
            edgeEffect3.onRelease();
            zIsFinished = zIsFinished || edgeEffect3.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f51298c;
        if (!edgeEffect4.isFinished() && i1.h.m4186getYimpl(j10) > 0.0f) {
            edgeEffect4.onRelease();
            zIsFinished = zIsFinished || edgeEffect4.isFinished();
        }
        if (!zIsFinished && !z10) {
            z11 = false;
        }
        if (z11) {
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // d0.u3
    /* renamed from: consumePreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3683consumePreFlingQWom1Mo(long r5, zu.d<? super s2.e0> r7) {
        /*
            r4 = this;
            float r7 = s2.e0.m6799getXimpl(r5)
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            d0.l1 r1 = d0.l1.f51484a
            if (r7 <= 0) goto L26
            android.widget.EdgeEffect r7 = r4.f51299d
            float r2 = r1.getDistanceCompat(r7)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            goto L26
        L16:
            float r2 = s2.e0.m6799getXimpl(r5)
            int r2 = mv.d.roundToInt(r2)
            r1.onAbsorbCompat(r7, r2)
            float r7 = s2.e0.m6799getXimpl(r5)
            goto L4b
        L26:
            float r7 = s2.e0.m6799getXimpl(r5)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L4a
            android.widget.EdgeEffect r7 = r4.f51300e
            float r2 = r1.getDistanceCompat(r7)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L4a
        L39:
            float r2 = s2.e0.m6799getXimpl(r5)
            int r2 = mv.d.roundToInt(r2)
            int r2 = -r2
            r1.onAbsorbCompat(r7, r2)
            float r7 = s2.e0.m6799getXimpl(r5)
            goto L4b
        L4a:
            r7 = r0
        L4b:
            float r2 = s2.e0.m6800getYimpl(r5)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6e
            android.widget.EdgeEffect r2 = r4.f51297b
            float r3 = r1.getDistanceCompat(r2)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L5e
            goto L6e
        L5e:
            float r0 = s2.e0.m6800getYimpl(r5)
            int r0 = mv.d.roundToInt(r0)
            r1.onAbsorbCompat(r2, r0)
            float r0 = s2.e0.m6800getYimpl(r5)
            goto L91
        L6e:
            float r2 = s2.e0.m6800getYimpl(r5)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L91
            android.widget.EdgeEffect r2 = r4.f51298c
            float r3 = r1.getDistanceCompat(r2)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L81
            goto L91
        L81:
            float r0 = s2.e0.m6800getYimpl(r5)
            int r0 = mv.d.roundToInt(r0)
            int r0 = -r0
            r1.onAbsorbCompat(r2, r0)
            float r0 = s2.e0.m6800getYimpl(r5)
        L91:
            long r5 = s2.f0.Velocity(r7, r0)
            s2.d0 r7 = s2.e0.f85330b
            long r0 = r7.m6777getZero9UxMQ8M()
            boolean r7 = s2.e0.m6798equalsimpl0(r5, r0)
            if (r7 != 0) goto La4
            r4.e()
        La4:
            s2.e0 r5 = s2.e0.m6790boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b.mo3683consumePreFlingQWom1Mo(long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    @Override // d0.u3
    /* renamed from: consumePreScroll-A0NYTsA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo3684consumePreScrollA0NYTsA(long r11, i1.h r13, int r14) {
        /*
            r10 = this;
            boolean r14 = r10.f51308m
            d0.l1 r0 = d0.l1.f51484a
            android.widget.EdgeEffect r1 = r10.f51298c
            android.widget.EdgeEffect r2 = r10.f51297b
            android.widget.EdgeEffect r3 = r10.f51300e
            android.widget.EdgeEffect r4 = r10.f51299d
            r5 = 0
            if (r14 != 0) goto L60
            long r6 = r10.f51309n
            long r6 = i1.p.m4258getCenteruvyYCjk(r6)
            float r14 = r0.getDistanceCompat(r4)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 != 0) goto L1e
            goto L27
        L1e:
            i1.g r14 = i1.h.f59344b
            long r8 = r14.m4173getZeroF1C5BW0()
            r10.g(r8, r6)
        L27:
            float r14 = r0.getDistanceCompat(r3)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 != 0) goto L30
            goto L39
        L30:
            i1.g r14 = i1.h.f59344b
            long r8 = r14.m4173getZeroF1C5BW0()
            r10.h(r8, r6)
        L39:
            float r14 = r0.getDistanceCompat(r2)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 != 0) goto L42
            goto L4b
        L42:
            i1.g r14 = i1.h.f59344b
            long r8 = r14.m4173getZeroF1C5BW0()
            r10.i(r8, r6)
        L4b:
            float r14 = r0.getDistanceCompat(r1)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 != 0) goto L54
            goto L5d
        L54:
            i1.g r14 = i1.h.f59344b
            long r8 = r14.m4173getZeroF1C5BW0()
            r10.f(r8, r6)
        L5d:
            r14 = 1
            r10.f51308m = r14
        L60:
            if (r13 == 0) goto L67
            long r13 = r13.m4195unboximpl()
            goto L6d
        L67:
            long r13 = r10.f51309n
            long r13 = i1.p.m4258getCenteruvyYCjk(r13)
        L6d:
            float r6 = i1.h.m4186getYimpl(r11)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L77
        L75:
            r2 = r5
            goto La8
        L77:
            float r6 = r0.getDistanceCompat(r2)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L98
            float r2 = r0.getDistanceCompat(r1)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L88
            goto L75
        L88:
            float r2 = r10.f(r11, r13)
            float r6 = r0.getDistanceCompat(r1)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto La8
            r1.onRelease()
            goto La8
        L98:
            float r1 = r10.i(r11, r13)
            float r6 = r0.getDistanceCompat(r2)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto La7
            r2.onRelease()
        La7:
            r2 = r1
        La8:
            float r1 = i1.h.m4185getXimpl(r11)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto Lb1
            goto Le3
        Lb1:
            float r1 = r0.getDistanceCompat(r4)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto Ld3
            float r1 = r0.getDistanceCompat(r3)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto Lc2
            goto Le3
        Lc2:
            float r11 = r10.h(r11, r13)
            float r12 = r0.getDistanceCompat(r3)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 != 0) goto Ld1
            r3.onRelease()
        Ld1:
            r5 = r11
            goto Le3
        Ld3:
            float r11 = r10.g(r11, r13)
            float r12 = r0.getDistanceCompat(r4)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 != 0) goto Ld1
            r4.onRelease()
            goto Ld1
        Le3:
            long r11 = i1.i.Offset(r5, r2)
            i1.g r13 = i1.h.f59344b
            long r13 = r13.m4173getZeroF1C5BW0()
            boolean r13 = i1.h.m4182equalsimpl0(r11, r13)
            if (r13 != 0) goto Lf6
            r10.e()
        Lf6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b.mo3684consumePreScrollA0NYTsA(long, i1.h, int):long");
    }

    public final boolean d(l1.i iVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iRoundToInt = mv.d.roundToInt(i1.o.m4252getWidthimpl(this.f51309n));
        float fMo3843calculateRightPaddingu2uoSUM = this.f51296a.getDrawPadding().mo3843calculateRightPaddingu2uoSUM(iVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, iVar.mo3425toPx0680j_4(fMo3843calculateRightPaddingu2uoSUM) + (-iRoundToInt));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void drawOverscroll(l1.i iVar) {
        boolean zC;
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        j1.e0 canvas = ((l1.b) iVar.getDrawContext()).getCanvas();
        this.f51306k.getValue();
        Canvas nativeCanvas = j1.d.getNativeCanvas(canvas);
        l1 l1Var = l1.f51484a;
        EdgeEffect edgeEffect = this.f51304i;
        if (l1Var.getDistanceCompat(edgeEffect) != 0.0f) {
            d(iVar, edgeEffect, nativeCanvas);
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.f51299d;
        if (edgeEffect2.isFinished()) {
            zC = false;
        } else {
            zC = c(iVar, edgeEffect2, nativeCanvas);
            l1Var.onPullDistanceCompat(edgeEffect, l1Var.getDistanceCompat(edgeEffect2), 0.0f);
        }
        EdgeEffect edgeEffect3 = this.f51302g;
        if (l1Var.getDistanceCompat(edgeEffect3) != 0.0f) {
            b(iVar, edgeEffect3, nativeCanvas);
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.f51297b;
        boolean zIsFinished = edgeEffect4.isFinished();
        r3 r3Var = this.f51296a;
        if (!zIsFinished) {
            int iSave = nativeCanvas.save();
            nativeCanvas.translate(0.0f, iVar.mo3425toPx0680j_4(r3Var.getDrawPadding().mo3844calculateTopPaddingD9Ej5fM()));
            boolean zDraw = edgeEffect4.draw(nativeCanvas);
            nativeCanvas.restoreToCount(iSave);
            zC = zDraw || zC;
            l1Var.onPullDistanceCompat(edgeEffect3, l1Var.getDistanceCompat(edgeEffect4), 0.0f);
        }
        EdgeEffect edgeEffect5 = this.f51305j;
        if (l1Var.getDistanceCompat(edgeEffect5) != 0.0f) {
            c(iVar, edgeEffect5, nativeCanvas);
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.f51300e;
        if (!edgeEffect6.isFinished()) {
            zC = d(iVar, edgeEffect6, nativeCanvas) || zC;
            l1Var.onPullDistanceCompat(edgeEffect5, l1Var.getDistanceCompat(edgeEffect6), 0.0f);
        }
        EdgeEffect edgeEffect7 = this.f51303h;
        if (l1Var.getDistanceCompat(edgeEffect7) != 0.0f) {
            int iSave2 = nativeCanvas.save();
            nativeCanvas.translate(0.0f, iVar.mo3425toPx0680j_4(r3Var.getDrawPadding().mo3844calculateTopPaddingD9Ej5fM()));
            edgeEffect7.draw(nativeCanvas);
            nativeCanvas.restoreToCount(iSave2);
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.f51298c;
        if (!edgeEffect8.isFinished()) {
            boolean z10 = b(iVar, edgeEffect8, nativeCanvas) || zC;
            l1Var.onPullDistanceCompat(edgeEffect7, l1Var.getDistanceCompat(edgeEffect8), 0.0f);
            zC = z10;
        }
        if (zC) {
            e();
        }
    }

    public final void e() {
        if (this.f51307l) {
            this.f51306k.setValue(tu.x0.f87415a);
        }
    }

    public final float f(long j10, long j11) {
        return i1.o.m4249getHeightimpl(this.f51309n) * (-l1.f51484a.onPullDistanceCompat(this.f51298c, -(i1.h.m4186getYimpl(j10) / i1.o.m4249getHeightimpl(this.f51309n)), 1 - (i1.h.m4185getXimpl(j11) / i1.o.m4252getWidthimpl(this.f51309n))));
    }

    public final float g(long j10, long j11) {
        return i1.o.m4252getWidthimpl(this.f51309n) * l1.f51484a.onPullDistanceCompat(this.f51299d, i1.h.m4185getXimpl(j10) / i1.o.m4252getWidthimpl(this.f51309n), 1 - (i1.h.m4186getYimpl(j11) / i1.o.m4249getHeightimpl(this.f51309n)));
    }

    @Override // d0.u3
    public e1.v getEffectModifier() {
        return this.f51312q;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.f51307l;
    }

    public final float h(long j10, long j11) {
        float fM4186getYimpl = i1.h.m4186getYimpl(j11) / i1.o.m4249getHeightimpl(this.f51309n);
        float fM4185getXimpl = i1.h.m4185getXimpl(j10) / i1.o.m4252getWidthimpl(this.f51309n);
        return i1.o.m4252getWidthimpl(this.f51309n) * (-l1.f51484a.onPullDistanceCompat(this.f51300e, -fM4185getXimpl, fM4186getYimpl));
    }

    public final float i(long j10, long j11) {
        float fM4185getXimpl = i1.h.m4185getXimpl(j11) / i1.o.m4252getWidthimpl(this.f51309n);
        return i1.o.m4249getHeightimpl(this.f51309n) * l1.f51484a.onPullDistanceCompat(this.f51297b, i1.h.m4186getYimpl(j10) / i1.o.m4249getHeightimpl(this.f51309n), fM4185getXimpl);
    }

    @Override // d0.u3
    public boolean isEnabled() {
        return ((Boolean) this.f51310o.getValue()).booleanValue();
    }

    @Override // d0.u3
    public boolean isInProgress() {
        List list = this.f51301f;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(l1.f51484a.getDistanceCompat((EdgeEffect) list.get(i10)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // d0.u3
    public void setEnabled(boolean z10) {
        boolean z11 = this.f51311p != z10;
        this.f51310o.setValue(Boolean.valueOf(z10));
        this.f51311p = z10;
        if (z11) {
            this.f51308m = false;
            a();
        }
    }

    public final void setInvalidationEnabled$foundation_release(boolean z10) {
        this.f51307l = z10;
    }

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }
}
