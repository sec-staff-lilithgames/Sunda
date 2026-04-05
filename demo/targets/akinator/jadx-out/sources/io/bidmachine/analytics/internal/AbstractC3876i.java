package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC3876i extends AbstractC3877j {

    /* renamed from: d, reason: collision with root package name */
    private final tu.o f60047d = tu.q.lazy(d.f60065a);

    /* renamed from: e, reason: collision with root package name */
    private Job f60048e;

    /* renamed from: f, reason: collision with root package name */
    private a f60049f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f60050a;

        /* renamed from: b, reason: collision with root package name */
        private final List f60051b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3875h f60052c;

        public a(long j10, List list, InterfaceC3875h interfaceC3875h) {
            this.f60050a = j10;
            this.f60051b = list;
            this.f60052c = interfaceC3875h;
        }

        public final InterfaceC3875h a() {
            return this.f60052c;
        }

        public final long b() {
            return this.f60050a;
        }

        public final List c() {
            return this.f60051b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.i$b */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        Object f60053a;

        /* renamed from: b, reason: collision with root package name */
        Object f60054b;

        /* renamed from: c, reason: collision with root package name */
        Object f60055c;

        /* renamed from: d, reason: collision with root package name */
        int f60056d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f60057e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f60058f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC3876i f60059g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, AbstractC3876i abstractC3876i, zu.d dVar) {
            super(2, dVar);
            this.f60058f = aVar;
            this.f60059g = abstractC3876i;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            b bVar = new b(this.f60058f, this.f60059g, dVar);
            bVar.f60057e = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
        
            r11 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b0 -> B:11:0x0041). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r10.f60056d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L39
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r10.f60057e
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r11)
                goto L41
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                java.lang.Object r1 = r10.f60055c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r10.f60054b
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Object r6 = r10.f60053a
                io.bidmachine.analytics.internal.i r6 = (io.bidmachine.analytics.internal.AbstractC3876i) r6
                java.lang.Object r7 = r10.f60057e
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                tu.a0.throwOnFailure(r11)
                tu.z r11 = (tu.z) r11
                java.lang.Object r11 = r11.m7139unboximpl()
                goto L7e
            L39:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.f60057e
                r1 = r11
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            L41:
                boolean r11 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r11 == 0) goto Lb2
                io.bidmachine.analytics.internal.i$a r11 = r10.f60058f
                java.util.List r11 = r11.c()
                io.bidmachine.analytics.internal.i r5 = r10.f60059g
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r11 = r11.iterator()
                r9 = r1
                r1 = r11
                r11 = r9
                r9 = r6
                r6 = r5
                r5 = r9
            L5e:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L8e
                java.lang.Object r7 = r1.next()
                io.bidmachine.analytics.ReaderConfig$Rule r7 = (io.bidmachine.analytics.ReaderConfig.Rule) r7
                r10.f60057e = r11
                r10.f60053a = r6
                r10.f60054b = r5
                r10.f60055c = r1
                r10.f60056d = r3
                java.lang.Object r7 = io.bidmachine.analytics.internal.AbstractC3876i.a(r6, r7, r10)
                if (r7 != r0) goto L7b
                goto Laf
            L7b:
                r9 = r7
                r7 = r11
                r11 = r9
            L7e:
                boolean r8 = tu.z.m7136isFailureimpl(r11)
                if (r8 == 0) goto L85
                r11 = r4
            L85:
                io.bidmachine.analytics.internal.h$a r11 = (io.bidmachine.analytics.internal.InterfaceC3875h.a) r11
                if (r11 == 0) goto L8c
                r5.add(r11)
            L8c:
                r11 = r7
                goto L5e
            L8e:
                java.util.List r5 = (java.util.List) r5
                io.bidmachine.analytics.internal.i$a r1 = r10.f60058f
                io.bidmachine.analytics.internal.h r1 = r1.a()
                r1.a(r5)
                io.bidmachine.analytics.internal.i$a r1 = r10.f60058f
                long r5 = r1.b()
                r10.f60057e = r11
                r10.f60053a = r4
                r10.f60054b = r4
                r10.f60055c = r4
                r10.f60056d = r2
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r5, r10)
                if (r1 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                r1 = r11
                goto L41
            Lb2:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.AbstractC3876i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.i$c */
    public static final class c extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        Object f60060a;

        /* renamed from: b, reason: collision with root package name */
        Object f60061b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60062c;

        /* renamed from: e, reason: collision with root package name */
        int f60064e;

        public c(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f60062c = obj;
            this.f60064e |= Integer.MIN_VALUE;
            Object objB = AbstractC3876i.this.b(null, this);
            return objB == av.e.getCOROUTINE_SUSPENDED() ? objB : tu.z.m7130boximpl(objB);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.i$d */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f60065a = new d();

        public d() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(p0.f60239g.a().c()));
        }
    }

    public abstract Object a(ReaderConfig.Rule rule, zu.d dVar);

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void e(Context context) {
        Job job = this.f60048e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void f(Context context) {
        Job job = this.f60048e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        a aVar = this.f60049f;
        if (aVar == null) {
            return;
        }
        this.f60048e = BuildersKt__Builders_commonKt.launch$default(b(), null, null, new b(aVar, this, null), 3, null);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(a aVar) {
        this.f60049f = aVar;
    }

    public final CoroutineScope b() {
        return (CoroutineScope) this.f60047d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(io.bidmachine.analytics.ReaderConfig.Rule r9, zu.d r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.bidmachine.analytics.internal.AbstractC3876i.c
            if (r0 == 0) goto L13
            r0 = r10
            io.bidmachine.analytics.internal.i$c r0 = (io.bidmachine.analytics.internal.AbstractC3876i.c) r0
            int r1 = r0.f60064e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60064e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.i$c r0 = new io.bidmachine.analytics.internal.i$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f60062c
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f60064e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f60061b
            io.bidmachine.analytics.ReaderConfig$Rule r9 = (io.bidmachine.analytics.ReaderConfig.Rule) r9
            java.lang.Object r0 = r0.f60060a
            r1 = r0
            io.bidmachine.analytics.internal.i r1 = (io.bidmachine.analytics.internal.AbstractC3876i) r1
            tu.a0.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L32
            goto L50
        L32:
            r0 = move-exception
            r10 = r0
            goto L5b
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            tu.a0.throwOnFailure(r10)
            int r10 = tu.z.f87419c     // Catch: java.lang.Throwable -> L58
            r0.f60060a = r8     // Catch: java.lang.Throwable -> L58
            r0.f60061b = r9     // Catch: java.lang.Throwable -> L58
            r0.f60064e = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r10 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L58
            if (r10 != r1) goto L4f
            return r1
        L4f:
            r1 = r8
        L50:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L32
            java.lang.Object r10 = tu.z.m7131constructorimpl(r10)     // Catch: java.lang.Throwable -> L32
        L56:
            r3 = r9
            goto L66
        L58:
            r0 = move-exception
            r10 = r0
            r1 = r8
        L5b:
            int r0 = tu.z.f87419c
            java.lang.Object r10 = tu.a0.createFailure(r10)
            java.lang.Object r10 = tu.z.m7131constructorimpl(r10)
            goto L56
        L66:
            boolean r9 = tu.z.m7136isFailureimpl(r10)
            if (r9 == 0) goto L6e
            r9 = 0
            goto L6f
        L6e:
            r9 = r10
        L6f:
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L81
            io.bidmachine.analytics.internal.h$a r2 = new io.bidmachine.analytics.internal.h$a
            r6 = 4
            r7 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = tu.z.m7131constructorimpl(r2)
            goto Lb8
        L81:
            java.lang.Throwable r9 = tu.z.m7134exceptionOrNullimpl(r10)
            boolean r10 = r9 instanceof java.util.concurrent.CancellationException
            if (r10 != 0) goto Lb9
            boolean r10 = r9 instanceof java.io.FileNotFoundException
            if (r10 == 0) goto L90
            io.bidmachine.analytics.internal.q0$a r10 = io.bidmachine.analytics.internal.q0.a.READER_NO_CONTENT
            goto L99
        L90:
            boolean r10 = r9 instanceof java.lang.SecurityException
            if (r10 == 0) goto L97
            io.bidmachine.analytics.internal.q0$a r10 = io.bidmachine.analytics.internal.q0.a.READER_NO_ACCESS
            goto L99
        L97:
            io.bidmachine.analytics.internal.q0$a r10 = io.bidmachine.analytics.internal.q0.a.READER_INVALID
        L99:
            if (r9 == 0) goto La1
            java.lang.String r9 = io.bidmachine.analytics.internal.s0.a(r9)
            if (r9 != 0) goto La3
        La1:
            java.lang.String r9 = ""
        La3:
            io.bidmachine.analytics.internal.h$a r2 = new io.bidmachine.analytics.internal.h$a
            io.bidmachine.analytics.internal.q0 r5 = new io.bidmachine.analytics.internal.q0
            java.lang.String r0 = r1.a()
            r5.<init>(r0, r10, r9)
            r6 = 2
            r7 = 0
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = tu.z.m7131constructorimpl(r2)
        Lb8:
            return r9
        Lb9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.AbstractC3876i.b(io.bidmachine.analytics.ReaderConfig$Rule, zu.d):java.lang.Object");
    }
}
