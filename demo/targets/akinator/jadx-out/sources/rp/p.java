package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f84841a;

    /* renamed from: c, reason: collision with root package name */
    public e1 f84843c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84844d;

    /* renamed from: f, reason: collision with root package name */
    public int f84846f;

    /* renamed from: g, reason: collision with root package name */
    public int f84847g;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84842b = new io.bidmachine.media3.common.util.m0(10);

    /* renamed from: e, reason: collision with root package name */
    public long f84845e = C.TIME_UNSET;

    public p(String str) {
        this.f84841a = str;
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84843c);
        if (this.f84844d) {
            int iBytesLeft = m0Var.bytesLeft();
            int i10 = this.f84847g;
            if (i10 < 10) {
                int iMin = Math.min(iBytesLeft, 10 - i10);
                byte[] data = m0Var.getData();
                int position = m0Var.getPosition();
                io.bidmachine.media3.common.util.m0 m0Var2 = this.f84842b;
                System.arraycopy(data, position, m0Var2.getData(), this.f84847g, iMin);
                if (this.f84847g + iMin == 10) {
                    m0Var2.setPosition(0);
                    if (73 != m0Var2.readUnsignedByte() || 68 != m0Var2.readUnsignedByte() || 51 != m0Var2.readUnsignedByte()) {
                        io.bidmachine.media3.common.util.b0.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f84844d = false;
                        return;
                    } else {
                        m0Var2.skipBytes(3);
                        this.f84846f = m0Var2.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iBytesLeft, this.f84846f - this.f84847g);
            this.f84843c.sampleData(m0Var, iMin2);
            this.f84847g += iMin2;
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 5);
        this.f84843c = e1VarTrack;
        e1VarTrack.format(new gn.w().setId(m0Var.getFormatId()).setContainerMimeType(this.f84841a).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
        int i10;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84843c);
        if (this.f84844d && (i10 = this.f84846f) != 0 && this.f84847g == i10) {
            io.bidmachine.media3.common.util.a.checkState(this.f84845e != C.TIME_UNSET);
            this.f84843c.sampleMetadata(this.f84845e, 1, this.f84846f, 0, null);
            this.f84844d = false;
        }
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f84844d = true;
        this.f84845e = j10;
        this.f84846f = 0;
        this.f84847g = 0;
    }

    @Override // rp.j
    public void seek() {
        this.f84844d = false;
        this.f84845e = C.TIME_UNSET;
    }
}
