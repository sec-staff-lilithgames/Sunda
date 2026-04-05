package xr;

import java.util.HashSet;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y7 extends kotlin.jvm.internal.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f93260d;

    public /* synthetic */ y7(int i10, Object obj, Object obj2) {
        this.f93258b = i10;
        this.f93260d = obj;
        this.f93259c = obj2;
    }

    @Override // kotlin.jvm.internal.d0
    public void w(i6 i6Var) {
        switch (this.f93258b) {
            case 1:
                ((t8) this.f93260d).f93021j.f93112h0.updateObjectInUse(i6Var, true);
                break;
        }
    }

    @Override // kotlin.jvm.internal.d0
    public void x(i6 i6Var) {
        switch (this.f93258b) {
            case 1:
                ((t8) this.f93260d).f93021j.f93112h0.updateObjectInUse(i6Var, false);
                break;
        }
    }

    @Override // kotlin.jvm.internal.d0
    public final void y(wr.g0 g0Var) {
        int i10 = this.f93258b;
        Object obj = this.f93259c;
        switch (i10) {
            case 0:
                u8 u8Var = ((d8) this.f93260d).f92426b;
                Logger logger = u8.f93089l0;
                if (g0Var.getState() == wr.f0.f90914e || g0Var.getState() == wr.f0.f90915f) {
                    u8Var.g();
                }
                ea eaVar = (ea) obj;
                a3 a3Var = eaVar.f92476f;
                eaVar.f92484n.b(new wr.a2().setDescription("Entering " + g0Var.getState() + " state").setSeverity(wr.b2.f90824b).setTimestampNanos(((bf) eaVar.f92485o).currentTimeNanos()).build());
                int iOrdinal = g0Var.getState().ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        a3Var.b(new aa(g0Var));
                        break;
                    } else if (iOrdinal != 3) {
                    }
                }
                a3Var.b(eaVar.f92473c);
                break;
            default:
                wr.f3 f3Var = (wr.f3) obj;
                mh.p1.checkState(f3Var != null, "listener is null");
                f3Var.onSubchannelState(g0Var);
                break;
        }
    }

    @Override // kotlin.jvm.internal.d0
    public final void z(i6 i6Var) {
        switch (this.f93258b) {
            case 0:
                u8 u8Var = ((d8) this.f93260d).f92426b;
                HashSet hashSet = u8Var.K;
                ea eaVar = (ea) this.f93259c;
                hashSet.remove(eaVar);
                u8Var.W.removeSubchannel(i6Var);
                eaVar.f92477g.removeSubchannel(eaVar);
                eaVar.f92478h.returnObject(eaVar.f92479i);
                eaVar.f92481k.countDown();
                u8.c(u8Var);
                break;
            default:
                u8 u8Var2 = ((t8) this.f93260d).f93021j;
                u8Var2.H.remove(i6Var);
                u8Var2.W.removeSubchannel(i6Var);
                u8.c(u8Var2);
                break;
        }
    }
}
