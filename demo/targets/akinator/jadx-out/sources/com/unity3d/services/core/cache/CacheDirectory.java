package com.unity3d.services.core.cache;

import android.content.Context;
import android.os.Environment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class CacheDirectory {
    private static final String TEST_FILE_NAME = "UnityAdsTest.txt";
    private String _cacheDirName;
    private File _cacheDirectory;
    private boolean _initialized;
    private final boolean _preferExternalStorage;
    private CacheDirectoryType _type;

    public CacheDirectory(String str) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._cacheDirName = str;
        this._preferExternalStorage = true;
    }

    private void createNoMediaFile(File file) {
        try {
            if (new File(file, ".nomedia").createNewFile()) {
                DeviceLog.debug("Successfully created .nomedia file");
            } else {
                DeviceLog.debug("Using existing .nomedia file");
            }
        } catch (Exception e10) {
            DeviceLog.exception("Failed to create .nomedia file", e10);
        }
    }

    public File createCacheDirectory(File file, String str) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    public synchronized File getCacheDirectory(Context context) {
        if (context == null) {
            return null;
        }
        if (this._initialized) {
            return this._cacheDirectory;
        }
        this._initialized = true;
        if (this._preferExternalStorage) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                try {
                    File fileCreateCacheDirectory = createCacheDirectory(context.getExternalCacheDir(), this._cacheDirName);
                    if (testCacheDirectory(fileCreateCacheDirectory)) {
                        createNoMediaFile(fileCreateCacheDirectory);
                        this._cacheDirectory = fileCreateCacheDirectory;
                        this._type = CacheDirectoryType.EXTERNAL;
                        DeviceLog.debug("Unity Ads is using external cache directory: " + fileCreateCacheDirectory.getAbsolutePath());
                        return this._cacheDirectory;
                    }
                } catch (Exception e10) {
                    DeviceLog.exception("Creating external cache directory failed", e10);
                    return null;
                }
            } else {
                DeviceLog.debug("External media not mounted");
            }
        }
        File fileCreateCacheDirectory2 = createCacheDirectory(context.getNoBackupFilesDir(), this._cacheDirName);
        if (!testCacheDirectory(fileCreateCacheDirectory2)) {
            DeviceLog.error("Unity Ads failed to initialize cache directory");
            return null;
        }
        this._cacheDirectory = fileCreateCacheDirectory2;
        this._type = CacheDirectoryType.INTERNAL;
        DeviceLog.debug("Unity Ads is using internal cache directory: " + fileCreateCacheDirectory2.getAbsolutePath());
        return this._cacheDirectory;
    }

    public CacheDirectoryType getType() {
        return this._type;
    }

    public boolean testCacheDirectory(File file) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (file != null && file.isDirectory()) {
            try {
                byte[] bytes = "test".getBytes(C.UTF8_NAME);
                int length = bytes.length;
                byte[] bArr = new byte[length];
                File file2 = new File(file, TEST_FILE_NAME);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        int i10 = fileInputStream.read(bArr, 0, length);
                        fileInputStream.close();
                        if (!file2.delete()) {
                            DeviceLog.debug("Failed to delete testfile " + file2.getAbsoluteFile());
                            return false;
                        }
                        if (i10 != length) {
                            DeviceLog.debug("Read buffer size mismatch");
                            return false;
                        }
                        if (new String(bArr, C.UTF8_NAME).equals("test")) {
                            return true;
                        }
                        DeviceLog.debug("Read buffer content mismatch");
                        return false;
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e10) {
                DeviceLog.debug("Unity Ads exception while testing cache directory " + file.getAbsolutePath() + ": " + e10.getMessage());
            }
        }
        return false;
    }

    public CacheDirectory(String str, boolean z10) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._preferExternalStorage = z10;
        this._cacheDirName = str;
    }
}
