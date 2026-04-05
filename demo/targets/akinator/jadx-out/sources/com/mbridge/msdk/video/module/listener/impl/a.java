package com.mbridge.msdk.video.module.listener.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private Activity f44834a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f44835b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f44834a = activity;
        this.f44835b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (i10 != 106 || this.f44834a == null || this.f44835b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String strA = com.mbridge.msdk.click.c.a(this.f44835b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(strA)) {
                intent.setData(Uri.parse(strA));
                this.f44834a.startActivity(intent);
            }
        } catch (Throwable th2) {
            p0.b("NotifyListener", th2.getMessage(), th2);
        }
        this.f44834a.finish();
    }
}
