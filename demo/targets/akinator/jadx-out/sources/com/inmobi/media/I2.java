package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static Config a(String configType, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new CrashConfig(str);
                }
                break;
            case 96432:
                if (configType.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return new AdConfig(str);
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new RootConfig(str);
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return new TelemetryConfig(str);
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new SignalsConfig(str);
                }
                break;
        }
        return new AdConfig(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inmobi.commons.core.configs.Config a(java.lang.String r6, org.json.JSONObject r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r0 = "configType"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r0)
            int r0 = r6.hashCode()
            java.lang.Class<com.inmobi.commons.core.configs.AdConfig> r1 = com.inmobi.commons.core.configs.AdConfig.class
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            switch(r0) {
                case -60641721: goto Lc8;
                case 96432: goto Laf;
                case 3506402: goto L67;
                case 780346297: goto L34;
                case 2088265419: goto L17;
                default: goto L15;
            }
        L15:
            goto Ld0
        L17:
            java.lang.String r0 = "signals"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L21
            goto Ld0
        L21:
            com.inmobi.commons.core.configs.i r6 = com.inmobi.commons.core.configs.SignalsConfig.Companion
            r6.getClass()
            com.inmobi.media.w6 r6 = com.inmobi.commons.core.configs.i.a()
            java.lang.Class<com.inmobi.commons.core.configs.SignalsConfig> r0 = com.inmobi.commons.core.configs.SignalsConfig.class
            java.lang.Object r6 = r6.a(r7, r0)
            com.inmobi.commons.core.configs.Config r6 = (com.inmobi.commons.core.configs.Config) r6
            goto Lf2
        L34:
            java.lang.String r0 = "telemetry"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3e
            goto Ld0
        L3e:
            com.inmobi.media.qe r6 = com.inmobi.commons.core.configs.TelemetryConfig.Companion
            r6.getClass()
            com.inmobi.media.w6 r6 = new com.inmobi.media.w6
            r6.<init>()
            com.inmobi.media.Yc r0 = new com.inmobi.media.Yc
            java.lang.String r1 = "priorityEvents"
            java.lang.Class<com.inmobi.commons.core.configs.TelemetryConfig> r3 = com.inmobi.commons.core.configs.TelemetryConfig.class
            r0.<init>(r1, r3)
            com.inmobi.media.a7 r1 = new com.inmobi.media.a7
            com.inmobi.media.pe r4 = new com.inmobi.media.pe
            r4.<init>()
            r1.<init>(r4, r2)
            com.inmobi.media.w6 r6 = r6.a(r0, r1)
            java.lang.Object r6 = r6.a(r7, r3)
            com.inmobi.commons.core.configs.Config r6 = (com.inmobi.commons.core.configs.Config) r6
            goto Lf2
        L67:
            java.lang.String r0 = "root"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L70
            goto Ld0
        L70:
            com.inmobi.commons.core.configs.e r6 = com.inmobi.commons.core.configs.RootConfig.Companion
            r6.getClass()
            com.inmobi.media.w6 r6 = new com.inmobi.media.w6
            r6.<init>()
            com.inmobi.media.Yc r0 = new com.inmobi.media.Yc
            java.lang.String r1 = "components"
            java.lang.Class<com.inmobi.commons.core.configs.RootConfig> r3 = com.inmobi.commons.core.configs.RootConfig.class
            r0.<init>(r1, r3)
            com.inmobi.media.a7 r1 = new com.inmobi.media.a7
            com.inmobi.commons.core.configs.d r4 = new com.inmobi.commons.core.configs.d
            r4.<init>()
            java.lang.Class<com.inmobi.commons.core.configs.RootConfig$ComponentConfig> r5 = com.inmobi.commons.core.configs.RootConfig.ComponentConfig.class
            r1.<init>(r4, r5)
            com.inmobi.media.w6 r6 = r6.a(r0, r1)
            com.inmobi.media.Yc r0 = new com.inmobi.media.Yc
            java.lang.String r1 = "ipAddrTPSupport"
            r0.<init>(r1, r3)
            com.inmobi.media.a7 r1 = new com.inmobi.media.a7
            com.inmobi.media.Vc r4 = new com.inmobi.media.Vc
            r4.<init>()
            r1.<init>(r4, r2)
            com.inmobi.media.w6 r6 = r6.a(r0, r1)
            java.lang.Object r6 = r6.a(r7, r3)
            com.inmobi.commons.core.configs.Config r6 = (com.inmobi.commons.core.configs.Config) r6
            goto Lf2
        Laf:
            java.lang.String r0 = "ads"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto Lb8
            goto Ld0
        Lb8:
            com.inmobi.commons.core.configs.b r6 = com.inmobi.commons.core.configs.AdConfig.Companion
            r6.getClass()
            com.inmobi.media.w6 r6 = com.inmobi.commons.core.configs.b.a()
            java.lang.Object r6 = r6.a(r7, r1)
            com.inmobi.commons.core.configs.Config r6 = (com.inmobi.commons.core.configs.Config) r6
            goto Lf2
        Lc8:
            java.lang.String r0 = "crashReporting"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto Le0
        Ld0:
            com.inmobi.commons.core.configs.b r6 = com.inmobi.commons.core.configs.AdConfig.Companion
            r6.getClass()
            com.inmobi.media.w6 r6 = com.inmobi.commons.core.configs.b.a()
            java.lang.Object r6 = r6.a(r7, r1)
            com.inmobi.commons.core.configs.Config r6 = (com.inmobi.commons.core.configs.Config) r6
            goto Lf2
        Le0:
            com.inmobi.media.m3 r6 = com.inmobi.commons.core.configs.CrashConfig.Companion
            r6.getClass()
            com.inmobi.media.w6 r6 = new com.inmobi.media.w6
            r6.<init>()
            java.lang.Class<com.inmobi.commons.core.configs.CrashConfig> r0 = com.inmobi.commons.core.configs.CrashConfig.class
            java.lang.Object r6 = r6.a(r7, r0)
            com.inmobi.commons.core.configs.Config r6 = (com.inmobi.commons.core.configs.Config) r6
        Lf2:
            if (r6 == 0) goto Lfa
            r6.setAccountId$media_release(r8)
            r6.setLastUpdateTimeStamp(r9)
        Lfa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.I2.a(java.lang.String, org.json.JSONObject, java.lang.String, long):com.inmobi.commons.core.configs.Config");
    }
}
