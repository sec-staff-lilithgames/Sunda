package hp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collection;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b5 f59099a;

    /* renamed from: b, reason: collision with root package name */
    public final long f59100b;

    /* renamed from: c, reason: collision with root package name */
    public final long f59101c;

    /* renamed from: d, reason: collision with root package name */
    public final long f59102d;

    public c(List<in.b> list, long j10, long j11) {
        this.f59099a = b5.copyOf((Collection) list);
        this.f59100b = j10;
        this.f59101c = j11;
        long j12 = C.TIME_UNSET;
        if (j10 != C.TIME_UNSET && j11 != C.TIME_UNSET) {
            j12 = j10 + j11;
        }
        this.f59102d = j12;
    }
}
