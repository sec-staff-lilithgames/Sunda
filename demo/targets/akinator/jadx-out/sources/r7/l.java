package r7;

import java.io.IOException;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f83961c;

    public /* synthetic */ l(ZipInputStream zipInputStream, int i10) {
        this.f83960b = i10;
        this.f83961c = zipInputStream;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f83960b) {
            case 0:
                e8.n.closeQuietly(this.f83961c);
                break;
            default:
                e8.n.closeQuietly(this.f83961c);
                break;
        }
    }
}
