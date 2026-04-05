package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class m {
    public static String a(CampaignEx campaignEx, String str) {
        return str;
    }

    public static void a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, com.mbridge.msdk.click.entity.a aVar, String str, String str2, Context context, o.f fVar, k kVar, Semaphore semaphore) {
        if (!t0.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f39690f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            jumpLoaderResult.setType(2);
            if (TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                try {
                    new o().a(str, str2, context, jumpLoaderResult.getUrl(), fVar);
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("TAG", "webview spider start error");
                    }
                }
            } else {
                new o().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), fVar);
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar != null) {
            jumpLoaderResult.setType(1);
            jumpLoaderResult.setExceptionMsg(aVar.f39692h);
            jumpLoaderResult.setStatusCode(aVar.f39690f);
            jumpLoaderResult.setHeader(aVar.a());
            jumpLoaderResult.setContent(aVar.f39691g);
        }
        String url = jumpLoaderResult.getUrl();
        if (t0.a.b(url)) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(url);
            jumpLoaderResult.setjumpDone(true);
        } else {
            jumpLoaderResult.setCode(2);
            jumpLoaderResult.setUrl(url);
        }
        if (kVar != null) {
            kVar.a(jumpLoaderResult);
        }
    }

    public static boolean a(String str, CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult) {
        if (t0.a.b(jumpLoaderResult.getUrl())) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(str);
            jumpLoaderResult.setjumpDone(true);
            return true;
        }
        jumpLoaderResult.setCode(2);
        jumpLoaderResult.setUrl(str);
        return false;
    }
}
