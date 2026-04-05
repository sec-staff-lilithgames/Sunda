package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements rr.b, Executable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pr.a f60310c;

    public /* synthetic */ b(pr.a aVar, int i10) {
        this.f60309b = i10;
        this.f60310c = aVar;
    }

    @Override // io.bidmachine.Executable
    public void execute(Object obj) {
        switch (this.f60309b) {
            case 1:
                ((AdProcessCallback) obj).processLoadFail(this.f60310c);
                break;
            default:
                ((AdProcessCallback) obj).processShowFail(this.f60310c);
                break;
        }
    }

    @Override // rr.b
    public Object get() {
        switch (this.f60309b) {
            case 0:
                return AdRequest.lambda$processRequestFail$6(this.f60310c);
            case 1:
            case 3:
            default:
                return String.format("Dispatching tracking fail to server - %s", this.f60310c);
            case 2:
                return String.format("processShowFail - %s", this.f60310c);
            case 4:
                return String.format("processLoadFail - %s", this.f60310c);
        }
    }
}
