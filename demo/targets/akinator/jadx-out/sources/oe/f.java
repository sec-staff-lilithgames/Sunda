package oe;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f79060v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f79061a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f79062b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f79063c;

    /* renamed from: d, reason: collision with root package name */
    public final String f79064d;

    /* renamed from: e, reason: collision with root package name */
    public String f79065e;

    /* renamed from: f, reason: collision with root package name */
    public ee.l0 f79066f;

    /* renamed from: g, reason: collision with root package name */
    public ee.l0 f79067g;

    /* renamed from: h, reason: collision with root package name */
    public int f79068h;

    /* renamed from: i, reason: collision with root package name */
    public int f79069i;

    /* renamed from: j, reason: collision with root package name */
    public int f79070j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79071k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79072l;

    /* renamed from: m, reason: collision with root package name */
    public int f79073m;

    /* renamed from: n, reason: collision with root package name */
    public int f79074n;

    /* renamed from: o, reason: collision with root package name */
    public int f79075o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f79076p;

    /* renamed from: q, reason: collision with root package name */
    public long f79077q;

    /* renamed from: r, reason: collision with root package name */
    public int f79078r;

    /* renamed from: s, reason: collision with root package name */
    public long f79079s;

    /* renamed from: t, reason: collision with root package name */
    public ee.l0 f79080t;

    /* renamed from: u, reason: collision with root package name */
    public long f79081u;

    public f(boolean z10) {
        this(z10, null);
    }

    public static boolean isAdtsSyncWord(int i10) {
        return (i10 & 65526) == 65520;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    @Override // oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(com.google.android.exoplayer2.util.v0 r20) throws com.google.android.exoplayer2.h2 {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.consume(com.google.android.exoplayer2.util.v0):void");
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79065e = i0Var.getFormatId();
        ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 1);
        this.f79066f = l0VarTrack;
        this.f79080t = l0VarTrack;
        if (!this.f79061a) {
            this.f79067g = new ee.o();
            return;
        }
        i0Var.generateNewId();
        ee.l0 l0VarTrack2 = sVar.track(i0Var.getTrackId(), 5);
        this.f79067g = l0VarTrack2;
        l0VarTrack2.format(new y0().setId(i0Var.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    public long getSampleDurationUs() {
        return this.f79077q;
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79079s = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        this.f79079s = C.TIME_UNSET;
        this.f79072l = false;
        this.f79068h = 0;
        this.f79069i = 0;
        this.f79070j = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public f(boolean z10, String str) {
        this.f79062b = new u0(new byte[7]);
        this.f79063c = new v0(Arrays.copyOf(f79060v, 10));
        this.f79068h = 0;
        this.f79069i = 0;
        this.f79070j = NotificationCompat.FLAG_LOCAL_ONLY;
        this.f79073m = -1;
        this.f79074n = -1;
        this.f79077q = C.TIME_UNSET;
        this.f79079s = C.TIME_UNSET;
        this.f79061a = z10;
        this.f79064d = str;
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
