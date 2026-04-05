package oe;

import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements j {

    /* renamed from: b, reason: collision with root package name */
    public ee.l0 f79239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79240c;

    /* renamed from: e, reason: collision with root package name */
    public int f79242e;

    /* renamed from: f, reason: collision with root package name */
    public int f79243f;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f79238a = new v0(10);

    /* renamed from: d, reason: collision with root package name */
    public long f79241d = C.TIME_UNSET;

    @Override // oe.j
    public void consume(v0 v0Var) {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79239b);
        if (this.f79240c) {
            int iBytesLeft = v0Var.bytesLeft();
            int i10 = this.f79243f;
            if (i10 < 10) {
                int iMin = Math.min(iBytesLeft, 10 - i10);
                byte[] data = v0Var.getData();
                int position = v0Var.getPosition();
                v0 v0Var2 = this.f79238a;
                System.arraycopy(data, position, v0Var2.getData(), this.f79243f, iMin);
                if (this.f79243f + iMin == 10) {
                    v0Var2.setPosition(0);
                    if (73 != v0Var2.readUnsignedByte() || 68 != v0Var2.readUnsignedByte() || 51 != v0Var2.readUnsignedByte()) {
                        com.google.android.exoplayer2.util.f0.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f79240c = false;
                        return;
                    } else {
                        v0Var2.skipBytes(3);
                        this.f79242e = v0Var2.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iBytesLeft, this.f79242e - this.f79243f);
            this.f79239b.sampleData(v0Var, iMin2);
            this.f79243f += iMin2;
        }
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 5);
        this.f79239b = l0VarTrack;
        l0VarTrack.format(new y0().setId(i0Var.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    @Override // oe.j
    public void packetFinished() {
        int i10;
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79239b);
        if (this.f79240c && (i10 = this.f79242e) != 0 && this.f79243f == i10) {
            long j10 = this.f79241d;
            if (j10 != C.TIME_UNSET) {
                this.f79239b.sampleMetadata(j10, 1, i10, 0, null);
            }
            this.f79240c = false;
        }
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f79240c = true;
        if (j10 != C.TIME_UNSET) {
            this.f79241d = j10;
        }
        this.f79242e = 0;
        this.f79243f = 0;
    }

    @Override // oe.j
    public void seek() {
        this.f79240c = false;
        this.f79241d = C.TIME_UNSET;
    }
}
