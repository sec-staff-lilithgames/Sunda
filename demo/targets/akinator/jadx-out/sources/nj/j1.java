package nj;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f76946a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f76947b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76948c;

    /* renamed from: d, reason: collision with root package name */
    public int f76949d = 0;

    public j1(i1 i1Var) {
        this.f76946a = i1Var;
        this.f76948c = i1Var.getAndSetBooleanPreference("fresh_install", true);
        this.f76947b = i1Var.getAndSetBooleanPreference("test_device", false);
    }

    public boolean isAppInstallFresh() {
        return this.f76948c;
    }

    public boolean isDeviceInTestMode() {
        return this.f76947b;
    }

    public void processCampaignFetch(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        if (this.f76947b) {
            return;
        }
        boolean z10 = this.f76948c;
        i1 i1Var = this.f76946a;
        if (z10) {
            int i10 = this.f76949d + 1;
            this.f76949d = i10;
            if (i10 >= 5) {
                this.f76948c = false;
                i1Var.setBooleanPreference("fresh_install", false);
            }
        }
        Iterator<CampaignProto$ThickContent> it = fetchEligibleCampaignsResponse.getMessagesList().iterator();
        while (it.hasNext()) {
            if (it.next().getIsTestCampaign()) {
                this.f76947b = true;
                i1Var.setBooleanPreference("test_device", true);
                j0.logi("Setting this device as a test device");
                return;
            }
        }
    }
}
