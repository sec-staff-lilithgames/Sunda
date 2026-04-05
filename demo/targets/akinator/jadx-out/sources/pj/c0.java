package pj;

import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final nj.p0 f81425a;

    public c0(nj.p0 p0Var) {
        this.f81425a = p0Var;
    }

    public rt.a providesProgramaticContextualTriggerStream() {
        rt.a aVarPublish = mt.l.create(new b3(this, 5), mt.b.f74912c).publish();
        aVarPublish.connect();
        return aVarPublish;
    }

    public nj.p0 providesProgramaticContextualTriggers() {
        return this.f81425a;
    }
}
