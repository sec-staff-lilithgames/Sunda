package com.sfbx.appconsent.core.provider;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.TelephonyManager;
import com.ironsource.C3119a4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.sfbx.appconsent.core.model.api.PackageInstalled;
import com.sfbx.appconsent.core.model.api.XChangeData;
import com.sfbx.appconsent.core.model.api.XChangeUserData;
import com.sfbx.appconsent.core.util.ExtensionKt;
import com.sfbx.appconsent.core.util.XChangeExtsKt;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class XChangeProvider {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_ALLOW_PACKAGES = "appconsent_allow_packages";
    private static final String KEY_XCHANGE_USER_DATA = "appconsent_v2_xchange_user_data";
    private final Json json;
    private final UserProvider mUserProvider;

    /* renamed from: sp, reason: collision with root package name */
    private final SharedPreferences f50536sp;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public XChangeProvider(SharedPreferences sp2, Json json, UserProvider mUserProvider) {
        e0.checkNotNullParameter(sp2, "sp");
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(mUserProvider, "mUserProvider");
        this.f50536sp = sp2;
        this.json = json;
        this.mUserProvider = mUserProvider;
    }

    private final String getCountryCode(Context context) {
        if (context.getResources().getConfiguration().getLocales().get(0) != null) {
            String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
            e0.checkNotNullExpressionValue(country, "{\n            context.re….get(0).country\n        }");
            return country;
        }
        String country2 = context.getResources().getConfiguration().locale.getCountry();
        e0.checkNotNullExpressionValue(country2, "{\n            context.re….locale.country\n        }");
        return country2;
    }

    private final String getIPAddress(boolean z10) {
        String str;
        try {
            ArrayList interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            e0.checkNotNullExpressionValue(interfaces, "interfaces");
            Iterator it = interfaces.iterator();
            while (it.hasNext()) {
                ArrayList<InetAddress> addrs = Collections.list(((NetworkInterface) it.next()).getInetAddresses());
                e0.checkNotNullExpressionValue(addrs, "addrs");
                for (InetAddress inetAddress : addrs) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress == null) {
                            str = "";
                        } else {
                            e0.checkNotNullExpressionValue(hostAddress, "it.hostAddress ?: \"\"");
                            str = hostAddress;
                        }
                        boolean z11 = n0.indexOf$default((CharSequence) str, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null) < 0;
                        if (z10) {
                            if (z11) {
                                return str;
                            }
                        } else if (!z11) {
                            int iIndexOf$default = n0.indexOf$default((CharSequence) str, '%', 0, false, 6, (Object) null);
                            if (iIndexOf$default < 0) {
                                Locale locale = Locale.getDefault();
                                e0.checkNotNullExpressionValue(locale, "getDefault()");
                                String upperCase = str.toUpperCase(locale);
                                e0.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                                return upperCase;
                            }
                            String strSubstring = str.substring(0, iIndexOf$default);
                            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            Locale locale2 = Locale.getDefault();
                            e0.checkNotNullExpressionValue(locale2, "getDefault()");
                            String upperCase2 = strSubstring.toUpperCase(locale2);
                            e0.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                            return upperCase2;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final String getMacAddress() throws SocketException {
        try {
            ArrayList<NetworkInterface> all = Collections.list(NetworkInterface.getNetworkInterfaces());
            e0.checkNotNullExpressionValue(all, "all");
            for (NetworkInterface networkInterface : all) {
                if (k0.equals(networkInterface.getName(), "wlan0", true)) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    e0.checkNotNullExpressionValue(hardwareAddress, "it.hardwareAddress ?: return \"\"");
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        String str = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                        e0.checkNotNullExpressionValue(str, "format(format, *args)");
                        sb2.append(str);
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    String string = sb2.toString();
                    e0.checkNotNullExpressionValue(string, "res1.toString()");
                    return string;
                }
            }
        } catch (Exception unused) {
        }
        return "02:00:00:00:00:00";
    }

    private final Integer getMobileSignalStrength(Context context, TelephonyManager telephonyManager) {
        if (m3.a.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            return 99;
        }
        List<CellInfo> cellInfo = telephonyManager.getAllCellInfo();
        e0.checkNotNullExpressionValue(cellInfo, "cellInfo");
        for (CellInfo cellInfo2 : cellInfo) {
            if (cellInfo2.isRegistered()) {
                if (cellInfo2 instanceof CellInfoGsm) {
                    return Integer.valueOf(((CellInfoGsm) cellInfo2).getCellSignalStrength().getDbm());
                }
                if (cellInfo2 instanceof CellInfoLte) {
                    return Integer.valueOf(((CellInfoLte) cellInfo2).getCellSignalStrength().getDbm());
                }
                if (cellInfo2 instanceof CellInfoCdma) {
                    return Integer.valueOf(((CellInfoCdma) cellInfo2).getCellSignalStrength().getDbm());
                }
                return Integer.valueOf(Build.VERSION.SDK_INT >= 30 ? cellInfo2.getCellSignalStrength().getDbm() : 99);
            }
        }
        return 99;
    }

    private final String getNetworkType(Context context, TelephonyManager telephonyManager) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getSystemService("connectivity");
            e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
            activeNetwork = connectivityManager.getActiveNetwork();
        } catch (Exception unused) {
        }
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || m3.a.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            return "";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "WIFI";
        }
        if (networkCapabilities.hasTransport(0)) {
            return getReadableNetworkType(telephonyManager.getNetworkType());
        }
        return "";
    }

    private final Integer getSignalStrength(String str, Context context, TelephonyManager telephonyManager) {
        return e0.areEqual(str, "WIFI") ? Integer.valueOf(getWifiSignalStrength(context)) : getMobileSignalStrength(context, telephonyManager);
    }

    private final String getWifiSSID(Context context) {
        try {
            Object systemService = context.getApplicationContext().getSystemService(C3119a4.f35922b);
            e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                String ssid = connectionInfo.getSSID();
                return ssid == null ? "" : ssid;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final int getWifiSignalStrength(Context context) {
        try {
            Object systemService = context.getApplicationContext().getSystemService(C3119a4.f35922b);
            e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            return ((WifiManager) systemService).getConnectionInfo().getRssi();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final List<PackageInstalled> generatePackagesInstalledList(Context context) {
        e0.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(128);
            e0.checkNotNullExpressionValue(installedPackages, "context.packageManager.g…edPackages(GET_META_DATA)");
            for (PackageInfo packageInfo : installedPackages) {
                String str = packageInfo.packageName;
                e0.checkNotNullExpressionValue(str, "it.packageName");
                arrayList.add(new PackageInstalled(str, System.currentTimeMillis(), packageInfo.firstInstallTime, packageInfo.lastUpdateTime));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final Map<String, String> generateXChangeData(Context context) throws SocketException {
        e0.checkNotNullParameter(context, "context");
        XChangeUserData xChangeUserData = null;
        try {
            Json json = this.json;
            KSerializer nullable = BuiltinSerializersKt.getNullable(XChangeUserData.Companion.serializer());
            String string = this.f50536sp.getString(KEY_XCHANGE_USER_DATA, null);
            if (string == null) {
                string = AbstractJsonLexerKt.NULL;
            }
            xChangeUserData = (XChangeUserData) json.decodeFromString(nullable, string);
        } catch (Exception unused) {
        }
        Object systemService = context.getSystemService("phone");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String packageName = context.getApplicationContext().getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        String MANUFACTURER = Build.MANUFACTURER;
        e0.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String strCapitalizeFirstLetter = ExtensionKt.capitalizeFirstLetter(MANUFACTURER);
        String countryCode = getCountryCode(context);
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        String userId = this.mUserProvider.getUserId();
        String str = this.mUserProvider.userIdIsAdId() ? "AAID" : IronSourceConstants.TYPE_UUID;
        String MODEL = Build.MODEL;
        e0.checkNotNullExpressionValue(MODEL, "MODEL");
        String strCapitalizeFirstLetter2 = ExtensionKt.capitalizeFirstLetter(MODEL);
        String simOperator = telephonyManager.getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        String deviceCarrierCode = telephonyManager.getNetworkOperator();
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        String str2 = networkOperatorName != null ? networkOperatorName : "";
        String iPAddress = getIPAddress(true);
        String iPAddress2 = getIPAddress(false);
        String macAddress = getMacAddress();
        String networkType = getNetworkType(context, telephonyManager);
        Integer signalStrength = getSignalStrength(networkType, context, telephonyManager);
        int iIntValue = signalStrength != null ? signalStrength.intValue() : 99;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String wifiSSID = getWifiSSID(context);
        XChangeData.Builder builderDeviceSimCode = new XChangeData.Builder(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null).merge(xChangeUserData).appNameBundle(packageName).deviceManufacturer(strCapitalizeFirstLetter).deviceCountryCode(countryCode).deviceOS("ANDROID").deviceOSVersion(strValueOf).deviceSimCode(simOperator);
        e0.checkNotNullExpressionValue(deviceCarrierCode, "deviceCarrierCode");
        return XChangeExtsKt.toMap(builderDeviceSimCode.deviceCarrierCode(deviceCarrierCode).maid(userId).maidType(str).deviceModel(strCapitalizeFirstLetter2).deviceCarrier(str2).ipv4Address(iPAddress).ipv6Address(iPAddress2).macAddress(macAddress).networkType(networkType).signalStrength(iIntValue).timestampCollect(jCurrentTimeMillis).wifiSSID(wifiSSID).build());
    }

    public final boolean isAllowPackagesInstalled() {
        return this.f50536sp.getBoolean(KEY_ALLOW_PACKAGES, false);
    }

    public final void setAllowPackagesInstalled(boolean z10) {
        SharedPreferences.Editor editor = this.f50536sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_ALLOW_PACKAGES, z10).apply();
        editor.apply();
    }

    public final void setXchangeUserData(XChangeUserData xChangeUserData) {
        SharedPreferences.Editor editor = this.f50536sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_XCHANGE_USER_DATA, this.json.encodeToString(BuiltinSerializersKt.getNullable(XChangeUserData.Companion.serializer()), xChangeUserData)).apply();
        editor.apply();
    }

    private final String getReadableNetworkType(int i10) {
        switch (i10) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1XRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            case 16:
                return "GSM";
            case 17:
                return SUvoXnn.vBvsW;
            case 18:
                return "IWLAN";
            case 19:
                return "LTE_CA";
            default:
                return "UNKNOWN";
        }
    }
}
