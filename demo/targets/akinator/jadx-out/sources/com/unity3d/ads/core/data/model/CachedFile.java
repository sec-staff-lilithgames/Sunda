package com.unity3d.ads.core.data.model;

import e3.g;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final String objectId;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String objectId, String url, String name, File file, String str, long j10, String protocol, int i10) {
        e0.checkNotNullParameter(objectId, "objectId");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(protocol, "protocol");
        this.objectId = objectId;
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j10;
        this.protocol = protocol;
        this.priority = i10;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, String str3, File file, String str4, long j10, String str5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cachedFile.objectId;
        }
        if ((i11 & 2) != 0) {
            str2 = cachedFile.url;
        }
        if ((i11 & 4) != 0) {
            str3 = cachedFile.name;
        }
        if ((i11 & 8) != 0) {
            file = cachedFile.file;
        }
        if ((i11 & 16) != 0) {
            str4 = cachedFile.extension;
        }
        if ((i11 & 32) != 0) {
            j10 = cachedFile.contentLength;
        }
        if ((i11 & 64) != 0) {
            str5 = cachedFile.protocol;
        }
        if ((i11 & 128) != 0) {
            i10 = cachedFile.priority;
        }
        long j11 = j10;
        File file2 = file;
        String str6 = str4;
        String str7 = str3;
        return cachedFile.copy(str, str2, str7, file2, str6, j11, str5, i10);
    }

    public final String component1() {
        return this.objectId;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final File component4() {
        return this.file;
    }

    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    public final CachedFile copy(String objectId, String url, String name, File file, String str, long j10, String protocol, int i10) {
        e0.checkNotNullParameter(objectId, "objectId");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(protocol, "protocol");
        return new CachedFile(objectId, url, name, file, str, j10, protocol, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return e0.areEqual(this.objectId, cachedFile.objectId) && e0.areEqual(this.url, cachedFile.url) && e0.areEqual(this.name, cachedFile.name) && e0.areEqual(this.file, cachedFile.file) && e0.areEqual(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && e0.areEqual(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iE = o2.e(o2.e(this.objectId.hashCode() * 31, 31, this.url), 31, this.name);
        File file = this.file;
        int iHashCode = (iE + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return Integer.hashCode(this.priority) + o2.e(o2.d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.contentLength), 31, this.protocol);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CachedFile(objectId=");
        sb2.append(this.objectId);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", file=");
        sb2.append(this.file);
        sb2.append(", extension=");
        sb2.append(this.extension);
        sb2.append(", contentLength=");
        sb2.append(this.contentLength);
        sb2.append(", protocol=");
        sb2.append(this.protocol);
        sb2.append(", priority=");
        return g.m(sb2, this.priority, ')');
    }

    public /* synthetic */ CachedFile(String str, String str2, String str3, File file, String str4, long j10, String str5, int i10, int i11, u uVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : file, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? -1L : j10, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? Integer.MAX_VALUE : i10);
    }
}
