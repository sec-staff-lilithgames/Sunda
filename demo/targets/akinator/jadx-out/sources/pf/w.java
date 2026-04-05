package pf;

import bf.d0;
import bf.n1;
import com.google.android.exoplayer2.a3;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.m3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public v f81192a;

    /* renamed from: b, reason: collision with root package name */
    public qf.g f81193b;

    public s getParameters() {
        return s.C;
    }

    public a3 getRendererCapabilitiesListener() {
        return null;
    }

    public void init(v vVar, qf.g gVar) {
        this.f81192a = vVar;
        this.f81193b = gVar;
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(Object obj);

    public void release() {
        this.f81192a = null;
        this.f81193b = null;
    }

    public abstract x selectTracks(b3[] b3VarArr, n1 n1Var, d0 d0Var, m3 m3Var) throws com.google.android.exoplayer2.r;

    public void setAudioAttributes(com.google.android.exoplayer2.audio.k kVar) {
    }

    public void setParameters(s sVar) {
    }
}
