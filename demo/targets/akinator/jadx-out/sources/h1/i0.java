package h1;

import h1.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f58559a = true;

    /* renamed from: b, reason: collision with root package name */
    public o0 f58560b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f58561c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f58562d;

    /* renamed from: e, reason: collision with root package name */
    public o0 f58563e;

    /* renamed from: f, reason: collision with root package name */
    public o0 f58564f;

    /* renamed from: g, reason: collision with root package name */
    public o0 f58565g;

    /* renamed from: h, reason: collision with root package name */
    public o0 f58566h;

    /* renamed from: i, reason: collision with root package name */
    public o0 f58567i;

    public i0() {
        o0.a aVar = o0.f58586b;
        this.f58560b = aVar.getDefault();
        this.f58561c = aVar.getDefault();
        this.f58562d = aVar.getDefault();
        this.f58563e = aVar.getDefault();
        this.f58564f = aVar.getDefault();
        this.f58565g = aVar.getDefault();
        this.f58566h = aVar.getDefault();
        this.f58567i = aVar.getDefault();
    }

    @Override // h1.h0
    public boolean getCanFocus() {
        return this.f58559a;
    }

    @Override // h1.h0
    public o0 getDown() {
        return this.f58563e;
    }

    @Override // h1.h0
    public o0 getEnd() {
        return this.f58567i;
    }

    @Override // h1.h0
    public o0 getLeft() {
        return this.f58564f;
    }

    @Override // h1.h0
    public o0 getNext() {
        return this.f58560b;
    }

    @Override // h1.h0
    public o0 getPrevious() {
        return this.f58561c;
    }

    @Override // h1.h0
    public o0 getRight() {
        return this.f58565g;
    }

    @Override // h1.h0
    public o0 getStart() {
        return this.f58566h;
    }

    @Override // h1.h0
    public o0 getUp() {
        return this.f58562d;
    }

    @Override // h1.h0
    public void setCanFocus(boolean z10) {
        this.f58559a = z10;
    }

    @Override // h1.h0
    public void setDown(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58563e = o0Var;
    }

    @Override // h1.h0
    public void setEnd(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58567i = o0Var;
    }

    @Override // h1.h0
    public void setLeft(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58564f = o0Var;
    }

    @Override // h1.h0
    public void setNext(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58560b = o0Var;
    }

    @Override // h1.h0
    public void setPrevious(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58561c = o0Var;
    }

    @Override // h1.h0
    public void setRight(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58565g = o0Var;
    }

    @Override // h1.h0
    public void setStart(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58566h = o0Var;
    }

    @Override // h1.h0
    public void setUp(o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f58562d = o0Var;
    }
}
