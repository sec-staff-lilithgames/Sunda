package o9;

import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l1 extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f78313b;

    public l1(m1 m1Var) {
        this.f78313b = m1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        m1 m1Var = this.f78313b;
        ta.i iVar = m1Var.f78334c;
        if (iVar != null) {
            iVar.incDelay();
            if (m1Var.getActivity() != null && m1Var.isAdded()) {
                final int i10 = 0;
                m1Var.getActivity().runOnUiThread(new Runnable(this) { // from class: o9.k1

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ l1 f78286c;

                    {
                        this.f78286c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                m1 m1Var2 = this.f78286c.f78313b;
                                m1Var2.c(m1Var2.f78334c);
                                break;
                            case 1:
                                m1 m1Var3 = this.f78286c.f78313b;
                                m1Var3.c(m1Var3.f78335e);
                                break;
                            default:
                                m1 m1Var4 = this.f78286c.f78313b;
                                m1Var4.c(m1Var4.f78336f);
                                break;
                        }
                    }
                });
            }
        }
        ta.i iVar2 = m1Var.f78335e;
        if (iVar2 != null) {
            iVar2.incDelay();
            if (m1Var.getActivity() != null && m1Var.isAdded()) {
                final int i11 = 1;
                m1Var.getActivity().runOnUiThread(new Runnable(this) { // from class: o9.k1

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ l1 f78286c;

                    {
                        this.f78286c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                m1 m1Var2 = this.f78286c.f78313b;
                                m1Var2.c(m1Var2.f78334c);
                                break;
                            case 1:
                                m1 m1Var3 = this.f78286c.f78313b;
                                m1Var3.c(m1Var3.f78335e);
                                break;
                            default:
                                m1 m1Var4 = this.f78286c.f78313b;
                                m1Var4.c(m1Var4.f78336f);
                                break;
                        }
                    }
                });
            }
        }
        ta.i iVar3 = m1Var.f78336f;
        if (iVar3 != null) {
            iVar3.incDelay();
            if (m1Var.getActivity() == null || !m1Var.isAdded()) {
                return;
            }
            final int i12 = 2;
            m1Var.getActivity().runOnUiThread(new Runnable(this) { // from class: o9.k1

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l1 f78286c;

                {
                    this.f78286c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            m1 m1Var2 = this.f78286c.f78313b;
                            m1Var2.c(m1Var2.f78334c);
                            break;
                        case 1:
                            m1 m1Var3 = this.f78286c.f78313b;
                            m1Var3.c(m1Var3.f78335e);
                            break;
                        default:
                            m1 m1Var4 = this.f78286c.f78313b;
                            m1Var4.c(m1Var4.f78336f);
                            break;
                    }
                }
            });
        }
    }
}
