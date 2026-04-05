package io.odeeo.internal.f1;

import android.content.Context;
import android.content.SharedPreferences;
import bv.n;
import com.inmobi.sdk.InMobiSdk;
import com.sfbx.appconsent.core.IABConstants;
import io.odeeo.internal.j1.k;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.consent.ConsentStringSource;
import io.odeeo.sdk.consent.ConsentType;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kv.p;
import sv.k0;
import tu.a0;
import tu.o;
import tu.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public static final C0612a f64010s = new C0612a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f64011a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.s1.a f64012b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.s1.c f64013c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<k> f64014d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f64015e;

    /* renamed from: f, reason: collision with root package name */
    public String f64016f;

    /* renamed from: g, reason: collision with root package name */
    public ConsentStringSource f64017g;

    /* renamed from: h, reason: collision with root package name */
    public String f64018h;

    /* renamed from: i, reason: collision with root package name */
    public ConsentStringSource f64019i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f64020j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f64021k;

    /* renamed from: l, reason: collision with root package name */
    public ConsentStringSource f64022l;

    /* renamed from: m, reason: collision with root package name */
    public io.odeeo.internal.f1.e f64023m;

    /* renamed from: n, reason: collision with root package name */
    public ConsentType f64024n;

    /* renamed from: o, reason: collision with root package name */
    public CoroutineScope f64025o;

    /* renamed from: p, reason: collision with root package name */
    public final o f64026p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f64027q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f64028r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.f1.a$a, reason: collision with other inner class name */
    public static final class C0612a {
        public C0612a() {
        }

        public /* synthetic */ C0612a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f64029a = new b();

        public b() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4589invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4589invoke();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.consent.ConsentDataManager$callUpdateGeneralConsentEndpoint$2", f = "ConsentDataManager.kt", i = {0, 1, 2, 2}, l = {97, 98, 104}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "$this$onFailure$iv"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class c extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f64030a;

        /* renamed from: b, reason: collision with root package name */
        public int f64031b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f64032c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.a f64034e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.f1.a$c$a, reason: collision with other inner class name */
        public static final class C0613a extends f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f64035a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0613a(CoroutineScope coroutineScope) {
                super(0);
                this.f64035a = coroutineScope;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m4590invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4590invoke() {
                CoroutineScopeKt.cancel$default(this.f64035a, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kv.a aVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f64034e = aVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = a.this.new c(this.f64034e, dVar);
            cVar.f64032c = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        
            if (r11 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
        
            if (r6.retryFetch$odeeoSdk_release(r8, "GeneralConsent", r7, r10) == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009f -> B:8:0x001d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c4 -> B:8:0x001d). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r10.f64031b
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L38
                if (r1 == r5) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f64030a
                io.odeeo.internal.a.c r1 = (io.odeeo.internal.a.c) r1
                java.lang.Object r1 = r10.f64032c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r11)
            L1d:
                r11 = r1
                goto Lc7
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                java.lang.Object r1 = r10.f64032c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r11)
                goto L7a
            L30:
                java.lang.Object r1 = r10.f64032c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r11)
                goto L56
            L38:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.f64032c
                kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            L3f:
                io.odeeo.internal.f1.a r1 = io.odeeo.internal.f1.a.this
                io.odeeo.internal.s1.a r1 = r1.getGenerateConsentRequestUseCase()
                r10.f64032c = r11
                r10.f64030a = r4
                r10.f64031b = r5
                java.lang.Object r1 = r1.invoke(r10)
                if (r1 != r0) goto L53
                goto Lc6
            L53:
                r9 = r1
                r1 = r11
                r11 = r9
            L56:
                io.odeeo.internal.a.c r11 = (io.odeeo.internal.a.c) r11
                io.odeeo.internal.f1.a r6 = io.odeeo.internal.f1.a.this
                boolean r7 = r11 instanceof io.odeeo.internal.a.b
                if (r7 == 0) goto L7d
                io.odeeo.internal.a.b r11 = (io.odeeo.internal.a.b) r11
                java.lang.Object r11 = r11.getValue()
                io.odeeo.internal.f1.c r11 = (io.odeeo.internal.f1.c) r11
                io.odeeo.internal.s1.c r6 = r6.getUpdateGeneralConsentUseCase()
                io.odeeo.internal.s1.c$a r7 = new io.odeeo.internal.s1.c$a
                r7.<init>(r11)
                r10.f64032c = r1
                r10.f64031b = r3
                java.lang.Object r11 = r6.invoke(r7, r10)
                if (r11 != r0) goto L7a
                goto Lc6
            L7a:
                io.odeeo.internal.a.c r11 = (io.odeeo.internal.a.c) r11
                goto L81
            L7d:
                boolean r6 = r11 instanceof io.odeeo.internal.a.a
                if (r6 == 0) goto Ld0
            L81:
                io.odeeo.internal.f1.a r6 = io.odeeo.internal.f1.a.this
                kv.a r7 = r10.f64034e
                boolean r8 = r11 instanceof io.odeeo.internal.a.b
                if (r8 == 0) goto L9b
                r8 = r11
                io.odeeo.internal.a.b r8 = (io.odeeo.internal.a.b) r8
                java.lang.Object r8 = r8.getValue()
                io.odeeo.internal.f1.e r8 = (io.odeeo.internal.f1.e) r8
                r6.setGeneralConsentData$odeeoSdk_release(r8)
                r7.invoke()
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(r1, r4, r5, r4)
            L9b:
                io.odeeo.internal.f1.a r6 = io.odeeo.internal.f1.a.this
                boolean r7 = r11 instanceof io.odeeo.internal.a.a
                if (r7 == 0) goto L1d
                r7 = r11
                io.odeeo.internal.a.a r7 = (io.odeeo.internal.a.a) r7
                java.lang.Object r7 = r7.getError()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                io.odeeo.internal.j1.k r6 = io.odeeo.internal.f1.a.access$getRetryManager(r6)
                io.odeeo.internal.a.a r8 = new io.odeeo.internal.a.a
                r8.<init>(r7)
                io.odeeo.internal.f1.a$c$a r7 = new io.odeeo.internal.f1.a$c$a
                r7.<init>(r1)
                r10.f64032c = r1
                r10.f64030a = r11
                r10.f64031b = r2
                java.lang.String r11 = "GeneralConsent"
                java.lang.Object r11 = r6.retryFetch$odeeoSdk_release(r8, r11, r7, r10)
                if (r11 != r0) goto L1d
            Lc6:
                return r0
            Lc7:
                boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r11)
                if (r1 != 0) goto L3f
                tu.x0 r11 = tu.x0.f87415a
                return r11
            Ld0:
                tu.t r11 = new tu.t
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.f1.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.consent.ConsentDataManager$onSharedPreferenceChanged$1", f = "ConsentDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f64036a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64037b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f64038c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f64039d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, a aVar, SharedPreferences sharedPreferences, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f64037b = str;
            this.f64038c = aVar;
            this.f64039d = sharedPreferences;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f64037b, this.f64038c, this.f64039d, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f64036a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            String str = this.f64037b;
            int iHashCode = str.hashCode();
            if (iHashCode != 83641339) {
                if (iHashCode != 743443760) {
                    if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        this.f64038c.setGdprConsentStr$odeeoSdk_release(this.f64039d.getString("IABTCF_TCString", null));
                        this.f64038c.setGdprConsentStrSource$odeeoSdk_release(ConsentStringSource.Device);
                    }
                } else if (str.equals("IABUSPrivacy_String")) {
                    this.f64038c.setPrivacyStr$odeeoSdk_release(this.f64039d.getString("IABUSPrivacy_String", null));
                    a aVar = this.f64038c;
                    ConsentStringSource consentStringSource = ConsentStringSource.Device;
                    aVar.setPrivacyStrSource$odeeoSdk_release(consentStringSource);
                    a aVar2 = this.f64038c;
                    String privacyStr$odeeoSdk_release = aVar2.getPrivacyStr$odeeoSdk_release();
                    aVar2.setCcpaConsent$odeeoSdk_release(privacyStr$odeeoSdk_release == null ? null : bv.b.boxBoolean(k0.startsWith$default(privacyStr$odeeoSdk_release, "1YN", false, 2, null)));
                    if (this.f64038c.getCcpaConsent$odeeoSdk_release() != null) {
                        this.f64038c.setCcpaConsentSource$odeeoSdk_release(consentStringSource);
                    }
                }
            } else if (str.equals("IABTCF_gdprApplies")) {
                this.f64038c.setGdprApplied$odeeoSdk_release(this.f64039d.getInt("IABTCF_gdprApplies", 0) == 1);
            }
            if (OdeeoSDK.isInitialized()) {
                a.callUpdateGeneralConsentEndpoint$default(this.f64038c, null, 1, null);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends f0 implements kv.a {
        public e() {
            super(0);
        }

        @Override // kv.a
        public final k invoke() {
            return a.this.getRetryManagerProvider().get();
        }
    }

    public a(Context context, io.odeeo.internal.s1.a generateConsentRequestUseCase, io.odeeo.internal.s1.c updateGeneralConsentUseCase, io.odeeo.internal.x1.a<k> retryManagerProvider) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(generateConsentRequestUseCase, "generateConsentRequestUseCase");
        e0.checkNotNullParameter(updateGeneralConsentUseCase, "updateGeneralConsentUseCase");
        e0.checkNotNullParameter(retryManagerProvider, "retryManagerProvider");
        this.f64011a = context;
        this.f64012b = generateConsentRequestUseCase;
        this.f64013c = updateGeneralConsentUseCase;
        this.f64014d = retryManagerProvider;
        SharedPreferences defaultSharedPreferences = io.odeeo.internal.v1.o.f67285a.getDefaultSharedPreferences(context);
        this.f64015e = defaultSharedPreferences;
        ConsentStringSource consentStringSource = ConsentStringSource.None;
        this.f64017g = consentStringSource;
        this.f64019i = consentStringSource;
        this.f64022l = consentStringSource;
        this.f64024n = ConsentType.Undefined;
        this.f64025o = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.f64026p = q.lazy(new e());
        if (defaultSharedPreferences == null) {
            return;
        }
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public static /* synthetic */ void callUpdateGeneralConsentEndpoint$default(a aVar, kv.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar2 = b.f64029a;
        }
        aVar.callUpdateGeneralConsentEndpoint(aVar2);
    }

    public static /* synthetic */ void setDoNotSell$odeeoSdk_release$default(a aVar, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        aVar.setDoNotSell$odeeoSdk_release(z10, str);
    }

    public static /* synthetic */ void setGdprConsent$odeeoSdk_release$default(a aVar, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        aVar.setGdprConsent$odeeoSdk_release(z10, str);
    }

    public static /* synthetic */ void setGdprConsentString$odeeoSdk_release$default(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        aVar.setGdprConsentString$odeeoSdk_release(str);
    }

    public final k a() {
        Object value = this.f64026p.getValue();
        e0.checkNotNullExpressionValue(value, "<get-retryManager>(...)");
        return (k) value;
    }

    public final void callUpdateGeneralConsentEndpoint(kv.a onUpdateSuccess) {
        e0.checkNotNullParameter(onUpdateSuccess, "onUpdateSuccess");
        BuildersKt__Builders_commonKt.launch$default(this.f64025o, null, null, new c(onUpdateSuccess, null), 3, null);
    }

    public final boolean canRequestPersonalInfo() {
        return isCanCollectPersonalInfo$odeeoSdk_release();
    }

    public final void clearForceRegulationType() {
        this.f64024n = ConsentType.Undefined;
    }

    public final void forceRegulationType(ConsentType type) {
        e0.checkNotNullParameter(type, "type");
        this.f64024n = type;
    }

    public final Boolean getCcpaConsent$odeeoSdk_release() {
        return this.f64021k;
    }

    public final ConsentStringSource getCcpaConsentSource$odeeoSdk_release() {
        return this.f64022l;
    }

    public final Context getContext() {
        return this.f64011a;
    }

    public final ConsentType getForceRegulationType$odeeoSdk_release() {
        return this.f64024n;
    }

    public final Boolean getGdprConsent$odeeoSdk_release() {
        return this.f64020j;
    }

    public final String getGdprConsentStr$odeeoSdk_release() {
        return this.f64016f;
    }

    public final ConsentStringSource getGdprConsentStrSource$odeeoSdk_release() {
        return this.f64017g;
    }

    public final String getGdprConsentString$odeeoSdk_release() {
        return this.f64016f;
    }

    public final io.odeeo.internal.f1.e getGeneralConsentData$odeeoSdk_release() {
        return this.f64023m;
    }

    public final io.odeeo.internal.s1.a getGenerateConsentRequestUseCase() {
        return this.f64012b;
    }

    public final f getIabTcfMetadata$odeeoSdk_release() {
        SharedPreferences sharedPreferences = this.f64015e;
        Integer numValueOf = null;
        Integer numValueOf2 = (sharedPreferences != null && sharedPreferences.contains(IABConstants.CMP_SDK_ID)) ? Integer.valueOf(this.f64015e.getInt(IABConstants.CMP_SDK_ID, 0)) : null;
        SharedPreferences sharedPreferences2 = this.f64015e;
        Integer numValueOf3 = (sharedPreferences2 != null && sharedPreferences2.contains(IABConstants.CMP_SDK_VERSION)) ? Integer.valueOf(this.f64015e.getInt(IABConstants.CMP_SDK_VERSION, 0)) : null;
        SharedPreferences sharedPreferences3 = this.f64015e;
        Integer numValueOf4 = (sharedPreferences3 != null && sharedPreferences3.contains(IABConstants.POLICY_VERSION)) ? Integer.valueOf(this.f64015e.getInt(IABConstants.POLICY_VERSION, 0)) : null;
        SharedPreferences sharedPreferences4 = this.f64015e;
        if (sharedPreferences4 != null && sharedPreferences4.contains("IABTCF_gdprApplies")) {
            numValueOf = Integer.valueOf(this.f64015e.getInt("IABTCF_gdprApplies", 0));
        }
        return new f(numValueOf2, numValueOf3, numValueOf4, numValueOf);
    }

    public final String getPrivacyStr$odeeoSdk_release() {
        return this.f64018h;
    }

    public final ConsentStringSource getPrivacyStrSource$odeeoSdk_release() {
        return this.f64019i;
    }

    public final String getPrivacyString$odeeoSdk_release() {
        return this.f64018h;
    }

    public final ConsentType getRegulationType$odeeoSdk_release() {
        ConsentType consentType = this.f64024n;
        if (consentType != ConsentType.Undefined) {
            return consentType;
        }
        io.odeeo.internal.f1.e eVar = this.f64023m;
        String regulationType = eVar == null ? null : eVar.getRegulationType();
        if (regulationType != null) {
            String lowerCase = regulationType.toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (e0.areEqual(lowerCase, InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES)) {
                return ConsentType.Gdpr;
            }
            if (e0.areEqual(lowerCase, "ccpa")) {
                return ConsentType.Ccpa;
            }
        }
        return this.f64027q ? ConsentType.Gdpr : this.f64028r ? ConsentType.Ccpa : ConsentType.None;
    }

    public final io.odeeo.internal.x1.a<k> getRetryManagerProvider() {
        return this.f64014d;
    }

    public final CoroutineScope getScope$odeeoSdk_release() {
        return this.f64025o;
    }

    public final io.odeeo.internal.s1.c getUpdateGeneralConsentUseCase() {
        return this.f64013c;
    }

    public final boolean isCanCollectPersonalInfo$odeeoSdk_release() {
        Boolean bool;
        if (getRegulationType$odeeoSdk_release() == ConsentType.Ccpa && this.f64022l == ConsentStringSource.Function && (bool = this.f64021k) != null) {
            return bool.booleanValue();
        }
        io.odeeo.internal.f1.e eVar = this.f64023m;
        if (eVar == null) {
            return false;
        }
        return eVar.getGeneralConsent();
    }

    public final boolean isCcpaApplied$odeeoSdk_release() {
        return this.f64028r;
    }

    public final boolean isGdprApplied$odeeoSdk_release() {
        return this.f64027q;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        e0.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        e0.checkNotNullParameter(key, "key");
        io.odeeo.internal.b2.a.d(e0.stringPlus("onSharedPreferenceChanged: ", key), new Object[0]);
        if (uu.k0.contains(new String[]{"IABTCF_gdprApplies", "IABTCF_TCString", "IABUSPrivacy_String"}, key)) {
            BuildersKt__Builders_commonKt.launch$default(this.f64025o, null, null, new d(key, this, sharedPreferences, null), 3, null);
        }
    }

    public final void setCcpaApplied$odeeoSdk_release(boolean z10) {
        if (z10) {
            setGdprApplied$odeeoSdk_release(false);
        }
        this.f64028r = z10;
    }

    public final void setCcpaConsent$odeeoSdk_release(Boolean bool) {
        this.f64021k = bool;
    }

    public final void setCcpaConsentSource$odeeoSdk_release(ConsentStringSource consentStringSource) {
        e0.checkNotNullParameter(consentStringSource, "<set-?>");
        this.f64022l = consentStringSource;
    }

    public final void setDoNotSell$odeeoSdk_release(boolean z10, String str) {
        this.f64021k = Boolean.valueOf(!z10);
        this.f64022l = ConsentStringSource.Function;
        setDoNotSell$odeeoSdk_release(str);
    }

    public final void setForceRegulationType$odeeoSdk_release(ConsentType consentType) {
        e0.checkNotNullParameter(consentType, "<set-?>");
        this.f64024n = consentType;
    }

    public final void setGdprApplied$odeeoSdk_release(boolean z10) {
        if (z10) {
            setCcpaApplied$odeeoSdk_release(false);
        }
        this.f64027q = z10;
    }

    public final void setGdprConsent$odeeoSdk_release(Boolean bool) {
        this.f64020j = bool;
    }

    public final void setGdprConsentStr$odeeoSdk_release(String str) {
        this.f64016f = str;
    }

    public final void setGdprConsentStrSource$odeeoSdk_release(ConsentStringSource consentStringSource) {
        e0.checkNotNullParameter(consentStringSource, "<set-?>");
        this.f64017g = consentStringSource;
    }

    public final void setGdprConsentString$odeeoSdk_release(String str) {
        if (str != null) {
            this.f64016f = str;
            this.f64017g = ConsentStringSource.Function;
        }
    }

    public final void setGeneralConsentData$odeeoSdk_release(io.odeeo.internal.f1.e eVar) {
        this.f64023m = eVar;
    }

    public final void setPrivacyStr$odeeoSdk_release(String str) {
        this.f64018h = str;
    }

    public final void setPrivacyStrSource$odeeoSdk_release(ConsentStringSource consentStringSource) {
        e0.checkNotNullParameter(consentStringSource, "<set-?>");
        this.f64019i = consentStringSource;
    }

    public final void setScope$odeeoSdk_release(CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(coroutineScope, "<set-?>");
        this.f64025o = coroutineScope;
    }

    public final void updateValuesFromIamTcf$odeeoSdk_release() {
        SharedPreferences sharedPreferences;
        ConsentStringSource consentStringSource = this.f64017g;
        ConsentStringSource consentStringSource2 = ConsentStringSource.None;
        if (consentStringSource == consentStringSource2 && (sharedPreferences = this.f64015e) != null && sharedPreferences.contains("IABTCF_TCString")) {
            this.f64016f = this.f64015e.getString("IABTCF_TCString", null);
            this.f64017g = ConsentStringSource.Device;
        }
        SharedPreferences sharedPreferences2 = this.f64015e;
        if (sharedPreferences2 != null && sharedPreferences2.contains("IABTCF_gdprApplies")) {
            setGdprApplied$odeeoSdk_release(this.f64015e.getInt("IABTCF_gdprApplies", 0) == 1);
        }
        SharedPreferences sharedPreferences3 = this.f64015e;
        if (sharedPreferences3 != null && sharedPreferences3.contains("IABUSPrivacy_String") && this.f64019i == consentStringSource2) {
            String string = this.f64015e.getString("IABUSPrivacy_String", null);
            this.f64018h = string;
            ConsentStringSource consentStringSource3 = ConsentStringSource.Device;
            this.f64019i = consentStringSource3;
            Boolean boolValueOf = string != null ? Boolean.valueOf(k0.startsWith$default(string, "1YN", false, 2, null)) : null;
            this.f64021k = boolValueOf;
            if (boolValueOf != null) {
                this.f64022l = consentStringSource3;
            }
        }
    }

    public static /* synthetic */ void setDoNotSell$odeeoSdk_release$default(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        aVar.setDoNotSell$odeeoSdk_release(str);
    }

    public final void setGdprConsent$odeeoSdk_release(boolean z10, String str) {
        this.f64020j = Boolean.valueOf(z10);
        setGdprConsentString$odeeoSdk_release(str);
    }

    public final void setDoNotSell$odeeoSdk_release(String str) {
        if (str != null) {
            this.f64018h = str;
            this.f64019i = ConsentStringSource.Function;
        }
        if (this.f64021k == null) {
            Boolean boolValueOf = str != null ? Boolean.valueOf(k0.startsWith$default(str, "1YN", false, 2, null)) : null;
            this.f64021k = boolValueOf;
            if (boolValueOf != null) {
                this.f64022l = ConsentStringSource.Function;
            }
        }
    }
}
