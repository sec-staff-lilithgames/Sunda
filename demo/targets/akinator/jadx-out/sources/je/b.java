package je;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f69516a;

    /* renamed from: b, reason: collision with root package name */
    public final List f69517b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f69518a;

        /* renamed from: b, reason: collision with root package name */
        public final long f69519b;

        /* renamed from: c, reason: collision with root package name */
        public final long f69520c;

        public a(String str, String str2, long j10, long j11) {
            this.f69518a = str;
            this.f69519b = j10;
            this.f69520c = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f69516a = j10;
        this.f69517b = list;
    }

    public MotionPhotoMetadata getMotionPhotoMetadata(long j10) {
        long j11;
        List list = this.f69517b;
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
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(aVar.f69518a) | z10;
            if (size == 0) {
                j12 -= aVar.f69520c;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f69519b;
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
        return new MotionPhotoMetadata(j13, j14, this.f69516a, j15, j16);
    }
}
