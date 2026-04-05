package io.bidmachine.analytics;

import android.content.Context;
import android.util.Base64;
import av.e;
import bv.n;
import io.bidmachine.analytics.internal.AbstractC3872e;
import io.bidmachine.analytics.internal.C;
import io.bidmachine.analytics.internal.C3868a;
import io.bidmachine.analytics.internal.C3878k;
import io.bidmachine.analytics.internal.C3880m;
import io.bidmachine.analytics.internal.C3885s;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kv.p;
import tu.a0;
import tu.o;
import tu.q;
import tu.x0;
import tu.z;
import uu.k0;
import uu.p1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class BidMachineAnalytics {
    public static final BidMachineAnalytics INSTANCE = new BidMachineAnalytics();

    /* renamed from: a, reason: collision with root package name */
    private static final o f59848a = q.lazy(b.f59857a);

    /* renamed from: b, reason: collision with root package name */
    private static String f59849b = "";

    /* renamed from: c, reason: collision with root package name */
    private static C3885s f59850c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        int f59851a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f59852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AnalyticsConfig f59853c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f59854d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f59855e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ConfigureListener f59856f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AnalyticsConfig analyticsConfig, String str, Context context, ConfigureListener configureListener, d dVar) {
            super(2, dVar);
            this.f59853c = analyticsConfig;
            this.f59854d = str;
            this.f59855e = context;
            this.f59856f = configureListener;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, d dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f59853c, this.f59854d, this.f59855e, this.f59856f, dVar);
            aVar.f59852b = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objM7131constructorimpl;
            Object objM7131constructorimpl2;
            x0 x0Var = x0.f87415a;
            e.getCOROUTINE_SUSPENDED();
            if (this.f59851a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AnalyticsConfig analyticsConfig = this.f59853c;
            try {
                int i10 = z.f87419c;
                BidMachineAnalytics bidMachineAnalytics = BidMachineAnalytics.INSTANCE;
                bidMachineAnalytics.setEncryptionManager$bidmachine_android_sdk_bg_3_4_0(bidMachineAnalytics.a(Base64.decode(analyticsConfig.getBpk(), 2)));
                objM7131constructorimpl = z.m7131constructorimpl(x0Var);
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (z.m7137isSuccessimpl(objM7131constructorimpl)) {
            }
            z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            try {
                BidMachineAnalytics.INSTANCE.a(this.f59855e, this.f59853c, this.f59856f);
                objM7131constructorimpl2 = z.m7131constructorimpl(x0Var);
            } catch (Throwable th3) {
                int i12 = z.f87419c;
                objM7131constructorimpl2 = z.m7131constructorimpl(a0.createFailure(th3));
            }
            if (z.m7137isSuccessimpl(objM7131constructorimpl2)) {
            }
            z.m7134exceptionOrNullimpl(objM7131constructorimpl2);
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f59857a = new b();

        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(ExecutorsKt.from(Executors.newSingleThreadExecutor())));
        }
    }

    private BidMachineAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3885s a(byte[] bArr) {
        C3868a c3868a = new C3868a();
        return new C3885s(c3868a, new C(bArr, c3868a.getName(), null, false, 12, null));
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig) {
        configure(context, analyticsConfig, null);
    }

    public static final Map<String, Map<String, Object>> getImpData(int i10) {
        AbstractC3872e.a aVar = (AbstractC3872e.a) k0.getOrNull(AbstractC3872e.a.values(), i10);
        return aVar == null ? p1.emptyMap() : C3878k.f60087a.a(aVar);
    }

    public static final void initialize(Context context) {
        C3878k.f60087a.b(context.getApplicationContext());
    }

    public final C3885s getEncryptionManager$bidmachine_android_sdk_bg_3_4_0() {
        return f59850c;
    }

    public final CoroutineScope getScope$bidmachine_android_sdk_bg_3_4_0() {
        return (CoroutineScope) f59848a.getValue();
    }

    public final String getSessionId$bidmachine_android_sdk_bg_3_4_0() {
        return f59849b;
    }

    public final void setEncryptionManager$bidmachine_android_sdk_bg_3_4_0(C3885s c3885s) {
        f59850c = c3885s;
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig, ConfigureListener configureListener) {
        String sessionId = analyticsConfig.getSessionId();
        f59849b = sessionId;
        initialize(context);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope$bidmachine_android_sdk_bg_3_4_0(), null, null, new a(analyticsConfig, sessionId, context.getApplicationContext(), configureListener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, AnalyticsConfig analyticsConfig, ConfigureListener configureListener) {
        C3880m.f60098a.a(context, analyticsConfig);
        C3878k.f60087a.a(context, analyticsConfig);
        if (configureListener != null) {
            configureListener.onConfigured();
        }
    }

    public static /* synthetic */ void getScope$bidmachine_android_sdk_bg_3_4_0$annotations() {
    }
}
