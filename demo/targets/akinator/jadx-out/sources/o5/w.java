package o5;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f77759a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f77760b;

    public w(y0 database) {
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
        this.f77759a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
        this.f77760b = setNewSetFromMap;
    }

    public final <T> androidx.lifecycle.l1 create(String[] tableNames, boolean z10, Callable<T> callableFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(callableFunction, "callableFunction");
        return new t0(this.f77759a, this, z10, tableNames, callableFunction);
    }

    public final Set<androidx.lifecycle.l1> getLiveDataSet$room_runtime_release() {
        return this.f77760b;
    }

    public final void onActive(androidx.lifecycle.l1 liveData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(liveData, "liveData");
        this.f77760b.add(liveData);
    }

    public final void onInactive(androidx.lifecycle.l1 liveData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(liveData, "liveData");
        this.f77760b.remove(liveData);
    }

    public final <T> androidx.lifecycle.l1 create(String[] tableNames, boolean z10, kv.l lambdaFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(lambdaFunction, "lambdaFunction");
        return new p1(this.f77759a, this, z10, tableNames, lambdaFunction);
    }
}
