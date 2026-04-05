package io.odeeo.internal.b1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f63263a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f63264b;

    public g(f state, Object obj) {
        e0.checkNotNullParameter(state, "state");
        this.f63263a = state;
        this.f63264b = obj;
    }

    public static /* synthetic */ g copy$default(g gVar, f fVar, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            fVar = gVar.f63263a;
        }
        if ((i10 & 2) != 0) {
            obj = gVar.f63264b;
        }
        return gVar.copy(fVar, obj);
    }

    public final f component1() {
        return this.f63263a;
    }

    public final Object component2() {
        return this.f63264b;
    }

    public final g copy(f state, Object obj) {
        e0.checkNotNullParameter(state, "state");
        return new g(state, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f63263a == gVar.f63263a && e0.areEqual(this.f63264b, gVar.f63264b);
    }

    public final f getState() {
        return this.f63263a;
    }

    public final Object getStateData() {
        return this.f63264b;
    }

    public int hashCode() {
        int iHashCode = this.f63263a.hashCode() * 31;
        Object obj = this.f63264b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "PlayerStateData(state=" + this.f63263a + ", stateData=" + this.f63264b + ')';
    }

    public /* synthetic */ g(f fVar, Object obj, int i10, u uVar) {
        this(fVar, (i10 & 2) != 0 ? null : obj);
    }
}
