package me;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import me.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f74366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74367b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f74368c;

    public g(a.b bVar, z0 z0Var) {
        v0 v0Var = bVar.f74346b;
        this.f74368c = v0Var;
        v0Var.setPosition(12);
        int unsignedIntToInt = v0Var.readUnsignedIntToInt();
        if (MimeTypes.AUDIO_RAW.equals(z0Var.f28802n)) {
            int pcmFrameSize = n1.getPcmFrameSize(z0Var.C, z0Var.A);
            if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                f0.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                unsignedIntToInt = pcmFrameSize;
            }
        }
        this.f74366a = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
        this.f74367b = v0Var.readUnsignedIntToInt();
    }

    @Override // me.e
    public int getFixedSampleSize() {
        return this.f74366a;
    }

    @Override // me.e
    public int getSampleCount() {
        return this.f74367b;
    }

    @Override // me.e
    public int readNextSampleSize() {
        int i10 = this.f74366a;
        return i10 == -1 ? this.f74368c.readUnsignedIntToInt() : i10;
    }
}
