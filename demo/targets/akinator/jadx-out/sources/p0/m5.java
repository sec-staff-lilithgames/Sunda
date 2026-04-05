package p0;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m5 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean access$intersects(z.v0 r13, java.util.Set r14) {
        /*
            java.lang.Object[] r0 = r13.f96888b
            long[] r13 = r13.f96887a
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L48
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L3d
            r13 = 1
            return r13
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto Lb
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.m5.access$intersects(z.v0, java.util.Set):boolean");
    }

    public static final <T> v5 collectAsState(StateFlow<? extends T> stateFlow, zu.m mVar, w wVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            mVar = zu.n.f98854b;
        }
        zu.m mVar2 = mVar;
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        v5 v5VarCollectAsState = z4.collectAsState(stateFlow, stateFlow.getValue(), mVar2, wVar, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return v5VarCollectAsState;
    }

    public static final <T> Flow<T> snapshotFlow(kv.a aVar) {
        return FlowKt.flow(new l5(aVar, null));
    }

    public static final <T extends R, R> v5 collectAsState(Flow<? extends T> flow, R r10, zu.m mVar, w wVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            mVar = zu.n.f98854b;
        }
        zu.m mVar2 = mVar;
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zChangedInstance = wVar.changedInstance(mVar2) | wVar.changedInstance(flow);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChangedInstance || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new k5(mVar2, flow, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        v5 v5VarProduceState = z4.produceState(r10, flow, mVar2, (kv.p) objRememberedValue, wVar, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 896));
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return v5VarProduceState;
    }
}
