package ir;

import android.app.DownloadManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f68359a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f68360b;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        e0.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        f68359a = charArray;
        char[] charArray2 = "0123456789ABCDEF".toCharArray();
        e0.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
        f68360b = charArray2;
    }

    public static final <T> void addAll(Collection<T> to2, Collection<? extends T> collection) {
        e0.checkNotNullParameter(to2, "to");
        s.addAllSafely(to2, collection);
    }

    public static final byte[] applyMD5(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        return s.applyMD5(bytes);
    }

    public static final float blueToRatio(int i10) {
        return s.toRatio(Integer.valueOf(Color.blue(i10)), 255.0f);
    }

    public static final String capitalize(String value) {
        e0.checkNotNullParameter(value, "value");
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = value.substring(0, 1);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Locale locale = Locale.getDefault();
        e0.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = strSubstring.toUpperCase(locale);
        e0.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        sb2.append(upperCase);
        String strSubstring2 = value.substring(1);
        e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        Locale locale2 = Locale.getDefault();
        e0.checkNotNullExpressionValue(locale2, "getDefault()");
        String lowerCase = strSubstring2.toLowerCase(locale2);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase);
        return sb2.toString();
    }

    public static final void closeSafely(Closeable closeable) {
        s.closeSafely(closeable);
    }

    public static final Handler createHandlerWithMyOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    public static final String createHexHashCode(Object value) {
        e0.checkNotNullParameter(value, "value");
        return s.createHexHashCode(value);
    }

    public static final byte[] decodeBase64(String base64) {
        e0.checkNotNullParameter(base64, "base64");
        return decodeBase64$default(base64, 0, 2, (Object) null);
    }

    public static /* synthetic */ byte[] decodeBase64$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64(str, i10);
    }

    public static final String decodeBase64ToString(String data) {
        e0.checkNotNullParameter(data, "data");
        return decodeBase64ToString$default(data, 0, 2, (Object) null);
    }

    public static /* synthetic */ String decodeBase64ToString$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(bArr, i10);
    }

    public static final int dpToPx(Context context, float f10) {
        e0.checkNotNullParameter(context, "context");
        return s.dpToPx(context, f10);
    }

    public static final String encodeToStringBase64(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        return encodeToStringBase64$default(bytes, 0, 2, null);
    }

    public static /* synthetic */ String encodeToStringBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return encodeToStringBase64(bArr, i10);
    }

    public static final void finalize(OutputStream outputStream) {
        s.finalize(outputStream);
    }

    public static final <T extends i> T find(String str, T[] from) {
        e0.checkNotNullParameter(from, "from");
        return (T) s.find(from, str);
    }

    public static final void flushSafely(Flushable flushable) {
        s.flushSafely(flushable);
    }

    public static final Object fromJsonElementToObjectOrNull(Object obj) {
        if (obj == null || e0.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj instanceof JSONObject ? s.toMap((JSONObject) obj) : obj instanceof JSONArray ? s.toList((JSONArray) obj) : obj;
    }

    public static final Object fromObjectToJsonElementOrNull(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? s.toJsonArray((List) obj) : obj instanceof Map ? s.toJsonObject((Map) obj) : obj;
    }

    public static final AudioManager getAudioManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getAudioManager(context);
    }

    public static final BluetoothManager getBluetoothManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getBluetoothManager(context);
    }

    public static final ClipboardManager getClipboardManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getClipboardManager(context);
    }

    public static final int getColorCompat(Context context, int i10) {
        e0.checkNotNullParameter(context, "context");
        return s.getColorCompat(context, i10);
    }

    public static final ConnectivityManager getConnectivityManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getConnectivityManager(context);
    }

    public static final DownloadManager getDownloadManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getDownloadManager(context);
    }

    public static final InputMethodManager getInputMethodManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getInputMethodManager(context);
    }

    public static final Location getLocation(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getLocation(context);
    }

    public static final LocationManager getLocationManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getLocationManager(context);
    }

    public static final float getNotOverlappedAreaPercent(Rect mainRect, Rect coverRect) {
        e0.checkNotNullParameter(mainRect, "mainRect");
        e0.checkNotNullParameter(coverRect, "coverRect");
        int iHeight = mainRect.height() * mainRect.width();
        if (iHeight == 0) {
            return 0.0f;
        }
        return (iHeight - (((int) Math.max(0.0d, ((int) Math.min(mainRect.right, coverRect.right)) - ((int) Math.max(mainRect.left, coverRect.left)))) * ((int) Math.max(0.0d, ((int) Math.min(mainRect.bottom, coverRect.bottom)) - ((int) Math.max(mainRect.top, coverRect.top)))))) / iHeight;
    }

    public static final PowerManager getPowerManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getPowerManager(context);
    }

    public static final SensorManager getSensorManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getSensorManager(context);
    }

    public static final TelephonyManager getTelephonyManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getTelephonyManager(context);
    }

    public static final Uri getValidUri(String str) {
        try {
            return Uri.parse(getValidUrl(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String getValidUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (isUrlValid(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, C.UTF8_NAME);
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return str;
        }
    }

    public static final WindowManager getWindowManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        return s.getWindowManager(context);
    }

    public static final float greenToRatio(int i10) {
        return s.toRatio(Integer.valueOf(Color.green(i10)), 255.0f);
    }

    public static final <T> void ifNotNull(T t10, d action) {
        e0.checkNotNullParameter(action, "action");
        if (t10 != null) {
            action.execute(t10);
        }
    }

    public static final boolean isExternalMemoryAvailable() {
        return e0.areEqual(Environment.getExternalStorageState(), "mounted");
    }

    public static final boolean isHttpUri(Uri uri) {
        if (uri == null) {
            return false;
        }
        String string = uri.toString();
        e0.checkNotNullExpressionValue(string, "uri.toString()");
        return isHttpUrl(string);
    }

    public static final boolean isHttpUrl(String url) {
        e0.checkNotNullParameter(url, "url");
        return k0.startsWith$default(url, DtbConstants.HTTP, false, 2, null) || k0.startsWith$default(url, DtbConstants.HTTPS, false, 2, null);
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        e0.checkNotNullParameter(context, "context");
        return s.isPermissionGranted(context, str);
    }

    public static final boolean isUrlValid(String str) {
        Boolean bool;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            new URL(str);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return e0.areEqual(bool, Boolean.TRUE);
    }

    public static final String notEmptyOrDefault(String str, String defaultValue) {
        e0.checkNotNullParameter(defaultValue, "defaultValue");
        return s.notEmptyOrDefault(str, defaultValue);
    }

    public static final Integer parseColorSafely(String str) {
        if (str != null && str.length() != 0) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final <K, V> void putAll(Map<K, V> to2, Map<K, ? extends V> map) {
        e0.checkNotNullParameter(to2, "to");
        s.putAllSafely(to2, map);
    }

    public static final int pxToDp(Context context, float f10) {
        e0.checkNotNullParameter(context, "context");
        return s.pxToDp(context, f10);
    }

    public static final String readAssetFile(AssetManager assetManager, String fileName) {
        e0.checkNotNullParameter(assetManager, "assetManager");
        e0.checkNotNullParameter(fileName, "fileName");
        return s.readAssetFile(assetManager, fileName);
    }

    public static final long readIntoFile(InputStream inputStream, File file) {
        e0.checkNotNullParameter(inputStream, "inputStream");
        e0.checkNotNullParameter(file, "file");
        return s.readIntoFile(inputStream, file);
    }

    public static final String readSafely(InputStream inputStream) {
        e0.checkNotNullParameter(inputStream, "inputStream");
        return s.readSafely(inputStream);
    }

    public static final float redToRatio(int i10) {
        return s.toRatio(Integer.valueOf(Color.red(i10)), 255.0f);
    }

    public static final Intent registerBroadcastReceiver(BroadcastReceiver receiver, Context context, IntentFilter intentFilter) {
        e0.checkNotNullParameter(receiver, "receiver");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(intentFilter, "intentFilter");
        return s.registerBroadcastReceiver(context, receiver, intentFilter);
    }

    public static final Intent registerSystemReceiver(Context context, IntentFilter intentFilter) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(intentFilter, "intentFilter");
        return s.registerSystemReceiver(context, intentFilter);
    }

    public static final <T> void set(Collection<T> to2, Collection<? extends T> collection) {
        e0.checkNotNullParameter(to2, "to");
        s.setSafely(to2, collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void sort(CopyOnWriteArrayList<T> list, Comparator<T> comparator) {
        e0.checkNotNullParameter(list, "list");
        e0.reifiedOperationMarker(0, "T?");
        Object[] array = list.toArray(new Object[0]);
        Arrays.sort(array, comparator);
        int length = array.length;
        for (int i10 = 0; i10 < length; i10++) {
            list.set(i10, array[i10]);
        }
    }

    public static final int spToPx(Context context, float f10) {
        e0.checkNotNullParameter(context, "context");
        return s.spToPx(context, f10);
    }

    public static final Boolean toBooleanOrDefault(Object obj, Boolean bool) {
        return s.toBooleanOrDefault(obj, bool);
    }

    public static /* synthetic */ Boolean toBooleanOrDefault$default(Object obj, Boolean bool, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return toBooleanOrDefault(obj, bool);
    }

    public static final Boolean toBooleanOrNull(Object obj) {
        return toBooleanOrDefault(obj, null);
    }

    public static final String toCamelCase(String value) {
        e0.checkNotNullParameter(value, "value");
        return s.toCamelCase(value);
    }

    public static final Double toDoubleOrDefault(Object obj, Double d10) {
        return s.toDoubleOrDefault(obj, d10);
    }

    public static /* synthetic */ Double toDoubleOrDefault$default(Object obj, Double d10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        return toDoubleOrDefault(obj, d10);
    }

    public static final Double toDoubleOrNull(Object obj) {
        return toDoubleOrDefault(obj, null);
    }

    public static final Float toFloatOrDefault(Object obj, Float f10) {
        return s.toFloatOrDefault(obj, f10);
    }

    public static /* synthetic */ Float toFloatOrDefault$default(Object obj, Float f10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        return toFloatOrDefault(obj, f10);
    }

    public static final Float toFloatOrNull(Object obj) {
        return toFloatOrDefault(obj, null);
    }

    public static final String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            int i12 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = f68359a;
            cArr[i11] = cArr2[i12];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static final Integer toIntOrDefault(Object obj, Integer num) {
        return s.toIntOrDefault(obj, num);
    }

    public static /* synthetic */ Integer toIntOrDefault$default(Object obj, Integer num, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return toIntOrDefault(obj, num);
    }

    public static final Integer toIntOrNull(Object obj) {
        return toIntOrDefault(obj, null);
    }

    public static final JSONArray toJsonArray(List<?> list) {
        e0.checkNotNullParameter(list, "list");
        return s.toJsonArray(list);
    }

    public static final JSONObject toJsonObject(Map<?, ?> map) {
        e0.checkNotNullParameter(map, "map");
        return s.toJsonObject(map);
    }

    public static final List<Object> toList(JSONArray jsonArray) {
        e0.checkNotNullParameter(jsonArray, "jsonArray");
        return s.toList(jsonArray);
    }

    public static final Long toLongOrDefault(Object obj, Long l9) {
        return s.toLongOrDefault(obj, l9);
    }

    public static /* synthetic */ Long toLongOrDefault$default(Object obj, Long l9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l9 = null;
        }
        return toLongOrDefault(obj, l9);
    }

    public static final Long toLongOrNull(Object obj) {
        return toLongOrDefault(obj, null);
    }

    public static final Map<String, Object> toMap(JSONObject jsonObject) {
        e0.checkNotNullParameter(jsonObject, "jsonObject");
        return s.toMap(jsonObject);
    }

    public static final String toSignatureHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int length = bArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            byte b10 = bArr[i11];
            int i12 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = f68360b;
            cArr[i10] = cArr2[i12];
            int i13 = i10 + 2;
            cArr[i10 + 1] = cArr2[b10 & 15];
            if (i11 < bArr.length - 1) {
                i10 += 3;
                cArr[i13] = AbstractJsonLexerKt.COLON;
            } else {
                i10 = i13;
            }
        }
        return new String(cArr);
    }

    public static final String toStringOrDefault(Object obj, String str) {
        return s.toStringOrDefault(obj, str);
    }

    public static /* synthetic */ String toStringOrDefault$default(Object obj, String str, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return toStringOrDefault(obj, str);
    }

    public static final String toStringOrNull(Object obj) {
        return toStringOrDefault(obj, null);
    }

    public static final String toUnderScore(String value) {
        e0.checkNotNullParameter(value, "value");
        return s.toUnderScore(value);
    }

    public static final int unitToPx(Context context, int i10, float f10) {
        e0.checkNotNullParameter(context, "context");
        return s.unitToPx(context, i10, f10);
    }

    public static final long write(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        e0.checkNotNullParameter(inputStream, "inputStream");
        e0.checkNotNullParameter(outputStream, "outputStream");
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 <= 0) {
                return j10;
            }
            outputStream.write(bArr, 0, i11);
            j10 += i11;
        }
    }

    public static /* synthetic */ long write$default(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) throws IOException {
        if ((i11 & 4) != 0) {
            i10 = 1024;
        }
        return write(inputStream, outputStream, i10);
    }

    public static final byte[] decodeBase64(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        return decodeBase64$default(bytes, 0, 2, (Object) null);
    }

    public static /* synthetic */ byte[] decodeBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64(bArr, i10);
    }

    public static final String decodeBase64ToString(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        return decodeBase64ToString$default(bytes, 0, 2, (Object) null);
    }

    public static /* synthetic */ String decodeBase64ToString$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(str, i10);
    }

    public static final String encodeToStringBase64(byte[] bytes, int i10) {
        e0.checkNotNullParameter(bytes, "bytes");
        return s.encodeToStringBase64(bytes, i10);
    }

    public static final int pxToDp(float f10, float f11) {
        return (int) ((f11 / f10) + 0.5f);
    }

    public static final <K, V> void set(Map<K, V> to2, Map<K, ? extends V> map) {
        e0.checkNotNullParameter(to2, "to");
        s.setSafely(to2, map);
    }

    public static final byte[] decodeBase64(String base64, int i10) {
        e0.checkNotNullParameter(base64, "base64");
        return s.decodeBase64(base64, i10);
    }

    public static final String decodeBase64ToString(byte[] bytes, int i10) {
        e0.checkNotNullParameter(bytes, "bytes");
        return s.decodeBase64ToString(bytes, i10);
    }

    public static final byte[] decodeBase64(byte[] bytes, int i10) {
        e0.checkNotNullParameter(bytes, "bytes");
        return s.decodeBase64(bytes, i10);
    }

    public static final String decodeBase64ToString(String data, int i10) {
        e0.checkNotNullParameter(data, "data");
        return s.decodeBase64ToString(data, i10);
    }
}
