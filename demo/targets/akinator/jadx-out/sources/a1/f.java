package a1;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import p0.j4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements r, j4 {

    /* renamed from: b, reason: collision with root package name */
    public m f3397b;

    /* renamed from: c, reason: collision with root package name */
    public h f3398c;

    /* renamed from: e, reason: collision with root package name */
    public String f3399e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3400f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3401g;

    /* renamed from: h, reason: collision with root package name */
    public g f3402h;

    /* renamed from: i, reason: collision with root package name */
    public final e f3403i = new e(this, 0);

    public f(m mVar, h hVar, String str, Object obj, Object[] objArr) {
        this.f3397b = mVar;
        this.f3398c = hVar;
        this.f3399e = str;
        this.f3400f = obj;
        this.f3401g = objArr;
    }

    public final void a() {
        h hVar = this.f3398c;
        if (this.f3402h != null) {
            throw new IllegalArgumentException(("entry(" + this.f3402h + ") is not null").toString());
        }
        if (hVar != null) {
            e eVar = this.f3403i;
            d.access$requireCanBeSaved(hVar, eVar.invoke());
            this.f3402h = hVar.registerProvider(this.f3399e, eVar);
        }
    }

    @Override // a1.r
    public boolean canBeSaved(Object obj) {
        h hVar = this.f3398c;
        return hVar == null || hVar.canBeSaved(obj);
    }

    public final Object getValueIfInputsDidntChange(Object[] objArr) {
        if (Arrays.equals(objArr, this.f3401g)) {
            return this.f3400f;
        }
        return null;
    }

    @Override // p0.j4
    public void onAbandoned() {
        g gVar = this.f3402h;
        if (gVar != null) {
            ((i) gVar).unregister();
        }
    }

    @Override // p0.j4
    public void onForgotten() {
        g gVar = this.f3402h;
        if (gVar != null) {
            ((i) gVar).unregister();
        }
    }

    @Override // p0.j4
    public void onRemembered() {
        a();
    }

    public final void update(m mVar, h hVar, String str, Object obj, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f3398c != hVar) {
            this.f3398c = hVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (e0.areEqual(this.f3399e, str)) {
            z11 = z10;
        } else {
            this.f3399e = str;
        }
        this.f3397b = mVar;
        this.f3400f = obj;
        this.f3401g = objArr;
        g gVar = this.f3402h;
        if (gVar == null || !z11) {
            return;
        }
        if (gVar != null) {
            ((i) gVar).unregister();
        }
        this.f3402h = null;
        a();
    }
}
