package oe;

import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f78991a;

    /* renamed from: b, reason: collision with root package name */
    public final ee.l0[] f78992b;

    public b0(List<z0> list) {
        this.f78991a = list;
        this.f78992b = new ee.l0[list.size()];
    }

    public void consume(long j10, v0 v0Var) {
        ee.h.consume(j10, v0Var, this.f78992b);
    }

    public void createTracks(ee.s sVar, i0 i0Var) {
        int i10 = 0;
        while (true) {
            ee.l0[] l0VarArr = this.f78992b;
            if (i10 >= l0VarArr.length) {
                return;
            }
            i0Var.generateNewId();
            ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 3);
            z0 z0Var = (z0) this.f78991a.get(i10);
            String str = z0Var.f28802n;
            com.google.android.exoplayer2.util.a.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            String formatId = z0Var.f28791b;
            if (formatId == null) {
                formatId = i0Var.getFormatId();
            }
            l0VarTrack.format(new y0().setId(formatId).setSampleMimeType(str).setSelectionFlags(z0Var.f28794f).setLanguage(z0Var.f28793e).setAccessibilityChannel(z0Var.F).setInitializationData(z0Var.f28804p).build());
            l0VarArr[i10] = l0VarTrack;
            i10++;
        }
    }
}
