package bu;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o5 {
    public static <T, U> st.o flatMapIntoIterable(st.o oVar) {
        return new b5(oVar);
    }

    public static <T, U, R> st.o flatMapWithCombiner(st.o oVar, st.c cVar) {
        return new d5(oVar, cVar);
    }

    public static <T, U> st.o itemDelay(st.o oVar) {
        return new e5(oVar);
    }

    public static <T> st.a observerOnComplete(mt.i0 i0Var) {
        return new f5(i0Var);
    }

    public static <T> st.g observerOnError(mt.i0 i0Var) {
        return new g5(i0Var);
    }

    public static <T> st.g observerOnNext(mt.i0 i0Var) {
        return new h5(i0Var);
    }

    public static <T> Callable<ju.a> replayCallable(mt.b0 b0Var) {
        return new i5(b0Var);
    }

    public static <T, R> st.o replayFunction(st.o oVar, mt.m0 m0Var) {
        return new j5(oVar, m0Var);
    }

    public static <T, S> st.c simpleBiGenerator(st.b bVar) {
        return new k5(bVar);
    }

    public static <T, S> st.c simpleGenerator(st.g gVar) {
        return new l5(gVar);
    }

    public static <T, R> st.o zipIterable(st.o oVar) {
        return new n5(oVar);
    }

    public static <T> Callable<ju.a> replayCallable(mt.b0 b0Var, int i10) {
        return new z4(b0Var, i10);
    }

    public static <T> Callable<ju.a> replayCallable(mt.b0 b0Var, int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return new a5(b0Var, i10, j10, timeUnit, m0Var);
    }

    public static <T> Callable<ju.a> replayCallable(mt.b0 b0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return new m5(b0Var, j10, timeUnit, m0Var);
    }
}
