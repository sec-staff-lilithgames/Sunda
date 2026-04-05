package af;

import android.content.Intent;
import android.os.Bundle;
import android.text.StaticLayout;
import android.util.Log;
import android.view.Display;
import android.view.View;
import androidx.activity.result.ActivityResult;
import ao.y0;
import b1.y;
import bf.o0;
import bf.p0;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsInitializationListener;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBMRAIDCloseButtonListener;
import com.applovin.impl.f5;
import com.applovin.impl.sdk.c;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.s0;
import com.sfbx.appconsentv3.ui.ui.consentable.stack.StackActivity;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity;
import com.sfbx.appconsentv3.ui.ui.introduction.IntroductionActivity;
import com.sfbx.appconsentv3.ui.ui.notice.NoticeActivity;
import com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.services.core.webview.WebView;
import com.vungle.ads.internal.platform.AndroidPlatform;
import ek.z0;
import ff.d;
import fo.e;
import gn.v1;
import io.bidmachine.media3.common.util.m0;
import io.odeeo.internal.r.m;
import io.odeeo.internal.r0.k;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import jn.c0;
import nh.we;
import on.f0;
import qg.e0;
import x3.e3;
import x3.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements com.google.android.exoplayer2.scheduler.b, rf.g, y0, b1.h, o0, yg.k, ApsAsyncUtil.ApsExecutionListener, t.a, c.b, Continuation, OnCompleteListener, i.b, q0, OnSuccessListener, e0, m.g, sj.a, jd.j, c0, k.b.a, ce.i, fo.i, DTBMRAIDCloseButtonListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4328c;

    public /* synthetic */ g(Object obj, int i10) {
        this.f4327b = i10;
        this.f4328c = obj;
    }

    @Override // com.applovin.impl.sdk.c.b
    public void a(c.a aVar) {
        ((com.applovin.impl.sdk.d) this.f4328c).c(aVar);
    }

    @Override // t.a, jd.j
    public Object apply(Object obj) {
        int i10 = this.f4327b;
        Object obj2 = this.f4328c;
        switch (i10) {
            case 7:
                return com.applovin.impl.sdk.ad.b.a((com.applovin.impl.sdk.ad.e) obj2, (f5) obj);
            default:
                ek.y0 y0Var = (ek.y0) obj;
                int i11 = ek.o.f54597b;
                ((ek.o) obj2).getClass();
                String strEncode = ((wi.c) z0.f54684a.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions()).encode(y0Var);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strEncode, "encode(...)");
                Log.d("FirebaseSessions", "Session Event Type: " + y0Var.getEventType().name());
                byte[] bytes = strEncode.getBytes(sv.g.f86134b);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return bytes;
        }
    }

    @Override // qg.e0
    public void configure(StaticLayout.Builder builder) {
        builder.setBreakStrategy(((TextInputLayout) this.f4328c).f29509w.getBreakStrategy());
    }

    @Override // jn.c0
    public void consume(long j10, m0 m0Var) {
        ko.p.consume(j10, m0Var, ((ep.s) this.f4328c).K);
    }

    @Override // fo.i
    public List create(int i10, v1 v1Var, int[] iArr) {
        fo.g gVar = (fo.g) this.f4328c;
        we weVar = fo.e.f55823j;
        return e.b.createForTrackGroup(i10, v1Var, gVar, iArr);
    }

    @Override // bf.o0
    public p0 createProgressiveMediaExtractor(zd.c0 c0Var) {
        return new bf.c((ee.u) this.f4328c);
    }

    @Override // b1.h
    public void dispose() {
        kv.p pVar = (kv.p) this.f4328c;
        synchronized (y.getLock()) {
            y.f8709h = uu.y0.minus(y.f8709h, pVar);
        }
    }

    @Override // io.odeeo.internal.r.m.g
    public int getScore(Object obj) {
        return io.odeeo.internal.r.m.a((io.odeeo.internal.b.t) this.f4328c, (io.odeeo.internal.r.j) obj);
    }

    @Override // sj.a
    public void handle(sj.c cVar) {
        ei.c cVar2 = (ei.c) this.f4328c;
        ei.f.getLogger().d("Crashlytics native component now available.");
        cVar2.f54399b.set((ei.a) cVar.get());
    }

    @Override // i.b
    public void onActivityResult(Object obj) {
        switch (this.f4327b) {
            case 13:
                StackActivity.startForResult$lambda$1((StackActivity) this.f4328c, (ActivityResult) obj);
                break;
            case 14:
                GeolocationActivity.startForResult$lambda$3((GeolocationActivity) this.f4328c, (ActivityResult) obj);
                break;
            case 15:
                IntroductionActivity.startForResult$lambda$1((IntroductionActivity) this.f4328c, (ActivityResult) obj);
                break;
            case 16:
                NoticeActivity.startForResult$lambda$1((NoticeActivity) this.f4328c, (ActivityResult) obj);
                break;
            default:
                RefineByVendorTabFragment.startForResult$lambda$2((RefineByVendorTabFragment) this.f4328c, (ActivityResult) obj);
                break;
        }
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        switch (this.f4327b) {
            case 18:
                return AndroidWebViewContainer.applySafeAreaInsets$lambda$3((AndroidWebViewContainer) this.f4328c, view, e3Var);
            default:
                return WebView.applySafeAreaInsets$lambda$3((WebView) this.f4328c, view, e3Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f4327b) {
            case 10:
                com.google.firebase.messaging.p0.a((Intent) this.f4328c);
                break;
            case 11:
                ((s0) this.f4328c).f29878b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f4328c).cancel(false);
                break;
        }
    }

    @Override // yg.k
    public void onCornerSizeChange(float f10) {
        MaterialButton materialButton = (MaterialButton) this.f4328c;
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.f29059z != i10) {
            materialButton.f29059z = i10;
            materialButton.i();
            materialButton.invalidate();
        }
    }

    @Override // io.odeeo.internal.r0.k.b.a
    public void onDefaultDisplayChanged(Display display) {
        ((io.odeeo.internal.r0.k) this.f4328c).a(display);
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsExecutionListener
    public void onExecutionCompleted(ApsResult apsResult, Object obj) {
        Aps.lambda$initialize$1((ApsInitializationListener) this.f4328c, apsResult, (AdRegistration) obj);
    }

    @Override // rf.g
    public void onProgress(long j10, long j11, long j12) {
        p pVar = ((t) this.f4328c).f4389f;
        if (pVar == null) {
            return;
        }
        ((k) pVar).onProgress(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // com.google.android.exoplayer2.scheduler.b
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i10) {
        h hVar = (h) this.f4328c;
        Requirements requirements = h.f4329q;
        hVar.b(requirementsWatcher, i10);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AndroidPlatform.m3626updateAppSetID$lambda6((AndroidPlatform) this.f4328c, (AppSetIdInfo) obj);
    }

    @Override // ce.i
    public void releaseOutputBuffer(ce.j jVar) {
        ff.d dVar = (ff.d) this.f4328c;
        d.a aVar = (d.a) jVar;
        dVar.getClass();
        aVar.clear();
        dVar.f55699b.add(aVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        ((com.google.firebase.messaging.v) this.f4328c).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        ((ApsInterstitialActivity) this.f4328c).useCustomButtonUpdated();
    }

    @Override // ao.y0
    public ao.z0 createProgressiveMediaExtractor(f0 f0Var) {
        return new ao.d((ko.e0) this.f4328c);
    }
}
