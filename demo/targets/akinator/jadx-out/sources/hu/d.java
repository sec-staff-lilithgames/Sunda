package hu;

import vt.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final d f59164b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f59165c;

    static {
        d dVar = new d("INSTANCE", 0);
        f59164b = dVar;
        f59165c = new d[]{dVar};
    }

    public static void complete(tw.c cVar) {
        cVar.onSubscribe(f59164b);
        cVar.onComplete();
    }

    public static void error(Throwable th2, tw.c cVar) {
        cVar.onSubscribe(f59164b);
        cVar.onError(th2);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f59165c.clone();
    }

    @Override // vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return true;
    }

    @Override // vt.l, vt.k, vt.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.l, vt.k, vt.o
    public Object poll() {
        return null;
    }

    @Override // vt.l, tw.d
    public void request(long j10) {
        g.validate(j10);
    }

    @Override // vt.l, vt.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // vt.l, vt.k, vt.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.l, tw.d
    public void cancel() {
    }

    @Override // vt.l, vt.k, vt.o
    public void clear() {
    }
}
