package dh;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f52324e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f52325f;

    /* renamed from: g, reason: collision with root package name */
    public final com.applovin.mediation.nativeAds.a f52326g;

    public y(q qVar, int i10) {
        super(qVar);
        this.f52324e = R.drawable.design_password_eye;
        this.f52326g = new com.applovin.mediation.nativeAds.a(this, 19);
        if (i10 != 0) {
            this.f52324e = i10;
        }
    }

    @Override // dh.r
    public final void a() {
        k();
    }

    @Override // dh.r
    public final int b() {
        return R.string.password_toggle_content_description;
    }

    @Override // dh.r
    public final int c() {
        return this.f52324e;
    }

    @Override // dh.r
    public final View.OnClickListener e() {
        return this.f52326g;
    }

    @Override // dh.r
    public final boolean h() {
        return true;
    }

    @Override // dh.r
    public final boolean i() {
        EditText editText = this.f52325f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // dh.r
    public final void l() {
        EditText editText = this.f52325f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f52325f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // dh.r
    public final void m() {
        EditText editText = this.f52325f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // dh.r
    public final void onEditTextAttached(EditText editText) {
        this.f52325f = editText;
        k();
    }
}
