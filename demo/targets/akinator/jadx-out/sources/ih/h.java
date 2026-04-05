package ih;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f59586a;

    public h(i iVar) {
        this.f59586a = iVar;
    }

    @Override // ih.m
    public final void zza(n nVar, File file, boolean z10) throws IOException {
        i iVar = this.f59586a;
        iVar.f59588b.add(file);
        if (z10) {
            return;
        }
        iVar.f59589c.set(false);
    }
}
