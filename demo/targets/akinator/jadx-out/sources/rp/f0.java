package rp;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import ko.e1;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f84629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84630b;

    /* renamed from: c, reason: collision with root package name */
    public final e1[] f84631c;

    /* renamed from: d, reason: collision with root package name */
    public final jn.b0 f84632d = new jn.b0(new b3(this, 11));

    public f0(List<io.bidmachine.media3.common.b> list, String str) {
        this.f84629a = list;
        this.f84630b = str;
        this.f84631c = new e1[list.size()];
    }

    public void clear() {
        this.f84632d.flush();
    }

    public void consume(long j10, io.bidmachine.media3.common.util.m0 m0Var) {
        this.f84632d.add(j10, m0Var);
    }

    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        int i10 = 0;
        while (true) {
            e1[] e1VarArr = this.f84631c;
            if (i10 >= e1VarArr.length) {
                return;
            }
            m0Var.generateNewId();
            e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 3);
            io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) this.f84629a.get(i10);
            String str = bVar.f60665o;
            io.bidmachine.media3.common.util.a.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            String formatId = bVar.f60651a;
            if (formatId == null) {
                formatId = m0Var.getFormatId();
            }
            e1VarTrack.format(new gn.w().setId(formatId).setContainerMimeType(this.f84630b).setSampleMimeType(str).setSelectionFlags(bVar.f60655e).setLanguage(bVar.f60654d).setAccessibilityChannel(bVar.J).setInitializationData(bVar.f60668r).build());
            e1VarArr[i10] = e1VarTrack;
            i10++;
        }
    }

    public void flush() {
        this.f84632d.flush();
    }

    public void setReorderingQueueSize(int i10) {
        this.f84632d.setMaxSize(i10);
    }
}
