package t7;

import java.util.ArrayList;
import java.util.List;
import z7.y;
import z7.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class v implements d, u7.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86550a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86551b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f86552c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final y f86553d;

    /* renamed from: e, reason: collision with root package name */
    public final u7.j f86554e;

    /* renamed from: f, reason: collision with root package name */
    public final u7.j f86555f;

    /* renamed from: g, reason: collision with root package name */
    public final u7.j f86556g;

    public v(a8.a aVar, z zVar) {
        this.f86550a = zVar.getName();
        this.f86551b = zVar.isHidden();
        this.f86553d = zVar.getType();
        u7.j jVarCreateAnimation = zVar.getStart().createAnimation();
        this.f86554e = jVarCreateAnimation;
        u7.j jVarCreateAnimation2 = zVar.getEnd().createAnimation();
        this.f86555f = jVarCreateAnimation2;
        u7.j jVarCreateAnimation3 = zVar.getOffset().createAnimation();
        this.f86556g = jVarCreateAnimation3;
        aVar.addAnimation(jVarCreateAnimation);
        aVar.addAnimation(jVarCreateAnimation2);
        aVar.addAnimation(jVarCreateAnimation3);
        jVarCreateAnimation.addUpdateListener(this);
        jVarCreateAnimation2.addUpdateListener(this);
        jVarCreateAnimation3.addUpdateListener(this);
    }

    public final void a(u7.a aVar) {
        this.f86552c.add(aVar);
    }

    public u7.f getEnd() {
        return this.f86555f;
    }

    @Override // t7.d
    public String getName() {
        return this.f86550a;
    }

    public u7.f getOffset() {
        return this.f86556g;
    }

    public u7.f getStart() {
        return this.f86554e;
    }

    public boolean isHidden() {
        return this.f86551b;
    }

    @Override // u7.a
    public void onValueChanged() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f86552c;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((u7.a) arrayList.get(i10)).onValueChanged();
            i10++;
        }
    }

    @Override // t7.d
    public void setContents(List<d> list, List<d> list2) {
    }
}
