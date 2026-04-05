package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k6 {
    public static <T, U> st.o flatMapIntoIterable(st.o oVar) {
        return new w5(oVar);
    }

    public static <T, U, R> st.o flatMapWithCombiner(st.o oVar, st.c cVar) {
        return new y5(oVar, cVar);
    }

    public static <T, U> st.o itemDelay(st.o oVar) {
        return new z5(oVar);
    }

    public static <T> Callable<rt.a> replayCallable(mt.l lVar) {
        return new a6(lVar);
    }

    public static <T, R> st.o replayFunction(st.o oVar, mt.m0 m0Var) {
        return new b6(oVar, m0Var);
    }

    public static <T, S> st.c simpleBiGenerator(st.b bVar) {
        return new d6(bVar);
    }

    public static <T, S> st.c simpleGenerator(st.g gVar) {
        return new e6(gVar);
    }

    public static <T> st.a subscriberOnComplete(tw.c cVar) {
        return new f6(cVar);
    }

    public static <T> st.g subscriberOnError(tw.c cVar) {
        return new g6(cVar);
    }

    public static <T> st.g subscriberOnNext(tw.c cVar) {
        return new h6(cVar);
    }

    public static <T, R> st.o zipIterable(st.o oVar) {
        return new j6(oVar);
    }

    public static <T> Callable<rt.a> replayCallable(mt.l lVar, int i10) {
        return new u5(lVar, i10);
    }

    public static <T> Callable<rt.a> replayCallable(mt.l lVar, int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return new v5(lVar, i10, j10, timeUnit, m0Var);
    }

    public static <T> Callable<rt.a> replayCallable(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return new i6(lVar, j10, timeUnit, m0Var);
    }
}
