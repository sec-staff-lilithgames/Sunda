package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.BidMachineAnalytics;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class Y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f59984e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final o0 f59985a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59986b;

    /* renamed from: c, reason: collision with root package name */
    private final p0 f59987c;

    /* renamed from: d, reason: collision with root package name */
    private final C3885s f59988d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f59989a;

        /* renamed from: c, reason: collision with root package name */
        int f59991c;

        public b(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f59989a = obj;
            this.f59991c |= Integer.MIN_VALUE;
            Object objA = Y.this.a(this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : tu.z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f59992a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: a, reason: collision with root package name */
            int f59994a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y f59995b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Y y10, zu.d dVar) {
                super(2, dVar);
                this.f59995b = y10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d create(Object obj, zu.d dVar) {
                return new a(this.f59995b, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                if (this.f59994a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
                Y y10 = this.f59995b;
                return y10.a(y10.f59988d, this.f59995b.b());
            }
        }

        public c(zu.d dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return Y.this.new c(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objM7131constructorimpl;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f59992a;
            try {
                try {
                    if (i10 == 0) {
                        tu.a0.throwOnFailure(obj);
                        if (Y.this.f59988d == null) {
                            int i11 = tu.z.f87419c;
                            return tu.z.m7130boximpl(tu.z.m7131constructorimpl(Y.this.a()));
                        }
                        CoroutineDispatcher coroutineDispatcherB = Y.this.f59987c.b();
                        a aVar = new a(Y.this, null);
                        this.f59992a = 1;
                        obj = BuildersKt.withContext(coroutineDispatcherB, aVar, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tu.a0.throwOnFailure(obj);
                    }
                    byte[] bArr = (byte[]) obj;
                    Y y10 = Y.this;
                    y10.a(y10.f59986b, bArr);
                    int i12 = tu.z.f87419c;
                    objM7131constructorimpl = tu.z.m7131constructorimpl(Y.this.a());
                } catch (Throwable unused) {
                    int i13 = tu.z.f87419c;
                    return tu.z.m7130boximpl(tu.z.m7131constructorimpl(Y.this.a()));
                }
            } catch (Throwable th2) {
                int i14 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            return tu.z.m7130boximpl(objM7131constructorimpl);
        }
    }

    public Y(o0 o0Var, String str, p0 p0Var, C3885s c3885s) {
        this.f59985a = o0Var;
        this.f59986b = str;
        this.f59987c = p0Var;
        this.f59988d = c3885s;
    }

    public abstract Y a();

    public abstract byte[] b();

    private final int b(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zu.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.bidmachine.analytics.internal.Y.b
            if (r0 == 0) goto L13
            r0 = r6
            io.bidmachine.analytics.internal.Y$b r0 = (io.bidmachine.analytics.internal.Y.b) r0
            int r1 = r0.f59991c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59991c = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.Y$b r0 = new io.bidmachine.analytics.internal.Y$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f59989a
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59991c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            tu.a0.throwOnFailure(r6)
            io.bidmachine.analytics.internal.p0 r6 = r5.f59987c
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.c()
            io.bidmachine.analytics.internal.Y$c r2 = new io.bidmachine.analytics.internal.Y$c
            r4 = 0
            r2.<init>(r4)
            r0.f59991c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            tu.z r6 = (tu.z) r6
            java.lang.Object r6 = r6.m7139unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.Y.a(zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a(C3885s c3885s, byte[] bArr) {
        if (bArr != null) {
            return AbstractC3886t.a(bArr, c3885s);
        }
        return null;
    }

    public /* synthetic */ Y(o0 o0Var, String str, p0 p0Var, C3885s c3885s, int i10, kotlin.jvm.internal.u uVar) {
        this(o0Var, str, p0Var, (i10 & 8) != 0 ? BidMachineAnalytics.INSTANCE.getEncryptionManager$bidmachine_android_sdk_bg_3_4_0() : c3885s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:4:0x0013, B:6:0x0029, B:10:0x0042, B:13:0x0046, B:16:0x0056, B:21:0x0063, B:23:0x006c, B:24:0x0073, B:25:0x0074, B:35:0x008c, B:44:0x00a5, B:45:0x00ba, B:37:0x0090, B:39:0x0098, B:41:0x009e), top: B:53:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6, byte[] r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "Invalid response code: "
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Lbf
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Lbf
            java.net.URLConnection r6 = r2.openConnection()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.e0.checkNotNull(r6, r2)     // Catch: java.lang.Throwable -> Lbf
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> Lbf
            io.bidmachine.analytics.internal.o0 r2 = r5.f59985a     // Catch: java.lang.Throwable -> L3c
            r2.a(r6)     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r6.setInstanceFollowRedirects(r2)     // Catch: java.lang.Throwable -> L3c
            r2 = 40000(0x9c40, float:5.6052E-41)
            r6.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L3c
            r6.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L3c
            io.bidmachine.analytics.internal.s r2 = r5.f59988d     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L40
            java.lang.String r3 = "bm-data"
            io.bidmachine.analytics.internal.C r2 = r2.a()     // Catch: java.lang.Throwable -> L3c
            byte[] r2 = r2.b()     // Catch: java.lang.Throwable -> L3c
            r4 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r4)     // Catch: java.lang.Throwable -> L3c
            r6.setRequestProperty(r3, r2)     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r7 = move-exception
            r1 = r6
            goto Lc0
        L40:
            if (r7 == 0) goto L74
            int r2 = r7.length     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L46
            goto L74
        L46:
            r2 = 1
            r6.setDoOutput(r2)     // Catch: java.lang.Throwable -> L3c
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L60
            java.io.OutputStream r3 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L60
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L60
            r2.write(r7)     // Catch: java.lang.Throwable -> L5d
            io.bidmachine.analytics.internal.s0.a(r2)     // Catch: java.lang.Throwable -> L3c
            io.bidmachine.analytics.internal.s0.a(r2)     // Catch: java.lang.Throwable -> L3c
            goto L74
        L5d:
            r7 = move-exception
            r1 = r2
            goto L61
        L60:
            r7 = move-exception
        L61:
            if (r1 == 0) goto L6a
            java.lang.Object r0 = io.bidmachine.analytics.internal.s0.a(r1)     // Catch: java.lang.Throwable -> L3c
            tu.z.m7130boximpl(r0)     // Catch: java.lang.Throwable -> L3c
        L6a:
            if (r1 == 0) goto L73
            java.lang.Object r0 = io.bidmachine.analytics.internal.s0.a(r1)     // Catch: java.lang.Throwable -> L3c
            tu.z.m7130boximpl(r0)     // Catch: java.lang.Throwable -> L3c
        L73:
            throw r7     // Catch: java.lang.Throwable -> L3c
        L74:
            int r1 = r5.b(r6)     // Catch: java.lang.Throwable -> L3c
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto Lbb
            r2 = 204(0xcc, float:2.86E-43)
            if (r1 == r2) goto Lbb
            r2 = 305(0x131, float:4.27E-43)
            if (r1 == r2) goto L90
            r2 = 307(0x133, float:4.3E-43)
            if (r1 == r2) goto L90
            r2 = 308(0x134, float:4.32E-43)
            if (r1 == r2) goto L90
            switch(r1) {
                case 301: goto L90;
                case 302: goto L90;
                case 303: goto L90;
                default: goto L8f;
            }     // Catch: java.lang.Throwable -> L3c
        L8f:
            goto La5
        L90:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r6.getHeaderField(r2)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto La5
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L3c
            if (r3 <= 0) goto La5
            r5.a(r2, r7)     // Catch: java.lang.Throwable -> L3c
            r5.a(r6)
            return
        La5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            r2.append(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            throw r7     // Catch: java.lang.Throwable -> L3c
        Lbb:
            r5.a(r6)
            return
        Lbf:
            r7 = move-exception
        Lc0:
            r5.a(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.Y.a(java.lang.String, byte[]):void");
    }

    private final Object a(URLConnection uRLConnection) {
        try {
            int i10 = tu.z.f87419c;
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
            return tu.z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
    }
}
