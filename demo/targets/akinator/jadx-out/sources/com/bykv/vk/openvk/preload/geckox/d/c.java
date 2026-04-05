package com.bykv.vk.openvk.preload.geckox.d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import b0.e2;
import com.amazon.device.ads.DtbConstants;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import java.io.File;
import java.io.FileFilter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: d, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f17133d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Map<String, Object>> f17134e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f17135f;

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.e.a f17136g;

    /* renamed from: h, reason: collision with root package name */
    private String f17137h;

    /* renamed from: i, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a.a f17138i = new com.bykv.vk.openvk.preload.geckox.buffer.a.a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends RuntimeException {
        public b(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.d.c$c, reason: collision with other inner class name */
    public static class C0057c extends RuntimeException {
        public C0057c(String str, Throwable th2) {
            super(str, th2);
        }
    }

    private static void b(List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> list) {
        if (list == null) {
            return;
        }
        Iterator<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> it = list.iterator();
        while (it.hasNext()) {
            try {
                ((com.bykv.vk.openvk.preload.geckox.g.a) it.next().second).a();
            } catch (Exception e10) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", e10);
            }
        }
    }

    private List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.f17133d.n(), updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                }
                com.bykv.vk.openvk.preload.geckox.g.a aVarA = com.bykv.vk.openvk.preload.geckox.g.a.a(file.getAbsolutePath() + File.separator + "update.lock");
                if (aVarA != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), aVarA));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.e.a aVar = this.f17136g;
                    updatePackage.getChannel();
                }
            } catch (Exception e10) {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", e10);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.e.a aVar2 = this.f17136g;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f17133d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f17134e = (Map) objArr[1];
        this.f17135f = (Map) objArr[2];
        this.f17136g = (com.bykv.vk.openvk.preload.geckox.e.a) objArr[3];
        this.f17137h = (String) objArr[4];
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context contextA = this.f17133d.a();
        checkRequestBodyModel.setCommon(new Common(this.f17133d.k(), this.f17133d.o(), this.f17133d.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), com.bykv.vk.openvk.preload.geckox.utils.e.a(contextA), this.f17133d.l(), this.f17133d.m()));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                map3.put(pair.first, localChannel);
            }
            map2.put(entry.getKey(), map3);
        }
        try {
            com.bykv.vk.openvk.preload.a.d dVarB = com.bykv.vk.openvk.preload.geckox.c.b.a().b();
            this.f17138i.f17095a = dVarB.a(map2);
            checkRequestBodyModel.setLocal(map2);
            HashMap map4 = new HashMap();
            for (String str : this.f17133d.e()) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.f17137h;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map5 = this.f17135f;
                if (map5 != null && !map5.isEmpty() && (list = this.f17135f.get(str)) != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    group.targetChannels = arrayList;
                    arrayList.addAll(list);
                }
                map4.put(str, group);
            }
            this.f17138i.f17096b = dVarB.a(map4);
            checkRequestBodyModel.setDeployments(map4);
            Map<String, Map<String, Object>> map6 = this.f17134e;
            if (map6 != null) {
                this.f17138i.f17097c = dVarB.a(map6);
                checkRequestBodyModel.setCustom(this.f17134e);
            }
            return dVarB.a(checkRequestBodyModel);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Exception {
        List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> listC;
        GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> mapA = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f17133d, this.f17138i);
        Iterator<Map.Entry<String, List<UpdatePackage>>> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    GeckoLogger.d("gecko-debug-tag", next.getChannel(), "rollback：", Long.valueOf(localVersion), "->", Long.valueOf(version));
                    File[] fileArrListFiles = new File(this.f17133d.n(), next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        for (File file : fileArrListFiles) {
                            try {
                                long j10 = Long.parseLong(file.getName());
                                if (j10 > version) {
                                    final File file2 = new File(file.getParent(), file.getName() + "--pending-delete");
                                    file.renameTo(file2);
                                    com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bykv.vk.openvk.preload.geckox.utils.b.a(file2);
                                        }
                                    });
                                } else if (j10 == version) {
                                    it2.remove();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<UpdatePackage>>> it3 = mapA.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        Object objA = null;
        try {
            listC = c(arrayList);
            try {
                objA = bVar.a((com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>>) arrayList);
                b(listC);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
            } catch (Throwable th2) {
                th = th2;
                try {
                    GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                    a(arrayList);
                    return objA;
                } finally {
                    b(listC);
                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            listC = null;
        }
        a(arrayList);
        return objA;
    }

    private void a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.f17133d.n(), updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<String, List<UpdatePackage>> a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        String strB = b(map);
        String str = DtbConstants.HTTPS + this.f17133d.j() + "/gecko/server/v3/package";
        try {
            this.f17138i.f17100f = com.bykv.vk.openvk.preload.geckox.utils.e.a(this.f17133d.a());
            Response responseDoPost = this.f17133d.i().doPost(str, strB);
            com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar = this.f17138i;
            aVar.f17101g = responseDoPost.code;
            aVar.f17098d = responseDoPost.msg;
            Map<String, String> map2 = responseDoPost.headers;
            String str2 = "";
            if (map2 != null && !map2.isEmpty()) {
                String str3 = map2.get("x-tt-logid");
                if (TextUtils.isEmpty(str3)) {
                    str3 = map2.get("X-Tt-Logid");
                    if (TextUtils.isEmpty(str3)) {
                        String str4 = map2.get("X-TT-LOGID");
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str4;
                        }
                    } else {
                        str2 = str3;
                    }
                } else {
                    str2 = str3;
                }
            }
            aVar.f17099e = str2;
            if (responseDoPost.code == 200) {
                String str5 = responseDoPost.body;
                GeckoLogger.d("gecko-debug-tag", "response:", str5);
                try {
                    com.bykv.vk.openvk.preload.geckox.model.Response response = (com.bykv.vk.openvk.preload.geckox.model.Response) (str5 == null ? null : com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(new StringReader(str5), new com.bykv.vk.openvk.preload.a.c.a<com.bykv.vk.openvk.preload.geckox.model.Response<ComponentModel>>() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.3
                    }.b()));
                    int i10 = response.status;
                    if (i10 != 0) {
                        if (i10 == 2000) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.f17133d);
                            return new HashMap();
                        }
                        String str6 = "check update error，unknow status code，response.status：" + response.status;
                        com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar2 = this.f17138i;
                        aVar2.f17098d = str6;
                        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f17133d, aVar2);
                        throw new a(str6);
                    }
                    if (response.data != 0) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f17133d.a(), ((ComponentModel) response.data).getUniversalStrategies(), this.f17133d.n(), this.f17136g);
                        Map<String, List<UpdatePackage>> packages = ((ComponentModel) response.data).getPackages();
                        if (packages != null && !packages.isEmpty()) {
                            for (String str7 : this.f17133d.e()) {
                                List<UpdatePackage> list = packages.get(str7);
                                if (list != null && !list.isEmpty()) {
                                    for (UpdatePackage updatePackage : list) {
                                        updatePackage.setAccessKey(str7);
                                        updatePackage.setLocalVersion(a(map.get(str7), updatePackage.getChannel()));
                                    }
                                }
                            }
                            return packages;
                        }
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f17133d);
                        return new HashMap();
                    }
                    com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar3 = this.f17138i;
                    aVar3.f17098d = "check update error：response.data==null";
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f17133d, aVar3);
                    throw new a("check update error：response.data==null");
                } catch (Throwable th2) {
                    this.f17138i.f17098d = e2.o(th2, new StringBuilder("json parse failed："));
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f17133d, this.f17138i);
                    throw new b(e2.o(th2, e3.g.o("json parse failed：", str5, " caused by:")), th2);
                }
            }
            throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
        } catch (Exception e10) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f17133d, this.f17138i);
            throw new C0057c(e2.l(e10, e3.g.o("request failed：url:", str, ", caused by:")), e10);
        }
    }

    private static long a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0L;
    }
}
