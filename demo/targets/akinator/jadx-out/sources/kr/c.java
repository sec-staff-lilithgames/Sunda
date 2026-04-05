package kr;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.ironsource.C3227g4;
import gv.o;
import java.io.File;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c {
    public static final File createFile(File file, String childPathname) {
        e0.checkNotNullParameter(childPathname, "childPathname");
        return new File(file, childPathname);
    }

    public static final File createFileByUrl(File file, String url) {
        e0.checkNotNullParameter(url, "url");
        String strGenerateFileName = b.generateFileName(url);
        if (strGenerateFileName != null) {
            return createFile(file, strGenerateFileName);
        }
        return null;
    }

    public static final File createSubDir(File file, String childPathname) {
        e0.checkNotNullParameter(childPathname, "childPathname");
        File fileCreateFile = createFile(file, childPathname);
        if (existsSafely(fileCreateFile) || fileCreateFile.mkdirs()) {
            return fileCreateFile;
        }
        return null;
    }

    public static final File createTempFile(File file, String tempFilePrefix) {
        e0.checkNotNullParameter(tempFilePrefix, "tempFilePrefix");
        return createFile(file, tempFilePrefix + System.nanoTime());
    }

    public static /* synthetic */ File createTempFile$default(File file, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = C3227g4.D;
        }
        return createTempFile(file, str);
    }

    public static final boolean deleteFile(File file) {
        Boolean boolValueOf;
        File[] fileArrListFiles;
        if (file == null || !existsSafely(file)) {
            return true;
        }
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                e0.checkNotNullExpressionValue(fileArrListFiles, "listFiles()");
                for (File file2 : fileArrListFiles) {
                    b.deleteFile(file2);
                }
            }
            boolValueOf = Boolean.valueOf(file.delete());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return e0.areEqual(boolValueOf, Boolean.TRUE);
    }

    public static final void deleteFiles(File file, String filePrefix) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(filePrefix, "filePrefix");
        new d(filePrefix).clean(file);
    }

    public static final void deleteTempFiles(File file) {
        e0.checkNotNullParameter(file, "<this>");
        deleteFiles(file, C3227g4.D);
    }

    public static final boolean existsSafely(File file) {
        Boolean boolValueOf;
        e0.checkNotNullParameter(file, "<this>");
        try {
            boolValueOf = Boolean.valueOf(file.exists());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return e0.areEqual(boolValueOf, Boolean.TRUE);
    }

    public static final File getExternalDir(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        if (b.canUseExternalFilesDir()) {
            return context.getExternalFilesDir(null);
        }
        return null;
    }

    public static final boolean hasContent(File file) {
        return file != null && existsSafely(file) && file.length() > 0;
    }

    public static final String readSafely(File file) {
        e0.checkNotNullParameter(file, "<this>");
        try {
            return o.readText$default(file, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean renameToSafely(File file, File to2) {
        Boolean boolValueOf;
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(to2, "to");
        try {
            boolValueOf = Boolean.valueOf(file.renameTo(to2));
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return e0.areEqual(boolValueOf, Boolean.TRUE);
    }

    public static final boolean startWith(File file, String prefix) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(prefix, "prefix");
        String name = file.getName();
        e0.checkNotNullExpressionValue(name, "name");
        return k0.startsWith$default(name, prefix, false, 2, null);
    }

    public static final Uri toUri(File file) {
        e0.checkNotNullParameter(file, "<this>");
        Uri uriFromFile = Uri.fromFile(file);
        e0.checkNotNullExpressionValue(uriFromFile, "fromFile(this)");
        return uriFromFile;
    }

    public static final Uri toUriSafely(File file) {
        if (file == null) {
            return null;
        }
        try {
            return toUri(file);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean writeSafely(File file, String text) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(text, "text");
        Boolean bool = null;
        try {
            o.writeText$default(file, text, null, 2, null);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
        }
        return e0.areEqual(bool, Boolean.TRUE);
    }

    public static final File getExternalDirDirty(Context context) {
        e0.checkNotNullParameter(context, PtLatqAYjEFT.mEWxeoZvHcyNX);
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            e0.checkNotNullExpressionValue(externalStorageDirectory, "Environment.getExternalS…irectory() ?: return null");
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }
}
