package p0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o5 {
    public static final <T> T getValue(v5 v5Var, Object obj, KProperty<?> kProperty) {
        return (T) v5Var.getValue();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    public static final <K, V> b1.i0 mutableStateMapOf() {
        return new b1.i0();
    }

    public static final <T> j2 mutableStateOf(T t10, y4 y4Var) {
        return androidx.compose.runtime.b.createSnapshotMutableState(t10, y4Var);
    }

    public static /* synthetic */ j2 mutableStateOf$default(Object obj, y4 y4Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            y4Var = z4.structuralEqualityPolicy();
        }
        return z4.mutableStateOf(obj, y4Var);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return new SnapshotStateSet<>();
    }

    public static final <T> v5 rememberUpdatedState(T t10, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:335)");
        }
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        j2 j2Var = (j2) objRememberedValue;
        j2Var.setValue(t10);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return j2Var;
    }

    public static final <T> void setValue(j2 j2Var, Object obj, KProperty<?> kProperty, T t10) {
        j2Var.setValue(t10);
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final <K, V> b1.i0 toMutableStateMap(Iterable<? extends tu.v> iterable) {
        b1.i0 i0Var = new b1.i0();
        i0Var.putAll(uu.p1.toMap(iterable));
        return i0Var;
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(uu.k0.toList(tArr));
        return snapshotStateList;
    }

    public static final <K, V> b1.i0 mutableStateMapOf(tu.v... vVarArr) {
        b1.i0 i0Var = new b1.i0();
        i0Var.putAll(uu.p1.toMap(vVarArr));
        return i0Var;
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        SnapshotStateSet<T> snapshotStateSet = new SnapshotStateSet<>();
        snapshotStateSet.addAll(uu.k0.toSet(tArr));
        return snapshotStateSet;
    }
}
