package com.mbridge.msdk.foundation.download.database;

import android.database.Cursor;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface IDatabaseHelper {
    public static final String TAG = "DatabaseHelper";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface IDatabaseListener {
        void onDatabase(DownloadModel downloadModel);
    }

    void clear();

    void find(String str, String str2, IDatabaseListener iDatabaseListener);

    List<DownloadModel> findAll();

    void findByDownloadUrl(String str, IDatabaseListener iDatabaseListener);

    List<DownloadModel> getUnwantedModels(long j10);

    void insert(DownloadModel downloadModel);

    Cursor rawQuery(String str, String[] strArr);

    void remove(String str);

    void remove(String str, String str2);

    void update(DownloadModel downloadModel, String str);

    void updateProgress(String str, String str2, DownloadModel downloadModel);

    void updateUnzipResource(String str, String str2, long j10);
}
