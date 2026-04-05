package io.odeeo.internal.o;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.l;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.x;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c implements io.odeeo.internal.g.h {

    /* renamed from: d, reason: collision with root package name */
    public static final l f65123d = new bt.a(9);

    /* renamed from: a, reason: collision with root package name */
    public j f65124a;

    /* renamed from: b, reason: collision with root package name */
    public h f65125b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65126c;

    public static /* synthetic */ io.odeeo.internal.g.h[] a() {
        return new io.odeeo.internal.g.h[]{new c()};
    }

    @Override // io.odeeo.internal.g.h
    public void init(j jVar) {
        this.f65124a = jVar;
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65124a);
        if (this.f65125b == null) {
            if (!a(iVar)) {
                throw g0.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            iVar.resetPeekPosition();
        }
        if (!this.f65126c) {
            x xVarTrack = this.f65124a.track(0, 1);
            this.f65124a.endTracks();
            this.f65125b.a(this.f65124a, xVarTrack);
            this.f65126c = true;
        }
        return this.f65125b.a(iVar, uVar);
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        h hVar = this.f65125b;
        if (hVar != null) {
            hVar.a(j10, j11);
        }
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(io.odeeo.internal.g.i iVar) throws IOException {
        try {
            return a(iVar);
        } catch (g0 unused) {
            return false;
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean a(io.odeeo.internal.g.i iVar) throws IOException {
        e eVar = new e();
        if (eVar.populate(iVar, true) && (eVar.f65133b & 2) == 2) {
            int iMin = Math.min(eVar.f65140i, 8);
            io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(iMin);
            iVar.peekFully(xVar.getData(), 0, iMin);
            if (b.verifyBitstreamType(a(xVar))) {
                this.f65125b = new b();
            } else if (i.verifyBitstreamType(a(xVar))) {
                this.f65125b = new i();
            } else if (g.verifyBitstreamType(a(xVar))) {
                this.f65125b = new g();
            }
            return true;
        }
        return false;
    }

    public static io.odeeo.internal.q0.x a(io.odeeo.internal.q0.x xVar) {
        xVar.setPosition(0);
        return xVar;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }
}
