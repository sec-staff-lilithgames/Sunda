package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.mraid.b;
import com.mbridge.msdk.video.signal.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class MBridgeH5EndCardViewDiff extends MBridgeBaseView implements h, b, j {
    public String unitId;

    public MBridgeH5EndCardViewDiff(Context context) {
        super(context);
    }

    public abstract /* synthetic */ void close();

    public abstract /* synthetic */ void expand(String str, boolean z10);

    public abstract /* synthetic */ CampaignEx getMraidCampaign();

    public abstract /* synthetic */ void handlerPlayableException(String str);

    public abstract /* synthetic */ void install(CampaignEx campaignEx);

    public abstract /* synthetic */ void notifyCloseBtn(int i10);

    public void open(String str) {
        try {
            String clickURL = this.f44612b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f44612b.setClickURL(str);
                reportOpen(str);
            }
            this.f44612b.setClickTempSource(2);
            this.f44612b.setClickType(2);
            this.f44612b.setTriggerClickSource(2);
            a aVar = new a(getContext(), this.unitId);
            aVar.a(this);
            aVar.a(this.f44612b);
            this.f44612b.setClickURL(clickURL);
            this.notifyListener.a(126, "");
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public abstract /* synthetic */ void orientation(Configuration configuration);

    public abstract /* synthetic */ void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar);

    public abstract /* synthetic */ void readyStatus(int i10);

    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f44612b.isBidCampaign());
        }
    }

    public abstract /* synthetic */ void toggleCloseBtn(int i10);

    public abstract /* synthetic */ void unload();

    public abstract /* synthetic */ void useCustomClose(boolean z10);

    public abstract /* synthetic */ void webviewshow();

    public MBridgeH5EndCardViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
