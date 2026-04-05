package un;

import android.net.Uri;
import com.applovin.impl.ga;
import gn.p0;
import go.b0;
import io.bidmachine.media3.common.util.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import ln.m;
import mn.e;
import nh.b5;
import vn.f;
import vn.h;
import vn.i;
import vn.j;
import zn.p;
import zn.t;
import zn.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends u {
    public a(p0 p0Var, e.a aVar) {
        this(p0Var, aVar, new ga(2));
    }

    public static void h(f fVar, f.e eVar, HashSet hashSet, ArrayList arrayList) {
        String str = fVar.f89448a;
        long j10 = fVar.f89371h + eVar.f89421g;
        String str2 = eVar.f89423i;
        if (str2 != null) {
            Uri uriResolveToUri = x0.resolveToUri(str, str2);
            if (hashSet.add(uriResolveToUri)) {
                arrayList.add(new u.b(j10, u.c(uriResolveToUri)));
            }
        }
        arrayList.add(new u.b(j10, new m(x0.resolveToUri(str, eVar.f89417b), eVar.f89425k, eVar.f89426l)));
    }

    @Override // zn.u
    public final ArrayList d(e eVar, p pVar, boolean z10) throws IOException {
        i iVar = (i) pVar;
        ArrayList arrayList = new ArrayList();
        if (iVar instanceof h) {
            List list = ((h) iVar).f89429d;
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(u.c((Uri) list.get(i10)));
            }
        } else {
            arrayList.add(u.c(Uri.parse(iVar.f89448a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            arrayList2.add(new u.b(0L, mVar));
            try {
                f fVar = (f) ((p) b(new t(this, eVar, mVar), z10));
                b5 b5Var = fVar.f89381r;
                f.e eVar2 = null;
                for (int i11 = 0; i11 < b5Var.size(); i11++) {
                    f.e eVar3 = (f.e) b5Var.get(i11);
                    f.e eVar4 = eVar3.f89418c;
                    if (eVar4 != null && eVar4 != eVar2) {
                        h(fVar, eVar4, hashSet, arrayList2);
                        eVar2 = eVar4;
                    }
                    h(fVar, eVar3, hashSet, arrayList2);
                }
            } catch (IOException e10) {
                if (!z10) {
                    throw e10;
                }
            }
        }
        return arrayList2;
    }

    public a(p0 p0Var, e.a aVar, Executor executor) {
        this(p0Var, new j(), aVar, executor, 20000L);
    }

    @Deprecated
    public a(p0 p0Var, b0 b0Var, e.a aVar, Executor executor) {
        this(p0Var, b0Var, aVar, executor, 20000L);
    }

    public a(p0 p0Var, b0 b0Var, e.a aVar, Executor executor, long j10) {
        super(p0Var, b0Var, aVar, executor, j10);
    }
}
