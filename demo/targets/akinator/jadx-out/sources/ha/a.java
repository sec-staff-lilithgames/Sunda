package ha;

import android.app.SharedElementCallback;
import android.content.Intent;
import android.view.View;
import com.amazon.aps.ads.util.ApsMraidHandler;
import com.amazon.device.ads.DTBMRAIDCloseButtonListener;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.internal.Util;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.ConfirmationMailActivity;
import com.digidust.elokence.akinator.activities.ContinueProcessActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.MenuActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.ironsource.C3271ic;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import da.j;
import da.p;
import hi.c0;
import hi.s0;
import hp.l;
import hp.m;
import io.bidmachine.media3.common.util.k;
import io.odeeo.internal.a0.a0;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.e.h;
import io.odeeo.internal.e0.c;
import io.odeeo.internal.f.i;
import io.odeeo.internal.q0.o;
import ip.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k3.h1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.tasks.TasksKt;
import lb.b1;
import ld.q0;
import mh.g0;
import mh.j2;
import mh.l2;
import mh.q2;
import mh.r2;
import mk.j0;
import mk.u;
import mt.p0;
import mt.r0;
import nh.x4;
import nj.u0;
import nn.h;
import o9.s;
import st.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements f, ee.d, Continuation, k, i, DTBMRAIDCloseButtonListener, h, o.a, o.b, h1, EventListener.Factory, sd.a, OnCompleteListener, q2, u, q, sj.a, h.a, r0, j, p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58711c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f58710b = i10;
        this.f58711c = obj;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        switch (this.f58710b) {
            case 4:
                m mVar = (m) this.f58711c;
                hp.c cVar = (hp.c) obj;
                l lVar = new l(cVar.f59100b, mVar.f59111b.encode(cVar.f59099a, cVar.f59101c));
                mVar.f59113d.add(lVar);
                long j10 = mVar.f59120k;
                if (j10 == C.TIME_UNSET || cVar.f59100b >= j10) {
                    mVar.a(lVar);
                    break;
                }
                break;
            default:
                ((x4) this.f58711c).add(obj);
                break;
        }
    }

    @Override // sd.a
    public Object apply(Object obj) throws IOException {
        kd.d dVar = (kd.d) this.f58711c;
        kd.b bVar = (kd.b) obj;
        rd.a.i("CctTransportBackend", "Making request to: %s", bVar.f70809a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f70809a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f70821g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(C3271ic.f36944b);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", G5.L);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = bVar.f70811c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ((wi.c) dVar.f70815a).encode(bVar.f70810b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    rd.a.i("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    rd.a.d("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    rd.a.d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new kd.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new kd.c(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            kd.c cVar = new kd.c(responseCode, null, q0.fromJson(new BufferedReader(new InputStreamReader(gZIPInputStream))).getNextRequestWaitMillis());
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e10) {
            e = e10;
            rd.a.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new kd.c(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            rd.a.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new kd.c(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            rd.a.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new kd.c(400, null, 0L);
        } catch (ui.c e13) {
            e = e13;
            rd.a.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new kd.c(400, null, 0L);
        }
    }

    @Override // mk.u
    public Object construct() {
        switch (this.f58710b) {
            case 20:
                Constructor constructor = (Constructor) this.f58711c;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e10) {
                    throw ok.c.createExceptionForUnexpectedIllegalAccess(e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + ok.c.constructorToString(constructor) + "' with no args", e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException("Failed to invoke constructor '" + ok.c.constructorToString(constructor) + "' with no args", e12.getCause());
                }
            default:
                Class cls = (Class) this.f58711c;
                try {
                    return j0.f74774a.newInstance(cls);
                } catch (Exception e13) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e13);
                }
        }
    }

    @Override // com.applovin.shadow.okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f58711c, call);
    }

    @Override // io.odeeo.internal.f.i
    public io.odeeo.internal.f.h get(z zVar) {
        return a0.b.a((io.odeeo.internal.f.h) this.f58711c, zVar);
    }

    @Override // sj.a
    public void handle(sj.c cVar) {
        ((u0) this.f58711c).f77015a = cVar.get();
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f58710b) {
            case 11:
                ((l0.c) obj).onMediaMetadataChanged((io.odeeo.internal.b.a0) this.f58711c);
                break;
            default:
                ((l0.c) obj).onTrackSelectionParametersChanged((io.odeeo.internal.n0.j) this.f58711c);
                break;
        }
    }

    @Override // mh.q2
    public Iterator iterator(r2 r2Var, CharSequence charSequence) {
        switch (this.f58710b) {
            case 18:
                return new j2(r2Var, charSequence, (g0) this.f58711c);
            default:
                return new l2(r2Var, charSequence, ((mh.j0) this.f58711c).matcher(charSequence));
        }
    }

    @Override // da.p
    public void onClose() {
        int i10 = this.f58710b;
        Object obj = this.f58711c;
        switch (i10) {
            case 28:
                int i11 = ContinueProcessActivity.H;
                ((ContinueProcessActivity) obj).t();
                break;
            default:
                int i12 = GameOverSliderActivity.L;
                ((GameOverSliderActivity) obj).t();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        TasksKt.asDeferredImpl$lambda$1((CompletableDeferred) this.f58711c, task);
    }

    @Override // da.j
    public void onOk() {
        ConfirmationMailActivity confirmationMailActivity = (ConfirmationMailActivity) this.f58711c;
        int i10 = ConfirmationMailActivity.G;
        confirmationMailActivity.getClass();
        confirmationMailActivity.startActivity(new Intent(confirmationMailActivity, (Class<?>) MenuActivity.class));
        confirmationMailActivity.finish();
    }

    @Override // ha.f
    public void onSetupAnimation(View view) {
        ((gm.c) this.f58711c).run();
    }

    @Override // k3.h1
    public void onSharedElementsReady() {
        ((SharedElementCallback.OnSharedElementsReadyListener) this.f58711c).onSharedElementsReady();
    }

    @Override // io.odeeo.internal.e.h.a
    public void releaseOutputBuffer(io.odeeo.internal.e.h hVar) {
        ((io.odeeo.internal.e0.c) this.f58711c).a((c.C0607c) hVar);
    }

    @Override // mt.r0
    public void subscribe(p0 it) {
        s sVar = (s) this.f58711c;
        s.a aVar = s.f78491t;
        e0.checkNotNullParameter(it, "it");
        AkActivity akActivity = sVar.f78500l;
        if (akActivity == null) {
            e0.throwUninitializedPropertyAccessException("activityMaster");
            akActivity = null;
        }
        akActivity.displayLoader();
        sa.a listAwardsToVote = sa.c.f85581a.getListAwardsToVote();
        AkActivity akActivity2 = sVar.f78500l;
        if (akActivity2 == null) {
            e0.throwUninitializedPropertyAccessException("activityMaster");
            akActivity2 = null;
        }
        akActivity2.hideLoader();
        pt.c cVar = sVar.f78501m;
        Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.isDisposed()) : null;
        if (boolValueOf == null || boolValueOf.booleanValue()) {
            return;
        }
        if (listAwardsToVote == null) {
            ((du.g) it).onError(new Exception(b1.f72741d.sharedInstance().getTraductionFromToken("PAS_DE_VOTE_DISPONIBLE")));
        } else {
            ((du.g) it).onSuccess(listAwardsToVote);
        }
    }

    @Override // st.q
    public boolean test(Object obj) {
        long campaignStartTimeMillis;
        long campaignEndTimeMillis;
        switch (this.f58710b) {
            case 22:
                nj.h hVar = (nj.h) this.f58711c;
                hVar.getClass();
                long expirationEpochTimestampMillis = ((FetchEligibleCampaignsResponse) obj).getExpirationEpochTimestampMillis();
                long jNow = hVar.f76920c.now();
                File file = new File(hVar.f76919b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
                if (expirationEpochTimestampMillis != 0) {
                    if (jNow < expirationEpochTimestampMillis) {
                    }
                } else if (file.exists()) {
                    if (jNow < TimeUnit.DAYS.toMillis(1L) + file.lastModified()) {
                    }
                }
                break;
            default:
                nj.g0 g0Var = (nj.g0) this.f58711c;
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                if (!g0Var.f76910k.isDeviceInTestMode()) {
                    qj.a aVar = g0Var.f76903d;
                    if (campaignProto$ThickContent.getPayloadCase().equals(qk.h.VANILLA_PAYLOAD)) {
                        campaignStartTimeMillis = campaignProto$ThickContent.getVanillaPayload().getCampaignStartTimeMillis();
                        campaignEndTimeMillis = campaignProto$ThickContent.getVanillaPayload().getCampaignEndTimeMillis();
                    } else if (campaignProto$ThickContent.getPayloadCase().equals(qk.h.EXPERIMENTAL_PAYLOAD)) {
                        campaignStartTimeMillis = campaignProto$ThickContent.getExperimentalPayload().getCampaignStartTimeMillis();
                        campaignEndTimeMillis = campaignProto$ThickContent.getExperimentalPayload().getCampaignEndTimeMillis();
                    }
                    long jNow2 = aVar.now();
                    if (jNow2 <= campaignStartTimeMillis || jNow2 >= campaignEndTimeMillis) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        switch (this.f58710b) {
            case 2:
                ((s0) this.f58711c).getClass();
                if (task.isSuccessful()) {
                    c0 c0Var = (c0) task.getResult();
                    ei.f.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + c0Var.getSessionId());
                    File reportFile = c0Var.getReportFile();
                    if (reportFile.delete()) {
                        ei.f.getLogger().d("Deleted report file: " + reportFile.getPath());
                    } else {
                        ei.f.getLogger().w("Crashlytics could not delete report file: " + reportFile.getPath());
                    }
                    z10 = true;
                } else {
                    ei.f.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 3:
                ((CountDownLatch) this.f58711c).countDown();
                return null;
            case 8:
                ((Runnable) this.f58711c).run();
                return Tasks.forResult(null);
            default:
                return task.isSuccessful() ? ((SuccessContinuation) this.f58711c).then(task.getResult()) : task.getException() != null ? Tasks.forException(task.getException()) : Tasks.forCanceled();
        }
    }

    @Override // ee.d
    public long timeUsToTargetTime(long j10) {
        return ((ee.a0) this.f58711c).getSampleNumber(j10);
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        ApsMraidHandler._init_$lambda$0((ApsMraidHandler) this.f58711c);
    }

    @Override // io.odeeo.internal.q0.o.b
    public void invoke(Object obj, io.odeeo.internal.q0.l lVar) {
        ((l0.c) obj).onEvents((l0) this.f58711c, new l0.d(lVar));
    }

    @Override // nn.h
    public void releaseOutputBuffer(nn.i iVar) {
        ip.d dVar = (ip.d) this.f58711c;
        d.a aVar = (d.a) iVar;
        dVar.getClass();
        aVar.clear();
        dVar.f68344b.add(aVar);
    }
}
