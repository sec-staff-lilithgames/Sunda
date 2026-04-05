package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.bykv.vk.openvk.preload.a.a.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class Common {

    /* renamed from: ac, reason: collision with root package name */
    @b(a = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)
    public String f17175ac;

    @b(a = "aid")
    public long aid;

    @b(a = "app_name")
    public String appName;

    @b(a = "app_version")
    public String appVersion;

    @b(a = "device_id")
    public String deviceId;

    @b(a = "device_model")
    public String deviceModel;

    @b(a = "device_platform")
    public String devicePlatform;

    /* renamed from: os, reason: collision with root package name */
    @b(a = "os")
    public int f17176os = 0;

    @b(a = "os_version")
    public String osVersion;

    @b(a = TtmlNode.TAG_REGION)
    public String region;

    @b(a = "sdk_version")
    public String sdkVersion;

    @b(a = "uid")
    public String uid;

    public Common(long j10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j10;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f17175ac = str4;
    }

    public Common(long j10, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j10;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f17175ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
