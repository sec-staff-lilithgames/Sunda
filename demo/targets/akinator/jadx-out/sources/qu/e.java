package qu;

import mt.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements q {

    /* renamed from: b, reason: collision with root package name */
    public static final e f83505b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f83506c;

    static {
        e eVar = new e("INSTANCE", 0);
        f83505b = eVar;
        f83506c = new e[]{eVar};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f83506c.clone();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
    }
}
