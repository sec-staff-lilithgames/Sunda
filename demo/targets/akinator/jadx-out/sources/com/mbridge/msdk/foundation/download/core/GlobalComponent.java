package com.mbridge.msdk.foundation.download.core;

import android.content.Context;
import android.database.Cursor;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.database.DatabaseHelper;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.internal.c;
import com.mbridge.msdk.thrid.okhttp.l;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class GlobalComponent {
    private static volatile GlobalComponent INSTANCE;
    private MBDownloadConfig config;
    private Context context;
    private IDatabaseHelper databaseHelper;
    private ILogger logger;
    private volatile t okHttpClient;
    private int byteBufferSize = 4096;
    private String databaseTableName = DownloadModel.TABLE_NAME;

    private GlobalComponent() {
    }

    public static GlobalComponent getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (GlobalComponent.class) {
                try {
                    if (Objects.isNull(INSTANCE)) {
                        INSTANCE = new GlobalComponent();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public int getByteBufferSize() {
        return this.byteBufferSize;
    }

    public Context getContext() {
        return this.context;
    }

    public IDatabaseHelper getDatabaseHelper() {
        return this.databaseHelper;
    }

    public String getDatabaseTableName() {
        return this.databaseTableName;
    }

    public ILogger getLogger() {
        if (this.logger == null) {
            this.logger = new ILogger() { // from class: com.mbridge.msdk.foundation.download.core.GlobalComponent.1
                @Override // com.mbridge.msdk.foundation.download.utils.ILogger
                public void log(String str, String str2) {
                    p0.a(str, str2);
                }

                @Override // com.mbridge.msdk.foundation.download.utils.ILogger
                public void log(String str, Exception exc) {
                    p0.a(str, exc.getMessage());
                }
            };
        }
        return this.logger;
    }

    public t getOkHttpClient() {
        if (this.okHttpClient == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(u.HTTP_1_1);
            l lVar = new l(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), c.a("OkHttp Dispatcher", false)));
            lVar.a(this.config.getMaxRequests());
            lVar.b(this.config.getMaxRequestsPerHost());
            t.b bVar = new t.b();
            long defaultConnectTimeout = this.config.getDefaultConnectTimeout();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.okHttpClient = bVar.b(defaultConnectTimeout, timeUnit).d(this.config.getDefaultConnectTimeout(), timeUnit).e(this.config.getDefaultWriteTimeout(), timeUnit).a(lVar).c(this.config.getDefaultPingInterval(), timeUnit).a(true).a(new h(32, 5L, TimeUnit.MINUTES)).a(arrayList).a();
        }
        return this.okHttpClient;
    }

    public void initialize(Context context, MBDownloadConfig mBDownloadConfig) {
        this.context = context.getApplicationContext();
        this.logger = mBDownloadConfig.getLogger();
        this.config = mBDownloadConfig;
        if (mBDownloadConfig.getDatabaseHandler() == null || mBDownloadConfig.getDatabaseHelper() == null) {
            this.databaseHelper = new IDatabaseHelper() { // from class: com.mbridge.msdk.foundation.download.core.GlobalComponent.2
                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public List<DownloadModel> findAll() {
                    return null;
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public List<DownloadModel> getUnwantedModels(long j10) {
                    return null;
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public Cursor rawQuery(String str, String[] strArr) {
                    return null;
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void remove(String str) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void remove(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void clear() {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void insert(DownloadModel downloadModel) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void findByDownloadUrl(String str, IDatabaseHelper.IDatabaseListener iDatabaseListener) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void update(DownloadModel downloadModel, String str) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void find(String str, String str2, IDatabaseHelper.IDatabaseListener iDatabaseListener) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void updateProgress(String str, String str2, DownloadModel downloadModel) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void updateUnzipResource(String str, String str2, long j10) {
                }
            };
        } else {
            this.databaseHelper = new DatabaseHelper(context, mBDownloadConfig.getDatabaseHandler(), mBDownloadConfig.getDatabaseHelper());
        }
    }
}
