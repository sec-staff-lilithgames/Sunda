package nj;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final yh.d f76863a;

    /* renamed from: b, reason: collision with root package name */
    public final rt.a f76864b;

    /* renamed from: c, reason: collision with root package name */
    public yh.a f76865c;

    public c(yh.d dVar) {
        this.f76863a = dVar;
        rt.a aVarPublish = mt.l.create(new b(this), mt.b.f74912c).publish();
        this.f76864b = aVarPublish;
        aVarPublish.connect();
    }

    public rt.a getAnalyticsEventsFlowable() {
        return this.f76864b;
    }

    public yh.a getHandle() {
        return this.f76865c;
    }

    public void updateContextualTriggers(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        HashSet hashSet = new HashSet();
        Iterator<CampaignProto$ThickContent> it = fetchEligibleCampaignsResponse.getMessagesList().iterator();
        while (it.hasNext()) {
            for (CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition : it.next().getTriggeringConditionsList()) {
                if (!TextUtils.isEmpty(commonTypesProto$TriggeringCondition.getEvent().getName())) {
                    hashSet.add(commonTypesProto$TriggeringCondition.getEvent().getName());
                }
            }
        }
        if (hashSet.size() > 50) {
            j0.logi("Too many contextual triggers defined - limiting to 50");
        }
        j0.logd("Updating contextual triggers for the following analytics events: " + hashSet);
        this.f76865c.registerEventNames(hashSet);
    }
}
