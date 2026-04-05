package com.mbridge.msdk.video.module.listener.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (this.f44847a) {
            try {
                CampaignEx campaignEx = this.f44848b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    a(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i10 != 105 && i10 != 106 && i10 != 113) {
                if (i10 == 122) {
                    g();
                    return;
                }
                switch (i10) {
                    case 109:
                        a(2);
                        b(2);
                        break;
                    case 110:
                        a(1);
                        b(1);
                        break;
                    case 111:
                        b(1);
                        break;
                }
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44848b);
            if (i10 != 105) {
                String noticeUrl = this.f44848b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (noticeUrl.contains(com.mbridge.msdk.foundation.same.a.f40716m)) {
                        noticeUrl = noticeUrl.replace(a.b.o(new StringBuilder(), com.mbridge.msdk.foundation.same.a.f40716m, C3191e4.i.f36525b, Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.f40716m)), com.mbridge.msdk.foundation.same.a.f40716m + "=2");
                    } else {
                        noticeUrl = o2.o(a.b.t(noticeUrl, C3191e4.i.f36527c), com.mbridge.msdk.foundation.same.a.f40716m, "=2");
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44848b, this.f44853g, noticeUrl, true, false, com.mbridge.msdk.click.retry.a.f39794o);
            }
        }
    }
}
