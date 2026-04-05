package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<io.odeeo.internal.b.t> f65339a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.g.x[] f65340b;

    public f0(List<io.odeeo.internal.b.t> list) {
        this.f65339a = list;
        this.f65340b = new io.odeeo.internal.g.x[list.size()];
    }

    public void consume(long j10, io.odeeo.internal.q0.x xVar) {
        if (xVar.bytesLeft() < 9) {
            return;
        }
        int i10 = xVar.readInt();
        int i11 = xVar.readInt();
        int unsignedByte = xVar.readUnsignedByte();
        if (i10 == 434 && i11 == 1195456820 && unsignedByte == 3) {
            io.odeeo.internal.g.b.consumeCcData(j10, xVar, this.f65340b);
        }
    }

    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        for (int i10 = 0; i10 < this.f65340b.length; i10++) {
            dVar.generateNewId();
            io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 3);
            io.odeeo.internal.b.t tVar = this.f65339a.get(i10);
            String str = tVar.f62971l;
            io.odeeo.internal.q0.a.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            xVarTrack.format(new t.b().setId(dVar.getFormatId()).setSampleMimeType(str).setSelectionFlags(tVar.f62963d).setLanguage(tVar.f62962c).setAccessibilityChannel(tVar.D).setInitializationData(tVar.f62973n).build());
            this.f65340b[i10] = xVarTrack;
        }
    }
}
