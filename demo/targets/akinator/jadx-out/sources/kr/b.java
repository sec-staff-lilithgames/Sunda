package kr;

import android.content.Context;
import android.net.Uri;
import com.ironsource.C3227g4;
import ir.q;
import ir.s;
import java.io.File;
import java.math.BigInteger;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {
    public static final boolean canUseExternalFilesDir() {
        return q.isExternalMemoryAvailable();
    }

    public static final File createFile(File file, String childPathname) {
        e0.checkNotNullParameter(childPathname, "childPathname");
        return c.createFile(file, childPathname);
    }

    public static final File createFileByUrl(File file, String url) {
        e0.checkNotNullParameter(url, "url");
        return c.createFileByUrl(file, url);
    }

    public static final File createSubDir(File file, String childPathname) {
        e0.checkNotNullParameter(childPathname, "childPathname");
        return c.createSubDir(file, childPathname);
    }

    public static final File createTempFile(File file) {
        return createTempFile(file, C3227g4.D);
    }

    public static /* synthetic */ File createTempFile$default(File file, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = C3227g4.D;
        }
        return createTempFile(file, str);
    }

    public static final boolean deleteFile(File file) {
        return c.deleteFile(file);
    }

    public static final void deleteFiles(File dir, String filePrefix) {
        e0.checkNotNullParameter(dir, "dir");
        e0.checkNotNullParameter(filePrefix, "filePrefix");
        c.deleteFiles(dir, filePrefix);
    }

    public static final void deleteTempFiles(File dir) {
        e0.checkNotNullParameter(dir, "dir");
        c.deleteTempFiles(dir);
    }

    public static final String generateFileName(String url) {
        e0.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrApplyMD5 = s.applyMD5(bytes);
        if (bArrApplyMD5 == null) {
            return null;
        }
        return new BigInteger(bArrApplyMD5).abs().toString(36);
    }

    public static final File getExternalDir(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getExternalDir(context);
    }

    public static final File getExternalDirDirty(Context context) {
        e0.checkNotNullParameter(context, "context");
        return c.getExternalDirDirty(context);
    }

    public static final boolean hasContent(File file) {
        return c.hasContent(file);
    }

    public static final String readSafely(File file) {
        e0.checkNotNullParameter(file, "file");
        return c.readSafely(file);
    }

    public static final boolean renameToSafely(File from, File to2) {
        e0.checkNotNullParameter(from, "from");
        e0.checkNotNullParameter(to2, "to");
        return c.renameToSafely(from, to2);
    }

    public static final boolean startWith(File file, String prefix) {
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(prefix, "prefix");
        return c.startWith(file, prefix);
    }

    public static final Uri toUri(File file) {
        e0.checkNotNullParameter(file, "file");
        return c.toUri(file);
    }

    public static final Uri toUriSafely(File file) {
        return c.toUriSafely(file);
    }

    public static final boolean writeSafely(File file, String text) {
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(text, "text");
        return c.writeSafely(file, text);
    }

    public static final File createTempFile(File file, String tempFilePrefix) {
        e0.checkNotNullParameter(tempFilePrefix, "tempFilePrefix");
        return c.createTempFile(file, tempFilePrefix);
    }
}
