package com.bykv.vk.openvk.preload.geckox.model;

import com.bykv.vk.openvk.preload.a.a.b;
import e3.g;
import io.ktor.http.ContentDisposition;
import j1.o2;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class UpdatePackage {
    private String accessKey;

    @b(a = "channel")
    private String channel;

    @b(a = "channel_index")
    private int channelIndex;

    @b(a = "content")
    private Content content;

    @b(a = "group_name")
    private String groupName;
    private long localVersion;

    @b(a = "package_type")
    private int packageType;

    @b(a = "package_version")
    private long version;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Content {

        @b(a = "package")
        private Package fullPackage;

        @b(a = "patch")
        private Package patch;

        @b(a = "strategies")
        private Strategy strategy;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Package {

        /* renamed from: id, reason: collision with root package name */
        @b(a = "id")
        long f17179id;

        @b(a = ContentDisposition.Parameters.Size)
        long length;

        @b(a = "md5")
        String md5;

        @Deprecated
        String url;

        @b(a = "url_list")
        List<String> urlList;

        public Package() {
        }

        public long getId() {
            return this.f17179id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i10) {
            this.f17179id = i10;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Package{url='");
            sb2.append(this.url);
            sb2.append("', md5='");
            return o2.o(sb2, this.md5, "'}");
        }

        public Package(int i10, List<String> list, String str) {
            this.f17179id = i10;
            this.urlList = list;
            this.md5 = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Strategy {

        @b(a = "del_if_download_failed")
        private boolean deleteIfFail;

        @b(a = "del_old_pkg_before_download")
        private boolean deleteOldPackageBeforeDownload;

        @b(a = "need_unzip")
        private boolean needUnzip;

        public Strategy(int i10) {
            this.deleteIfFail = i10 == 1;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z10) {
            this.deleteIfFail = z10;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z10) {
            this.deleteOldPackageBeforeDownload = z10;
        }

        public void setNeedUnzip(boolean z10) {
            this.needUnzip = z10;
        }
    }

    public UpdatePackage() {
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        return getFullPackage() != null && getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return getPatch() != null && getPatch().getUrlList().size() > 0;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i10) {
        this.channelIndex = i10;
    }

    public void setFullPackage(Package r22) {
        this.content.fullPackage = r22;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j10) {
        this.localVersion = j10;
    }

    public void setPatch(Package r22) {
        this.content.patch = r22;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j10) {
        this.version = j10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdatePackage{version=");
        sb2.append(this.version);
        sb2.append(", channel='");
        sb2.append(this.channel);
        sb2.append("', content=");
        sb2.append(this.content);
        sb2.append(", packageType=");
        return g.m(sb2, this.packageType, AbstractJsonLexerKt.END_OBJ);
    }

    public UpdatePackage(long j10, String str, Package r42, Package r52) {
        this.version = j10;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r42;
        this.content.patch = r52;
    }
}
