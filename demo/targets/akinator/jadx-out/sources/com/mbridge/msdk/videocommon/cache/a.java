package com.mbridge.msdk.videocommon.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.videocommon.setting.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f45255b = "com.mbridge.msdk.videocommon.cache.a";

    /* renamed from: c, reason: collision with root package name */
    private static a f45256c;

    /* renamed from: a, reason: collision with root package name */
    private e f45257a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.videocommon.cache.a$a, reason: collision with other inner class name */
    public class RunnableC0356a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45258a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f45259b;

        public RunnableC0356a(String str, CampaignEx campaignEx) {
            this.f45258a = str;
            this.f45259b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f45258a, this.f45259b);
        }
    }

    private a() {
        try {
            Context contextD = c.m().d();
            if (contextD != null) {
                this.f45257a = e.a(g.a(contextD));
            } else {
                p0.b(f45255b, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static a a() {
        if (f45256c == null) {
            synchronized (a.class) {
                try {
                    if (f45256c == null) {
                        f45256c = new a();
                    }
                } finally {
                }
            }
        }
        return f45256c;
    }

    public void b(String str, String str2) {
        if (this.f45257a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f45257a.a(str, str2);
    }

    public CopyOnWriteArrayList<CampaignEx> c(String str, int i10) {
        List<CampaignEx> listA;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listA = this.f45257a.a(str, 0, 0, i10)) == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : listA) {
                    if (campaignEx != null) {
                        copyOnWriteArrayList2.add(campaignEx);
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e10) {
                e = e10;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public synchronized void d(String str, String str2) {
        try {
            this.f45257a.f(str2, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<CampaignEx> b(String str, int i10, boolean z10) {
        return b(str, i10, z10, "");
    }

    public CopyOnWriteArrayList<CampaignEx> b(String str, int i10, boolean z10, String str2) {
        Exception exc;
        List<CampaignEx> listA;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (!TextUtils.isEmpty(str)) {
                if (z10) {
                    listA = this.f45257a.a(str, 0, 0, i10, str2);
                } else {
                    listA = this.f45257a.a(str, 0, 0, i10, false);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (listA != null) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    try {
                        for (CampaignEx campaignEx : listA) {
                            if (campaignEx != null && (campaignEx.getReadyState() == 0 || campaignEx.getLoadTimeoutState() == 1)) {
                                long plct = campaignEx.getPlct() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jE >= timestamp)) {
                                    copyOnWriteArrayList2.add(campaignEx);
                                }
                            }
                        }
                        return copyOnWriteArrayList2;
                    } catch (Exception e10) {
                        exc = e10;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        exc.printStackTrace();
                        return copyOnWriteArrayList;
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            exc = e11;
        }
    }

    public void a(String str, List<CampaignEx> list, String str2, int i10) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || TextUtils.isEmpty(str2) || (eVar = this.f45257a) == null) {
            return;
        }
        eVar.a(str, list, str2, i10);
    }

    public List<CampaignEx> c(String str, int i10, boolean z10) {
        return c(str, i10, z10, "");
    }

    public List<CampaignEx> c(String str, int i10, boolean z10, String str2) {
        long jA0;
        List<CampaignEx> listA;
        ArrayList arrayList = null;
        try {
            com.mbridge.msdk.setting.g gVarD = h.b().d(c.m().b());
            if (gVarD != null) {
                jA0 = gVarD.a0();
            } else {
                jA0 = h.b().a().a0();
            }
            long j10 = jA0 * 1000;
            if (!TextUtils.isEmpty(str)) {
                if (z10) {
                    listA = this.f45257a.a(str, 0, 0, i10, str2);
                } else {
                    listA = this.f45257a.a(str, 0, 0, i10, false);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (listA != null) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (CampaignEx campaignEx : listA) {
                            if (campaignEx != null && campaignEx.getReadyState() == 0) {
                                long plctb = campaignEx.getPlctb() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plctb <= 0 && j10 >= timestamp) || (plctb > 0 && plctb >= timestamp)) {
                                    arrayList2.add(campaignEx);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e10) {
                        e = e10;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void a(String str, List<CampaignEx> list) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f45257a) == null) {
            return;
        }
        eVar.b(str, list);
    }

    public void a(String str, List<CampaignEx> list, String str2) {
        e eVar;
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f45257a) == null) {
                return;
            }
            eVar.a(str, list, str2);
        } catch (Exception e10) {
            p0.b(f45255b, e10.getMessage());
        }
    }

    public List<CampaignEx> a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list != null) {
            try {
                com.mbridge.msdk.videocommon.setting.a aVarC = b.b().c();
                long jE = aVarC != null ? aVarC.e() : 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (list.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (CampaignEx campaignEx : list) {
                            if (campaignEx != null) {
                                long plct = campaignEx.getPlct() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jE >= timestamp)) {
                                    arrayList2.add(campaignEx);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e10) {
                        e = e10;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return arrayList;
    }

    public void b(String str, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0356a(str, campaignEx));
    }

    public void b(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMapF;
        try {
            if (TextUtils.isEmpty(str) || (concurrentHashMapF = this.f45257a.f(str)) == null || concurrentHashMapF.size() <= 0) {
                return;
            }
            com.mbridge.msdk.setting.g gVarD = h.b().d(c.m().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            long jA0 = gVarD != null ? gVarD.a0() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (com.mbridge.msdk.foundation.entity.c cVar : concurrentHashMapF.values()) {
                if (cVar != null) {
                    long jE = cVar.e();
                    if (jE <= 0) {
                        jE = jA0;
                    }
                    if ((jE * 1000) + cVar.f() < jCurrentTimeMillis && !TextUtils.isEmpty(cVar.a())) {
                        p0.b("HBOPTIMIZE", "不在有效期范围内 删除" + cVar.a());
                        d(str, cVar.a());
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<com.mbridge.msdk.foundation.entity.c> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f45257a.d(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void c(String str, String str2) {
        e eVar = this.f45257a;
        if (eVar != null) {
            eVar.c(str, str2);
        }
    }

    public int a(String str, int i10, boolean z10, String str2) {
        List<CampaignEx> listA;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z10) {
                listA = this.f45257a.a(str, 0, 0, i10, str2);
            } else {
                listA = this.f45257a.a(str, 0, 0, i10, false);
            }
            if (listA == null) {
                return 0;
            }
            for (CampaignEx campaignEx : listA) {
                if (campaignEx != null && campaignEx.getReadyState() == 0) {
                    arrayList.add(campaignEx);
                }
            }
            return arrayList.size();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public synchronized void b(String str, int i10) {
        int iF;
        try {
            try {
                com.mbridge.msdk.setting.g gVarD = h.b().d(c.m().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                iF = gVarD.f();
            } catch (Exception e10) {
                p0.b(f45255b, e10.getMessage());
            }
            if (iF == 0) {
                return;
            }
            List<CampaignEx> listB = this.f45257a.b(str, i10, iF == 2);
            if (listB != null && listB.size() > 0) {
                for (CampaignEx campaignEx : listB) {
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    String id2 = campaignEx.getId();
                    com.mbridge.msdk.videocommon.a.e(campaignEx.getCampaignUnitId() + "_" + id2 + "_" + requestIdNotice + "_" + campaignEx.getCMPTEntryUrl());
                }
            }
            this.f45257a.a(str, i10, iF == 2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public List<CampaignEx> a(String str, int i10, boolean z10) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f45257a.a(str, 0, 0, i10, z10);
        } catch (Exception e10) {
            p0.b(f45255b, e10.getLocalizedMessage());
            return null;
        }
    }

    public void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    com.mbridge.msdk.foundation.same.buffer.b.c(str, campaignEx.getRequestId());
                }
                String localRequestId = campaignEx.getLocalRequestId();
                if (!TextUtils.isEmpty(localRequestId)) {
                    boolean z10 = true;
                    if (campaignEx.getSecondRequestIndex() != 1 && !localRequestId.contains("label_second")) {
                        z10 = false;
                    }
                    if (localRequestId.contains("label_second")) {
                        localRequestId = localRequestId.replace("label_second", "");
                    }
                    if (z10) {
                        this.f45257a.a(str, localRequestId, localRequestId + "label_second");
                        return;
                    }
                    this.f45257a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                this.f45257a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String localRequestId = campaignEx.getLocalRequestId();
                if (!TextUtils.isEmpty(localRequestId)) {
                    boolean z10 = true;
                    if (campaignEx.getSecondRequestIndex() != 1 && !localRequestId.contains("label_second")) {
                        z10 = false;
                    }
                    if (localRequestId.contains("label_second")) {
                        localRequestId = localRequestId.replace("label_second", "");
                    }
                    if (z10) {
                        this.f45257a.a(str, localRequestId, localRequestId + "label_second");
                        return;
                    }
                    this.f45257a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                this.f45257a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getId())) {
                    return;
                }
                this.f45257a.d(campaignEx.getId(), campaignEx.getRequestId());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            List<com.mbridge.msdk.foundation.entity.c> listD = this.f45257a.d(str);
            if (str2.contains("label_second")) {
                String strReplace = str2.replace("label_second", "");
                if (listD == null || listD.isEmpty() || TextUtils.isEmpty(strReplace)) {
                    return;
                }
                for (com.mbridge.msdk.foundation.entity.c cVar : listD) {
                    if (strReplace.equals(cVar.d())) {
                        d(str, cVar.a());
                        com.mbridge.msdk.foundation.same.buffer.b.c(str, cVar.a());
                        return;
                    }
                }
                return;
            }
            String strConcat = str2.concat("label_second");
            if (listD == null || listD.isEmpty() || TextUtils.isEmpty(strConcat)) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.entity.c> it = listD.iterator();
            while (it.hasNext()) {
                if (strConcat.equals(it.next().d())) {
                    for (com.mbridge.msdk.foundation.entity.c cVar2 : listD) {
                        if (str2.equals(cVar2.d())) {
                            d(str, cVar2.a());
                            com.mbridge.msdk.foundation.same.buffer.b.c(str, cVar2.a());
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (Exception e10) {
            p0.b("videoCache", e10.getMessage());
        }
    }

    public void a(String str, int i10) {
        int size;
        try {
            List<com.mbridge.msdk.foundation.entity.c> listD = this.f45257a.d(str);
            if (listD == null || listD.size() <= 0 || (size = listD.size() - i10) <= 0) {
                return;
            }
            for (int i11 = 0; i11 < size; i11++) {
                d(str, listD.get(i11).a());
                com.mbridge.msdk.foundation.same.buffer.b.c(str, listD.get(i11).a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str, String str2, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str2) || list == null || list.size() <= 0) {
                return;
            }
            this.f45257a.a(list, str, str2, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public synchronized void a(long j10, String str) {
        try {
            this.f45257a.b(j10, str);
        } catch (Exception e10) {
            e10.printStackTrace();
            p0.b(f45255b, e10.getMessage());
        }
    }
}
