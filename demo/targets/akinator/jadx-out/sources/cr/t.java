package cr;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class t {
    public static Handler createHandlerWithMyOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    public static Date getDate(int i10) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, -i10);
        return calendar.getTime();
    }

    public static byte[] getMD5(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void set(Collection<T> collection, Collection<T> collection2) {
        collection.clear();
        if (collection2 != 0) {
            collection.addAll(collection2);
        }
    }

    public static Boolean toBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }
        return null;
    }

    public static Integer toIntOrNull(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Integer toInteger(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof Float) {
            return Integer.valueOf(((Float) obj).intValue());
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Long toLong(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Float) {
            return Long.valueOf(((Float) obj).longValue());
        }
        if (obj instanceof Double) {
            return Long.valueOf(((Double) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    public static long write(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, V> void set(Map<T, V> map, Map<T, V> map2) {
        map.clear();
        if (map2 != 0) {
            map.putAll(map2);
        }
    }
}
