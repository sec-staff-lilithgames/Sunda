package rp;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements j {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f84605x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84606a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l0 f84607b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84608c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84609d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84610e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84611f;

    /* renamed from: g, reason: collision with root package name */
    public String f84612g;

    /* renamed from: h, reason: collision with root package name */
    public e1 f84613h;

    /* renamed from: i, reason: collision with root package name */
    public e1 f84614i;

    /* renamed from: j, reason: collision with root package name */
    public int f84615j;

    /* renamed from: k, reason: collision with root package name */
    public int f84616k;

    /* renamed from: l, reason: collision with root package name */
    public int f84617l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f84618m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f84619n;

    /* renamed from: o, reason: collision with root package name */
    public int f84620o;

    /* renamed from: p, reason: collision with root package name */
    public int f84621p;

    /* renamed from: q, reason: collision with root package name */
    public int f84622q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f84623r;

    /* renamed from: s, reason: collision with root package name */
    public long f84624s;

    /* renamed from: t, reason: collision with root package name */
    public int f84625t;

    /* renamed from: u, reason: collision with root package name */
    public long f84626u;

    /* renamed from: v, reason: collision with root package name */
    public e1 f84627v;

    /* renamed from: w, reason: collision with root package name */
    public long f84628w;

    public f(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    public static boolean isAdtsSyncWord(int i10) {
        return (i10 & 65526) == 65520;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0209  */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v33 */
    @Override // rp.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(io.bidmachine.media3.common.util.m0 r23) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.f.consume(io.bidmachine.media3.common.util.m0):void");
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84612g = m0Var.getFormatId();
        e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 1);
        this.f84613h = e1VarTrack;
        this.f84627v = e1VarTrack;
        if (!this.f84606a) {
            this.f84614i = new ko.v();
            return;
        }
        m0Var.generateNewId();
        e1 e1VarTrack2 = c0Var.track(m0Var.getTrackId(), 5);
        this.f84614i = e1VarTrack2;
        e1VarTrack2.format(new gn.w().setId(m0Var.getFormatId()).setContainerMimeType(this.f84611f).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    public long getSampleDurationUs() {
        return this.f84624s;
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84626u = j10;
    }

    @Override // rp.j
    public void seek() {
        this.f84626u = C.TIME_UNSET;
        this.f84619n = false;
        this.f84615j = 0;
        this.f84616k = 0;
        this.f84617l = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public f(boolean z10, String str, int i10, String str2) {
        this.f84607b = new io.bidmachine.media3.common.util.l0(new byte[7]);
        this.f84608c = new io.bidmachine.media3.common.util.m0(Arrays.copyOf(f84605x, 10));
        this.f84620o = -1;
        this.f84621p = -1;
        this.f84624s = C.TIME_UNSET;
        this.f84626u = C.TIME_UNSET;
        this.f84606a = z10;
        this.f84609d = str;
        this.f84610e = i10;
        this.f84611f = str2;
        this.f84615j = 0;
        this.f84616k = 0;
        this.f84617l = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
    }
}
