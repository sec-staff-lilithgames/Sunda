package zl;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends hr.o {

    /* renamed from: b, reason: collision with root package name */
    public final String f98263b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98264c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98265d;

    public n(hr.k kVar) {
        super(kVar);
        this.f98263b = kVar.getStringOrNull("ad_unit_id");
        this.f98264c = kVar.getStringOrNull("score");
        this.f98265d = kVar.getStringOrNull("price");
    }

    @Override // hr.o
    public boolean isValid(hr.c cVar) {
        if (TextUtils.isEmpty(this.f98263b)) {
            cVar.onAdLoadFailed(pr.a.notFound("ad_unit_id"));
            return false;
        }
        if (TextUtils.isEmpty(this.f98264c)) {
            cVar.onAdLoadFailed(pr.a.notFound("score"));
            return false;
        }
        if (!TextUtils.isEmpty(this.f98265d)) {
            return true;
        }
        cVar.onAdLoadFailed(pr.a.notFound("price"));
        return false;
    }
}
