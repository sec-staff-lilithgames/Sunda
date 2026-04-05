package ks;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import hp.u;
import io.bidmachine.media3.common.util.m0;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class p implements o.a, io.bidmachine.media3.common.util.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f72003c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f72004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f72005f;

    public /* synthetic */ p(b.a aVar, int i10, long j10) {
        this.f72002b = 0;
        this.f72003c = aVar;
        this.f72005f = i10;
        this.f72004e = j10;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        u uVar = (u) this.f72003c;
        hp.c cVar = (hp.c) obj;
        io.bidmachine.media3.common.util.a.checkStateNotNull(uVar.f59140i);
        byte[] bArrEncode = uVar.f59134c.encode(cVar.f59099a, cVar.f59101c);
        m0 m0Var = uVar.f59135d;
        m0Var.reset(bArrEncode);
        uVar.f59132a.sampleData(m0Var, bArrEncode.length);
        long j10 = cVar.f59100b;
        long j11 = this.f72004e;
        if (j10 == C.TIME_UNSET) {
            io.bidmachine.media3.common.util.a.checkState(uVar.f59140i.f60670t == Long.MAX_VALUE);
        } else {
            long j12 = uVar.f59140i.f60670t;
            j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
        }
        uVar.f59132a.sampleMetadata(j11, this.f72005f | 1, bArrEncode.length, 0, null);
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f72002b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onDroppedVideoFrames((b.a) this.f72003c, this.f72005f, this.f72004e);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onVideoFrameProcessingOffset((b.a) this.f72003c, this.f72004e, this.f72005f);
                break;
        }
    }

    public /* synthetic */ p(Object obj, long j10, int i10, int i11) {
        this.f72002b = i11;
        this.f72003c = obj;
        this.f72004e = j10;
        this.f72005f = i10;
    }
}
