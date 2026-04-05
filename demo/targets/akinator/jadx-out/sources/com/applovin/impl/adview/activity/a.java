package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.c2;
import com.applovin.impl.c6;
import com.applovin.impl.e2;
import com.applovin.impl.m2;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u;
import com.applovin.impl.v1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final k f13498a;

    /* renamed from: b, reason: collision with root package name */
    private final o f13499b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f13500c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f13501d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f13502e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    public class C0026a implements AppLovinAdLoadListener {
        public C0026a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f13500c.get();
            if (appLovinFullscreenActivity != null) {
                o unused = a.this.f13499b;
                if (o.a()) {
                    a.this.f13499b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                v1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f13498a, appLovinFullscreenActivity, new C0027a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            o unused2 = a.this.f13499b;
            if (o.a()) {
                a.this.f13499b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a.this.a("failed_to_receive_ad");
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0027a implements v1.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f13504a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppLovinAd f13505b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f13506c;

            public C0027a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f13504a = appLovinFullscreenActivity;
                this.f13505b = appLovinAd;
                this.f13506c = bVar;
            }

            @Override // com.applovin.impl.v1.g
            public void a(v1 v1Var) {
                this.f13504a.setPresenter(v1Var);
                v1Var.v();
            }

            @Override // com.applovin.impl.v1.g
            public void a(String str, Throwable th2) {
                m2.a((com.applovin.impl.sdk.ad.b) this.f13505b, this.f13506c, str, th2, this.f13504a);
                Map mapA = e2.a((AppLovinAdImpl) this.f13505b);
                CollectionUtils.putStringIfValid(TJzY.XHWr, "processAdResponse", mapA);
                CollectionUtils.putStringIfValid("error_message", str, mapA);
                CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapA);
                a.this.f13498a.g().d(c2.f13735s, mapA);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) throws RemoteException {
            a(null, cVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        public /* synthetic */ b(a aVar, C0026a c0026a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) throws RemoteException {
            Message messageObtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.f13502e.send(messageObtain);
            } catch (RemoteException e10) {
                o unused = a.this.f13499b;
                if (o.a()) {
                    a.this.f13499b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e10);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f13509a;

        public /* synthetic */ c(a aVar, C0026a c0026a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.f13509a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(a aVar) {
            this.f13509a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.f13498a = kVar;
        this.f13499b = kVar.O();
        this.f13500c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        if (this.f13501d.compareAndSet(false, true)) {
            if (o.a()) {
                this.f13499b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f13502e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (o.a()) {
                    this.f13499b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f13502e.send(messageObtain);
            } catch (RemoteException e10) {
                if (o.a()) {
                    this.f13499b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e10);
                }
                a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f13501d.compareAndSet(true, false) && o.a()) {
            this.f13499b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f13500c.get();
        if (appLovinFullscreenActivity != null) {
            if (o.a()) {
                this.f13499b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (o.a()) {
            this.f13499b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, "zone_id", "");
            if (TextUtils.isEmpty(string)) {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
            this.f13498a.r0().a(new c6(jSONObject, u.a(string), true, new C0026a(), this.f13498a));
        } catch (JSONException e10) {
            if (o.a()) {
                this.f13499b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e10);
            }
            a("failed_to_process_ad");
        }
    }
}
