package com.mbridge.msdk.foundation.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.same.net.utils.b;
import com.mbridge.msdk.foundation.tools.p0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class DownloadMessage<T> {
    private static final String TAG = "DownloadMessage";
    private boolean checkMD5;
    private int downloadRate;
    private DownloadResourceType downloadResourceType;
    private String downloadUrl;
    private Map<String, Object> extraData;
    private String host;
    private boolean isCache;
    private String md5;
    private T object;
    private String resourceUrl;
    private String saveFileName;
    private String saveFilePath;
    private int from = 0;
    private boolean isUseCronet = false;
    private int md5VerifyResult = 0;

    public DownloadMessage(T t10, String str, String str2, int i10, DownloadResourceType downloadResourceType) {
        this.checkMD5 = false;
        this.md5 = "";
        this.object = t10;
        this.downloadUrl = str;
        this.saveFileName = str2;
        this.downloadRate = i10;
        this.downloadResourceType = downloadResourceType;
        try {
            URL url = new URL(str);
            this.resourceUrl = url.getProtocol() + "://" + url.getHost() + url.getPath();
            ILogger logger = GlobalComponent.getInstance().getLogger();
            StringBuilder sb2 = new StringBuilder(" resourceUrl: ");
            sb2.append(this.resourceUrl);
            logger.log(TAG, sb2.toString());
        } catch (MalformedURLException unused) {
            this.resourceUrl = "";
        }
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter(ResourceManager.KEY_MD5CHECK);
            String queryParameter2 = uri.getQueryParameter(ResourceManager.KEY_MD5FILENAME);
            if (!TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            this.checkMD5 = true;
            this.md5 = queryParameter2;
        } catch (Throwable th2) {
            GlobalComponent.getInstance().getLogger().log(TAG, th2.getMessage());
        }
    }

    public void addExtra(String str, Object obj) {
        if (this.extraData == null) {
            this.extraData = new HashMap(4);
        }
        this.extraData.put(str, obj);
    }

    public boolean canUseCronet() {
        return this.isUseCronet;
    }

    public int getDownloadRate() {
        return this.downloadRate;
    }

    public DownloadResourceType getDownloadResourceType() {
        return this.downloadResourceType;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public Object getExtra(String str) {
        Map<String, Object> map = this.extraData;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.extraData.get(str);
    }

    public int getFrom() {
        return this.from;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getMd5VerifyResult() {
        return this.md5VerifyResult;
    }

    public T getObject() {
        return this.object;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getSaveFileName() {
        return this.saveFileName;
    }

    public String getSaveFilePath() {
        return this.saveFilePath;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public boolean isCheckMD5() {
        return this.checkMD5;
    }

    public void setCache(boolean z10) {
        this.isCache = z10;
    }

    public void setCheckMD5(boolean z10) {
        this.checkMD5 = z10;
    }

    public void setDownloadRate(int i10) {
        this.downloadRate = i10;
    }

    public void setFrom(int i10) {
        this.from = i10;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMd5VerifyResult(int i10) {
        this.md5VerifyResult = i10;
    }

    public void setSaveFilePath(String str) {
        this.saveFilePath = str;
    }

    public void setUseCronetDownload(int i10) {
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        try {
            this.isUseCronet = z10;
            if (TextUtils.isEmpty(this.downloadUrl)) {
                return;
            }
            if (TextUtils.isEmpty(this.host)) {
                this.host = new URL(this.downloadUrl).getHost();
            }
            if (this.isUseCronet) {
                b.a(this.host);
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }
}
