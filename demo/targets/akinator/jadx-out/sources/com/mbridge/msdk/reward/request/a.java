package com.mbridge.msdk.reward.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a extends c {
    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<Frame> list) {
    }

    public abstract void b(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }

    @Override // com.mbridge.msdk.reward.request.c
    public void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        b(i10, str, cVar);
    }
}
