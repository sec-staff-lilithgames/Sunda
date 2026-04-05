package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.Q6;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class UserAgentManager {
    private static final String SYSTEM_HTTP_AGENT;
    private static final String SYSTEM_PROPERTY_HTTP_AGENT = "http.agent";
    private static final AtomicBoolean WEB_USER_AGENT_PROCESSED;
    private static final AtomicBoolean WEB_USER_AGENT_UPDATED;
    private static Context applicationContext;
    private static String generatedUserAgent;
    public static String webUserAgent;
    public static final UserAgentManager INSTANCE = new UserAgentManager();
    private static final long DEFAULT_EXPIRATION_MS = TimeUnit.DAYS.toMillis(14);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ApplovinUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplovinUserAgentSource(Context context) {
            super(context, "com.applovin.sdk.shared", "com.applovin.sdk.user_agent");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BidMachineUserAgentSource implements UserAgentSource, Runnable {
        private final Context applicationContext;
        private final long expirationMs;

        public BidMachineUserAgentSource(Context context, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            this.expirationMs = j10;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        public final long calculateExpirationMs() {
            return System.currentTimeMillis() + this.expirationMs;
        }

        public final void checkAndUpdate() {
            String str = get();
            if (str == null || str.length() == 0) {
                ir.n.onUiThread(this);
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            Context context = this.applicationContext;
            String strOptString = pr.m.optString(jh.i.E(context), Q6.f35252d0, null);
            if (TextUtils.isEmpty(strOptString) || !pr.d.getOsVersion().equals(pr.m.optString(jh.i.E(context), "ua_device_os", null)) || pr.m.optLong(jh.i.E(context), "ua_exp", -1L) <= System.currentTimeMillis()) {
                return null;
            }
            return strOptString;
        }

        public final long getExpirationMs() {
            return this.expirationMs;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserAgentManager userAgentManager = UserAgentManager.INSTANCE;
                String defaultUserAgent = WebSettings.getDefaultUserAgent(this.applicationContext);
                if (defaultUserAgent != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(defaultUserAgent, "getDefaultUserAgent(applicationContext)");
                    Context context = this.applicationContext;
                    long jCalculateExpirationMs = calculateExpirationMs();
                    pr.m.putString(jh.i.E(context), Q6.f35252d0, defaultUserAgent);
                    pr.m.putString(jh.i.E(context), "ua_device_os", pr.d.getOsVersion());
                    pr.m.putLong(jh.i.E(context), "ua_exp", Long.valueOf(jCalculateExpirationMs));
                } else {
                    defaultUserAgent = null;
                }
                UserAgentManager.webUserAgent = defaultUserAgent;
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FacebookUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookUserAgentSource(Context context) {
            super(context, "com.facebook.ads.internal.ua", "user_agent");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class GeneratedUserAgentSource implements UserAgentSource {
        private final Context applicationContext;

        public GeneratedUserAgentSource(Context context) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        private final void appendChromeToUserAgent(PackageManager packageManager, StringBuilder sb2) {
            String[] strArr = {"com.android.chrome", "com.google.android.webview", "com.android.webview"};
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i10], 0);
                    sb2.append(" Chrome/");
                    sb2.append(packageInfo.versionName);
                    return;
                } catch (Throwable unused) {
                }
            }
        }

        private final void appendMobileToUserAgent(Context context, PackageManager packageManager, StringBuilder sb2) {
            String string;
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb2.append(" Mobile");
                sb2.append(" ");
                int i10 = applicationInfo.labelRes;
                if (i10 == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i10);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "{\n                      …                        }");
                }
                sb2.append(string);
                sb2.append("/");
                sb2.append(packageInfo.versionName);
            } catch (Throwable unused) {
            }
        }

        private final String create(Context context) {
            try {
                StringBuilder userAgentBuilder = new StringBuilder("Mozilla/5.0");
                userAgentBuilder.append(" (Linux; Android ");
                userAgentBuilder.append(ir.b.getOsVersion());
                userAgentBuilder.append("; ");
                userAgentBuilder.append(ir.b.getModel());
                userAgentBuilder.append(" Build/");
                userAgentBuilder.append(ir.b.getBuildId());
                userAgentBuilder.append("; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(packageManager, "packageManager");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(userAgentBuilder, "userAgentBuilder");
                appendChromeToUserAgent(packageManager, userAgentBuilder);
                appendMobileToUserAgent(context, packageManager, userAgentBuilder);
                String string = userAgentBuilder.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "userAgentBuilder.toString()");
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            return create(this.applicationContext);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class IronSourceUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IronSourceUserAgentSource(Context context) {
            super(context, "Mediation_Shared_Preferences", "browser_user_agent");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SharedPreferenceUserAgentSource implements UserAgentSource {
        private final Context applicationContext;
        private final String field;
        private final String name;
        private SharedPreferences sharedPreferences;

        public SharedPreferenceUserAgentSource(Context context, String name, String field) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(field, "field");
            this.name = name;
            this.field = field;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            try {
                if (this.sharedPreferences == null) {
                    this.sharedPreferences = this.applicationContext.getSharedPreferences(this.name, 0);
                }
                SharedPreferences sharedPreferences = this.sharedPreferences;
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(this.field, null);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UserAgentSource {
        String get();
    }

    static {
        String property;
        try {
            property = System.getProperty(SYSTEM_PROPERTY_HTTP_AGENT);
        } catch (Throwable unused) {
            property = null;
        }
        SYSTEM_HTTP_AGENT = property;
        WEB_USER_AGENT_PROCESSED = new AtomicBoolean(false);
        WEB_USER_AGENT_UPDATED = new AtomicBoolean(false);
    }

    private UserAgentManager() {
    }

    public static final void clear() {
        WEB_USER_AGENT_PROCESSED.set(false);
        webUserAgent = null;
        generatedUserAgent = null;
    }

    public static final String getUserAgent() {
        return getUserAgent(applicationContext);
    }

    public static final void initialize(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        applicationContext = context.getApplicationContext();
        INSTANCE.findWebUserAgent$bidmachine_android_sdk_bh_3_4_0(context);
    }

    public static final void updateWebViewUserAgent() {
        Context context;
        if (WEB_USER_AGENT_UPDATED.compareAndSet(false, true) && (context = applicationContext) != null) {
            try {
                new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).checkAndUpdate();
            } catch (Throwable unused) {
            }
        }
    }

    public final String findWebUserAgent$bidmachine_android_sdk_bh_3_4_0(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (!WEB_USER_AGENT_PROCESSED.compareAndSet(false, true)) {
            return webUserAgent;
        }
        String str = new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).get();
        if (str != null && str.length() > 0) {
            return str;
        }
        String str2 = new ApplovinUserAgentSource(context).get();
        if (str2 != null && str2.length() > 0) {
            return str2;
        }
        String str3 = new IronSourceUserAgentSource(context).get();
        if (str3 != null && str3.length() > 0) {
            return str3;
        }
        String str4 = new FacebookUserAgentSource(context).get();
        if (str4 != null && str4.length() > 0) {
            return str4;
        }
        updateWebViewUserAgent();
        return webUserAgent;
    }

    public static final String getUserAgent(Context context) {
        if (context == null) {
            context = applicationContext;
        }
        if (webUserAgent == null && context != null) {
            webUserAgent = INSTANCE.findWebUserAgent$bidmachine_android_sdk_bh_3_4_0(context);
        }
        String str = webUserAgent;
        if (str != null && str.length() > 0) {
            return webUserAgent;
        }
        if (generatedUserAgent == null && context != null) {
            generatedUserAgent = new GeneratedUserAgentSource(context).get();
        }
        String str2 = generatedUserAgent;
        return (str2 == null || str2.length() <= 0) ? SYSTEM_HTTP_AGENT : generatedUserAgent;
    }
}
