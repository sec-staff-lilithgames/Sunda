package qw;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f83603a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83605c;

    /* renamed from: d, reason: collision with root package name */
    public final long f83606d;

    /* renamed from: e, reason: collision with root package name */
    public final long f83607e;

    /* renamed from: f, reason: collision with root package name */
    public final long f83608f;

    /* renamed from: g, reason: collision with root package name */
    public final int f83609g;

    /* renamed from: h, reason: collision with root package name */
    public final long f83610h;

    /* renamed from: i, reason: collision with root package name */
    public final int f83611i;

    /* renamed from: j, reason: collision with root package name */
    public final int f83612j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f83613k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f83614l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f83615m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f83616n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f83617o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f83618p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f83619q;

    public q(n0 canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l9, Long l10, Long l11, Integer num, Integer num2, Integer num3) {
        e0.checkNotNullParameter(canonicalPath, "canonicalPath");
        e0.checkNotNullParameter(comment, "comment");
        this.f83603a = canonicalPath;
        this.f83604b = z10;
        this.f83605c = comment;
        this.f83606d = j10;
        this.f83607e = j11;
        this.f83608f = j12;
        this.f83609g = i10;
        this.f83610h = j13;
        this.f83611i = i11;
        this.f83612j = i12;
        this.f83613k = l9;
        this.f83614l = l10;
        this.f83615m = l11;
        this.f83616n = num;
        this.f83617o = num2;
        this.f83618p = num3;
        this.f83619q = new ArrayList();
    }

    public final q copy$okio(Integer num, Integer num2, Integer num3) {
        return new q(this.f83603a, this.f83604b, this.f83605c, this.f83606d, this.f83607e, this.f83608f, this.f83609g, this.f83610h, this.f83611i, this.f83612j, this.f83613k, this.f83614l, this.f83615m, num, num2, num3);
    }

    public final n0 getCanonicalPath() {
        return this.f83603a;
    }

    public final List<n0> getChildren() {
        return this.f83619q;
    }

    public final String getComment() {
        return this.f83605c;
    }

    public final long getCompressedSize() {
        return this.f83607e;
    }

    public final int getCompressionMethod() {
        return this.f83609g;
    }

    public final long getCrc() {
        return this.f83606d;
    }

    public final Long getCreatedAtMillis$okio() {
        Long l9 = this.f83615m;
        if (l9 != null) {
            return Long.valueOf(u.filetimeToEpochMillis(l9.longValue()));
        }
        if (this.f83618p != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final int getDosLastModifiedAtDate() {
        return this.f83611i;
    }

    public final int getDosLastModifiedAtTime() {
        return this.f83612j;
    }

    public final Integer getExtendedCreatedAtSeconds() {
        return this.f83618p;
    }

    public final Integer getExtendedLastAccessedAtSeconds() {
        return this.f83617o;
    }

    public final Integer getExtendedLastModifiedAtSeconds() {
        return this.f83616n;
    }

    public final Long getLastAccessedAtMillis$okio() {
        Long l9 = this.f83614l;
        if (l9 != null) {
            return Long.valueOf(u.filetimeToEpochMillis(l9.longValue()));
        }
        if (this.f83617o != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final Long getLastModifiedAtMillis$okio() {
        Long l9 = this.f83613k;
        if (l9 != null) {
            return Long.valueOf(u.filetimeToEpochMillis(l9.longValue()));
        }
        if (this.f83616n != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i10 = this.f83612j;
        if (i10 != -1) {
            return u.dosDateTimeToEpochMillis(this.f83611i, i10);
        }
        return null;
    }

    public final Long getNtfsCreatedAtFiletime() {
        return this.f83615m;
    }

    public final Long getNtfsLastAccessedAtFiletime() {
        return this.f83614l;
    }

    public final Long getNtfsLastModifiedAtFiletime() {
        return this.f83613k;
    }

    public final long getOffset() {
        return this.f83610h;
    }

    public final long getSize() {
        return this.f83608f;
    }

    public final boolean isDirectory() {
        return this.f83604b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(n0 n0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l9, Long l10, Long l11, Integer num, Integer num2, Integer num3, int i13, kotlin.jvm.internal.u uVar) {
        Integer num4;
        boolean z11;
        Integer num5;
        boolean z12 = (i13 & 2) != 0 ? false : z10;
        String str2 = (i13 & 4) != 0 ? "" : str;
        long j14 = (i13 & 8) != 0 ? -1L : j10;
        long j15 = (i13 & 16) != 0 ? -1L : j11;
        long j16 = (i13 & 32) != 0 ? -1L : j12;
        int i14 = (i13 & 64) != 0 ? -1 : i10;
        long j17 = (i13 & 128) == 0 ? j13 : -1L;
        int i15 = (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? -1 : i11;
        int i16 = (i13 & 512) == 0 ? i12 : -1;
        Long l12 = (i13 & 1024) != 0 ? null : l9;
        Long l13 = (i13 & 2048) != 0 ? null : l10;
        boolean z13 = z12;
        Long l14 = (i13 & 4096) != 0 ? null : l11;
        Integer num6 = (i13 & Segment.SIZE) != 0 ? null : num;
        Integer num7 = (i13 & 16384) != 0 ? null : num2;
        if ((i13 & 32768) != 0) {
            num4 = num6;
            z11 = z13;
            num5 = null;
        } else {
            num4 = num6;
            z11 = z13;
            num5 = num3;
        }
        this(n0Var, z11, str2, j14, j15, j16, i14, j17, i15, i16, l12, l13, l14, num4, num7, num5);
    }
}
