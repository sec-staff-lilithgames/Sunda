package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import bp.oM.DwaEpyvxz;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f15818a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f15819b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f15820c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f15821d = false;

    /* renamed from: e, reason: collision with root package name */
    private static a f15822e = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f15823a;

        /* renamed from: b, reason: collision with root package name */
        private String f15824b = "";

        /* renamed from: c, reason: collision with root package name */
        private EnumC0043a f15825c = EnumC0043a.NOT_SET;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0043a {
            NOT_SET("dnt_not_set"),
            ON(DwaEpyvxz.ungv),
            OFF("dnt_off");


            /* renamed from: a, reason: collision with root package name */
            private final String f15830a;

            EnumC0043a(String str) {
                this.f15830a = str;
            }

            public String b() {
                return this.f15830a;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0043a b() {
            return this.f15825c;
        }

        public boolean c() {
            return this.f15823a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0043a enumC0043aB = b();
            EnumC0043a enumC0043aB2 = aVar.b();
            return enumC0043aB != null ? enumC0043aB.equals(enumC0043aB2) : enumC0043aB2 == null;
        }

        public int hashCode() {
            int i10 = c() ? 79 : 97;
            String strA = a();
            int iHashCode = ((i10 + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            EnumC0043a enumC0043aB = b();
            return (iHashCode * 59) + (enumC0043aB != null ? enumC0043aB.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z10) {
            this.f15823a = z10;
        }

        public void a(String str) {
            this.f15824b = str;
        }

        public void a(EnumC0043a enumC0043a) {
            this.f15825c = enumC0043a;
        }

        public String a() {
            return this.f15824b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        k7.a();
        Object obj = f15819b;
        synchronized (obj) {
            try {
                if (f15821d) {
                    return f15822e;
                }
                Collection collection = f15820c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarC = c(context);
                    synchronized (obj) {
                        f15821d = true;
                        f15822e = aVarC;
                        hashSet = new HashSet(collection);
                        collection.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e10) {
                    com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
                }
                synchronized (f15819b) {
                    aVar = f15822e;
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f15818a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0043a.ON : a.EnumC0043a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to collect Fire OS IDFA", th2);
            }
        }
        f15818a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        k7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0043a.ON : a.EnumC0043a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th2) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th2);
            return null;
        }
    }

    public static boolean a() {
        return k7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
