package vm;

import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f89317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.a f89318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VastView f89319c;

    public n(VastView vastView, boolean z10, qm.a aVar) {
        this.f89319c = vastView;
        this.f89317a = z10;
        this.f89318b = aVar;
    }

    @Override // io.bidmachine.iab.vast.z
    public void onError(io.bidmachine.iab.vast.t tVar, qm.b bVar) {
        VastView vastView = this.f89319c;
        vastView.l(vastView.f60454x, tVar, qm.b.placeholder(String.format("Error loading video after showing with %s - %s", this.f89318b, bVar)));
    }

    @Override // io.bidmachine.iab.vast.z
    public void onSuccess(io.bidmachine.iab.vast.t tVar, VastAd vastAd) {
        int i10 = VastView.f60422k0;
        this.f89319c.d(tVar, vastAd, this.f89317a);
    }
}
