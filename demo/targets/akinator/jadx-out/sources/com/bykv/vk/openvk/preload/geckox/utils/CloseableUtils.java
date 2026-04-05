package com.bykv.vk.openvk.preload.geckox.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CloseableUtils {
    public static boolean close(Closeable closeable) throws IOException {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException e10) {
            GeckoLogger.e("gecko-debug-tag", "close:", e10);
            return false;
        }
    }

    public static boolean close(Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception e10) {
            GeckoLogger.e("gecko-debug-tag", "close:", e10);
            return false;
        }
    }

    public static boolean close(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            sQLiteDatabase.close();
            return true;
        } catch (Exception e10) {
            GeckoLogger.e("gecko-debug-tag", "close:", e10);
            return false;
        }
    }
}
