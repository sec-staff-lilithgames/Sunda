package al;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4440b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4441c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4444g;

    public /* synthetic */ c(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10) {
        this.f4443f = context;
        this.f4442e = str;
        this.f4444g = sdkInitializationListener;
        this.f4441c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f4440b) {
            case 0:
                InMobiSdk.a((Context) this.f4443f, this.f4442e, (SdkInitializationListener) this.f4444g, this.f4441c);
                break;
            default:
                AnalyticsClient.m3535logMetric$lambda6((Sdk.SDKMetric.SDKMetricType) this.f4443f, this.f4441c, (LogEntry) this.f4444g, this.f4442e);
                break;
        }
    }

    public /* synthetic */ c(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j10, LogEntry logEntry, String str) {
        this.f4443f = sDKMetricType;
        this.f4441c = j10;
        this.f4444g = logEntry;
        this.f4442e = str;
    }
}
