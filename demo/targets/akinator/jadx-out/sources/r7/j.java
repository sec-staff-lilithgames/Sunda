package r7;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f83947c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f83948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f83949f;

    public /* synthetic */ j(Context context, String str, String str2, int i10) {
        this.f83946b = i10;
        this.f83947c = context;
        this.f83948e = str;
        this.f83949f = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.f83946b) {
            case 0:
                return o.fromAssetSync(this.f83947c, this.f83948e, this.f83949f);
            default:
                Context context = this.f83947c;
                b8.h hVarNetworkFetcher = d.networkFetcher(context);
                String str = this.f83948e;
                String str2 = this.f83949f;
                i0 i0VarFetchSync = hVarNetworkFetcher.fetchSync(context, str, str2);
                if (str2 != null && i0VarFetchSync.getValue() != null) {
                    x7.h.getInstance().put(str2, (h) i0VarFetchSync.getValue());
                }
                return i0VarFetchSync;
        }
    }
}
