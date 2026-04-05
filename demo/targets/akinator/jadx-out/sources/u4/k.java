package u4;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import s4.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: a, reason: collision with root package name */
    public final i f87847a;

    public k(TextView textView) {
        this.f87847a = new i(textView);
    }

    @Override // u4.j
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !s.isConfigured() ? inputFilterArr : this.f87847a.a(inputFilterArr);
    }

    @Override // u4.j
    public final void b(boolean z10) {
        if (s.isConfigured()) {
            this.f87847a.b(z10);
        }
    }

    @Override // u4.j
    public final void c(boolean z10) {
        boolean zIsConfigured = s.isConfigured();
        i iVar = this.f87847a;
        if (zIsConfigured) {
            iVar.c(z10);
        } else {
            iVar.f87846c = z10;
        }
    }

    @Override // u4.j
    public final void d() {
        if (s.isConfigured()) {
            this.f87847a.d();
        }
    }

    @Override // u4.j
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        return !s.isConfigured() ? transformationMethod : this.f87847a.e(transformationMethod);
    }

    @Override // u4.j
    public boolean isEnabled() {
        return this.f87847a.isEnabled();
    }
}
