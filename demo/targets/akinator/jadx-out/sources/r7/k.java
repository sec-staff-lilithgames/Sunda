package r7;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f83952c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f83953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f83954f;

    public /* synthetic */ k(Context context, ZipInputStream zipInputStream, String str, int i10) {
        this.f83951b = i10;
        this.f83952c = context;
        this.f83953e = zipInputStream;
        this.f83954f = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f83951b) {
            case 0:
                return o.fromZipStreamSync(this.f83952c, this.f83953e, this.f83954f);
            default:
                return o.fromZipStreamSync(this.f83952c, this.f83953e, this.f83954f);
        }
    }
}
