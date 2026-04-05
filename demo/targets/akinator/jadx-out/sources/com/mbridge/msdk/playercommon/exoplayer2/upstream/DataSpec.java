package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import a.b;
import android.net.Uri;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHING_UNKNOWN_LENGTH = 2;
    public static final int FLAG_ALLOW_GZIP = 1;
    public final long absoluteStreamPosition;
    public final int flags;
    public final String key;
    public final long length;
    public final long position;
    public final byte[] postBody;
    public final Uri uri;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DataSpec(Uri uri) {
        this(uri, 0);
    }

    public boolean isFlagSet(int i10) {
        return (this.flags & i10) == i10;
    }

    public DataSpec subrange(long j10) {
        long j11 = this.length;
        return subrange(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(this.uri);
        sb2.append(", ");
        sb2.append(Arrays.toString(this.postBody));
        sb2.append(", ");
        sb2.append(this.absoluteStreamPosition);
        sb2.append(", ");
        sb2.append(this.position);
        sb2.append(", ");
        sb2.append(this.length);
        sb2.append(", ");
        sb2.append(this.key);
        sb2.append(", ");
        return b.f(this.flags, C3191e4.i.f36531e, sb2);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.postBody, this.absoluteStreamPosition, this.position, this.length, this.key, this.flags);
    }

    public DataSpec(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    public DataSpec subrange(long j10, long j11) {
        return (j10 == 0 && this.length == j11) ? this : new DataSpec(this.uri, this.postBody, this.absoluteStreamPosition + j10, this.position + j10, j11, this.key, this.flags);
    }

    public DataSpec(Uri uri, long j10, long j11, String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    public DataSpec(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    public DataSpec(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public DataSpec(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        Assertions.checkArgument(j10 >= 0);
        Assertions.checkArgument(j11 >= 0);
        Assertions.checkArgument(j12 > 0 || j12 == -1);
        this.uri = uri;
        this.postBody = bArr;
        this.absoluteStreamPosition = j10;
        this.position = j11;
        this.length = j12;
        this.key = str;
        this.flags = i10;
    }
}
