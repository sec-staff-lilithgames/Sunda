package androidx.appcompat.widget;

import androidx.appcompat.widget.AppCompatSpinner;
import p.e0;
import q.y1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends y1 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.b f5143l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f5144m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, AppCompatSpinner.b bVar) {
        super(appCompatSpinner2);
        this.f5144m = appCompatSpinner;
        this.f5143l = bVar;
    }

    @Override // q.y1
    public e0 getPopup() {
        return this.f5143l;
    }

    @Override // q.y1
    public boolean onForwardingStarted() {
        AppCompatSpinner appCompatSpinner = this.f5144m;
        if (appCompatSpinner.getInternalPopup().isShowing()) {
            return true;
        }
        appCompatSpinner.f5034h.show(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
