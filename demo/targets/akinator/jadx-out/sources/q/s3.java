package q;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f82249b;

    public s3(Toolbar toolbar) {
        this.f82249b = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f82249b.collapseActionView();
    }
}
