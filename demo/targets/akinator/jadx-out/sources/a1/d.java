package a1;

import b1.d0;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import p0.j2;
import p0.k1;
import p0.v;
import p0.w;
import p0.z4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final void access$requireCanBeSaved(h hVar, Object obj) {
        String strGenerateCannotBeSavedErrorMessage;
        if (obj == null || hVar.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (d0Var.getPolicy() == z4.neverEqualPolicy() || d0Var.getPolicy() == z4.structuralEqualityPolicy() || d0Var.getPolicy() == z4.referentialEqualityPolicy()) {
                strGenerateCannotBeSavedErrorMessage = "MutableState containing " + d0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strGenerateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strGenerateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(strGenerateCannotBeSavedErrorMessage);
    }

    public static final String generateCannotBeSavedErrorMessage(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> m mutableStateSaver(m mVar) {
        e0.checkNotNull(mVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return q.Saver(new a(mVar, 0), new c(mVar));
    }

    @tu.f
    public static final <T> T rememberSaveable(Object[] objArr, m mVar, String str, kv.a aVar, w wVar, int i10, int i11) {
        Object[] objArr2;
        final T t10;
        Object objConsumeRestored;
        if ((i11 & 2) != 0) {
            mVar = q.autoSaver();
        }
        final m mVar2 = mVar;
        int i12 = i11 & 4;
        Object objInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long currentCompositeKeyHashCode = p0.p.getCurrentCompositeKeyHashCode(wVar, 0);
        if (str == null || str.length() == 0) {
            str = Long.toString(currentCompositeKeyHashCode, sv.e.checkRadix(36));
            e0.checkNotNullExpressionValue(str, "toString(...)");
        }
        final String str2 = str;
        e0.checkNotNull(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final h hVar = (h) wVar.consume(l.getLocalSaveableStateRegistry());
        Object objRememberedValue = wVar.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            if (hVar != null && (objConsumeRestored = hVar.consumeRestored(str2)) != null) {
                objInvoke = ((p) mVar2).restore(objConsumeRestored);
            }
            if (objInvoke == null) {
                objInvoke = aVar.invoke();
            }
            objArr2 = objArr;
            Object fVar = new f(mVar2, hVar, str2, objInvoke, objArr2);
            wVar.updateRememberedValue(fVar);
            objRememberedValue = fVar;
        } else {
            objArr2 = objArr;
        }
        final f fVar2 = (f) objRememberedValue;
        Object valueIfInputsDidntChange = fVar2.getValueIfInputsDidntChange(objArr2);
        if (valueIfInputsDidntChange == null) {
            valueIfInputsDidntChange = aVar.invoke();
        }
        boolean zChangedInstance = wVar.changedInstance(fVar2) | ((((i10 & 112) ^ 48) > 32 && wVar.changedInstance(mVar2)) || (i10 & 48) == 32) | wVar.changedInstance(hVar) | wVar.changed(str2) | wVar.changedInstance(valueIfInputsDidntChange) | wVar.changedInstance(objArr2);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == vVar.getEmpty()) {
            final Object[] objArr3 = objArr2;
            t10 = (T) valueIfInputsDidntChange;
            Object obj = new kv.a() { // from class: a1.b
                @Override // kv.a
                public final Object invoke() {
                    fVar2.update(mVar2, hVar, str2, t10, objArr3);
                    return x0.f87415a;
                }
            };
            wVar.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        } else {
            t10 = (T) valueIfInputsDidntChange;
        }
        k1.SideEffect((kv.a) objRememberedValue2, wVar, 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        return t10;
    }

    public static final <T> T rememberSaveable(Object[] objArr, kv.a aVar, w wVar, int i10) {
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(1564532345, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        T t10 = (T) rememberSaveable(Arrays.copyOf(objArr, objArr.length), q.autoSaver(), (String) null, aVar, wVar, ((i10 << 6) & 7168) | 384, 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        return t10;
    }

    public static final <T> T rememberSaveable(Object[] objArr, m mVar, kv.a aVar, w wVar, int i10) {
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(674689872, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        T t10 = (T) rememberSaveable(Arrays.copyOf(objArr, objArr.length), mVar, (String) null, aVar, wVar, (i10 & 112) | 384 | ((i10 << 3) & 7168), 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        return t10;
    }

    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> j2 m1rememberSaveable(Object[] objArr, m mVar, kv.a aVar, w wVar, int i10) {
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-746165481, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:208)");
        }
        j2 j2Var = (j2) rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(mVar), (String) null, aVar, wVar, ((i10 << 3) & 7168) | 384, 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        return j2Var;
    }

    @tu.f
    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> j2 m0rememberSaveable(Object[] objArr, m mVar, String str, kv.a aVar, w wVar, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:248)");
        }
        j2 j2Var = (j2) rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(mVar), str2, aVar, wVar, i10 & 8064, 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        return j2Var;
    }
}
