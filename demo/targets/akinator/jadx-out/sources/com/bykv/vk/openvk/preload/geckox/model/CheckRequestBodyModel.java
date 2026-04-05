package com.bykv.vk.openvk.preload.geckox.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.bykv.vk.openvk.preload.a.a.b;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CheckRequestBodyModel {

    @b(a = "common")
    private Common common;

    @b(a = ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM)
    private Map<String, Map<String, Object>> custom;

    @b(a = "deployment")
    private Map<String, List<ChannelInfo>> deployment;

    @b(a = "deployments")
    private Map<String, Object> deployments;

    @b(a = "local")
    private Map<String, Map<String, LocalChannel>> local;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Channel {

        @b(a = ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)
        String channelName;

        @b(a = "l_v")
        public String localVersion;

        public Channel(String str) {
            this.channelName = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ChannelInfo {

        @b(a = "channel")
        private String channel;

        @b(a = "local_version")
        private long localVersion;

        public ChannelInfo(String str, long j10) {
            this.channel = str;
            this.localVersion = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Channels {

        @b(a = "channels")
        public List<Channel> channels = new ArrayList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Group {

        @b(a = "group_name")
        public String groupName;

        @b(a = "target_channels")
        public List<TargetChannel> targetChannels;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum GroupType {
        NORMAL("normal"),
        HIGHPRIORITY("high_priority");

        private String value;

        GroupType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class LocalChannel {

        @b(a = "l_v")
        public Long localVersion;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ProcessorParams {

        @b(a = C3191e4.i.D)
        public String domain;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class TargetChannel {

        @b(a = ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)
        public String channelName;

        @b(a = "t_v")
        public Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l9) {
            this.channelName = str;
            this.targetVersion = l9;
        }
    }

    public void putChannelInfo(String str, List<ChannelInfo> list) {
        if (this.deployment == null) {
            this.deployment = new HashMap();
        }
        this.deployment.put(str, list);
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }
}
