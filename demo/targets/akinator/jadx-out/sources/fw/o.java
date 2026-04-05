package fw;

import java.io.IOException;
import java.util.List;
import kotlinx.serialization.internal.EnumDescriptor;
import sv.x;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class o implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56186b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f56187c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f56189f;

    public /* synthetic */ o(int i10, String str, EnumDescriptor enumDescriptor) {
        this.f56187c = i10;
        this.f56188e = str;
        this.f56189f = enumDescriptor;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f56186b) {
            case 0:
                q qVar = (q) this.f56188e;
                int i10 = this.f56187c;
                if (qVar.f56205n.onRequest(i10, (List) this.f56189f)) {
                    try {
                        qVar.C.rstStream(i10, c.f56128j);
                        synchronized (qVar) {
                            qVar.E.remove(Integer.valueOf(i10));
                        }
                    } catch (IOException unused) {
                    }
                }
                return x0.f87415a;
            case 1:
                return EnumDescriptor.elementDescriptors_delegate$lambda$0(this.f56187c, (String) this.f56188e, (EnumDescriptor) this.f56189f);
            default:
                sv.x xVar = (sv.x) this.f56188e;
                CharSequence charSequence = (CharSequence) this.f56189f;
                int i11 = this.f56187c;
                x.a aVar = sv.x.f86205e;
                return xVar.find(charSequence, i11);
        }
    }

    public /* synthetic */ o(q qVar, int i10, List list) {
        this.f56188e = qVar;
        this.f56187c = i10;
        this.f56189f = list;
    }

    public /* synthetic */ o(sv.x xVar, CharSequence charSequence, int i10) {
        this.f56188e = xVar;
        this.f56189f = charSequence;
        this.f56187c = i10;
    }
}
