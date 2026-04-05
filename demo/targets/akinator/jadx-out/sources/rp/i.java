package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List f84665a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84666b;

    /* renamed from: c, reason: collision with root package name */
    public final e1[] f84667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84668d;

    /* renamed from: e, reason: collision with root package name */
    public int f84669e;

    /* renamed from: f, reason: collision with root package name */
    public int f84670f;

    /* renamed from: g, reason: collision with root package name */
    public long f84671g = C.TIME_UNSET;

    public i(List<j0> list, String str) {
        this.f84665a = list;
        this.f84666b = str;
        this.f84667c = new e1[list.size()];
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
        boolean z10;
        boolean z11;
        if (this.f84668d) {
            if (this.f84669e == 2) {
                if (m0Var.bytesLeft() == 0) {
                    z11 = false;
                } else {
                    if (m0Var.readUnsignedByte() != 32) {
                        this.f84668d = false;
                    }
                    this.f84669e--;
                    z11 = this.f84668d;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f84669e == 1) {
                if (m0Var.bytesLeft() == 0) {
                    z10 = false;
                } else {
                    if (m0Var.readUnsignedByte() != 0) {
                        this.f84668d = false;
                    }
                    this.f84669e--;
                    z10 = this.f84668d;
                }
                if (!z10) {
                    return;
                }
            }
            int position = m0Var.getPosition();
            int iBytesLeft = m0Var.bytesLeft();
            for (e1 e1Var : this.f84667c) {
                m0Var.setPosition(position);
                e1Var.sampleData(m0Var, iBytesLeft);
            }
            this.f84670f += iBytesLeft;
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        int i10 = 0;
        while (true) {
            e1[] e1VarArr = this.f84667c;
            if (i10 >= e1VarArr.length) {
                return;
            }
            j0 j0Var = (j0) this.f84665a.get(i10);
            m0Var.generateNewId();
            e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 3);
            e1VarTrack.format(new gn.w().setId(m0Var.getFormatId()).setContainerMimeType(this.f84666b).setSampleMimeType(MimeTypes.APPLICATION_DVBSUBS).setInitializationData(Collections.singletonList(j0Var.f84701b)).setLanguage(j0Var.f84700a).build());
            e1VarArr[i10] = e1VarTrack;
            i10++;
        }
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
        if (this.f84668d) {
            io.bidmachine.media3.common.util.a.checkState(this.f84671g != C.TIME_UNSET);
            for (e1 e1Var : this.f84667c) {
                e1Var.sampleMetadata(this.f84671g, 1, this.f84670f, 0, null);
            }
            this.f84668d = false;
        }
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f84668d = true;
        this.f84671g = j10;
        this.f84670f = 0;
        this.f84669e = 2;
    }

    @Override // rp.j
    public void seek() {
        this.f84668d = false;
        this.f84671g = C.TIME_UNSET;
    }
}
