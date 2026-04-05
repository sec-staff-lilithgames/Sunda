package io.odeeo.internal.u1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.AdError;
import io.odeeo.internal.m1.d;
import io.odeeo.internal.n1.e;
import io.odeeo.internal.n1.f;
import io.odeeo.sdk.consent.ConsentStringSource;
import io.odeeo.sdk.consent.ConsentType;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.o;
import tu.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a extends e {

    /* renamed from: f, reason: collision with root package name */
    public String f67224f;

    /* renamed from: g, reason: collision with root package name */
    public final o f67225g;

    /* renamed from: h, reason: collision with root package name */
    public final o f67226h;

    /* renamed from: i, reason: collision with root package name */
    public String f67227i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f67228j;

    /* renamed from: k, reason: collision with root package name */
    public final io.odeeo.internal.f1.a f67229k;

    /* renamed from: l, reason: collision with root package name */
    public String f67230l;

    /* renamed from: m, reason: collision with root package name */
    public d f67231m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference<Context> f67232n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.u1.a$a, reason: collision with other inner class name */
    public static final class C0674a extends f0 implements kv.a {
        public C0674a() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            Context context;
            String strA;
            WeakReference<Context> appContext$odeeoSdk_release = a.this.getAppContext$odeeoSdk_release();
            return (appContext$odeeoSdk_release == null || (context = appContext$odeeoSdk_release.get()) == null || (strA = a.this.a(context)) == null) ? "0.0.0" : strA;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.a {
        public b() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            Context context;
            String packageName;
            WeakReference<Context> appContext$odeeoSdk_release = a.this.getAppContext$odeeoSdk_release();
            return (appContext$odeeoSdk_release == null || (context = appContext$odeeoSdk_release.get()) == null || (packageName = context.getPackageName()) == null) ? "com.unknown" : packageName;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements l {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.u1.a$c$a, reason: collision with other inner class name */
        public static final class C0675a extends f0 implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f67236a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e.a f67237b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0675a(a aVar, e.a aVar2) {
                super(1);
                this.f67236a = aVar;
                this.f67237b = aVar2;
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((f) obj);
                return x0.f87415a;
            }

            public final void invoke(f it) {
                e0.checkNotNullParameter(it, "it");
                a aVar = this.f67236a;
                String simpleName = this.f67237b.getClass().getSimpleName();
                e0.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
                aVar.setState(new f(simpleName, null, null, 6, null));
            }
        }

        public c() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e.a) obj);
            return x0.f87415a;
        }

        public final void invoke(e.a stateListenerLaunch) {
            e0.checkNotNullParameter(stateListenerLaunch, "$this$stateListenerLaunch");
            stateListenerLaunch.onSuccess(new C0675a(a.this, stateListenerLaunch));
        }
    }

    public a(Context context, io.odeeo.internal.f1.a consentDataManager, d sdkIdentifier, String appKey) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(consentDataManager, "consentDataManager");
        e0.checkNotNullParameter(sdkIdentifier, "sdkIdentifier");
        e0.checkNotNullParameter(appKey, "appKey");
        this.f67224f = "00000000-0000-0000-0000-000000000000";
        this.f67225g = q.lazy(new b());
        this.f67226h = q.lazy(new C0674a());
        this.f67227i = "unknown";
        this.f67230l = "";
        this.f67231m = sdkIdentifier;
        this.f67224f = appKey;
        this.f67229k = consentDataManager;
        this.f67232n = new WeakReference<>(context);
        a(sdkIdentifier);
    }

    public final void a(d dVar) {
        dVar.stateListenerLaunch(new c());
    }

    public final boolean canCollectPersonalInformation$odeeoSdk_release() {
        return this.f67229k.isCanCollectPersonalInfo$odeeoSdk_release();
    }

    public final void clearForceRegulationType$odeeoSdk_release() {
        a().clearForceRegulationType();
    }

    public final void forceRegulationType$odeeoSdk_release(ConsentType consentType) {
        io.odeeo.internal.f1.a aVarA = a();
        e0.checkNotNull(consentType);
        aVarA.forceRegulationType(consentType);
    }

    public final String getAdvertiserIdentifier$odeeoSdk_release() {
        String advertiserIdentifier;
        return (!canCollectPersonalInformation$odeeoSdk_release() || (advertiserIdentifier = this.f67231m.getAdvertisingInfo().getAdvertiserIdentifier()) == null) ? "00000000-0000-0000-0000-000000000000" : advertiserIdentifier;
    }

    public final WeakReference<Context> getAppContext$odeeoSdk_release() {
        return this.f67232n;
    }

    public final String getAppKey$odeeoSdk_release() {
        return this.f67224f;
    }

    public final String getAppVersion$odeeoSdk_release() {
        return (String) this.f67226h.getValue();
    }

    public final String getApplicationID$odeeoSdk_release() {
        return (String) this.f67225g.getValue();
    }

    public final Boolean getCcpaConsent$odeeoSdk_release() {
        return a().getCcpaConsent$odeeoSdk_release();
    }

    public final io.odeeo.internal.f1.a getConsentDataManager$odeeoSdk_release() {
        return this.f67229k;
    }

    public final String getCountry$odeeoSdk_release() {
        return this.f67227i;
    }

    public final ConsentType getForceRegulationType$odeeoSdk_release() {
        return a().getForceRegulationType$odeeoSdk_release();
    }

    public final Boolean getGdprConsent$odeeoSdk_release() {
        return a().getGdprConsent$odeeoSdk_release();
    }

    public final String getGdprConsentString$odeeoSdk_release() {
        return a().getGdprConsentString$odeeoSdk_release();
    }

    public final ConsentStringSource getGdprConsentStringSource$odeeoSdk_release() {
        return a().getGdprConsentStrSource$odeeoSdk_release();
    }

    public final String getOdeeoSDKIdentifier$odeeoSdk_release() {
        io.odeeo.internal.m1.a advertisingInfo;
        String odeeoSDKIdentifier;
        d dVar = this.f67231m;
        return (dVar == null || (advertisingInfo = dVar.getAdvertisingInfo()) == null || (odeeoSDKIdentifier = advertisingInfo.getOdeeoSDKIdentifier()) == null) ? "00000000-0000-0000-0000-000000000000" : odeeoSDKIdentifier;
    }

    public final String getPrivacyStr$odeeoSdk_release() {
        return a().getPrivacyString$odeeoSdk_release();
    }

    public final ConsentStringSource getPrivacyStringSource$odeeoSdk_release() {
        return a().getPrivacyStrSource$odeeoSdk_release();
    }

    public final String getPublisherUserID$odeeoSdk_release() {
        return this.f67230l;
    }

    public final ConsentType getRegulationType$odeeoSdk_release() {
        return a().getRegulationType$odeeoSdk_release();
    }

    public final d getSdkIdentifier$odeeoSdk_release() {
        return this.f67231m;
    }

    public final boolean isChildDirected$odeeoSdk_release() {
        return this.f67228j;
    }

    public final boolean isLimitAdTrackingEnabled$odeeoSdk_release() {
        io.odeeo.internal.m1.a advertisingInfo;
        d dVar = this.f67231m;
        return (dVar == null || (advertisingInfo = dVar.getAdvertisingInfo()) == null || !advertisingInfo.isDoNotTrack()) ? false : true;
    }

    public final void setAppContext$odeeoSdk_release(WeakReference<Context> weakReference) {
        this.f67232n = weakReference;
    }

    public final void setAppKey$odeeoSdk_release(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f67224f = str;
    }

    public final void setChildDirected$odeeoSdk_release(boolean z10) {
        this.f67228j = z10;
    }

    public final void setCountry$odeeoSdk_release(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f67227i = str;
    }

    public final void setDoNotSell$odeeoSdk_release(boolean z10, String str) {
        a().setDoNotSell$odeeoSdk_release(z10, str);
    }

    public final void setGdprConsentString$odeeoSdk_release(String str) {
        a().setGdprConsentString$odeeoSdk_release(str);
    }

    public final void setPrivacyStr$odeeoSdk_release(String str) {
        a().setDoNotSell$odeeoSdk_release(str);
    }

    public final void setPublisherUserID$odeeoSdk_release(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f67230l = str;
    }

    public final void setSdkIdentifier$odeeoSdk_release(d dVar) {
        e0.checkNotNullParameter(dVar, "<set-?>");
        this.f67231m = dVar;
    }

    public final String a(Context context) throws PackageManager.NameNotFoundException {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                return packageInfo.versionName + '_' + packageInfo.versionCode;
            }
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            e0.checkNotNullExpressionValue(packageInfo2, "context.packageManager.g…s.of(0)\n                )");
            return packageInfo2.versionName + '_' + packageInfo2.getLongVersionCode();
        } catch (Exception unused) {
            io.odeeo.internal.b2.a.i("Error to get app version info. Returning \"undefined\"", new Object[0]);
            return AdError.UNDEFINED_DOMAIN;
        }
    }

    public final io.odeeo.internal.f1.a a() {
        return this.f67229k;
    }
}
