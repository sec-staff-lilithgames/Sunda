package r1;

import e1.v;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import y1.d;
import y1.e;
import y1.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b implements y1.b, d {

    /* renamed from: b, reason: collision with root package name */
    public final l f83668b;

    /* renamed from: c, reason: collision with root package name */
    public final l f83669c;

    /* renamed from: e, reason: collision with root package name */
    public final f f83670e;

    /* renamed from: f, reason: collision with root package name */
    public b f83671f;

    public b(l lVar, l lVar2, f key) {
        e0.checkNotNullParameter(key, "key");
        this.f83668b = lVar;
        this.f83669c = lVar2;
        this.f83670e = key;
    }

    public final boolean a(a aVar) {
        l lVar = this.f83668b;
        if (lVar != null && ((Boolean) lVar.invoke(aVar)).booleanValue()) {
            return true;
        }
        b bVar = this.f83671f;
        if (bVar != null) {
            return bVar.a(aVar);
        }
        return false;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(l lVar) {
        return super.any(lVar);
    }

    public final boolean b(a aVar) {
        b bVar = this.f83671f;
        if (bVar != null && bVar.b(aVar)) {
            return true;
        }
        l lVar = this.f83669c;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(aVar)).booleanValue();
        }
        return false;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.d
    public f getKey() {
        return this.f83670e;
    }

    public final l getOnEvent() {
        return this.f83668b;
    }

    public final l getOnPreEvent() {
        return this.f83669c;
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(e scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.f83671f = (b) scope.getCurrent(getKey());
    }

    public final boolean propagateFocusAwareEvent(a event) {
        e0.checkNotNullParameter(event, "event");
        return b(event) || a(event);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public b getValue() {
        return this;
    }
}
