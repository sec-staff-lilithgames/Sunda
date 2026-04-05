package pl;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: b, reason: collision with root package name */
    public final String f81484b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.a f81485c;

    public a(String str, ll.a aVar) {
        this.f81484b = str;
        this.f81485c = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f81485c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f81485c.onSuccess(this.f81484b, queryInfo.getQuery(), queryInfo);
    }
}
