package oe;

import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List f79101a;

    /* renamed from: b, reason: collision with root package name */
    public final ee.l0[] f79102b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79103c;

    /* renamed from: d, reason: collision with root package name */
    public int f79104d;

    /* renamed from: e, reason: collision with root package name */
    public int f79105e;

    /* renamed from: f, reason: collision with root package name */
    public long f79106f = C.TIME_UNSET;

    public i(List<f0> list) {
        this.f79101a = list;
        this.f79102b = new ee.l0[list.size()];
    }

    @Override // oe.j
    public void consume(v0 v0Var) {
        boolean z10;
        boolean z11;
        if (this.f79103c) {
            if (this.f79104d == 2) {
                if (v0Var.bytesLeft() == 0) {
                    z11 = false;
                } else {
                    if (v0Var.readUnsignedByte() != 32) {
                        this.f79103c = false;
                    }
                    this.f79104d--;
                    z11 = this.f79103c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f79104d == 1) {
                if (v0Var.bytesLeft() == 0) {
                    z10 = false;
                } else {
                    if (v0Var.readUnsignedByte() != 0) {
                        this.f79103c = false;
                    }
                    this.f79104d--;
                    z10 = this.f79103c;
                }
                if (!z10) {
                    return;
                }
            }
            int position = v0Var.getPosition();
            int iBytesLeft = v0Var.bytesLeft();
            for (ee.l0 l0Var : this.f79102b) {
                v0Var.setPosition(position);
                l0Var.sampleData(v0Var, iBytesLeft);
            }
            this.f79105e += iBytesLeft;
        }
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        int i10 = 0;
        while (true) {
            ee.l0[] l0VarArr = this.f79102b;
            if (i10 >= l0VarArr.length) {
                return;
            }
            f0 f0Var = (f0) this.f79101a.get(i10);
            i0Var.generateNewId();
            ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 3);
            l0VarTrack.format(new y0().setId(i0Var.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_DVBSUBS).setInitializationData(Collections.singletonList(f0Var.f79083b)).setLanguage(f0Var.f79082a).build());
            l0VarArr[i10] = l0VarTrack;
            i10++;
        }
    }

    @Override // oe.j
    public void packetFinished() {
        if (this.f79103c) {
            if (this.f79106f != C.TIME_UNSET) {
                for (ee.l0 l0Var : this.f79102b) {
                    l0Var.sampleMetadata(this.f79106f, 1, this.f79105e, 0, null);
                }
            }
            this.f79103c = false;
        }
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f79103c = true;
        if (j10 != C.TIME_UNSET) {
            this.f79106f = j10;
        }
        this.f79105e = 0;
        this.f79104d = 2;
    }

    @Override // oe.j
    public void seek() {
        this.f79103c = false;
        this.f79106f = C.TIME_UNSET;
    }
}
