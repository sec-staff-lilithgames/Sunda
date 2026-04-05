package nc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements mc.v, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final u f75960e = new u(null);

    /* renamed from: f, reason: collision with root package name */
    public static final u f75961f = new u(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f75962b;

    /* renamed from: c, reason: collision with root package name */
    public final dd.a f75963c;

    public u(Object obj) {
        this.f75962b = obj;
        this.f75963c = obj == null ? dd.a.f51981b : dd.a.f51982c;
    }

    public static u forValue(Object obj) {
        return obj == null ? f75961f : new u(obj);
    }

    public static boolean isNuller(mc.v vVar) {
        return vVar == f75961f;
    }

    public static boolean isSkipper(mc.v vVar) {
        return vVar == f75960e;
    }

    public static u nuller() {
        return f75961f;
    }

    public static u skipper() {
        return f75960e;
    }

    @Override // mc.v
    public /* bridge */ /* synthetic */ Object getAbsentValue(jc.k kVar) throws jc.r {
        return super.getAbsentValue(kVar);
    }

    @Override // mc.v
    public dd.a getNullAccessPattern() {
        return this.f75963c;
    }

    @Override // mc.v
    public Object getNullValue(jc.k kVar) {
        return this.f75962b;
    }
}
