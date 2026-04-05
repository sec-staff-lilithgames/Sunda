package b7;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import j1.n0;
import j1.o0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import l7.i;
import p0.j2;
import p0.j4;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends m1.e implements j4 {

    /* renamed from: w, reason: collision with root package name */
    public static final a f8845w = new a(null);

    /* renamed from: x, reason: collision with root package name */
    public static final h f8846x = h.f8844e;

    /* renamed from: h, reason: collision with root package name */
    public CoroutineScope f8847h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f8848i = StateFlowKt.MutableStateFlow(i1.o.m4240boximpl(i1.o.f59366b.m4239getZeroNHjbRc()));

    /* renamed from: j, reason: collision with root package name */
    public final j2 f8849j = o5.mutableStateOf$default(null, null, 2, null);

    /* renamed from: k, reason: collision with root package name */
    public final j2 f8850k = o5.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* renamed from: l, reason: collision with root package name */
    public final j2 f8851l = o5.mutableStateOf$default(null, null, 2, null);

    /* renamed from: m, reason: collision with root package name */
    public b f8852m;

    /* renamed from: n, reason: collision with root package name */
    public m1.e f8853n;

    /* renamed from: o, reason: collision with root package name */
    public kv.l f8854o;

    /* renamed from: p, reason: collision with root package name */
    public kv.l f8855p;

    /* renamed from: q, reason: collision with root package name */
    public x1.r f8856q;

    /* renamed from: r, reason: collision with root package name */
    public int f8857r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8858s;

    /* renamed from: t, reason: collision with root package name */
    public final j2 f8859t;

    /* renamed from: u, reason: collision with root package name */
    public final j2 f8860u;

    /* renamed from: v, reason: collision with root package name */
    public final j2 f8861v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final kv.l getDefaultTransform() {
            return i.f8846x;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final m1.e f8862a;

            /* renamed from: b, reason: collision with root package name */
            public final l7.f f8863b;

            public a(m1.e eVar, l7.f fVar) {
                super(null);
                this.f8862a = eVar;
                this.f8863b = fVar;
            }

            public static /* synthetic */ a copy$default(a aVar, m1.e eVar, l7.f fVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    eVar = aVar.getPainter();
                }
                if ((i10 & 2) != 0) {
                    fVar = aVar.f8863b;
                }
                return aVar.copy(eVar, fVar);
            }

            public final m1.e component1() {
                return getPainter();
            }

            public final l7.f component2() {
                return this.f8863b;
            }

            public final a copy(m1.e eVar, l7.f fVar) {
                return new a(eVar, fVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.e0.areEqual(getPainter(), aVar.getPainter()) && kotlin.jvm.internal.e0.areEqual(this.f8863b, aVar.f8863b);
            }

            @Override // b7.i.b
            public m1.e getPainter() {
                return this.f8862a;
            }

            public final l7.f getResult() {
                return this.f8863b;
            }

            public int hashCode() {
                return this.f8863b.hashCode() + ((getPainter() == null ? 0 : getPainter().hashCode()) * 31);
            }

            public String toString() {
                return "Error(painter=" + getPainter() + ", result=" + this.f8863b + ')';
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: b7.i$b$b, reason: collision with other inner class name */
        public static final class C0013b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final m1.e f8864a;

            public C0013b(m1.e eVar) {
                super(null);
                this.f8864a = eVar;
            }

            public static /* synthetic */ C0013b copy$default(C0013b c0013b, m1.e eVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    eVar = c0013b.getPainter();
                }
                return c0013b.copy(eVar);
            }

            public final m1.e component1() {
                return getPainter();
            }

            public final C0013b copy(m1.e eVar) {
                return new C0013b(eVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0013b) && kotlin.jvm.internal.e0.areEqual(getPainter(), ((C0013b) obj).getPainter());
            }

            @Override // b7.i.b
            public m1.e getPainter() {
                return this.f8864a;
            }

            public int hashCode() {
                if (getPainter() == null) {
                    return 0;
                }
                return getPainter().hashCode();
            }

            public String toString() {
                return "Loading(painter=" + getPainter() + ')';
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final m1.e f8865a;

            /* renamed from: b, reason: collision with root package name */
            public final l7.s f8866b;

            public c(m1.e eVar, l7.s sVar) {
                super(null);
                this.f8865a = eVar;
                this.f8866b = sVar;
            }

            public static /* synthetic */ c copy$default(c cVar, m1.e eVar, l7.s sVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    eVar = cVar.getPainter();
                }
                if ((i10 & 2) != 0) {
                    sVar = cVar.f8866b;
                }
                return cVar.copy(eVar, sVar);
            }

            public final m1.e component1() {
                return getPainter();
            }

            public final l7.s component2() {
                return this.f8866b;
            }

            public final c copy(m1.e eVar, l7.s sVar) {
                return new c(eVar, sVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.e0.areEqual(getPainter(), cVar.getPainter()) && kotlin.jvm.internal.e0.areEqual(this.f8866b, cVar.f8866b);
            }

            @Override // b7.i.b
            public m1.e getPainter() {
                return this.f8865a;
            }

            public final l7.s getResult() {
                return this.f8866b;
            }

            public int hashCode() {
                return this.f8866b.hashCode() + (getPainter().hashCode() * 31);
            }

            public String toString() {
                return "Success(painter=" + getPainter() + ", result=" + this.f8866b + ')';
            }
        }

        public b(kotlin.jvm.internal.u uVar) {
        }

        public abstract m1.e getPainter();
    }

    public i(l7.i iVar, a7.m mVar) {
        j jVar = j.f8867a;
        this.f8852m = jVar;
        this.f8854o = f8846x;
        this.f8856q = x1.r.f91409a.getFit();
        this.f8857r = l1.i.O8.m5345getDefaultFilterQualityfv9h1I();
        this.f8859t = o5.mutableStateOf$default(jVar, null, 2, null);
        this.f8860u = o5.mutableStateOf$default(iVar, null, 2, null);
        this.f8861v = o5.mutableStateOf$default(mVar, null, 2, null);
    }

    public static final b access$toState(i iVar, l7.k kVar) {
        iVar.getClass();
        if (kVar instanceof l7.s) {
            l7.s sVar = (l7.s) kVar;
            return new b.c(iVar.e(sVar.getDrawable()), sVar);
        }
        if (!(kVar instanceof l7.f)) {
            throw new tu.t();
        }
        Drawable drawable = kVar.getDrawable();
        return new b.a(drawable != null ? iVar.e(drawable) : null, (l7.f) kVar);
    }

    public static final l7.i access$updateRequest(i iVar, l7.i iVar2) {
        iVar.getClass();
        i.a aVarTarget = l7.i.newBuilder$default(iVar2, null, 1, null).target(new o(iVar));
        if (iVar2.getDefined().getSizeResolver() == null) {
            aVarTarget.size(new p(iVar));
        }
        if (iVar2.getDefined().getScale() == null) {
            aVarTarget.scale(f0.toScale(iVar.f8856q));
        }
        if (iVar2.getDefined().getPrecision() != m7.f.f74055b) {
            aVarTarget.precision(m7.f.f74056c);
        }
        return aVarTarget.build();
    }

    @Override // m1.e
    public final boolean a(float f10) {
        this.f8850k.setValue(Float.valueOf(f10));
        return true;
    }

    @Override // m1.e
    public final boolean b(n0 n0Var) {
        this.f8851l.setValue(n0Var);
        return true;
    }

    @Override // m1.e
    public final void d(l1.i iVar) {
        this.f8848i.setValue(i1.o.m4240boximpl(iVar.mo5314getSizeNHjbRc()));
        m1.e eVar = (m1.e) this.f8849j.getValue();
        if (eVar != null) {
            eVar.m5582drawx_KDEd0(iVar, iVar.mo5314getSizeNHjbRc(), ((Number) this.f8850k.getValue()).floatValue(), (n0) this.f8851l.getValue());
        }
    }

    public final m1.e e(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? m1.b.m5579BitmapPainterQZhYCtY$default(j1.g.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.f8857r, 6, null) : drawable instanceof ColorDrawable ? new m1.c(o0.Color(((ColorDrawable) drawable).getColor()), null) : new id.c(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(b7.i.b r14) {
        /*
            r13 = this;
            b7.i$b r0 = r13.f8852m
            kv.l r1 = r13.f8854o
            java.lang.Object r14 = r1.invoke(r14)
            b7.i$b r14 = (b7.i.b) r14
            r13.f8852m = r14
            p0.j2 r1 = r13.f8859t
            r1.setValue(r14)
            boolean r1 = r14 instanceof b7.i.b.c
            r2 = 0
            if (r1 == 0) goto L1e
            r1 = r14
            b7.i$b$c r1 = (b7.i.b.c) r1
            l7.s r1 = r1.getResult()
            goto L29
        L1e:
            boolean r1 = r14 instanceof b7.i.b.a
            if (r1 == 0) goto L70
            r1 = r14
            b7.i$b$a r1 = (b7.i.b.a) r1
            l7.f r1 = r1.getResult()
        L29:
            l7.i r3 = r1.getRequest()
            p7.c r3 = r3.getTransitionFactory()
            b7.q r4 = b7.r.access$getFakeTransitionTarget$p()
            p7.d r3 = r3.create(r4, r1)
            boolean r4 = r3 instanceof p7.a
            if (r4 == 0) goto L70
            m1.e r4 = r0.getPainter()
            boolean r5 = r0 instanceof b7.i.b.C0013b
            if (r5 == 0) goto L47
            r7 = r4
            goto L48
        L47:
            r7 = r2
        L48:
            m1.e r8 = r14.getPainter()
            x1.r r9 = r13.f8856q
            p7.a r3 = (p7.a) r3
            int r10 = r3.getDurationMillis()
            boolean r4 = r1 instanceof l7.s
            if (r4 == 0) goto L64
            l7.s r1 = (l7.s) r1
            boolean r1 = r1.isPlaceholderCached()
            if (r1 != 0) goto L61
            goto L64
        L61:
            r1 = 0
        L62:
            r11 = r1
            goto L66
        L64:
            r1 = 1
            goto L62
        L66:
            boolean r12 = r3.getPreferExactIntrinsicSize()
            b7.w r6 = new b7.w
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L71
        L70:
            r6 = r2
        L71:
            if (r6 == 0) goto L74
            goto L78
        L74:
            m1.e r6 = r14.getPainter()
        L78:
            r13.f8853n = r6
            p0.j2 r1 = r13.f8849j
            r1.setValue(r6)
            kotlinx.coroutines.CoroutineScope r1 = r13.f8847h
            if (r1 == 0) goto Lae
            m1.e r1 = r0.getPainter()
            m1.e r3 = r14.getPainter()
            if (r1 == r3) goto Lae
            m1.e r0 = r0.getPainter()
            boolean r1 = r0 instanceof p0.j4
            if (r1 == 0) goto L98
            p0.j4 r0 = (p0.j4) r0
            goto L99
        L98:
            r0 = r2
        L99:
            if (r0 == 0) goto L9e
            r0.onForgotten()
        L9e:
            m1.e r0 = r14.getPainter()
            boolean r1 = r0 instanceof p0.j4
            if (r1 == 0) goto La9
            r2 = r0
            p0.j4 r2 = (p0.j4) r2
        La9:
            if (r2 == 0) goto Lae
            r2.onRemembered()
        Lae:
            kv.l r0 = r13.f8855p
            if (r0 == 0) goto Lb5
            r0.invoke(r14)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.i.f(b7.i$b):void");
    }

    public final x1.r getContentScale$coil_compose_base_release() {
        return this.f8856q;
    }

    /* renamed from: getFilterQuality-f-v9h1I$coil_compose_base_release, reason: not valid java name */
    public final int m137getFilterQualityfv9h1I$coil_compose_base_release() {
        return this.f8857r;
    }

    public final a7.m getImageLoader() {
        return (a7.m) this.f8861v.getValue();
    }

    @Override // m1.e
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo138getIntrinsicSizeNHjbRc() {
        m1.e eVar = (m1.e) this.f8849j.getValue();
        return eVar != null ? eVar.mo138getIntrinsicSizeNHjbRc() : i1.o.f59366b.m4238getUnspecifiedNHjbRc();
    }

    public final kv.l getOnState$coil_compose_base_release() {
        return this.f8855p;
    }

    public final l7.i getRequest() {
        return (l7.i) this.f8860u.getValue();
    }

    public final b getState() {
        return (b) this.f8859t.getValue();
    }

    public final kv.l getTransform$coil_compose_base_release() {
        return this.f8854o;
    }

    public final boolean isPreview$coil_compose_base_release() {
        return this.f8858s;
    }

    @Override // p0.j4
    public void onAbandoned() {
        CoroutineScope coroutineScope = this.f8847h;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f8847h = null;
        Object obj = this.f8853n;
        j4 j4Var = obj instanceof j4 ? (j4) obj : null;
        if (j4Var != null) {
            j4Var.onAbandoned();
        }
    }

    @Override // p0.j4
    public void onForgotten() {
        CoroutineScope coroutineScope = this.f8847h;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f8847h = null;
        Object obj = this.f8853n;
        j4 j4Var = obj instanceof j4 ? (j4) obj : null;
        if (j4Var != null) {
            j4Var.onForgotten();
        }
    }

    @Override // p0.j4
    public void onRemembered() {
        if (this.f8847h != null) {
            return;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.f8847h = CoroutineScope;
        Object obj = this.f8853n;
        j4 j4Var = obj instanceof j4 ? (j4) obj : null;
        if (j4Var != null) {
            j4Var.onRemembered();
        }
        if (!this.f8858s) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new n(this, null), 3, null);
        } else {
            Drawable placeholder = l7.i.newBuilder$default(getRequest(), null, 1, null).defaults(getImageLoader().getDefaults()).build().getPlaceholder();
            f(new b.C0013b(placeholder != null ? e(placeholder) : null));
        }
    }

    public final void setContentScale$coil_compose_base_release(x1.r rVar) {
        this.f8856q = rVar;
    }

    /* renamed from: setFilterQuality-vDHp3xo$coil_compose_base_release, reason: not valid java name */
    public final void m139setFilterQualityvDHp3xo$coil_compose_base_release(int i10) {
        this.f8857r = i10;
    }

    public final void setImageLoader$coil_compose_base_release(a7.m mVar) {
        this.f8861v.setValue(mVar);
    }

    public final void setOnState$coil_compose_base_release(kv.l lVar) {
        this.f8855p = lVar;
    }

    public final void setPreview$coil_compose_base_release(boolean z10) {
        this.f8858s = z10;
    }

    public final void setRequest$coil_compose_base_release(l7.i iVar) {
        this.f8860u.setValue(iVar);
    }

    public final void setTransform$coil_compose_base_release(kv.l lVar) {
        this.f8854o = lVar;
    }
}
