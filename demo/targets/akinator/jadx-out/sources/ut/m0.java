package ut;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w f88678a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final r f88679b = new r();

    /* renamed from: c, reason: collision with root package name */
    public static final o f88680c = new o();

    /* renamed from: d, reason: collision with root package name */
    public static final p f88681d = new p();

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f88682e = new g0();

    /* renamed from: f, reason: collision with root package name */
    public static final q f88683f = new q();

    /* renamed from: g, reason: collision with root package name */
    public static final l0 f88684g = new l0();

    /* renamed from: h, reason: collision with root package name */
    public static final t f88685h = new t();

    /* renamed from: i, reason: collision with root package name */
    public static final f0 f88686i = new f0();

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f88687j = new b0();

    /* renamed from: k, reason: collision with root package name */
    public static final z f88688k = new z();

    public static <T> st.g actionConsumer(st.a aVar) {
        return new a(aVar);
    }

    public static <T> st.q alwaysFalse() {
        return f88685h;
    }

    public static <T> st.q alwaysTrue() {
        return f88684g;
    }

    public static <T> st.g boundedConsumer(int i10) {
        return new l(i10);
    }

    public static <T, U> st.o castFunction(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<List<T>> createArrayList(int i10) {
        return new j(i10);
    }

    public static <T> Callable<Set<T>> createHashSet() {
        return v.f88693b;
    }

    public static <T> st.g emptyConsumer() {
        return f88681d;
    }

    public static <T> st.q equalsWith(T t10) {
        return new s(t10);
    }

    public static st.a futureAction(Future<?> future) {
        return new u(future);
    }

    public static <T> st.o identity() {
        return f88678a;
    }

    public static <T, U> st.q isInstanceOf(Class<U> cls) {
        return new n(cls);
    }

    public static <T> Callable<T> justCallable(T t10) {
        return new x(t10);
    }

    public static <T, U> st.o justFunction(U u10) {
        return new x(u10);
    }

    public static <T> st.o listSorter(Comparator<? super T> comparator) {
        return new y(comparator);
    }

    public static <T> Comparator<T> naturalComparator() {
        return a0.f88660b;
    }

    public static <T> Comparator<T> naturalOrder() {
        return f88687j;
    }

    public static <T> st.a notificationOnComplete(st.g gVar) {
        return new c0(gVar);
    }

    public static <T> st.g notificationOnError(st.g gVar) {
        return new d0(gVar);
    }

    public static <T> st.g notificationOnNext(st.g gVar) {
        return new e0(gVar);
    }

    public static <T> Callable<T> nullSupplier() {
        return f88686i;
    }

    public static <T> st.q predicateReverseFor(st.e eVar) {
        return new k(eVar);
    }

    public static <T> st.o timestampWith(TimeUnit timeUnit, mt.m0 m0Var) {
        return new h0(timeUnit, m0Var);
    }

    public static <T1, T2, R> st.o toFunction(st.c cVar) {
        o0.requireNonNull(cVar, "f is null");
        return new b(cVar);
    }

    public static <T, K> st.b toMapKeySelector(st.o oVar) {
        return new i0(oVar);
    }

    public static <T, K, V> st.b toMapKeyValueSelector(st.o oVar, st.o oVar2) {
        return new j0(oVar2, oVar);
    }

    public static <T, K, V> st.b toMultimapKeyValueSelector(st.o oVar, st.o oVar2, st.o oVar3) {
        return new k0(oVar3, oVar2, oVar);
    }

    public static <T1, T2, T3, R> st.o toFunction(st.h hVar) {
        o0.requireNonNull(hVar, "f is null");
        return new c();
    }

    public static <T1, T2, T3, T4, R> st.o toFunction(st.i iVar) {
        o0.requireNonNull(iVar, "f is null");
        return new d();
    }

    public static <T1, T2, T3, T4, T5, R> st.o toFunction(st.j jVar) {
        o0.requireNonNull(jVar, "f is null");
        return new e();
    }

    public static <T1, T2, T3, T4, T5, T6, R> st.o toFunction(st.k kVar) {
        o0.requireNonNull(kVar, "f is null");
        return new f();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> st.o toFunction(st.l lVar) {
        o0.requireNonNull(lVar, "f is null");
        return new g();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> st.o toFunction(st.m mVar) {
        o0.requireNonNull(mVar, "f is null");
        return new h();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> st.o toFunction(st.n nVar) {
        o0.requireNonNull(nVar, "f is null");
        return new i();
    }
}
