package so;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f86056a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86057b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f86058a;

        /* renamed from: b, reason: collision with root package name */
        public final long f86059b;

        /* renamed from: c, reason: collision with root package name */
        public final long f86060c;

        public a(String str, String str2, long j10, long j11) {
            this.f86058a = str;
            this.f86059b = j10;
            this.f86060c = j11;
        }
    }

    public c(long j10, List<a> list) {
        this.f86056a = j10;
        this.f86057b = list;
    }

    public zo.a getMotionPhotoMetadata(long j10) {
        long j11;
        List list = this.f86057b;
        if (list.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = (a) list.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(aVar.f86058a) | z10;
            if (size == 0) {
                j12 -= aVar.f86060c;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f86059b;
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
        return new zo.a(j13, j14, this.f86056a, j15, j16);
    }
}
