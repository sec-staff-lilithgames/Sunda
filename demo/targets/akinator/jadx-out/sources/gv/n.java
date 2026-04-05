package gv;

import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f58504c;

    public /* synthetic */ n(int i10, ArrayList arrayList) {
        this.f58503b = i10;
        this.f58504c = arrayList;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f58503b) {
            case 0:
                e0.checkNotNullParameter(it, "it");
                this.f58504c.add(it);
                break;
            default:
                e0.checkNotNullParameter(it, "it");
                this.f58504c.add(it);
                break;
        }
        return x0.f87415a;
    }
}
