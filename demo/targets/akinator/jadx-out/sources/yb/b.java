package yb;

import com.ironsource.C3191e4;
import ub.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final w f94286b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f94287c;

    public b(String str) {
        this(w.compile(str), false);
    }

    @Override // yb.d
    public final boolean a() {
        return this.f94286b.matches();
    }

    @Override // yb.d
    public d includeElement(int i10) {
        w wVar = this.f94286b;
        boolean z10 = this.f94287c;
        w wVarMatchElement = (!z10 || wVar.mayMatchElement()) ? wVar.matchElement(i10) : wVar.tail();
        if (wVarMatchElement == null) {
            return null;
        }
        return wVarMatchElement.matches() ? d.f94292a : new b(wVarMatchElement, z10);
    }

    @Override // yb.d
    public d includeProperty(String str) {
        w wVarMatchProperty = this.f94286b.matchProperty(str);
        if (wVarMatchProperty == null) {
            return null;
        }
        return wVarMatchProperty.matches() ? d.f94292a : new b(wVarMatchProperty, this.f94287c);
    }

    @Override // yb.d
    public String toString() {
        return "[JsonPointerFilter at: " + this.f94286b + C3191e4.i.f36531e;
    }

    public b(w wVar) {
        this(wVar, false);
    }

    public b(w wVar, boolean z10) {
        this.f94286b = wVar;
        this.f94287c = z10;
    }

    @Override // yb.d
    public d filterStartArray() {
        return this;
    }

    @Override // yb.d
    public d filterStartObject() {
        return this;
    }
}
