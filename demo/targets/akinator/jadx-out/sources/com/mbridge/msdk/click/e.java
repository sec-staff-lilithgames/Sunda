package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class e extends f {

    /* renamed from: e, reason: collision with root package name */
    private int f39679e;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f39682h;

    /* renamed from: i, reason: collision with root package name */
    private p f39683i;

    /* renamed from: b, reason: collision with root package name */
    JumpLoaderResult f39676b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f39677c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f39678d = null;

    /* renamed from: f, reason: collision with root package name */
    private g f39680f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39681g = true;

    /* renamed from: j, reason: collision with root package name */
    private Handler f39684j = new Handler(Looper.getMainLooper());

    public e(Context context) {
        this.f39682h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f39683i = new p(context);
    }

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id2;
        this.f39678d = str2;
        this.f39680f = gVar;
        this.f39676b = null;
        this.f39679e = i10;
        if (campaignEx != null) {
            z = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id2 = campaignEx.getId();
        } else {
            id2 = "";
        }
        this.f39683i.a(str2, gVar, z, id2, str, campaignEx, z10, z11, i10);
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f39678d = new String(campaignEx.getClickURL());
        this.f39680f = gVar;
        this.f39676b = null;
        this.f39683i.a(campaignEx.getClickURL(), gVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f39795p);
    }

    public void a() {
        this.f39681g = false;
    }
}
