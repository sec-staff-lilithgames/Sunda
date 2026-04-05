package tl;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: b, reason: collision with root package name */
    public final String f86969b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.a f86970c;

    public a(String str, ll.a aVar) {
        this.f86969b = str;
        this.f86970c = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f86970c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f86970c.onSuccess(this.f86969b, queryInfo.getQuery(), queryInfo);
    }
}
