package hp;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f59125c = new r(C.TIME_UNSET, false);

    /* renamed from: a, reason: collision with root package name */
    public final long f59126a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59127b;

    public r(long j10, boolean z10) {
        this.f59126a = j10;
        this.f59127b = z10;
    }

    public static r allCues() {
        return f59125c;
    }

    public static r cuesAfterThenRemainingCuesBefore(long j10) {
        return new r(j10, true);
    }

    public static r onlyCuesAfter(long j10) {
        return new r(j10, false);
    }
}
