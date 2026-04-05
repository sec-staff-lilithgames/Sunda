package ir;

import android.app.DownloadManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.hardware.SensorManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.TypedValue;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3119a4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.services.core.request.NJc.yFkbx;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final jr.g f68362a = new jr.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jr.b f68363b = new jr.b();

    /* renamed from: c, reason: collision with root package name */
    public static final jr.e f68364c = new jr.e();

    /* renamed from: d, reason: collision with root package name */
    public static final jr.f f68365d = new jr.f();

    /* renamed from: e, reason: collision with root package name */
    public static final jr.d f68366e = new jr.d();

    /* renamed from: f, reason: collision with root package name */
    public static final jr.c f68367f = new jr.c();

    public static final <T> void addAllSafely(Collection<T> collection, Collection<? extends T> collection2) {
        e0.checkNotNullParameter(collection, "<this>");
        if (collection2 == null) {
            return;
        }
        collection.addAll(collection2);
    }

    public static final byte[] applyMD5(byte[] bArr) {
        e0.checkNotNullParameter(bArr, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void closeSafely(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final String createHexHashCode(Object obj) {
        e0.checkNotNullParameter(obj, "<this>");
        String hexString = Integer.toHexString(obj.hashCode());
        e0.checkNotNullExpressionValue(hexString, "toHexString(hashCode())");
        return hexString;
    }

    public static final byte[] decodeBase64(String str, int i10) {
        e0.checkNotNullParameter(str, "<this>");
        try {
            byte[] bytes = str.getBytes(sv.g.f86134b);
            e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return decodeBase64(bytes, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] decodeBase64$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64(str, i10);
    }

    public static final String decodeBase64ToString(byte[] bArr, int i10) {
        e0.checkNotNullParameter(bArr, "<this>");
        byte[] bArrDecodeBase64 = decodeBase64(bArr, i10);
        if (bArrDecodeBase64 != null) {
            return new String(bArrDecodeBase64, sv.g.f86134b);
        }
        return null;
    }

    public static /* synthetic */ String decodeBase64ToString$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(bArr, i10);
    }

    public static final int dpToPx(Context context, float f10) {
        e0.checkNotNullParameter(context, "<this>");
        return unitToPx(context, 1, f10);
    }

    public static final String encodeToStringBase64(byte[] bArr, int i10) {
        e0.checkNotNullParameter(bArr, "<this>");
        try {
            return Base64.encodeToString(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String encodeToStringBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return encodeToStringBase64(bArr, i10);
    }

    public static final void finalize(OutputStream outputStream) {
        flushSafely(outputStream);
        closeSafely(outputStream);
    }

    public static final void flushSafely(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable unused) {
            }
        }
    }

    public static final <T extends Number> double fromRatio(T t10, double d10) {
        e0.checkNotNullParameter(t10, "<this>");
        return (t10.doubleValue() * d10) / 1.0d;
    }

    public static final AudioManager getAudioManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            return (AudioManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final BluetoothManager getBluetoothManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService(C3119a4.f35924d);
            if (!(systemService instanceof BluetoothManager)) {
                systemService = null;
            }
            return (BluetoothManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final ClipboardManager getClipboardManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            return (ClipboardManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int getColorCompat(Context context, int i10) {
        e0.checkNotNullParameter(context, "<this>");
        return context.getColor(i10);
    }

    public static final ConnectivityManager getConnectivityManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final DownloadManager getDownloadManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService(NativeAdPresenter.DOWNLOAD);
            if (!(systemService instanceof DownloadManager)) {
                systemService = null;
            }
            return (DownloadManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final InputMethodManager getInputMethodManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            return (InputMethodManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Location getLocation(Context context) {
        LocationManager locationManager;
        Location lastKnownLocation;
        e0.checkNotNullParameter(context, "<this>");
        if (!isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION") || (locationManager = getLocationManager(context)) == null) {
            return null;
        }
        String bestProvider = Build.VERSION.SDK_INT >= 34 ? "fused" : locationManager.getBestProvider(new Criteria(), false);
        if (bestProvider == null) {
            return null;
        }
        Location lastKnownLocation2 = locationManager.getLastKnownLocation(bestProvider);
        if (lastKnownLocation2 != null) {
            return lastKnownLocation2;
        }
        List<String> allProviders = locationManager.getAllProviders();
        e0.checkNotNullExpressionValue(allProviders, "locationManager.allProviders");
        if (allProviders.size() <= 1) {
            return null;
        }
        for (String str : allProviders) {
            if (str != null && !e0.areEqual(str, bestProvider) && (lastKnownLocation = locationManager.getLastKnownLocation(str)) != null) {
                return lastKnownLocation;
            }
        }
        return null;
    }

    public static final LocationManager getLocationManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService(DtbConstants.PRIVACY_LOCATION_KEY);
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final PowerManager getPowerManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("power");
            if (!(systemService instanceof PowerManager)) {
                systemService = null;
            }
            return (PowerManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final SensorManager getSensorManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("sensor");
            if (!(systemService instanceof SensorManager)) {
                systemService = null;
            }
            return (SensorManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final TelephonyManager getTelephonyManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final WindowManager getWindowManager(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("window");
            if (!(systemService instanceof WindowManager)) {
                systemService = null;
            }
            return (WindowManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        Boolean boolValueOf;
        e0.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            boolValueOf = Boolean.valueOf(context.checkPermission(str, Process.myPid(), Process.myUid()) == 0);
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return e0.areEqual(boolValueOf, Boolean.TRUE);
    }

    public static final <R> R letSafely(kv.a block) {
        e0.checkNotNullParameter(block, "block");
        try {
            return (R) block.invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String notEmptyOrDefault(String str, String defaultValue) {
        e0.checkNotNullParameter(defaultValue, "defaultValue");
        return (str == null || str.length() == 0) ? defaultValue : str;
    }

    public static final String notEmptyOrNull(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void putAllSafely(Map<K, V> map, Map<K, ? extends V> map2) {
        e0.checkNotNullParameter(map, "<this>");
        if (map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    public static final int pxToDp(Context context, float f10) {
        e0.checkNotNullParameter(context, "<this>");
        return q.pxToDp(c.getScreenDensity(context), f10);
    }

    public static final String readAssetFile(AssetManager assetManager, String fileName) {
        e0.checkNotNullParameter(assetManager, "<this>");
        e0.checkNotNullParameter(fileName, "fileName");
        try {
            InputStream inputStreamOpen = assetManager.open(fileName);
            e0.checkNotNullExpressionValue(inputStreamOpen, "open(fileName)");
            return readSafely(inputStreamOpen);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final long readIntoFile(InputStream inputStream, File file) throws Throwable {
        e0.checkNotNullParameter(inputStream, "<this>");
        e0.checkNotNullParameter(file, "file");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long jCopyTo$default = gv.c.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                gv.d.closeFinally(fileOutputStream, null);
                gv.d.closeFinally(inputStream, null);
                return jCopyTo$default;
            } finally {
            }
        } finally {
        }
    }

    public static final String readSafely(InputStream inputStream) {
        e0.checkNotNullParameter(inputStream, "<this>");
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, sv.g.f86134b), Segment.SIZE);
                try {
                    String text = gv.y.readText(bufferedReader);
                    gv.d.closeFinally(bufferedReader, null);
                    gv.d.closeFinally(inputStream, null);
                    return text;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Intent registerBroadcastReceiver(Context context, BroadcastReceiver receiver, IntentFilter intentFilter) {
        e0.checkNotNullParameter(context, "<this>");
        e0.checkNotNullParameter(receiver, "receiver");
        e0.checkNotNullParameter(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(receiver, intentFilter, 2) : context.registerReceiver(receiver, intentFilter);
    }

    public static final Intent registerSystemReceiver(Context context, IntentFilter intentFilter) {
        e0.checkNotNullParameter(context, "<this>");
        e0.checkNotNullParameter(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
    }

    public static final <T> void setSafely(Collection<T> collection, Collection<? extends T> collection2) {
        e0.checkNotNullParameter(collection, "<this>");
        collection.clear();
        addAllSafely(collection, collection2);
    }

    public static final int spToPx(Context context, float f10) {
        e0.checkNotNullParameter(context, "<this>");
        return unitToPx(context, 2, f10);
    }

    public static final Boolean toBooleanOrDefault(Object obj, Boolean bool) {
        return (Boolean) f68363b.toOrDefault(obj, bool);
    }

    public static /* synthetic */ Boolean toBooleanOrDefault$default(Object obj, Boolean bool, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        return toBooleanOrDefault(obj, bool);
    }

    public static final String toCamelCase(String str) {
        e0.checkNotNullParameter(str, "<this>");
        String strReplace = new sv.x("_([a-z])").replace(str, r.f68361e);
        if (strReplace.length() <= 0) {
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = strReplace.charAt(0);
        Locale locale = Locale.getDefault();
        e0.checkNotNullExpressionValue(locale, "getDefault()");
        sb2.append((Object) sv.e.lowercase(cCharAt, locale));
        String strSubstring = strReplace.substring(1);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    public static final Double toDoubleOrDefault(Object obj, Double d10) {
        return (Double) f68367f.toOrDefault(obj, d10);
    }

    public static /* synthetic */ Double toDoubleOrDefault$default(Object obj, Double d10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        return toDoubleOrDefault(obj, d10);
    }

    public static final Float toFloatOrDefault(Object obj, Float f10) {
        return (Float) f68366e.toOrDefault(obj, f10);
    }

    public static /* synthetic */ Float toFloatOrDefault$default(Object obj, Float f10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        return toFloatOrDefault(obj, f10);
    }

    public static final Integer toIntOrDefault(Object obj, Integer num) {
        return (Integer) f68364c.toOrDefault(obj, num);
    }

    public static /* synthetic */ Integer toIntOrDefault$default(Object obj, Integer num, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return toIntOrDefault(obj, num);
    }

    public static final JSONArray toJsonArray(List<?> list) {
        e0.checkNotNullParameter(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objFromObjectToJsonElementOrNull = q.fromObjectToJsonElementOrNull(it.next());
            if (objFromObjectToJsonElementOrNull != null) {
                jSONArray.put(objFromObjectToJsonElementOrNull);
            }
        }
        return jSONArray;
    }

    public static final JSONObject toJsonObject(Map<?, ?> map) throws JSONException {
        Object objFromObjectToJsonElementOrNull;
        e0.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String string = key != null ? key.toString() : null;
            Object value = entry.getValue();
            if (string != null && string.length() > 0 && value != null && (objFromObjectToJsonElementOrNull = q.fromObjectToJsonElementOrNull(value)) != null) {
                jSONObject.put(string, objFromObjectToJsonElementOrNull);
            }
        }
        return jSONObject;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        e0.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objFromJsonElementToObjectOrNull = q.fromJsonElementToObjectOrNull(jSONArray.opt(i10));
            if (objFromJsonElementToObjectOrNull != null) {
                arrayList.add(objFromJsonElementToObjectOrNull);
            }
        }
        return arrayList;
    }

    public static final Long toLongOrDefault(Object obj, Long l9) {
        return (Long) f68365d.toOrDefault(obj, l9);
    }

    public static /* synthetic */ Long toLongOrDefault$default(Object obj, Long l9, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            l9 = null;
        }
        return toLongOrDefault(obj, l9);
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        e0.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        e0.checkNotNullExpressionValue(itKeys, "keys()");
        for (String key : rv.y.asSequence(itKeys)) {
            Object objFromJsonElementToObjectOrNull = q.fromJsonElementToObjectOrNull(jSONObject.opt(key));
            if (objFromJsonElementToObjectOrNull != null) {
                e0.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, objFromJsonElementToObjectOrNull);
            }
        }
        return linkedHashMap;
    }

    public static final <T extends Number> double toRatio(T t10, double d10) {
        e0.checkNotNullParameter(t10, "<this>");
        return mv.d.roundToInt((t10.doubleValue() / d10) * 100) / 100.0d;
    }

    public static final String toStringOrDefault(Object obj, String str) {
        return (String) f68362a.toOrDefault(obj, str);
    }

    public static /* synthetic */ String toStringOrDefault$default(Object obj, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return toStringOrDefault(obj, str);
    }

    public static final String toUnderScore(String str) {
        e0.checkNotNullParameter(str, "<this>");
        String strReplace = new sv.x("(?<=.)[A-Z]").replace(str, "_$0");
        Locale locale = Locale.getDefault();
        e0.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = strReplace.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final int unitToPx(Context context, int i10, float f10) {
        e0.checkNotNullParameter(context, "<this>");
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) TypedValue.applyDimension(i10, f10, c.getDisplayMetrics(context));
    }

    public static final byte[] decodeBase64(byte[] bArr, int i10) {
        e0.checkNotNullParameter(bArr, "<this>");
        try {
            return Base64.decode(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] decodeBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64(bArr, i10);
    }

    public static final String decodeBase64ToString(String str, int i10) {
        e0.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(sv.g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return decodeBase64ToString(bytes, i10);
    }

    public static /* synthetic */ String decodeBase64ToString$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(str, i10);
    }

    public static final <T extends i> T find(T[] tArr, String str) {
        String lowerCase;
        String key;
        e0.checkNotNullParameter(tArr, "<this>");
        if (str != null && str.length() != 0) {
            Locale locale = Locale.getDefault();
            e0.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase2 = str.toLowerCase(locale);
            String str2 = yFkbx.PoNegzSc;
            e0.checkNotNullExpressionValue(lowerCase2, str2);
            for (T t10 : tArr) {
                if (t10 == null || (key = t10.getKey()) == null) {
                    lowerCase = null;
                } else {
                    Locale locale2 = Locale.getDefault();
                    e0.checkNotNullExpressionValue(locale2, "getDefault()");
                    lowerCase = key.toLowerCase(locale2);
                    e0.checkNotNullExpressionValue(lowerCase, str2);
                }
                if (k0.equals$default(lowerCase, lowerCase2, false, 2, null)) {
                    return t10;
                }
            }
        }
        return null;
    }

    public static final <T extends Number> float fromRatio(T t10, float f10) {
        e0.checkNotNullParameter(t10, "<this>");
        return (t10.floatValue() * f10) / 1.0f;
    }

    public static final <T, R> R letSafely(T t10, kv.l block) {
        e0.checkNotNullParameter(block, "block");
        try {
            return (R) block.invoke(t10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T extends Number> float toRatio(T t10, float f10) {
        e0.checkNotNullParameter(t10, "<this>");
        return mv.d.roundToInt((t10.floatValue() / f10) * 100) / 100.0f;
    }

    public static final <K, V> void setSafely(Map<K, V> map, Map<K, ? extends V> map2) {
        e0.checkNotNullParameter(map, "<this>");
        map.clear();
        putAllSafely(map, map2);
    }
}
