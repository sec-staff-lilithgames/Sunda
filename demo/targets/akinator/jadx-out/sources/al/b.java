package al;

import com.amazon.device.ads.DtbDeviceRegistration;
import com.applovin.impl.k7;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.inmobi.media.C2978s;
import com.inmobi.media.C3100z2;
import com.inmobi.media.J5;
import com.inmobi.media.Ne;
import com.inmobi.media.Q2;
import com.inmobi.media.R3;
import com.inmobi.media.Se;
import com.inmobi.media.Wb;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.C3568ze;
import com.vungle.ads.AnalyticsClient;
import io.bidmachine.SessionManager;
import z9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4439b;

    public /* synthetic */ b(int i10) {
        this.f4439b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4439b) {
            case 0:
                InMobiSdk.b();
                break;
            case 1:
                InMobiUnifiedIdService.a();
                break;
            case 2:
                DtbDeviceRegistration.lambda$verifyRegistration$0();
                break;
            case 3:
                k7.c();
                break;
            case 4:
                C3568ze.f();
                break;
            case 5:
                AnalyticsClient.m3533initOrUpdate$lambda1$lambda0();
                break;
            case 6:
                break;
            case 7:
                try {
                    SessionManager.get().resume();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 8:
                try {
                    SessionManager.get().pause();
                    break;
                } catch (Throwable unused2) {
                    return;
                }
            case 9:
                new qa.a().configureAndCall();
                break;
            case 10:
                new ha.c();
                break;
            case 11:
                e.getInstance().requestAllPurchases(null);
                break;
            case 12:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f27008a;
                break;
            case 13:
                J5.c();
                break;
            case 14:
                Ne.b();
                break;
            case 15:
                Q2.a();
                break;
            case 16:
                R3.c0();
                break;
            case 17:
                R3.e0();
                break;
            case 18:
                R3.Y();
                break;
            case 19:
                R3.d();
                break;
            case 20:
                R3.a0();
                break;
            case 21:
                Se.f();
                break;
            case 22:
                Wb.c();
                break;
            case 23:
                Wb.a();
                break;
            case 24:
                C2978s.e();
                break;
            case 25:
                C2978s.d();
                break;
            default:
                C3100z2.a();
                break;
        }
    }

    private final void a() {
    }
}
