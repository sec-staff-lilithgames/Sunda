package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.AbstractC3876i;
import io.bidmachine.analytics.internal.t0;
import java.util.List;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d0 extends AbstractC3876i {

    /* renamed from: l, reason: collision with root package name */
    public static final b f60001l = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private final e0 f60002g;

    /* renamed from: h, reason: collision with root package name */
    private final kv.l f60003h;

    /* renamed from: i, reason: collision with root package name */
    private Context f60004i;

    /* renamed from: j, reason: collision with root package name */
    private C3882o f60005j;

    /* renamed from: k, reason: collision with root package name */
    private final String f60006k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60007a = new a();

        public a() {
            super(1);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3882o invoke(Context context) {
            return new C3882o(context);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        Object f60008a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60009b;

        /* renamed from: d, reason: collision with root package name */
        int f60011d;

        public c(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f60009b = obj;
            this.f60011d |= Integer.MIN_VALUE;
            return d0.this.a(null, this);
        }
    }

    public /* synthetic */ d0(e0 e0Var, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(e0Var, (i10 & 2) != 0 ? a.f60007a : lVar);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public String a() {
        return this.f60006k;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void d(Context context) {
        this.f60004i = context;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3876i, io.bidmachine.analytics.internal.AbstractC3877j
    public void e(Context context) {
        super.e(context);
        C3882o c3882o = this.f60005j;
        if (c3882o != null) {
            c3882o.j();
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3876i, io.bidmachine.analytics.internal.AbstractC3877j
    public void f(Context context) {
        C3882o c3882o = this.f60005j;
        if (c3882o != null) {
            c3882o.i();
        }
        super.f(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.bidmachine.analytics.internal.AbstractC3876i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(io.bidmachine.analytics.ReaderConfig.Rule r6, zu.d r7) throws java.io.FileNotFoundException {
        /*
            r5 = this;
            boolean r6 = r7 instanceof io.bidmachine.analytics.internal.d0.c
            if (r6 == 0) goto L13
            r6 = r7
            io.bidmachine.analytics.internal.d0$c r6 = (io.bidmachine.analytics.internal.d0.c) r6
            int r0 = r6.f60011d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f60011d = r0
            goto L18
        L13:
            io.bidmachine.analytics.internal.d0$c r6 = new io.bidmachine.analytics.internal.d0$c
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f60009b
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f60011d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r6 = r6.f60008a
            io.bidmachine.analytics.internal.d0 r6 = (io.bidmachine.analytics.internal.d0) r6
            tu.a0.throwOnFailure(r7)
            goto L56
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r7)
            io.bidmachine.analytics.internal.o r7 = r5.f60005j
            if (r7 == 0) goto L7a
            tv.e r1 = tv.f.f87433c
            tv.i r1 = tv.i.f87442g
            r3 = 10
            long r3 = tv.h.toDuration(r3, r1)
            long r3 = tv.f.m7195getInWholeMillisecondsimpl(r3)
            r6.f60008a = r5
            r6.f60011d = r2
            java.lang.Object r7 = r7.a(r3, r6)
            if (r7 != r0) goto L55
            return r0
        L55:
            r6 = r5
        L56:
            io.bidmachine.analytics.internal.n r7 = (io.bidmachine.analytics.internal.C3881n) r7
            io.bidmachine.analytics.internal.e0 r6 = r6.f60002g
            r6.a(r7)
            if (r7 == 0) goto L72
            boolean r6 = r7.f()
            if (r6 != 0) goto L6a
            java.lang.String r6 = r7.b()
            return r6
        L6a:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Data is empty"
            r6.<init>(r7)
            throw r6
        L72:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Data not received yet"
            r6.<init>(r7)
            throw r6
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Not configured"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.d0.a(io.bidmachine.analytics.ReaderConfig$Rule, zu.d):java.lang.Object");
    }

    public d0(e0 e0Var, kv.l lVar) {
        this.f60002g = e0Var;
        this.f60003h = lVar;
        this.f60006k = "apur";
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3876i, io.bidmachine.analytics.internal.AbstractC3877j
    /* renamed from: a */
    public void b(AbstractC3876i.a aVar) {
        super.b(aVar);
        Context context = this.f60004i;
        if (context != null) {
            if (aVar.c().size() == 1) {
                List listSplit$default = sv.n0.split$default((CharSequence) s0.b(((ReaderConfig.Rule) y0.first(aVar.c())).getPath()), new String[]{"-"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 2) {
                    t0.a aVar2 = t0.f60270d;
                    t0 t0VarA = aVar2.a(sv.n0.trim((String) listSplit$default.get(0)).toString());
                    if (t0VarA != null) {
                        t0 t0VarA2 = aVar2.a(sv.n0.trim((String) listSplit$default.get(1)).toString());
                        if (t0VarA2 != null) {
                            C3882o c3882o = this.f60005j;
                            if (c3882o == null) {
                                c3882o = (C3882o) this.f60003h.invoke(context);
                            }
                            this.f60005j = c3882o;
                            t0 t0VarL = c3882o.l();
                            if (t0VarL != null) {
                                if (t0VarL.compareTo(t0VarA) >= 0 && t0VarL.compareTo(t0VarA2) <= 0) {
                                    if (c3882o.u()) {
                                        if (!c3882o.t()) {
                                            throw new IllegalStateException("No permission");
                                        }
                                        return;
                                    }
                                    throw new IllegalStateException("No host found");
                                }
                                throw new IllegalStateException(("Version " + t0VarL + " not supported by config").toString());
                            }
                            throw new IllegalStateException("Version not found");
                        }
                        throw new IllegalStateException("Max version not found");
                    }
                    throw new IllegalStateException("Min version not found");
                }
                throw new IllegalStateException("Path should contains min and max value");
            }
            throw new IllegalStateException(("Reader " + a() + " should contains only one rule, received " + aVar.c().size()).toString());
        }
        throw new IllegalArgumentException("Context is null");
    }
}
