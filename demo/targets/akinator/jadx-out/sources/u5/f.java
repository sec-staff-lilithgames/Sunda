package u5;

import o5.f2;
import o5.g2;
import o5.h2;
import o5.y0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public int f87886i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f87887j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f87888k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public g2 f87889i;

        /* renamed from: j, reason: collision with root package name */
        public int f87890j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f87891k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f87892l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f87893m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ y0 f87894n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kv.l f87895o;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: u5.f$a$a, reason: collision with other inner class name */
        public static final class C0791a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f87896i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f87897j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ kv.l f87898k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0791a(zu.d dVar, kv.l lVar) {
                super(2, dVar);
                this.f87898k = lVar;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                C0791a c0791a = new C0791a(dVar, this.f87898k);
                c0791a.f87897j = obj;
                return c0791a;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f87896i;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                    return obj;
                }
                tu.a0.throwOnFailure(obj);
                this.f87896i = 1;
                kotlin.jvm.internal.b0.mark(6);
                Object objInvoke = this.f87898k.invoke(this);
                kotlin.jvm.internal.b0.mark(7);
                return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
            }

            @Override // kv.p
            public final Object invoke(f2 f2Var, zu.d<Object> dVar) {
                return ((C0791a) create(f2Var, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, boolean z11, y0 y0Var, zu.d dVar, kv.l lVar) {
            super(2, dVar);
            this.f87892l = z10;
            this.f87893m = z11;
            this.f87894n = y0Var;
            this.f87895o = lVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f87892l, this.f87893m, this.f87894n, dVar, this.f87895o);
            aVar.f87891k = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        
            if (r12.sync$room_runtime_release(r11) == r0) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[PHI: r1 r12
          0x00a4: PHI (r1v11 o5.h2) = (r1v8 o5.h2), (r1v16 o5.h2) binds: [B:35:0x00a1, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:35:0x00a1, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c3 A[RETURN] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(h2 h2Var, zu.d<Object> dVar) {
            return ((a) create(h2Var, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y0 y0Var, kv.l lVar, zu.d dVar) {
        super(1, dVar);
        this.f87887j = y0Var;
        this.f87888k = lVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(zu.d<?> dVar) {
        return new f(this.f87887j, this.f87888k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f87886i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        y0 y0Var = this.f87887j;
        a aVar = new a(true, false, y0Var, null, this.f87888k);
        this.f87886i = 1;
        Object objUseConnection$room_runtime_release = y0Var.useConnection$room_runtime_release(false, aVar, this);
        return objUseConnection$room_runtime_release == coroutine_suspended ? coroutine_suspended : objUseConnection$room_runtime_release;
    }

    @Override // kv.l
    public final Object invoke(zu.d<Object> dVar) {
        return ((f) create(dVar)).invokeSuspend(x0.f87415a);
    }
}
