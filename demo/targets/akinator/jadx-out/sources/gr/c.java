package gr;

import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58402c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr.a f58403e;

    public /* synthetic */ c(int i10, pr.a aVar, int i11) {
        this.f58401b = i11;
        this.f58402c = i10;
        this.f58403e = aVar;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f58401b) {
            case 0:
                return String.format("Sending error event to server - %s, error - %s", Integer.valueOf(this.f58402c), this.f58403e);
            default:
                pr.a aVar = this.f58403e;
                int code = aVar.getCode();
                String message = aVar.getMessage();
                StringBuilder sbF = w0.i.f(this.f58402c, code, "Dispatching error event to server - (", QGjYBESwAiCc.kmzLdB, ") - ");
                sbF.append(message);
                return sbF.toString();
        }
    }
}
