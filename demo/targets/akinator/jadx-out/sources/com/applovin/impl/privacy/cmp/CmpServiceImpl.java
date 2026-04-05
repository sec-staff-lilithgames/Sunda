package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.k0;
import com.applovin.impl.k7;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.InterfaceC0037a {

    /* renamed from: a, reason: collision with root package name */
    private final k f15060a;

    /* renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f15064e;

    /* renamed from: f, reason: collision with root package name */
    private e f15065f;

    /* renamed from: g, reason: collision with root package name */
    private f f15066g;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15062c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private d f15063d = d.NONE;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f15061b = c();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f15067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f15068b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        public class C0036a implements f {
            public C0036a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f15067a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f15067a = onCompletedListener;
            this.f15068b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f15067a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f15068b, new C0036a());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f15071a;

        public b(Activity activity) {
            this.f15071a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f15061b.b(this.f15071a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f15073a;

        public c(Activity activity) {
            this.f15073a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f15061b.a(this.f15073a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.f15060a = kVar;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (k7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f15060a);
        }
        if (!this.f15060a.y().j()) {
            return null;
        }
        o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.f15061b.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f15061b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0037a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0037a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f15062c) {
            try {
                if (this.f15065f == null) {
                    this.f15063d = d.COMPLETED;
                    this.f15064e = cmpErrorImpl;
                } else {
                    this.f15063d = d.NONE;
                    a(cmpErrorImpl);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0037a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f15062c) {
            try {
                if (this.f15065f == null) {
                    this.f15063d = d.COMPLETED;
                } else {
                    this.f15063d = d.NONE;
                    a((AppLovinCmpError) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0037a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f15066g = fVar;
        if (this.f15061b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f15060a.O();
        if (o.a()) {
            this.f15060a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f15065f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f15065f = null;
        this.f15064e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f15066g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f15066g = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f15061b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z10;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f15062c) {
            if (eVar != null) {
                try {
                    this.f15065f = eVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d dVar = this.f15063d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f15063d = d.LOADING;
                z10 = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f15063d = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f15064e);
                return;
            }
            c cVar = new c(activity);
            if (this.f15061b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k0 a() {
        return new k0(this.f15060a.y().d());
    }
}
