package com.bykv.vk.openvk.preload.falconx.statistic;

import android.os.Build;
import com.bykv.vk.openvk.preload.a.a.b;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class Common {

    @b(a = "app_version")
    public String appVersion;

    @b(a = "device_id")
    public String deviceId;

    @b(a = TtmlNode.TAG_REGION)
    public String region;

    @b(a = "sdk_version")
    public String sdkVersion = "2.0.3-rc.9-pangle";

    @b(a = "device_model")
    public String deviceModel = Build.MODEL;

    /* renamed from: os, reason: collision with root package name */
    @b(a = "os")
    public int f17033os = 0;
}
