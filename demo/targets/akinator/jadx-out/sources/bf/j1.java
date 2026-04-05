package bf;

import com.google.android.exoplayer2.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final qf.o f9295a;

    /* renamed from: b, reason: collision with root package name */
    public qf.o0 f9296b = new qf.a0();

    /* renamed from: c, reason: collision with root package name */
    public boolean f9297c = true;

    /* renamed from: d, reason: collision with root package name */
    public Object f9298d;

    /* renamed from: e, reason: collision with root package name */
    public String f9299e;

    public j1(qf.o oVar) {
        this.f9295a = (qf.o) com.google.android.exoplayer2.util.a.checkNotNull(oVar);
    }

    public k1 createMediaSource(t1 t1Var, long j10) {
        return new k1(this.f9299e, t1Var, this.f9295a, j10, this.f9296b, this.f9297c, this.f9298d);
    }

    public j1 setLoadErrorHandlingPolicy(qf.o0 o0Var) {
        if (o0Var == null) {
            o0Var = new qf.a0();
        }
        this.f9296b = o0Var;
        return this;
    }

    public j1 setTag(Object obj) {
        this.f9298d = obj;
        return this;
    }

    @Deprecated
    public j1 setTrackId(String str) {
        this.f9299e = str;
        return this;
    }

    public j1 setTreatLoadErrorsAsEndOfStream(boolean z10) {
        this.f9297c = z10;
        return this;
    }
}
