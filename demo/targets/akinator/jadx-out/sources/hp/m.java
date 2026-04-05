package hp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.e1;
import ko.q0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m implements z {

    /* renamed from: a, reason: collision with root package name */
    public final s f59110a;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f59112c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f59113d;

    /* renamed from: g, reason: collision with root package name */
    public e1 f59116g;

    /* renamed from: h, reason: collision with root package name */
    public int f59117h;

    /* renamed from: i, reason: collision with root package name */
    public int f59118i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f59119j;

    /* renamed from: k, reason: collision with root package name */
    public long f59120k;

    /* renamed from: b, reason: collision with root package name */
    public final b f59111b = new b();

    /* renamed from: f, reason: collision with root package name */
    public byte[] f59115f = a1.f60681c;

    /* renamed from: e, reason: collision with root package name */
    public final m0 f59114e = new m0();

    public m(s sVar, io.bidmachine.media3.common.b bVar) {
        this.f59110a = sVar;
        this.f59112c = bVar != null ? bVar.buildUpon().setSampleMimeType("application/x-media3-cues").setCodecs(bVar.f60665o).setCueReplacementBehavior(sVar.getCueReplacementBehavior()).build() : null;
        this.f59113d = new ArrayList();
        this.f59118i = 0;
        this.f59119j = a1.f60682d;
        this.f59120k = C.TIME_UNSET;
    }

    public final void a(l lVar) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f59116g);
        byte[] bArr = lVar.f59109c;
        int length = bArr.length;
        m0 m0Var = this.f59114e;
        m0Var.reset(bArr);
        this.f59116g.sampleData(m0Var, length);
        this.f59116g.sampleMetadata(lVar.f59108b, 1, length, 0, null);
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        io.bidmachine.media3.common.util.a.checkState(this.f59118i == 0);
        e1 e1VarTrack = c0Var.track(0, 3);
        this.f59116g = e1VarTrack;
        io.bidmachine.media3.common.b bVar = this.f59112c;
        if (bVar != null) {
            e1VarTrack.format(bVar);
            c0Var.endTracks();
            c0Var.seekMap(new q0(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        }
        this.f59118i = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
      0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r21, ko.v0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.m.read(ko.a0, ko.v0):int");
    }

    @Override // ko.z
    public void release() {
        if (this.f59118i == 5) {
            return;
        }
        this.f59110a.reset();
        this.f59118i = 5;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        int i10 = this.f59118i;
        io.bidmachine.media3.common.util.a.checkState((i10 == 0 || i10 == 5) ? false : true);
        this.f59120k = j11;
        if (this.f59118i == 2) {
            this.f59118i = 1;
        }
        if (this.f59118i == 4) {
            this.f59118i = 3;
        }
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        return true;
    }
}
