package p0;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g5 {
    public static final <T> v5 produceState(T t10, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(t10, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        j2 j2Var = (j2) objRememberedValue;
        boolean zChangedInstance = wVar.changedInstance(pVar);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new b5(pVar, j2Var, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        k1.LaunchedEffect(tu.x0.f87415a, (kv.p) objRememberedValue2, wVar, 6);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return j2Var;
    }

    public static final <T> v5 produceState(T t10, Object obj, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1928268701, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:107)");
        }
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(t10, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        j2 j2Var = (j2) objRememberedValue;
        boolean zChangedInstance = wVar.changedInstance(pVar);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new c5(pVar, j2Var, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        k1.LaunchedEffect(obj, (kv.p) objRememberedValue2, wVar, (i10 >> 3) & 14);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return j2Var;
    }

    public static final <T> v5 produceState(T t10, Object obj, Object obj2, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(t10, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        j2 j2Var = (j2) objRememberedValue;
        boolean zChangedInstance = wVar.changedInstance(pVar);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new d5(pVar, j2Var, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        k1.LaunchedEffect(obj, obj2, (kv.p) objRememberedValue2, wVar, (i10 >> 3) & 126);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return j2Var;
    }

    public static final <T> v5 produceState(T t10, Object obj, Object obj2, Object obj3, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(1807205155, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:170)");
        }
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(t10, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        j2 j2Var = (j2) objRememberedValue;
        boolean zChangedInstance = wVar.changedInstance(pVar);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new e5(pVar, j2Var, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        k1.LaunchedEffect(obj, obj2, obj3, (kv.p) objRememberedValue2, wVar, (i10 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return j2Var;
    }

    public static final <T> v5 produceState(T t10, Object[] objArr, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(490154582, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(t10, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        j2 j2Var = (j2) objRememberedValue;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zChangedInstance = wVar.changedInstance(pVar);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new f5(pVar, j2Var, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        k1.LaunchedEffect(objArrCopyOf, (kv.p) objRememberedValue2, wVar, 0);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return j2Var;
    }
}
