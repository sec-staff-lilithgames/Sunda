package com.applovin.shadow.okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FileMetadata {
    private final Long createdAtMillis;
    private final Map<KClass<?>, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final Path symlinkTarget;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z10, boolean z11, Path path, Long l9, Long l10, Long l11, Long l12, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fileMetadata.isRegularFile;
        }
        if ((i10 & 2) != 0) {
            z11 = fileMetadata.isDirectory;
        }
        if ((i10 & 4) != 0) {
            path = fileMetadata.symlinkTarget;
        }
        if ((i10 & 8) != 0) {
            l9 = fileMetadata.size;
        }
        if ((i10 & 16) != 0) {
            l10 = fileMetadata.createdAtMillis;
        }
        if ((i10 & 32) != 0) {
            l11 = fileMetadata.lastModifiedAtMillis;
        }
        if ((i10 & 64) != 0) {
            l12 = fileMetadata.lastAccessedAtMillis;
        }
        if ((i10 & 128) != 0) {
            map = fileMetadata.extras;
        }
        Long l13 = l12;
        Map map2 = map;
        Long l14 = l10;
        Long l15 = l11;
        return fileMetadata.copy(z10, z11, path, l9, l14, l15, l13, map2);
    }

    public final FileMetadata copy(boolean z10, boolean z11, Path path, Long l9, Long l10, Long l11, Long l12, Map<KClass<?>, ? extends Object> extras) {
        e0.checkNotNullParameter(extras, "extras");
        return new FileMetadata(z10, z11, path, l9, l10, l11, l12, extras);
    }

    public final <T> T extra(KClass<? extends T> type) {
        e0.checkNotNullParameter(type, "type");
        Object obj = this.extras.get(type);
        if (obj == null) {
            return null;
        }
        return (T) KClasses.cast(type, obj);
    }

    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final Map<KClass<?>, Object> getExtras() {
        return this.extras;
    }

    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return y0.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public FileMetadata(boolean z10, boolean z11, Path path, Long l9, Long l10, Long l11, Long l12, Map<KClass<?>, ? extends Object> extras) {
        e0.checkNotNullParameter(extras, "extras");
        this.isRegularFile = z10;
        this.isDirectory = z11;
        this.symlinkTarget = path;
        this.size = l9;
        this.createdAtMillis = l10;
        this.lastModifiedAtMillis = l11;
        this.lastAccessedAtMillis = l12;
        this.extras = p1.toMap(extras);
    }

    public /* synthetic */ FileMetadata(boolean z10, boolean z11, Path path, Long l9, Long l10, Long l11, Long l12, Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : path, (i10 & 8) != 0 ? null : l9, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? null : l11, (i10 & 64) != 0 ? null : l12, (i10 & 128) != 0 ? p1.emptyMap() : map);
    }
}
