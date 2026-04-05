package ku;

import mt.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n f72038b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f72039c;

    static {
        n nVar = new n("INSTANCE", 0);
        f72038b = nVar;
        f72039c = new n[]{nVar};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f72039c.clone();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
    }

    @Override // mt.i0
    public void onNext(Object obj) {
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
    }
}
