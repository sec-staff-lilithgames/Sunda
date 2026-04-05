package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar) {
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", bVar.r());
                jSONObject.put("os", 0);
                jSONObject.put("app_version", bVar.o());
                jSONObject.put("api_version", "v3");
                jSONObject.put("aid", bVar.k());
                jSONObject.put("x_tt_logid", aVar.f17099e);
                jSONObject.put("http_status", aVar.f17101g);
                jSONObject.put("err_msg", aVar.f17098d);
                if (TextUtils.isEmpty(aVar.f17099e)) {
                    jSONObject.put("deployments_info", aVar.f17096b);
                    jSONObject.put("local_info", aVar.f17095a);
                    jSONObject.put("custom_info", aVar.f17097c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.VERSION.SDK_INT);
                jSONObject.put("os_version", sb2.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, aVar.f17100f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f17215z && aVar.A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f17190a;
            packageStatisticModel.groupName = aVar.f17191b;
            packageStatisticModel.channel = aVar.f17192c;
            packageStatisticModel.f17188ac = aVar.f17203n;
            packageStatisticModel.f17189id = aVar.f17205p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f17210u);
            packageStatisticModel.downloadUrl = aVar.f17209t;
            packageStatisticModel.downloadFailRecords = b(aVar.f17210u);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f17212w - aVar.f17211v);
            if (aVar.B) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f17190a;
                packageStatisticModel2.groupName = aVar.f17191b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f17189id = aVar.f17205p;
                packageStatisticModel2.channel = aVar.f17192c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f17213x - aVar.f17212w);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f17214y - aVar.f17213x);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f17190a;
            packageStatisticModel3.groupName = aVar.f17191b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f17189id = aVar.f17205p;
            packageStatisticModel3.channel = aVar.f17192c;
            packageStatisticModel3.errMsg = aVar.D;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f17190a;
        packageStatisticModel4.groupName = aVar.f17191b;
        packageStatisticModel4.channel = aVar.f17192c;
        packageStatisticModel4.f17188ac = aVar.f17203n;
        packageStatisticModel4.f17189id = aVar.f17205p;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f17210u);
        packageStatisticModel4.downloadUrl = aVar.f17209t;
        packageStatisticModel4.downloadFailRecords = b(aVar.f17210u);
        if (!aVar.f17215z) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f17210u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f17210u.get(0).reason;
            return;
        }
        if (aVar.A) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.C;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f17193d != null || aVar2.f17195f != 0) {
                if (aVar2.f17197h && aVar2.f17198i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f17191b;
                    packageStatisticModel.accessKey = aVar2.f17190a;
                    packageStatisticModel.channel = aVar2.f17192c;
                    packageStatisticModel.f17188ac = aVar2.f17203n;
                    packageStatisticModel.f17189id = aVar2.f17205p;
                    packageStatisticModel.patchId = aVar2.f17204o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f17194e);
                    packageStatisticModel.downloadUrl = aVar2.f17193d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f17194e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f17196g - aVar2.f17195f);
                    if (!aVar2.f17199j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f17192c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f17207r;
                        packageStatisticModel2.f17188ac = aVar2.f17203n;
                        packageStatisticModel2.patchId = aVar2.f17204o;
                        packageStatisticModel2.f17189id = aVar2.f17205p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f17194e);
                        packageStatisticModel2.downloadUrl = aVar2.f17193d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f17194e);
                    } else if (aVar2.f17200k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f17190a;
                        packageStatisticModel3.groupName = aVar2.f17191b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f17204o;
                        packageStatisticModel3.f17189id = aVar2.f17205p;
                        packageStatisticModel3.channel = aVar2.f17192c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f17201l - aVar2.f17196g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f17202m - aVar2.f17201l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f17190a;
                        packageStatisticModel4.groupName = aVar2.f17191b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f17192c;
                        packageStatisticModel4.patchId = aVar2.f17204o;
                        packageStatisticModel4.f17189id = aVar2.f17205p;
                        packageStatisticModel4.errMsg = aVar2.f17208s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f17190a;
                    packageStatisticModel5.groupName = aVar2.f17191b;
                    packageStatisticModel5.channel = aVar2.f17192c;
                    packageStatisticModel5.f17188ac = aVar2.f17203n;
                    packageStatisticModel5.patchId = aVar2.f17204o;
                    packageStatisticModel5.f17189id = aVar2.f17205p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f17194e);
                    packageStatisticModel5.downloadUrl = aVar2.f17193d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f17194e);
                    if (!aVar2.f17197h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f17194e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f17194e.get(0).reason;
                        }
                    } else if (!aVar2.f17198i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f17206q;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), bVar.l(), bVar.m());
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((StatisticModel.PackageStatisticModel) it.next()).logId = string;
            }
        }
        StatisticModel statisticModel2 = statisticModel;
        if (statisticModel2 == null || statisticModel2.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel2.packages) {
                    Common common2 = statisticModel2.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put(TtmlNode.TAG_REGION, common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    Long l9 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l9 == null ? 0L : l9.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put("os", common2.f17176os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l10 = packageStatisticModel6.f17189id;
                    jSONObject.put("id", l10 == null ? 0L : l10.longValue());
                    jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, common2.f17175ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(DownloadModel.DOWNLOAD_URL, str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj = list2;
                    }
                    jSONObject.put("download_fail_records", obj);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l11 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l11 == null ? 0L : l11.longValue());
                    Long l12 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l12 == null ? 0L : l12.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
        if (bVar.c()) {
            try {
                final String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(statisticModel2);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                final String str2 = DtbConstants.HTTPS + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() throws NetworkErrorException {
                        Response responseDoPost;
                        for (int i10 = 0; i10 < 3; i10++) {
                            try {
                                responseDoPost = bVar.i().doPost(str2, strA);
                            } catch (Exception e10) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e10);
                            }
                            if (responseDoPost.code != 200) {
                                throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                            }
                            if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                return;
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
