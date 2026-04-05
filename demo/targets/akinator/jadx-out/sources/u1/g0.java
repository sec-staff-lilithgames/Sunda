package u1;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1.b0 f87570a;

    /* renamed from: b, reason: collision with root package name */
    public final f f87571b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f87572c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.s f87573d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87574e;

    public g0(z1.b0 root) {
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
        this.f87570a = root;
        this.f87571b = new f(root.getCoordinates());
        this.f87572c = new d0();
        this.f87573d = new z1.s();
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m7316processBIzXfog$default(g0 g0Var, e0 e0Var, a1 a1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return g0Var.m7317processBIzXfog(e0Var, a1Var, z10);
    }

    public final z1.b0 getRoot() {
        return this.f87570a;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m7317processBIzXfog(e0 pointerEvent, a1 positionCalculator, boolean z10) {
        boolean z11;
        f fVar;
        z1.s sVar = this.f87573d;
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(positionCalculator, "positionCalculator");
        if (this.f87574e) {
            return h0.ProcessResult(false, false);
        }
        boolean z12 = true;
        try {
            this.f87574e = true;
            g gVarProduce = this.f87572c.produce(pointerEvent, positionCalculator);
            Collection<c0> collectionValues = gVarProduce.getChanges().values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                z11 = false;
            } else {
                for (c0 c0Var : collectionValues) {
                    if (c0Var.getPressed() || c0Var.getPreviousPressed()) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
            }
            Iterator<T> it = gVarProduce.getChanges().values().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                fVar = this.f87571b;
                if (!zHasNext) {
                    break;
                }
                c0 c0Var2 = (c0) it.next();
                if (!z11 || n.changedToDownIgnoreConsumed(c0Var2)) {
                    z1.b0.m8018hitTestM_7yMNQ$ui_release$default(this.f87570a, c0Var2.m7295getPositionF1C5BW0(), this.f87573d, z0.m7397equalsimpl0(c0Var2.m7298getTypeT8wyACA(), z0.f87698b.m7393getTouchT8wyACA()), false, 8, null);
                    if (!sVar.isEmpty()) {
                        fVar.m7302addHitPathKNwqfcY(c0Var2.m7294getIdJ3iCeTQ(), sVar);
                        sVar.clear();
                    }
                }
            }
            fVar.removeDetachedPointerInputFilters();
            boolean zDispatchChanges = fVar.dispatchChanges(gVarProduce, z10);
            if (gVarProduce.getSuppressMovementConsumption()) {
                z12 = false;
            } else {
                Collection<c0> collectionValues2 = gVarProduce.getChanges().values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    for (c0 c0Var3 : collectionValues2) {
                        if (n.positionChangedIgnoreConsumed(c0Var3) && c0Var3.isConsumed()) {
                            break;
                        }
                    }
                }
                z12 = false;
            }
            int iProcessResult = h0.ProcessResult(zDispatchChanges, z12);
            this.f87574e = false;
            return iProcessResult;
        } catch (Throwable th2) {
            this.f87574e = false;
            throw th2;
        }
    }

    public final void processCancel() {
        this.f87572c.clear();
        this.f87571b.processCancel();
    }
}
