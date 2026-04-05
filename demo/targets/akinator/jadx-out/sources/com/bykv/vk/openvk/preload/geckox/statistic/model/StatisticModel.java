package com.bykv.vk.openvk.preload.geckox.statistic.model;

import com.bykv.vk.openvk.preload.a.a.b;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class StatisticModel {

    @b(a = "common")
    public Common common;

    @b(a = "packages")
    public List<PackageStatisticModel> packages = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class PackageStatisticModel {

        /* renamed from: ac, reason: collision with root package name */
        @b(a = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)
        public String f17188ac;

        @b(a = "access_key")
        public String accessKey;

        @b(a = "active_check_duration")
        public Long activeCheckDuration;

        @b(a = "apply_duration")
        public Long applyDuration;

        @b(a = "channel")
        public String channel;

        @b(a = "clean_duration")
        public Long cleanDuration;

        @b(a = "clean_strategy")
        public Integer cleanStrategy;

        @b(a = "clean_type")
        public Integer cleanType;

        @b(a = "download_duration")
        public Long downloadDuration;

        @b(a = "download_fail_records")
        public List<DownloadFailRecords> downloadFailRecords;

        @b(a = "download_retry_times")
        public Integer downloadRetryTimes;

        @b(a = DownloadModel.DOWNLOAD_URL)
        public String downloadUrl;

        @b(a = "err_code")
        public String errCode;

        @b(a = "err_msg")
        public String errMsg;

        @b(a = "group_name")
        public String groupName;

        /* renamed from: id, reason: collision with root package name */
        @b(a = "id")
        public Long f17189id;

        @b(a = "log_id")
        public String logId;

        @b(a = "patch_id")
        public Long patchId;

        @b(a = "stats_type")
        public Integer statsType;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class DownloadFailRecords {

            @b(a = C3191e4.i.D)
            public String domain;

            @b(a = "reason")
            public String reason;

            public DownloadFailRecords(String str, String str2) {
                this.domain = str;
                this.reason = str2;
            }
        }
    }
}
