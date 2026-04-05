package g2;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f56773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.q f56774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f56775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Map f56776h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.internal.b1 b1Var, kv.q qVar, b bVar, Map map) {
        super(1);
        this.f56773e = b1Var;
        this.f56774f = qVar;
        this.f56775g = bVar;
        this.f56776h = map;
    }

    @Override // kv.l
    public final Integer invoke(List<Integer> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<name for destructuring parameter 0>");
        int iIntValue = list.get(0).intValue();
        int iIntValue2 = list.get(1).intValue();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.b1 b1Var = this.f56773e;
        sb2.append((String) b1Var.f71816b);
        sb2.append((String) this.f56774f.invoke(this.f56775g.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
        b1Var.f71816b = sb2.toString();
        return (Integer) this.f56776h.put(Integer.valueOf(iIntValue2), Integer.valueOf(((String) b1Var.f71816b).length()));
    }
}
