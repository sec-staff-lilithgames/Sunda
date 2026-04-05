package cr;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3227g4;
import dq.d0;
import java.io.File;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e {
    public static void clearTempFiles(Context context) {
        new n(C3227g4.D).clean(getExternalDir(context));
    }

    public static boolean deleteFile(File file) {
        try {
            return file.delete();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String generateFileName(String str) throws NoSuchAlgorithmException {
        byte[] md5 = t.getMD5(str.getBytes());
        if (md5 == null) {
            return null;
        }
        return new BigInteger(md5).abs().toString(36);
    }

    public static File getExternalDir(Context context) {
        File externalFilesDir;
        if (kr.b.canUseExternalFilesDir() && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            File file = new File(externalFilesDir, "Rendering");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
        }
        return null;
    }

    public static File getExternalFile(Context context, String str) {
        File externalDir;
        if (TextUtils.isEmpty(str) || (externalDir = getExternalDir(context)) == null) {
            return null;
        }
        return new File(externalDir, str);
    }

    public static File getFileByUrl(Context context, String str) {
        return getExternalFile(context, generateFileName(str));
    }

    public static boolean isEmpty(File file) {
        return file == null || !file.exists() || file.length() <= 0;
    }

    public static boolean isFileOlderThanDate(File file, Date date) {
        return new Date(file.lastModified()).before(date);
    }

    public static boolean startWith(File file, String str) {
        return file.getName().startsWith(str);
    }

    public static Uri toUri(File file) {
        if (file == null) {
            return null;
        }
        try {
            return Uri.fromFile(file);
        } catch (Throwable th2) {
            d0.b(th2);
            return null;
        }
    }
}
