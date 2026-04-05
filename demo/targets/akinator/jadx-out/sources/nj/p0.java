package nj;

import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public o0 f76989a;

    public void removeListener(o0 o0Var) {
        this.f76989a = null;
    }

    public void setListener(o0 o0Var) {
        this.f76989a = o0Var;
    }

    public void triggerEvent(String str) {
        j0.logd("Programmatically trigger: " + str);
        ((b3) this.f76989a).onEventTrigger(str);
    }
}
