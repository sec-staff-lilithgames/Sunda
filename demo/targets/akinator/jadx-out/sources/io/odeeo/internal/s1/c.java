package io.odeeo.internal.s1;

import io.odeeo.internal.f1.e;
import io.odeeo.internal.j1.f;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends io.odeeo.internal.p1.a<e, Throwable, a> {

    /* renamed from: b, reason: collision with root package name */
    public final f f66348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66349c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66350d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.f1.c f66351a;

        public a(io.odeeo.internal.f1.c consentRequest) {
            e0.checkNotNullParameter(consentRequest, "consentRequest");
            this.f66351a = consentRequest;
        }

        public static /* synthetic */ a copy$default(a aVar, io.odeeo.internal.f1.c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f66351a;
            }
            return aVar.copy(cVar);
        }

        public final io.odeeo.internal.f1.c component1() {
            return this.f66351a;
        }

        public final a copy(io.odeeo.internal.f1.c consentRequest) {
            e0.checkNotNullParameter(consentRequest, "consentRequest");
            return new a(consentRequest);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && e0.areEqual(this.f66351a, ((a) obj).f66351a);
        }

        public final io.odeeo.internal.f1.c getConsentRequest() {
            return this.f66351a;
        }

        public int hashCode() {
            return this.f66351a.hashCode();
        }

        public String toString() {
            return "Params(consentRequest=" + this.f66351a + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.usecase.gc.UpdateGeneralConsentUseCase", f = "UpdateGeneralConsentUseCase.kt", i = {}, l = {25}, m = "execute", n = {}, s = {})
    public static final class b extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f66352a;

        /* renamed from: c, reason: collision with root package name */
        public int f66354c;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f66352a = obj;
            this.f66354c |= Integer.MIN_VALUE;
            return c.this.execute(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f networkManager, String appKey, String bundleId) {
        super(Dispatchers.getIO());
        e0.checkNotNullParameter(networkManager, "networkManager");
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(bundleId, "bundleId");
        this.f66348b = networkManager;
        this.f66349c = appKey;
        this.f66350d = bundleId;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.odeeo.internal.p1.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(io.odeeo.internal.s1.c.a r11, zu.d<? super io.odeeo.internal.a.c<io.odeeo.internal.f1.e, ? extends java.lang.Throwable>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.odeeo.internal.s1.c.b
            if (r0 == 0) goto L14
            r0 = r12
            io.odeeo.internal.s1.c$b r0 = (io.odeeo.internal.s1.c.b) r0
            int r1 = r0.f66354c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f66354c = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            io.odeeo.internal.s1.c$b r0 = new io.odeeo.internal.s1.c$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f66352a
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f66354c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L2b
            goto L68
        L2b:
            r0 = move-exception
            r11 = r0
            goto Lb0
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            tu.a0.throwOnFailure(r12)
            io.odeeo.internal.j1.f r12 = r10.f66348b     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.j1.h r1 = r12.getOdeeoSDKApi()     // Catch: java.lang.Throwable -> L2b
            io.odeeo.sdk.OdeeoSDK r12 = io.odeeo.sdk.OdeeoSDK.INSTANCE     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.d1.h r12 = r12.getPoParameters$odeeoSdk_release()     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.d1.a r12 = r12.getConfigManager()     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.e1.b r12 = r12.getGlobalConfig()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r12 = r12.getGcApi()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r10.f66349c     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r10.f66350d     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.f1.c r6 = r11.getConsentRequest()     // Catch: java.lang.Throwable -> L2b
            r7.f66354c = r2     // Catch: java.lang.Throwable -> L2b
            r5 = 0
            r8 = 8
            r9 = 0
            r2 = r12
            java.lang.Object r12 = io.odeeo.internal.j1.h.a.updateGeneralConsent$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2b
            if (r12 != r0) goto L68
            return r0
        L68:
            io.odeeo.internal.y1.r r12 = (io.odeeo.internal.y1.r) r12     // Catch: java.lang.Throwable -> L2b
            boolean r11 = r12.isSuccessful()     // Catch: java.lang.Throwable -> L2b
            if (r11 == 0) goto L97
            java.lang.Object r11 = r12.body()     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.f1.e r11 = (io.odeeo.internal.f1.e) r11     // Catch: java.lang.Throwable -> L2b
            if (r11 == 0) goto L8a
            java.lang.String r12 = "Response body: "
            java.lang.String r12 = kotlin.jvm.internal.e0.stringPlus(r12, r11)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.b2.a.d(r12, r0)     // Catch: java.lang.Throwable -> L2b
            io.odeeo.internal.a.b r12 = new io.odeeo.internal.a.b     // Catch: java.lang.Throwable -> L2b
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L2b
            return r12
        L8a:
            io.odeeo.internal.a.a r11 = new io.odeeo.internal.a.a     // Catch: java.lang.Throwable -> L2b
            java.lang.Throwable r12 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "Response body is null"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L2b
            return r11
        L97:
            io.odeeo.internal.a.a r11 = new io.odeeo.internal.a.a     // Catch: java.lang.Throwable -> L2b
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "Response code: "
            int r12 = r12.code()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r12 = bv.b.boxInt(r12)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r12 = kotlin.jvm.internal.e0.stringPlus(r1, r12)     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L2b
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            return r11
        Lb0:
            r11.printStackTrace()
            io.odeeo.internal.a.a r12 = new io.odeeo.internal.a.a
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.s1.c.execute(io.odeeo.internal.s1.c$a, zu.d):java.lang.Object");
    }
}
