package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.da, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2736da implements P2 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f32781a;

    static {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        f32781a = ((AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getSkipNetworkValidationFeatureEnabled();
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof AdConfig) {
            f32781a = ((AdConfig) config).getSkipNetworkValidationFeatureEnabled();
        }
    }

    public static EnumC3017u4 a(ConnectivityManager connectivityManager, boolean z10) {
        NetworkCapabilities networkCapabilities;
        Network network = connectivityManager.getActiveNetwork();
        if (network != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("da", "TAG");
            networkCapabilities.toString();
            if (!networkCapabilities.hasCapability(12)) {
                return EnumC3017u4.f33433p;
            }
            if ((f32781a && !z10) || networkCapabilities.hasCapability(16)) {
                return null;
            }
            AdConfig.CustomNetworkValidation customNetworkValidation = C2999t3.f33379a;
            kotlin.jvm.internal.e0.checkNotNullParameter(network, "network");
            AdConfig.CustomNetworkValidation customNetworkValidation2 = C2999t3.f33379a;
            if (!(customNetworkValidation2 != null ? customNetworkValidation2.getEnabled() : false)) {
                return EnumC3017u4.f33433p;
            }
            C2999t3.a(network);
            if (C2999t3.f33381c) {
                return null;
            }
            return EnumC3017u4.f33437t;
        }
        return EnumC3017u4.f33433p;
    }

    public static EnumC3017u4 a(boolean z10) {
        EnumC3017u4 enumC3017u4A;
        Context contextD = C2925od.d();
        if (contextD != null) {
            try {
                Object systemService = contextD.getSystemService("connectivity");
                kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                enumC3017u4A = a((ConnectivityManager) systemService, z10);
            } catch (Exception unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("da", "TAG");
                enumC3017u4A = EnumC3017u4.f33435r;
            }
            if (enumC3017u4A != null) {
                return enumC3017u4A;
            }
            Context contextD2 = C2925od.d();
            boolean zIsDeviceIdleMode = false;
            if (contextD2 != null) {
                try {
                    Object systemService2 = contextD2.getSystemService("power");
                    PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                    if (powerManager != null) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                } catch (Exception unused2) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("da", "TAG");
                }
            }
            if (zIsDeviceIdleMode) {
                return EnumC3017u4.f33432o;
            }
            return null;
        }
        return EnumC3017u4.f33431n;
    }

    public static String a(String delimiter, Map map) {
        String strEncode;
        String strEncode2;
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (sb2.length() > 0) {
                    sb2.append(delimiter);
                }
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strEncode, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strEncode2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                String str3 = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                sb2.append(str3);
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void a(Map map) {
        if (map != null) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String str = (String) entry.getValue();
                    int length = str.length() - 1;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 <= length) {
                        boolean z11 = kotlin.jvm.internal.e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (str.subSequence(i10, length + 1).toString().length() > 0 && entry.getKey() != null) {
                        String str2 = (String) entry.getKey();
                        int length2 = str2.length() - 1;
                        int i11 = 0;
                        boolean z12 = false;
                        while (i11 <= length2) {
                            boolean z13 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z12 ? i11 : length2), 32) <= 0;
                            if (z12) {
                                if (!z13) {
                                    break;
                                } else {
                                    length2--;
                                }
                            } else if (z13) {
                                i11++;
                            } else {
                                z12 = true;
                            }
                        }
                        if (str2.subSequence(i11, length2 + 1).toString().length() > 0) {
                            String str3 = (String) entry.getKey();
                            int length3 = str3.length() - 1;
                            int i12 = 0;
                            boolean z14 = false;
                            while (i12 <= length3) {
                                boolean z15 = kotlin.jvm.internal.e0.compare((int) str3.charAt(!z14 ? i12 : length3), 32) <= 0;
                                if (z14) {
                                    if (!z15) {
                                        break;
                                    } else {
                                        length3--;
                                    }
                                } else if (z15) {
                                    i12++;
                                } else {
                                    z14 = true;
                                }
                            }
                            String strA = S7.a(length3, 1, str3, i12);
                            String str4 = (String) entry.getValue();
                            int length4 = str4.length() - 1;
                            int i13 = 0;
                            boolean z16 = false;
                            while (i13 <= length4) {
                                boolean z17 = kotlin.jvm.internal.e0.compare((int) str4.charAt(!z16 ? i13 : length4), 32) <= 0;
                                if (z16) {
                                    if (!z17) {
                                        break;
                                    } else {
                                        length4--;
                                    }
                                } else if (z17) {
                                    i13++;
                                } else {
                                    z16 = true;
                                }
                            }
                            map2.put(strA, S7.a(length4, 1, str4, i13));
                        }
                    }
                }
            }
            map.clear();
            map.putAll(map2);
        }
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kotlin.jvm.internal.e0.checkNotNull(next);
                    String string = jSONObject.getString(next);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static String a(String url, HashMap map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        if (map == null || map.isEmpty()) {
            return url;
        }
        String strReplace$default = url;
        for (Map.Entry entry : map.entrySet()) {
            strReplace$default = sv.k0.replace$default(strReplace$default, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
        }
        return strReplace$default;
    }

    public static byte[] a(byte[] compressedData) {
        GZIPInputStream gZIPInputStream;
        kotlin.jvm.internal.e0.checkNotNullParameter(compressedData, "compressedData");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            compressedData = a((InputStream) gZIPInputStream);
        } catch (IOException e11) {
            e = e11;
            gZIPInputStream2 = gZIPInputStream;
            AbstractC2902n7.a((byte) 2, "da", "Failed to decompress response", e);
            gZIPInputStream = gZIPInputStream2;
            a((Closeable) byteArrayInputStream);
            a((Closeable) gZIPInputStream);
            return compressedData;
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream2 = gZIPInputStream;
            a((Closeable) byteArrayInputStream);
            a((Closeable) gZIPInputStream2);
            throw th;
        }
        a((Closeable) byteArrayInputStream);
        a((Closeable) gZIPInputStream);
        return compressedData;
    }

    public static byte[] a(InputStream input) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i10 = input.read(bArr);
                if (-1 != i10) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.jvm.internal.e0.checkNotNull(byteArray);
                    a(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (Throwable th2) {
                a(byteArrayOutputStream);
                throw th2;
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        if (httpURLConnection != null) {
            try {
                inputStream = httpURLConnection.getInputStream();
            } catch (Error | Exception unused) {
                return;
            }
        } else {
            inputStream = null;
        }
        a((Closeable) inputStream);
        a((Closeable) (httpURLConnection != null ? httpURLConnection.getErrorStream() : null));
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException | Error | Exception unused) {
            }
        }
    }
}
