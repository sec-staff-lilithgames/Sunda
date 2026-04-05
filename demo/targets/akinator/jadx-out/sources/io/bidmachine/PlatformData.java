package io.bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.XmlResourceParser;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PlatformData {
    private static volatile PlatformData instance;
    private final Context context;
    final String kotlinVersion = getKotlinVersion();
    private Integer minSdkVersion;

    private PlatformData(Context context) {
        this.context = context.getApplicationContext();
    }

    public static PlatformData get(Context context) {
        PlatformData platformData;
        PlatformData platformData2 = instance;
        if (platformData2 != null) {
            return platformData2;
        }
        synchronized (PlatformData.class) {
            try {
                platformData = instance;
                if (platformData == null) {
                    platformData = new PlatformData(context);
                    instance = platformData;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return platformData;
    }

    private String getKotlinVersion() {
        try {
            return tu.m.f87391g.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private Integer getMinSdkVersionFromApplicationInfo(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return Integer.valueOf(applicationInfo.minSdkVersion);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private Integer getMinSdkVersionFromManifest(Context context) throws IOException {
        Integer numValueOf = null;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            try {
                for (int eventType = xmlResourceParserOpenXmlResourceParser.getEventType(); eventType != 1; eventType = xmlResourceParserOpenXmlResourceParser.next()) {
                    if (eventType == 2) {
                        if ("uses-sdk".equals(xmlResourceParserOpenXmlResourceParser.getName())) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= xmlResourceParserOpenXmlResourceParser.getAttributeCount()) {
                                    break;
                                }
                                if ("minSdkVersion".equals(xmlResourceParserOpenXmlResourceParser.getAttributeName(i10))) {
                                    numValueOf = Integer.valueOf(Integer.parseInt(xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10)));
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
                xmlResourceParserOpenXmlResourceParser.close();
                return numValueOf;
            } finally {
            }
        } catch (Exception unused) {
            return numValueOf;
        }
    }

    public Integer getMinSdkVersion() {
        Integer num = this.minSdkVersion;
        if (num != null) {
            return num;
        }
        Integer minSdkVersionFromApplicationInfo = getMinSdkVersionFromApplicationInfo(this.context);
        this.minSdkVersion = minSdkVersionFromApplicationInfo;
        if (minSdkVersionFromApplicationInfo == null) {
            this.minSdkVersion = getMinSdkVersionFromManifest(this.context);
        }
        return this.minSdkVersion;
    }
}
