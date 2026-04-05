package r6;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import tu.x0;
import uu.p0;
import xv.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.a f83812c;

    public /* synthetic */ e(int i10, kv.a aVar) {
        this.f83811b = i10;
        this.f83812c = aVar;
    }

    @Override // kv.a
    public final Object invoke() {
        int i10 = this.f83811b;
        kv.a aVar = this.f83812c;
        switch (i10) {
            case 0:
                aVar.invoke();
                return x0.f87415a;
            default:
                e0.a aVar2 = e0.f93614e;
                try {
                    return (List) aVar.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return p0.emptyList();
                }
        }
    }
}
