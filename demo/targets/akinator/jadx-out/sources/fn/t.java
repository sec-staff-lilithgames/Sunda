package fn;

import android.content.Context;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.iab.omid.library.appodeal.adsession.Partner;
import io.bidmachine.BuildConfig;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.protobuf.sdk.SDK;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f55771a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f55772b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static Partner f55773c;

    public static void fill(SDK.Builder builder) {
        builder.setOmidpn("Appodeal");
        builder.setOmidpv(BuildConfig.OMSDK_VERSION_NAME);
    }

    public static void fillExtension(Struct.Builder builder) {
        builder.putFields(ProtoExtConstants.Source.OMID_PN, Value.newBuilder().setStringValue("Appodeal").build());
        builder.putFields(ProtoExtConstants.Source.OMID_PV, Value.newBuilder().setStringValue(BuildConfig.OMSDK_VERSION_NAME).build());
    }

    public static Partner getPartner() {
        return f55773c;
    }

    public static void initialize(Context context) {
        if (f55771a.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            if (ExtraParamsManager.get().getInternalDataRetriever(applicationContext).getBoolean("omsdk_disabled", false)) {
                return;
            }
            nm.j.onUiThread(new s(applicationContext));
        }
    }

    public static boolean isInitialized() {
        return f55772b.get();
    }
}
