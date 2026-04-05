package io.odeeo.internal.d1;

import android.content.Context;
import com.iab.omid.library.odeeoio.Omid;
import com.sfbx.appconsent.core.BuildConfig;
import io.odeeo.internal.n1.e;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends io.odeeo.internal.n1.e {

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.j1.f f63664f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.u1.a f63665g;

    /* renamed from: h, reason: collision with root package name */
    public final io.odeeo.internal.a1.b f63666h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.d1.a f63667i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f63668j;

    /* renamed from: k, reason: collision with root package name */
    public io.odeeo.internal.m1.b f63669k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements l {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.d1.h$a$a, reason: collision with other inner class name */
        public static final class C0603a extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f63671a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0603a(h hVar) {
                super(1);
                this.f63671a = hVar;
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.f) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.f success) {
                e0.checkNotNullParameter(success, "success");
                Object obj = success.getParameters().get("globalConfig");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.odeeo.sdk.config.data.GlobalConfig");
                }
                this.f63671a.getSessionManager().setTrackingEventURL(((io.odeeo.internal.e1.b) obj).getTrackingSessionEventApi());
                this.f63671a.getConfigManager().fetchGlobalConfig(BuildConfig.VERSION_CODE);
                this.f63671a.setClientMetadata(new io.odeeo.internal.m1.b(this.f63671a.getContext()));
                this.f63671a.setState(success);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f63672a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar) {
                super(1);
                this.f63672a = hVar;
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.a) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.a badInternetError) {
                e0.checkNotNullParameter(badInternetError, "badInternetError");
                Object obj = badInternetError.getParameters().get("delaySecs");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                this.f63672a.getConfigManager().fetchGlobalConfig(((Integer) obj).intValue());
                this.f63672a.setState(badInternetError);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f63673a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar) {
                super(1);
                this.f63673a = hVar;
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.h) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.h wrongAuthenticationDataError) {
                e0.checkNotNullParameter(wrongAuthenticationDataError, "wrongAuthenticationDataError");
                this.f63673a.setState(wrongAuthenticationDataError);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class d extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f63674a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar) {
                super(1);
                this.f63674a = hVar;
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.b) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.b badRequestError) {
                e0.checkNotNullParameter(badRequestError, "badRequestError");
                this.f63674a.setState(badRequestError);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class e extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f63675a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(h hVar) {
                super(1);
                this.f63675a = hVar;
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((io.odeeo.internal.n1.g) obj);
                return x0.f87415a;
            }

            public final void invoke(io.odeeo.internal.n1.g unknownError) {
                e0.checkNotNullParameter(unknownError, "unknownError");
                Object obj = unknownError.getParameters().get("delaySecs");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                this.f63675a.getConfigManager().fetchGlobalConfig(((Integer) obj).intValue());
                this.f63675a.setState(unknownError);
            }
        }

        public a() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e.a) obj);
            return x0.f87415a;
        }

        public final void invoke(e.a stateListenerLaunch) {
            e0.checkNotNullParameter(stateListenerLaunch, "$this$stateListenerLaunch");
            stateListenerLaunch.onSuccess(new C0603a(h.this));
            stateListenerLaunch.onBadInternetError(new b(h.this));
            stateListenerLaunch.onWrongAuthenticationDataError(new c(h.this));
            stateListenerLaunch.onBadRequestError(new d(h.this));
            stateListenerLaunch.onError(new e(h.this));
        }
    }

    public h(io.odeeo.internal.j1.f networkManager, io.odeeo.internal.u1.a personalInfo, io.odeeo.internal.a1.b sessionManager, io.odeeo.internal.d1.a configManager, Context context) {
        e0.checkNotNullParameter(networkManager, "networkManager");
        e0.checkNotNullParameter(personalInfo, "personalInfo");
        e0.checkNotNullParameter(sessionManager, "sessionManager");
        e0.checkNotNullParameter(configManager, "configManager");
        e0.checkNotNullParameter(context, "context");
        this.f63664f = networkManager;
        this.f63665g = personalInfo;
        this.f63666h = sessionManager;
        this.f63667i = configManager;
        this.f63668j = context;
    }

    public final io.odeeo.internal.m1.b getClientMetadata() {
        return this.f63669k;
    }

    public final io.odeeo.internal.d1.a getConfigManager() {
        return this.f63667i;
    }

    public final Context getContext() {
        return this.f63668j;
    }

    public final io.odeeo.internal.j1.f getNetworkManager() {
        return this.f63664f;
    }

    public final io.odeeo.internal.u1.a getPersonalInfo() {
        return this.f63665g;
    }

    public final io.odeeo.internal.a1.b getSessionManager() {
        return this.f63666h;
    }

    public final void initOmid$odeeoSdk_release(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context);
    }

    public final void initParameters() {
        io.odeeo.internal.d1.a aVar = this.f63667i;
        io.odeeo.internal.d1.a.fetchGlobalConfig$default(aVar, 0, 1, null);
        aVar.stateListenerLaunch(new a());
        initOmid$odeeoSdk_release(this.f63668j);
    }

    public final void setClientMetadata(io.odeeo.internal.m1.b bVar) {
        this.f63669k = bVar;
    }
}
