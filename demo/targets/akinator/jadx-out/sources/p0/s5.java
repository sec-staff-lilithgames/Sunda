package p0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s5 implements d1.i, Iterable, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final s4 f80469b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80470c;

    /* renamed from: e, reason: collision with root package name */
    public final q1 f80471e;

    /* renamed from: f, reason: collision with root package name */
    public final r5 f80472f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f80473g;

    /* renamed from: h, reason: collision with root package name */
    public final s5 f80474h = this;

    public s5(s4 s4Var, int i10, q1 q1Var, r5 r5Var) {
        this.f80469b = s4Var;
        this.f80470c = i10;
        this.f80471e = q1Var;
        this.f80472f = r5Var;
        this.f80473g = Integer.valueOf(q1Var.getKey());
    }

    @Override // d1.i, d1.e
    public /* bridge */ /* synthetic */ d1.i find(Object obj) {
        return super.find(obj);
    }

    @Override // d1.i, d1.e
    public Iterable<d1.i> getCompositionGroups() {
        return this.f80474h;
    }

    @Override // d1.i
    public Iterable<Object> getData() {
        return new p5(this.f80469b, this.f80470c, this.f80471e);
    }

    @Override // d1.i
    public /* bridge */ /* synthetic */ int getGroupSize() {
        return super.getGroupSize();
    }

    @Override // d1.i
    public Object getIdentity() {
        return this.f80472f.getIdentity(this.f80469b);
    }

    public final r5 getIdentityPath() {
        return this.f80472f;
    }

    @Override // d1.i
    public Object getKey() {
        return this.f80473g;
    }

    @Override // d1.i
    public Object getNode() {
        return null;
    }

    public final int getParent() {
        return this.f80470c;
    }

    @Override // d1.i
    public /* bridge */ /* synthetic */ int getSlotsSize() {
        return super.getSlotsSize();
    }

    @Override // d1.i
    public String getSourceInfo() {
        return this.f80471e.getSourceInformation();
    }

    public final q1 getSourceInformation() {
        return this.f80471e;
    }

    public final s4 getTable() {
        return this.f80469b;
    }

    @Override // d1.i, d1.e
    public boolean isEmpty() {
        ArrayList<Object> groups = this.f80471e.getGroups();
        boolean z10 = false;
        if (groups != null && !groups.isEmpty()) {
            z10 = true;
        }
        return !z10;
    }

    @Override // java.lang.Iterable
    public Iterator<d1.i> iterator() {
        return new q5(this.f80469b, this.f80470c, this.f80471e, this.f80472f);
    }
}
