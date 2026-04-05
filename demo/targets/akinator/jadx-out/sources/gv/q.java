package gv;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class q implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.p f58506c;

    public /* synthetic */ q(int i10, kv.p pVar) {
        this.f58505b = i10;
        this.f58506c = pVar;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) throws x {
        switch (this.f58505b) {
            case 0:
                File f10 = (File) obj;
                IOException e10 = (IOException) obj2;
                e0.checkNotNullParameter(f10, "f");
                e0.checkNotNullParameter(e10, "e");
                if (this.f58506c.invoke(f10, e10) != w.f58512b) {
                    return x0.f87415a;
                }
                throw new x(f10);
            default:
                Integer num = (Integer) obj;
                num.intValue();
                this.f58506c.invoke(num, obj2);
                return obj2;
        }
    }
}
