package g;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.b3;
import f.i0;
import kv.l;
import p0.d0;
import p0.g1;
import p0.k1;
import p0.o4;
import p0.v;
import p0.v5;
import p0.w;
import p0.z4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f56324a;

        public a(b bVar) {
            this.f56324a = bVar;
        }

        @Override // p0.g1
        public void dispose() {
            this.f56324a.remove();
        }
    }

    public static final void BackHandler(final boolean z10, kv.a aVar, w wVar, int i10, int i11) {
        int i12;
        w wVarStartRestartGroup = wVar.startRestartGroup(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-361453782, i12, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(aVar, wVarStartRestartGroup, (i12 >> 3) & 14);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            v vVar = v.f80515a;
            if (objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = new b(z10, v5VarRememberUpdatedState);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final b bVar = (b) objRememberedValue;
            boolean zChangedInstance = wVarStartRestartGroup.changedInstance(bVar) | ((i12 & 14) == 4);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new kv.a() { // from class: g.a
                    @Override // kv.a
                    public final Object invoke() {
                        bVar.setEnabled(z10);
                        return x0.f87415a;
                    }
                };
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            k1.SideEffect((kv.a) objRememberedValue2, wVarStartRestartGroup, 0);
            i0 current = e.f56326a.getCurrent(wVarStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            f.d0 onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            b1 b1Var = (b1) wVarStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zChangedInstance2 = wVarStartRestartGroup.changedInstance(onBackPressedDispatcher) | wVarStartRestartGroup.changedInstance(b1Var) | wVarStartRestartGroup.changedInstance(bVar);
            Object objRememberedValue3 = wVarStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == vVar.getEmpty()) {
                objRememberedValue3 = new b3(onBackPressedDispatcher, 1, b1Var, bVar);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            k1.DisposableEffect(b1Var, onBackPressedDispatcher, (l) objRememberedValue3, wVarStartRestartGroup, 0);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }
        boolean z11 = z10;
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c(z11, aVar, i10, i11, 1));
        }
    }

    public static final kv.a access$BackHandler$lambda$0(v5 v5Var) {
        return (kv.a) v5Var.getValue();
    }
}
