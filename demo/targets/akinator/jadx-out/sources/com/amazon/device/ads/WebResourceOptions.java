package com.amazon.device.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class WebResourceOptions {
    public static String cdnHost;
    public static String[] jsNames = {"aps-mraid.js", "dtb-m.js", "omsdk-v1.js"};
    public static boolean useLocalOnly;

    public static String getCDNHost(String str) {
        String str2 = cdnHost;
        if (str2 == null) {
            str2 = DtbConstants.DTB_WEB_RESOURCES;
        }
        if ("omsdk-v1.js".equals(str)) {
            str2 = "video-player.aps.amazon-adsystem.com/static/omsdk/" + DtbConstants.INTEGRATED_OM_VERSION;
        }
        return !str2.endsWith("/") ? str2.concat("/") : str2;
    }

    public static String[] getCDNResources() {
        return jsNames;
    }

    public static boolean isLocalSourcesOnly() {
        return useLocalOnly;
    }

    public static void setCDNHost(String str) {
        if (str.equals(cdnHost)) {
            return;
        }
        cdnHost = str;
        DtbSharedPreferences.getInstance().resetWebResoucesLastPing();
        WebResourceService.getInstance().deleteWebDirContent();
    }

    public static void setCDNResources(String[] strArr) {
        jsNames = strArr;
    }

    public static void setLocalSourcesOnly(boolean z10) {
        useLocalOnly = z10;
    }
}
