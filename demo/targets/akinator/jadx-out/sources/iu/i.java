package iu;

import mt.i0;
import mt.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements mt.q, i0, mt.v, q0, mt.f, tw.d, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public static final i f68409b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f68410c;

    static {
        i iVar = new i("INSTANCE", 0);
        f68409b = iVar;
        f68410c = new i[]{iVar};
    }

    public static <T> i0 asObserver() {
        return f68409b;
    }

    public static <T> tw.c asSubscriber() {
        return f68409b;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f68410c.clone();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return true;
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        mu.a.onError(th2);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        cVar.dispose();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        dVar.cancel();
    }

    @Override // tw.d
    public void cancel() {
    }

    @Override // pt.c
    public void dispose() {
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
    }

    @Override // tw.d
    public void request(long j10) {
    }
}
