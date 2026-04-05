package fo;

import ao.b2;
import ao.k0;
import gn.a2;
import io.bidmachine.media3.exoplayer.a0;
import io.bidmachine.media3.exoplayer.t1;
import io.bidmachine.media3.exoplayer.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public t f55923a;

    /* renamed from: b, reason: collision with root package name */
    public go.f f55924b;

    public a2 getParameters() {
        return a2.F;
    }

    public t1 getRendererCapabilitiesListener() {
        return null;
    }

    public void init(t tVar, go.f fVar) {
        this.f55923a = tVar;
        this.f55924b = fVar;
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(Object obj);

    public void release() {
        this.f55923a = null;
        this.f55924b = null;
    }

    public abstract v selectTracks(u1[] u1VarArr, b2 b2Var, k0 k0Var, gn.u1 u1Var) throws a0;

    public void setAudioAttributes(gn.h hVar) {
    }

    public void setParameters(a2 a2Var) {
    }
}
