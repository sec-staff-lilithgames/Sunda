package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final List<io.odeeo.internal.b.t> f65579a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.g.x[] f65580b;

    public z(List<io.odeeo.internal.b.t> list) {
        this.f65579a = list;
        this.f65580b = new io.odeeo.internal.g.x[list.size()];
    }

    public void consume(long j10, io.odeeo.internal.q0.x xVar) {
        io.odeeo.internal.g.b.consume(j10, xVar, this.f65580b);
    }

    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        for (int i10 = 0; i10 < this.f65580b.length; i10++) {
            dVar.generateNewId();
            io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 3);
            io.odeeo.internal.b.t tVar = this.f65579a.get(i10);
            String str = tVar.f62971l;
            io.odeeo.internal.q0.a.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            String formatId = tVar.f62960a;
            if (formatId == null) {
                formatId = dVar.getFormatId();
            }
            xVarTrack.format(new t.b().setId(formatId).setSampleMimeType(str).setSelectionFlags(tVar.f62963d).setLanguage(tVar.f62962c).setAccessibilityChannel(tVar.D).setInitializationData(tVar.f62973n).build());
            this.f65580b[i10] = xVarTrack;
        }
    }
}
