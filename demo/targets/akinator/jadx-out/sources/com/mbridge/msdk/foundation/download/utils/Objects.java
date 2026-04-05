package com.mbridge.msdk.foundation.download.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Objects {
    public static void closeInputStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Exception e10) {
            p0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    public static void closeOutputStream(DownloadFileOutputStream downloadFileOutputStream) {
        if (downloadFileOutputStream == null) {
            return;
        }
        try {
            downloadFileOutputStream.close();
        } catch (Exception e10) {
            p0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    public static void closeResponse(y yVar) {
        if (yVar == null) {
            return;
        }
        try {
            if (yVar.d() != null) {
                yVar.d().close();
            }
            yVar.close();
        } catch (Exception e10) {
            p0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    public static void closeResponseBody(z zVar) {
        if (zVar == null) {
            return;
        }
        try {
            zVar.close();
        } catch (Exception e10) {
            p0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    private static boolean doubleCheckExists(File file, final String str, final String str2) {
        File[] fileArrListFiles;
        try {
            fileArrListFiles = file.getParentFile().listFiles(new FileFilter() { // from class: com.mbridge.msdk.foundation.download.utils.Objects.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return TextUtils.equals(file2.getAbsolutePath(), str + str2);
                }
            });
        } catch (Exception e10) {
            p0.a("doubleCheckExists", e10.getLocalizedMessage());
            fileArrListFiles = null;
        }
        return fileArrListFiles != null && file.length() > 0;
    }

    public static boolean exists(File file, String str, String str2) {
        if (file == null || TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zExists = file.exists();
        return !zExists ? doubleCheckExists(file, str, str2) : zExists;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNotNull(Object obj) {
        return !isNull(obj);
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }
}
