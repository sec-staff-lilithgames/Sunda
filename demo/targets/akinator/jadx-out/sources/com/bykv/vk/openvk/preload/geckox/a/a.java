package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import com.amazon.device.ads.DtbConstants;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {
    public static void a(Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.e.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.b> entry : map.entrySet()) {
                File file2 = new File(file, entry.getKey());
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.f17178a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f17178a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it = list2.iterator();
                    while (it.hasNext()) {
                        String str = it.next().f17177a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            new File(file2, str);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    List list3 = arrayList;
                    if (list3 != null && !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        if (it2.hasNext()) {
                            it2.next();
                            throw null;
                        }
                    }
                } catch (Exception e11) {
                    GeckoLogger.w("clean-channel", "", e11);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = DtbConstants.HTTPS + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(statisticModel));
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
