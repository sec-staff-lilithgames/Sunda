package ih;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashSet f59591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f59592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f59593c;

    public j(o oVar, HashSet hashSet, c cVar) {
        this.f59593c = oVar;
        this.f59591a = hashSet;
        this.f59592b = cVar;
    }

    @Override // ih.l
    public final void zza(ZipFile zipFile, Set set) throws IOException {
        HashSet hashSet = new HashSet();
        c cVar = this.f59592b;
        this.f59593c.c(cVar, set, new k(hashSet, cVar, zipFile));
        this.f59591a.addAll(hashSet);
    }
}
