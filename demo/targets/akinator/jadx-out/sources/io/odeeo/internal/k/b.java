package io.odeeo.internal.k;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f64416a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f64417b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f64418a;

        /* renamed from: b, reason: collision with root package name */
        public final String f64419b;

        /* renamed from: c, reason: collision with root package name */
        public final long f64420c;

        /* renamed from: d, reason: collision with root package name */
        public final long f64421d;

        public a(String str, String str2, long j10, long j11) {
            this.f64418a = str;
            this.f64419b = str2;
            this.f64420c = j10;
            this.f64421d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f64416a = j10;
        this.f64417b = list;
    }

    public io.odeeo.internal.y.b getMotionPhotoMetadata(long j10) {
        long j11;
        if (this.f64417b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f64417b.size() - 1; size >= 0; size--) {
            a aVar = this.f64417b.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(aVar.f64418a) | z10;
            if (size == 0) {
                j12 -= aVar.f64421d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f64420c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new io.odeeo.internal.y.b(j13, j14, this.f64416a, j15, j16);
    }
}
