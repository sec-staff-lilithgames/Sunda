package wr;

import wr.k5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v0 extends n1 {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f91162b;

    public v0(k5.a aVar, u0 u0Var) {
        super(aVar);
        this.f91162b = u0Var;
    }

    @Override // wr.n1, wr.o1, wr.a5, wr.k5.a
    public void onCancel() {
        u0 u0Var = this.f91162b;
        u0 u0VarAttach = u0Var.attach();
        try {
            super.onCancel();
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }

    @Override // wr.n1, wr.o1, wr.a5, wr.k5.a
    public void onComplete() {
        u0 u0Var = this.f91162b;
        u0 u0VarAttach = u0Var.attach();
        try {
            super.onComplete();
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }

    @Override // wr.n1, wr.o1, wr.a5, wr.k5.a
    public void onHalfClose() {
        u0 u0Var = this.f91162b;
        u0 u0VarAttach = u0Var.attach();
        try {
            super.onHalfClose();
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }

    @Override // wr.o1, wr.k5.a
    public void onMessage(Object obj) {
        u0 u0Var = this.f91162b;
        u0 u0VarAttach = u0Var.attach();
        try {
            super.onMessage(obj);
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }

    @Override // wr.n1, wr.o1, wr.a5, wr.k5.a
    public void onReady() {
        u0 u0Var = this.f91162b;
        u0 u0VarAttach = u0Var.attach();
        try {
            super.onReady();
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }
}
