package com.amazon.device.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class DtbDeviceData {
    public static final String DEFAULT_USER_AGENT = "Android";
    public static final String DEVICE_DATA_CARRIER_KEY = "carrier";
    public static final String DEVICE_DATA_CONNECTION_TYPE_KEY = "connectionType";
    public static final String DEVICE_DATA_COUNTRY_KEY = "country";
    public static final String DEVICE_DATA_HWV_KEY = "hwv";
    public static final String DEVICE_DATA_LANGUAGE_KEY = "language";
    public static final String DEVICE_DATA_MAKE_KEY = "make";
    public static final String DEVICE_DATA_MODEL_KEY = "model";
    public static final String DEVICE_DATA_ORIENTATION_KEY = "orientation";
    public static final String DEVICE_DATA_OS_KEY = "os";
    public static final String DEVICE_DATA_OS_VERSION_KEY = "osVersion";
    public static final String DEVICE_DATA_PPI_KEY = "ppi";
    public static final String DEVICE_DATA_SCALING_FACTOR_KEY = "scalingFactor";
    public static final String DEVICE_DATA_SCREEN_SIZE_KEY = "screenSize";
    public static final String LOG_TAG = "DtbDeviceData";
    public static DtbDeviceData deviceDataInstance;
    public boolean bad_serial = false;
    public boolean bad_udid = false;
    public boolean bad_mac = false;
    public String sha1_mac = null;
    public String sha1_udid = null;
    public String sha1_serial = null;

    /* renamed from: ua, reason: collision with root package name */
    public String f12512ua = null;
    public String screenSize = null;
    public String orientation = null;
    public HashMap<String, Object> deviceParams = new HashMap<>();
    public JSONObject deviceInfoJson = new JSONObject();

    public DtbDeviceData(Context context) {
        getOrientation();
        getScreenSize();
        getDeviceInfoJson();
        getUserAgent();
        buildDeviceParams();
    }

    private void buildDeviceParams() {
        this.deviceParams.put("dt", "android");
        this.deviceParams.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        this.deviceParams.put("aud", "3p");
        String str = this.f12512ua;
        if (str != null) {
            this.deviceParams.put(Q6.f35252d0, str);
        }
        this.deviceParams.put("sdkVer", DtbCommonUtils.getSDKVersion());
        JSONObject jSONObject = this.deviceInfoJson;
        if (jSONObject != null) {
            this.deviceParams.put("dinfo", jSONObject);
        }
    }

    private String generateSha1Hash(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        messageDigest.update(str.getBytes());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArrDigest) {
            sb2.append(Integer.toHexString((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1));
        }
        return sb2.toString();
    }

    public static String getConnectionType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "0";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? type != 6 ? "0" : DtbConstants.NETWORK_TYPE_LTE : DtbConstants.NETWORK_TYPE_WIFI : Integer.toString(activeNetworkInfo.getSubtype());
    }

    public static DtbDeviceData getDeviceDataInstance() {
        if (AdRegistration.getContext() == null) {
            DtbLog.debugError("unable to initialize advertising info without setting app context");
            throw new IllegalArgumentException("unable to initialize advertising info without setting app context");
        }
        if (deviceDataInstance == null) {
            if (AdRegistration.getContext() == null) {
                DtbLog.debugError("Invalid intialization of Device Data. Context is null");
                throw new IllegalArgumentException("Invalid intialization of Device Data. Context is null");
            }
            deviceDataInstance = new DtbDeviceData(AdRegistration.getContext());
        }
        return deviceDataInstance;
    }

    private DisplayMetrics getDisplayMetrics() {
        return AdRegistration.getContext().getResources().getDisplayMetrics();
    }

    private void getOrientation() {
        this.orientation = DtbDeviceDataRetriever.getOrientation(AdRegistration.getContext());
    }

    private int getScreenPpi() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        return (int) (Math.sqrt(Math.pow(displayMetrics.heightPixels, 2.0d) + Math.pow(displayMetrics.widthPixels, 2.0d)) / Math.sqrt(Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d) + Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)));
    }

    private void getScreenSize() {
        this.screenSize = DtbDeviceDataRetriever.getScreenSize(new DisplayMetrics(), this.orientation);
    }

    private void getUserAgent() {
        try {
            this.f12512ua = WebSettings.getDefaultUserAgent(AdRegistration.getContext());
        } catch (Exception unused) {
            DtbLog.info("Unable to Get User Agent, Setting it to default");
            this.f12512ua = "Android";
        }
    }

    public HashMap<String, Object> getDeviceParams() {
        if (!this.deviceParams.containsKey(Q6.f35252d0) || (this.deviceParams.containsKey(Q6.f35252d0) && this.deviceParams.get(Q6.f35252d0).equals("Android"))) {
            getUserAgent();
            buildDeviceParams();
        }
        return this.deviceParams;
    }

    public JSONObject getParamsJson() {
        try {
            getOrientation();
            placeProperty(this.orientation, "orientation");
            getScreenSize();
            placeProperty(this.screenSize, DEVICE_DATA_SCREEN_SIZE_KEY);
        } catch (Exception e10) {
            DtbLog.error("Error:" + e10);
        }
        return this.deviceInfoJson;
    }

    public JSONObject getParamsJsonGetSafe() {
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = this.deviceInfoJson.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = this.deviceInfoJson.get(next);
                if (obj instanceof String) {
                    jSONObject.put(next, URLEncoder.encode((String) obj, C.UTF8_NAME));
                }
            } catch (Exception unused) {
                DtbLog.error("Error converting to JsonGetSafe");
            }
        }
        return jSONObject;
    }

    public String getUserAgentString() {
        return this.f12512ua;
    }

    public void placeProperty(String str, String str2) throws JSONException, UnsupportedEncodingException {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.deviceInfoJson.put(str2, str);
    }

    private void getDeviceInfoJson() {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.DEVICE;
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        String connectionType = getConnectionType();
        int screenPpi = getScreenPpi();
        TelephonyManager telephonyManager = (TelephonyManager) AdRegistration.getContext().getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        String string = Float.toString((str2.equals("motorola") && str.equals("MB502")) ? 1.0f : getDisplayMetrics().scaledDensity);
        try {
            placeProperty("Android", "os");
            placeProperty(str, "model");
            placeProperty(str2, "make");
            placeProperty(str4, DEVICE_DATA_HWV_KEY);
            placeProperty(str3, "osVersion");
            placeProperty(country, "country");
            placeProperty(networkOperatorName, "carrier");
            placeProperty(language, VPCjETNfjxu.EpIqKaX);
            placeProperty(this.screenSize, DEVICE_DATA_SCREEN_SIZE_KEY);
            placeProperty(string, DEVICE_DATA_SCALING_FACTOR_KEY);
            placeProperty(Integer.toString(screenPpi), DEVICE_DATA_PPI_KEY);
            placeProperty(this.orientation, "orientation");
            placeProperty(connectionType, "connectionType");
        } catch (UnsupportedEncodingException unused) {
            DtbLog.error(LOG_TAG, "Unsupported encoding");
        } catch (JSONException unused2) {
            DtbLog.error(LOG_TAG, "JSONException while producing deviceInfoJson");
        }
    }
}
