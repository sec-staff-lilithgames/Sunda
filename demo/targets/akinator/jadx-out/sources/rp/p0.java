package rp;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f84848a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84849b;

    /* renamed from: c, reason: collision with root package name */
    public final e1[] f84850c;

    public p0(List<io.bidmachine.media3.common.b> list, String str) {
        this.f84848a = list;
        this.f84849b = str;
        this.f84850c = new e1[list.size()];
    }

    public void consume(long j10, io.bidmachine.media3.common.util.m0 m0Var) {
        if (m0Var.bytesLeft() < 9) {
            return;
        }
        int i10 = m0Var.readInt();
        int i11 = m0Var.readInt();
        int unsignedByte = m0Var.readUnsignedByte();
        if (i10 == 434 && i11 == 1195456820 && unsignedByte == 3) {
            ko.p.consumeCcData(j10, m0Var, this.f84850c);
        }
    }

    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        int i10 = 0;
        while (true) {
            e1[] e1VarArr = this.f84850c;
            if (i10 >= e1VarArr.length) {
                return;
            }
            m0Var.generateNewId();
            e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 3);
            io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) this.f84848a.get(i10);
            String str = bVar.f60665o;
            io.bidmachine.media3.common.util.a.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            e1VarTrack.format(new gn.w().setId(m0Var.getFormatId()).setContainerMimeType(this.f84849b).setSampleMimeType(str).setSelectionFlags(bVar.f60655e).setLanguage(bVar.f60654d).setAccessibilityChannel(bVar.J).setInitializationData(bVar.f60668r).build());
            e1VarArr[i10] = e1VarTrack;
            i10++;
        }
    }
}
