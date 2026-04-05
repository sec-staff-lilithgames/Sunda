package com.mbridge.msdk.interstitial.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f41297b = "com.mbridge.msdk.interstitial.cache.a";

    /* renamed from: c, reason: collision with root package name */
    private static a f41298c;

    /* renamed from: a, reason: collision with root package name */
    private e f41299a;

    private a() {
        try {
            Context contextD = c.m().d();
            if (contextD != null) {
                this.f41299a = e.a(g.a(contextD));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static synchronized a a() {
        try {
            if (f41298c == null) {
                f41298c = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41298c;
    }

    public void b(CampaignEx campaignEx, String str) {
        try {
            if (this.f41299a == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f41299a.a(campaignEx, str, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<CampaignEx> a(String str, int i10) {
        List<CampaignEx> listA;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listA = this.f41299a.a(str, i10, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                Iterator<CampaignEx> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                return arrayList2;
            } catch (Exception e10) {
                e = e10;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.f41299a.e(campaignEx.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(List<CampaignEx> list, String str) {
        if (list == null || list.size() <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<CampaignEx> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), str);
        }
    }

    public void a(String str, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
                return;
            }
            Iterator<CampaignEx> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public synchronized void a(long j10, String str) {
        try {
            if (this.f41299a != null && j10 != 0 && !TextUtils.isEmpty(str)) {
                this.f41299a.a(j10, str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            p0.b(f41297b, e10.getMessage());
        }
    }
}
