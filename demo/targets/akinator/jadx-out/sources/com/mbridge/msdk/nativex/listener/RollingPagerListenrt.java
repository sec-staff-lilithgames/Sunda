package com.mbridge.msdk.nativex.listener;

import android.content.Context;
import androidx.viewpager.widget.i;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class RollingPagerListenrt implements i {
    private NativeListener.FilpListener FilpListening;
    private List<Frame> frames;
    private List<Integer> list = new ArrayList();
    private h reportController;
    private String unit_id;

    @Override // androidx.viewpager.widget.i
    public void onPageSelected(int i10) {
        reportRollBC(i10);
    }

    public void reportRollBC(int i10) {
        try {
            NativeListener.FilpListener filpListener = this.FilpListening;
            if (filpListener != null) {
                filpListener.filpEvent(i10);
            }
            if (this.list.contains(Integer.valueOf(i10))) {
                return;
            }
            this.list.add(Integer.valueOf(i10));
            Frame frame = this.frames.get(i10);
            List<CampaignEx> campaigns = frame.getCampaigns();
            if (campaigns == null || campaigns.isEmpty()) {
                return;
            }
            CampaignEx campaignEx = campaigns.get(0);
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < campaigns.size(); i11++) {
                campaignEx = campaigns.get(i11);
                if (i11 == campaigns.size() - 1) {
                    sb2.append(campaignEx.getId());
                } else {
                    sb2.append(campaignEx.getId() + ",");
                }
            }
            HashMap map = new HashMap();
            map.put("rid", campaignEx.getRequestId());
            map.put("rid_n", campaignEx.getRequestIdNotice());
            map.put("frame_id", (i10 + 1) + "");
            map.put("template", Integer.valueOf(frame.getTemplate()));
            map.put("cids", sb2.toString());
            map.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unit_id);
            d.b().a(j.a("2000005", map));
        } catch (Throwable th2) {
            p0.b("RollingPagerListener", th2.getMessage());
        }
    }

    public void setCampList(List<Frame> list, Context context, String str) {
        this.frames = list;
        this.reportController = new h(context, 2);
        this.unit_id = str;
        this.list.clear();
        reportRollBC(0);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        this.FilpListening = filpListener;
    }

    @Override // androidx.viewpager.widget.i
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.i
    public void onPageScrolled(int i10, float f10, int i11) {
    }
}
