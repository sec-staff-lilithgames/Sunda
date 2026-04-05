package x2;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public long f91495a;

    /* renamed from: b, reason: collision with root package name */
    public long f91496b;

    /* renamed from: c, reason: collision with root package name */
    public long f91497c;

    /* renamed from: d, reason: collision with root package name */
    public long f91498d;

    /* renamed from: e, reason: collision with root package name */
    public long f91499e;

    /* renamed from: f, reason: collision with root package name */
    public long f91500f;

    /* renamed from: g, reason: collision with root package name */
    public long f91501g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f91502h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public long f91503i;

    public void copy(g gVar) {
        gVar.getClass();
        this.f91495a = gVar.f91495a;
        this.f91503i = gVar.f91503i;
        this.f91496b = gVar.f91496b;
        this.f91500f = gVar.f91500f;
        this.f91501g = gVar.f91501g;
        this.f91497c = gVar.f91497c;
        this.f91498d = gVar.f91498d;
    }

    public void reset() {
        this.f91495a = 0L;
        this.f91503i = 0L;
        this.f91496b = 0L;
        this.f91500f = 0L;
        this.f91501g = 0L;
        this.f91497c = 0L;
        this.f91498d = 0L;
        this.f91499e = 0L;
        this.f91502h.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb2.append(this.f91495a);
        sb2.append("\nmeasuresWrap: 0\nmeasuresWrapInfeasible: 0\ndetermineGroups: 0\ninfeasibleDetermineGroups: 0\ngraphOptimizer: ");
        sb2.append(this.f91497c);
        sb2.append("\nwidgets: ");
        sb2.append(this.f91503i);
        sb2.append("\ngraphSolved: ");
        sb2.append(this.f91498d);
        sb2.append("\nlinearSolved: ");
        return a.b.g(this.f91499e, "\n", sb2);
    }
}
