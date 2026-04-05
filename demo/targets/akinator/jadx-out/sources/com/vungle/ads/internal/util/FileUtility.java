package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.android.gms.internal.ads.a;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.vungle.ads.AssetFailedToDeleteError;
import gv.o;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import sv.g;
import uu.p0;
import xv.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FileUtility {
    private static final String TAG = "FileUtility";
    public static final FileUtility INSTANCE = new FileUtility();
    private static ObjectInputStreamProvider objectInputStreamProvider = new a(17);
    private static final List<Class<?>> allowedClasses = p0.listOf((Object[]) new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ObjectInputStreamProvider {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private FileUtility() {
    }

    public static final void delete(File file, Set<String> set) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            Logger.Companion.d(TAG, "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        deleteContents(file, set);
                    }
                    if (set != null && set.contains(file.getName())) {
                        Logger.Companion.d(TAG, "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    Logger.Companion.d(TAG, "Failed to delete file: " + file);
                }
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Failed to delete file: " + e10.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    public static final void deleteAndLogIfFailed(File file) {
        e0.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else {
                if (file.delete()) {
                    return;
                }
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e10) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e10.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static final void deleteContents(File folder, Set<String> set) {
        e0.checkNotNullParameter(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file, set);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("|  ");
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(FileUtility fileUtility, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileUtility.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m3668objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i10, StringBuilder sb2) {
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable, java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.vungle.ads.internal.util.FileUtility] */
    public static final void writeSerializable(File file, Serializable serializable) throws Throwable {
        FileOutputStream fileOutputStream;
        ?? objectOutputStream;
        e0.checkNotNullParameter(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException e10) {
            e = e10;
            objectOutputStream = 0;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e11) {
            e = e11;
            objectOutputStream = 0;
        } catch (Throwable th3) {
            th = th3;
            FileUtility fileUtility = INSTANCE;
            fileUtility.closeQuietly(fileOutputStream2);
            fileUtility.closeQuietly(fileOutputStream);
            throw th;
        }
        try {
            objectOutputStream.writeObject(serializable);
            objectOutputStream.reset();
            ?? r42 = INSTANCE;
            r42.closeQuietly(objectOutputStream);
            r42.closeQuietly(fileOutputStream);
        } catch (IOException e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            objectOutputStream = objectOutputStream;
            try {
                Logger.Companion.e(TAG, String.valueOf(e.getMessage()));
                ?? r43 = INSTANCE;
                r43.closeQuietly(objectOutputStream);
                r43.closeQuietly(fileOutputStream2);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
                fileOutputStream2 = objectOutputStream;
                FileUtility fileUtility2 = INSTANCE;
                fileUtility2.closeQuietly(fileOutputStream2);
                fileUtility2.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream2 = objectOutputStream;
            FileUtility fileUtility22 = INSTANCE;
            fileUtility22.closeQuietly(fileOutputStream2);
            fileUtility22.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public final void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final boolean isValidUrl(String str) {
        return (str == null || str.length() == 0 || g0.f93628j.parse(str) == null) ? false : true;
    }

    public final String readString(File file) {
        e0.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return o.readText$default(file, null, 1, null);
        } catch (IOException e10) {
            Logger.Companion.e(TAG, "IOException: " + e10.getMessage());
            return null;
        } catch (Exception e11) {
            Logger.Companion.e(TAG, "cannot read string " + e11.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(ObjectInputStreamProvider objectInputStreamProvider2) {
        e0.checkNotNullParameter(objectInputStreamProvider2, "<set-?>");
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public final long size(File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(File file, String str) {
        e0.checkNotNullParameter(file, "file");
        if (str == null) {
            return;
        }
        try {
            o.writeText(file, str, g.f86134b);
        } catch (IOException e10) {
            Logger.Companion.e(TAG, String.valueOf(e10.getMessage()));
        }
    }

    private final void printDirectoryTree(File file, int i10, StringBuilder sb2) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append("/\n");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i10 + 1, sb2);
            } else {
                e0.checkNotNullExpressionValue(file2, "file");
                printFile(file2, i10 + 1, sb2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0030: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:48), block:B:11:0x0030 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.vungle.ads.internal.util.FileUtility$ObjectInputStreamProvider] */
    public static final <T> T readSerializable(File file) throws Throwable {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        Closeable closeable2;
        e0.checkNotNullParameter(file, PtLatqAYjEFT.OJVt);
        ?? Exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (Exists != 0) {
                try {
                    Exists = new FileInputStream(file);
                } catch (IOException e10) {
                    e = e10;
                    Exists = 0;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    Exists = 0;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e12) {
                    e = e12;
                    Exists = 0;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    Exists = 0;
                }
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                    try {
                        T t10 = (T) objectInputStreamProvideObjectInputStream.readObject();
                        ?? r02 = INSTANCE;
                        r02.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r02.closeQuietly(Exists);
                        return t10;
                    } catch (IOException e13) {
                        e = e13;
                        Logger.Companion.e(TAG, "IOException: " + e.getMessage());
                        closeable2 = Exists;
                        FileUtility fileUtility = INSTANCE;
                        fileUtility.closeQuietly(objectInputStreamProvideObjectInputStream);
                        fileUtility.closeQuietly(closeable2);
                        try {
                            delete$default(file, null, 2, null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e14) {
                        e = e14;
                        Logger.Companion.e(TAG, "ClassNotFoundException: " + e.getMessage());
                        closeable2 = Exists;
                        FileUtility fileUtility2 = INSTANCE;
                        fileUtility2.closeQuietly(objectInputStreamProvideObjectInputStream);
                        fileUtility2.closeQuietly(closeable2);
                        delete$default(file, null, 2, null);
                        return null;
                    } catch (Exception e15) {
                        e = e15;
                        Logger.Companion.e(TAG, "cannot read serializable " + e.getMessage());
                        closeable2 = Exists;
                        FileUtility fileUtility22 = INSTANCE;
                        fileUtility22.closeQuietly(objectInputStreamProvideObjectInputStream);
                        fileUtility22.closeQuietly(closeable2);
                        delete$default(file, null, 2, null);
                        return null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e17) {
                    e = e17;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e18) {
                    e = e18;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    ?? r03 = INSTANCE;
                    r03.closeQuietly(closeable3);
                    r03.closeQuietly(Exists);
                    throw th;
                }
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            closeable3 = closeable;
        }
    }

    public final String guessFileName(String url, String str) {
        e0.checkNotNullParameter(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, str);
        e0.checkNotNullExpressionValue(strGuessFileName, PcrIk.IJCCvsOLSPCfR);
        return strGuessFileName;
    }
}
