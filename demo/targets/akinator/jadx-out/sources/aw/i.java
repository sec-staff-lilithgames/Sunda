package aw;

import java.io.IOException;
import pw.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends bw.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f8306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str) {
        super(str, false, 2, null);
        this.f8306e = gVar;
    }

    @Override // bw.a
    public long runOnce() {
        g gVar = this.f8306e;
        synchronized (gVar) {
            if (!gVar.f8277q || gVar.getClosed$okhttp()) {
                return -1L;
            }
            try {
                gVar.trimToSize();
            } catch (IOException unused) {
                gVar.f8279s = true;
            }
            try {
                if (gVar.h()) {
                    gVar.rebuildJournal$okhttp();
                    gVar.f8274n = 0;
                }
            } catch (IOException unused2) {
                gVar.f8280t = true;
                pw.j jVar = gVar.f8272l;
                if (jVar != null) {
                    yv.h.closeQuietly(jVar);
                }
                gVar.f8272l = h0.buffer(h0.blackhole());
            }
            return -1L;
        }
    }
}
