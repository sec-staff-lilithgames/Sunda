package u5;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import o5.f2;
import o5.g2;
import o5.h2;
import o5.y0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87872i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f87873j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f87874k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f87875l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.l f87876m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public g2 f87877i;

        /* renamed from: j, reason: collision with root package name */
        public int f87878j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f87879k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f87880l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f87881m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ y0 f87882n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kv.l f87883o;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: u5.e$a$a, reason: collision with other inner class name */
        public static final class C0790a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f87884i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ kv.l f87885j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0790a(zu.d dVar, kv.l lVar) {
                super(2, dVar);
                this.f87885j = lVar;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                C0790a c0790a = new C0790a(dVar, this.f87885j);
                c0790a.f87884i = obj;
                return c0790a;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                f2 f2Var = (f2) this.f87884i;
                e0.checkNotNull(f2Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f87885j.invoke(((q5.x) f2Var).getRawConnection());
            }

            @Override // kv.p
            public final Object invoke(f2 f2Var, zu.d<Object> dVar) {
                return ((C0790a) create(f2Var, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, boolean z11, y0 y0Var, zu.d dVar, kv.l lVar) {
            super(2, dVar);
            this.f87880l = z10;
            this.f87881m = z11;
            this.f87882n = y0Var;
            this.f87883o = lVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f87880l, this.f87881m, this.f87882n, dVar, this.f87883o);
            aVar.f87879k = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a0 A[PHI: r1 r11
          0x00a0: PHI (r1v11 o5.h2) = (r1v8 o5.h2), (r1v16 o5.h2) binds: [B:34:0x009d, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x00a0: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009d, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[RETURN] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(h2 h2Var, zu.d<Object> dVar) {
            return ((a) create(h2Var, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y0 y0Var, boolean z10, boolean z11, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f87873j = y0Var;
        this.f87874k = z10;
        this.f87875l = z11;
        this.f87876m = lVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e(this.f87873j, this.f87874k, this.f87875l, this.f87876m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f87872i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        y0 y0Var = this.f87873j;
        boolean z10 = !(y0Var.inCompatibilityMode$room_runtime_release() && y0Var.inTransaction()) && this.f87874k;
        boolean z11 = this.f87875l;
        a aVar = new a(z10, z11, y0Var, null, this.f87876m);
        this.f87872i = 1;
        Object objUseConnection$room_runtime_release = y0Var.useConnection$room_runtime_release(z11, aVar, this);
        return objUseConnection$room_runtime_release == coroutine_suspended ? coroutine_suspended : objUseConnection$room_runtime_release;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
