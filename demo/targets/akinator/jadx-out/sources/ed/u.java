package ed;

import java.util.AbstractMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends AbstractMap.SimpleEntry {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f54129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, o oVar) {
        super(oVar.f54115b, oVar.a());
        this.f54129b = vVar;
    }

    @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
    public Object setValue(Object obj) {
        this.f54129b.put(getKey(), obj);
        return super.setValue(obj);
    }
}
