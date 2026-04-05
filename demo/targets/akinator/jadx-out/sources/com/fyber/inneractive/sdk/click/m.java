package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.f0;
import j1.o2;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f23190c;

    public m(r rVar, String str, String str2) {
        this.f23190c = rVar;
        this.f23188a = str;
        this.f23189b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f23190c.f23197e) {
            return;
        }
        if (exc != null) {
            r.a(this.f23190c, null, this.f23188a, this.f23189b, exc);
            return;
        }
        if (cVar != null) {
            String str = this.f23188a;
            if (cVar.f23166a.size() > 1) {
                str = (String) o2.e(1, cVar.f23166a);
            }
            b bVarA = this.f23190c.a(str);
            if ((bVarA == null || bVarA.f23160a == q.FAILED) && !TextUtils.isEmpty(cVar.f23167b)) {
                r rVar = this.f23190c;
                rVar.getClass();
                Iterator it = cVar.f23166a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!TextUtils.equals(str2, str)) {
                        rVar.f23198f.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                r.a(this.f23190c, cVar.f23167b, str, this.f23189b, null);
                return;
            }
            r rVar2 = this.f23190c;
            rVar2.getClass();
            Iterator it2 = cVar.f23166a.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!TextUtils.equals(str3, str)) {
                    rVar2.f23198f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.f23190c.f23198f.size() == 0) {
                this.f23190c.f23198f.add(new j(str, false, q.INTERNAL_REDIRECT, null));
            }
            this.f23190c.a(r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
