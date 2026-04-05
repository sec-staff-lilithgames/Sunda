package ih;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f59587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashSet f59588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f59589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f59590d;

    public i(o oVar, c cVar, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.f59590d = oVar;
        this.f59587a = cVar;
        this.f59588b = hashSet;
        this.f59589c = atomicBoolean;
    }

    @Override // ih.l
    public final void zza(ZipFile zipFile, Set set) throws IOException {
        this.f59590d.c(this.f59587a, set, new h(this));
    }
}
