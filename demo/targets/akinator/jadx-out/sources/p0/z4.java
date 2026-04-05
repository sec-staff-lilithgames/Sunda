package p0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public abstract class z4 {
    public static final <T extends R, R> v5 collectAsState(Flow<? extends T> flow, R r10, zu.m mVar, w wVar, int i10, int i11) {
        return m5.collectAsState(flow, r10, mVar, wVar, i10, i11);
    }

    public static final r0.c derivedStateObservers() {
        return a5.derivedStateObservers();
    }

    public static final <T> v5 derivedStateOf(kv.a aVar) {
        return a5.derivedStateOf(aVar);
    }

    public static final <T> T getValue(v5 v5Var, Object obj, KProperty<?> kProperty) {
        return (T) o5.getValue(v5Var, obj, kProperty);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return o5.mutableStateListOf();
    }

    public static final <K, V> b1.i0 mutableStateMapOf() {
        return o5.mutableStateMapOf();
    }

    public static final <T> j2 mutableStateOf(T t10, y4 y4Var) {
        return o5.mutableStateOf(t10, y4Var);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return o5.mutableStateSetOf();
    }

    public static final <T> y4 neverEqualPolicy() {
        return n5.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(e1 e1Var, kv.a aVar) {
        a5.observeDerivedStateRecalculations(e1Var, aVar);
    }

    public static final <T> v5 produceState(T t10, Object obj, Object obj2, Object obj3, kv.p pVar, w wVar, int i10) {
        return g5.produceState(t10, obj, obj2, obj3, pVar, wVar, i10);
    }

    public static final <T> y4 referentialEqualityPolicy() {
        return n5.referentialEqualityPolicy();
    }

    public static final <T> v5 rememberUpdatedState(T t10, w wVar, int i10) {
        return o5.rememberUpdatedState(t10, wVar, i10);
    }

    public static final <T> void setValue(j2 j2Var, Object obj, KProperty<?> kProperty, T t10) {
        o5.setValue(j2Var, obj, kProperty, t10);
    }

    public static final <T> Flow<T> snapshotFlow(kv.a aVar) {
        return m5.snapshotFlow(aVar);
    }

    public static final <T> y4 structuralEqualityPolicy() {
        return n5.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return o5.toMutableStateList(collection);
    }

    public static final <K, V> b1.i0 toMutableStateMap(Iterable<? extends tu.v> iterable) {
        return o5.toMutableStateMap(iterable);
    }

    public static final <T> v5 collectAsState(StateFlow<? extends T> stateFlow, zu.m mVar, w wVar, int i10, int i11) {
        return m5.collectAsState(stateFlow, mVar, wVar, i10, i11);
    }

    public static final <T> v5 derivedStateOf(y4 y4Var, kv.a aVar) {
        return a5.derivedStateOf(y4Var, aVar);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return o5.mutableStateListOf(tArr);
    }

    public static final <K, V> b1.i0 mutableStateMapOf(tu.v... vVarArr) {
        return o5.mutableStateMapOf(vVarArr);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        return o5.mutableStateSetOf(tArr);
    }

    public static final <T> v5 produceState(T t10, Object obj, Object obj2, kv.p pVar, w wVar, int i10) {
        return g5.produceState(t10, obj, obj2, pVar, wVar, i10);
    }

    public static final <T> v5 produceState(T t10, Object obj, kv.p pVar, w wVar, int i10) {
        return g5.produceState(t10, obj, pVar, wVar, i10);
    }

    public static final <T> v5 produceState(T t10, kv.p pVar, w wVar, int i10) {
        return g5.produceState(t10, pVar, wVar, i10);
    }

    public static final <T> v5 produceState(T t10, Object[] objArr, kv.p pVar, w wVar, int i10) {
        return g5.produceState((Object) t10, objArr, pVar, wVar, i10);
    }
}
