package tt;

import mt.i0;
import mt.q0;
import mt.v;
import vt.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final e f87354b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f87355c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f87356e;

    static {
        e eVar = new e("INSTANCE", 0);
        f87354b = eVar;
        e eVar2 = new e("NEVER", 1);
        f87355c = eVar2;
        f87356e = new e[]{eVar, eVar2};
    }

    public static void complete(i0 i0Var) {
        i0Var.onSubscribe(f87354b);
        i0Var.onComplete();
    }

    public static void error(Throwable th2, i0 i0Var) {
        i0Var.onSubscribe(f87354b);
        i0Var.onError(th2);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f87356e.clone();
    }

    @Override // vt.j, pt.c
    public boolean isDisposed() {
        return this == f87354b;
    }

    @Override // vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return true;
    }

    @Override // vt.j, vt.k, vt.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        return null;
    }

    @Override // vt.j, vt.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // vt.j, vt.k, vt.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(v vVar) {
        vVar.onSubscribe(f87354b);
        vVar.onComplete();
    }

    public static void error(Throwable th2, mt.f fVar) {
        fVar.onSubscribe(f87354b);
        fVar.onError(th2);
    }

    public static void complete(mt.f fVar) {
        fVar.onSubscribe(f87354b);
        fVar.onComplete();
    }

    public static void error(Throwable th2, q0 q0Var) {
        q0Var.onSubscribe(f87354b);
        q0Var.onError(th2);
    }

    public static void error(Throwable th2, v vVar) {
        vVar.onSubscribe(f87354b);
        vVar.onError(th2);
    }

    @Override // vt.j, vt.k, vt.o
    public void clear() {
    }

    @Override // vt.j, pt.c
    public void dispose() {
    }
}
