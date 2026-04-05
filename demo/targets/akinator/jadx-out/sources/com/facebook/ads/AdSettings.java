package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.io.Serializable;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class AdSettings {
    public static final boolean DEBUG = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum IntegrationErrorMode {
        INTEGRATION_ERROR_CRASH_DEBUG_MODE,
        INTEGRATION_ERROR_CALLBACK_MODE;

        public static final long serialVersionUID = 1;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CAROUSEL_IMG_SQUARE_APP_INSTALL' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TestAdType implements Serializable {
        private static final /* synthetic */ TestAdType[] $VALUES;
        public static final TestAdType CAROUSEL_IMG_SQUARE_APP_INSTALL;
        public static final TestAdType CAROUSEL_IMG_SQUARE_LINK;
        public static final TestAdType PLAYABLE;
        public static final long serialVersionUID = 1;
        private final String adTypeString;
        private final String humanReadable;
        public static final TestAdType DEFAULT = new TestAdType("DEFAULT", 0, "DEFAULT", "Default");
        public static final TestAdType IMG_16_9_APP_INSTALL = new TestAdType("IMG_16_9_APP_INSTALL", 1, "IMG_16_9_APP_INSTALL", "Image App install");
        public static final TestAdType IMG_16_9_LINK = new TestAdType("IMG_16_9_LINK", 2, "IMG_16_9_LINK", "Image link");
        public static final TestAdType VIDEO_HD_16_9_46S_APP_INSTALL = new TestAdType("VIDEO_HD_16_9_46S_APP_INSTALL", 3, "VID_HD_16_9_46S_APP_INSTALL", "Video 46 sec App install");
        public static final TestAdType VIDEO_HD_16_9_46S_LINK = new TestAdType("VIDEO_HD_16_9_46S_LINK", 4, "VID_HD_16_9_46S_LINK", "Video 46 sec link");
        public static final TestAdType VIDEO_HD_16_9_15S_APP_INSTALL = new TestAdType("VIDEO_HD_16_9_15S_APP_INSTALL", 5, "VID_HD_16_9_15S_APP_INSTALL", "Video 15 sec App install");
        public static final TestAdType VIDEO_HD_16_9_15S_LINK = new TestAdType("VIDEO_HD_16_9_15S_LINK", 6, "VID_HD_16_9_15S_LINK", "Video 15 sec link");
        public static final TestAdType VIDEO_HD_9_16_39S_APP_INSTALL = new TestAdType("VIDEO_HD_9_16_39S_APP_INSTALL", 7, "VID_HD_9_16_39S_APP_INSTALL", "Video 39 sec App install");
        public static final TestAdType VIDEO_HD_9_16_39S_LINK = new TestAdType("VIDEO_HD_9_16_39S_LINK", 8, "VID_HD_9_16_39S_LINK", "Video 39 sec link");

        private static /* synthetic */ TestAdType[] $values() {
            return new TestAdType[]{DEFAULT, IMG_16_9_APP_INSTALL, IMG_16_9_LINK, VIDEO_HD_16_9_46S_APP_INSTALL, VIDEO_HD_16_9_46S_LINK, VIDEO_HD_16_9_15S_APP_INSTALL, VIDEO_HD_16_9_15S_LINK, VIDEO_HD_9_16_39S_APP_INSTALL, VIDEO_HD_9_16_39S_LINK, CAROUSEL_IMG_SQUARE_APP_INSTALL, CAROUSEL_IMG_SQUARE_LINK, PLAYABLE};
        }

        private TestAdType(String str, int i10, String str2, String str3) {
            this.adTypeString = str2;
            this.humanReadable = str3;
        }

        public static TestAdType valueOf(String str) {
            return (TestAdType) Enum.valueOf(TestAdType.class, str);
        }

        public static TestAdType[] values() {
            return (TestAdType[]) $VALUES.clone();
        }

        public String getAdTypeString() {
            return this.adTypeString;
        }

        public String getHumanReadable() {
            return this.humanReadable;
        }

        static {
            String str = wHkgq.kogXF;
            CAROUSEL_IMG_SQUARE_APP_INSTALL = new TestAdType(str, 9, str, "Carousel App install");
            CAROUSEL_IMG_SQUARE_LINK = new TestAdType("CAROUSEL_IMG_SQUARE_LINK", 10, "CAROUSEL_IMG_SQUARE_LINK", "Carousel link");
            PLAYABLE = new TestAdType("PLAYABLE", 11, "PLAYABLE", "Playable ad");
            $VALUES = $values();
        }
    }

    public static void addTestDevice(String str) {
        AdInternalSettings.addTestDevice(str);
    }

    public static void addTestDevices(Collection<String> collection) {
        AdInternalSettings.addTestDevices(collection);
    }

    public static void clearTestDevices() {
        AdInternalSettings.clearTestDevices();
    }

    public static String getMediationService() {
        return AdInternalSettings.getMediationService();
    }

    public static TestAdType getTestAdType() {
        MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
        Serializable serializable = multithreadedBundleWrapper.getSerializable(AdInternalSettings.TEST_AD_TYPE_KEY);
        if (serializable instanceof TestAdType) {
            return (TestAdType) serializable;
        }
        TestAdType testAdType = TestAdType.DEFAULT;
        multithreadedBundleWrapper.putSerializable(AdInternalSettings.TEST_AD_TYPE_KEY, testAdType);
        return testAdType;
    }

    public static String getUrlPrefix() {
        return AdInternalSettings.getUrlPrefix();
    }

    public static boolean isMixedAudience() {
        return AdInternalSettings.sSettingsBundle.getBoolean(AdInternalSettings.BOOL_MIXED_AUDIENCE_KEY, false);
    }

    public static boolean isTestMode(Context context) {
        return AdInternalSettings.isTestMode(context);
    }

    public static boolean isVideoAutoplay() {
        return AdInternalSettings.isVideoAutoplay();
    }

    public static boolean isVideoAutoplayOnMobile() {
        return AdInternalSettings.isVideoAutoplayOnMobile();
    }

    public static void setDataProcessingOptions(String[] strArr) {
        AdInternalSettings.setDataProcessingOptions(strArr, null, null);
    }

    public static void setDebugBuild(boolean z10) {
        AdInternalSettings.setDebugBuild(z10);
    }

    public static void setIntegrationErrorMode(IntegrationErrorMode integrationErrorMode) {
        AdInternalSettings.sSettingsBundle.putSerializable(AdInternalSettings.SRL_INTEGRATION_ERROR_MODE_KEY, integrationErrorMode);
    }

    public static void setMediationService(String str) {
        AdInternalSettings.setMediationService(str);
    }

    public static void setMixedAudience(boolean z10) {
        AdInternalSettings.sSettingsBundle.putBoolean(AdInternalSettings.BOOL_MIXED_AUDIENCE_KEY, z10);
    }

    public static void setTestAdType(TestAdType testAdType) {
        AdInternalSettings.sSettingsBundle.putSerializable(AdInternalSettings.TEST_AD_TYPE_KEY, testAdType);
    }

    public static void setTestMode(boolean z10) {
        AdInternalSettings.setTestMode(z10);
    }

    public static void setUrlPrefix(String str) {
        AdInternalSettings.setUrlPrefix(str);
    }

    public static void setVideoAutoplay(boolean z10) {
        AdInternalSettings.setVideoAutoplay(z10);
    }

    public static void setVideoAutoplayOnMobile(boolean z10) {
        AdInternalSettings.setVideoAutoplayOnMobile(z10);
    }

    public static void setVisibleAnimation(boolean z10) {
        AdInternalSettings.setVisibleAnimation(z10);
    }

    public static void turnOnSDKDebugger(Context context) {
        AdInternalSettings.turnOnSDKDebugger(context);
    }

    public static void setDataProcessingOptions(String[] strArr, int i10, int i11) {
        AdInternalSettings.setDataProcessingOptions(strArr, Integer.valueOf(i10), Integer.valueOf(i11));
    }
}
