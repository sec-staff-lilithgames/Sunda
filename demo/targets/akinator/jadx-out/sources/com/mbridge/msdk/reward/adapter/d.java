package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f42432a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f42433b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42434c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f42435d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f42436e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f42437f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f42438g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f42439h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f42432a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f42432a;
    }

    public int c() {
        return this.f42438g;
    }

    public int d() {
        return this.f42437f;
    }

    public boolean e() {
        return this.f42434c;
    }

    public void a(boolean z10) {
        this.f42434c = z10;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f42433b = campaignEx;
            this.f42435d = campaignEx.getSecondRequestIndex();
            this.f42436e = campaignEx.getSecondShowIndex();
            this.f42437f = campaignEx.getFilterCallBackState();
            this.f42439h = campaignEx.getFilterAdsShowCallState();
            this.f42438g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f42435d == 1 && this.f42434c;
    }
}
