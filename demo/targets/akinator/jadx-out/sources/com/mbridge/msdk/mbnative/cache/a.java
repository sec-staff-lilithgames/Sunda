package com.mbridge.msdk.mbnative.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a extends b<String, List<Campaign>> {

    /* renamed from: a, reason: collision with root package name */
    private e f41614a = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));

    /* renamed from: b, reason: collision with root package name */
    private int f41615b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbnative.cache.a$a, reason: collision with other inner class name */
    public class RunnableC0290a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41617b;

        public RunnableC0290a(List list, String str) {
            this.f41616a = list;
            this.f41617b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f41616a.size(); i10++) {
                CampaignEx campaignEx = (CampaignEx) this.f41616a.get(i10);
                campaignEx.setCacheLevel(1);
                a.this.f41614a.a(campaignEx, this.f41617b, 1);
            }
        }
    }

    public a(int i10) {
        this.f41615b = i10;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> b(String str, int i10) {
        List<CampaignEx> listA = this.f41614a.a(str, i10, 2, this.f41615b);
        if (listA == null) {
            return null;
        }
        if (a(listA, 2)) {
            this.f41614a.a(str, 2, this.f41615b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        return arrayList;
    }

    public void a(List<CampaignEx> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            campaignEx.setCacheLevel(2);
            this.f41614a.a(campaignEx, str, 1);
        }
    }

    public boolean a(List<CampaignEx> list, int i10) {
        long jA;
        if (list != null && list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long timestamp = list.get(0).getTimestamp();
            if (i10 != 1) {
                jA = i10 != 2 ? 0L : b();
            } else {
                jA = a();
            }
            if (jCurrentTimeMillis - timestamp > jA) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f41614a.a(str, 1, this.f41615b, false);
        this.f41614a.a(str, 2, this.f41615b, false);
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i10);
            campaignEx.setCacheLevel(1);
            this.f41614a.a(campaignEx, str, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list, String str2) {
        boolean z10 = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f41614a.a(str, 1, this.f41615b, z10);
        this.f41614a.a(str, 2, this.f41615b, z10);
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0290a(list, str));
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> a(String str, int i10) {
        List<CampaignEx> listA = this.f41614a.a(str, i10, 1, this.f41615b);
        if (listA == null) {
            return null;
        }
        if (a(listA, 1)) {
            a(listA, str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, Campaign campaign, String str2) {
        boolean z10 = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.f41614a.a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z10)) {
                this.f41614a.a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f41615b, z10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
